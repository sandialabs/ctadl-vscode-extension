package kotlin.reflect.jvm.internal.impl.resolve;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import k9.g;
import k9.k;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.d;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.m;
import l8.b0;
import l8.c0;
import l8.f;
import l8.i0;
import l8.j;
import l8.z;
import m7.n;
import ma.i;
import u7.l;
import u7.p;
import y9.e0;
import y9.m0;
import y9.r;

/* loaded from: classes.dex */
public final class OverridingUtil {

    /* renamed from: e  reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f14686e = c.L2(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* renamed from: f  reason: collision with root package name */
    public static final OverridingUtil f14687f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f14688g;

    /* renamed from: a  reason: collision with root package name */
    public final e f14689a;

    /* renamed from: b  reason: collision with root package name */
    public final KotlinTypePreparator f14690b;
    public final d.a c;

    /* renamed from: d  reason: collision with root package name */
    public final p<r, r, Boolean> f14691d;

    /* loaded from: classes.dex */
    public static class OverrideCompatibilityInfo {

        /* renamed from: b  reason: collision with root package name */
        public static final OverrideCompatibilityInfo f14692b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* renamed from: a  reason: collision with root package name */
        public final Result f14693a;

        /* loaded from: classes.dex */
        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            this.f14693a = result;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void a(int i10) {
            String format;
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    objArr[0] = "success";
                } else if (i10 != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i10 != 1) {
                    objArr[2] = "incompatible";
                } else if (i10 == 2) {
                    objArr[2] = "conflict";
                } else if (i10 == 3 || i10 == 4) {
                    objArr[2] = "<init>";
                }
                format = String.format(str, objArr);
                if (i10 == 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new IllegalStateException(format);
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "debugMessage";
            switch (i10) {
            }
            if (i10 != 1) {
            }
            format = String.format(str, objArr);
            if (i10 == 1) {
            }
            throw new IllegalArgumentException(format);
        }

