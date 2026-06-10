package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0310x implements InterfaceC0312z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleToLongFunction f12267a;

    private /* synthetic */ C0310x(DoubleToLongFunction doubleToLongFunction) {
        this.f12267a = doubleToLongFunction;
    }

    public static /* synthetic */ InterfaceC0312z a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C0311y ? ((C0311y) doubleToLongFunction).f12269a : new C0310x(doubleToLongFunction);
    }

    @Override // j$.util.function.InterfaceC0312z
    public final /* synthetic */ long applyAsLong(double d5) {
        return this.f12267a.applyAsLong(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0310x) {
            obj = ((C0310x) obj).f12267a;
        }
        return this.f12267a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12267a.hashCode();
    }
}
