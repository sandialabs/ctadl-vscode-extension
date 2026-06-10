package w8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import l8.b0;
import l8.d0;
import l8.m;
import l8.z;
import m8.e;
import ma.i;
import o8.c0;
import o8.e0;
import o8.f0;
import u8.q;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public class e extends c0 implements a {
    public final boolean J;
    public final Pair<a.InterfaceC0150a<?>, ?> K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l8.f fVar, m8.e eVar, Modality modality, m mVar, boolean z10, h9.e eVar2, d0 d0Var, z zVar, CallableMemberDescriptor.Kind kind, boolean z11, Pair<a.InterfaceC0150a<?>, ?> pair) {
        super(fVar, zVar, eVar, modality, mVar, z10, eVar2, kind, d0Var, false, false, false, false, false, false);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (modality == null) {
            K(2);
            throw null;
        } else if (mVar == null) {
            K(3);
            throw null;
        } else if (eVar2 == null) {
            K(4);
            throw null;
        } else if (d0Var == null) {
            K(5);
            throw null;
        } else if (kind == null) {
            K(6);
            throw null;
        } else {
            this.J = z11;
            this.K = pair;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case i.f16046m /* 9 */:
                objArr[0] = "modality";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case i.f16047o /* 10 */:
                objArr[0] = "visibility";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case i.f16049q /* 15 */:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static e Z0(l8.f fVar, LazyJavaAnnotations lazyJavaAnnotations, m mVar, boolean z10, h9.e eVar, a9.a aVar, boolean z11) {
        Modality modality = Modality.FINAL;
        if (fVar == null) {
            K(7);
            throw null;
        } else if (eVar == null) {
            K(11);
            throw null;
        } else if (aVar != null) {
            return new e(fVar, lazyJavaAnnotations, modality, mVar, z10, eVar, aVar, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
        } else {
            K(12);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // o8.c0, l8.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        boolean z10;
        r b5 = b();
        if (!this.J) {
            return false;
        }
        g.f(b5, "type");
        if (((!kotlin.reflect.jvm.internal.impl.builtins.e.H(b5) && !i8.g.a(b5)) || kotlin.reflect.jvm.internal.impl.types.r.g(b5)) && !kotlin.reflect.jvm.internal.impl.builtins.e.J(b5)) {
            z10 = false;
            if (z10) {
                return false;
            }
            c9.b bVar = c9.i.f6580a;
            h9.c cVar = q.f17877p;
            g.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
            if (b.a.C(b5, cVar) && !kotlin.reflect.jvm.internal.impl.builtins.e.J(b5)) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // o8.c0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        Pair<a.InterfaceC0150a<?>, ?> pair = this.K;
        if (pair != null && pair.f12962i.equals(interfaceC0150a)) {
            return (V) pair.f12963j;
        }
        return null;
    }

    @Override // w8.a
    public final a S(r rVar, ArrayList arrayList, r rVar2, Pair pair) {
        z z02;
        o8.d0 d0Var;
        f0 f0Var;
        e0 e0Var;
        f0 h10;
        b0 l2;
        o8.d0 s10;
        if (z0() == this) {
            z02 = null;
        } else {
            z02 = z0();
        }
        e eVar = new e(c(), getAnnotations(), p(), g(), this.n, getName(), j(), z02, h(), this.J, pair);
        o8.d0 d0Var2 = this.F;
        if (d0Var2 != null) {
            m8.e annotations = d0Var2.getAnnotations();
            Modality p10 = d0Var2.p();
            m g10 = d0Var2.g();
            boolean z10 = d0Var2.f16387m;
            boolean z11 = d0Var2.n;
            boolean z12 = d0Var2.f16390q;
            CallableMemberDescriptor.Kind h11 = h();
            if (z02 == null) {
                s10 = null;
            } else {
                s10 = z02.s();
            }
            d0Var = r14;
            o8.d0 d0Var3 = new o8.d0(eVar, annotations, p10, g10, z10, z11, z12, h11, s10, d0Var2.j());
            d0Var.f16393t = d0Var2.f16393t;
            d0Var.U0(rVar2);
        } else {
            d0Var = null;
        }
        b0 b0Var = this.G;
        if (b0Var != null) {
            m8.e annotations2 = b0Var.getAnnotations();
            Modality p11 = b0Var.p();
            m g11 = b0Var.g();
            boolean F0 = b0Var.F0();
            boolean D = b0Var.D();
            boolean i10 = b0Var.i();
            CallableMemberDescriptor.Kind h12 = h();
            if (z02 == null) {
                l2 = null;
            } else {
                l2 = z02.l();
            }
            e0Var = r13;
            e0 e0Var2 = new e0(eVar, annotations2, p11, g11, F0, D, i10, h12, l2, b0Var.j());
            e0Var.f16393t = e0Var.f16393t;
            h hVar = b0Var.m().get(0);
            if (hVar != null) {
                e0Var.f16417u = hVar;
                f0Var = null;
            } else {
                e0.K(6);
                throw null;
            }
        } else {
            f0Var = null;
            e0Var = null;
        }
        eVar.W0(d0Var, e0Var, this.H, this.I);
        u7.a<x9.f<m9.g<?>>> aVar = this.f16447p;
        if (aVar != null) {
            eVar.M0(this.f16446o, aVar);
        }
        eVar.s0(f());
        if (rVar == null) {
            h10 = f0Var;
        } else {
            h10 = k9.c.h(this, rVar, e.a.f16014a);
        }
        eVar.Y0(rVar2, getTypeParameters(), this.C, h10, EmptyList.f12981i);
        return eVar;
    }

    @Override // o8.c0
    public final c0 U0(l8.f fVar, Modality modality, m mVar, z zVar, CallableMemberDescriptor.Kind kind, h9.e eVar) {
        d0.a aVar = d0.f15835a;
        if (fVar != null) {
            if (modality != null) {
                if (mVar != null) {
                    if (kind != null) {
                        if (eVar != null) {
                            return new e(fVar, getAnnotations(), modality, mVar, this.n, eVar, aVar, zVar, kind, this.J, this.K);
                        }
                        K(17);
                        throw null;
                    }
                    K(16);
                    throw null;
                }
                K(15);
                throw null;
            }
            K(14);
            throw null;
        }
        K(13);
        throw null;
    }

    @Override // o8.c0
    public final void X0(r rVar) {
    }

    @Override // o8.k0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return false;
    }
}
