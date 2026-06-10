package j$.util.function;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z implements InterfaceC0270b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f12229a;

    private /* synthetic */ Z(LongBinaryOperator longBinaryOperator) {
        this.f12229a = longBinaryOperator;
    }

    public static /* synthetic */ InterfaceC0270b0 a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C0268a0 ? ((C0268a0) longBinaryOperator).f12231a : new Z(longBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC0270b0
    public final /* synthetic */ long applyAsLong(long j2, long j10) {
        return this.f12229a.applyAsLong(j2, j10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof Z) {
            obj = ((Z) obj).f12229a;
        }
        return this.f12229a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12229a.hashCode();
    }
}
