package r;

import g0.g1;
import g0.k0;
import r.i;

/* loaded from: classes.dex */
public final class e<T, V extends i> implements g1<T> {

    /* renamed from: i  reason: collision with root package name */
    public final z<T, V> f16974i;

    /* renamed from: j  reason: collision with root package name */
    public final k0 f16975j;

    /* renamed from: k  reason: collision with root package name */
    public V f16976k;

    /* renamed from: l  reason: collision with root package name */
    public long f16977l;

    /* renamed from: m  reason: collision with root package name */
    public long f16978m;
    public boolean n;

    public /* synthetic */ e(z zVar, Object obj, i iVar, int i10) {
        this(zVar, obj, (i10 & 4) != 0 ? null : iVar, (i10 & 8) != 0 ? Long.MIN_VALUE : 0L, (i10 & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public e(z<T, V> zVar, T t10, V v3, long j2, long j10, boolean z10) {
        v7.g.f(zVar, "typeConverter");
        this.f16974i = zVar;
        this.f16975j = a1.c.V0(t10);
        this.f16976k = v3 != null ? (V) a1.c.m0(v3) : (V) a1.c.W0(zVar.a().U(t10));
        this.f16977l = j2;
        this.f16978m = j10;
        this.n = z10;
    }

    @Override // g0.g1
    public final T getValue() {
        return this.f16975j.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.f16974i.b().U(this.f16976k) + ", isRunning=" + this.n + ", lastFrameTimeNanos=" + this.f16977l + ", finishedTimeNanos=" + this.f16978m + ')';
    }
}
