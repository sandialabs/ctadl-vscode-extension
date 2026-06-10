package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class U implements IntToLongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V f12224a;

    private /* synthetic */ U(V v3) {
        this.f12224a = v3;
    }

    public static /* synthetic */ IntToLongFunction a(V v3) {
        if (v3 == null) {
            return null;
        }
        return v3 instanceof T ? ((T) v3).f12223a : new U(v3);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i10) {
        return this.f12224a.applyAsLong(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        V v3 = this.f12224a;
        if (obj instanceof U) {
            obj = ((U) obj).f12224a;
        }
        return v3.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12224a.hashCode();
    }
}
