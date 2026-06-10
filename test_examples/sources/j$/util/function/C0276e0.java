package j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0276e0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278f0 f12240a;

    private /* synthetic */ C0276e0(InterfaceC0278f0 interfaceC0278f0) {
        this.f12240a = interfaceC0278f0;
    }

    public static /* synthetic */ LongConsumer a(InterfaceC0278f0 interfaceC0278f0) {
        if (interfaceC0278f0 == null) {
            return null;
        }
        return interfaceC0278f0 instanceof C0274d0 ? ((C0274d0) interfaceC0278f0).f12238a : new C0276e0(interfaceC0278f0);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j2) {
        this.f12240a.accept(j2);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.f12240a.j(C0274d0.a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0278f0 interfaceC0278f0 = this.f12240a;
        if (obj instanceof C0276e0) {
            obj = ((C0276e0) obj).f12240a;
        }
        return interfaceC0278f0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12240a.hashCode();
    }
}
