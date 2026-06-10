package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class X implements IntUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Y f12228a;

    private /* synthetic */ X(Y y10) {
        this.f12228a = y10;
    }

    public static /* synthetic */ IntUnaryOperator a(Y y10) {
        if (y10 == null) {
            return null;
        }
        return y10 instanceof W ? ((W) y10).f12227a : new X(y10);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return a(((W) this.f12228a).a(W.d(intUnaryOperator)));
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ int applyAsInt(int i10) {
        return ((W) this.f12228a).b(i10);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return a(((W) this.f12228a).c(W.d(intUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Y y10 = this.f12228a;
        if (obj instanceof X) {
            obj = ((X) obj).f12228a;
        }
        return y10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12228a.hashCode();
    }
}
