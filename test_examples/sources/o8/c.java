package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public abstract class c extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x9.h hVar, l8.f fVar, m8.e eVar, h9.e eVar2, Variance variance, boolean z10, int i10, l8.g0 g0Var) {
        super(hVar, fVar, eVar, eVar2, variance, z10, i10, g0Var);
        if (hVar == null) {
            K(0);
            throw null;
        } else if (fVar == null) {
            K(1);
            throw null;
        } else if (eVar2 == null) {
            K(3);
            throw null;
        } else if (g0Var != null) {
        } else {
            K(6);
            throw null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o8.n
    public final String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.n ? "reified " : "";
        if (t() != Variance.INVARIANT) {
            str = t() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
