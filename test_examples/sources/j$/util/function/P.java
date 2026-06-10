package j$.util.function;

import java.util.function.IntToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntToDoubleFunction f12217a;

    private /* synthetic */ P(IntToDoubleFunction intToDoubleFunction) {
        this.f12217a = intToDoubleFunction;
    }

    public static /* synthetic */ S b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof Q ? ((Q) intToDoubleFunction).f12220a : new P(intToDoubleFunction);
    }

    public final /* synthetic */ double a(int i10) {
        return this.f12217a.applyAsDouble(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof P) {
            obj = ((P) obj).f12217a;
        }
        return this.f12217a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12217a.hashCode();
    }
}
