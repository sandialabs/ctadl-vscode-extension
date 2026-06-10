package j$.util.function;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements IntBinaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G f12198a;

    private /* synthetic */ F(G g10) {
        this.f12198a = g10;
    }

    public static /* synthetic */ IntBinaryOperator a(G g10) {
        if (g10 == null) {
            return null;
        }
        return g10 instanceof E ? ((E) g10).f12197a : new F(g10);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i10, int i11) {
        return this.f12198a.applyAsInt(i10, i11);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        G g10 = this.f12198a;
        if (obj instanceof F) {
            obj = ((F) obj).f12198a;
        }
        return g10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12198a.hashCode();
    }
}
