package j$.util.function;

import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class S0 implements ToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T0 f12222a;

    private /* synthetic */ S0(T0 t02) {
        this.f12222a = t02;
    }

    public static /* synthetic */ ToLongFunction a(T0 t02) {
        if (t02 == null) {
            return null;
        }
        return t02 instanceof R0 ? ((R0) t02).f12221a : new S0(t02);
    }

    @Override // java.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f12222a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T0 t02 = this.f12222a;
        if (obj instanceof S0) {
            obj = ((S0) obj).f12222a;
        }
        return t02.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12222a.hashCode();
    }
}
