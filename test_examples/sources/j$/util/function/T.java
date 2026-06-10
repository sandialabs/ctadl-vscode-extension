package j$.util.function;

import java.util.function.IntToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements V {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntToLongFunction f12223a;

    private /* synthetic */ T(IntToLongFunction intToLongFunction) {
        this.f12223a = intToLongFunction;
    }

    public static /* synthetic */ V a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof U ? ((U) intToLongFunction).f12224a : new T(intToLongFunction);
    }

    @Override // j$.util.function.V
    public final /* synthetic */ long applyAsLong(int i10) {
        return this.f12223a.applyAsLong(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof T) {
            obj = ((T) obj).f12223a;
        }
        return this.f12223a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12223a.hashCode();
    }
}
