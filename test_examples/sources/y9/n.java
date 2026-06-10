package y9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public abstract class n extends m0 implements ba.d {

    /* renamed from: j  reason: collision with root package name */
    public final v f18958j;

    /* renamed from: k  reason: collision with root package name */
    public final v f18959k;

    public n(v vVar, v vVar2) {
        v7.g.f(vVar, "lowerBound");
        v7.g.f(vVar2, "upperBound");
        this.f18958j = vVar;
        this.f18959k = vVar2;
    }

    @Override // y9.r
    public final List<f0> S0() {
        return b1().S0();
    }

    @Override // y9.r
    public kotlin.reflect.jvm.internal.impl.types.l T0() {
        return b1().T0();
    }

    @Override // y9.r
    public final e0 U0() {
        return b1().U0();
    }

    @Override // y9.r
    public boolean V0() {
        return b1().V0();
    }

    public abstract v b1();

    public abstract String c1(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.b bVar);

    public String toString() {
        return DescriptorRenderer.f14594b.u(this);
    }

    @Override // y9.r
    public MemberScope w() {
        return b1().w();
    }
}
