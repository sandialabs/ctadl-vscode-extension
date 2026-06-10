package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.d0;
import l8.l;
import m8.e;

/* loaded from: classes.dex */
public class l extends k {

    /* renamed from: p  reason: collision with root package name */
    public final Modality f16440p;

    /* renamed from: q  reason: collision with root package name */
    public final ClassKind f16441q;

    /* renamed from: r  reason: collision with root package name */
    public final y9.d f16442r;

    /* renamed from: s  reason: collision with root package name */
    public MemberScope f16443s;

    /* renamed from: t  reason: collision with root package name */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.b> f16444t;

    /* renamed from: u  reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.b f16445u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(l8.f fVar, h9.e eVar, Modality modality, ClassKind classKind, List list, x9.h hVar) {
        super(hVar, fVar, eVar, r0);
        d0.a aVar = l8.d0.f15835a;
        if (fVar == null) {
            z0(0);
            throw null;
        } else if (eVar == null) {
            z0(1);
            throw null;
        } else if (list == null) {
            z0(4);
            throw null;
        } else if (hVar == null) {
            z0(6);
            throw null;
        } else {
            this.f16440p = modality;
            this.f16441q = classKind;
            this.f16442r = new y9.d(this, Collections.emptyList(), list, hVar);
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "modality";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case ma.i.f16046m /* 9 */:
                objArr[1] = "getAnnotations";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return this.f16445u;
    }

    @Override // l8.b
    public final MemberScope B0() {
        MemberScope.a aVar = MemberScope.a.f14741b;
        if (aVar != null) {
            return aVar;
        }
        z0(14);
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
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set = this.f16444t;
        if (set != null) {
            return set;
        }
        z0(11);
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

    public final void S0(MemberScope memberScope, Set set, j jVar) {
        if (memberScope == null) {
            z0(7);
            throw null;
        } else if (set == null) {
            z0(8);
            throw null;
        } else {
            this.f16443s = memberScope;
            this.f16444t = set;
            this.f16445u = jVar;
        }
    }

    @Override // l8.b
    public final boolean T() {
        return false;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (eVar == null) {
            z0(12);
            throw null;
        }
        MemberScope memberScope = this.f16443s;
        if (memberScope != null) {
            return memberScope;
        }
        z0(13);
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
        l.h hVar = l8.l.f15842e;
        if (hVar != null) {
            return hVar;
        }
        z0(17);
        throw null;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return e.a.f16014a;
    }

    @Override // l8.b
    public final ClassKind h() {
        ClassKind classKind = this.f16441q;
        if (classKind != null) {
            return classKind;
        }
        z0(15);
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
        return false;
    }

    @Override // l8.d
    public final y9.e0 o() {
        y9.d dVar = this.f16442r;
        if (dVar != null) {
            return dVar;
        }
        z0(10);
        throw null;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        Modality modality = this.f16440p;
        if (modality != null) {
            return modality;
        }
        z0(16);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // l8.b, l8.e
    public final List<l8.i0> x() {
        List<l8.i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(18);
        throw null;
    }

    @Override // l8.b
    public final l8.j0<y9.v> x0() {
        return null;
    }
}
