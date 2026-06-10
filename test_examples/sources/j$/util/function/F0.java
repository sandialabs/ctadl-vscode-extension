package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class F0 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Predicate f12200b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ F0(Predicate predicate, Predicate predicate2, int i10) {
        this.f12199a = i10;
        this.f12200b = predicate;
        this.c = predicate2;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        switch (this.f12199a) {
            case 0:
                predicate.getClass();
                return new F0(this, predicate, 0);
            default:
                predicate.getClass();
                return new F0(this, predicate, 0);
        }
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        switch (this.f12199a) {
            case 0:
                predicate.getClass();
                return new F0(this, predicate, 1);
            default:
                predicate.getClass();
                return new F0(this, predicate, 1);
        }
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.f12199a) {
            case 0:
                return new G0(this);
            default:
                return new G0(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i10 = this.f12199a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.f12200b;
        switch (i10) {
            case 0:
                return j$.time.a.b(predicate2, predicate, obj);
            default:
                if (!predicate2.test(obj) && !predicate.test(obj)) {
                    return false;
                }
                return true;
        }
    }
}
