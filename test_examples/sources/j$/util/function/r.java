package j$.util.function;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements InterfaceC0304t {

    /* renamed from: a */
    public final /* synthetic */ DoublePredicate f12258a;

    private /* synthetic */ r(DoublePredicate doublePredicate) {
        this.f12258a = doublePredicate;
    }

    public static /* synthetic */ InterfaceC0304t b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C0302s ? ((C0302s) doublePredicate).f12259a : new r(doublePredicate);
    }

    public final /* synthetic */ InterfaceC0304t a(InterfaceC0304t interfaceC0304t) {
        return b(this.f12258a.and(C0302s.a(interfaceC0304t)));
    }

    public final /* synthetic */ InterfaceC0304t c() {
        return b(this.f12258a.negate());
    }

    public final /* synthetic */ InterfaceC0304t d(InterfaceC0304t interfaceC0304t) {
        return b(this.f12258a.or(C0302s.a(interfaceC0304t)));
    }

    public final /* synthetic */ boolean e(double d5) {
        return this.f12258a.test(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof r) {
            obj = ((r) obj).f12258a;
        }
        return this.f12258a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12258a.hashCode();
    }
}
