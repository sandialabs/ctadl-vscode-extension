package j$.util.function;

import j$.util.function.Function;
import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0275e implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0277f f12239a;

    private /* synthetic */ C0275e(InterfaceC0277f interfaceC0277f) {
        this.f12239a = interfaceC0277f;
    }

    public static /* synthetic */ BinaryOperator a(InterfaceC0277f interfaceC0277f) {
        if (interfaceC0277f == null) {
            return null;
        }
        return interfaceC0277f instanceof C0273d ? ((C0273d) interfaceC0277f).f12237a : new C0275e(interfaceC0277f);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return C0269b.a(this.f12239a.a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f12239a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0277f interfaceC0277f = this.f12239a;
        if (obj instanceof C0275e) {
            obj = ((C0275e) obj).f12239a;
        }
        return interfaceC0277f.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12239a.hashCode();
    }
}
