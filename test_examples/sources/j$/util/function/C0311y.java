package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0311y implements DoubleToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0312z f12269a;

    private /* synthetic */ C0311y(InterfaceC0312z interfaceC0312z) {
        this.f12269a = interfaceC0312z;
    }

    public static /* synthetic */ DoubleToLongFunction a(InterfaceC0312z interfaceC0312z) {
        if (interfaceC0312z == null) {
            return null;
        }
        return interfaceC0312z instanceof C0310x ? ((C0310x) interfaceC0312z).f12267a : new C0311y(interfaceC0312z);
    }

    @Override // java.util.function.DoubleToLongFunction
    public final /* synthetic */ long applyAsLong(double d5) {
        return this.f12269a.applyAsLong(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0312z interfaceC0312z = this.f12269a;
        if (obj instanceof C0311y) {
            obj = ((C0311y) obj).f12269a;
        }
        return interfaceC0312z.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12269a.hashCode();
    }
}
