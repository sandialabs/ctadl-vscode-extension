package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import m8.e;

/* loaded from: classes.dex */
public class g0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b implements kotlin.reflect.jvm.internal.impl.descriptors.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar, m8.e eVar, h9.e eVar2, CallableMemberDescriptor.Kind kind, l8.d0 d0Var) {
        super(kind, fVar, gVar, d0Var, eVar, eVar2);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (eVar2 == null) {
            K(2);
            throw null;
        } else if (kind == null) {
            K(3);
            throw null;
        } else if (d0Var != null) {
        } else {
            K(4);
            throw null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case ma.i.f16046m /* 9 */:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ma.i.f16047o /* 10 */:
            case ma.i.f16049q /* 15 */:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                objArr[2] = "create";
                break;
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static g0 c1(l8.f fVar, h9.e eVar, CallableMemberDescriptor.Kind kind, l8.d0 d0Var) {
        e.a.C0187a c0187a = e.a.f16014a;
        if (fVar == null) {
            K(5);
            throw null;
        } else if (eVar == null) {
            K(7);
            throw null;
        } else if (d0Var != null) {
            return new g0(fVar, null, c0187a, eVar, kind, d0Var);
        } else {
            K(9);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, l8.d0 d0Var, m8.e eVar2, h9.e eVar3) {
        if (fVar == null) {
            K(25);
            throw null;
        } else if (kind == null) {
            K(26);
            throw null;
        } else if (eVar2 == null) {
            K(27);
            throw null;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) eVar;
            if (eVar3 == null) {
                eVar3 = getName();
            }
            return new g0(fVar, gVar, eVar2, eVar3, kind, d0Var);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: b1 */
    public kotlin.reflect.jvm.internal.impl.descriptors.g y0(l8.f fVar, Modality modality, l8.k kVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.g) super.y0(fVar, modality, kVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, o8.o
    /* renamed from: d1 */
    public final kotlin.reflect.jvm.internal.impl.descriptors.g z0() {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) super.z0();
        if (gVar != null) {
            return gVar;
        }
        K(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    /* renamed from: e1 */
    public final g0 V0(f0 f0Var, l8.c0 c0Var, List list, List list2, List list3, y9.r rVar, Modality modality, l8.m mVar) {
        if (list == null) {
            K(14);
            throw null;
        } else if (list2 == null) {
            K(15);
            throw null;
        } else if (list3 == null) {
            K(16);
            throw null;
        } else if (mVar == null) {
            K(17);
            throw null;
        } else {
            g0 f12 = f1(f0Var, c0Var, list, list2, list3, rVar, modality, mVar, null);
            if (f12 != null) {
                return f12;
            }
            K(18);
            throw null;
        }
    }

    public g0 f1(f0 f0Var, l8.c0 c0Var, List list, List list2, List list3, y9.r rVar, Modality modality, l8.m mVar, Map map) {
        if (list == null) {
            K(19);
            throw null;
        } else if (list2 == null) {
            K(20);
            throw null;
        } else if (list3 == null) {
            K(21);
            throw null;
        } else if (mVar == null) {
            K(22);
            throw null;
        } else {
            super.V0(f0Var, c0Var, list, list2, list3, rVar, modality, mVar);
            if (map != null && !map.isEmpty()) {
                this.L = new LinkedHashMap(map);
            }
            return this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g
    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v() {
        return super.v();
    }
}
