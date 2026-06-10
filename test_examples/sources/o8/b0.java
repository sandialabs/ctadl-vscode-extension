package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public abstract class b0 extends o implements kotlin.reflect.jvm.internal.impl.descriptors.f {

    /* renamed from: m  reason: collision with root package name */
    public boolean f16387m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final Modality f16388o;

    /* renamed from: p  reason: collision with root package name */
    public final l8.z f16389p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f16390q;

    /* renamed from: r  reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f16391r;

    /* renamed from: s  reason: collision with root package name */
    public l8.m f16392s;

    /* renamed from: t  reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.e f16393t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Modality modality, l8.m mVar, l8.z zVar, m8.e eVar, h9.e eVar2, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, l8.d0 d0Var) {
        super(zVar.c(), eVar, eVar2, d0Var);
        if (modality == null) {
            K(0);
            throw null;
        } else if (mVar == null) {
            K(1);
            throw null;
        } else if (eVar == null) {
            K(3);
            throw null;
        } else if (d0Var == null) {
            K(5);
            throw null;
        } else {
            this.f16393t = null;
            this.f16388o = modality;
            this.f16392s = mVar;
            this.f16389p = zVar;
            this.f16387m = z10;
            this.n = z11;
            this.f16390q = z12;
            this.f16391r = kind;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
                i11 = 2;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "correspondingProperty";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[1] = "getTypeParameters";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
                throw new IllegalStateException(format);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e C() {
        return this.f16393t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    public final l8.z C0() {
        l8.z zVar = this.f16389p;
        if (zVar != null) {
            return zVar;
        }
        K(13);
        throw null;
    }

    @Override // l8.r
    public final boolean D() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 E() {
        return C0().E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    public final boolean F0() {
        return this.f16387m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean G0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        return null;
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    @Override // o8.o
    /* renamed from: M0 */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f z0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean O0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 R() {
        return C0().R();
    }

    public final ArrayList S0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (l8.z zVar : C0().f()) {
            l8.f0 s10 = z10 ? zVar.s() : zVar.l();
            if (s10 != null) {
                arrayList.add(s10);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.c0> b0() {
        List<l8.c0> b02 = C0().b0();
        if (b02 != null) {
            return b02;
        }
        K(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return this;
        }
        K(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    public final /* bridge */ /* synthetic */ l8.g d(TypeSubstitutor typeSubstitutor) {
        d(typeSubstitutor);
        return this;
    }

    @Override // l8.j, l8.r
    public final l8.m g() {
        l8.m mVar = this.f16392s;
        if (mVar != null) {
            return mVar;
        }
        K(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.i0> getTypeParameters() {
        List<l8.i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        K(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind h() {
        CallableMemberDescriptor.Kind kind = this.f16391r;
        if (kind != null) {
            return kind;
        }
        K(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean i() {
        return this.f16390q;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.r
    public final Modality p() {
        Modality modality = this.f16388o;
        if (modality != null) {
            return modality;
        }
        K(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean q0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean r0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void s0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        K(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean u0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean v0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor y0(l8.f fVar, Modality modality, l8.k kVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }
}
