package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements java.util.function.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function f12195a;

    private /* synthetic */ D(Function function) {
        this.f12195a = function;
    }

    public static /* synthetic */ java.util.function.Function a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f12201a : function instanceof UnaryOperator ? U0.a((UnaryOperator) function) : new D(function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return a(this.f12195a.a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f12195a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return a(this.f12195a.b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.f12195a;
        if (obj instanceof D) {
            obj = ((D) obj).f12195a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12195a.hashCode();
    }
}
