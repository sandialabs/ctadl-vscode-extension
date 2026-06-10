package h9;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: i  reason: collision with root package name */
    public final String f11572i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11573j;

    public e(String str, boolean z10) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f11572i = str;
        this.f11573j = z10;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static e j(String str) {
        if (str != null) {
            return str.startsWith("<") ? m(str) : k(str);
        }
        a(8);
        throw null;
    }

    public static e k(String str) {
        if (str != null) {
            return new e(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean l(String str) {
        int i10;
        if (str == null) {
            a(6);
            throw null;
        }
        if (!str.isEmpty() && !str.startsWith("<")) {
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                i10 = (charAt == '.' || charAt == '/' || charAt == '\\') ? 0 : i10 + 1;
                return false;
            }
            return true;
        }
        return false;
    }

    public static e m(String str) {
        if (str == null) {
            a(7);
            throw null;
        } else if (str.startsWith("<")) {
            return new e(str, true);
        } else {
            throw new IllegalArgumentException("special name must start with '<': ".concat(str));
        }
    }

    public final String b() {
        String str = this.f11572i;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f11572i.compareTo(eVar.f11572i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f11573j == eVar.f11573j && this.f11572i.equals(eVar.f11572i);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11572i.hashCode() * 31) + (this.f11573j ? 1 : 0);
    }

    public final String i() {
        if (this.f11573j) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String b5 = b();
        if (b5 != null) {
            return b5;
        }
        a(2);
        throw null;
    }

    public final String toString() {
        return this.f11572i;
    }
}
