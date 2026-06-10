package j$.util.function;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntPredicate f12213a;

    private /* synthetic */ M(IntPredicate intPredicate) {
        this.f12213a = intPredicate;
    }

    public static /* synthetic */ O b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof N ? ((N) intPredicate).f12215a : new M(intPredicate);
    }

    public final /* synthetic */ O a(O o10) {
        return b(this.f12213a.and(N.a(o10)));
    }

    public final /* synthetic */ O c() {
        return b(this.f12213a.negate());
    }

    public final /* synthetic */ O d(O o10) {
        return b(this.f12213a.or(N.a(o10)));
    }

    public final /* synthetic */ boolean e(int i10) {
        return this.f12213a.test(i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof M) {
            obj = ((M) obj).f12213a;
        }
        return this.f12213a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12213a.hashCode();
    }
}
