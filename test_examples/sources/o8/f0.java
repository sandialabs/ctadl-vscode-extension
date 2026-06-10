package o8;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class f0 extends d {

    /* renamed from: k  reason: collision with root package name */
    public final l8.f f16422k;

    /* renamed from: l  reason: collision with root package name */
    public final s9.g f16423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l8.f fVar, s9.a aVar, m8.e eVar) {
        super(eVar);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(2);
            throw null;
        } else {
            this.f16422k = fVar;
            this.f16423l = aVar;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "value";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getValue";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                objArr[2] = "copy";
            } else if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // l8.f
    public final l8.f c() {
        l8.f fVar = this.f16422k;
        if (fVar != null) {
            return fVar;
        }
        K(4);
        throw null;
    }

    @Override // l8.c0
    public final s9.g getValue() {
        s9.g gVar = this.f16423l;
        if (gVar != null) {
            return gVar;
        }
        K(3);
        throw null;
    }
}
