package j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0274d0 implements InterfaceC0278f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongConsumer f12238a;

    private /* synthetic */ C0274d0(LongConsumer longConsumer) {
        this.f12238a = longConsumer;
    }

    public static /* synthetic */ InterfaceC0278f0 a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C0276e0 ? ((C0276e0) longConsumer).f12240a : new C0274d0(longConsumer);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final /* synthetic */ void accept(long j2) {
        this.f12238a.accept(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0274d0) {
            obj = ((C0274d0) obj).f12238a;
        }
        return this.f12238a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12238a.hashCode();
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final /* synthetic */ InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        return a(this.f12238a.andThen(C0276e0.a(interfaceC0278f0)));
    }
}
