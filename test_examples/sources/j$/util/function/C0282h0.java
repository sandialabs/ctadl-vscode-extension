package j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0282h0 implements LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0284i0 f12244a;

    private /* synthetic */ C0282h0(InterfaceC0284i0 interfaceC0284i0) {
        this.f12244a = interfaceC0284i0;
    }

    public static /* synthetic */ LongFunction a(InterfaceC0284i0 interfaceC0284i0) {
        if (interfaceC0284i0 == null) {
            return null;
        }
        return interfaceC0284i0 instanceof C0280g0 ? ((C0280g0) interfaceC0284i0).f12242a : new C0282h0(interfaceC0284i0);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j2) {
        return this.f12244a.apply(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0284i0 interfaceC0284i0 = this.f12244a;
        if (obj instanceof C0282h0) {
            obj = ((C0282h0) obj).f12244a;
        }
        return interfaceC0284i0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12244a.hashCode();
    }
}
