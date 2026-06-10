package l9;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import l8.i0;
import v7.g;
import y9.f0;
import y9.r;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f15866a;

    /* renamed from: b  reason: collision with root package name */
    public NewCapturedTypeConstructor f15867b;

    public c(f0 f0Var) {
        g.f(f0Var, "projection");
        this.f15866a = f0Var;
        f0Var.a();
    }

    @Override // y9.e0
    public final boolean a() {
        return false;
    }

    @Override // l9.b
    public final f0 b() {
        return this.f15866a;
    }

    @Override // y9.e0
    public final /* bridge */ /* synthetic */ l8.d c() {
        return null;
    }

    @Override // y9.e0
    public final List<i0> e() {
        return EmptyList.f12981i;
    }

    @Override // y9.e0
    public final Collection<r> f() {
        f0 f0Var = this.f15866a;
        r b5 = f0Var.a() == Variance.OUT_VARIANCE ? f0Var.b() : u().p();
        g.e(b5, "if (projection.projectio… builtIns.nullableAnyType");
        return a1.c.N0(b5);
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f15866a + ')';
    }

    @Override // y9.e0
    public final e u() {
        e u10 = this.f15866a.b().U0().u();
        g.e(u10, "projection.type.constructor.builtIns");
        return u10;
    }
}
