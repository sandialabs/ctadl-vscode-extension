package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.j;
import l8.h0;
import l8.i0;
import o8.w;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class KotlinTypeFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14947a = 0;

    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        int i10 = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.f14948j;
    }

    public static final a a(e0 e0Var, kotlin.reflect.jvm.internal.impl.types.checker.e eVar, List list) {
        l8.d c = e0Var.c();
        if (c != null) {
            eVar.N0(c);
            return null;
        }
        return null;
    }

    public static final v b(h0 h0Var, List<? extends f0> list) {
        v7.g.f(h0Var, "<this>");
        v7.g.f(list, "arguments");
        i iVar = new i();
        j a10 = j.a.a(null, h0Var, list);
        l.f15045j.getClass();
        l lVar = l.f15046k;
        v7.g.f(lVar, "attributes");
        return iVar.c(a10, lVar, false, 0, true);
    }

    public static final m0 c(v vVar, v vVar2) {
        v7.g.f(vVar, "lowerBound");
        v7.g.f(vVar2, "upperBound");
        return v7.g.a(vVar, vVar2) ? vVar : new y9.o(vVar, vVar2);
    }

    public static final v d(l lVar, IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        v7.g.f(lVar, "attributes");
        v7.g.f(integerLiteralTypeConstructor, "constructor");
        return g(EmptyList.f12981i, aa.h.a(ErrorScopeKind.f15009k, true, "unknown integer literal type"), lVar, integerLiteralTypeConstructor, false);
    }

    public static final v e(l lVar, l8.b bVar, List<? extends f0> list) {
        v7.g.f(lVar, "attributes");
        v7.g.f(bVar, "descriptor");
        v7.g.f(list, "arguments");
        e0 o10 = bVar.o();
        v7.g.e(o10, "descriptor.typeConstructor");
        return f(lVar, o10, list, false, null);
    }

    public static final v f(l lVar, e0 e0Var, List<? extends f0> list, boolean z10, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        MemberScope a10;
        v7.g.f(lVar, "attributes");
        v7.g.f(e0Var, "constructor");
        v7.g.f(list, "arguments");
        if (lVar.isEmpty() && list.isEmpty() && !z10 && e0Var.c() != null) {
            l8.d c = e0Var.c();
            v7.g.c(c);
            v r3 = c.r();
            v7.g.e(r3, "constructor.declarationDescriptor!!.defaultType");
            return r3;
        }
        l8.d c10 = e0Var.c();
        if (c10 instanceof i0) {
            a10 = ((i0) c10).r().w();
        } else if (c10 instanceof l8.b) {
            if (eVar == null) {
                eVar = DescriptorUtilsKt.i(DescriptorUtilsKt.j(c10));
            }
            l8.b bVar = (l8.b) c10;
            w wVar = null;
            if (list.isEmpty()) {
                v7.g.f(bVar, "<this>");
                v7.g.f(eVar, "kotlinTypeRefiner");
                if (bVar instanceof w) {
                    wVar = (w) bVar;
                }
                if (wVar == null || (a10 = wVar.c0(eVar)) == null) {
                    a10 = bVar.I0();
                    v7.g.e(a10, "this.unsubstitutedMemberScope");
                }
            } else {
                q b5 = o.f15066b.b(e0Var, list);
                v7.g.f(bVar, "<this>");
                v7.g.f(eVar, "kotlinTypeRefiner");
                if (bVar instanceof w) {
                    wVar = (w) bVar;
                }
                if (wVar == null || (a10 = wVar.K(b5, eVar)) == null) {
                    a10 = bVar.y(b5);
                    v7.g.e(a10, "this.getMemberScope(\n   …ubstitution\n            )");
                }
            }
        } else if (c10 instanceof h0) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.f15010l;
            String str = ((h0) c10).getName().f11572i;
            v7.g.e(str, "descriptor.name.toString()");
            a10 = aa.h.a(errorScopeKind, true, str);
        } else if (e0Var instanceof IntersectionTypeConstructor) {
            a10 = TypeIntersectionScope.a.a("member scope for intersection type", ((IntersectionTypeConstructor) e0Var).f14942b);
        } else {
            throw new IllegalStateException("Unsupported classifier: " + c10 + " for constructor: " + e0Var);
        }
        return h(lVar, e0Var, list, z10, a10, new KotlinTypeFactory$simpleType$1(list, lVar, e0Var, z10));
    }

    public static final v g(List list, MemberScope memberScope, l lVar, e0 e0Var, boolean z10) {
        v7.g.f(lVar, "attributes");
        v7.g.f(e0Var, "constructor");
        v7.g.f(list, "arguments");
        v7.g.f(memberScope, "memberScope");
        h hVar = new h(e0Var, list, z10, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(list, memberScope, lVar, e0Var, z10));
        return lVar.isEmpty() ? hVar : new y9.w(hVar, lVar);
    }

    public static final v h(l lVar, e0 e0Var, List<? extends f0> list, boolean z10, MemberScope memberScope, u7.l<? super kotlin.reflect.jvm.internal.impl.types.checker.e, ? extends v> lVar2) {
        v7.g.f(lVar, "attributes");
        v7.g.f(e0Var, "constructor");
        v7.g.f(list, "arguments");
        v7.g.f(memberScope, "memberScope");
        v7.g.f(lVar2, "refinedTypeFactory");
        h hVar = new h(e0Var, list, z10, memberScope, lVar2);
        return lVar.isEmpty() ? hVar : new y9.w(hVar, lVar);
    }
}
