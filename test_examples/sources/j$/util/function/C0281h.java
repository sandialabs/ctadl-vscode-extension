package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0281h implements InterfaceC0285j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f12243a;

    private /* synthetic */ C0281h(DoubleBinaryOperator doubleBinaryOperator) {
        this.f12243a = doubleBinaryOperator;
    }

    public static /* synthetic */ InterfaceC0285j a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C0283i ? ((C0283i) doubleBinaryOperator).f12245a : new C0281h(doubleBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC0285j
    public final /* synthetic */ double applyAsDouble(double d5, double d10) {
        return this.f12243a.applyAsDouble(d5, d10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0281h) {
            obj = ((C0281h) obj).f12243a;
        }
        return this.f12243a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12243a.hashCode();
    }
}
