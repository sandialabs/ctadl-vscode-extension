package j$.util.function;

import j$.util.function.BiFunction;
import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0273d implements InterfaceC0277f {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f12237a;

    private /* synthetic */ C0273d(BinaryOperator binaryOperator) {
        this.f12237a = binaryOperator;
    }

    public static /* synthetic */ InterfaceC0277f b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C0275e ? ((C0275e) binaryOperator).f12239a : new C0273d(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction a(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f12237a.andThen(D.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f12237a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0273d) {
            obj = ((C0273d) obj).f12237a;
        }
        return this.f12237a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12237a.hashCode();
    }
}
