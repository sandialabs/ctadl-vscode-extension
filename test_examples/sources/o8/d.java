package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.l;

/* loaded from: classes.dex */
public abstract class d extends n implements l8.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m8.e eVar) {
        super(eVar, h9.g.f11577d);
        if (eVar != null) {
        } else {
            K(0);
            throw null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[1] = "getTypeParameters";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "substitute";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 E() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return false;
    }

    @Override // o8.n, l8.f
    public final kotlin.reflect.jvm.internal.impl.descriptors.a a() {
        return this;
    }

    @Override // o8.n, l8.f
    public final l8.f a() {
        return this;
    }

    @Override // l8.k0
    public final y9.r b() {
        y9.r b5 = getValue().b();
        if (b5 != null) {
            return b5;
        }
        K(4);
        throw null;
    }

    @Override // l8.c0, l8.f0
    public final d d(TypeSubstitutor typeSubstitutor) {
        y9.r b5;
        Variance variance;
        if (typeSubstitutor == null) {
            K(1);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            if (c() instanceof l8.b) {
                b5 = b();
                variance = Variance.OUT_VARIANCE;
            } else {
                b5 = b();
                variance = Variance.INVARIANT;
            }
            y9.r k3 = typeSubstitutor.k(b5, variance);
            if (k3 == null) {
                return null;
            }
            return k3 == b() ? this : new f0(c(), new s9.j(k3), getAnnotations());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        K(6);
        throw null;
    }

    @Override // l8.j, l8.r
    public final l8.m g() {
        l.i iVar = l8.l.f15843f;
        if (iVar != null) {
            return iVar;
        }
        K(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.i0> getTypeParameters() {
        List<l8.i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(3);
        throw null;
    }

    @Override // l8.i
    public final l8.d0 j() {
        return l8.d0.f15835a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final y9.r k() {
        return b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> m() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(5);
        throw null;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.f(this, d5);
    }
}
