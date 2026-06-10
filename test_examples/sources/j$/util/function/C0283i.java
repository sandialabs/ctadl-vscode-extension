package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0283i implements DoubleBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0285j f12245a;

    private /* synthetic */ C0283i(InterfaceC0285j interfaceC0285j) {
        this.f12245a = interfaceC0285j;
    }

    public static /* synthetic */ DoubleBinaryOperator a(InterfaceC0285j interfaceC0285j) {
        if (interfaceC0285j == null) {
            return null;
        }
        return interfaceC0285j instanceof C0281h ? ((C0281h) interfaceC0285j).f12243a : new C0283i(interfaceC0285j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d5, double d10) {
        return this.f12245a.applyAsDouble(d5, d10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0285j interfaceC0285j = this.f12245a;
        if (obj instanceof C0283i) {
            obj = ((C0283i) obj).f12245a;
        }
        return interfaceC0285j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12245a.hashCode();
    }
}
