package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f12188a;

    private /* synthetic */ A(DoubleUnaryOperator doubleUnaryOperator) {
        this.f12188a = doubleUnaryOperator;
    }

    public static /* synthetic */ C d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof B ? ((B) doubleUnaryOperator).f12190a : new A(doubleUnaryOperator);
    }

    public final /* synthetic */ C a(C c) {
        return d(this.f12188a.andThen(B.a(c)));
    }

    public final /* synthetic */ double b(double d5) {
        return this.f12188a.applyAsDouble(d5);
    }

    public final /* synthetic */ C c(C c) {
        return d(this.f12188a.compose(B.a(c)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof A) {
            obj = ((A) obj).f12188a;
        }
        return this.f12188a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12188a.hashCode();
    }
}
