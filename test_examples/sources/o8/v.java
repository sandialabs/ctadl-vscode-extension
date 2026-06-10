package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.l;

/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: i  reason: collision with root package name */
    public final w f16468i;

    /* renamed from: j  reason: collision with root package name */
    public final TypeSubstitutor f16469j;

    /* renamed from: k  reason: collision with root package name */
    public TypeSubstitutor f16470k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f16471l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f16472m;
    public y9.d n;

    public v(w wVar, TypeSubstitutor typeSubstitutor) {
        this.f16468i = wVar;
        this.f16469j = typeSubstitutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void z0(int i10) {
        String format;
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 13) {
                                    if (i10 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i10) {
                                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case ma.i.f16047o /* 10 */:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case ma.i.f16046m /* 9 */:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case ma.i.f16049q /* 15 */:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i10 != 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i10 == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i10 == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = String.format(str, objArr);
                                    if (i10 == 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
                                        throw new IllegalStateException(format);
                                    }
                                    throw new IllegalArgumentException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i10) {
                }
                if (i10 != 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i10 == 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i10) {
            }
            if (i10 != 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i10 == 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i10) {
        }
        if (i10 != 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i10 == 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return this.f16468i.A0();
    }

    @Override // l8.b
    public final MemberScope B0() {
        MemberScope B0 = this.f16468i.B0();
        if (B0 != null) {
            return B0;
        }
        z0(15);
        throw null;
    }

    @Override // l8.r
    public final boolean D() {
        return this.f16468i.D();
    }

    @Override // l8.b
    public final l8.b E0() {
        return this.f16468i.E0();
    }

    @Override // l8.b
    public final boolean H() {
        return this.f16468i.H();
    }

    @Override // l8.b
    public final MemberScope I0() {
        MemberScope c0 = c0(DescriptorUtilsKt.i(k9.d.d(this.f16468i)));
        if (c0 != null) {
            return c0;
        }
        z0(12);
        throw null;
    }

    @Override // l8.b
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = this.f16468i.J();
        ArrayList arrayList = new ArrayList(J.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : J) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.b) bVar.v().h(bVar.a()).k(bVar.p()).q(bVar.g()).l(bVar.h()).a().build()).d(M0()));
        }
        return arrayList;
    }

    @Override // o8.w
    public final MemberScope K(kotlin.reflect.jvm.internal.impl.types.q qVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (qVar == null) {
            z0(5);
            throw null;
        } else if (eVar == null) {
            z0(6);
            throw null;
        } else {
            MemberScope K = this.f16468i.K(qVar, eVar);
            if (this.f16469j.h()) {
                if (K != null) {
                    return K;
                }
                z0(7);
                throw null;
            }
            return new SubstitutingScope(K, M0());
        }
    }

    @Override // l8.r
    public final boolean L0() {
        return this.f16468i.L0();
    }

    public final TypeSubstitutor M0() {
        if (this.f16470k == null) {
            TypeSubstitutor typeSubstitutor = this.f16469j;
            if (typeSubstitutor.h()) {
                this.f16470k = typeSubstitutor;
            } else {
                List<l8.i0> e10 = this.f16468i.o().e();
                this.f16471l = new ArrayList(e10.size());
                this.f16470k = a1.b.D0(e10, typeSubstitutor.g(), this, this.f16471l);
                ArrayList arrayList = this.f16471l;
                v7.g.f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Boolean.valueOf(!((l8.i0) obj).W()).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                this.f16472m = arrayList2;
            }
        }
        return this.f16470k;
    }

    @Override // l8.b
    public final List<l8.c0> N0() {
        List<l8.c0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(17);
        throw null;
    }

    @Override // l8.b
    public final boolean Q0() {
        return this.f16468i.Q0();
    }

    @Override // l8.b
    public final l8.c0 R0() {
        throw new UnsupportedOperationException();
    }

    @Override // l8.b
    public final boolean T() {
        return this.f16468i.T();
    }

    @Override // o8.w, l8.b, l8.f
    public final l8.b a() {
        l8.b a10 = this.f16468i.a();
        if (a10 != null) {
            return a10;
        }
        z0(21);
        throw null;
    }

    @Override // l8.b, l8.g, l8.f
    public final l8.f c() {
        l8.f c = this.f16468i.c();
        if (c != null) {
            return c;
        }
        z0(22);
        throw null;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (eVar == null) {
            z0(13);
            throw null;
        }
        MemberScope c0 = this.f16468i.c0(eVar);
        if (this.f16469j.h()) {
            if (c0 != null) {
                return c0;
            }
            z0(14);
            throw null;
        }
        return new SubstitutingScope(c0, M0());
    }

    @Override // l8.f0
    public final l8.g d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.h() ? this : new v(this, TypeSubstitutor.f(typeSubstitutor.g(), M0().g()));
        }
        z0(23);
        throw null;
    }

    @Override // l8.b
    public final Collection<l8.b> e0() {
        Collection<l8.b> e02 = this.f16468i.e0();
        if (e02 != null) {
            return e02;
        }
        z0(31);
        throw null;
    }

    @Override // l8.b, l8.j, l8.r
    public final l8.m g() {
        l8.m g10 = this.f16468i.g();
        if (g10 != null) {
            return g10;
        }
        z0(27);
        throw null;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        m8.e annotations = this.f16468i.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        z0(19);
        throw null;
    }

    @Override // l8.f
    public final h9.e getName() {
        h9.e name = this.f16468i.getName();
        if (name != null) {
            return name;
        }
        z0(20);
        throw null;
    }

    @Override // l8.b
    public final ClassKind h() {
        ClassKind h10 = this.f16468i.h();
        if (h10 != null) {
            return h10;
        }
        z0(25);
        throw null;
    }

    @Override // l8.b
    public final boolean i() {
        return this.f16468i.i();
    }

    @Override // l8.b
    public final boolean i0() {
        return this.f16468i.i0();
    }

    @Override // l8.i
    public final l8.d0 j() {
        return l8.d0.f15835a;
    }

    @Override // l8.r
    public final boolean l0() {
        return this.f16468i.l0();
    }

    @Override // l8.e
    public final boolean m0() {
        return this.f16468i.m0();
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.j(this, d5);
    }

    @Override // l8.d
    public final y9.e0 o() {
        y9.e0 o10 = this.f16468i.o();
        if (this.f16469j.h()) {
            if (o10 != null) {
                return o10;
            }
            z0(0);
            throw null;
        }
        if (this.n == null) {
            TypeSubstitutor M0 = M0();
            Collection<y9.r> f10 = o10.f();
            ArrayList arrayList = new ArrayList(f10.size());
            for (y9.r rVar : f10) {
                arrayList.add(M0.k(rVar, Variance.INVARIANT));
            }
            this.n = new y9.d(this, this.f16471l, arrayList, LockBasedStorageManager.f14904e);
        }
        y9.d dVar = this.n;
        if (dVar != null) {
            return dVar;
        }
        z0(1);
        throw null;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        Modality p10 = this.f16468i.p();
        if (p10 != null) {
            return p10;
        }
        z0(26);
        throw null;
    }

    @Override // l8.b, l8.d
    public final y9.v r() {
        kotlin.reflect.jvm.internal.impl.types.l c;
        List<y9.f0> e10 = kotlin.reflect.jvm.internal.impl.types.r.e(o().e());
        m8.e annotations = getAnnotations();
        v7.g.f(annotations, "annotations");
        if (annotations.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
            c = kotlin.reflect.jvm.internal.impl.types.l.f15046k;
        } else {
            l.a aVar = kotlin.reflect.jvm.internal.impl.types.l.f15045j;
            List N0 = a1.c.N0(new y9.c(annotations));
            aVar.getClass();
            c = l.a.c(N0);
        }
        return KotlinTypeFactory.g(e10, I0(), c, o(), false);
    }

    @Override // l8.b
    public final MemberScope w0() {
        MemberScope w02 = this.f16468i.w0();
        if (w02 != null) {
            return w02;
        }
        z0(28);
        throw null;
    }

    @Override // l8.b, l8.e
    public final List<l8.i0> x() {
        M0();
        ArrayList arrayList = this.f16472m;
        if (arrayList != null) {
            return arrayList;
        }
        z0(30);
        throw null;
    }

    @Override // l8.b
    public final l8.j0<y9.v> x0() {
        l8.j0<y9.v> x02 = this.f16468i.x0();
        if (x02 == null) {
            return null;
        }
        boolean z10 = x02 instanceof l8.o;
        Variance variance = Variance.INVARIANT;
        TypeSubstitutor typeSubstitutor = this.f16469j;
        if (z10) {
            l8.o oVar = (l8.o) x02;
            y9.v vVar = (y9.v) oVar.f15858b;
            if (vVar != null && !typeSubstitutor.h()) {
                vVar = (y9.v) M0().k(vVar, variance);
            }
            return new l8.o(oVar.f15857a, vVar);
        } else if (x02 instanceof l8.t) {
            List<Pair<h9.e, y9.v>> a10 = x02.a();
            ArrayList arrayList = new ArrayList(n7.l.Z1(a10, 10));
            Iterator<T> it = a10.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                h9.e eVar = (h9.e) pair.f12962i;
                y9.v vVar2 = (y9.v) ((ba.g) pair.f12963j);
                if (vVar2 != null && !typeSubstitutor.h()) {
                    vVar2 = (y9.v) M0().k(vVar2, variance);
                }
                arrayList.add(new Pair(eVar, vVar2));
            }
            return new l8.t(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // l8.b
    public final MemberScope y(kotlin.reflect.jvm.internal.impl.types.q qVar) {
        if (qVar == null) {
            z0(10);
            throw null;
        }
        MemberScope K = K(qVar, DescriptorUtilsKt.i(k9.d.d(this)));
        if (K != null) {
            return K;
        }
        z0(11);
        throw null;
    }
}
