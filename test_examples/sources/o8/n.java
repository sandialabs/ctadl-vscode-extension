package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* loaded from: classes.dex */
public abstract class n extends m8.b implements l8.f {

    /* renamed from: j  reason: collision with root package name */
    public final h9.e f16450j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m8.e eVar, h9.e eVar2) {
        super(eVar);
        if (eVar == null) {
            K(0);
            throw null;
        } else if (eVar2 == null) {
            K(1);
            throw null;
        } else {
            this.f16450j = eVar2;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static String c0(l8.f fVar) {
        if (fVar == null) {
            K(4);
            throw null;
        }
        try {
            String str = DescriptorRenderer.f14594b.F(fVar) + "[" + fVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(fVar)) + "]";
            if (str != null) {
                return str;
            }
            K(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = fVar.getClass().getSimpleName() + " " + fVar.getName();
            if (str2 != null) {
                return str2;
            }
            K(6);
            throw null;
        }
    }

    public l8.f a() {
        return this;
    }

    @Override // l8.f
    public final h9.e getName() {
        h9.e eVar = this.f16450j;
        if (eVar != null) {
            return eVar;
        }
        K(2);
        throw null;
    }

    public String toString() {
        return c0(this);
    }
}
