package j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0297p implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0299q f12255a;

    private /* synthetic */ C0297p(InterfaceC0299q interfaceC0299q) {
        this.f12255a = interfaceC0299q;
    }

    public static /* synthetic */ DoubleFunction a(InterfaceC0299q interfaceC0299q) {
        if (interfaceC0299q == null) {
            return null;
        }
        return interfaceC0299q instanceof C0295o ? ((C0295o) interfaceC0299q).f12254a : new C0297p(interfaceC0299q);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d5) {
        return this.f12255a.apply(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0299q interfaceC0299q = this.f12255a;
        if (obj instanceof C0297p) {
            obj = ((C0297p) obj).f12255a;
        }
        return interfaceC0299q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12255a.hashCode();
    }
}
