package j$.util.function;

import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class L0 implements N0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToDoubleFunction f12212a;

    private /* synthetic */ L0(ToDoubleFunction toDoubleFunction) {
        this.f12212a = toDoubleFunction;
    }

    public static /* synthetic */ N0 a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof M0 ? ((M0) toDoubleFunction).f12214a : new L0(toDoubleFunction);
    }

    @Override // j$.util.function.N0
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f12212a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof L0) {
            obj = ((L0) obj).f12212a;
        }
        return this.f12212a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12212a.hashCode();
    }
}
