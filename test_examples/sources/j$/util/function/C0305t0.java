package j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0305t0 implements v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongUnaryOperator f12262a;

    private /* synthetic */ C0305t0(LongUnaryOperator longUnaryOperator) {
        this.f12262a = longUnaryOperator;
    }

    public static /* synthetic */ v0 c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C0307u0 ? ((C0307u0) longUnaryOperator).f12264a : new C0305t0(longUnaryOperator);
    }

    @Override // j$.util.function.v0
    public final /* synthetic */ v0 a(v0 v0Var) {
        return c(this.f12262a.compose(C0307u0.a(v0Var)));
    }

    @Override // j$.util.function.v0
    public final /* synthetic */ long applyAsLong(long j2) {
        return this.f12262a.applyAsLong(j2);
    }

    @Override // j$.util.function.v0
    public final /* synthetic */ v0 b(v0 v0Var) {
        return c(this.f12262a.andThen(C0307u0.a(v0Var)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0305t0) {
            obj = ((C0305t0) obj).f12262a;
        }
        return this.f12262a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12262a.hashCode();
    }
}
