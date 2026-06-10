package j$.util.function;

import j$.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class H0 implements java.util.function.Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Predicate f12205a;

    private /* synthetic */ H0(Predicate predicate) {
        this.f12205a = predicate;
    }

    public static /* synthetic */ java.util.function.Predicate a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).f12219a : new H0(predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return a(this.f12205a.a(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Predicate predicate = this.f12205a;
        if (obj instanceof H0) {
            obj = ((H0) obj).f12205a;
        }
        return predicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12205a.hashCode();
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return a(this.f12205a.negate());
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return a(this.f12205a.b(Predicate.VivifiedWrapper.convert(predicate)));
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.f12205a.test(obj);
    }
}
