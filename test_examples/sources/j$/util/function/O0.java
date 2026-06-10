package j$.util.function;

import java.util.function.ToIntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class O0 implements Q0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToIntFunction f12216a;

    private /* synthetic */ O0(ToIntFunction toIntFunction) {
        this.f12216a = toIntFunction;
    }

    public static /* synthetic */ Q0 a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof P0 ? ((P0) toIntFunction).f12218a : new O0(toIntFunction);
    }

    @Override // j$.util.function.Q0
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f12216a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof O0) {
            obj = ((O0) obj).f12216a;
        }
        return this.f12216a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12216a.hashCode();
    }
}
