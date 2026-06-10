package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.activity.e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import c4.c;
import ha.i;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import v7.g;
import y3.f;
import y3.h;
import y3.n;
import y3.p;

/* loaded from: classes.dex */
public abstract class RoomDatabase {

    /* renamed from: a  reason: collision with root package name */
    public volatile c4.b f6027a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f6028b;
    public p c;

    /* renamed from: d  reason: collision with root package name */
    public c4.c f6029d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6031f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends b> f6032g;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f6036k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f6037l;

    /* renamed from: e  reason: collision with root package name */
    public final f f6030e = d();

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f6033h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f6034i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal<Integer> f6035j = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "room-runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* loaded from: classes.dex */
    public static class a<T extends RoomDatabase> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6042a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f6043b;
        public final String c;

        /* renamed from: g  reason: collision with root package name */
        public Executor f6047g;

        /* renamed from: h  reason: collision with root package name */
        public Executor f6048h;

        /* renamed from: i  reason: collision with root package name */
        public c.InterfaceC0055c f6049i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6050j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f6053m;

        /* renamed from: q  reason: collision with root package name */
        public HashSet f6056q;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f6044d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f6045e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f6046f = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        public final JournalMode f6051k = JournalMode.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6052l = true;
        public final long n = -1;

        /* renamed from: o  reason: collision with root package name */
        public final c f6054o = new c();

        /* renamed from: p  reason: collision with root package name */
        public final LinkedHashSet f6055p = new LinkedHashSet();

        public a(Context context, Class<T> cls, String str) {
            this.f6042a = context;
            this.f6043b = cls;
            this.c = str;
        }

