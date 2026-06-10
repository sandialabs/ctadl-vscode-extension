package p9;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16781a;

    public b(String str) {
        if (str != null) {
            this.f16781a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "fqName";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static b b(h9.b bVar) {
        if (bVar == null) {
            a(1);
            throw null;
        }
        h9.c h10 = bVar.h();
        String replace = bVar.i().b().replace('.', '$');
        if (h10.d()) {
            return new b(replace);
        }
        return new b(h10.b().replace('.', '/') + "/" + replace);
    }

    public static b c(h9.c cVar) {
        if (cVar != null) {
            return new b(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f16781a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f16781a.equals(((b) obj).f16781a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16781a.hashCode();
    }

    public final String toString() {
        return this.f16781a;
    }
}
