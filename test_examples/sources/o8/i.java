package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.d0;

/* loaded from: classes.dex */
public abstract class i extends o implements l8.i0 {

    /* renamed from: m  reason: collision with root package name */
    public final Variance f16428m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final int f16429o;

    /* renamed from: p  reason: collision with root package name */
    public final x9.e<y9.e0> f16430p;

    /* renamed from: q  reason: collision with root package name */
    public final x9.e<y9.v> f16431q;

    /* renamed from: r  reason: collision with root package name */
    public final x9.h f16432r;

    /* loaded from: classes.dex */
    public class a extends AbstractTypeConstructor {
        public final l8.g0 c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f16433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, x9.h hVar, l8.g0 g0Var) {
            super(hVar);
            if (hVar == null) {
                o(0);
                throw null;
            }
            this.f16433d = iVar;
            this.c = g0Var;
        }

        public static /* synthetic */ void o(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[0] = "supertypes";
                    break;
                case ma.i.f16046m /* 9 */:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case ma.i.f16046m /* 9 */:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // y9.e0
        public final boolean a() {
            return true;
        }

        @Override // y9.e, y9.e0
        public final l8.d c() {
            i iVar = this.f16433d;
            if (iVar != null) {
                return iVar;
            }
            o(3);
            throw null;
        }

        @Override // y9.e0
        public final List<l8.i0> e() {
            List<l8.i0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            o(2);
            throw null;
        }

        @Override // y9.e
        public final boolean g(l8.d dVar) {
            if (dVar instanceof l8.i0) {
                i iVar = this.f16433d;
                v7.g.f(iVar, "a");
                if (kotlin.reflect.jvm.internal.impl.resolve.b.c(kotlin.reflect.jvm.internal.impl.resolve.b.f14701a, iVar, (l8.i0) dVar, true)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection<y9.r> h() {
            List<y9.r> T0 = this.f16433d.T0();
            if (T0 != null) {
                return T0;
            }
            o(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final y9.r i() {
            return aa.h.c(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final l8.g0 k() {
            l8.g0 g0Var = this.c;
            if (g0Var != null) {
                return g0Var;
            }
            o(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final List<y9.r> m(List<y9.r> list) {
            if (list == null) {
                o(7);
                throw null;
            }
            List<y9.r> M0 = this.f16433d.M0(list);
            if (M0 != null) {
                return M0;
            }
            o(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final void n(y9.r rVar) {
            if (rVar != null) {
                this.f16433d.S0(rVar);
            } else {
                o(6);
                throw null;
            }
        }

        public final String toString() {
            return this.f16433d.getName().f11572i;
        }

        @Override // y9.e0
        public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
            kotlin.reflect.jvm.internal.impl.builtins.e e10 = DescriptorUtilsKt.e(this.f16433d);
            if (e10 != null) {
                return e10;
            }
            o(4);
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(x9.h hVar, l8.f fVar, m8.e eVar, h9.e eVar2, Variance variance, boolean z10, int i10, l8.g0 g0Var) {
        super(fVar, eVar, eVar2, r0);
        d0.a aVar = l8.d0.f15835a;
        if (hVar == null) {
            K(0);
            throw null;
        } else if (fVar == null) {
            K(1);
            throw null;
        } else if (eVar == null) {
            K(2);
            throw null;
        } else if (eVar2 == null) {
            K(3);
            throw null;
        } else if (variance == null) {
            K(4);
            throw null;
        } else if (g0Var == null) {
            K(6);
            throw null;
        } else {
            this.f16428m = variance;
            this.n = z10;
            this.f16429o = i10;
            this.f16430p = hVar.a(new f(this, hVar, g0Var));
            this.f16431q = hVar.a(new h(this, eVar2));
            this.f16432r = hVar;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[1] = "getTypeConstructor";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // l8.i0
    public final x9.h G() {
        x9.h hVar = this.f16432r;
        if (hVar != null) {
            return hVar;
        }
        K(14);
        throw null;
    }

    public List<y9.r> M0(List<y9.r> list) {
        if (list == null) {
            K(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            K(13);
            throw null;
        }
    }

    public abstract void S0(y9.r rVar);

    public abstract List<y9.r> T0();

    @Override // l8.i0
    public final boolean W() {
        return false;
    }

    @Override // l8.i0
    public final boolean X() {
        return this.n;
    }

    @Override // o8.o, o8.n, l8.f
    public final l8.d a() {
        return this;
    }

    @Override // o8.o, o8.n, l8.f
    public final l8.f a() {
        return this;
    }

    @Override // o8.o, o8.n, l8.f
    public final l8.i0 a() {
        return this;
    }

    @Override // l8.i0
    public final int getIndex() {
        return this.f16429o;
    }

    @Override // l8.i0
    public final List<y9.r> getUpperBounds() {
        List<y9.r> f10 = ((a) o()).f();
        if (f10 != null) {
            return f10;
        }
        K(8);
        throw null;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.l(this, d5);
    }

    @Override // l8.i0, l8.d
    public final y9.e0 o() {
        y9.e0 k02 = this.f16430p.k0();
        if (k02 != null) {
            return k02;
        }
        K(9);
        throw null;
    }

    @Override // l8.d
    public final y9.v r() {
        y9.v k02 = this.f16431q.k0();
        if (k02 != null) {
            return k02;
        }
        K(10);
        throw null;
    }

    @Override // l8.i0
    public final Variance t() {
        Variance variance = this.f16428m;
        if (variance != null) {
            return variance;
        }
        K(7);
        throw null;
    }

    @Override // o8.o
    public final l8.i z0() {
        return this;
    }
}
