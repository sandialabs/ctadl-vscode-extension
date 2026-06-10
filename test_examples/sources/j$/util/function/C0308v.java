package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0308v implements DoubleToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0309w f12265a;

    private /* synthetic */ C0308v(InterfaceC0309w interfaceC0309w) {
        this.f12265a = interfaceC0309w;
    }

    public static /* synthetic */ DoubleToIntFunction a(InterfaceC0309w interfaceC0309w) {
        if (interfaceC0309w == null) {
            return null;
        }
        return interfaceC0309w instanceof C0306u ? ((C0306u) interfaceC0309w).f12263a : new C0308v(interfaceC0309w);
    }

    @Override // java.util.function.DoubleToIntFunction
    public final /* synthetic */ int applyAsInt(double d5) {
        return ((C0306u) this.f12265a).a(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0309w interfaceC0309w = this.f12265a;
        if (obj instanceof C0308v) {
            obj = ((C0308v) obj).f12265a;
        }
        return interfaceC0309w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12265a.hashCode();
    }
}
