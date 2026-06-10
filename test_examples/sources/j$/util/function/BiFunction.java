package j$.util.function;

import java.util.function.BinaryOperator;

/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.BiFunction f12192a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f12192a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C0269b ? ((C0269b) biFunction).f12232a : biFunction instanceof BinaryOperator ? C0273d.b((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ BiFunction a(Function function) {
            return convert(this.f12192a.andThen(D.a(function)));
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f12192a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12192a;
            }
            return this.f12192a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12192a.hashCode();
        }
    }

    BiFunction a(Function function);

    Object apply(Object obj, Object obj2);
}
