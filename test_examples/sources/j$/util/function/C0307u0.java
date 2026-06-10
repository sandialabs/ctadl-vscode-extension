package j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0307u0 implements LongUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f12264a;

    private /* synthetic */ C0307u0(v0 v0Var) {
        this.f12264a = v0Var;
    }

    public static /* synthetic */ LongUnaryOperator a(v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        return v0Var instanceof C0305t0 ? ((C0305t0) v0Var).f12262a : new C0307u0(v0Var);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return a(this.f12264a.b(C0305t0.c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j2) {
        return this.f12264a.applyAsLong(j2);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return a(this.f12264a.a(C0305t0.c(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        v0 v0Var = this.f12264a;
        if (obj instanceof C0307u0) {
            obj = ((C0307u0) obj).f12264a;
        }
        return v0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12264a.hashCode();
    }
}
