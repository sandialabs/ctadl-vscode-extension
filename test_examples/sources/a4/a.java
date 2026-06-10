package a4;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.activity.e;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import ha.i;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f220a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, C0004a> f221b;
    public final Set<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f222d;

    /* renamed from: a4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0004a {

        /* renamed from: a  reason: collision with root package name */
        public final String f223a;

        /* renamed from: b  reason: collision with root package name */
        public final String f224b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final int f225d;

        /* renamed from: e  reason: collision with root package name */
        public final String f226e;

        /* renamed from: f  reason: collision with root package name */
        public final int f227f;

        /* renamed from: g  reason: collision with root package name */
        public final int f228g;

        /* renamed from: a4.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0005a {
            @SuppressLint({"SyntheticAccessor"})
            public static boolean a(String str, String str2) {
                boolean z10;
                boolean z11;
                g.f(str, "current");
                if (g.a(str, str2)) {
                    return true;
                }
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i10 < str.length()) {
                            char charAt = str.charAt(i10);
                            int i13 = i12 + 1;
                            if (i12 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt == '(') {
                                i11++;
                            } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                                break;
                            }
                            i10++;
                            i12 = i13;
                        } else if (i11 == 0) {
                            z11 = true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return g.a(kotlin.text.b.w1(substring).toString(), str2);
            }
        }

        public C0004a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            int i12;
            this.f223a = str;
            this.f224b = str2;
            this.c = z10;
            this.f225d = i10;
            this.f226e = str3;
            this.f227f = i11;
            Locale locale = Locale.US;
            g.e(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            g.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (kotlin.text.b.Y0(upperCase, "INT", false)) {
                i12 = 3;
            } else {
                if (!kotlin.text.b.Y0(upperCase, "CHAR", false) && !kotlin.text.b.Y0(upperCase, "CLOB", false) && !kotlin.text.b.Y0(upperCase, "TEXT", false)) {
                    if (kotlin.text.b.Y0(upperCase, "BLOB", false)) {
                        i12 = 5;
                    } else {
                        if (!kotlin.text.b.Y0(upperCase, "REAL", false) && !kotlin.text.b.Y0(upperCase, "FLOA", false) && !kotlin.text.b.Y0(upperCase, "DOUB", false)) {
                            i12 = 1;
                        }
                        i12 = 4;
                    }
                }
                i12 = 2;
            }
            this.f228g = i12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
            if (r1 != null) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean z10;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0004a) {
                C0004a c0004a = (C0004a) obj;
                if (this.f225d != c0004a.f225d) {
                    return false;
                }
                if (g.a(this.f223a, c0004a.f223a) && this.c == c0004a.c) {
                    String str = c0004a.f226e;
                    int i10 = c0004a.f227f;
                    String str2 = this.f226e;
                    int i11 = this.f227f;
                    if (i11 != 1 || i10 != 2 || str2 == null || C0005a.a(str2, str)) {
                        if (i11 != 2 || i10 != 1 || str == null || C0005a.a(str, str2)) {
                            if (i11 != 0 && i11 == i10) {
                                if (str2 != null) {
                                    z10 = C0005a.a(str2, str) ? false : true;
                                }
                                if (z10) {
                                    return false;
                                }
                            }
                            return this.f228g == c0004a.f228g;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f223a.hashCode() * 31) + this.f228g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.f225d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f223a);
            sb.append("', type='");
            sb.append(this.f224b);
            sb.append("', affinity='");
            sb.append(this.f228g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f225d);
            sb.append(", defaultValue='");
            String str = this.f226e;
            if (str == null) {
                str = "undefined";
            }
            return e.k(sb, str, "'}");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f229a;

        /* renamed from: b  reason: collision with root package name */
        public final String f230b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f231d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f232e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            g.f(list, "columnNames");
            g.f(list2, "referenceColumnNames");
            this.f229a = str;
            this.f230b = str2;
            this.c = str3;
            this.f231d = list;
            this.f232e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (g.a(this.f229a, bVar.f229a) && g.a(this.f230b, bVar.f230b) && g.a(this.c, bVar.c) && g.a(this.f231d, bVar.f231d)) {
                    return g.a(this.f232e, bVar.f232e);
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int g10 = a4.b.g(this.c, a4.b.g(this.f230b, this.f229a.hashCode() * 31, 31), 31);
            return this.f232e.hashCode() + ((this.f231d.hashCode() + g10) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f229a + "', onDelete='" + this.f230b + " +', onUpdate='" + this.c + "', columnNames=" + this.f231d + ", referenceColumnNames=" + this.f232e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: i  reason: collision with root package name */
        public final int f233i;

        /* renamed from: j  reason: collision with root package name */
        public final int f234j;

        /* renamed from: k  reason: collision with root package name */
        public final String f235k;

        /* renamed from: l  reason: collision with root package name */
        public final String f236l;

        public c(int i10, int i11, String str, String str2) {
            this.f233i = i10;
            this.f234j = i11;
            this.f235k = str;
            this.f236l = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            g.f(cVar2, "other");
            int i10 = this.f233i - cVar2.f233i;
            if (i10 == 0) {
                return this.f234j - cVar2.f234j;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f237a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f238b;
        public final List<String> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f239d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(String str, boolean z10, List<String> list, List<String> list2) {
            g.f(list, "columns");
            g.f(list2, "orders");
            this.f237a = str;
            this.f238b = z10;
            this.c = list;
            this.f239d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add("ASC");
                }
            }
            this.f239d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f238b != dVar.f238b || !g.a(this.c, dVar.c) || !g.a(this.f239d, dVar.f239d)) {
                return false;
            }
            String str = this.f237a;
            boolean X0 = i.X0(str, "index_", false);
            String str2 = dVar.f237a;
            if (X0) {
                return i.X0(str2, "index_", false);
            }
            return g.a(str, str2);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f237a;
            if (i.X0(str, "index_", false)) {
                hashCode = -1184239155;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = this.c.hashCode();
            return this.f239d.hashCode() + ((hashCode2 + (((hashCode * 31) + (this.f238b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f237a + "', unique=" + this.f238b + ", columns=" + this.c + ", orders=" + this.f239d + "'}";
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f220a = str;
        this.f221b = map;
        this.c = abstractSet;
        this.f222d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x030c, code lost:
        a1.c.T(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x030f, code lost:
        m0.b.D(r2, null);
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2 A[Catch: all -> 0x0322, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0322, blocks: (B:45:0x01e7, B:50:0x0200, B:51:0x0205, B:53:0x020b, B:56:0x0218, B:60:0x0226, B:80:0x02d9, B:85:0x02f2, B:81:0x02de, B:94:0x030c, B:61:0x023e, B:67:0x0261, B:68:0x026d, B:70:0x0273, B:73:0x027a, B:77:0x028f, B:78:0x02b3), top: B:125:0x01e7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) {
        Map map;
        boolean z10;
        SetBuilder setBuilder;
        boolean z11;
        int i10;
        String str2;
        int i11;
        int i12;
        Throwable th;
        d dVar;
        String str3;
        boolean z12;
        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str4 = "`)";
        sb.append("`)");
        Cursor c10 = frameworkSQLiteDatabase2.c(sb.toString());
        try {
            String str5 = "name";
            if (c10.getColumnCount() <= 0) {
                map = kotlin.collections.d.K1();
            } else {
                int columnIndex = c10.getColumnIndex("name");
                int columnIndex2 = c10.getColumnIndex("type");
                int columnIndex3 = c10.getColumnIndex("notnull");
                int columnIndex4 = c10.getColumnIndex("pk");
                int columnIndex5 = c10.getColumnIndex("dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                while (c10.moveToNext()) {
                    String string = c10.getString(columnIndex);
                    String string2 = c10.getString(columnIndex2);
                    if (c10.getInt(columnIndex3) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = c10.getInt(columnIndex4);
                    String string3 = c10.getString(columnIndex5);
                    g.e(string, "name");
                    g.e(string2, "type");
                    mapBuilder.put(string, new C0004a(string, string2, z10, i13, string3, 2));
                    columnIndex = columnIndex;
                }
                mapBuilder.b();
                mapBuilder.f13010t = true;
                map = mapBuilder;
            }
            m0.b.D(c10, null);
            c10 = frameworkSQLiteDatabase2.c("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = c10.getColumnIndex("id");
                int columnIndex7 = c10.getColumnIndex("seq");
                int columnIndex8 = c10.getColumnIndex("table");
                int columnIndex9 = c10.getColumnIndex("on_delete");
                int columnIndex10 = c10.getColumnIndex("on_update");
                int columnIndex11 = c10.getColumnIndex("id");
                int columnIndex12 = c10.getColumnIndex("seq");
                int columnIndex13 = c10.getColumnIndex("from");
                int columnIndex14 = c10.getColumnIndex("to");
                ListBuilder listBuilder = new ListBuilder();
                while (c10.moveToNext()) {
                    String str6 = str5;
                    int i14 = c10.getInt(columnIndex11);
                    int i15 = columnIndex11;
                    int i16 = c10.getInt(columnIndex12);
                    int i17 = columnIndex12;
                    String string4 = c10.getString(columnIndex13);
                    int i18 = columnIndex13;
                    g.e(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = c10.getString(columnIndex14);
                    g.e(string5, "cursor.getString(toColumnIndex)");
                    listBuilder.add(new c(i14, i16, string4, string5));
                    map = map;
                    str5 = str6;
                    columnIndex11 = i15;
                    columnIndex12 = i17;
                    columnIndex13 = i18;
                    columnIndex14 = columnIndex14;
                }
                Map map2 = map;
                String str7 = str5;
                a1.c.S(listBuilder);
                List F2 = kotlin.collections.c.F2(listBuilder);
                c10.moveToPosition(-1);
                SetBuilder setBuilder2 = new SetBuilder();
                while (c10.moveToNext()) {
                    if (c10.getInt(columnIndex7) == 0) {
                        int i19 = c10.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : F2) {
                            List list = F2;
                            if (((c) obj).f233i == i19) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList3.add(obj);
                            }
                            F2 = list;
                        }
                        List list2 = F2;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f235k);
                            arrayList2.add(cVar.f236l);
                        }
                        String string6 = c10.getString(columnIndex8);
                        g.e(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = c10.getString(columnIndex9);
                        g.e(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = c10.getString(columnIndex10);
                        g.e(string8, "cursor.getString(onUpdateColumnIndex)");
                        setBuilder2.add(new b(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        F2 = list2;
                    }
                }
                a1.c.T(setBuilder2);
                m0.b.D(c10, null);
                c10 = frameworkSQLiteDatabase2.c("PRAGMA index_list(`" + str + "`)");
                String str8 = str7;
                try {
                    int columnIndex15 = c10.getColumnIndex(str8);
                    int columnIndex16 = c10.getColumnIndex("origin");
                    int columnIndex17 = c10.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        SetBuilder setBuilder3 = new SetBuilder();
                        while (true) {
                            if (!c10.moveToNext()) {
                                break;
                            } else if (g.a("c", c10.getString(columnIndex16))) {
                                String string9 = c10.getString(columnIndex15);
                                if (c10.getInt(columnIndex17) == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                g.e(string9, str8);
                                Cursor c11 = frameworkSQLiteDatabase2.c("PRAGMA index_xinfo(`" + string9 + str4);
                                int columnIndex18 = c11.getColumnIndex("seqno");
                                int columnIndex19 = c11.getColumnIndex("cid");
                                int columnIndex20 = c11.getColumnIndex(str8);
                                int columnIndex21 = c11.getColumnIndex("desc");
                                String str9 = str8;
                                if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1 && columnIndex21 != -1) {
                                    TreeMap treeMap = new TreeMap();
                                    i10 = columnIndex15;
                                    TreeMap treeMap2 = new TreeMap();
                                    while (c11.moveToNext()) {
                                        if (c11.getInt(columnIndex19) >= 0) {
                                            int i20 = c11.getInt(columnIndex18);
                                            String str10 = str4;
                                            String string10 = c11.getString(columnIndex20);
                                            if (c11.getInt(columnIndex21) > 0) {
                                                str3 = "DESC";
                                            } else {
                                                str3 = "ASC";
                                            }
                                            int i21 = columnIndex21;
                                            String str11 = str3;
                                            int i22 = columnIndex16;
                                            Integer valueOf = Integer.valueOf(i20);
                                            g.e(string10, "columnName");
                                            treeMap.put(valueOf, string10);
                                            treeMap2.put(Integer.valueOf(i20), str11);
                                            str4 = str10;
                                            columnIndex16 = i22;
                                            columnIndex21 = i21;
                                            columnIndex17 = columnIndex17;
                                        }
                                    }
                                    str2 = str4;
                                    i11 = columnIndex16;
                                    i12 = columnIndex17;
                                    Collection values = treeMap.values();
                                    g.e(values, "columnsMap.values");
                                    List L2 = kotlin.collections.c.L2(values);
                                    Collection values2 = treeMap2.values();
                                    g.e(values2, "ordersMap.values");
                                    dVar = new d(string9, z11, L2, kotlin.collections.c.L2(values2));
                                    m0.b.D(c11, null);
                                    th = null;
                                    if (dVar != null) {
                                        m0.b.D(c10, th);
                                        setBuilder = null;
                                        break;
                                    }
                                    setBuilder3.add(dVar);
                                    frameworkSQLiteDatabase2 = frameworkSQLiteDatabase;
                                    str8 = str9;
                                    columnIndex15 = i10;
                                    str4 = str2;
                                    columnIndex16 = i11;
                                    columnIndex17 = i12;
                                }
                                i10 = columnIndex15;
                                str2 = str4;
                                i11 = columnIndex16;
                                i12 = columnIndex17;
                                th = null;
                                m0.b.D(c11, null);
                                dVar = null;
                                if (dVar != null) {
                                }
                            }
                        }
                        return new a(str, map2, setBuilder2, setBuilder);
                    }
                    m0.b.D(c10, null);
                    setBuilder = null;
                    return new a(str, map2, setBuilder2, setBuilder);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (g.a(this.f220a, aVar.f220a) && g.a(this.f221b, aVar.f221b) && g.a(this.c, aVar.c)) {
                Set<d> set2 = this.f222d;
                if (set2 != null && (set = aVar.f222d) != null) {
                    return g.a(set2, set);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f221b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.f220a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f220a + "', columns=" + this.f221b + ", foreignKeys=" + this.c + ", indices=" + this.f222d + '}';
    }
}
