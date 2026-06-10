package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class G0 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Predicate f12202a;

    public /* synthetic */ G0(Predicate predicate) {
        this.f12202a = predicate;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        predicate.getClass();
        return new F0(this, predicate, 0);
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        predicate.getClass();
        return new F0(this, predicate, 1);
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        return new G0(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return !this.f12202a.test(obj);
    }
}
