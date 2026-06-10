package j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0268a0 implements LongBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0270b0 f12231a;

    private /* synthetic */ C0268a0(InterfaceC0270b0 interfaceC0270b0) {
        this.f12231a = interfaceC0270b0;
    }

    public static /* synthetic */ LongBinaryOperator a(InterfaceC0270b0 interfaceC0270b0) {
        if (interfaceC0270b0 == null) {
            return null;
        }
        return interfaceC0270b0 instanceof Z ? ((Z) interfaceC0270b0).f12229a : new C0268a0(interfaceC0270b0);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j2, long j10) {
        return this.f12231a.applyAsLong(j2, j10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0270b0 interfaceC0270b0 = this.f12231a;
        if (obj instanceof C0268a0) {
            obj = ((C0268a0) obj).f12231a;
        }
        return interfaceC0270b0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12231a.hashCode();
    }
}
