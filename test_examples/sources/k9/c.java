package k9;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import l8.d0;
import l8.l;
import l8.z;
import m8.e;
import o8.c0;
import o8.e0;
import o8.f0;
import o8.g0;
import y9.h0;
import y9.r;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a extends o8.j {
        public a(DeserializedClassDescriptor deserializedClassDescriptor) {
            super(deserializedClassDescriptor, null, e.a.f16014a, true, CallableMemberDescriptor.Kind.DECLARATION, d0.f15835a);
            l8.m mVar;
            List emptyList = Collections.emptyList();
            int i10 = d.f12940a;
            ClassKind classKind = ClassKind.f13433k;
            ClassKind classKind2 = deserializedClassDescriptor.f14830s;
            if (classKind2 != classKind && !classKind2.a()) {
                if (d.q(deserializedClassDescriptor)) {
                    mVar = l8.l.f15839a;
                    if (mVar == null) {
                        d.a(51);
                        throw null;
                    }
                } else if (d.k(deserializedClassDescriptor)) {
                    mVar = l8.l.f15849l;
                    if (mVar == null) {
                        d.a(52);
                        throw null;
                    }
                } else {
                    mVar = l8.l.f15842e;
                    if (mVar == null) {
                        d.a(53);
                        throw null;
                    }
                }
                d1(emptyList, mVar);
            }
            mVar = l8.l.f15839a;
            if (mVar == null) {
                d.a(49);
                throw null;
            }
            d1(emptyList, mVar);
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case 5:
            case ma.i.f16046m /* 9 */:
                objArr[0] = "parameterAnnotations";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f0 b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, r rVar, h9.e eVar, m8.e eVar2) {
        if (eVar2 == null) {
            a(33);
            throw null;
        } else if (rVar == null) {
            return null;
        } else {
            return new f0(aVar, new s9.c(aVar, rVar, eVar, null), eVar2);
        }
    }

    public static o8.d0 c(z zVar, m8.e eVar) {
        return i(zVar, eVar, true, zVar.j());
    }

    public static e0 d(z zVar, m8.e eVar) {
        e.a.C0187a c0187a = e.a.f16014a;
        d0 j2 = zVar.j();
        if (j2 != null) {
            return j(zVar, eVar, c0187a, true, zVar.g(), j2);
        }
        a(6);
        throw null;
    }

    public static c0 e(l8.b bVar) {
        if (bVar != null) {
            l8.b a10 = FindClassInModuleKt.a(d.d(bVar), h9.h.f11599u);
            if (a10 == null) {
                return null;
            }
            e.a.C0187a c0187a = e.a.f16014a;
            Modality modality = Modality.FINAL;
            l.h hVar = l8.l.f15842e;
            h9.e eVar = kotlin.reflect.jvm.internal.impl.builtins.g.f13346b;
            CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
            c0 T0 = c0.T0(bVar, modality, hVar, false, eVar, kind, bVar.j());
            o8.d0 d0Var = new o8.d0(T0, c0187a, modality, hVar, false, false, false, kind, null, bVar.j());
            T0.W0(d0Var, null, null, null);
            kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
            kotlin.reflect.jvm.internal.impl.types.l lVar = kotlin.reflect.jvm.internal.impl.types.l.f15046k;
            y9.e0 o10 = a10.o();
            List singletonList = Collections.singletonList(new h0(bVar.r()));
            int i10 = KotlinTypeFactory.f14947a;
            v7.g.f(lVar, "attributes");
            v7.g.f(o10, "constructor");
            v7.g.f(singletonList, "arguments");
            T0.Y0(KotlinTypeFactory.f(lVar, o10, singletonList, false, null), Collections.emptyList(), null, null, Collections.emptyList());
            d0Var.U0(T0.k());
            return T0;
        }
        a(26);
        throw null;
    }

    public static g0 f(l8.b bVar) {
        if (bVar == null) {
            a(24);
            throw null;
        }
        e.a.C0187a c0187a = e.a.f16014a;
        g0 c12 = g0.c1(bVar, kotlin.reflect.jvm.internal.impl.builtins.g.c, CallableMemberDescriptor.Kind.SYNTHESIZED, bVar.j());
        return c12.V0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(c12, null, 0, c0187a, h9.e.k("value"), DescriptorUtilsKt.e(bVar).v(), false, false, false, null, bVar.j())), bVar.r(), Modality.FINAL, l8.l.f15842e);
    }

    public static g0 g(l8.b bVar) {
        if (bVar != null) {
            return g0.c1(bVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13345a, CallableMemberDescriptor.Kind.SYNTHESIZED, bVar.j()).V0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.e(bVar).i(bVar.r()), Modality.FINAL, l8.l.f15842e);
        }
        a(22);
        throw null;
    }

    public static f0 h(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, r rVar, m8.e eVar) {
        if (aVar == null) {
            a(30);
            throw null;
        } else if (rVar == null) {
            return null;
        } else {
            return new f0(aVar, new s9.d(aVar, rVar, null), eVar);
        }
    }

    public static o8.d0 i(z zVar, m8.e eVar, boolean z10, d0 d0Var) {
        if (eVar == null) {
            a(18);
            throw null;
        } else if (d0Var != null) {
            return new o8.d0(zVar, eVar, zVar.p(), zVar.g(), z10, false, false, CallableMemberDescriptor.Kind.DECLARATION, null, d0Var);
        } else {
            a(19);
            throw null;
        }
    }

    public static e0 j(z zVar, m8.e eVar, m8.e eVar2, boolean z10, l8.m mVar, d0 d0Var) {
        if (eVar != null) {
            if (eVar2 != null) {
                if (mVar != null) {
                    if (d0Var != null) {
                        e0 e0Var = new e0(zVar, eVar, zVar.p(), mVar, z10, false, false, CallableMemberDescriptor.Kind.DECLARATION, null, d0Var);
                        e0Var.f16417u = e0.T0(e0Var, zVar.b(), eVar2);
                        return e0Var;
                    }
                    a(11);
                    throw null;
                }
                a(10);
                throw null;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean k(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar.h() == CallableMemberDescriptor.Kind.SYNTHESIZED && d.n(eVar.c(), ClassKind.f13433k)) {
            return true;
        }
        return false;
    }
}
