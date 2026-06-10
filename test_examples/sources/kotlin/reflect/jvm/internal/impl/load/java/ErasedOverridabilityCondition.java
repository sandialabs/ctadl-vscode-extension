package kotlin.reflect.jvm.internal.impl.load.java;

import ga.f;
import ga.p;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.sequences.SequencesKt__SequencesKt;
import l8.c0;
import l8.i0;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13616a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13616a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar) {
        OverridingUtil.OverrideCompatibilityInfo.Result result;
        boolean z10;
        List<i0> typeParameters;
        boolean z11;
        g.f(aVar, "superDescriptor");
        g.f(aVar2, "subDescriptor");
        boolean z12 = aVar2 instanceof JavaMethodDescriptor;
        ExternalOverridabilityCondition.Result result2 = ExternalOverridabilityCondition.Result.UNKNOWN;
        if (z12) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
            if (!(!javaMethodDescriptor.getTypeParameters().isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo i10 = OverridingUtil.i(aVar, aVar2);
                r rVar = null;
                if (i10 != null) {
                    result = i10.c();
                } else {
                    result = null;
                }
                if (result != null) {
                    return result2;
                }
                List<h> m10 = javaMethodDescriptor.m();
                g.e(m10, "subDescriptor.valueParameters");
                p W0 = kotlin.sequences.a.W0(kotlin.collections.c.g2(m10), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.f13617j);
                r rVar2 = javaMethodDescriptor.f13530o;
                g.c(rVar2);
                f Y0 = kotlin.sequences.a.Y0(W0, rVar2);
                c0 c0Var = javaMethodDescriptor.f13532q;
                if (c0Var != null) {
                    rVar = c0Var.b();
                }
                List P0 = a1.c.P0(rVar);
                g.f(P0, "elements");
                f.a aVar3 = new f.a(SequencesKt__SequencesKt.N0(SequencesKt__SequencesKt.Q0(Y0, kotlin.collections.c.g2(P0))));
                while (true) {
                    if (aVar3.a()) {
                        r rVar3 = (r) aVar3.next();
                        if ((!rVar3.S0().isEmpty()) && !(rVar3.X0() instanceof RawTypeImpl)) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return result2;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a d5 = aVar.d(TypeSubstitutor.d(new RawSubstitution()));
                if (d5 == null) {
                    return result2;
                }
                if (d5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                    kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) d5;
                    g.e(gVar.getTypeParameters(), "erasedSuper.typeParameters");
                    if (!typeParameters.isEmpty()) {
                        d5 = gVar.v().b(EmptyList.f12981i).build();
                        g.c(d5);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f14687f.n(d5, aVar2, false).c();
                g.e(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (a.f13616a[c.ordinal()] == 1) {
                    return ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return result2;
            }
            return result2;
        }
        return result2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
