package j$.util.function;

import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class M0 implements ToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N0 f12214a;

    private /* synthetic */ M0(N0 n02) {
        this.f12214a = n02;
    }

    public static /* synthetic */ ToDoubleFunction a(N0 n02) {
        if (n02 == null) {
            return null;
        }
        return n02 instanceof L0 ? ((L0) n02).f12212a : new M0(n02);
    }

    @Override // java.util.function.ToDoubleFunction
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f12214a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N0 n02 = this.f12214a;
        if (obj instanceof M0) {
            obj = ((M0) obj).f12214a;
        }
        return n02.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12214a.hashCode();
    }
}
