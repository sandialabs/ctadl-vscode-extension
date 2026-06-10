package d8;

import a1.c;
import c8.b;
import c8.m;
import f8.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.l;
import l8.d;
import l8.i0;
import v7.g;
import y9.e0;
import y9.g0;
import y9.h0;
import y9.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0105a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10443a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10443a = iArr;
        }
    }

    public static final KTypeImpl a(b bVar, List list, boolean z10, List list2) {
        e eVar;
        d a10;
        l.a aVar;
        r rVar;
        int i10;
        g0 starProjectionImpl;
        g.f(bVar, "<this>");
        g.f(list, "arguments");
        g.f(list2, "annotations");
        if (bVar instanceof e) {
            eVar = (e) bVar;
        } else {
            eVar = null;
        }
        if (eVar != null && (a10 = eVar.a()) != null) {
            e0 o10 = a10.o();
            g.e(o10, "descriptor.typeConstructor");
            List<i0> e10 = o10.e();
            g.e(e10, "typeConstructor.parameters");
            if (e10.size() == list.size()) {
                if (list2.isEmpty()) {
                    aVar = l.f15045j;
                } else {
                    aVar = l.f15045j;
                }
                aVar.getClass();
                l lVar = l.f15046k;
                List<i0> e11 = o10.e();
                g.e(e11, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        m mVar = (m) obj;
                        KTypeImpl kTypeImpl = (KTypeImpl) mVar.f6562b;
                        if (kTypeImpl != null) {
                            rVar = kTypeImpl.f13217a;
                        } else {
                            rVar = null;
                        }
                        KVariance kVariance = mVar.f6561a;
                        if (kVariance == null) {
                            i10 = -1;
                        } else {
                            i10 = C0105a.f10443a[kVariance.ordinal()];
                        }
                        if (i10 != -1) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        Variance variance = Variance.OUT_VARIANCE;
                                        g.c(rVar);
                                        starProjectionImpl = new h0(rVar, variance);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    Variance variance2 = Variance.IN_VARIANCE;
                                    g.c(rVar);
                                    starProjectionImpl = new h0(rVar, variance2);
                                }
                            } else {
                                Variance variance3 = Variance.INVARIANT;
                                g.c(rVar);
                                starProjectionImpl = new h0(rVar, variance3);
                            }
                        } else {
                            i0 i0Var = e11.get(i11);
                            g.e(i0Var, "parameters[index]");
                            starProjectionImpl = new StarProjectionImpl(i0Var);
                        }
                        arrayList.add(starProjectionImpl);
                        i11 = i12;
                    } else {
                        c.F1();
                        throw null;
                    }
                }
                return new KTypeImpl(KotlinTypeFactory.f(lVar, o10, arrayList, z10, null), null);
            }
            throw new IllegalArgumentException("Class declares " + e10.size() + " type parameters, but " + list.size() + " were provided.");
        }
        throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + bVar + " (" + bVar.getClass() + ')');
    }
}
