package h9;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class c {
    public static final c c = new c("");

    /* renamed from: a  reason: collision with root package name */
    public final d f11564a;

    /* renamed from: b  reason: collision with root package name */
    public transient c f11565b;

    public c(d dVar) {
        if (dVar != null) {
            this.f11564a = dVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(d dVar, c cVar) {
        this.f11564a = dVar;
        this.f11565b = cVar;
    }

    public c(String str) {
        if (str != null) {
            this.f11564a = new d(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "fqName";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[1] = "shortName";
                break;
            case ma.i.f16047o /* 10 */:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[2] = "<init>";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c j(e eVar) {
        if (eVar != null) {
            if (eVar != null) {
                return new c(new d(eVar.b(), c.i(), eVar));
            }
            d.a(16);
            throw null;
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.f11564a.f11569a;
        if (str != null) {
            return str;
        }
        d.a(4);
        throw null;
    }

    public final c c(e eVar) {
        if (eVar != null) {
            return new c(this.f11564a.b(eVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f11564a.d();
    }

    public final c e() {
        c cVar = this.f11565b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        } else if (!d()) {
            d dVar = this.f11564a;
            d dVar2 = dVar.c;
            if (dVar2 == null) {
                if (!dVar.d()) {
                    dVar.c();
                    dVar2 = dVar.c;
                    if (dVar2 == null) {
                        d.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            c cVar2 = new c(dVar2);
            this.f11565b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f11564a.equals(((c) obj).f11564a);
    }

    public final e f() {
        e g10 = this.f11564a.g();
        if (g10 != null) {
            return g10;
        }
        a(9);
        throw null;
    }

    public final e g() {
        e g10;
        d dVar = this.f11564a;
        if (dVar.d()) {
            g10 = d.f11566e;
            if (g10 == null) {
                d.a(12);
                throw null;
            }
        } else {
            g10 = dVar.g();
            if (g10 == null) {
                d.a(13);
                throw null;
            }
        }
        return g10;
    }

    public final boolean h(e eVar) {
        if (eVar != null) {
            d dVar = this.f11564a;
            if (dVar.d()) {
                return false;
            }
            String str = dVar.f11569a;
            int indexOf = str.indexOf(46);
            String b5 = eVar.b();
            if (indexOf == -1) {
                indexOf = str.length();
            }
            return str.regionMatches(0, b5, 0, indexOf);
        }
        a(12);
        throw null;
    }

    public final int hashCode() {
        return this.f11564a.hashCode();
    }

    public final d i() {
        d dVar = this.f11564a;
        if (dVar != null) {
            return dVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f11564a.toString();
    }
}
