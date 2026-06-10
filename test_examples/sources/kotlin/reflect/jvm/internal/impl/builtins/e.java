package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.b0;
import l8.s;
import l8.u;
import l8.z;
import m8.e;
import ma.i;
import n8.a;
import n8.c;
import o8.d0;
import x9.h;
import y9.e0;
import y9.h0;
import y9.m0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: e  reason: collision with root package name */
    public static final h9.e f13324e = h9.e.m("<built-ins module>");

    /* renamed from: a  reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.c f13325a;

    /* renamed from: b  reason: collision with root package name */
    public final x9.e<a> f13326b;
    public final x9.c<h9.e, l8.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final h f13327d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<PrimitiveType, v> f13328a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<r, v> f13329b;
        public final Map<v, v> c;

        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.f13328a = enumMap;
            this.f13329b = hashMap;
            this.c = hashMap2;
        }
    }

    public e(LockBasedStorageManager lockBasedStorageManager) {
        this.f13327d = lockBasedStorageManager;
        lockBasedStorageManager.a(new i8.c(this));
        this.f13326b = lockBasedStorageManager.a(new d(this));
        this.c = lockBasedStorageManager.e(new i8.d(this));
    }

    public static boolean A(l8.f fVar) {
        if (fVar != null) {
            return k9.d.i(fVar, i8.a.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(r rVar, h9.d dVar) {
        if (rVar == null) {
            a(97);
            throw null;
        } else if (dVar != null) {
            return K(rVar.U0(), dVar);
        } else {
            a(98);
            throw null;
        }
    }

    public static boolean C(r rVar, h9.d dVar) {
        if (dVar != null) {
            return B(rVar, dVar) && !rVar.V0();
        }
        a(135);
        throw null;
    }

    public static boolean D(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar.a().getAnnotations().i(g.a.f13371m)) {
            return true;
        }
        if (eVar instanceof z) {
            z zVar = (z) eVar;
            boolean M = zVar.M();
            d0 s10 = zVar.s();
            b0 l2 = zVar.l();
            if (s10 != null && D(s10)) {
                if (!M) {
                    return true;
                }
                if (l2 != null && D(l2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean E(r rVar, h9.d dVar) {
        if (dVar != null) {
            return !rVar.V0() && B(rVar, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(r rVar) {
        if (rVar != null) {
            if (rVar != null) {
                if (B(rVar, g.a.f13360b) && !kotlin.reflect.jvm.internal.impl.types.r.g(rVar)) {
                    return true;
                }
                return false;
            }
            a(138);
            throw null;
        }
        a(136);
        throw null;
    }

    public static boolean G(r rVar) {
        l8.d c = rVar.U0().c();
        return (c == null || s(c) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(r rVar) {
        boolean z10;
        boolean z11;
        if (rVar != null) {
            if (rVar.V0()) {
                return false;
            }
            l8.d c = rVar.U0().c();
            if (c instanceof l8.b) {
                l8.b bVar = (l8.b) c;
                if (bVar != null) {
                    if (u(bVar) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        if (z10) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    a(96);
                    throw null;
                }
            }
            z10 = false;
            if (z10) {
            }
        } else {
            a(94);
            throw null;
        }
    }

    public static boolean I(l8.b bVar) {
        if (bVar == null) {
            a(107);
            throw null;
        }
        if (!c(bVar, g.a.f13358a) && !c(bVar, g.a.f13360b)) {
            return false;
        }
        return true;
    }

    public static boolean J(r rVar) {
        return E(rVar, g.a.f13364f);
    }

    public static boolean K(e0 e0Var, h9.d dVar) {
        if (e0Var == null) {
            a(101);
            throw null;
        } else if (dVar != null) {
            l8.d c = e0Var.c();
            return (c instanceof l8.b) && c(c, dVar);
        } else {
            a(102);
            throw null;
        }
    }

    public static boolean L(l8.f fVar) {
        if (fVar == null) {
            a(10);
            throw null;
        }
        while (fVar != null) {
            if (fVar instanceof u) {
                return ((u) fVar).e().h(g.f13353j);
            }
            fVar = fVar.c();
        }
        return false;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case i.f16049q /* 15 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case i.f16049q /* 15 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "computation";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case i.f16049q /* 15 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case i.f16049q /* 15 */:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case i.f16049q /* 15 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case i.f16046m /* 9 */:
                objArr[2] = "isBuiltIn";
                break;
            case i.f16047o /* 10 */:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case i.f16049q /* 15 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static v b(e eVar, String str) {
        if (str != null) {
            v r3 = eVar.k(str).r();
            if (r3 != null) {
                return r3;
            }
            a(47);
            throw null;
        }
        eVar.getClass();
        a(46);
        throw null;
    }

    public static boolean c(l8.d dVar, h9.d dVar2) {
        if (dVar == null) {
            a(103);
            throw null;
        } else if (dVar2 != null) {
            return dVar.getName().equals(dVar2.g()) && dVar2.equals(k9.d.g(dVar));
        } else {
            a(104);
            throw null;
        }
    }

    public static PrimitiveType s(l8.d dVar) {
        if (dVar == null) {
            a(77);
            throw null;
        } else if (g.a.f13359a0.contains(dVar.getName())) {
            return (PrimitiveType) g.a.c0.get(k9.d.g(dVar));
        } else {
            return null;
        }
    }

    public static PrimitiveType u(l8.f fVar) {
        if (fVar == null) {
            a(76);
            throw null;
        } else if (g.a.Z.contains(fVar.getName())) {
            return (PrimitiveType) g.a.f13361b0.get(k9.d.g(fVar));
        } else {
            return null;
        }
    }

    public static boolean y(r rVar) {
        if (rVar != null) {
            return B(rVar, g.a.f13358a);
        }
        a(139);
        throw null;
    }

    public static boolean z(r rVar) {
        if (rVar != null) {
            return B(rVar, g.a.f13365g);
        }
        a(88);
        throw null;
    }

    public final void d(boolean z10) {
        h9.e eVar = f13324e;
        v7.g.f(eVar, "moduleName");
        h hVar = this.f13327d;
        v7.g.f(hVar, "storageManager");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.c(eVar, hVar, this, 48);
        this.f13325a = cVar;
        BuiltInsLoader.f13292a.getClass();
        l8.v a10 = BuiltInsLoader.Companion.f13294b.getValue().a(this.f13327d, this.f13325a, m(), q(), e(), z10);
        v7.g.f(a10, "providerForModuleContent");
        cVar.f13568p = a10;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar2 = this.f13325a;
        cVar2.M0(cVar2);
    }

    public n8.a e() {
        return a.C0194a.f16134a;
    }

    public final v f() {
        v r3 = k("Any").r();
        if (r3 != null) {
            return r3;
        }
        a(50);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r g(r rVar) {
        s e10;
        h9.b f10;
        h9.b bVar;
        l8.b a10;
        v vVar = null;
        if (rVar != null) {
            if (z(rVar)) {
                if (rVar.S0().size() == 1) {
                    r b5 = rVar.S0().get(0).b();
                    if (b5 != null) {
                        return b5;
                    }
                    a(68);
                    throw null;
                }
                throw new IllegalStateException();
            }
            m0 i10 = kotlin.reflect.jvm.internal.impl.types.r.i(rVar);
            v vVar2 = this.f13326b.k0().c.get(i10);
            if (vVar2 != null) {
                return vVar2;
            }
            int i11 = k9.d.f12940a;
            l8.d c = i10.U0().c();
            if (c == null) {
                e10 = null;
            } else {
                e10 = k9.d.e(c);
            }
            if (e10 != null) {
                l8.d c10 = i10.U0().c();
                if (c10 != null) {
                    Set<h9.e> set = i8.g.f11828a;
                    h9.e name = c10.getName();
                    v7.g.f(name, "name");
                    if (i8.g.f11831e.contains(name) && (f10 = DescriptorUtilsKt.f(c10)) != null && (bVar = i8.g.c.get(f10)) != null && (a10 = FindClassInModuleKt.a(e10, bVar)) != null) {
                        vVar = a10.r();
                    }
                }
            }
            throw new IllegalStateException("not array: " + rVar);
        }
        a(67);
        throw null;
    }

    public final v h(Variance variance, r rVar, m8.e eVar) {
        if (rVar != null) {
            return KotlinTypeFactory.e(i.Q(eVar), k("Array"), Collections.singletonList(new h0(rVar, variance)));
        }
        a(79);
        throw null;
    }

    public final v i(m0 m0Var) {
        Variance variance = Variance.INVARIANT;
        if (m0Var != null) {
            return h(variance, m0Var, e.a.f16014a);
        }
        a(83);
        throw null;
    }

    public final l8.b j(h9.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        l8.b f12 = m0.b.f1(l(), cVar);
        if (f12 != null) {
            return f12;
        }
        a(13);
        throw null;
    }

    public final l8.b k(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        l8.b bVar = (l8.b) ((LockBasedStorageManager.k) this.c).U(h9.e.k(str));
        if (bVar != null) {
            return bVar;
        }
        a(15);
        throw null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.c l() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar = this.f13325a;
        cVar.getClass();
        if (cVar != null) {
            return cVar;
        }
        a(7);
        throw null;
    }

    public Iterable<n8.b> m() {
        List singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f13327d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final v n() {
        v p10 = p();
        if (p10 != null) {
            return p10;
        }
        a(52);
        throw null;
    }

    public final v o() {
        v r3 = k("Nothing").r();
        if (r3 != null) {
            return r3;
        }
        a(48);
        throw null;
    }

    public final v p() {
        v Y0 = f().Y0(true);
        if (Y0 != null) {
            return Y0;
        }
        a(51);
        throw null;
    }

    public n8.c q() {
        return c.b.f16136a;
    }

    public final v r(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
            throw null;
        }
        v vVar = this.f13326b.k0().f13328a.get(primitiveType);
        if (vVar != null) {
            return vVar;
        }
        a(74);
        throw null;
    }

    public final v t(PrimitiveType primitiveType) {
        if (primitiveType != null) {
            if (primitiveType != null) {
                v r3 = k(primitiveType.f13305i.b()).r();
                if (r3 != null) {
                    return r3;
                }
                a(54);
                throw null;
            }
            a(16);
            throw null;
        }
        a(53);
        throw null;
    }

    public final v v() {
        v r3 = k("String").r();
        if (r3 != null) {
            return r3;
        }
        a(65);
        throw null;
    }

    public final l8.b w(int i10) {
        h9.c cVar = g.f13348e;
        l8.b j2 = j(cVar.c(h9.e.k(FunctionClassKind.f13336m.f13340j + i10)));
        if (j2 != null) {
            return j2;
        }
        a(18);
        throw null;
    }

    public final v x() {
        v r3 = k("Unit").r();
        if (r3 != null) {
            return r3;
        }
        a(64);
        throw null;
    }
}
