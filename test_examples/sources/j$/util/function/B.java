package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements DoubleUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C f12190a;

    private /* synthetic */ B(C c) {
        this.f12190a = c;
    }

    public static /* synthetic */ DoubleUnaryOperator a(C c) {
        if (c == null) {
            return null;
        }
        return c instanceof A ? ((A) c).f12188a : new B(c);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.f12190a).a(A.d(doubleUnaryOperator)));
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ double applyAsDouble(double d5) {
        return ((A) this.f12190a).b(d5);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.f12190a).c(A.d(doubleUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C c = this.f12190a;
        if (obj instanceof B) {
            obj = ((B) obj).f12190a;
        }
        return c.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12190a.hashCode();
    }
}
