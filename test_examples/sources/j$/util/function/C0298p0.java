package j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0298p0 implements InterfaceC0301r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongToIntFunction f12256a;

    private /* synthetic */ C0298p0(LongToIntFunction longToIntFunction) {
        this.f12256a = longToIntFunction;
    }

    public static /* synthetic */ InterfaceC0301r0 b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof C0300q0 ? ((C0300q0) longToIntFunction).f12257a : new C0298p0(longToIntFunction);
    }

    public final /* synthetic */ int a(long j2) {
        return this.f12256a.applyAsInt(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0298p0) {
            obj = ((C0298p0) obj).f12256a;
        }
        return this.f12256a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12256a.hashCode();
    }
}
