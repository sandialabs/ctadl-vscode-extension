package y9;

/* loaded from: classes.dex */
public abstract class j extends i {

    /* renamed from: j  reason: collision with root package name */
    public final v f18953j;

    public j(v vVar) {
        v7.g.f(vVar, "delegate");
        this.f18953j = vVar;
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        return z10 == V0() ? this : this.f18953j.Y0(z10).a1(T0());
    }

    @Override // y9.v
    public final v c1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return lVar != T0() ? new w(this, lVar) : this;
    }

    @Override // y9.i
    public final v d1() {
        return this.f18953j;
    }
}
