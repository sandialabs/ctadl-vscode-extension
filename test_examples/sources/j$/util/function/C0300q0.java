package j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0300q0 implements LongToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0301r0 f12257a;

    private /* synthetic */ C0300q0(InterfaceC0301r0 interfaceC0301r0) {
        this.f12257a = interfaceC0301r0;
    }

    public static /* synthetic */ LongToIntFunction a(InterfaceC0301r0 interfaceC0301r0) {
        if (interfaceC0301r0 == null) {
            return null;
        }
        return interfaceC0301r0 instanceof C0298p0 ? ((C0298p0) interfaceC0301r0).f12256a : new C0300q0(interfaceC0301r0);
    }

    @Override // java.util.function.LongToIntFunction
    public final /* synthetic */ int applyAsInt(long j2) {
        return ((C0298p0) this.f12257a).a(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0301r0 interfaceC0301r0 = this.f12257a;
        if (obj instanceof C0300q0) {
            obj = ((C0300q0) obj).f12257a;
        }
        return interfaceC0301r0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12257a.hashCode();
    }
}
