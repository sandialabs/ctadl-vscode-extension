package j$.time.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.o f11965a;

    /* renamed from: b  reason: collision with root package name */
    private final G f11966b;
    private final B c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k f11967d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(j$.time.temporal.o oVar, G g10, B b5) {
        this.f11965a = oVar;
        this.f11966b = g10;
        this.c = b5;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // j$.time.format.InterfaceC0257g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(z zVar, StringBuilder sb) {
        String d5;
        j$.time.chrono.e eVar;
        Long e10 = zVar.e(this.f11965a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.d dVar = (j$.time.chrono.d) zVar.d().r(j$.time.temporal.n.d());
        if (dVar != null && dVar != (eVar = j$.time.chrono.e.f11895a)) {
            j$.time.temporal.o oVar = this.f11965a;
            long longValue = e10.longValue();
            G g10 = this.f11966b;
            Locale c = zVar.c();
            B b5 = this.c;
            b5.getClass();
            if (dVar != eVar && (oVar instanceof j$.time.temporal.a)) {
                d5 = null;
                if (d5 != null) {
                    sb.append(d5);
                    return true;
                }
                if (this.f11967d == null) {
                    this.f11967d = new k(this.f11965a, 1, 19, F.NORMAL);
                }
                return this.f11967d.e(zVar, sb);
            }
            d5 = b5.d(oVar, longValue, g10, c);
            if (d5 != null) {
            }
        }
        d5 = this.c.d(this.f11965a, e10.longValue(), this.f11966b, zVar.c());
        if (d5 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[LOOP:0: B:21:0x003e->B:24:0x005d, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    @Override // j$.time.format.InterfaceC0257g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(x xVar, CharSequence charSequence, int i10) {
        j$.time.chrono.d dVar;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it = null;
        G g10 = xVar.l() ? this.f11966b : null;
        j$.time.chrono.d h10 = xVar.h();
        j$.time.temporal.o oVar = this.f11965a;
        B b5 = this.c;
        if (h10 != null && h10 != (dVar = j$.time.chrono.e.f11895a)) {
            Locale i11 = xVar.i();
            b5.getClass();
            if (h10 == dVar || !(oVar instanceof j$.time.temporal.a)) {
                it = b5.e(oVar, g10, i11);
            }
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (xVar.s(str, 0, charSequence, i10, str.length())) {
                        return xVar.o(this.f11965a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (xVar.l()) {
                    return ~i10;
                }
            }
            if (this.f11967d == null) {
                this.f11967d = new k(this.f11965a, 1, 19, F.NORMAL);
            }
            return this.f11967d.f(xVar, charSequence, i10);
        }
        it = b5.e(oVar, g10, xVar.i());
        if (it != null) {
        }
        if (this.f11967d == null) {
        }
        return this.f11967d.f(xVar, charSequence, i10);
    }

    public final String toString() {
        G g10 = G.FULL;
        j$.time.temporal.o oVar = this.f11965a;
        G g11 = this.f11966b;
        if (g11 == g10) {
            return "Text(" + oVar + ")";
        }
        return "Text(" + oVar + "," + g11 + ")";
    }
}
