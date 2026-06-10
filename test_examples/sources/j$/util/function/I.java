package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f12206a;

    private /* synthetic */ I(IntConsumer intConsumer) {
        this.f12206a = intConsumer;
    }

    public static /* synthetic */ K a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof J ? ((J) intConsumer).f12209a : new I(intConsumer);
    }

    @Override // j$.util.function.K
    public final /* synthetic */ void accept(int i10) {
        this.f12206a.accept(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof I) {
            obj = ((I) obj).f12206a;
        }
        return this.f12206a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12206a.hashCode();
    }

    @Override // j$.util.function.K
    public final /* synthetic */ K o(K k3) {
        return a(this.f12206a.andThen(J.a(k3)));
    }
}
