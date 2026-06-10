package j$.util.function;

import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class P0 implements ToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q0 f12218a;

    private /* synthetic */ P0(Q0 q02) {
        this.f12218a = q02;
    }

    public static /* synthetic */ ToIntFunction a(Q0 q02) {
        if (q02 == null) {
            return null;
        }
        return q02 instanceof O0 ? ((O0) q02).f12216a : new P0(q02);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f12218a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Q0 q02 = this.f12218a;
        if (obj instanceof P0) {
            obj = ((P0) obj).f12218a;
        }
        return q02.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12218a.hashCode();
    }
}
