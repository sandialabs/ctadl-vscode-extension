package j$.util.function;

/* loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.BiConsumer f12191a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f12191a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C0267a ? ((C0267a) biConsumer).f12230a : new VivifiedWrapper(biConsumer);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f12191a.accept(obj, obj2);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ BiConsumer c(BiConsumer biConsumer) {
            return convert(this.f12191a.andThen(C0267a.a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12191a;
            }
            return this.f12191a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f12191a.hashCode();
        }
    }

    void accept(Object obj, Object obj2);

    BiConsumer c(BiConsumer biConsumer);
}
