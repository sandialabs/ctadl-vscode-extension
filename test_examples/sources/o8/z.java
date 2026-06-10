package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.d0;
import m8.e;

/* loaded from: classes.dex */
public final class z extends k {

    /* renamed from: p  reason: collision with root package name */
    public final ClassKind f16476p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f16477q;

    /* renamed from: r  reason: collision with root package name */
    public Modality f16478r;

    /* renamed from: s  reason: collision with root package name */
    public l8.m f16479s;

    /* renamed from: t  reason: collision with root package name */
    public y9.d f16480t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f16481u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f16482v;

    /* renamed from: w  reason: collision with root package name */
    public final x9.h f16483w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(p pVar, h9.e eVar, LockBasedStorageManager.a aVar) {
        super(aVar, pVar, eVar, r1);
        ClassKind classKind = ClassKind.f13432j;
        d0.a aVar2 = l8.d0.f15835a;
        if (eVar == null) {
            z0(2);
            throw null;
        } else if (aVar == null) {
            z0(4);
            throw null;
        } else {
            this.f16482v = new ArrayList();
            this.f16483w = aVar;
            this.f16476p = classKind;
            this.f16477q = false;
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return null;
    }

    @Override // l8.b
    public final MemberScope B0() {
        MemberScope.a aVar = MemberScope.a.f14741b;
        if (aVar != null) {
            return aVar;
        }
        z0(18);
        throw null;
    }

    @Override // l8.b
    public final l8.b E0() {
        return null;
    }

    @Override // l8.b
    public final boolean H() {
        return false;
    }

    @Override // l8.b
    public final Collection J() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        z0(13);
        throw null;
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    @Override // l8.b
    public final boolean Q0() {
        return false;
    }

    @Override // l8.b
    public final boolean T() {
        return false;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (eVar == null) {
            z0(16);
            throw null;
        }
        MemberScope.a aVar = MemberScope.a.f14741b;
        if (aVar != null) {
            return aVar;
        }
        z0(17);
        throw null;
    }

    @Override // l8.b
    public final Collection<l8.b> e0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(19);
        throw null;
    }

    @Override // l8.b, l8.j, l8.r
    public final l8.m g() {
        l8.m mVar = this.f16479s;
        if (mVar != null) {
            return mVar;
        }
        z0(10);
        throw null;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return e.a.f16014a;
    }

    @Override // l8.b
    public final ClassKind h() {
        ClassKind classKind = this.f16476p;
        if (classKind != null) {
            return classKind;
        }
        z0(8);
        throw null;
    }

    @Override // l8.b
    public final boolean i() {
        return false;
    }

    @Override // l8.b
    public final boolean i0() {
        return false;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.e
    public final boolean m0() {
        return this.f16477q;
    }

    @Override // l8.d
    public final y9.e0 o() {
        y9.d dVar = this.f16480t;
        if (dVar != null) {
            return dVar;
        }
        z0(11);
        throw null;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        Modality modality = this.f16478r;
        if (modality != null) {
            return modality;
        }
        z0(7);
        throw null;
    }

    public final String toString() {
        return n.c0(this);
    }

    @Override // l8.b, l8.e
    public final List<l8.i0> x() {
        ArrayList arrayList = this.f16481u;
        if (arrayList != null) {
            return arrayList;
        }
        z0(15);
        throw null;
    }

    @Override // l8.b
    public final l8.j0<y9.v> x0() {
        return null;
    }
}
