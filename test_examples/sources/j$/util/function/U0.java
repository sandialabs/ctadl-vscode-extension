package j$.util.function;

import j$.util.function.Function;
import j$.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class U0 implements java.util.function.UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f12225a;

    private /* synthetic */ U0(UnaryOperator unaryOperator) {
        this.f12225a = unaryOperator;
    }

    public static /* synthetic */ java.util.function.UnaryOperator a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof UnaryOperator.VivifiedWrapper ? ((UnaryOperator.VivifiedWrapper) unaryOperator).f12226a : new U0(unaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return D.a(this.f12225a.a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f12225a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return D.a(this.f12225a.b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UnaryOperator unaryOperator = this.f12225a;
        if (obj instanceof U0) {
            obj = ((U0) obj).f12225a;
        }
        return unaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12225a.hashCode();
    }
}
