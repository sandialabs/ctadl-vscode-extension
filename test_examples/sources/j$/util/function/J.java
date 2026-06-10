package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f12209a;

    private /* synthetic */ J(K k3) {
        this.f12209a = k3;
    }

    public static /* synthetic */ IntConsumer a(K k3) {
        if (k3 == null) {
            return null;
        }
        return k3 instanceof I ? ((I) k3).f12206a : new J(k3);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        this.f12209a.accept(i10);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.f12209a.o(I.a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        K k3 = this.f12209a;
        if (obj instanceof J) {
            obj = ((J) obj).f12209a;
        }
        return k3.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12209a.hashCode();
    }
}
