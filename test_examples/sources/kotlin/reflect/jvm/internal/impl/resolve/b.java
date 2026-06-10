package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import k9.d;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import l8.d0;
import l8.f;
import l8.i0;
import l8.r;
import l8.u;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14701a = new b();

    public static /* synthetic */ boolean c(b bVar, i0 i0Var, i0 i0Var2, boolean z10) {
        return bVar.b(i0Var, i0Var2, z10, DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.f14677j);
    }

    public static d0 e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.h() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> f10 = callableMemberDescriptor.f();
            g.e(f10, "overriddenDescriptors");
            aVar = (CallableMemberDescriptor) c.D2(f10);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
        if (r7.m(r6, r5, null, true).c() == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(f fVar, f fVar2, boolean z10, boolean z11) {
        if ((fVar instanceof l8.b) && (fVar2 instanceof l8.b)) {
            return g.a(((l8.b) fVar).o(), ((l8.b) fVar2).o());
        }
        if ((fVar instanceof i0) && (fVar2 instanceof i0)) {
            return c(this, (i0) fVar, (i0) fVar2, z10);
        }
        if ((fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (fVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) fVar;
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) fVar2;
            e.a aVar3 = e.a.f14998i;
            g.f(aVar, "a");
            g.f(aVar2, "b");
            g.f(aVar3, "kotlinTypeRefiner");
            if (!g.a(aVar, aVar2)) {
                if (g.a(aVar.getName(), aVar2.getName()) && ((!z11 || !(aVar instanceof r) || !(aVar2 instanceof r) || ((r) aVar).l0() == ((r) aVar2).l0()) && ((!g.a(aVar.c(), aVar2.c()) || (z10 && g.a(e(aVar), e(aVar2)))) && !d.o(aVar) && !d.o(aVar2) && d(aVar, aVar2, DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1.f14674j, z10)))) {
                    OverridingUtil overridingUtil = new OverridingUtil(new a(aVar, aVar2, z10), aVar3, KotlinTypePreparator.a.f14979i);
                    OverridingUtil.OverrideCompatibilityInfo.Result c = overridingUtil.m(aVar, aVar2, null, true).c();
                    OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                    if (c == result) {
                    }
                }
                return false;
            }
            return true;
        }
        boolean z12 = fVar instanceof u;
        h9.c cVar = fVar;
        h9.c cVar2 = fVar2;
        if (z12) {
            boolean z13 = fVar2 instanceof u;
            cVar = fVar;
            cVar2 = fVar2;
            if (z13) {
                cVar = ((u) fVar).e();
                cVar2 = ((u) fVar2).e();
            }
        }
        return g.a(cVar, cVar2);
    }

    public final boolean b(i0 i0Var, i0 i0Var2, boolean z10, p<? super f, ? super f, Boolean> pVar) {
        g.f(i0Var, "a");
        g.f(i0Var2, "b");
        g.f(pVar, "equivalentCallables");
        if (g.a(i0Var, i0Var2)) {
            return true;
        }
        return !g.a(i0Var.c(), i0Var2.c()) && d(i0Var, i0Var2, pVar, z10) && i0Var.getIndex() == i0Var2.getIndex();
    }

    public final boolean d(f fVar, f fVar2, p<? super f, ? super f, Boolean> pVar, boolean z10) {
        f c = fVar.c();
        f c10 = fVar2.c();
        if (!(c instanceof CallableMemberDescriptor) && !(c10 instanceof CallableMemberDescriptor)) {
            return a(c, c10, z10, true);
        }
        return pVar.R(c, c10).booleanValue();
    }
}
