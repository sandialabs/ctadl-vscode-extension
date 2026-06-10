package y3;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes.dex */
public final class f {
    public static final String[] n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f18828a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f18829b;
    public final Map<String, Set<String>> c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f18830d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f18831e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f18832f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f18833g;

    /* renamed from: h  reason: collision with root package name */
    public volatile c4.f f18834h;

    /* renamed from: i  reason: collision with root package name */
    public final b f18835i;

    /* renamed from: j  reason: collision with root package name */
    public final l.b<c, d> f18836j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f18837k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f18838l;

    /* renamed from: m  reason: collision with root package name */
    public final g f18839m;

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(String str, String str2) {
            v7.g.f(str, "tableName");
            v7.g.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f18840a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f18841b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f18842d;

        public b(int i10) {
            this.f18840a = new long[i10];
            this.f18841b = new boolean[i10];
            this.c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                if (this.f18842d) {
                    long[] jArr = this.f18840a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f18841b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f18842d = false;
                    return (int[]) this.c.clone();
                }
                return null;
            }
        }

        public final boolean b(int... iArr) {
            boolean z10;
            v7.g.f(iArr, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f18840a;
                    long j2 = jArr[i10];
                    jArr[i10] = 1 + j2;
                    if (j2 == 0) {
                        z10 = true;
                        this.f18842d = true;
                    }
                }
                m7.n nVar = m7.n.f16010a;
            }
            return z10;
        }

        public final boolean c(int... iArr) {
            boolean z10;
            v7.g.f(iArr, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f18840a;
                    long j2 = jArr[i10];
                    jArr[i10] = j2 - 1;
                    if (j2 == 1) {
                        z10 = true;
                        this.f18842d = true;
                    }
                }
                m7.n nVar = m7.n.f16010a;
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f18841b, false);
                this.f18842d = true;
                m7.n nVar = m7.n.f16010a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f18843a;

        public c(String[] strArr) {
            v7.g.f(strArr, "tables");
            this.f18843a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f18844a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f18845b;
        public final String[] c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f18846d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z10;
            Set<String> set;
            v7.g.f(cVar, "observer");
            this.f18844a = cVar;
            this.f18845b = iArr;
            this.c = strArr;
            boolean z11 = true;
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                set = a1.c.v1(strArr[0]);
            } else {
                set = EmptySet.f12983i;
            }
            this.f18846d = set;
            if (iArr.length != strArr.length) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.builders.SetBuilder] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Set<Integer> set) {
            Set set2;
            v7.g.f(set, "invalidatedTablesIds");
            int[] iArr = this.f18845b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    ?? setBuilder = new SetBuilder();
                    int length2 = iArr.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr[i10]))) {
                            setBuilder.add(this.c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    a1.c.T(setBuilder);
                    set2 = setBuilder;
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f18846d;
                }
                if (!(!set2.isEmpty())) {
                    this.f18844a.a(set2);
                    return;
                }
                return;
            }
            set2 = EmptySet.f12983i;
            if (!(!set2.isEmpty())) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.builders.SetBuilder] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(String[] strArr) {
            Set set;
            String[] strArr2 = this.c;
            int length = strArr2.length;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    ?? setBuilder = new SetBuilder();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (ha.i.S0(str2, str)) {
                                setBuilder.add(str2);
                            }
                        }
                    }
                    a1.c.T(setBuilder);
                    set = setBuilder;
                } else {
                    int length2 = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            break;
                        } else if (ha.i.S0(strArr[i10], strArr2[0])) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (z10) {
                        set = this.f18846d;
                    }
                }
                if (!(!set.isEmpty())) {
                    this.f18844a.a(set);
                    return;
                }
                return;
            }
            set = EmptySet.f12983i;
            if (!(!set.isEmpty())) {
            }
        }
    }

    public f(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        v7.g.f(roomDatabase, "database");
        this.f18828a = roomDatabase;
        this.f18829b = hashMap;
        this.c = hashMap2;
        this.f18832f = new AtomicBoolean(false);
        this.f18835i = new b(strArr.length);
        v7.g.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f18836j = new l.b<>();
        this.f18837k = new Object();
        this.f18838l = new Object();
        this.f18830d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            v7.g.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            v7.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f18830d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f18829b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                v7.g.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f18831e = strArr2;
        for (Map.Entry<String, String> entry : this.f18829b.entrySet()) {
            Locale locale2 = Locale.US;
            v7.g.e(locale2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            v7.g.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f18830d.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                v7.g.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f18830d;
                linkedHashMap.put(lowerCase3, kotlin.collections.d.L1(lowerCase2, linkedHashMap));
            }
        }
        this.f18839m = new g(this);
    }

    @SuppressLint({"RestrictedApi"})
    public final void a(c cVar) {
        d d5;
        v7.g.f(cVar, "observer");
        String[] strArr = cVar.f18843a;
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Locale locale = Locale.US;
            v7.g.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            v7.g.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                v7.g.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map.get(lowerCase2);
                v7.g.c(set);
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        a1.c.T(setBuilder);
        Object[] array = setBuilder.toArray(new String[0]);
        v7.g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr2 = (String[]) array;
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.f18830d;
            Locale locale2 = Locale.US;
            v7.g.e(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            v7.g.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
        }
        int[] K2 = kotlin.collections.c.K2(arrayList);
        d dVar = new d(cVar, K2, strArr2);
        synchronized (this.f18836j) {
            d5 = this.f18836j.d(cVar, dVar);
        }
        if (d5 == null && this.f18835i.b(Arrays.copyOf(K2, K2.length))) {
            RoomDatabase roomDatabase = this.f18828a;
            if (roomDatabase.m()) {
                e(roomDatabase.g().L());
            }
        }
    }

    public final boolean b() {
        if (this.f18828a.m()) {
            if (!this.f18833g) {
                this.f18828a.g().L();
            }
            if (this.f18833g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(c cVar) {
        d g10;
        v7.g.f(cVar, "observer");
        synchronized (this.f18836j) {
            g10 = this.f18836j.g(cVar);
        }
        if (g10 != null) {
            b bVar = this.f18835i;
            int[] iArr = g10.f18845b;
            if (bVar.c(Arrays.copyOf(iArr, iArr.length))) {
                RoomDatabase roomDatabase = this.f18828a;
                if (roomDatabase.m()) {
                    e(roomDatabase.g().L());
                }
            }
        }
    }

    public final void d(c4.b bVar, int i10) {
        String str;
        bVar.g("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str2 = this.f18831e[i10];
        String[] strArr = n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str2, str) + " AFTER " + strArr[i11] + " ON `" + str2 + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            v7.g.e(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.g(str3);
        }
    }

    public final void e(c4.b bVar) {
        v7.g.f(bVar, "database");
        if (bVar.s()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f18828a.f6034i.readLock();
            v7.g.e(readLock, "readWriteLock.readLock()");
            readLock.lock();
            synchronized (this.f18837k) {
                int[] a10 = this.f18835i.a();
                if (a10 == null) {
                    readLock.unlock();
                    return;
                }
                if (bVar.t()) {
                    bVar.B();
                } else {
                    bVar.e();
                }
                int length = a10.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = a10[i10];
                    int i13 = i11 + 1;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            String str = this.f18831e[i11];
                            String[] strArr = n;
                            for (int i14 = 0; i14 < 3; i14++) {
                                String str2 = strArr[i14];
                                String str3 = "DROP TRIGGER IF EXISTS " + a.a(str, str2);
                                v7.g.e(str3, "StringBuilder().apply(builderAction).toString()");
                                bVar.g(str3);
                            }
                        }
                    } else {
                        d(bVar, i11);
                    }
                    i10++;
                    i11 = i13;
                }
                bVar.x();
                bVar.d();
                m7.n nVar = m7.n.f16010a;
                readLock.unlock();
            }
        } catch (SQLiteException e10) {
            e = e10;
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e11) {
            e = e11;
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }
    }
}
