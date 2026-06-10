package l8;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: i  reason: collision with root package name */
    public final i0 f15832i;

    /* renamed from: j  reason: collision with root package name */
    public final f f15833j;

    /* renamed from: k  reason: collision with root package name */
    public final int f15834k;

    public a(i0 i0Var, f fVar, int i10) {
        v7.g.f(fVar, "declarationDescriptor");
        this.f15832i = i0Var;
        this.f15833j = fVar;
        this.f15834k = i10;
    }

    @Override // l8.i0
    public final x9.h G() {
        return this.f15832i.G();
    }

    @Override // l8.i0
    public final boolean W() {
        return true;
    }

    @Override // l8.i0
    public final boolean X() {
        return this.f15832i.X();
    }

    @Override // l8.i0, l8.d, l8.f
    public final i0 a() {
        i0 a10 = this.f15832i.a();
        v7.g.e(a10, "originalDescriptor.original");
        return a10;
    }

    @Override // l8.g, l8.f
    public final f c() {
        return this.f15833j;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return this.f15832i.getAnnotations();
    }

    @Override // l8.i0
    public final int getIndex() {
        return this.f15832i.getIndex() + this.f15834k;
    }

    @Override // l8.f
    public final h9.e getName() {
        return this.f15832i.getName();
    }

    @Override // l8.i0
    public final List<y9.r> getUpperBounds() {
        return this.f15832i.getUpperBounds();
    }

    @Override // l8.i
    public final d0 j() {
        return this.f15832i.j();
    }

    @Override // l8.f
    public final <R, D> R n0(h<R, D> hVar, D d5) {
        return (R) this.f15832i.n0(hVar, d5);
    }

    @Override // l8.i0, l8.d
    public final y9.e0 o() {
        return this.f15832i.o();
    }

    @Override // l8.d
    public final y9.v r() {
        return this.f15832i.r();
    }

    @Override // l8.i0
    public final Variance t() {
        return this.f15832i.t();
    }

    public final String toString() {
        return this.f15832i + "[inner-copy]";
    }
}
