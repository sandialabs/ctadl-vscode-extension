package y9;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l8.g0;

/* loaded from: classes.dex */
public final class d extends b {
    public final l8.b c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l8.i0> f18944d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection<r> f18945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l8.b bVar, List<? extends l8.i0> list, Collection<r> collection, x9.h hVar) {
        super(hVar);
        if (bVar == null) {
            o(0);
            throw null;
        } else if (list == null) {
            o(1);
            throw null;
        } else if (collection == null) {
            o(2);
            throw null;
        } else if (hVar == null) {
            o(3);
            throw null;
        } else {
            this.c = bVar;
            this.f18944d = Collections.unmodifiableList(new ArrayList(list));
            this.f18945e = Collections.unmodifiableCollection(collection);
        }
    }

    public static /* synthetic */ void o(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "supertypes";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "storageManager";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y9.e0
    public final boolean a() {
        return true;
    }

    @Override // y9.e0
    public final List<l8.i0> e() {
        List<l8.i0> list = this.f18944d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection<r> h() {
        Collection<r> collection = this.f18945e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final l8.g0 k() {
        return g0.a.f15837a;
    }

    @Override // y9.b
    public final l8.b p() {
        l8.b bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        o(5);
        throw null;
    }

    public final String toString() {
        String str = k9.d.g(this.c).f11569a;
        if (str != null) {
            return str;
        }
        h9.d.a(4);
        throw null;
    }
}