        public static OverrideCompatibilityInfo b(String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo d(String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public final Result c() {
            Result result = this.f14693a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements d.a {
        public static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.d.a
        public final boolean a(e0 e0Var, e0 e0Var2) {
            if (e0Var == null) {
                b(0);
                throw null;
            } else if (e0Var2 != null) {
                return e0Var.equals(e0Var2);
            } else {
                b(1);
                throw null;
            }
        }
    }

    static {
        a aVar = new a();
        f14688g = aVar;
        f14687f = new OverridingUtil(aVar, e.a.f14998i, KotlinTypePreparator.a.f14979i);
    }

    public OverridingUtil(d.a aVar, e.a aVar2, KotlinTypePreparator.a aVar3) {
        if (aVar == null) {
            a(5);
            throw null;
        } else if (aVar2 == null) {
            a(6);
            throw null;
        } else if (aVar3 == null) {
            a(7);
            throw null;
        } else {
            this.c = aVar;
            this.f14689a = aVar2;
            this.f14690b = aVar3;
            this.f14691d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
            }
            if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 90:
                                            case 91:
                                            case 92:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                        i11 = 2;
                                        break;
                                }
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "customSubtype";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case i.f16046m /* 9 */:
                        objArr[0] = "candidateSet";
                        break;
                    case i.f16047o /* 10 */:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case i.f16049q /* 15 */:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 30:
                    case 40:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 31:
                    case 41:
                        objArr[0] = "subDescriptor";
                        break;
                    case 42:
                        objArr[0] = "firstParameters";
                        break;
                    case 43:
                        objArr[0] = "secondParameters";
                        break;
                    case 46:
                        objArr[0] = "typeInSuper";
                        break;
                    case 47:
                        objArr[0] = "typeInSub";
                        break;
                    case 48:
                    case 51:
                    case 77:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 49:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 52:
                        objArr[0] = "name";
                        break;
                    case 53:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 54:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 55:
                    case 61:
                    case 64:
                    case 86:
                    case 89:
                    case 96:
                        objArr[0] = "current";
                        break;
                    case 56:
                    case 62:
                    case 66:
                    case 87:
                    case 106:
                        objArr[0] = "strategy";
                        break;
                    case 57:
                        objArr[0] = "overriding";
                        break;
                    case 58:
                        objArr[0] = "fromSuper";
                        break;
                    case 59:
                        objArr[0] = "fromCurrent";
                        break;
                    case 60:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 63:
                    case 65:
                        objArr[0] = "notOverridden";
                        break;
                    case 67:
                    case 69:
                    case 73:
                        objArr[0] = "a";
                        break;
                    case 68:
                    case 70:
                    case 75:
                        objArr[0] = "b";
                        break;
                    case 71:
                        objArr[0] = "candidate";
                        break;
                    case 72:
                    case 88:
                    case 93:
                    case 109:
                        objArr[0] = "descriptors";
                        break;
                    case 74:
                        objArr[0] = "aReturnType";
                        break;
                    case 76:
                        objArr[0] = "bReturnType";
                        break;
                    case 78:
                    case 85:
                        objArr[0] = "overridables";
                        break;
                    case 79:
                    case 101:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 94:
                        objArr[0] = "classModality";
                        break;
                    case 97:
                        objArr[0] = "toFilter";
                        break;
                    case 99:
                    case 104:
                        objArr[0] = "overrider";
                        break;
                    case 100:
                    case 105:
                        objArr[0] = "extractFrom";
                        break;
                    case 102:
                        objArr[0] = "onConflict";
                        break;
                    case 107:
                    case 108:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i10 != 11 || i10 == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i10 != 16) {
                    if (i10 != 21) {
                        if (i10 == 95) {
                            objArr[1] = "getMinimalModality";
                        } else if (i10 == 98) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i10 == 103) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i10 != 44 && i10 != 45) {
                            switch (i10) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i10) {
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i10) {
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 90:
                                                        case 91:
                                                        case 92:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case i.f16046m /* 9 */:
                    case i.f16047o /* 10 */:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case i.f16049q /* 15 */:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 42:
                    case 43:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 46:
                    case 47:
                    case 48:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 49:
                    case 50:
                    case 51:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 57:
                    case 58:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 63:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 64:
                    case 65:
                    case 66:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 78:
                    case 79:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 85:
                    case 86:
                    case 87:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 88:
                    case 89:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 93:
                    case 94:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 96:
                    case 97:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 107:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 108:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 109:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                    switch (i10) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            switch (i10) {
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                    break;
                                default:
                                    switch (i10) {
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            switch (i10) {
                                                case 90:
                                                case 91:
                                                case 92:
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
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 11) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 11) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(r rVar, r rVar2, m mVar) {
        if (rVar == null) {
            a(46);
            throw null;
        } else if (rVar2 == null) {
            a(47);
            throw null;
        } else {
            if (m0.b.D0(rVar) && m0.b.D0(rVar2)) {
                return true;
            }
            return kotlin.reflect.jvm.internal.impl.types.c.e(mVar, rVar.X0(), rVar2.X0());
        }
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        boolean z10;
        if (callableMemberDescriptor != null) {
            CallableMemberDescriptor.Kind h10 = callableMemberDescriptor.h();
            h10.getClass();
            if (h10 != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(callableMemberDescriptor);
                return;
            } else if (!callableMemberDescriptor.f().isEmpty()) {
                for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.f()) {
                    c(callableMemberDescriptor2, linkedHashSet);
                }
                return;
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
            }
        }
        a(17);
        throw null;
    }

    public static ArrayList d(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        c0 R = aVar.R();
        ArrayList arrayList = new ArrayList();
        if (R != null) {
            arrayList.add(R.b());
        }
        for (h hVar : aVar.m()) {
            arrayList.add(hVar.b());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
        if (r2 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
        r1 = l8.l.f15845h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014a, code lost:
        r1 = l8.l.f15844g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014c, code lost:
        r12 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) s(r11, new k9.h())).y0(r12, r0, r1);
        r13.I0(r12, r11);
        r13.q0(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Collection collection, l8.b bVar, g gVar) {
        Modality modality;
        Modality p10;
        if (collection != null) {
            if (bVar != null) {
                ArrayList k22 = c.k2(collection, new k9.i(bVar));
                boolean isEmpty = k22.isEmpty();
                if (!isEmpty) {
                    collection = k22;
                }
                Iterator it = collection.iterator();
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    if (it.hasNext()) {
                        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                        int ordinal = callableMemberDescriptor.p().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        z12 = true;
                                    }
                                } else {
                                    z11 = true;
                                }
                            } else {
                                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
                            }
                        } else {
                            modality = Modality.FINAL;
                            break;
                        }
                    } else {
                        boolean l02 = bVar.l0();
                        Modality modality2 = Modality.ABSTRACT;
                        if (l02 && bVar.p() != modality2 && bVar.p() != Modality.SEALED) {
                            z10 = true;
                        }
                        if (z11 && !z12) {
                            modality = Modality.OPEN;
                        } else if (!z11 && z12) {
                            if (z10) {
                                modality2 = bVar.p();
                            }
                            if (modality2 != null) {
                                modality = modality2;
                            } else {
                                a(92);
                                throw null;
                            }
                        } else {
                            HashSet<CallableMemberDescriptor> hashSet = new HashSet();
                            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                                if (callableMemberDescriptor2 != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    c(callableMemberDescriptor2, linkedHashSet);
                                    hashSet.addAll(linkedHashSet);
                                } else {
                                    a(15);
                                    throw null;
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                z9.d dVar = (z9.d) DescriptorUtilsKt.j((f) hashSet.iterator().next()).k0(z9.a.f19183a);
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) next;
                                            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) it3.next();
                                            if (q(aVar, aVar2)) {
                                                it3.remove();
                                            } else if (q(aVar2, aVar)) {
                                                break;
                                            }
                                        } else {
                                            linkedHashSet2.add(next);
                                            break;
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            Modality p11 = bVar.p();
                            if (p11 != null) {
                                Modality modality3 = modality2;
                                for (CallableMemberDescriptor callableMemberDescriptor3 : hashSet) {
                                    if (z10 && callableMemberDescriptor3.p() == modality2) {
                                        p10 = p11;
                                    } else {
                                        p10 = callableMemberDescriptor3.p();
                                    }
                                    if (p10.compareTo(modality3) < 0) {
                                        modality3 = p10;
                                    }
                                }
                                if (modality3 != null) {
                                    modality = modality3;
                                } else {
                                    a(95);
                                    throw null;
                                }
                            } else {
                                a(94);
                                throw null;
                            }
                        }
                    }
                }
            } else {
                a(86);
                throw null;
            }
        } else {
            a(85);
            throw null;
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, l lVar, l lVar2) {
        if (obj == null) {
            a(99);
            throw null;
        } else if (lVar == null) {
            a(101);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.U(obj);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.U(next);
                if (obj != next) {
                    OverrideCompatibilityInfo.Result j2 = j(aVar, aVar2);
                    if (j2 == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                        arrayList.add(next);
                    } else if (j2 == OverrideCompatibilityInfo.Result.CONFLICT) {
                        lVar2.U(next);
                    }
                }
                it.remove();
            }
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OverrideCompatibilityInfo i(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z10;
        boolean z11;
        OverrideCompatibilityInfo overrideCompatibilityInfo;
        String str;
        String str2;
        if (aVar != null) {
            if (aVar2 != null) {
                boolean z12 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
                if ((z12 && !(aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) || (((z10 = aVar instanceof z)) && !(aVar2 instanceof z))) {
                    str2 = "Member kind mismatch";
                } else {
                    if (!z12 && !z10) {
                        throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
                    }
                    if (!aVar.getName().equals(aVar2.getName())) {
                        str2 = "Name mismatch";
                    } else {
                        boolean z13 = false;
                        if (aVar.R() == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (aVar2.R() == null) {
                            z13 = true;
                        }
                        if (z11 != z13) {
                            str = "Receiver presence mismatch";
                        } else if (aVar.m().size() != aVar2.m().size()) {
                            str = "Value parameter number mismatch";
                        } else {
                            overrideCompatibilityInfo = null;
                            if (overrideCompatibilityInfo != null) {
                                return null;
                            }
                            return overrideCompatibilityInfo;
                        }
                        overrideCompatibilityInfo = OverrideCompatibilityInfo.d(str);
                        if (overrideCompatibilityInfo != null) {
                        }
                    }
                }
                return OverrideCompatibilityInfo.d(str2);
            }
            a(41);
            throw null;
        }
        a(40);
        throw null;
    }

    public static OverrideCompatibilityInfo.Result j(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil overridingUtil = f14687f;
        OverrideCompatibilityInfo.Result c = overridingUtil.l(aVar2, aVar, null).c();
        OverrideCompatibilityInfo.Result c10 = overridingUtil.l(aVar, aVar2, null).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c == result && c10 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        if (c != result2 && c10 != result2) {
            return OverrideCompatibilityInfo.Result.INCOMPATIBLE;
        }
        return result2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z10;
        if (aVar != null) {
            if (aVar2 != null) {
                r k3 = aVar.k();
                r k10 = aVar2.k();
                if (!p(aVar, aVar2)) {
                    return false;
                }
                m f10 = f14687f.f(aVar.getTypeParameters(), aVar2.getTypeParameters());
                if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return o(aVar, k3, aVar2, k10, f10);
                }
                if (aVar instanceof z) {
                    z zVar = (z) aVar;
                    z zVar2 = (z) aVar2;
                    b0 l2 = zVar.l();
                    b0 l4 = zVar2.l();
                    if (l2 != null && l4 != null) {
                        z10 = p(l2, l4);
                        if (z10) {
                            return false;
                        }
                        if (zVar.M() && zVar2.M()) {
                            return kotlin.reflect.jvm.internal.impl.types.c.e(f10, k3.X0(), k10.X0());
                        }
                        if ((!zVar.M() && zVar2.M()) || !o(aVar, k3, aVar2, k10, f10)) {
                            return false;
                        }
                        return true;
                    }
                    z10 = true;
                    if (z10) {
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
                }
            } else {
                a(68);
                throw null;
            }
        } else {
            a(67);
            throw null;
        }
    }

    public static boolean o(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, r rVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, r rVar2, m mVar) {
        if (aVar != null) {
            if (rVar != null) {
                if (aVar2 != null) {
                    if (rVar2 != null) {
                        kotlin.reflect.jvm.internal.impl.types.c cVar = kotlin.reflect.jvm.internal.impl.types.c.f14978a;
                        m0 X0 = rVar.X0();
                        m0 X02 = rVar2.X0();
                        v7.g.f(X0, "subType");
                        v7.g.f(X02, "superType");
                        return kotlin.reflect.jvm.internal.impl.types.c.i(cVar, mVar, X0, X02);
                    }
                    a(76);
                    throw null;
                }
                a(75);
                throw null;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public static boolean p(j jVar, j jVar2) {
        if (jVar == null) {
            a(69);
            throw null;
        } else if (jVar2 == null) {
            a(70);
            throw null;
        } else {
            Integer b5 = l8.l.b(jVar.g(), jVar2.g());
            if (b5 != null && b5.intValue() < 0) {
                return false;
            }
            return true;
        }
    }

    public static boolean q(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar != null) {
            if (aVar2 != null) {
                boolean equals = aVar.equals(aVar2);
                b bVar = b.f14701a;
                if (!equals && bVar.a(aVar.a(), aVar2.a(), false, true)) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.a a10 = aVar2.a();
                int i10 = k9.d.f12940a;
                LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.a> linkedHashSet = new LinkedHashSet();
                k9.d.b(aVar.a(), linkedHashSet);
                for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar3 : linkedHashSet) {
                    if (bVar.a(a10, aVar3, false, true)) {
                        return true;
                    }
                }
                return false;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(CallableMemberDescriptor callableMemberDescriptor, l<CallableMemberDescriptor, n> lVar) {
        l8.m mVar;
        l8.m mVar2;
        l8.m mVar3;
        l<CallableMemberDescriptor, n> lVar2;
        if (callableMemberDescriptor != null) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.f()) {
                if (callableMemberDescriptor2.g() == l8.l.f15844g) {
                    r(callableMemberDescriptor2, lVar);
                }
            }
            if (callableMemberDescriptor.g() != l8.l.f15844g) {
                return;
            }
            Collection<? extends CallableMemberDescriptor> f10 = callableMemberDescriptor.f();
            if (f10 != null) {
                if (f10.isEmpty()) {
                    mVar2 = l8.l.f15849l;
                } else {
                    loop3: while (true) {
                        mVar = null;
                        for (CallableMemberDescriptor callableMemberDescriptor3 : f10) {
                            l8.m g10 = callableMemberDescriptor3.g();
                            if (mVar != null) {
                                Integer b5 = l8.l.b(g10, mVar);
                                if (b5 == null) {
                                    break;
                                } else if (b5.intValue() > 0) {
                                }
                            }
                            mVar = g10;
                        }
                    }
                    if (mVar != null) {
                        for (CallableMemberDescriptor callableMemberDescriptor4 : f10) {
                            Integer b10 = l8.l.b(mVar, callableMemberDescriptor4.g());
                            if (b10 != null) {
                                if (b10.intValue() < 0) {
                                }
                            }
                        }
                        mVar2 = mVar;
                    }
                    mVar2 = null;
                    break;
                }
                if (mVar2 != null) {
                    if (callableMemberDescriptor.h() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                        for (CallableMemberDescriptor callableMemberDescriptor5 : f10) {
                            if (callableMemberDescriptor5.p() == Modality.ABSTRACT || callableMemberDescriptor5.g().equals(mVar2)) {
                            }
                        }
                    } else {
                        mVar2 = mVar2.d();
                    }
                    if (mVar2 != null) {
                        if (lVar != null) {
                            lVar.U(callableMemberDescriptor);
                        }
                        mVar3 = l8.l.f15842e;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (!(callableMemberDescriptor instanceof o8.c0)) {
                        o8.c0 c0Var = (o8.c0) callableMemberDescriptor;
                        if (mVar3 != null) {
                            c0Var.f16395r = mVar3;
                            for (kotlin.reflect.jvm.internal.impl.descriptors.f fVar : ((z) callableMemberDescriptor).z()) {
                                if (mVar2 == null) {
                                    lVar2 = null;
                                } else {
                                    lVar2 = lVar;
                                }
                                r(fVar, lVar2);
                            }
                            return;
                        }
                        o8.c0.K(20);
                        throw null;
                    } else if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.b) {
                        kotlin.reflect.jvm.internal.impl.descriptors.impl.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.impl.b) callableMemberDescriptor;
                        if (mVar3 != null) {
                            bVar.f13535t = mVar3;
                            return;
                        } else {
                            kotlin.reflect.jvm.internal.impl.descriptors.impl.b.K(10);
                            throw null;
                        }
                    } else {
                        o8.b0 b0Var = (o8.b0) callableMemberDescriptor;
                        b0Var.f16392s = mVar3;
                        if (mVar3 != b0Var.C0().g()) {
                            b0Var.f16387m = false;
                            return;
                        }
                        return;
                    }
                }
                mVar2 = null;
                if (mVar2 != null) {
                }
                if (!(callableMemberDescriptor instanceof o8.c0)) {
                }
            } else {
                a(109);
                throw null;
            }
        } else {
            a(107);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H s(Collection<H> collection, l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        H h10;
        boolean z10;
        if (lVar != 0) {
            if (collection.size() == 1) {
                H h11 = (H) c.m2(collection);
                if (h11 != null) {
                    return h11;
                }
                a(80);
                throw null;
            }
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(collection, 10));
            for (H h12 : collection) {
                arrayList2.add(lVar.U(h12));
            }
            H h13 = (H) c.m2(collection);
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.U(h13);
            for (H h14 : collection) {
                kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.U(h14);
                if (aVar2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!k(aVar2, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next())) {
                                z10 = false;
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        arrayList.add(h14);
                    }
                    if (k(aVar2, aVar) && !k(aVar, aVar2)) {
                        h13 = h14;
                    }
                } else {
                    a(71);
                    throw null;
                }
            }
            if (arrayList.isEmpty()) {
                if (h13 != null) {
                    return h13;
                }
                a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H h15 = (H) c.m2(arrayList);
                if (h15 != null) {
                    return h15;
                }
                a(82);
                throw null;
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        h10 = (H) it2.next();
                        if (!a1.b.k0(((kotlin.reflect.jvm.internal.impl.descriptors.a) lVar.U(h10)).k())) {
                            break;
                        }
                    } else {
                        h10 = null;
                        break;
                    }
                }
                if (h10 != null) {
                    return h10;
                }
                H h16 = (H) c.m2(arrayList);
                if (h16 != null) {
                    return h16;
                }
                a(84);
                throw null;
            }
        }
        a(79);
        throw null;
    }

    public final m f(List<i0> list, List<i0> list2) {
        if (list != null) {
            if (list2 != null) {
                if (list.isEmpty()) {
                    k9.m mVar = new k9.m(null, this.c, this.f14689a, this.f14690b, this.f14691d);
                    p<r, r, Boolean> pVar = mVar.f12949e;
                    e eVar = mVar.c;
                    KotlinTypePreparator kotlinTypePreparator = mVar.f12948d;
                    if (pVar == null) {
                        v7.g.f(kotlinTypePreparator, "kotlinTypePreparator");
                        v7.g.f(eVar, "kotlinTypeRefiner");
                        return new m(true, true, mVar, kotlinTypePreparator, eVar);
                    }
                    return new k9.l(mVar, kotlinTypePreparator, eVar);
                }
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    hashMap.put(list.get(i10).o(), list2.get(i10).o());
                }
                k9.m mVar2 = new k9.m(hashMap, this.c, this.f14689a, this.f14690b, this.f14691d);
                p<r, r, Boolean> pVar2 = mVar2.f12949e;
                e eVar2 = mVar2.c;
                KotlinTypePreparator kotlinTypePreparator2 = mVar2.f12948d;
                if (pVar2 == null) {
                    v7.g.f(kotlinTypePreparator2, "kotlinTypePreparator");
                    v7.g.f(eVar2, "kotlinTypeRefiner");
                    return new m(true, true, mVar2, kotlinTypePreparator2, eVar2);
                }
                return new k9.l(mVar2, kotlinTypePreparator2, eVar2);
            }
            a(43);
            throw null;
        }
        a(42);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(h9.e eVar, Collection collection, Collection collection2, l8.b bVar, g gVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int ordinal;
        boolean z13;
        if (eVar != null) {
            if (collection != null) {
                if (collection2 != null) {
                    if (bVar != null) {
                        LinkedHashSet<CallableMemberDescriptor> linkedHashSet = new LinkedHashSet(collection);
                        Iterator it = collection2.iterator();
                        while (it.hasNext()) {
                            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                            if (callableMemberDescriptor != null) {
                                ArrayList arrayList = new ArrayList(collection.size());
                                fa.d dVar = new fa.d();
                                Iterator it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it2.next();
                                    OverrideCompatibilityInfo.Result c = l(callableMemberDescriptor2, callableMemberDescriptor, bVar).c();
                                    if (!l8.l.e(callableMemberDescriptor2.g())) {
                                        if (l8.l.c(l8.l.n, callableMemberDescriptor2, callableMemberDescriptor) == null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            z12 = true;
                                            ordinal = c.ordinal();
                                            if (ordinal == 0) {
                                                if (ordinal == 2) {
                                                    if (z12) {
                                                        gVar.L0(callableMemberDescriptor2, callableMemberDescriptor);
                                                    }
                                                }
                                            } else if (z12) {
                                                dVar.add(callableMemberDescriptor2);
                                            }
                                            arrayList.add(callableMemberDescriptor2);
                                        }
                                    }
                                    z12 = false;
                                    ordinal = c.ordinal();
                                    if (ordinal == 0) {
                                    }
                                    arrayList.add(callableMemberDescriptor2);
                                }
                                gVar.I0(callableMemberDescriptor, dVar);
                                linkedHashSet.removeAll(arrayList);
                            } else {
                                a(59);
                                throw null;
                            }
                        }
                        if (linkedHashSet.size() >= 2) {
                            f c10 = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).c();
                            if (!linkedHashSet.isEmpty()) {
                                for (CallableMemberDescriptor callableMemberDescriptor3 : linkedHashSet) {
                                    if (callableMemberDescriptor3.c() == c10) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!Boolean.valueOf(z10).booleanValue()) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                            for (CallableMemberDescriptor callableMemberDescriptor4 : linkedHashSet) {
                                e(Collections.singleton(callableMemberDescriptor4), bVar, gVar);
                            }
                            return;
                        }
                        LinkedList<CallableMemberDescriptor> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            CallableMemberDescriptor callableMemberDescriptor5 = null;
                            for (CallableMemberDescriptor callableMemberDescriptor6 : linkedList) {
                                if (callableMemberDescriptor5 != null) {
                                    Integer b5 = l8.l.b(callableMemberDescriptor5.g(), callableMemberDescriptor6.g());
                                    if (b5 != null && b5.intValue() < 0) {
                                    }
                                }
                                callableMemberDescriptor5 = callableMemberDescriptor6;
                            }
                            v7.g.c(callableMemberDescriptor5);
                            e(g(callableMemberDescriptor5, linkedList, new k9.j(), new k(gVar, callableMemberDescriptor5)), bVar, gVar);
                        }
                        return;
                    }
                    a(55);
                    throw null;
                }
                a(54);
                throw null;
            }
            a(53);
            throw null;
        }
        a(52);
        throw null;
    }

