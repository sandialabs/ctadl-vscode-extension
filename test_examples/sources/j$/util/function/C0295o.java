package j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0295o implements InterfaceC0299q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleFunction f12254a;

    private /* synthetic */ C0295o(DoubleFunction doubleFunction) {
        this.f12254a = doubleFunction;
    }

    public static /* synthetic */ InterfaceC0299q a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C0297p ? ((C0297p) doubleFunction).f12255a : new C0295o(doubleFunction);
    }

    @Override // j$.util.function.InterfaceC0299q
    public final /* synthetic */ Object apply(double d5) {
        return this.f12254a.apply(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0295o) {
            obj = ((C0295o) obj).f12254a;
        }
        return this.f12254a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12254a.hashCode();
    }
}
