package y3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m implements c4.e, c4.d {

    /* renamed from: q  reason: collision with root package name */
    public static final TreeMap<Integer, m> f18869q = new TreeMap<>();

    /* renamed from: i  reason: collision with root package name */
    public final int f18870i;

    /* renamed from: j  reason: collision with root package name */
    public volatile String f18871j;

    /* renamed from: k  reason: collision with root package name */
    public final long[] f18872k;

    /* renamed from: l  reason: collision with root package name */
    public final double[] f18873l;

    /* renamed from: m  reason: collision with root package name */
    public final String[] f18874m;
    public final byte[][] n;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f18875o;

    /* renamed from: p  reason: collision with root package name */
    public int f18876p;

    public m(int i10) {
        this.f18870i = i10;
        int i11 = i10 + 1;
        this.f18875o = new int[i11];
        this.f18872k = new long[i11];
        this.f18873l = new double[i11];
        this.f18874m = new String[i11];
        this.n = new byte[i11];
    }

    public static final m c(String str, int i10) {
        TreeMap<Integer, m> treeMap = f18869q;
        synchronized (treeMap) {
            Map.Entry<Integer, m> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                m value = ceilingEntry.getValue();
                value.f18871j = str;
                value.f18876p = i10;
                return value;
            }
            m7.n nVar = m7.n.f16010a;
            m mVar = new m(i10);
            mVar.f18871j = str;
            mVar.f18876p = i10;
            return mVar;
        }
    }

    @Override // c4.d
    public final void E(int i10, byte[] bArr) {
        this.f18875o[i10] = 5;
        this.n[i10] = bArr;
    }

    @Override // c4.d
    public final void F(String str, int i10) {
        v7.g.f(str, "value");
        this.f18875o[i10] = 4;
        this.f18874m[i10] = str;
    }

    @Override // c4.e
    public final String a() {
        String str = this.f18871j;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // c4.e
    public final void b(j jVar) {
        int i10 = this.f18876p;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = this.f18875o[i11];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    byte[] bArr = this.n[i11];
                                    if (bArr != null) {
                                        jVar.E(i11, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f18874m[i11];
                                if (str != null) {
                                    jVar.F(str, i11);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            jVar.a(this.f18873l[i11], i11);
                        }
                    } else {
                        jVar.r(this.f18872k[i11], i11);
                    }
                } else {
                    jVar.o(i11);
                }
                if (i11 != i10) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void h() {
        TreeMap<Integer, m> treeMap = f18869q;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f18870i), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                v7.g.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    @Override // c4.d
    public final void o(int i10) {
        this.f18875o[i10] = 1;
    }

    @Override // c4.d
    public final void r(long j2, int i10) {
        this.f18875o[i10] = 2;
        this.f18872k[i10] = j2;
    }
}
