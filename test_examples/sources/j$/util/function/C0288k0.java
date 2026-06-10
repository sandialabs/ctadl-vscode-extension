package j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.k0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0288k0 implements LongPredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0290l0 f12249a;

    private /* synthetic */ C0288k0(InterfaceC0290l0 interfaceC0290l0) {
        this.f12249a = interfaceC0290l0;
    }

    public static /* synthetic */ LongPredicate a(InterfaceC0290l0 interfaceC0290l0) {
        if (interfaceC0290l0 == null) {
            return null;
        }
        return interfaceC0290l0 instanceof C0286j0 ? ((C0286j0) interfaceC0290l0).f12246a : new C0288k0(interfaceC0290l0);
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return a(((C0286j0) this.f12249a).a(C0286j0.b(longPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0290l0 interfaceC0290l0 = this.f12249a;
        if (obj instanceof C0288k0) {
            obj = ((C0288k0) obj).f12249a;
        }
        return interfaceC0290l0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12249a.hashCode();
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate negate() {
        return a(((C0286j0) this.f12249a).c());
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return a(((C0286j0) this.f12249a).d(C0286j0.b(longPredicate)));
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ boolean test(long j2) {
        return ((C0286j0) this.f12249a).e(j2);
    }
}
