package kotlin.reflect.jvm.internal.impl.storage;

import androidx.datastore.preferences.PreferencesProto$Value;
import fa.e;
import g0.e1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public class LockBasedStorageManager implements x9.h {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14903d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f14904e;

    /* renamed from: a  reason: collision with root package name */
    public final x9.g f14905a;

    /* renamed from: b  reason: collision with root package name */
    public final d f14906b;
    public final String c;

    /* loaded from: classes.dex */
    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* loaded from: classes.dex */
    public static class a extends LockBasedStorageManager {
        public a() {
            super("NO_LOCKS", ma.i.f16056x);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public final l k(Object obj, String str) {
            return new l(null, true);
        }
    }

    /* loaded from: classes.dex */
    public static class b<K, V> extends c<K, V> implements x9.a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap);
            if (lockBasedStorageManager != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(format);
            }
        }

        public final V d(K k3, u7.a<? extends V> aVar) {
            V U = U(new e(k3, aVar));
            if (U != null) {
                return U;
            }
            a(3);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> extends j<e<K, V>, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new kotlin.reflect.jvm.internal.impl.storage.c());
            if (lockBasedStorageManager != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14911a = new a();

        /* loaded from: classes.dex */
        public static class a implements d {
        }
    }

    /* loaded from: classes.dex */
    public static class e<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f14912a;

        /* renamed from: b  reason: collision with root package name */
        public final u7.a<? extends V> f14913b;

        public e(K k3, u7.a<? extends V> aVar) {
            this.f14912a = k3;
            this.f14913b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && e.class == obj.getClass() && this.f14912a.equals(((e) obj).f14912a);
        }

        public final int hashCode() {
            return this.f14912a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class f<T> implements x9.f<T> {

        /* renamed from: i  reason: collision with root package name */
        public final LockBasedStorageManager f14914i;

        /* renamed from: j  reason: collision with root package name */
        public final u7.a<? extends T> f14915j;

        /* renamed from: k  reason: collision with root package name */
        public volatile Object f14916k;

        public f(LockBasedStorageManager lockBasedStorageManager, u7.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar == null) {
                a(1);
                throw null;
            } else {
                this.f14916k = NotValue.NOT_COMPUTED;
                this.f14914i = lockBasedStorageManager;
                this.f14915j = aVar;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final boolean b() {
            return (this.f14916k == NotValue.NOT_COMPUTED || this.f14916k == NotValue.COMPUTING) ? false : true;
        }

        public void c(T t10) {
        }

        public l<T> d(boolean z10) {
            l<T> k3 = this.f14914i.k(null, "in a lazy value");
            if (k3 != null) {
                return k3;
            }
            a(2);
            throw null;
        }

        @Override // u7.a
        public T k0() {
            T t10 = (T) this.f14916k;
            if (!(t10 instanceof NotValue)) {
                fa.e.a(t10);
                return t10;
            }
            this.f14914i.f14905a.lock();
            try {
                T t11 = (T) this.f14916k;
                if (!(t11 instanceof NotValue)) {
                    fa.e.a(t11);
                } else {
                    NotValue notValue = NotValue.COMPUTING;
                    NotValue notValue2 = NotValue.RECURSION_WAS_DETECTED;
                    if (t11 == notValue) {
                        this.f14916k = notValue2;
                        l<T> d5 = d(true);
                        if (!d5.f14922b) {
                            t11 = d5.f14921a;
                        }
                    }
                    if (t11 == notValue2) {
                        l<T> d10 = d(false);
                        if (!d10.f14922b) {
                            t11 = d10.f14921a;
                        }
                    }
                    this.f14916k = notValue;
                    t11 = this.f14915j.k0();
                    c(t11);
                    this.f14916k = t11;
                }
                return t11;
            } finally {
                this.f14914i.f14905a.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<T> extends f<T> {

        /* renamed from: l  reason: collision with root package name */
        public volatile e1 f14917l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LockBasedStorageManager lockBasedStorageManager, u7.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            this.f14917l = null;
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f
        public final void c(T t10) {
            this.f14917l = new e1(t10);
            try {
                kotlin.reflect.jvm.internal.impl.storage.b bVar = (kotlin.reflect.jvm.internal.impl.storage.b) this;
                if (t10 != null) {
                    bVar.n.U(t10);
                    this.f14917l = null;
                    return;
                }
                kotlin.reflect.jvm.internal.impl.storage.b.a(2);
                throw null;
            } catch (Throwable th) {
                this.f14917l = null;
                throw th;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f, u7.a
        public T k0() {
            boolean z10;
            e1 e1Var = this.f14917l;
            if (e1Var != null) {
                boolean z11 = true;
                if (((Thread) e1Var.f11042a) == Thread.currentThread()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (((Thread) e1Var.f11042a) != Thread.currentThread()) {
                        z11 = false;
                    }
                    if (z11) {
                        return (T) e1Var.f11043b;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return (T) super.k0();
        }
    }

    /* loaded from: classes.dex */
    public static class h<T> extends f<T> implements x9.e<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockBasedStorageManager lockBasedStorageManager, u7.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f, u7.a
        public final T k0() {
            T t10 = (T) super.k0();
            if (t10 != null) {
                return t10;
            }
            a(2);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i<T> extends g<T> implements x9.e<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LockBasedStorageManager lockBasedStorageManager, u7.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f, u7.a
        public final T k0() {
            T t10 = (T) super.k0();
            if (t10 != null) {
                return t10;
            }
            a(2);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class j<K, V> implements x9.d<K, V> {

        /* renamed from: i  reason: collision with root package name */
        public final LockBasedStorageManager f14918i;

        /* renamed from: j  reason: collision with root package name */
        public final ConcurrentMap<K, Object> f14919j;

        /* renamed from: k  reason: collision with root package name */
        public final u7.l<? super K, ? extends V> f14920k;

        public j(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, u7.l lVar) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            this.f14918i = lockBasedStorageManager;
            this.f14919j = concurrentHashMap;
            this.f14920k = lVar;
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // u7.l
        public V U(K k3) {
            V v3;
            ConcurrentMap<K, Object> concurrentMap = this.f14919j;
            V v10 = (V) concurrentMap.get(k3);
            NotValue notValue = NotValue.COMPUTING;
            e.a aVar = fa.e.f11023a;
            Object obj = null;
            if (v10 != null && v10 != notValue) {
                fa.e.a(v10);
                if (v10 == aVar) {
                    return null;
                }
                return v10;
            }
            LockBasedStorageManager lockBasedStorageManager = this.f14918i;
            x9.g gVar = lockBasedStorageManager.f14905a;
            x9.g gVar2 = lockBasedStorageManager.f14905a;
            gVar.lock();
            try {
                Object obj2 = concurrentMap.get(k3);
                NotValue notValue2 = NotValue.RECURSION_WAS_DETECTED;
                if (obj2 == notValue) {
                    l k10 = lockBasedStorageManager.k(k3, "");
                    if (k10 != null) {
                        if (!k10.f14922b) {
                            v3 = (V) k10.f14921a;
                            return v3;
                        }
                        obj2 = notValue2;
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 == notValue2) {
                    l k11 = lockBasedStorageManager.k(k3, "");
                    if (k11 != null) {
                        if (!k11.f14922b) {
                            v3 = (V) k11.f14921a;
                            return v3;
                        }
                    } else {
                        a(3);
                        throw null;
                    }
                }
                if (obj2 != null) {
                    fa.e.a(obj2);
                    if (obj2 != aVar) {
                        obj = obj2;
                    }
                    v3 = (V) obj;
                    return v3;
                }
                concurrentMap.put(k3, notValue);
                V U = this.f14920k.U(k3);
                if (U != 0) {
                    aVar = U;
                }
                Object put = concurrentMap.put(k3, aVar);
                if (put == notValue) {
                    return U;
                }
                throw c(k3, put);
            } finally {
                gVar2.unlock();
            }
        }

        public final boolean b(K k3) {
            Object obj = this.f14919j.get(k3);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        public final AssertionError c(K k3, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k3 + ". Old value is " + obj + " under " + this.f14918i);
            LockBasedStorageManager.l(assertionError);
            return assertionError;
        }
    }

    /* loaded from: classes.dex */
    public static class k<K, V> extends j<K, V> implements x9.c<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, u7.l lVar) {
            super(lockBasedStorageManager, concurrentHashMap, lVar);
            if (lockBasedStorageManager != null) {
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.j, u7.l
        public final V U(K k3) {
            V v3 = (V) super.U(k3);
            if (v3 != null) {
                return v3;
            }
            a(3);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class l<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f14921a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14922b;

        public l(T t10, boolean z10) {
            this.f14921a = t10;
            this.f14922b = z10;
        }

        public final String toString() {
            return this.f14922b ? "FALL_THROUGH" : String.valueOf(this.f14921a);
        }
    }

    static {
        String substring;
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        v7.g.f(canonicalName, "<this>");
        int g12 = kotlin.text.b.g1(canonicalName, ".", 6);
        if (g12 == -1) {
            substring = "";
        } else {
            substring = canonicalName.substring(0, g12);
            v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        f14903d = substring;
        f14904e = new a();
    }

    public LockBasedStorageManager() {
        throw null;
    }

    public LockBasedStorageManager(String str) {
        this(str, new x9.b(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void i(int i10) {
        String format;
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 != 1 && i10 != 3 && i10 != 5) {
            if (i10 != 6) {
                switch (i10) {
                    case 8:
                        break;
                    case ma.i.f16046m /* 9 */:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case ma.i.f16047o /* 10 */:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case ma.i.f16049q /* 15 */:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case 35:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i10 != 10 || i10 == 13) {
                objArr[1] = "createMemoizedFunction";
            } else if (i10 == 20) {
                objArr[1] = "createMemoizedFunctionWithNullableValues";
            } else if (i10 != 37) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            } else {
                objArr[1] = "sanitizeStackTrace";
            }
            switch (i10) {
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case ma.i.f16046m /* 9 */:
                case 11:
                case 12:
                case 14:
                case ma.i.f16049q /* 15 */:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case ma.i.f16047o /* 10 */:
                case 13:
                case 20:
                case 37:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case 35:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = String.format(str, objArr);
            if (i10 == 10 && i10 != 13 && i10 != 20 && i10 != 37) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i10 != 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i10) {
        }
        format = String.format(str, objArr);
        if (i10 == 10) {
        }
        throw new IllegalStateException(format);
    }

    public static void l(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!stackTrace[i10].getClassName().startsWith(f14903d)) {
                break;
            } else {
                i10++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    @Override // x9.h
    public final h a(u7.a aVar) {
        if (aVar != null) {
            return new h(this, aVar);
        }
        i(23);
        throw null;
    }

    @Override // x9.h
    public final kotlin.reflect.jvm.internal.impl.storage.b b(u7.a aVar, u7.l lVar, u7.l lVar2) {
        return new kotlin.reflect.jvm.internal.impl.storage.b(this, aVar, lVar, lVar2);
    }

    @Override // x9.h
    public final c c() {
        return new c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // x9.h
    public final b d() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override // x9.h
    public final k e(u7.l lVar) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // x9.h
    public final kotlin.reflect.jvm.internal.impl.storage.a f(EmptyList emptyList, u7.a aVar) {
        if (emptyList != null) {
            return new kotlin.reflect.jvm.internal.impl.storage.a(this, aVar, emptyList);
        }
        i(27);
        throw null;
    }

    @Override // x9.h
    public final f g(u7.a aVar) {
        return new f(this, aVar);
    }

    @Override // x9.h
    public final j h(u7.l lVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    public final Object j(i8.e eVar) {
        x9.g gVar = this.f14905a;
        gVar.lock();
        try {
            eVar.k0();
            gVar.unlock();
            return null;
        } finally {
        }
    }

    public l k(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        l(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return androidx.activity.e.k(sb, this.c, ")");
    }

    public LockBasedStorageManager(String str, x9.g gVar) {
        d.a aVar = d.f14911a;
        this.f14905a = gVar;
        this.f14906b = aVar;
        this.c = str;
    }
}