    public final OverrideCompatibilityInfo l(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar) {
        if (aVar == null) {
            a(19);
            throw null;
        } else if (aVar2 == null) {
            a(20);
            throw null;
        } else {
            OverrideCompatibilityInfo m10 = m(aVar, aVar2, bVar, false);
            if (m10 != null) {
                return m10;
            }
            a(21);
            throw null;
        }
    }

    public final OverrideCompatibilityInfo m(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar, boolean z10) {
        boolean z11;
        if (aVar != null) {
            if (aVar2 != null) {
                OverrideCompatibilityInfo n = n(aVar, aVar2, z10);
                if (n.c() == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                List<ExternalOverridabilityCondition> list = f14686e;
                Iterator<ExternalOverridabilityCondition> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ExternalOverridabilityCondition.Contract contract = ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
                    if (hasNext) {
                        ExternalOverridabilityCondition next = it.next();
                        if (next.b() != contract && (!z11 || next.b() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                            int ordinal = next.a(aVar, aVar2, bVar).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        return OverrideCompatibilityInfo.d("External condition");
                                    }
                                } else {
                                    return OverrideCompatibilityInfo.b("External condition failed");
                                }
                            } else {
                                z11 = true;
                            }
                        }
                    } else if (!z11) {
                        return n;
                    } else {
                        for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                            if (externalOverridabilityCondition.b() == contract) {
                                int ordinal2 = externalOverridabilityCondition.a(aVar, aVar2, bVar).ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 == 2) {
                                            return OverrideCompatibilityInfo.d("External condition");
                                        }
                                    } else {
                                        return OverrideCompatibilityInfo.b("External condition failed");
                                    }
                                } else {
                                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition.getClass().getName() + " condition. It's not supposed to end with success");
                                }
                            }
                        }
                        OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f14692b;
                        if (overrideCompatibilityInfo != null) {
                            return overrideCompatibilityInfo;
                        }
                        OverrideCompatibilityInfo.a(0);
                        throw null;
                    }
                }
            } else {
                a(23);
                throw null;
            }
        } else {
            a(22);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        r15.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[LOOP:1: B:20:0x005b->B:42:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OverrideCompatibilityInfo n(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z10) {
        boolean z11;
        boolean z12;
        if (aVar != null) {
            if (aVar2 != null) {
                OverrideCompatibilityInfo i10 = i(aVar, aVar2);
                if (i10 != null) {
                    return i10;
                }
                ArrayList d5 = d(aVar);
                ArrayList d10 = d(aVar2);
                List<i0> typeParameters = aVar.getTypeParameters();
                List<i0> typeParameters2 = aVar2.getTypeParameters();
                if (typeParameters.size() != typeParameters2.size()) {
                    for (int i11 = 0; i11 < d5.size(); i11++) {
                        if (!d.f14997a.c((r) d5.get(i11), (r) d10.get(i11))) {
                            return OverrideCompatibilityInfo.d("Type parameter number mismatch");
                        }
                    }
                    return OverrideCompatibilityInfo.b("Type parameter number mismatch");
                }
                m f10 = f(typeParameters, typeParameters2);
                for (int i12 = 0; i12 < typeParameters.size(); i12++) {
                    i0 i0Var = typeParameters.get(i12);
                    i0 i0Var2 = typeParameters2.get(i12);
                    if (i0Var != null) {
                        if (i0Var2 != null) {
                            List<r> upperBounds = i0Var.getUpperBounds();
                            ArrayList arrayList = new ArrayList(i0Var2.getUpperBounds());
                            if (upperBounds.size() == arrayList.size()) {
                                for (r rVar : upperBounds) {
                                    ListIterator listIterator = arrayList.listIterator();
                                    while (listIterator.hasNext()) {
                                        if (b(rVar, (r) listIterator.next(), f10)) {
                                            break;
                                        }
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    return OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
                                }
                            }
                            z12 = false;
                            if (z12) {
                            }
                        } else {
                            a(50);
                            throw null;
                        }
                    } else {
                        a(49);
                        throw null;
                    }
                }
                for (int i13 = 0; i13 < d5.size(); i13++) {
                    if (!b((r) d5.get(i13), (r) d10.get(i13), f10)) {
                        return OverrideCompatibilityInfo.d("Value parameter type mismatch");
                    }
                }
                if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).r0() != ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2).r0()) {
                    return OverrideCompatibilityInfo.b("Incompatible suspendability");
                }
                if (z10) {
                    r k3 = aVar.k();
                    r k10 = aVar2.k();
                    if (k3 != null && k10 != null) {
                        if (m0.b.D0(k10) && m0.b.D0(k3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            kotlin.reflect.jvm.internal.impl.types.c cVar = kotlin.reflect.jvm.internal.impl.types.c.f14978a;
                            m0 X0 = k10.X0();
                            m0 X02 = k3.X0();
                            v7.g.f(X0, "subType");
                            v7.g.f(X02, "superType");
                            if (!kotlin.reflect.jvm.internal.impl.types.c.i(cVar, f10, X0, X02)) {
                                return OverrideCompatibilityInfo.b("Return type mismatch");
                            }
                        }
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f14692b;
                if (overrideCompatibilityInfo != null) {
                    return overrideCompatibilityInfo;
                }
                OverrideCompatibilityInfo.a(0);
                throw null;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }
}
