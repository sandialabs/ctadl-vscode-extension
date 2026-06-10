package j$.util.function;

import java.util.function.IntToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements IntToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f12220a;

    private /* synthetic */ Q(S s10) {
        this.f12220a = s10;
    }

    public static /* synthetic */ IntToDoubleFunction a(S s10) {
        if (s10 == null) {
            return null;
        }
        return s10 instanceof P ? ((P) s10).f12217a : new Q(s10);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final /* synthetic */ double applyAsDouble(int i10) {
        return ((P) this.f12220a).a(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        S s10 = this.f12220a;
        if (obj instanceof Q) {
            obj = ((Q) obj).f12220a;
        }
        return s10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12220a.hashCode();
    }
}
