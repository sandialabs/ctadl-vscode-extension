package o8;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public abstract class o extends n implements l8.g {

    /* renamed from: k  reason: collision with root package name */
    public final l8.f f16451k;

    /* renamed from: l  reason: collision with root package name */
    public final l8.d0 f16452l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l8.f fVar, m8.e eVar, h9.e eVar2, l8.d0 d0Var) {
        super(eVar, eVar2);
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
            this.f16451k = fVar;
            this.f16452l = d0Var;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public l8.f c() {
        l8.f fVar = this.f16451k;
        if (fVar != null) {
            return fVar;
        }
        K(5);
        throw null;
    }

    public l8.d0 j() {
        l8.d0 d0Var = this.f16452l;
        if (d0Var != null) {
            return d0Var;
        }
        K(6);
        throw null;
    }

    @Override // o8.n, l8.f
    /* renamed from: z0 */
    public l8.i a() {
        return this;
    }
}
