package w8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import l8.d0;
import m8.e;
import ma.i;
import o8.f0;
import o8.j;
import y9.r;

/* loaded from: classes.dex */
public final class b extends j implements a {
    public Boolean N;
    public Boolean O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l8.b bVar, b bVar2, m8.e eVar, boolean z10, CallableMemberDescriptor.Kind kind, d0 d0Var) {
        super(bVar, bVar2, eVar, z10, kind, d0Var);
        if (bVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (kind == null) {
            K(2);
            throw null;
        } else if (d0Var == null) {
            K(3);
            throw null;
        } else {
            this.N = null;
            this.O = null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case i.f16046m /* 9 */:
            case i.f16049q /* 15 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 6:
            case i.f16047o /* 10 */:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static b f1(l8.b bVar, m8.e eVar, boolean z10, a9.a aVar) {
        if (bVar == null) {
            K(4);
            throw null;
        } else if (aVar != null) {
            return new b(bVar, null, eVar, z10, CallableMemberDescriptor.Kind.DECLARATION, aVar);
        } else {
            K(6);
            throw null;
        }
    }

    @Override // w8.a
    public final a S(r rVar, ArrayList arrayList, r rVar2, Pair pair) {
        f0 h10;
        l8.b c = c();
        b g12 = g1(h(), c, null, j(), getAnnotations());
        if (rVar == null) {
            h10 = null;
        } else {
            h10 = k9.c.h(g12, rVar, e.a.f16014a);
        }
        g12.V0(h10, this.f13533r, EmptyList.f12981i, getTypeParameters(), a1.c.o0(arrayList, m(), g12), rVar2, p(), g());
        if (pair != null) {
            g12.X0((a.InterfaceC0150a) pair.f12962i, pair.f12963j);
        }
        return g12;
    }

    @Override // o8.j, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        return g1(kind, fVar, eVar, d0Var, eVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final void Y0(boolean z10) {
        this.N = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return this.O.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final void Z0(boolean z10) {
        this.O = Boolean.valueOf(z10);
    }

    @Override // o8.j
    public final /* bridge */ /* synthetic */ j b1(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        return g1(kind, fVar, eVar, d0Var, eVar2);
    }

    public final b g1(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2) {
        if (fVar != null) {
            if (kind != null) {
                if (eVar2 != null) {
                    if (d0Var != null) {
                        if (kind != CallableMemberDescriptor.Kind.DECLARATION && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + fVar + "\nkind: " + kind);
                        }
                        b bVar = new b((l8.b) fVar, (b) eVar, eVar2, this.M, kind, d0Var);
                        bVar.Y0(this.N.booleanValue());
                        bVar.Z0(Z());
                        return bVar;
                    }
                    K(10);
                    throw null;
                }
                K(9);
                throw null;
            }
            K(8);
            throw null;
        }
        K(7);
        throw null;
    }
}
