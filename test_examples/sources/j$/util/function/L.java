package j$.util.function;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements java.util.function.IntFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntFunction f12211a;

    private /* synthetic */ L(IntFunction intFunction) {
        this.f12211a = intFunction;
    }

    public static /* synthetic */ java.util.function.IntFunction a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).f12208a : new L(intFunction);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i10) {
        return this.f12211a.apply(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntFunction intFunction = this.f12211a;
        if (obj instanceof L) {
            obj = ((L) obj).f12211a;
        }
        return intFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12211a.hashCode();
    }
}
