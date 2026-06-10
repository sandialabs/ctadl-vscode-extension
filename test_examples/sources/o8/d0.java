package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

/* loaded from: classes.dex */
public final class d0 extends b0 implements l8.a0 {

    /* renamed from: u  reason: collision with root package name */
    public y9.r f16414u;

    /* renamed from: v  reason: collision with root package name */
    public final l8.a0 f16415v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(l8.z zVar, m8.e eVar, Modality modality, l8.m mVar, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, l8.a0 a0Var, l8.d0 d0Var) {
        super(modality, mVar, zVar, eVar, h9.e.m("<get-" + zVar.getName() + ">"), z10, z11, z12, kind, d0Var);
        d0 d0Var2;
        d0 d0Var3;
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
            if (a0Var != 0) {
                d0Var3 = this;
                d0Var2 = a0Var;
            } else {
                d0Var2 = this;
                d0Var3 = d0Var2;
            }
            d0Var3.f16415v = d0Var2;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o8.b0, o8.o
    /* renamed from: T0 */
    public final l8.a0 z0() {
        l8.a0 a0Var = this.f16415v;
        if (a0Var != null) {
            return a0Var;
        }
        K(8);
        throw null;
    }

    public final void U0(y9.r rVar) {
        if (rVar == null) {
            rVar = C0().b();
        }
        this.f16414u = rVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends l8.a0> f() {
        return S0(true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final y9.r k() {
        return this.f16414u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> m() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(7);
        throw null;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.k(this, d5);
    }
}
