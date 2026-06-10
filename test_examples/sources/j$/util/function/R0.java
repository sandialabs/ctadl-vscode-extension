package j$.util.function;

import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class R0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToLongFunction f12221a;

    private /* synthetic */ R0(ToLongFunction toLongFunction) {
        this.f12221a = toLongFunction;
    }

    public static /* synthetic */ T0 a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof S0 ? ((S0) toLongFunction).f12222a : new R0(toLongFunction);
    }

    @Override // j$.util.function.T0
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f12221a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof R0) {
            obj = ((R0) obj).f12221a;
        }
        return this.f12221a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12221a.hashCode();
    }
}
