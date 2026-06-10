package h9;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f11562a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11563b;
    public final boolean c;

    public b(c cVar, c cVar2, boolean z10) {
        if (cVar == null) {
            a(1);
            throw null;
        }
        this.f11562a = cVar;
        this.f11563b = cVar2;
        this.c = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar) {
        this(cVar, c.j(eVar), false);
        if (cVar == null) {
            a(3);
            throw null;
        } else if (eVar != null) {
        } else {
            a(4);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case ma.i.f16049q /* 15 */:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                switch (i10) {
                    case 13:
                    case 14:
                    case ma.i.f16049q /* 15 */:
                    case 16:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[0] = "packageFqName";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "relativeClassName";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[0] = "topLevelName";
                        break;
                    case 5:
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case ma.i.f16046m /* 9 */:
                    case 13:
                    case 14:
                    case ma.i.f16049q /* 15 */:
                    case 16:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = "name";
                        break;
                    case ma.i.f16047o /* 10 */:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = "string";
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i10 != 5) {
                    objArr[1] = "getPackageFqName";
                } else if (i10 == 6) {
                    objArr[1] = "getRelativeClassName";
                } else if (i10 == 7) {
                    objArr[1] = "getShortClassName";
                } else if (i10 != 9) {
                    switch (i10) {
                        case 13:
                        case 14:
                            objArr[1] = "asString";
                            break;
                        case ma.i.f16049q /* 15 */:
                        case 16:
                            objArr[1] = "asFqNameString";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                            break;
                    }
                } else {
                    objArr[1] = "asSingleFqName";
                }
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        objArr[2] = "<init>";
                        break;
                    case 5:
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case ma.i.f16046m /* 9 */:
                    case 13:
                    case 14:
                    case ma.i.f16049q /* 15 */:
                    case 16:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case ma.i.f16047o /* 10 */:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                    switch (i10) {
                        case 13:
                        case 14:
                        case ma.i.f16049q /* 15 */:
                        case 16:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 5) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 5) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 5) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 5) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 5) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static b e(String str) {
        return f(str, false);
    }

    public static b f(String str, boolean z10) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new b(new c(str2), new c(str), z10);
    }

    public static b l(c cVar) {
        if (cVar != null) {
            return new b(cVar.e(), cVar.f());
        }
        a(0);
        throw null;
    }

    public final c b() {
        c cVar = this.f11562a;
        boolean d5 = cVar.d();
        c cVar2 = this.f11563b;
        if (d5) {
            if (cVar2 != null) {
                return cVar2;
            }
            a(9);
            throw null;
        }
        return new c(cVar.b() + "." + cVar2.b());
    }

    public final String c() {
        c cVar;
        boolean d5 = this.f11562a.d();
        c cVar2 = this.f11563b;
        if (d5) {
            String b5 = cVar2.b();
            if (b5 != null) {
                return b5;
            }
            a(13);
            throw null;
        }
        String str = cVar.b().replace('.', '/') + "/" + cVar2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final b d(e eVar) {
        if (eVar != null) {
            return new b(h(), this.f11563b.c(eVar), this.c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f11562a.equals(bVar.f11562a) && this.f11563b.equals(bVar.f11563b) && this.c == bVar.c;
        }
        return false;
    }

    public final b g() {
        c e10 = this.f11563b.e();
        if (e10.d()) {
            return null;
        }
        return new b(h(), e10, this.c);
    }

    public final c h() {
        c cVar = this.f11562a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.f11563b.hashCode();
        return Boolean.valueOf(this.c).hashCode() + ((hashCode + (this.f11562a.hashCode() * 31)) * 31);
    }

    public final c i() {
        c cVar = this.f11563b;
        if (cVar != null) {
            return cVar;
        }
        a(6);
        throw null;
    }

    public final e j() {
        e f10 = this.f11563b.f();
        if (f10 != null) {
            return f10;
        }
        a(7);
        throw null;
    }

    public final boolean k() {
        return !this.f11563b.e().d();
    }

    public final String toString() {
        if (this.f11562a.d()) {
            return "/" + c();
        }
        return c();
    }
}
