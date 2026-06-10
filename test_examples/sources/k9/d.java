package k9;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import l8.b0;
import l8.e0;
import l8.s;
import l8.u;
import l8.x;
import y9.e0;
import y9.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12940a = 0;

    static {
        new h9.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getFqNameSafe";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getFqNameUnsafe";
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[2] = "getFqName";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[2] = "getFqNameSafe";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, LinkedHashSet linkedHashSet) {
        if (aVar == null) {
            a(70);
            throw null;
        } else if (!linkedHashSet.contains(aVar)) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 : aVar.a().f()) {
                kotlin.reflect.jvm.internal.impl.descriptors.a a10 = aVar2.a();
                b(a10, linkedHashSet);
                linkedHashSet.add(a10);
            }
        }
    }

    public static l8.b c(r rVar) {
        if (rVar != null) {
            e0 U0 = rVar.U0();
            if (U0 != null) {
                l8.b bVar = (l8.b) U0.c();
                if (bVar != null) {
                    return bVar;
                }
                a(47);
                throw null;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static s d(l8.f fVar) {
        if (fVar == null) {
            a(21);
            throw null;
        }
        s e10 = e(fVar);
        if (e10 != null) {
            return e10;
        }
        a(22);
        throw null;
    }

    public static s e(l8.f fVar) {
        if (fVar == null) {
            a(23);
            throw null;
        }
        while (fVar != null) {
            if (fVar instanceof s) {
                return (s) fVar;
            }
            if (fVar instanceof x) {
                return ((x) fVar).o0();
            }
            fVar = fVar.c();
        }
        return null;
    }

    public static l8.e0 f(l8.f fVar) {
        if (fVar == null) {
            a(79);
            throw null;
        }
        if (fVar instanceof b0) {
            fVar = ((b0) fVar).C0();
        }
        boolean z10 = fVar instanceof l8.i;
        e0.a aVar = l8.e0.f15836a;
        if (z10) {
            ((l8.i) fVar).j().a();
        }
        return aVar;
    }

    public static h9.d g(l8.f fVar) {
        if (fVar != null) {
            h9.c h10 = h(fVar);
            if (h10 != null) {
                return h10.i();
            }
            return g(fVar.c()).b(fVar.getName());
        }
        a(2);
        throw null;
    }

    public static h9.c h(l8.f fVar) {
        if (fVar == null) {
            a(5);
            throw null;
        }
        if (!(fVar instanceof s) && !aa.h.f(fVar)) {
            if (fVar instanceof x) {
                return ((x) fVar).e();
            }
            if (fVar instanceof u) {
                return ((u) fVar).e();
            }
            return null;
        }
        return h9.c.c;
    }

    public static <D extends l8.f> D i(l8.f fVar, Class<D> cls, boolean z10) {
        if (fVar == null) {
            return null;
        }
        if (z10) {
            fVar = (D) fVar.c();
        }
        while (fVar != null) {
            if (cls.isInstance(fVar)) {
                return (D) fVar;
            }
            fVar = (D) fVar.c();
        }
        return null;
    }

    public static l8.b j(l8.b bVar) {
        if (bVar == null) {
            a(44);
            throw null;
        }
        for (r rVar : bVar.o().f()) {
            l8.b c = c(rVar);
            if (c.h() != ClassKind.f13432j) {
                return c;
            }
        }
        return null;
    }

    public static boolean k(l8.f fVar) {
        if (n(fVar, ClassKind.f13431i) && fVar.getName().equals(h9.g.f11575a)) {
            return true;
        }
        return false;
    }

    public static boolean l(l8.f fVar) {
        return n(fVar, ClassKind.n) && ((l8.b) fVar).H();
    }

    public static boolean m(l8.f fVar) {
        if (fVar != null) {
            return n(fVar, ClassKind.f13434l);
        }
        a(36);
        throw null;
    }

    public static boolean n(l8.f fVar, ClassKind classKind) {
        return (fVar instanceof l8.b) && ((l8.b) fVar).h() == classKind;
    }

    public static boolean o(l8.f fVar) {
        if (fVar != null) {
            while (true) {
                boolean z10 = false;
                if (fVar == null) {
                    return false;
                }
                if (k(fVar)) {
                    break;
                }
                if ((fVar instanceof l8.j) && ((l8.j) fVar).g() == l8.l.f15843f) {
                    z10 = true;
                }
                if (z10) {
                    break;
                }
                fVar = fVar.c();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean p(r rVar, l8.b bVar) {
        if (rVar == null) {
            a(30);
            throw null;
        } else if (bVar == null) {
            a(31);
            throw null;
        } else {
            l8.d c = rVar.U0().c();
            if (c != null) {
                l8.f a10 = c.a();
                return (a10 instanceof l8.d) && bVar.o().equals(((l8.d) a10).o());
            }
            return false;
        }
    }

    public static boolean q(l8.e eVar) {
        return (n(eVar, ClassKind.f13431i) || n(eVar, ClassKind.f13432j)) && ((l8.b) eVar).p() == Modality.SEALED;
    }

    public static boolean r(l8.b bVar, l8.b bVar2) {
        return s(bVar.r(), bVar2.a());
    }

    public static boolean s(r rVar, l8.b bVar) {
        if (rVar == null) {
            a(32);
            throw null;
        } else if (bVar == null) {
            a(33);
            throw null;
        } else if (p(rVar, bVar)) {
            return true;
        } else {
            for (r rVar2 : rVar.U0().f()) {
                if (s(rVar2, bVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean t(l8.f fVar) {
        return fVar != null && (fVar.c() instanceof u);
    }

    public static <D extends CallableMemberDescriptor> D u(D d5) {
        if (d5 == null) {
            a(59);
            throw null;
        }
        while (d5.h() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> f10 = d5.f();
            if (f10.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d5);
            }
            d5 = (D) f10.iterator().next();
        }
        return d5;
    }

    public static <D extends l8.j> D v(D d5) {
        return d5 instanceof CallableMemberDescriptor ? u((CallableMemberDescriptor) d5) : d5;
    }
}
