package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v extends u {

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap f11973h = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final G f11974e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f11975f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f11976g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(G g10) {
        super(r0, "ZoneText(" + g10 + ")");
        j$.time.temporal.p j2 = j$.time.temporal.n.j();
        this.f11975f = new HashMap();
        this.f11976g = new HashMap();
        if (g10 == null) {
            throw new NullPointerException("textStyle");
        }
        this.f11974e = g10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.time.format.u
    public final o a(x xVar) {
        o f10;
        G g10 = G.NARROW;
        G g11 = this.f11974e;
        if (g11 == g10) {
            return super.a(xVar);
        }
        Locale i10 = xVar.i();
        boolean k3 = xVar.k();
        HashSet a10 = j$.time.zone.f.a();
        int size = a10.size();
        HashMap hashMap = k3 ? this.f11975f : this.f11976g;
        Map.Entry entry = (Map.Entry) hashMap.get(i10);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (f10 = (o) ((SoftReference) entry.getValue()).get()) == null) {
            f10 = o.f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i10).getZoneStrings();
            int length = zoneStrings.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i11];
                String str = strArr[0];
                if (a10.contains(str)) {
                    f10.a(str, str);
                    String a11 = H.a(str, i10);
                    for (int i12 = g11 == G.FULL ? 1 : 2; i12 < strArr.length; i12 += 2) {
                        f10.a(strArr[i12], a11);
                    }
                }
                i11++;
            }
            hashMap.put(i10, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(f10)));
        }
        return f10;
    }

    @Override // j$.time.format.u, j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        String[] strArr;
        ZoneId zoneId = (ZoneId) zVar.f(j$.time.temporal.n.k());
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.l d5 = zVar.d();
            char c = d5.c(j$.time.temporal.a.INSTANT_SECONDS) ? zoneId.getRules().h(Instant.u(d5)) ? (char) 1 : (char) 0 : (char) 2;
            Locale c10 = zVar.c();
            G g10 = G.NARROW;
            Map map = null;
            String str = null;
            G g11 = this.f11974e;
            if (g11 != g10) {
                ConcurrentHashMap concurrentHashMap = f11973h;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(id);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(c10)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, c10), timeZone.getDisplayName(false, 0, c10), timeZone.getDisplayName(true, 1, c10), timeZone.getDisplayName(true, 0, c10), id, id};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(c10, strArr2);
                    concurrentHashMap.put(id, new SoftReference(map));
                    strArr = strArr2;
                }
                int e10 = g11.e();
                str = c != 0 ? c != 1 ? strArr[e10 + 5] : strArr[e10 + 3] : strArr[e10 + 1];
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
