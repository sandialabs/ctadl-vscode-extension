package j$.util.function;

import j$.util.function.BiFunction;
import j$.util.function.Function;

/* renamed from: j$.util.function.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0269b implements java.util.function.BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BiFunction f12232a;

    private /* synthetic */ C0269b(BiFunction biFunction) {
        this.f12232a = biFunction;
    }

    public static /* synthetic */ java.util.function.BiFunction a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f12192a : biFunction instanceof InterfaceC0277f ? C0275e.a((InterfaceC0277f) biFunction) : new C0269b(biFunction);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return a(this.f12232a.a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f12232a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.f12232a;
        if (obj instanceof C0269b) {
            obj = ((C0269b) obj).f12232a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12232a.hashCode();
    }
}
