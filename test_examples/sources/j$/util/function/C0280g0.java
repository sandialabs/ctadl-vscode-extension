package j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0280g0 implements InterfaceC0284i0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongFunction f12242a;

    private /* synthetic */ C0280g0(LongFunction longFunction) {
        this.f12242a = longFunction;
    }

    public static /* synthetic */ InterfaceC0284i0 a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C0282h0 ? ((C0282h0) longFunction).f12244a : new C0280g0(longFunction);
    }

    @Override // j$.util.function.InterfaceC0284i0
    public final /* synthetic */ Object apply(long j2) {
        return this.f12242a.apply(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0280g0) {
            obj = ((C0280g0) obj).f12242a;
        }
        return this.f12242a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12242a.hashCode();
    }
}
