package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import aa.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.d;
import l8.i0;
import m0.b;
import v7.g;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.r;
import y9.v;
import z8.c;

/* loaded from: classes.dex */
public final class RawSubstitution extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final z8.a f13834d;

    /* renamed from: e  reason: collision with root package name */
    public static final z8.a f13835e;

    /* renamed from: b  reason: collision with root package name */
    public final c f13836b;
    public final p c;

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f13834d = b.r1(typeUsage, false, true, null, 5).f(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f13835e = b.r1(typeUsage, false, true, null, 5).f(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution() {
        c cVar = new c();
        this.f13836b = cVar;
        this.c = new p(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(r rVar) {
        return new h0(h(rVar, new z8.a(TypeUsage.COMMON, false, false, null, 62)));
    }

    public final Pair<v, Boolean> g(v vVar, l8.b bVar, z8.a aVar) {
        if (vVar.U0().e().isEmpty()) {
            return new Pair<>(vVar, Boolean.FALSE);
        }
        if (e.z(vVar)) {
            f0 f0Var = vVar.S0().get(0);
            Variance a10 = f0Var.a();
            r b5 = f0Var.b();
            g.e(b5, "componentTypeProjection.type");
            return new Pair<>(KotlinTypeFactory.f(vVar.T0(), vVar.U0(), a1.c.N0(new h0(h(b5, aVar), a10)), vVar.V0(), null), Boolean.FALSE);
        } else if (b.D0(vVar)) {
            return new Pair<>(h.c(ErrorTypeKind.ERROR_RAW_TYPE, vVar.U0().toString()), Boolean.FALSE);
        } else {
            MemberScope y10 = bVar.y(this);
            g.e(y10, "declaration.getMemberScope(this)");
            l T0 = vVar.T0();
            e0 o10 = bVar.o();
            g.e(o10, "declaration.typeConstructor");
            List<i0> e10 = bVar.o().e();
            g.e(e10, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(n7.l.Z1(e10, 10));
            for (i0 i0Var : e10) {
                g.e(i0Var, "parameter");
                p pVar = this.c;
                arrayList.add(this.f13836b.s(i0Var, aVar, pVar, pVar.a(i0Var, aVar)));
            }
            return new Pair<>(KotlinTypeFactory.h(T0, o10, arrayList, vVar.V0(), y10, new RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(bVar, aVar, this, vVar)), Boolean.TRUE);
        }
    }

    public final r h(r rVar, z8.a aVar) {
        d c = rVar.U0().c();
        if (c instanceof i0) {
            aVar.getClass();
            z8.a e10 = z8.a.e(aVar, null, true, null, null, 59);
            return h(this.c.a((i0) c, e10), aVar);
        } else if (c instanceof l8.b) {
            d c10 = a1.b.K0(rVar).U0().c();
            if (c10 instanceof l8.b) {
                Pair<v, Boolean> g10 = g(a1.b.q0(rVar), (l8.b) c, f13834d);
                v vVar = g10.f12962i;
                boolean booleanValue = g10.f12963j.booleanValue();
                Pair<v, Boolean> g11 = g(a1.b.K0(rVar), (l8.b) c10, f13835e);
                v vVar2 = g11.f12962i;
                boolean booleanValue2 = g11.f12963j.booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return KotlinTypeFactory.c(vVar, vVar2);
                }
                return new RawTypeImpl(vVar, vVar2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + c10 + "\" while for lower it's \"" + c + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + c).toString());
        }
    }
}
