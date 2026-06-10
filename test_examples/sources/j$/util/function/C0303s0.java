package j$.util.function;

/* renamed from: j$.util.function.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0303s0 implements v0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12260a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f12261b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ C0303s0(v0 v0Var, v0 v0Var2, int i10) {
        this.f12260a = i10;
        this.f12261b = v0Var;
        this.c = v0Var2;
    }

    @Override // j$.util.function.v0
    public final v0 a(v0 v0Var) {
        switch (this.f12260a) {
            case 0:
                v0Var.getClass();
                return new C0303s0(this, v0Var, 1);
            default:
                v0Var.getClass();
                return new C0303s0(this, v0Var, 1);
        }
    }

    @Override // j$.util.function.v0
    public final long applyAsLong(long j2) {
        int i10 = this.f12260a;
        v0 v0Var = this.c;
        v0 v0Var2 = this.f12261b;
        switch (i10) {
            case 0:
                return v0Var.applyAsLong(v0Var2.applyAsLong(j2));
            default:
                return v0Var2.applyAsLong(v0Var.applyAsLong(j2));
        }
    }

    @Override // j$.util.function.v0
    public final v0 b(v0 v0Var) {
        switch (this.f12260a) {
            case 0:
                v0Var.getClass();
                return new C0303s0(this, v0Var, 0);
            default:
                v0Var.getClass();
                return new C0303s0(this, v0Var, 0);
        }
    }
}
