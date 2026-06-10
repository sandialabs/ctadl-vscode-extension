package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0292m0 implements InterfaceC0296o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongToDoubleFunction f12252a;

    private /* synthetic */ C0292m0(LongToDoubleFunction longToDoubleFunction) {
        this.f12252a = longToDoubleFunction;
    }

    public static /* synthetic */ InterfaceC0296o0 b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C0294n0 ? ((C0294n0) longToDoubleFunction).f12253a : new C0292m0(longToDoubleFunction);
    }

    public final /* synthetic */ double a(long j2) {
        return this.f12252a.applyAsDouble(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0292m0) {
            obj = ((C0292m0) obj).f12252a;
        }
        return this.f12252a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12252a.hashCode();
    }
}
