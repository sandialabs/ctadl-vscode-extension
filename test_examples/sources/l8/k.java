package l8;

/* loaded from: classes.dex */
public abstract class k extends m {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f15838a;

    public k(n0 n0Var) {
        v7.g.f(n0Var, "delegate");
        this.f15838a = n0Var;
    }

    @Override // l8.m
    public final n0 a() {
        return this.f15838a;
    }

    @Override // l8.m
    public final String b() {
        return this.f15838a.b();
    }

    @Override // l8.m
    public final m d() {
        return l.g(this.f15838a.c());
    }
}
