package h9;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import u7.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e */
    public static final e f11566e = e.m("<root>");

    /* renamed from: f */
    public static final Pattern f11567f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final a f11568g = new a();

    /* renamed from: a */
    public final String f11569a;

    /* renamed from: b */
    public transient c f11570b;
    public transient d c;

    /* renamed from: d */
    public transient e f11571d;

    /* loaded from: classes.dex */
    public static class a implements l<String, e> {
        @Override // u7.l
        public final e U(String str) {
            return e.j(str);
        }
    }

    public d(String str) {
        if (str != null) {
            this.f11569a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        } else if (cVar == null) {
            a(1);
            throw null;
        } else {
            this.f11569a = str;
            this.f11570b = cVar;
        }
    }

    public d(String str, d dVar, e eVar) {
        if (str == null) {
            a(3);
            throw null;
        }
        this.f11569a = str;
        this.c = dVar;
        this.f11571d = eVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                case 6:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case ma.i.f16047o /* 10 */:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case ma.i.f16046m /* 9 */:
                    objArr[0] = "name";
                    break;
                case ma.i.f16049q /* 15 */:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[1] = "parent";
                break;
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case ma.i.f16047o /* 10 */:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case ma.i.f16046m /* 9 */:
                objArr[2] = "child";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final d b(e eVar) {
        String str;
        if (eVar == null) {
            a(9);
            throw null;
        }
        if (d()) {
            str = eVar.b();
        } else {
            str = this.f11569a + "." + eVar.b();
        }
        return new d(str, this, eVar);
    }

    public final void c() {
        String str = this.f11569a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f11571d = e.j(str.substring(lastIndexOf + 1));
            this.c = new d(str.substring(0, lastIndexOf));
            return;
        }
        this.f11571d = e.j(str);
        this.c = c.c.i();
    }

    public final boolean d() {
        return this.f11569a.isEmpty();
    }

    public final boolean e() {
        if (this.f11570b == null) {
            String str = this.f11569a;
            if (str != null) {
                if (str.indexOf(60) >= 0) {
                    return false;
                }
            } else {
                a(4);
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f11569a.equals(((d) obj).f11569a);
    }

    public final List<e> f() {
        List<e> list;
        if (d()) {
            list = Collections.emptyList();
        } else {
            String[] split = f11567f.split(this.f11569a);
            v7.g.f(split, "<this>");
            a aVar = f11568g;
            v7.g.f(aVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                arrayList.add(aVar.U(str));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final e g() {
        e eVar = this.f11571d;
        if (eVar != null) {
            if (eVar != null) {
                return eVar;
            }
            a(10);
            throw null;
        } else if (d()) {
            throw new IllegalStateException("root");
        } else {
            c();
            e eVar2 = this.f11571d;
            if (eVar2 != null) {
                return eVar2;
            }
            a(11);
            throw null;
        }
    }

    public final c h() {
        c cVar = this.f11570b;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f11570b = cVar2;
            return cVar2;
        } else if (cVar != null) {
            return cVar;
        } else {
            a(5);
            throw null;
        }
    }

    public final int hashCode() {
        return this.f11569a.hashCode();
    }

    public final String toString() {
        String b5 = d() ? f11566e.b() : this.f11569a;
        if (b5 != null) {
            return b5;
        }
        a(17);
        throw null;
    }
}
