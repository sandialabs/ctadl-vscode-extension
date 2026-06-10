package j$.util.function;

import j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0267a implements java.util.function.BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f12230a;

    private /* synthetic */ C0267a(BiConsumer biConsumer) {
        this.f12230a = biConsumer;
    }

    public static /* synthetic */ java.util.function.BiConsumer a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f12191a : new C0267a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f12230a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return a(this.f12230a.c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.f12230a;
        if (obj instanceof C0267a) {
            obj = ((C0267a) obj).f12230a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12230a.hashCode();
    }
}
