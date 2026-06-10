package j$.util.function;

/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.Consumer f12194a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f12194a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C0279g ? ((C0279g) consumer).f12241a : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f12194a.accept(obj);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ Consumer e(Consumer consumer) {
            return convert(this.f12194a.andThen(C0279g.a(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12194a;
            }
            return this.f12194a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12194a.hashCode();
        }
    }

    void accept(Object obj);

    Consumer e(Consumer consumer);
}
