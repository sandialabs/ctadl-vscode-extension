package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.datastore.preferences.protobuf.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import m9.m;
import n7.l;
import y9.e0;
import y9.f0;
import y9.m0;
import y9.n;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public abstract class KotlinTypePreparator extends k {

    /* loaded from: classes.dex */
    public static final class a extends KotlinTypePreparator {

        /* renamed from: i  reason: collision with root package name */
        public static final a f14979i = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    public static v M0(v vVar) {
        r b5;
        e0 U0 = vVar.U0();
        boolean z10 = true;
        boolean z11 = false;
        m0 m0Var = null;
        if (U0 instanceof l9.c) {
            l9.c cVar = (l9.c) U0;
            f0 f0Var = cVar.f15866a;
            if (f0Var.a() != Variance.IN_VARIANCE) {
                z10 = false;
            }
            if (!z10) {
                f0Var = null;
            }
            if (f0Var != null && (b5 = f0Var.b()) != null) {
                m0Var = b5.X0();
            }
            m0 m0Var2 = m0Var;
            if (cVar.f15867b == null) {
                Collection<r> f10 = cVar.f();
                ArrayList arrayList = new ArrayList(l.Z1(f10, 10));
                for (r rVar : f10) {
                    arrayList.add(rVar.X0());
                }
                f0 f0Var2 = cVar.f15866a;
                v7.g.f(f0Var2, "projection");
                cVar.f15867b = new NewCapturedTypeConstructor(f0Var2, new NewCapturedTypeConstructor.AnonymousClass1(arrayList), null, null, 8);
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructor = cVar.f15867b;
            v7.g.c(newCapturedTypeConstructor);
            return new z9.b(captureStatus, newCapturedTypeConstructor, m0Var2, vVar.T0(), vVar.V0(), 32);
        } else if (!(U0 instanceof m)) {
            if ((U0 instanceof IntersectionTypeConstructor) && vVar.V0()) {
                IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) U0;
                LinkedHashSet<r> linkedHashSet = intersectionTypeConstructor.f14942b;
                ArrayList arrayList2 = new ArrayList(l.Z1(linkedHashSet, 10));
                for (r rVar2 : linkedHashSet) {
                    arrayList2.add(TypeUtilsKt.k(rVar2));
                    z11 = true;
                }
                if (z11) {
                    r rVar3 = intersectionTypeConstructor.f14941a;
                    if (rVar3 != null) {
                        m0Var = TypeUtilsKt.k(rVar3);
                    }
                    arrayList2.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                    linkedHashSet2.hashCode();
                    m0Var = new IntersectionTypeConstructor(linkedHashSet2, m0Var);
                }
                return (m0Var == null ? intersectionTypeConstructor : m0Var).g();
            }
            return vVar;
        } else {
            ((m) U0).getClass();
            l.Z1(null, 10);
            throw null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    /* renamed from: L0 */
    public final m0 G0(ba.f fVar) {
        m0 c;
        r rVar;
        v7.g.f(fVar, "type");
        if (fVar instanceof r) {
            m0 X0 = ((r) fVar).X0();
            if (X0 instanceof v) {
                c = M0((v) X0);
            } else if (X0 instanceof n) {
                n nVar = (n) X0;
                v M0 = M0(nVar.f18958j);
                v vVar = nVar.f18959k;
                v M02 = M0(vVar);
                if (M0 == nVar.f18958j && M02 == vVar) {
                    c = X0;
                }
                c = KotlinTypeFactory.c(M0, M02);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            KotlinTypePreparator$prepareType$1 kotlinTypePreparator$prepareType$1 = new KotlinTypePreparator$prepareType$1(this);
            v7.g.f(c, "<this>");
            v7.g.f(X0, "origin");
            r W = a1.b.W(X0);
            if (W != null) {
                rVar = (r) kotlinTypePreparator$prepareType$1.U(W);
            } else {
                rVar = null;
            }
            return a1.b.M0(c, rVar);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
