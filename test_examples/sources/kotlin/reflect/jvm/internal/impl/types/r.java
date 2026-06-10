package kotlin.reflect.jvm.internal.impl.types;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.i0;
import y9.e0;
import y9.f0;
import y9.g0;
import y9.h0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final aa.f f15073a = aa.h.c(ErrorTypeKind.DONT_CARE, new String[0]);

    /* renamed from: b  reason: collision with root package name */
    public static final aa.f f15074b = aa.h.c(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final a c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d  reason: collision with root package name */
    public static final a f15075d = new a("UNIT_EXPECTED_TYPE");

    /* loaded from: classes.dex */
    public static class a extends y9.i {

        /* renamed from: j  reason: collision with root package name */
        public final String f15076j;

        public a(String str) {
            this.f15076j = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void g1(int i10) {
            String format;
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[0] = "delegate";
                } else if (i10 == 3) {
                    objArr[0] = "kotlinTypeRefiner";
                } else if (i10 != 4) {
                    objArr[0] = "newAttributes";
                }
                if (i10 != 1) {
                    objArr[1] = "toString";
                } else if (i10 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        objArr[2] = "replaceDelegate";
                    } else if (i10 == 3) {
                        objArr[2] = "refine";
                    } else if (i10 != 4) {
                        objArr[2] = "replaceAttributes";
                    }
                }
                format = String.format(str, objArr);
                if (i10 == 1 && i10 != 4) {
                    throw new IllegalArgumentException(format);
                }
                throw new IllegalStateException(format);
            }
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i10 != 1) {
            }
            if (i10 != 1) {
            }
            format = String.format(str, objArr);
            if (i10 == 1) {
            }
            throw new IllegalStateException(format);
        }

        @Override // y9.i, y9.r
        public final y9.r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            if (eVar != null) {
                return this;
            }
            g1(3);
            throw null;
        }

        @Override // y9.v, y9.m0
        public final /* bridge */ /* synthetic */ m0 Y0(boolean z10) {
            b1(z10);
            throw null;
        }

        @Override // y9.i, y9.m0
        public final m0 Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            if (eVar != null) {
                return this;
            }
            g1(3);
            throw null;
        }

        @Override // y9.v, y9.m0
        public final /* bridge */ /* synthetic */ m0 a1(l lVar) {
            c1(lVar);
            throw null;
        }

        @Override // y9.v
        public final v b1(boolean z10) {
            throw new IllegalStateException(this.f15076j);
        }

        @Override // y9.v
        public final v c1(l lVar) {
            if (lVar == null) {
                g1(0);
                throw null;
            }
            throw new IllegalStateException(this.f15076j);
        }

        @Override // y9.i
        public final v d1() {
            throw new IllegalStateException(this.f15076j);
        }

        @Override // y9.i
        public final v e1(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            if (eVar != null) {
                return this;
            }
            g1(3);
            throw null;
        }

        @Override // y9.i
        public final y9.i f1(v vVar) {
            throw new IllegalStateException(this.f15076j);
        }

        @Override // y9.v
        public final String toString() {
            String str = this.f15076j;
            if (str != null) {
                return str;
            }
            g1(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case ma.i.f16046m /* 9 */:
                    case 11:
                    case ma.i.f16049q /* 15 */:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case ma.i.f16047o /* 10 */:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case 31:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case 37:
                        objArr[0] = "b";
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case 44:
                        objArr[0] = "isSpecialType";
                        break;
                    case 45:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i10 == 4) {
                    if (i10 != 9) {
                        if (i10 == 11 || i10 == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i10 == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i10 == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i10 == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i10 == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i10 != 48) {
                            if (i10 != 53) {
                                if (i10 != 6 && i10 != 7) {
                                    switch (i10) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i10) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "makeNotNullable";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case ma.i.f16046m /* 9 */:
                    case 11:
                    case ma.i.f16049q /* 15 */:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case ma.i.f16047o /* 10 */:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case 31:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case 37:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case 44:
                        objArr[2] = "contains";
                        break;
                    case 45:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
                    switch (i10) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 4) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 4) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 4) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 == 4) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 == 4) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(y9.r rVar) {
        if (rVar == null) {
            a(28);
            throw null;
        } else if (rVar.V0()) {
            return true;
        } else {
            return a1.b.k0(rVar) && b(a1.b.l(rVar).f18959k);
        }
    }

    public static boolean c(y9.r rVar, u7.l<m0, Boolean> lVar) {
        if (lVar != null) {
            return d(rVar, lVar, null);
        }
        a(43);
        throw null;
    }

    public static boolean d(y9.r rVar, u7.l<m0, Boolean> lVar, fa.d<y9.r> dVar) {
        y9.n nVar = null;
        if (lVar != null) {
            if (rVar == null) {
                return false;
            }
            m0 X0 = rVar.X0();
            if (q(rVar)) {
                return lVar.U(X0).booleanValue();
            }
            if (dVar != null && dVar.contains(rVar)) {
                return false;
            }
            if (lVar.U(X0).booleanValue()) {
                return true;
            }
            if (dVar == null) {
                dVar = new fa.d<>();
            }
            dVar.add(rVar);
            if (X0 instanceof y9.n) {
                nVar = (y9.n) X0;
            }
            if (nVar != null && (d(nVar.f18958j, lVar, dVar) || d(nVar.f18959k, lVar, dVar))) {
                return true;
            }
            if ((X0 instanceof y9.g) && d(((y9.g) X0).f18947j, lVar, dVar)) {
                return true;
            }
            e0 U0 = rVar.U0();
            if (U0 instanceof IntersectionTypeConstructor) {
                for (y9.r rVar2 : ((IntersectionTypeConstructor) U0).f14942b) {
                    if (d(rVar2, lVar, dVar)) {
                        return true;
                    }
                }
                return false;
            }
            for (f0 f0Var : rVar.S0()) {
                if (!f0Var.d()) {
                    if (d(f0Var.b(), lVar, dVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        a(44);
        throw null;
    }

    public static List<f0> e(List<i0> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (i0 i0Var : list) {
            arrayList.add(new h0(i0Var.r()));
        }
        List<f0> L2 = kotlin.collections.c.L2(arrayList);
        if (L2 != null) {
            return L2;
        }
        a(17);
        throw null;
    }

    public static boolean f(y9.r rVar) {
        y9.r rVar2;
        if (rVar != null) {
            if (rVar.U0().c() instanceof l8.b) {
                return false;
            }
            TypeSubstitutor e10 = TypeSubstitutor.e(rVar);
            Collection<y9.r> f10 = rVar.U0().f();
            ArrayList arrayList = new ArrayList(f10.size());
            for (y9.r rVar3 : f10) {
                if (rVar3 != null) {
                    y9.r k3 = e10.k(rVar3, Variance.INVARIANT);
                    if (k3 != null) {
                        rVar2 = k(k3, rVar.V0());
                    } else {
                        rVar2 = null;
                    }
                    if (rVar2 != null) {
                        arrayList.add(rVar2);
                    }
                } else {
                    a(21);
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (g((y9.r) it.next())) {
                    return true;
                }
            }
            return false;
        }
        a(29);
        throw null;
    }

    public static boolean g(y9.r rVar) {
        if (rVar != null) {
            if (rVar.V0()) {
                return true;
            }
            if (a1.b.k0(rVar) && g(a1.b.l(rVar).f18959k)) {
                return true;
            }
            if (rVar.X0() instanceof y9.g) {
                return false;
            }
            if (h(rVar)) {
                return f(rVar);
            }
            if (rVar instanceof b) {
                i0 d5 = ((b) rVar).f14975j.d();
                if (d5 == null || f(d5.r())) {
                    return true;
                }
                return false;
            }
            e0 U0 = rVar.U0();
            if (U0 instanceof IntersectionTypeConstructor) {
                for (y9.r rVar2 : U0.f()) {
                    if (g(rVar2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        a(27);
        throw null;
    }

    public static boolean h(y9.r rVar) {
        i0 i0Var = null;
        if (rVar != null) {
            if (rVar != null) {
                if (rVar.U0().c() instanceof i0) {
                    i0Var = (i0) rVar.U0().c();
                }
                if (i0Var == null && !(rVar.U0() instanceof z9.c)) {
                    return false;
                }
                return true;
            }
            a(63);
            throw null;
        }
        a(60);
        throw null;
    }

    public static m0 i(y9.r rVar) {
        if (rVar != null) {
            return j(rVar, false);
        }
        a(2);
        throw null;
    }

    public static m0 j(y9.r rVar, boolean z10) {
        if (rVar == null) {
            a(3);
            throw null;
        }
        m0 Y0 = rVar.X0().Y0(z10);
        if (Y0 != null) {
            return Y0;
        }
        a(4);
        throw null;
    }

    public static y9.r k(y9.r rVar, boolean z10) {
        if (rVar != null) {
            if (z10) {
                return j(rVar, true);
            }
            return rVar;
        }
        a(8);
        throw null;
    }

    public static v l(v vVar, boolean z10) {
        if (vVar == null) {
            a(5);
            throw null;
        } else if (!z10) {
            if (vVar != null) {
                return vVar;
            }
            a(7);
            throw null;
        } else {
            v Y0 = vVar.Y0(true);
            if (Y0 != null) {
                return Y0;
            }
            a(6);
            throw null;
        }
    }

    public static StarProjectionImpl m(i0 i0Var) {
        if (i0Var != null) {
            return new StarProjectionImpl(i0Var);
        }
        a(45);
        throw null;
    }

    public static g0 n(i0 i0Var, y9.m mVar) {
        if (i0Var != null) {
            return mVar.b() == TypeUsage.SUPERTYPE ? new h0(v8.b.H(i0Var)) : new StarProjectionImpl(i0Var);
        }
        a(46);
        throw null;
    }

    public static v o(l8.e eVar, MemberScope memberScope, u7.l lVar) {
        return aa.h.f(eVar) ? aa.h.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, eVar.toString()) : p(eVar.o(), memberScope, lVar);
    }

    public static v p(e0 e0Var, MemberScope memberScope, u7.l<kotlin.reflect.jvm.internal.impl.types.checker.e, v> lVar) {
        if (e0Var != null) {
            if (memberScope != null) {
                if (lVar != null) {
                    List<f0> e10 = e(e0Var.e());
                    l.f15045j.getClass();
                    return KotlinTypeFactory.h(l.f15046k, e0Var, e10, false, memberScope, lVar);
                }
                a(14);
                throw null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static boolean q(y9.r rVar) {
        if (rVar != null) {
            return rVar == c || rVar == f15075d;
        }
        a(0);
        throw null;
    }
}
