package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0294n0 implements LongToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0296o0 f12253a;

    private /* synthetic */ C0294n0(InterfaceC0296o0 interfaceC0296o0) {
        this.f12253a = interfaceC0296o0;
    }

    public static /* synthetic */ LongToDoubleFunction a(InterfaceC0296o0 interfaceC0296o0) {
        if (interfaceC0296o0 == null) {
            return null;
        }
        return interfaceC0296o0 instanceof C0292m0 ? ((C0292m0) interfaceC0296o0).f12252a : new C0294n0(interfaceC0296o0);
    }

    @Override // java.util.function.LongToDoubleFunction
    public final /* synthetic */ double applyAsDouble(long j2) {
        return ((C0292m0) this.f12253a).a(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0296o0 interfaceC0296o0 = this.f12253a;
        if (obj instanceof C0294n0) {
            obj = ((C0294n0) obj).f12253a;
        }
        return interfaceC0296o0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12253a.hashCode();
    }
}
