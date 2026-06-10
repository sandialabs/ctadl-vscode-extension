package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f12197a;

    private /* synthetic */ E(IntBinaryOperator intBinaryOperator) {
        this.f12197a = intBinaryOperator;
    }

    public static /* synthetic */ G a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof F ? ((F) intBinaryOperator).f12198a : new E(intBinaryOperator);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ int applyAsInt(int i10, int i11) {
        return this.f12197a.applyAsInt(i10, i11);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof E) {
            obj = ((E) obj).f12197a;
        }
        return this.f12197a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12197a.hashCode();
    }
}
