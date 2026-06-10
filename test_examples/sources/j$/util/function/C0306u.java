package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0306u implements InterfaceC0309w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleToIntFunction f12263a;

    private /* synthetic */ C0306u(DoubleToIntFunction doubleToIntFunction) {
        this.f12263a = doubleToIntFunction;
    }

    public static /* synthetic */ InterfaceC0309w b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C0308v ? ((C0308v) doubleToIntFunction).f12265a : new C0306u(doubleToIntFunction);
    }

    public final /* synthetic */ int a(double d5) {
        return this.f12263a.applyAsInt(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0306u) {
            obj = ((C0306u) obj).f12263a;
        }
        return this.f12263a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12263a.hashCode();
    }
}
