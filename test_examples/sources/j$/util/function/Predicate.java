package j$.util.function;

/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Predicate f12219a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f12219a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof H0 ? ((H0) predicate).f12205a : new VivifiedWrapper(predicate);
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate a(Predicate predicate) {
            return convert(this.f12219a.and(H0.a(predicate)));
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate b(Predicate predicate) {
            return convert(this.f12219a.or(H0.a(predicate)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12219a;
            }
            return this.f12219a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12219a.hashCode();
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate negate() {
            return convert(this.f12219a.negate());
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            return this.f12219a.test(obj);
        }
    }

    Predicate a(Predicate predicate);

    Predicate b(Predicate predicate);

    Predicate negate();

    boolean test(Object obj);
}