        public final void a(z3.b... bVarArr) {
            if (this.f6056q == null) {
                this.f6056q = new HashSet();
            }
            for (z3.b bVar : bVarArr) {
                HashSet hashSet = this.f6056q;
                g.c(hashSet);
                hashSet.add(Integer.valueOf(bVar.f19115a));
                HashSet hashSet2 = this.f6056q;
                g.c(hashSet2);
                hashSet2.add(Integer.valueOf(bVar.f19116b));
            }
            this.f6054o.a((z3.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }

        /* JADX WARN: Removed duplicated region for block: B:163:0x03de  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final T b() {
            Executor executor;
            HashSet hashSet;
            c.InterfaceC0055c interfaceC0055c;
            JournalMode journalMode;
            Executor executor2;
            boolean z10;
            boolean z11;
            String str;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Executor executor3 = this.f6047g;
            if (executor3 == null && this.f6048h == null) {
                executor = k.c.f12823k;
                this.f6048h = executor;
            } else {
                if (executor3 != null && this.f6048h == null) {
                    this.f6048h = executor3;
                } else if (executor3 == null) {
                    executor = this.f6048h;
                }
                hashSet = this.f6056q;
                LinkedHashSet linkedHashSet = this.f6055p;
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                            throw new IllegalArgumentException(e.g("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                        }
                    }
                }
                interfaceC0055c = this.f6049i;
                if (interfaceC0055c == null) {
                    interfaceC0055c = new a1.c();
                }
                c.InterfaceC0055c interfaceC0055c2 = interfaceC0055c;
                if (this.n <= 0) {
                    if (this.c != null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                }
                String str2 = this.c;
                c cVar = this.f6054o;
                ArrayList arrayList = this.f6044d;
                boolean z16 = this.f6050j;
                JournalMode journalMode2 = this.f6051k;
                journalMode2.getClass();
                Context context = this.f6042a;
                g.f(context, "context");
                JournalMode journalMode3 = JournalMode.AUTOMATIC;
                JournalMode journalMode4 = JournalMode.WRITE_AHEAD_LOGGING;
                if (journalMode2 == journalMode3) {
                    Object systemService = context.getSystemService("activity");
                    g.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    if (!((ActivityManager) systemService).isLowRamDevice()) {
                        journalMode = journalMode4;
                        executor2 = this.f6047g;
                        if (executor2 == null) {
                            Executor executor4 = this.f6048h;
                            if (executor4 != null) {
                                y3.a aVar = new y3.a(context, str2, interfaceC0055c2, cVar, arrayList, z16, journalMode, executor2, executor4, this.f6052l, this.f6053m, linkedHashSet, this.f6045e, this.f6046f);
                                Class<T> cls = this.f6043b;
                                g.f(cls, "klass");
                                Package r52 = cls.getPackage();
                                g.c(r52);
                                String name = r52.getName();
                                String canonicalName = cls.getCanonicalName();
                                g.c(canonicalName);
                                g.e(name, "fullPackage");
                                if (name.length() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    canonicalName = canonicalName.substring(name.length() + 1);
                                    g.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                                }
                                String concat = i.V0(canonicalName, '.', '_').concat("_Impl");
                                try {
                                    if (name.length() == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        str = concat;
                                    } else {
                                        str = name + '.' + concat;
                                    }
                                    Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
                                    g.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                                    T t10 = (T) cls2.newInstance();
                                    t10.getClass();
                                    t10.f6029d = t10.e(aVar);
                                    Set<Class<? extends z3.a>> h10 = t10.h();
                                    BitSet bitSet = new BitSet();
                                    Iterator<Class<? extends z3.a>> it2 = h10.iterator();
                                    while (true) {
                                        boolean hasNext = it2.hasNext();
                                        LinkedHashMap linkedHashMap = t10.f6033h;
                                        int i10 = -1;
                                        List<z3.a> list = aVar.f18823p;
                                        if (hasNext) {
                                            Class<? extends z3.a> next = it2.next();
                                            int size = list.size() - 1;
                                            if (size >= 0) {
                                                while (true) {
                                                    int i11 = size - 1;
                                                    if (next.isAssignableFrom(list.get(size).getClass())) {
                                                        bitSet.set(size);
                                                        i10 = size;
                                                        break;
                                                    } else if (i11 < 0) {
                                                        break;
                                                    } else {
                                                        size = i11;
                                                    }
                                                }
                                            }
                                            if (i10 >= 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z15) {
                                                linkedHashMap.put(next, list.get(i10));
                                            } else {
                                                throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                                            }
                                        } else {
                                            int size2 = list.size() - 1;
                                            if (size2 >= 0) {
                                                while (true) {
                                                    int i12 = size2 - 1;
                                                    if (bitSet.get(size2)) {
                                                        if (i12 < 0) {
                                                            break;
                                                        }
                                                        size2 = i12;
                                                    } else {
                                                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                                    }
                                                }
                                            }
                                            for (z3.b bVar : t10.f(linkedHashMap)) {
                                                int i13 = bVar.f19115a;
                                                c cVar2 = aVar.f18812d;
                                                LinkedHashMap linkedHashMap2 = cVar2.f6057a;
                                                if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                                                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                                                    if (map == null) {
                                                        map = d.K1();
                                                    }
                                                    z14 = map.containsKey(Integer.valueOf(bVar.f19116b));
                                                } else {
                                                    z14 = false;
                                                }
                                                if (!z14) {
                                                    cVar2.a(bVar);
                                                }
                                            }
                                            n nVar = (n) RoomDatabase.q(n.class, t10.g());
                                            if (nVar != null) {
                                                nVar.f18877i = aVar;
                                            }
                                            androidx.room.a aVar2 = (androidx.room.a) RoomDatabase.q(androidx.room.a.class, t10.g());
                                            f fVar = t10.f6030e;
                                            if (aVar2 != null) {
                                                fVar.getClass();
                                                g.f(null, "autoCloser");
                                            }
                                            if (aVar.f18815g == journalMode4) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            t10.g().setWriteAheadLoggingEnabled(z12);
                                            t10.f6032g = aVar.f18813e;
                                            t10.f6028b = aVar.f18816h;
                                            t10.c = new p(aVar.f18817i);
                                            t10.f6031f = aVar.f18814f;
                                            Intent intent = aVar.f18818j;
                                            if (intent != null) {
                                                String str3 = aVar.f18811b;
                                                if (str3 != null) {
                                                    fVar.getClass();
                                                    Context context2 = aVar.f18810a;
                                                    g.f(context2, "context");
                                                    Executor executor5 = fVar.f18828a.f6028b;
                                                    if (executor5 != null) {
                                                        new h(context2, str3, intent, fVar, executor5);
                                                    } else {
                                                        g.l("internalQueryExecutor");
                                                        throw null;
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Required value was null.".toString());
                                                }
                                            }
                                            Map<Class<?>, List<Class<?>>> i14 = t10.i();
                                            BitSet bitSet2 = new BitSet();
                                            Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = i14.entrySet().iterator();
                                            while (true) {
                                                boolean hasNext2 = it3.hasNext();
                                                List<Object> list2 = aVar.f18822o;
                                                if (hasNext2) {
                                                    Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                                                    Class<?> key = next2.getKey();
                                                    for (Class<?> cls3 : next2.getValue()) {
                                                        int size3 = list2.size() - 1;
                                                        if (size3 >= 0) {
                                                            while (true) {
                                                                int i15 = size3 - 1;
                                                                if (cls3.isAssignableFrom(list2.get(size3).getClass())) {
                                                                    bitSet2.set(size3);
                                                                    break;
                                                                } else if (i15 < 0) {
                                                                    break;
                                                                } else {
                                                                    size3 = i15;
                                                                }
                                                            }
                                                        }
                                                        size3 = -1;
                                                        if (size3 >= 0) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        if (z13) {
                                                            t10.f6037l.put(cls3, list2.get(size3));
                                                        } else {
                                                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                                        }
                                                    }
                                                } else {
                                                    int size4 = list2.size() - 1;
                                                    if (size4 >= 0) {
                                                        while (true) {
                                                            int i16 = size4 - 1;
                                                            if (bitSet2.get(size4)) {
                                                                if (i16 < 0) {
                                                                    break;
                                                                }
                                                                size4 = i16;
                                                            } else {
                                                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                            }
                                                        }
                                                    }
                                                    return t10;
                                                }
                                            }
                                        }
                                    }
                                } catch (ClassNotFoundException unused) {
                                    throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
                                } catch (IllegalAccessException unused2) {
                                    throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
                                } catch (InstantiationException unused3) {
                                    throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        journalMode2 = JournalMode.TRUNCATE;
                    }
                }
                journalMode = journalMode2;
                executor2 = this.f6047g;
                if (executor2 == null) {
                }
            }
            this.f6047g = executor;
            hashSet = this.f6056q;
            LinkedHashSet linkedHashSet2 = this.f6055p;
            if (hashSet != null) {
            }
            interfaceC0055c = this.f6049i;
            if (interfaceC0055c == null) {
            }
            c.InterfaceC0055c interfaceC0055c22 = interfaceC0055c;
            if (this.n <= 0) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f6057a = new LinkedHashMap();

        public final void a(z3.b... bVarArr) {
            g.f(bVarArr, "migrations");
            for (z3.b bVar : bVarArr) {
                int i10 = bVar.f19115a;
                LinkedHashMap linkedHashMap = this.f6057a;
                Integer valueOf = Integer.valueOf(i10);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                int i11 = bVar.f19116b;
                if (treeMap.containsKey(Integer.valueOf(i11))) {
                    Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + bVar);
                }
                treeMap.put(Integer.valueOf(i11), bVar);
            }
        }
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        g.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f6036k = synchronizedMap;
        this.f6037l = new LinkedHashMap();
    }

    public static Object q(Class cls, c4.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof y3.b) {
            return q(cls, ((y3.b) cVar).a());
        }
        return null;
    }

    public final void a() {
        boolean z10;
        if (this.f6031f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        if (!j() && this.f6035j.get() != null) {
            z10 = false;
            if (z10) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
            }
            return;
        }
        z10 = true;
        if (z10) {
        }
    }

    public final void c() {
        a();
        a();
        c4.b L = g().L();
        this.f6030e.e(L);
        if (L.t()) {
            L.B();
        } else {
            L.e();
        }
    }

    public abstract f d();

    public abstract c4.c e(y3.a aVar);

    public List f(LinkedHashMap linkedHashMap) {
        g.f(linkedHashMap, "autoMigrationSpecs");
        return EmptyList.f12981i;
    }

    public final c4.c g() {
        c4.c cVar = this.f6029d;
        if (cVar != null) {
            return cVar;
        }
        g.l("internalOpenHelper");
        throw null;
    }

    public Set<Class<? extends z3.a>> h() {
        return EmptySet.f12983i;
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return d.K1();
    }

    public final boolean j() {
        return g().L().s();
    }

    public final void k() {
        g().L().d();
        if (!j()) {
            f fVar = this.f6030e;
            if (fVar.f18832f.compareAndSet(false, true)) {
                Executor executor = fVar.f18828a.f6028b;
                if (executor != null) {
                    executor.execute(fVar.f18839m);
                } else {
                    g.l("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final void l(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        f fVar = this.f6030e;
        fVar.getClass();
        synchronized (fVar.f18838l) {
            if (fVar.f18833g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                frameworkSQLiteDatabase.g("PRAGMA temp_store = MEMORY;");
                frameworkSQLiteDatabase.g("PRAGMA recursive_triggers='ON';");
                frameworkSQLiteDatabase.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                fVar.e(frameworkSQLiteDatabase);
                fVar.f18834h = frameworkSQLiteDatabase.l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                fVar.f18833g = true;
                m7.n nVar = m7.n.f16010a;
            }
        }
    }

    public final boolean m() {
        c4.b bVar = this.f6027a;
        return g.a(bVar != null ? Boolean.valueOf(bVar.isOpen()) : null, Boolean.TRUE);
    }

    public final Cursor n(c4.e eVar, CancellationSignal cancellationSignal) {
        g.f(eVar, "query");
        a();
        b();
        return cancellationSignal != null ? g().L().f(eVar, cancellationSignal) : g().L().n(eVar);
    }

    public final <V> V o(Callable<V> callable) {
        c();
        try {
            V call = callable.call();
            p();
            return call;
        } finally {
            k();
        }
    }

    public final void p() {
        g().L().x();
    }
}
