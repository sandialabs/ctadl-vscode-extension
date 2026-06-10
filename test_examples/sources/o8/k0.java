package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k0 extends o implements l8.l0 {

    /* renamed from: m  reason: collision with root package name */
    public y9.r f16439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l8.f fVar, m8.e eVar, h9.e eVar2, y9.r rVar, l8.d0 d0Var) {
        super(fVar, eVar, eVar2, d0Var);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (eVar2 == null) {
            K(2);
            throw null;
        } else if (d0Var == null) {
            K(3);
            throw null;
        } else {
            this.f16439m = rVar;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public l8.c0 E() {
        return null;
    }

    public l8.c0 R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean Z() {
        return false;
    }

    @Override // l8.k0
    public final y9.r b() {
        y9.r rVar = this.f16439m;
        if (rVar != null) {
            return rVar;
        }
        K(4);
        throw null;
    }

    public List<l8.i0> getTypeParameters() {
        List<l8.i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(8);
        throw null;
    }

    public y9.r k() {
        y9.r b5 = b();
        if (b5 != null) {
            return b5;
        }
        K(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> m() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(6);
        throw null;
    }
}
