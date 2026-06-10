package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g  reason: collision with root package name */
    private static final int f12118g = (1 << (32 - 16)) - 1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f12119h = 32 - 16;

    /* renamed from: i  reason: collision with root package name */
    static final int f12120i = Runtime.getRuntime().availableProcessors();

    /* renamed from: j  reason: collision with root package name */
    private static final Unsafe f12121j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f12122k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f12123l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f12124m;
    private static final long n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f12125o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f12126p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f12127q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient m[] f12128a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient m[] f12129b;
    private volatile transient long baseCount;
    private volatile transient d[] c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient j f12130d;

    /* renamed from: e  reason: collision with root package name */
    private transient t f12131e;

    /* renamed from: f  reason: collision with root package name */
    private transient f f12132f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c = w.c();
            f12121j = c;
            f12122k = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f12123l = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f12124m = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            n = c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f12125o = c.objectFieldOffset(d.class.getDeclaredField("value"));
            f12126p = c.arrayBaseOffset(m[].class);
            int arrayIndexScale = c.arrayIndexScale(m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            f12127q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i10 >= 536870912 ? 1073741824 : n(i10 + (i10 >>> 1) + 1);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i10 < i11 ? i11 : i10) / f10) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : n((int) j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(long j2, int i10) {
        int length;
        d dVar;
        long l2;
        m[] mVarArr;
        int length2;
        m[] mVarArr2;
        d[] dVarArr = this.c;
        if (dVarArr == null) {
            Unsafe unsafe = f12121j;
            long j10 = f12124m;
            long j11 = this.baseCount;
            l2 = j11 + j2;
        }
        boolean z10 = true;
        if (dVarArr != null && (length = dVarArr.length - 1) >= 0 && (dVar = dVarArr[length & ThreadLocalRandom.b()]) != null) {
            Unsafe unsafe2 = f12121j;
            long j12 = f12125o;
            long j13 = dVar.value;
            boolean compareAndSwapLong = unsafe2.compareAndSwapLong(dVar, j12, j13, j13 + j2);
            if (!compareAndSwapLong) {
                z10 = compareAndSwapLong;
            } else if (i10 <= 1) {
                return;
            } else {
                l2 = l();
                if (i10 < 0) {
                    return;
                }
                while (true) {
                    int i11 = this.sizeCtl;
                    if (l2 < i11 || (mVarArr = this.f12128a) == null || (length2 = mVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length2) | 32768;
                    int i12 = f12119h;
                    if (i11 < 0) {
                        if ((i11 >>> i12) == numberOfLeadingZeros && i11 != numberOfLeadingZeros + 1 && i11 != numberOfLeadingZeros + f12118g && (mVarArr2 = this.f12129b) != null && this.transferIndex > 0) {
                            if (f12121j.compareAndSwapInt(this, f12122k, i11, i11 + 1)) {
                                o(mVarArr, mVarArr2);
                            }
                        }
                        return;
                    } else if (f12121j.compareAndSwapInt(this, f12122k, i11, (numberOfLeadingZeros << i12) + 2)) {
                        o(mVarArr, null);
                    }
                    l2 = l();
                }
            }
        }
        e(j2, z10);
    }

    static final boolean b(m[] mVarArr, int i10, m mVar) {
        return AbstractC0262a.a(f12121j, mVarArr, (i10 << f12127q) + f12126p, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Class cls, Object obj, Object obj2) {
        if (obj2 != null && obj2.getClass() == cls) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r24.c != r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
        r1 = new j$.util.concurrent.d[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
        if (r2 >= r8) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        r24.c = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void e(long j2, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int length;
        boolean z13;
        int length2;
        int b5 = ThreadLocalRandom.b();
        if (b5 == 0) {
            ThreadLocalRandom.f();
            i10 = ThreadLocalRandom.b();
            z11 = true;
        } else {
            i10 = b5;
            z11 = z10;
        }
        int i11 = i10;
        while (true) {
            boolean z14 = false;
            while (true) {
                d[] dVarArr = this.c;
                if (dVarArr != null && (length = dVarArr.length) > 0) {
                    d dVar = dVarArr[(length - 1) & i11];
                    if (dVar != null) {
                        if (z11) {
                            Unsafe unsafe = f12121j;
                            long j10 = f12125o;
                            long j11 = dVar.value;
                            if (unsafe.compareAndSwapLong(dVar, j10, j11, j11 + j2)) {
                                return;
                            }
                            if (this.c == dVarArr && length < f12120i) {
                                if (!z14) {
                                    z14 = true;
                                } else if (this.cellsBusy == 0 && unsafe.compareAndSwapInt(this, n, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z11 = true;
                        }
                        i11 = ThreadLocalRandom.a(i11);
                    } else if (this.cellsBusy == 0) {
                        d dVar2 = new d(j2);
                        if (this.cellsBusy == 0 && f12121j.compareAndSwapInt(this, n, 0, 1)) {
                            try {
                                d[] dVarArr2 = this.c;
                                if (dVarArr2 != null && (length2 = dVarArr2.length) > 0) {
                                    int i12 = (length2 - 1) & i11;
                                    if (dVarArr2[i12] == null) {
                                        dVarArr2[i12] = dVar2;
                                        z13 = true;
                                        if (!z13) {
                                            return;
                                        }
                                    }
                                }
                                z13 = false;
                                if (!z13) {
                                }
                            } finally {
                            }
                        }
                    }
                    z14 = false;
                    i11 = ThreadLocalRandom.a(i11);
                } else if (this.cellsBusy == 0 && this.c == dVarArr && f12121j.compareAndSwapInt(this, n, 0, 1)) {
                    try {
                        if (this.c == dVarArr) {
                            d[] dVarArr3 = new d[2];
                            dVarArr3[i11 & 1] = new d(j2);
                            this.c = dVarArr3;
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    Unsafe unsafe2 = f12121j;
                    long j12 = f12124m;
                    long j13 = this.baseCount;
                    if (unsafe2.compareAndSwapLong(this, j12, j13, j13 + j2)) {
                        return;
                    }
                }
            }
            this.cellsBusy = 0;
        }
    }

    private final m[] g() {
        while (true) {
            m[] mVarArr = this.f12128a;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f12121j.compareAndSwapInt(this, f12122k, i10, -1)) {
                try {
                    m[] mVarArr2 = this.f12128a;
                    if (mVarArr2 == null || mVarArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        m[] mVarArr3 = new m[i11];
                        this.f12128a = mVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        mVarArr2 = mVarArr3;
                    }
                    this.sizeCtl = i10;
                    return mVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i10;
                    throw th;
                }
            }
        }
    }

    static final void j(m[] mVarArr, int i10, m mVar) {
        f12121j.putObjectVolatile(mVarArr, (i10 << f12127q) + f12126p, mVar);
    }

    static final int k(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final m m(m[] mVarArr, int i10) {
        return (m) f12121j.getObjectVolatile(mVarArr, (i10 << f12127q) + f12126p);
    }

    private static final int n(int i10) {
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        if (i16 < 0) {
            return 1;
        }
        if (i16 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r15v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.m] */
    private final void o(m[] mVarArr, m[] mVarArr2) {
        m[] mVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        m[] mVarArr4;
        int i10;
        int i11;
        h hVar;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i12;
        s sVar;
        s sVar2;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = mVarArr.length;
        int i13 = f12120i;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        int i15 = i14 < 16 ? 16 : i14;
        if (mVarArr2 == null) {
            try {
                m[] mVarArr5 = new m[length << 1];
                concurrentHashMap3.f12129b = mVarArr5;
                concurrentHashMap3.transferIndex = length;
                mVarArr3 = mVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            mVarArr3 = mVarArr2;
        }
        int length2 = mVarArr3.length;
        h hVar2 = new h(mVarArr3);
        m[] mVarArr6 = mVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i18 = i16 - 1;
                if (i18 < i17 && !z11) {
                    int i19 = concurrentHashMap4.transferIndex;
                    if (i19 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        i16 = -1;
                    } else {
                        Unsafe unsafe = f12121j;
                        long j2 = f12123l;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        mVarArr4 = mVarArr6;
                        int i21 = i17;
                        if (unsafe.compareAndSwapInt(this, j2, i19, i20)) {
                            i16 = i19 - 1;
                            i17 = i20;
                        } else {
                            mVarArr6 = mVarArr4;
                            i16 = i18;
                            i17 = i21;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                    mVarArr6 = mVarArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    z10 = false;
                }
                concurrentHashMap = concurrentHashMap4;
                mVarArr4 = mVarArr6;
                i16 = i18;
                i17 = i17;
                mVarArr6 = mVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z10 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                m[] mVarArr7 = mVarArr6;
                int i22 = i17;
                s sVar3 = null;
                if (i16 >= 0 && i16 < length && (i12 = i16 + length) < length2) {
                    m m10 = m(mVarArr7, i16);
                    if (m10 == null) {
                        z10 = b(mVarArr7, i16, hVar2);
                        i10 = i15;
                        i11 = length2;
                        hVar = hVar2;
                        mVarArr6 = mVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                    } else {
                        int i23 = m10.f12150a;
                        if (i23 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i10 = i15;
                            i11 = length2;
                            hVar = hVar2;
                            mVarArr6 = mVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            z10 = true;
                            hVar2 = hVar;
                            concurrentHashMap3 = concurrentHashMap2;
                            i17 = i22;
                            i15 = i10;
                            length2 = i11;
                        } else {
                            synchronized (m10) {
                                if (m(mVarArr7, i16) == m10) {
                                    if (i23 >= 0) {
                                        int i24 = i23 & length;
                                        s sVar4 = m10;
                                        for (s sVar5 = m10.f12152d; sVar5 != null; sVar5 = sVar5.f12152d) {
                                            int i25 = sVar5.f12150a & length;
                                            if (i25 != i24) {
                                                sVar4 = sVar5;
                                                i24 = i25;
                                            }
                                        }
                                        if (i24 == 0) {
                                            sVar = sVar4;
                                        } else {
                                            sVar = null;
                                            sVar3 = sVar4;
                                        }
                                        m mVar = m10;
                                        while (mVar != sVar4) {
                                            int i26 = mVar.f12150a;
                                            int i27 = i15;
                                            Object obj = mVar.f12151b;
                                            int i28 = length2;
                                            Object obj2 = mVar.c;
                                            if ((i26 & length) == 0) {
                                                sVar2 = sVar4;
                                                sVar = new m(i26, obj, obj2, sVar);
                                            } else {
                                                sVar2 = sVar4;
                                                sVar3 = new m(i26, obj, obj2, sVar3);
                                            }
                                            mVar = mVar.f12152d;
                                            i15 = i27;
                                            length2 = i28;
                                            sVar4 = sVar2;
                                        }
                                        i10 = i15;
                                        i11 = length2;
                                        j(mVarArr3, i16, sVar);
                                        j(mVarArr3, i12, sVar3);
                                        j(mVarArr7, i16, hVar2);
                                        hVar = hVar2;
                                    } else {
                                        i10 = i15;
                                        i11 = length2;
                                        if (m10 instanceof r) {
                                            r rVar = (r) m10;
                                            s sVar6 = null;
                                            s sVar7 = null;
                                            m mVar2 = rVar.f12166f;
                                            int i29 = 0;
                                            int i30 = 0;
                                            s sVar8 = null;
                                            while (mVar2 != null) {
                                                r rVar2 = rVar;
                                                int i31 = mVar2.f12150a;
                                                h hVar3 = hVar2;
                                                s sVar9 = new s(i31, mVar2.f12151b, mVar2.c, null, null);
                                                if ((i31 & length) == 0) {
                                                    sVar9.f12171h = sVar7;
                                                    if (sVar7 == null) {
                                                        sVar3 = sVar9;
                                                    } else {
                                                        sVar7.f12152d = sVar9;
                                                    }
                                                    i29++;
                                                    sVar7 = sVar9;
                                                } else {
                                                    sVar9.f12171h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar8 = sVar9;
                                                    } else {
                                                        sVar6.f12152d = sVar9;
                                                    }
                                                    i30++;
                                                    sVar6 = sVar9;
                                                }
                                                mVar2 = mVar2.f12152d;
                                                rVar = rVar2;
                                                hVar2 = hVar3;
                                            }
                                            r rVar3 = rVar;
                                            h hVar4 = hVar2;
                                            m r3 = i29 <= 6 ? r(sVar3) : i30 != 0 ? new r(sVar3) : rVar3;
                                            m r10 = i30 <= 6 ? r(sVar8) : i29 != 0 ? new r(sVar8) : rVar3;
                                            j(mVarArr3, i16, r3);
                                            j(mVarArr3, i12, r10);
                                            hVar = hVar4;
                                            j(mVarArr, i16, hVar);
                                            mVarArr7 = mVarArr;
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    i10 = i15;
                                    i11 = length2;
                                }
                                hVar = hVar2;
                            }
                            concurrentHashMap4 = this;
                            mVarArr6 = mVarArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                    hVar2 = hVar;
                    concurrentHashMap3 = concurrentHashMap2;
                    i17 = i22;
                    i15 = i10;
                    length2 = i11;
                }
                i10 = i15;
                i11 = length2;
                hVar = hVar2;
                if (z11) {
                    this.f12129b = null;
                    this.f12128a = mVarArr3;
                    this.sizeCtl = (length << 1) - (length >>> 1);
                    return;
                }
                concurrentHashMap2 = this;
                Unsafe unsafe2 = f12121j;
                long j10 = f12122k;
                int i32 = concurrentHashMap2.sizeCtl;
                int i33 = i16;
                if (!unsafe2.compareAndSwapInt(this, j10, i32, i32 - 1)) {
                    concurrentHashMap4 = concurrentHashMap2;
                    mVarArr6 = mVarArr7;
                    i16 = i33;
                } else if (i32 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << f12119h)) {
                    return;
                } else {
                    i16 = length;
                    concurrentHashMap4 = concurrentHashMap2;
                    mVarArr6 = mVarArr7;
                    z10 = true;
                    z11 = true;
                }
                hVar2 = hVar;
                concurrentHashMap3 = concurrentHashMap2;
                i17 = i22;
                i15 = i10;
                length2 = i11;
            }
        }
    }

    private final void p(m[] mVarArr, int i10) {
        int length = mVarArr.length;
        if (length < 64) {
            q(length << 1);
            return;
        }
        m m10 = m(mVarArr, i10);
        if (m10 == null || m10.f12150a < 0) {
            return;
        }
        synchronized (m10) {
            if (m(mVarArr, i10) == m10) {
                s sVar = null;
                m mVar = m10;
                s sVar2 = null;
                while (mVar != null) {
                    s sVar3 = new s(mVar.f12150a, mVar.f12151b, mVar.c, null, null);
                    sVar3.f12171h = sVar2;
                    if (sVar2 == null) {
                        sVar = sVar3;
                    } else {
                        sVar2.f12152d = sVar3;
                    }
                    mVar = mVar.f12152d;
                    sVar2 = sVar3;
                }
                j(mVarArr, i10, new r(sVar));
            }
        }
    }

    private final void q(int i10) {
        int length;
        m[] mVarArr;
        int n10 = i10 >= 536870912 ? 1073741824 : n(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                return;
            }
            m[] mVarArr2 = this.f12128a;
            if (mVarArr2 != null && (length = mVarArr2.length) != 0) {
                if (n10 > i11 && length < 1073741824) {
                    if (mVarArr2 == this.f12128a) {
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                        int i12 = f12119h;
                        if (i11 < 0) {
                            if ((i11 >>> i12) == numberOfLeadingZeros && i11 != numberOfLeadingZeros + 1 && i11 != numberOfLeadingZeros + f12118g && (mVarArr = this.f12129b) != null && this.transferIndex > 0) {
                                if (f12121j.compareAndSwapInt(this, f12122k, i11, i11 + 1)) {
                                    o(mVarArr2, mVarArr);
                                }
                            }
                            return;
                        } else if (f12121j.compareAndSwapInt(this, f12122k, i11, (numberOfLeadingZeros << i12) + 2)) {
                            o(mVarArr2, null);
                        }
                    } else {
                        continue;
                    }
                }
                return;
            }
            int i13 = i11 > n10 ? i11 : n10;
            if (f12121j.compareAndSwapInt(this, f12122k, i11, -1)) {
                try {
                    if (this.f12128a == mVarArr2) {
                        this.f12128a = new m[i13];
                        i11 = i13 - (i13 >>> 2);
                    }
                    this.sizeCtl = i11;
                } catch (Throwable th) {
                    this.sizeCtl = i11;
                    throw th;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [j$.util.concurrent.m] */
    static m r(s sVar) {
        m mVar = null;
        m mVar2 = null;
        for (s sVar2 = sVar; sVar2 != null; sVar2 = sVar2.f12152d) {
            m mVar3 = new m(sVar2.f12150a, sVar2.f12151b, sVar2.c, null);
            if (mVar2 == null) {
                mVar = mVar3;
            } else {
                mVar2.f12152d = mVar3;
            }
            mVar2 = mVar3;
        }
        return mVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        int n10;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j10 = 0;
        long j11 = 0;
        m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j11++;
            mVar = new m(k(readObject.hashCode()), readObject, readObject2, mVar);
        }
        if (j11 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j11 >= 536870912) {
            n10 = 1073741824;
        } else {
            int i10 = (int) j11;
            n10 = n(i10 + (i10 >>> 1) + 1);
        }
        m[] mVarArr = new m[n10];
        int i11 = n10 - 1;
        while (mVar != null) {
            m mVar2 = mVar.f12152d;
            int i12 = mVar.f12150a;
            int i13 = i12 & i11;
            m m10 = m(mVarArr, i13);
            if (m10 == null) {
                z10 = true;
            } else {
                Object obj2 = mVar.f12151b;
                if (m10.f12150a >= 0) {
                    int i14 = 0;
                    for (m mVar3 = m10; mVar3 != null; mVar3 = mVar3.f12152d) {
                        if (mVar3.f12150a == i12 && ((obj = mVar3.f12151b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i14++;
                    }
                    z10 = true;
                    if (z10 && i14 >= 8) {
                        long j12 = j10 + 1;
                        mVar.f12152d = m10;
                        m mVar4 = mVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (mVar4 != null) {
                            long j13 = j12;
                            s sVar3 = new s(mVar4.f12150a, mVar4.f12151b, mVar4.c, null, null);
                            sVar3.f12171h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f12152d = sVar3;
                            }
                            mVar4 = mVar4.f12152d;
                            sVar2 = sVar3;
                            j12 = j13;
                        }
                        j(mVarArr, i13, new r(sVar));
                        j10 = j12;
                    }
                } else if (((r) m10).f(i12, obj2, mVar.c) == null) {
                    j10 += j2;
                }
                z10 = false;
            }
            if (z10) {
                j10++;
                mVar.f12152d = m10;
                j(mVarArr, i13, mVar);
            }
            j2 = 1;
            mVar = mVar2;
        }
        this.f12128a = mVarArr;
        this.sizeCtl = n10 - (n10 >>> 2);
        this.baseCount = j10;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 1;
        int i11 = 0;
        while (i10 < 16) {
            i11++;
            i10 <<= 1;
        }
        int i12 = 32 - i11;
        int i13 = i10 - 1;
        o[] oVarArr = new o[16];
        for (int i14 = 0; i14 < 16; i14++) {
            oVarArr[i14] = new o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i12);
        objectOutputStream.putFields().put("segmentMask", i13);
        objectOutputStream.writeFields();
        m[] mVarArr = this.f12128a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m e10 = qVar.e();
                if (e10 == null) {
                    break;
                }
                objectOutputStream.writeObject(e10.f12151b);
                objectOutputStream.writeObject(e10.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        m m10;
        m[] mVarArr = this.f12128a;
        long j2 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (mVarArr != null && i10 < mVarArr.length) {
                m10 = m(mVarArr, i10);
                if (m10 == null) {
                    i10++;
                } else {
                    int i11 = m10.f12150a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (m10) {
                        if (m(mVarArr, i10) == m10) {
                            for (m mVar = i11 >= 0 ? m10 : m10 instanceof r ? ((r) m10).f12166f : null; mVar != null; mVar = mVar.f12152d) {
                                j2--;
                            }
                            j(mVarArr, i10, null);
                            i10++;
                        }
                    }
                }
            }
            mVarArr = f(mVarArr, m10);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        int i10;
        m mVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        int i11 = 0;
        Object obj4 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & k3;
                    m m10 = m(mVarArr, i13);
                    if (m10 == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (b(mVarArr, i13, nVar)) {
                                Object apply = biFunction.apply(obj, null);
                                if (apply != null) {
                                    mVar = new m(k3, obj, apply, null);
                                    i10 = 1;
                                } else {
                                    i10 = i11;
                                    mVar = null;
                                }
                                j(mVarArr, i13, mVar);
                                i11 = i10;
                                obj4 = apply;
                                i12 = 1;
                            }
                        }
                        if (i12 != 0) {
                        }
                    } else {
                        int i14 = m10.f12150a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                try {
                                    if (m(mVarArr, i13) == m10) {
                                        if (i14 >= 0) {
                                            m mVar2 = null;
                                            m mVar3 = m10;
                                            int i15 = 1;
                                            while (true) {
                                                if (mVar3.f12150a != k3 || ((obj3 = mVar3.f12151b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    m mVar4 = mVar3.f12152d;
                                                    if (mVar4 == null) {
                                                        Object apply2 = biFunction.apply(obj, null);
                                                        if (apply2 != null) {
                                                            mVar3.f12152d = new m(k3, obj, apply2, null);
                                                            obj2 = apply2;
                                                            i11 = 1;
                                                        } else {
                                                            obj2 = apply2;
                                                        }
                                                    } else {
                                                        i15++;
                                                        mVar2 = mVar3;
                                                        mVar3 = mVar4;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, mVar3.c);
                                            if (obj2 != null) {
                                                mVar3.c = obj2;
                                            } else {
                                                m mVar5 = mVar3.f12152d;
                                                if (mVar2 != null) {
                                                    mVar2.f12152d = mVar5;
                                                } else {
                                                    j(mVarArr, i13, mVar5);
                                                }
                                                i11 = -1;
                                            }
                                            i12 = i15;
                                            obj4 = obj2;
                                        } else if (m10 instanceof r) {
                                            r rVar = (r) m10;
                                            s sVar = rVar.f12165e;
                                            s b5 = sVar != null ? sVar.b(k3, obj, null) : null;
                                            Object apply3 = biFunction.apply(obj, b5 == null ? null : b5.c);
                                            if (apply3 == null) {
                                                if (b5 != null) {
                                                    if (rVar.g(b5)) {
                                                        j(mVarArr, i13, r(rVar.f12166f));
                                                    }
                                                    obj4 = apply3;
                                                    i11 = -1;
                                                    i12 = 1;
                                                }
                                                obj4 = apply3;
                                                i12 = 1;
                                            } else if (b5 != null) {
                                                b5.c = apply3;
                                                obj4 = apply3;
                                                i12 = 1;
                                            } else {
                                                rVar.f(k3, obj, apply3);
                                                obj4 = apply3;
                                                i11 = 1;
                                                i12 = 1;
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    p(mVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (i11 != 0) {
            a(i11, i12);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        s b5;
        Object apply;
        Object obj2;
        Object obj3;
        if (obj == null || function == null) {
            throw null;
        }
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        Object obj4 = null;
        int i10 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & k3;
                    m m10 = m(mVarArr, i11);
                    boolean z10 = true;
                    if (m10 == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (b(mVarArr, i11, nVar)) {
                                Object apply2 = function.apply(obj);
                                j(mVarArr, i11, apply2 != null ? new m(k3, obj, apply2, null) : null);
                                obj4 = apply2;
                                i10 = 1;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i12 = m10.f12150a;
                        if (i12 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                if (m(mVarArr, i11) == m10) {
                                    if (i12 >= 0) {
                                        m mVar = m10;
                                        int i13 = 1;
                                        while (true) {
                                            if (mVar.f12150a != k3 || ((obj3 = mVar.f12151b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                m mVar2 = mVar.f12152d;
                                                if (mVar2 == null) {
                                                    apply = function.apply(obj);
                                                    if (apply != null) {
                                                        mVar.f12152d = new m(k3, obj, apply, null);
                                                    } else {
                                                        obj2 = apply;
                                                    }
                                                } else {
                                                    i13++;
                                                    mVar = mVar2;
                                                }
                                            }
                                        }
                                        obj2 = mVar.c;
                                        apply = obj2;
                                        z10 = false;
                                        i10 = i13;
                                        obj4 = apply;
                                    } else if (m10 instanceof r) {
                                        r rVar = (r) m10;
                                        s sVar = rVar.f12165e;
                                        if (sVar == null || (b5 = sVar.b(k3, obj, null)) == null) {
                                            obj4 = function.apply(obj);
                                            if (obj4 != null) {
                                                rVar.f(k3, obj, obj4);
                                                i10 = 2;
                                            }
                                        } else {
                                            obj4 = b5.c;
                                        }
                                        i10 = 2;
                                    }
                                }
                                z10 = false;
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    p(mVarArr, i11);
                                }
                                if (!z10) {
                                    return obj4;
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (obj4 != null) {
            a(1L, i10);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        s b5;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & k3;
                    m m10 = m(mVarArr, i12);
                    if (m10 != null) {
                        int i13 = m10.f12150a;
                        if (i13 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                try {
                                    if (m(mVarArr, i12) == m10) {
                                        if (i13 >= 0) {
                                            i11 = 1;
                                            m mVar = null;
                                            m mVar2 = m10;
                                            while (true) {
                                                if (mVar2.f12150a != k3 || ((obj2 = mVar2.f12151b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                    m mVar3 = mVar2.f12152d;
                                                    if (mVar3 == null) {
                                                        break;
                                                    }
                                                    i11++;
                                                    mVar = mVar2;
                                                    mVar2 = mVar3;
                                                }
                                            }
                                            obj3 = biFunction.apply(obj, mVar2.c);
                                            if (obj3 != null) {
                                                mVar2.c = obj3;
                                            } else {
                                                m mVar4 = mVar2.f12152d;
                                                if (mVar != null) {
                                                    mVar.f12152d = mVar4;
                                                } else {
                                                    j(mVarArr, i12, mVar4);
                                                }
                                                i10 = -1;
                                            }
                                        } else if (m10 instanceof r) {
                                            r rVar = (r) m10;
                                            s sVar = rVar.f12165e;
                                            if (sVar != null && (b5 = sVar.b(k3, obj, null)) != null) {
                                                obj3 = biFunction.apply(obj, b5.c);
                                                if (obj3 != null) {
                                                    b5.c = obj3;
                                                } else {
                                                    if (rVar.g(b5)) {
                                                        j(mVarArr, i12, r(rVar.f12166f));
                                                    }
                                                    i10 = -1;
                                                }
                                            }
                                            i11 = 2;
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                break;
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        m[] mVarArr = this.f12128a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m e10 = qVar.e();
                if (e10 == null) {
                    break;
                }
                Object obj2 = e10.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set entrySet() {
        f fVar = this.f12132f;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f12132f = fVar2;
        return fVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v3;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                m[] mVarArr = this.f12128a;
                int length = mVarArr == null ? 0 : mVarArr.length;
                q qVar = new q(mVarArr, length, 0, length);
                while (true) {
                    m e10 = qVar.e();
                    if (e10 == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v3 = get(key)) == null || (value != v3 && !value.equals(v3))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = e10.c;
                    Object obj3 = map.get(e10.f12151b);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    final m[] f(m[] mVarArr, m mVar) {
        m[] mVarArr2;
        int i10;
        if (!(mVar instanceof h) || (mVarArr2 = ((h) mVar).f12144e) == null) {
            return this.f12128a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(mVarArr.length) | 32768;
        while (true) {
            if (mVarArr2 != this.f12129b || this.f12128a != mVarArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> f12119h) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == f12118g + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            } else if (f12121j.compareAndSwapInt(this, f12122k, i10, i10 + 1)) {
                o(mVarArr, mVarArr2);
                break;
            }
        }
        return mVarArr2;
    }

    @Override // j$.util.concurrent.v, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        m[] mVarArr = this.f12128a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m e10 = qVar.e();
            if (e10 == null) {
                return;
            }
            biConsumer.accept(e10.f12151b, e10.c);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        m m10;
        Object obj2;
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        if (mVarArr != null && (length = mVarArr.length) > 0 && (m10 = m(mVarArr, (length - 1) & k3)) != null) {
            int i10 = m10.f12150a;
            if (i10 == k3) {
                Object obj3 = m10.f12151b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) m10.c;
                }
            } else if (i10 < 0) {
                m a10 = m10.a(k3, obj);
                if (a10 != null) {
                    return (V) a10.c;
                }
                return null;
            }
            while (true) {
                m10 = m10.f12152d;
                if (m10 == null) {
                    break;
                } else if (m10.f12150a != k3 || ((obj2 = m10.f12151b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v3 = get(obj);
        return v3 == null ? obj2 : v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r11 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        r6.c = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2, boolean z10) {
        Object obj3;
        Object obj4;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        int i10 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & k3;
                    m m10 = m(mVarArr, i11);
                    if (m10 != null) {
                        int i12 = m10.f12150a;
                        if (i12 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                if (m(mVarArr, i11) == m10) {
                                    if (i12 >= 0) {
                                        i10 = 1;
                                        m mVar = m10;
                                        while (true) {
                                            if (mVar.f12150a != k3 || ((obj4 = mVar.f12151b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                m mVar2 = mVar.f12152d;
                                                if (mVar2 == null) {
                                                    mVar.f12152d = new m(k3, obj, obj2, null);
                                                    break;
                                                }
                                                i10++;
                                                mVar = mVar2;
                                            }
                                        }
                                    } else if (m10 instanceof r) {
                                        s f10 = ((r) m10).f(k3, obj, obj2);
                                        if (f10 != null) {
                                            Object obj5 = f10.c;
                                            if (!z10) {
                                                f10.c = obj2;
                                            }
                                            obj3 = obj5;
                                        } else {
                                            obj3 = null;
                                        }
                                        i10 = 2;
                                    }
                                }
                                obj3 = null;
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    p(mVarArr, i11);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    } else if (b(mVarArr, i11, new m(k3, obj, obj2, null))) {
                        break;
                    }
                }
            }
            mVarArr = g();
        }
        a(1L, i10);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        m[] mVarArr = this.f12128a;
        int i10 = 0;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m e10 = qVar.e();
                if (e10 == null) {
                    break;
                }
                i10 += e10.c.hashCode() ^ e10.f12151b.hashCode();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object i(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        m m10;
        boolean z10;
        Object obj4;
        s b5;
        m r3;
        Object obj5;
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (m10 = m(mVarArr, (i10 = (length - 1) & k3))) == null) {
                break;
            }
            int i11 = m10.f12150a;
            if (i11 == -1) {
                mVarArr = f(mVarArr, m10);
            } else {
                synchronized (m10) {
                    try {
                        if (m(mVarArr, i10) == m10) {
                            z10 = true;
                            if (i11 >= 0) {
                                m mVar = null;
                                m mVar2 = m10;
                                while (true) {
                                    if (mVar2.f12150a != k3 || ((obj5 = mVar2.f12151b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        m mVar3 = mVar2.f12152d;
                                        if (mVar3 == null) {
                                            break;
                                        }
                                        mVar = mVar2;
                                        mVar2 = mVar3;
                                    }
                                }
                                obj4 = mVar2.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        mVar2.c = obj2;
                                    } else if (mVar != null) {
                                        mVar.f12152d = mVar2.f12152d;
                                    } else {
                                        r3 = mVar2.f12152d;
                                        j(mVarArr, i10, r3);
                                    }
                                }
                                obj4 = null;
                            } else if (m10 instanceof r) {
                                r rVar = (r) m10;
                                s sVar = rVar.f12165e;
                                if (sVar != null && (b5 = sVar.b(k3, obj, null)) != null) {
                                    obj4 = b5.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b5.c = obj2;
                                        } else if (rVar.g(b5)) {
                                            r3 = r(rVar.f12166f);
                                            j(mVarArr, i10, r3);
                                        }
                                    }
                                }
                                obj4 = null;
                            }
                        }
                        z10 = false;
                        obj4 = null;
                    } finally {
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return l() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set keySet() {
        j jVar = this.f12130d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f12130d = jVar2;
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long l() {
        d[] dVarArr = this.c;
        long j2 = this.baseCount;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j2 += dVar.value;
                }
            }
        }
        return j2;
    }

    @Override // j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int k3 = k(obj.hashCode());
        m[] mVarArr = this.f12128a;
        int i11 = 0;
        Object obj6 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & k3;
                    m m10 = m(mVarArr, i13);
                    i10 = 1;
                    if (m10 != null) {
                        int i14 = m10.f12150a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                try {
                                    if (m(mVarArr, i13) == m10) {
                                        if (i14 >= 0) {
                                            m mVar = null;
                                            m mVar2 = m10;
                                            int i15 = 1;
                                            while (true) {
                                                if (mVar2.f12150a != k3 || ((obj4 = mVar2.f12151b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                    m mVar3 = mVar2.f12152d;
                                                    if (mVar3 == null) {
                                                        mVar2.f12152d = new m(k3, obj, obj5, null);
                                                        obj3 = obj5;
                                                        i12 = 1;
                                                        break;
                                                    }
                                                    i15++;
                                                    mVar = mVar2;
                                                    mVar2 = mVar3;
                                                }
                                            }
                                            obj3 = biFunction.apply(mVar2.c, obj5);
                                            if (obj3 != null) {
                                                mVar2.c = obj3;
                                            } else {
                                                m mVar4 = mVar2.f12152d;
                                                if (mVar != null) {
                                                    mVar.f12152d = mVar4;
                                                } else {
                                                    j(mVarArr, i13, mVar4);
                                                }
                                                i12 = -1;
                                            }
                                            i11 = i15;
                                            obj6 = obj3;
                                        } else if (m10 instanceof r) {
                                            r rVar = (r) m10;
                                            s sVar = rVar.f12165e;
                                            s b5 = sVar == null ? null : sVar.b(k3, obj, null);
                                            Object apply = b5 == null ? obj5 : biFunction.apply(b5.c, obj5);
                                            if (apply == null) {
                                                if (b5 != null) {
                                                    if (rVar.g(b5)) {
                                                        j(mVarArr, i13, r(rVar.f12166f));
                                                    }
                                                    obj6 = apply;
                                                    i11 = 2;
                                                    i12 = -1;
                                                }
                                                obj6 = apply;
                                                i11 = 2;
                                            } else if (b5 != null) {
                                                b5.c = apply;
                                                obj6 = apply;
                                                i11 = 2;
                                            } else {
                                                rVar.f(k3, obj, apply);
                                                obj6 = apply;
                                                i11 = 2;
                                                i12 = 1;
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    p(mVarArr, i13);
                                }
                                i10 = i12;
                                obj5 = obj6;
                            }
                        }
                    } else if (b(mVarArr, i13, new m(k3, obj, obj5, null))) {
                    }
                }
            }
            mVarArr = g();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj5;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k3, V v3) {
        return (V) h(k3, v3, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(Map map) {
        q(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k3, V v3) {
        return (V) h(k3, v3, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        return i(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || i(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return i(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return i(obj, obj3, obj2) != null;
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        m[] mVarArr = this.f12128a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m e10 = qVar.e();
            if (e10 == null) {
                return;
            }
            Object obj = e10.c;
            Object obj2 = e10.f12151b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (i(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long l2 = l();
        if (l2 < 0) {
            return 0;
        }
        if (l2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) l2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        m[] mVarArr = this.f12128a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        m e10 = qVar.e();
        if (e10 != null) {
            while (true) {
                Object obj = e10.f12151b;
                Object obj2 = e10.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                e10 = qVar.e();
                if (e10 == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection<V> values() {
        t tVar = this.f12131e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f12131e = tVar2;
        return tVar2;
    }
}
