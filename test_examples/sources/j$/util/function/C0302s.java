package j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0302s implements DoublePredicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0304t f12259a;

    private /* synthetic */ C0302s(InterfaceC0304t interfaceC0304t) {
        this.f12259a = interfaceC0304t;
    }

    public static /* synthetic */ DoublePredicate a(InterfaceC0304t interfaceC0304t) {
        if (interfaceC0304t == null) {
            return null;
        }
        return interfaceC0304t instanceof r ? ((r) interfaceC0304t).f12258a : new C0302s(interfaceC0304t);
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return a(((r) this.f12259a).a(r.b(doublePredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0304t interfaceC0304t = this.f12259a;
        if (obj instanceof C0302s) {
            obj = ((C0302s) obj).f12259a;
        }
        return interfaceC0304t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12259a.hashCode();
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate negate() {
        return a(((r) this.f12259a).c());
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return a(((r) this.f12259a).d(r.b(doublePredicate)));
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d5) {
        return ((r) this.f12259a).e(d5);
    }
}
