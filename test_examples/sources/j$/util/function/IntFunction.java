package j$.util.function;

/* loaded from: classes2.dex */
public interface IntFunction<R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntFunction {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.IntFunction f12208a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.f12208a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return intFunction instanceof L ? ((L) intFunction).f12211a : new VivifiedWrapper(intFunction);
        }

        @Override // j$.util.function.IntFunction
        public final /* synthetic */ Object apply(int i10) {
            return this.f12208a.apply(i10);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12208a;
            }
            return this.f12208a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12208a.hashCode();
        }
    }

    Object apply(int i10);
}
