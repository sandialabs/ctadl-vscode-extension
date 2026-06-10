package y9;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes.dex */
public final class h0 extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final Variance f18950a;

    /* renamed from: b  reason: collision with root package name */
    public final r f18951b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(r rVar) {
        this(rVar, Variance.INVARIANT);
        if (rVar != null) {
        } else {
            e(2);
            throw null;
        }
    }

    public h0(r rVar, Variance variance) {
        if (variance == null) {
            e(0);
            throw null;
        } else if (rVar == null) {
            e(1);
            throw null;
        } else {
            this.f18950a = variance;
            this.f18951b = rVar;
        }
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "type";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y9.f0
    public final Variance a() {
        Variance variance = this.f18950a;
        if (variance != null) {
            return variance;
        }
        e(4);
        throw null;
    }

    @Override // y9.f0
    public final r b() {
        r rVar = this.f18951b;
        if (rVar != null) {
            return rVar;
        }
        e(5);
        throw null;
    }

    @Override // y9.f0
    public final f0 c(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (eVar != null) {
            return new h0(eVar.P0(this.f18951b), this.f18950a);
        }
        e(6);
        throw null;
    }

    @Override // y9.f0
    public final boolean d() {
        return false;
    }
}
