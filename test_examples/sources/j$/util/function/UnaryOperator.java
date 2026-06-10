package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.UnaryOperator f12226a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f12226a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return unaryOperator instanceof U0 ? ((U0) unaryOperator).f12225a : new VivifiedWrapper(unaryOperator);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function a(Function function) {
            return Function.VivifiedWrapper.convert(this.f12226a.andThen(D.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f12226a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function b(Function function) {
            return Function.VivifiedWrapper.convert(this.f12226a.compose(D.a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12226a;
            }
            return this.f12226a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12226a.hashCode();
        }
    }
}
