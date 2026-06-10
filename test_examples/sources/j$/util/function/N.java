package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class N implements IntPredicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ O f12215a;

    private /* synthetic */ N(O o10) {
        this.f12215a = o10;
    }

    public static /* synthetic */ IntPredicate a(O o10) {
        if (o10 == null) {
            return null;
        }
        return o10 instanceof M ? ((M) o10).f12213a : new N(o10);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return a(((M) this.f12215a).a(M.b(intPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        O o10 = this.f12215a;
        if (obj instanceof N) {
            obj = ((N) obj).f12215a;
        }
        return o10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12215a.hashCode();
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate negate() {
        return a(((M) this.f12215a).c());
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return a(((M) this.f12215a).d(M.b(intPredicate)));
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i10) {
        return ((M) this.f12215a).e(i10);
    }
}
