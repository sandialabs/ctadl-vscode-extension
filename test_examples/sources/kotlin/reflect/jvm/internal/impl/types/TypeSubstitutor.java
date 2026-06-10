package kotlin.reflect.jvm.internal.impl.types;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import l8.i0;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.j0;
import y9.k0;
import y9.l0;
import y9.m0;
import y9.u;
import y9.v;
import y9.y;

/* loaded from: classes.dex */
public final class TypeSubstitutor {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeSubstitutor f14961b = d(q.f15072a);

    /* renamed from: a  reason: collision with root package name */
    public final q f14962a;

    /* loaded from: classes.dex */
    public static final class SubstitutionException extends Exception {
        public SubstitutionException() {
            super("Out-projection in in-position");
        }
    }

    /* loaded from: classes.dex */
    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public TypeSubstitutor(q qVar) {
        if (qVar != null) {
            this.f14962a = qVar;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        i11 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[0] = "first";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case ma.i.f16046m /* 9 */:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case ma.i.f16047o /* 10 */:
                    case ma.i.f16049q /* 15 */:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i10 != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i10 == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i10 == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i10 != 34) {
                    if (i10 != 37) {
                        switch (i10) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i10) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    case ma.i.f16046m /* 9 */:
                    case ma.i.f16047o /* 10 */:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case ma.i.f16049q /* 15 */:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                    switch (i10) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i10) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i10) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            switch (i10) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 1) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 1) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 1) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 1) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 1) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 1) {
        }
        throw new IllegalStateException(format222);
    }

    public static Variance b(Variance variance, Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        } else if (variance2 == null) {
            a(39);
            throw null;
        } else {
            Variance variance3 = Variance.INVARIANT;
            if (variance == variance3) {
                if (variance2 != null) {
                    return variance2;
                }
                a(40);
                throw null;
            } else if (variance2 == variance3) {
                if (variance != null) {
                    return variance;
                }
                a(41);
                throw null;
            } else if (variance == variance2) {
                if (variance2 != null) {
                    return variance2;
                }
                a(42);
                throw null;
            } else {
                throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
            }
        }
    }

    public static VarianceConflictType c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        Variance variance4 = Variance.OUT_VARIANCE;
        return (variance == variance3 && variance2 == variance4) ? VarianceConflictType.OUT_IN_IN_POSITION : (variance == variance4 && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    public static TypeSubstitutor d(q qVar) {
        if (qVar != null) {
            return new TypeSubstitutor(qVar);
        }
        a(0);
        throw null;
    }

    public static TypeSubstitutor e(y9.r rVar) {
        if (rVar != null) {
            return d(o.f15066b.b(rVar.U0(), rVar.S0()));
        }
        a(6);
        throw null;
    }

    public static TypeSubstitutor f(q qVar, q qVar2) {
        if (qVar != null) {
            if (qVar2 != null) {
                int i10 = y9.k.f18954d;
                if (qVar.e()) {
                    qVar = qVar2;
                } else if (!qVar2.e()) {
                    qVar = new y9.k(qVar, qVar2);
                }
                return d(qVar);
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (a1.b.m0(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final q g() {
        q qVar = this.f14962a;
        if (qVar != null) {
            return qVar;
        }
        a(8);
        throw null;
    }

    public final boolean h() {
        return this.f14962a.e();
    }

    public final y9.r i(y9.r rVar, Variance variance) {
        if (rVar == null) {
            a(9);
            throw null;
        } else if (h()) {
            return rVar;
        } else {
            try {
                y9.r b5 = l(new h0(rVar, variance), null, 0).b();
                if (b5 != null) {
                    return b5;
                }
                a(12);
                throw null;
            } catch (SubstitutionException e10) {
                return aa.h.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            }
        }
    }

    public final y9.r k(y9.r rVar, Variance variance) {
        if (rVar != null) {
            if (variance != null) {
                f0 h0Var = new h0(g().f(rVar, variance), variance);
                if (!h()) {
                    try {
                        h0Var = l(h0Var, null, 0);
                    } catch (SubstitutionException unused) {
                        h0Var = null;
                    }
                }
                q qVar = this.f14962a;
                if (qVar.a() || qVar.b()) {
                    h0Var = CapturedTypeApproximationKt.b(h0Var, qVar.b());
                }
                if (h0Var == null) {
                    return null;
                }
                return h0Var.b();
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    public final f0 l(f0 f0Var, i0 i0Var, int i10) {
        y9.a aVar;
        v vVar;
        TypeSubstitutor typeSubstitutor;
        y9.f fVar;
        y9.r k3;
        y9.f fVar2;
        boolean z10;
        TypeSubstitutor typeSubstitutor2 = this;
        y9.r rVar = null;
        if (f0Var != null) {
            q qVar = typeSubstitutor2.f14962a;
            if (i10 <= 100) {
                if (f0Var.d()) {
                    return f0Var;
                }
                y9.r b5 = f0Var.b();
                if (b5 instanceof l0) {
                    l0 l0Var = (l0) b5;
                    m0 M0 = l0Var.M0();
                    y9.r c0 = l0Var.c0();
                    f0 l2 = typeSubstitutor2.l(new h0(M0, f0Var.a()), i0Var, i10 + 1);
                    if (l2.d()) {
                        return l2;
                    }
                    return new h0(a1.b.M0(l2.b().X0(), typeSubstitutor2.k(c0, f0Var.a())), l2.a());
                }
                if (!f.a(b5) && !(b5.X0() instanceof u)) {
                    f0 d5 = qVar.d(b5);
                    if (d5 != null) {
                        if (b5.getAnnotations().i(g.a.f13382y)) {
                            e0 U0 = d5.b().U0();
                            if (U0 instanceof NewCapturedTypeConstructor) {
                                f0 f0Var2 = ((NewCapturedTypeConstructor) U0).f14980a;
                                Variance a10 = f0Var2.a();
                                VarianceConflictType c = c(f0Var.a(), a10);
                                VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
                                if (c == varianceConflictType) {
                                    d5 = new h0(f0Var2.b());
                                } else if (i0Var != null && c(i0Var.t(), a10) == varianceConflictType) {
                                    d5 = new h0(f0Var2.b());
                                }
                            }
                        }
                    } else {
                        d5 = null;
                    }
                    Variance a11 = f0Var.a();
                    int i11 = 0;
                    if (d5 == null && a1.b.k0(b5)) {
                        m0 X0 = b5.X0();
                        if (X0 instanceof y9.f) {
                            fVar2 = (y9.f) X0;
                        } else {
                            fVar2 = null;
                        }
                        if (fVar2 != null) {
                            z10 = fVar2.z0();
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            y9.n l4 = a1.b.l(b5);
                            v vVar2 = l4.f18958j;
                            int i12 = i10 + 1;
                            f0 l7 = typeSubstitutor2.l(new h0(vVar2, a11), i0Var, i12);
                            v vVar3 = l4.f18959k;
                            f0 l10 = typeSubstitutor2.l(new h0(vVar3, a11), i0Var, i12);
                            Variance a12 = l7.a();
                            if (l7.b() == vVar2 && l10.b() == vVar3) {
                                return f0Var;
                            }
                            return new h0(KotlinTypeFactory.c(j0.a(l7.b()), j0.a(l10.b())), a12);
                        }
                    }
                    if (!kotlin.reflect.jvm.internal.impl.builtins.e.F(b5) && !m0.b.D0(b5)) {
                        if (d5 != null) {
                            VarianceConflictType c10 = c(a11, d5.a());
                            if (!(b5.U0() instanceof l9.b)) {
                                int ordinal = c10.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        throw new SubstitutionException();
                                    }
                                } else {
                                    return new h0(b5.U0().u().p(), Variance.OUT_VARIANCE);
                                }
                            }
                            m0 X02 = b5.X0();
                            if (X02 instanceof y9.f) {
                                fVar = (y9.f) X02;
                            } else {
                                fVar = null;
                            }
                            if (fVar == null || !fVar.z0()) {
                                fVar = null;
                            }
                            if (d5.d()) {
                                return d5;
                            }
                            if (fVar != null) {
                                k3 = fVar.K(d5.b());
                            } else {
                                k3 = r.k(d5.b(), b5.V0());
                            }
                            if (!b5.getAnnotations().isEmpty()) {
                                m8.e c11 = qVar.c(b5.getAnnotations());
                                if (c11 != null) {
                                    if (c11.i(g.a.f13382y)) {
                                        c11 = new m8.g(c11, new k0());
                                    }
                                    k3 = TypeUtilsKt.l(k3, new CompositeAnnotations(kotlin.collections.b.w2(new m8.e[]{k3.getAnnotations(), c11})));
                                } else {
                                    a(33);
                                    throw null;
                                }
                            }
                            if (c10 == VarianceConflictType.NO_CONFLICT) {
                                a11 = b(a11, d5.a());
                            }
                            return new h0(k3, a11);
                        }
                        y9.r b10 = f0Var.b();
                        Variance a13 = f0Var.a();
                        if (b10.U0().c() instanceof i0) {
                            return f0Var;
                        }
                        m0 X03 = b10.X0();
                        if (X03 instanceof y9.a) {
                            aVar = (y9.a) X03;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            vVar = aVar.f18941k;
                        } else {
                            vVar = null;
                        }
                        Variance variance = Variance.INVARIANT;
                        if (vVar != null) {
                            if ((qVar instanceof y9.q) && qVar.b()) {
                                y9.q qVar2 = (y9.q) qVar;
                                typeSubstitutor = new TypeSubstitutor(new y9.q(qVar2.f18962b, qVar2.c, false));
                                rVar = typeSubstitutor.k(vVar, variance);
                            }
                            typeSubstitutor = typeSubstitutor2;
                            rVar = typeSubstitutor.k(vVar, variance);
                        }
                        List<i0> e10 = b10.U0().e();
                        List<f0> S0 = b10.S0();
                        ArrayList arrayList = new ArrayList(e10.size());
                        boolean z11 = false;
                        while (i11 < e10.size()) {
                            i0 i0Var2 = e10.get(i11);
                            f0 f0Var3 = S0.get(i11);
                            f0 l11 = typeSubstitutor2.l(f0Var3, i0Var2, i10 + 1);
                            int ordinal2 = c(i0Var2.t(), l11.a()).ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1 && ordinal2 != 2) {
                                }
                                l11 = r.m(i0Var2);
                            } else if (i0Var2.t() != variance && !l11.d()) {
                                l11 = new h0(l11.b(), variance);
                            }
                            if (l11 != f0Var3) {
                                z11 = true;
                            }
                            arrayList.add(l11);
                            i11++;
                            typeSubstitutor2 = this;
                        }
                        if (z11) {
                            S0 = arrayList;
                        }
                        m8.e c12 = qVar.c(b10.getAnnotations());
                        v7.g.f(S0, "newArguments");
                        v7.g.f(c12, "newAnnotations");
                        y9.r c13 = j0.c(b10, S0, c12, 4);
                        if ((c13 instanceof v) && (rVar instanceof v)) {
                            c13 = y.c((v) c13, (v) rVar);
                        }
                        return new h0(c13, a13);
                    }
                }
                return f0Var;
            }
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + j(f0Var) + "; substitution: " + j(qVar));
        }
        a(18);
        throw null;
    }
}
