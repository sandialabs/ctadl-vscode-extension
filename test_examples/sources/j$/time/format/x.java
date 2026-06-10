package j$.time.format;

import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f11986a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11987b = true;
    private boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f11988d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f11989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f11988d = arrayList;
        this.f11989e = null;
        this.f11986a = dateTimeFormatter;
        arrayList.add(new D());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(char c, char c10) {
        if (c != c10 && Character.toUpperCase(c) != Character.toUpperCase(c10) && Character.toLowerCase(c) != Character.toLowerCase(c10)) {
            return false;
        }
        return true;
    }

    private D e() {
        ArrayList arrayList = this.f11988d;
        return (D) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p pVar) {
        if (this.f11989e == null) {
            this.f11989e = new ArrayList();
        }
        this.f11989e.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(char c, char c10) {
        return this.f11987b ? c == c10 : c(c, c10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x d() {
        x xVar = new x(this.f11986a);
        xVar.f11987b = this.f11987b;
        xVar.c = this.c;
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z10) {
        ArrayList arrayList = this.f11988d;
        arrayList.remove(z10 ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C g() {
        return this.f11986a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.d h() {
        j$.time.chrono.d dVar = e().c;
        if (dVar == null) {
            j$.time.chrono.d b5 = this.f11986a.b();
            return b5 == null ? j$.time.chrono.e.f11895a : b5;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale i() {
        return this.f11986a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long j(j$.time.temporal.a aVar) {
        return (Long) e().f11906a.get(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f11987b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z10) {
        this.f11987b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ZoneId zoneId) {
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        e().f11907b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(j$.time.temporal.o oVar, long j2, int i10, int i11) {
        if (oVar != null) {
            Long l2 = (Long) e().f11906a.put(oVar, Long.valueOf(j2));
            return (l2 == null || l2.longValue() == j2) ? i11 : ~i10;
        }
        throw new NullPointerException("field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        e().getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        ArrayList arrayList = this.f11988d;
        D e10 = e();
        e10.getClass();
        D d5 = new D();
        d5.f11906a.putAll(e10.f11906a);
        d5.f11907b = e10.f11907b;
        d5.c = e10.c;
        arrayList.add(d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (this.f11987b) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                        return false;
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                char charAt = charSequence.charAt(i10 + i14);
                char charAt2 = charSequence2.charAt(i11 + i14);
                if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.l t(E e10, Set set) {
        D e11 = e();
        e11.c = h();
        ZoneId zoneId = e11.f11907b;
        if (zoneId == null) {
            zoneId = this.f11986a.e();
        }
        e11.f11907b = zoneId;
        e11.t(e10, set);
        return e11;
    }

    public final String toString() {
        return e().toString();
    }
}
