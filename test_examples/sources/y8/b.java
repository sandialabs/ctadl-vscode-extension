package y8;

import b9.j;
import b9.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.f;
import n7.l;
import o8.c;
import v7.g;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: s  reason: collision with root package name */
    public final x8.c f18938s;

    /* renamed from: t  reason: collision with root package name */
    public final x f18939t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(x8.c cVar, x xVar, int i10, f fVar) {
        super(r0.f18739a, fVar, new LazyJavaAnnotations(cVar, xVar, false), xVar.getName(), Variance.INVARIANT, false, i10, r0.f18750m);
        g.f(xVar, "javaTypeParameter");
        g.f(fVar, "containingDeclaration");
        x8.a aVar = cVar.f18762a;
        this.f18938s = cVar;
        this.f18939t = xVar;
    }

    @Override // o8.i
    public final List<r> M0(List<? extends r> list) {
        g.f(list, "bounds");
        x8.c cVar = this.f18938s;
        return cVar.f18762a.f18754r.d(this, list, cVar);
    }

    @Override // o8.i
    public final void S0(r rVar) {
        g.f(rVar, "type");
    }

    @Override // o8.i
    public final List<r> T0() {
        Collection<j> upperBounds = this.f18939t.getUpperBounds();
        boolean isEmpty = upperBounds.isEmpty();
        x8.c cVar = this.f18938s;
        if (isEmpty) {
            v f10 = cVar.f18762a.f18751o.u().f();
            g.e(f10, "c.module.builtIns.anyType");
            v p10 = cVar.f18762a.f18751o.u().p();
            g.e(p10, "c.module.builtIns.nullableAnyType");
            return a1.c.N0(KotlinTypeFactory.c(f10, p10));
        }
        ArrayList arrayList = new ArrayList(l.Z1(upperBounds, 10));
        for (j jVar : upperBounds) {
            arrayList.add(cVar.f18765e.e(jVar, m0.b.r1(TypeUsage.COMMON, false, false, this, 3)));
        }
        return arrayList;
    }
}
