package y9;

/* loaded from: classes.dex */
public final class w extends j {

    /* renamed from: k  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.l f18965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, kotlin.reflect.jvm.internal.impl.types.l lVar) {
        super(vVar);
        v7.g.f(vVar, "delegate");
        v7.g.f(lVar, "attributes");
        this.f18965k = lVar;
    }

    @Override // y9.i, y9.r
    public final kotlin.reflect.jvm.internal.impl.types.l T0() {
        return this.f18965k;
    }

    @Override // y9.i
    public final i f1(v vVar) {
        return new w(vVar, this.f18965k);
    }
}
