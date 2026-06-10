package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes.dex */
public final class e0 extends b0 implements l8.b0 {

    /* renamed from: u  reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.h f16417u;

    /* renamed from: v  reason: collision with root package name */
    public final l8.b0 f16418v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(l8.z zVar, m8.e eVar, Modality modality, l8.m mVar, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, l8.b0 b0Var, l8.d0 d0Var) {
        super(modality, mVar, zVar, eVar, h9.e.m("<set-" + zVar.getName() + ">"), z10, z11, z12, kind, d0Var);
        e0 e0Var;
        e0 e0Var2;
        if (eVar == null) {
            K(1);
            throw null;
        } else if (modality == null) {
            K(2);
            throw null;
        } else if (mVar == null) {
            K(3);
            throw null;
        } else if (kind == null) {
            K(4);
            throw null;
        } else if (d0Var == null) {
            K(5);
            throw null;
        } else {
            if (b0Var != 0) {
                e0Var2 = this;
                e0Var = b0Var;
            } else {
                e0Var = this;
                e0Var2 = e0Var;
            }
            e0Var2.f16418v = e0Var;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case ma.i.f16046m /* 9 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "modality";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "visibility";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                objArr[2] = "createSetterParameter";
                break;
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.e T0(e0 e0Var, y9.r rVar, m8.e eVar) {
        if (rVar == null) {
            K(8);
            throw null;
        } else if (eVar != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(e0Var, null, 0, eVar, h9.g.f11580g, rVar, false, false, false, null, l8.d0.f15835a);
        } else {
            K(9);
            throw null;
        }
    }

    @Override // o8.b0, o8.o
    /* renamed from: U0 */
    public final l8.b0 z0() {
        l8.b0 b0Var = this.f16418v;
        if (b0Var != null) {
            return b0Var;
        }
        K(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends l8.b0> f() {
        return S0(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final y9.r k() {
        y9.v x3 = DescriptorUtilsKt.e(this).x();
        if (x3 != null) {
            return x3;
        }
        K(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> m() {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = this.f16417u;
        if (hVar != null) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> singletonList = Collections.singletonList(hVar);
            if (singletonList != null) {
                return singletonList;
            }
            K(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.d(this, d5);
    }
}
