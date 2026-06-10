package j$.util.function;

import j$.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f12201a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f12201a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof D ? ((D) function).f12195a : function instanceof java.util.function.UnaryOperator ? UnaryOperator.VivifiedWrapper.convert((java.util.function.UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function a(Function function) {
            return convert(this.f12201a.andThen(D.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f12201a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function b(Function function) {
            return convert(this.f12201a.compose(D.a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12201a;
            }
            return this.f12201a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12201a.hashCode();
        }
    }

    Function a(Function function);

    Object apply(Object obj);

    Function b(Function function);
}
