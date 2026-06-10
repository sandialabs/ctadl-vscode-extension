package kotlinx.coroutines.flow;

import ja.h0;
import ja.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public class p<T> extends ma.a<q> implements j<T>, b, ma.f<T> {

    /* renamed from: m  reason: collision with root package name */
    public final int f15433m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final BufferOverflow f15434o;

    /* renamed from: p  reason: collision with root package name */
    public Object[] f15435p;

    /* renamed from: q  reason: collision with root package name */
    public long f15436q;

    /* renamed from: r  reason: collision with root package name */
    public long f15437r;

    /* renamed from: s  reason: collision with root package name */
    public int f15438s;

    /* renamed from: t  reason: collision with root package name */
    public int f15439t;

    /* loaded from: classes.dex */
    public static final class a implements h0 {

        /* renamed from: i  reason: collision with root package name */
        public final p<?> f15440i;

        /* renamed from: j  reason: collision with root package name */
        public final long f15441j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f15442k;

        /* renamed from: l  reason: collision with root package name */
        public final p7.c<m7.n> f15443l;

        public a(p pVar, long j2, Object obj, ja.j jVar) {
            this.f15440i = pVar;
            this.f15441j = j2;
            this.f15442k = obj;
            this.f15443l = jVar;
        }

        @Override // ja.h0
        public final void a() {
            p<?> pVar = this.f15440i;
            synchronized (pVar) {
                if (this.f15441j >= pVar.r()) {
                    Object[] objArr = pVar.f15435p;
                    v7.g.c(objArr);
                    int i10 = (int) this.f15441j;
                    if (objArr[(objArr.length - 1) & i10] == this) {
                        objArr[i10 & (objArr.length - 1)] = e.f15357a;
                        pVar.m();
                        m7.n nVar = m7.n.f16010a;
                    }
                }
            }
        }
    }

    public p(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f15433m = i10;
        this.n = i11;
        this.f15434o = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
        throw r8.C();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CoroutineSingletons n(p pVar, c cVar, p7.c cVar2) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i10;
        q g10;
        c cVar3;
        q qVar;
        p pVar2;
        Throwable th;
        u0 u0Var;
        c cVar4;
        Object v3;
        try {
            if (cVar2 instanceof SharedFlowImpl$collect$1) {
                sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) cVar2;
                int i11 = sharedFlowImpl$collect$1.f15326r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    sharedFlowImpl$collect$1.f15326r = i11 - Integer.MIN_VALUE;
                    Object obj = sharedFlowImpl$collect$1.f15324p;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = sharedFlowImpl$collect$1.f15326r;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2 && i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u0Var = sharedFlowImpl$collect$1.f15323o;
                            qVar = sharedFlowImpl$collect$1.n;
                            cVar4 = sharedFlowImpl$collect$1.f15322m;
                            pVar2 = sharedFlowImpl$collect$1.f15321l;
                            try {
                                m0.b.n1(obj);
                                while (true) {
                                    v3 = pVar2.v(qVar);
                                    if (v3 == e.f15357a) {
                                        sharedFlowImpl$collect$1.f15321l = pVar2;
                                        sharedFlowImpl$collect$1.f15322m = cVar4;
                                        sharedFlowImpl$collect$1.n = qVar;
                                        sharedFlowImpl$collect$1.f15323o = u0Var;
                                        sharedFlowImpl$collect$1.f15326r = 2;
                                        if (pVar2.l(qVar, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (u0Var != null && !u0Var.b()) {
                                            break;
                                        }
                                        sharedFlowImpl$collect$1.f15321l = pVar2;
                                        sharedFlowImpl$collect$1.f15322m = cVar4;
                                        sharedFlowImpl$collect$1.n = qVar;
                                        sharedFlowImpl$collect$1.f15323o = u0Var;
                                        sharedFlowImpl$collect$1.f15326r = 3;
                                        if (cVar4.c(v3, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                g10 = qVar;
                                th = th;
                                pVar = pVar2;
                                pVar.k(g10);
                                throw th;
                            }
                        } else {
                            qVar = sharedFlowImpl$collect$1.n;
                            c cVar5 = sharedFlowImpl$collect$1.f15322m;
                            p pVar3 = sharedFlowImpl$collect$1.f15321l;
                            try {
                                m0.b.n1(obj);
                                cVar3 = cVar5;
                                pVar = pVar3;
                            } catch (Throwable th3) {
                                g10 = qVar;
                                th = th3;
                                pVar = pVar3;
                                pVar.k(g10);
                                throw th;
                            }
                        }
                    } else {
                        m0.b.n1(obj);
                        g10 = pVar.g();
                        try {
                            if (cVar instanceof w) {
                                sharedFlowImpl$collect$1.f15321l = pVar;
                                sharedFlowImpl$collect$1.f15322m = cVar;
                                sharedFlowImpl$collect$1.n = g10;
                                sharedFlowImpl$collect$1.f15326r = 1;
                                if (((w) cVar).a(sharedFlowImpl$collect$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            cVar3 = cVar;
                            qVar = g10;
                        } catch (Throwable th4) {
                            th = th4;
                            pVar.k(g10);
                            throw th;
                        }
                    }
                    CoroutineContext coroutineContext = sharedFlowImpl$collect$1.f13036j;
                    v7.g.c(coroutineContext);
                    pVar2 = pVar;
                    u0Var = (u0) coroutineContext.a(u0.b.f12806i);
                    cVar4 = cVar3;
                    while (true) {
                        v3 = pVar2.v(qVar);
                        if (v3 == e.f15357a) {
                        }
                    }
                }
            }
            CoroutineContext coroutineContext2 = sharedFlowImpl$collect$1.f13036j;
            v7.g.c(coroutineContext2);
            pVar2 = pVar;
            u0Var = (u0) coroutineContext2.a(u0.b.f12806i);
            cVar4 = cVar3;
            while (true) {
                v3 = pVar2.v(qVar);
                if (v3 == e.f15357a) {
                }
            }
        } catch (Throwable th5) {
            pVar2 = pVar;
            th = th5;
            g10 = qVar;
            th = th;
            pVar = pVar2;
            pVar.k(g10);
            throw th;
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(pVar, cVar2);
        Object obj2 = sharedFlowImpl$collect$1.f15324p;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = sharedFlowImpl$collect$1.f15326r;
        if (i10 == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.b
    public final Object a(c<? super T> cVar, p7.c<?> cVar2) {
        n(this, cVar, cVar2);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.o
    public final List<T> b() {
        synchronized (this) {
            int r3 = (int) ((r() + this.f15438s) - this.f15436q);
            if (r3 == 0) {
                return EmptyList.f12981i;
            }
            ArrayList arrayList = new ArrayList(r3);
            Object[] objArr = this.f15435p;
            v7.g.c(objArr);
            for (int i10 = 0; i10 < r3; i10++) {
                arrayList.add(objArr[(objArr.length - 1) & ((int) (this.f15436q + i10))]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super m7.n> cVar) {
        p7.c<m7.n>[] cVarArr;
        a aVar;
        if (!e(t10)) {
            ja.j jVar = new ja.j(1, m0.b.y0(cVar));
            jVar.u();
            p7.c<m7.n>[] cVarArr2 = m0.b.c;
            synchronized (this) {
                if (t(t10)) {
                    jVar.t(m7.n.f16010a);
                    cVarArr = q(cVarArr2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, this.f15438s + this.f15439t + r(), t10, jVar);
                    p(aVar2);
                    this.f15439t++;
                    if (this.n == 0) {
                        cVarArr2 = q(cVarArr2);
                    }
                    cVarArr = cVarArr2;
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                jVar.x(new ja.f(1, aVar));
            }
            for (p7.c<m7.n> cVar2 : cVarArr) {
                if (cVar2 != null) {
                    cVar2.t(m7.n.f16010a);
                }
            }
            Object s10 = jVar.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s10 != coroutineSingletons) {
                s10 = m7.n.f16010a;
            }
            if (s10 == coroutineSingletons) {
                return s10;
            }
        }
        return m7.n.f16010a;
    }

    @Override // kotlinx.coroutines.flow.j
    public final void d() {
        synchronized (this) {
            w(r() + this.f15438s, this.f15437r, r() + this.f15438s, r() + this.f15438s + this.f15439t);
            m7.n nVar = m7.n.f16010a;
        }
    }

    @Override // kotlinx.coroutines.flow.j
    public final boolean e(T t10) {
        int i10;
        boolean z10;
        p7.c<m7.n>[] cVarArr = m0.b.c;
        synchronized (this) {
            if (t(t10)) {
                cVarArr = q(cVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (p7.c<m7.n> cVar : cVarArr) {
            if (cVar != null) {
                cVar.t(m7.n.f16010a);
            }
        }
        return z10;
    }

    @Override // ma.f
    public final b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? this : new ma.c(i10, coroutineContext, bufferOverflow, this);
    }

    @Override // ma.a
    public final q i() {
        return new q();
    }

    @Override // ma.a
    public final ma.b[] j() {
        return new q[2];
    }

    public final Object l(q qVar, p7.c<? super m7.n> cVar) {
        ja.j jVar = new ja.j(1, m0.b.y0(cVar));
        jVar.u();
        synchronized (this) {
            if (u(qVar) < 0) {
                qVar.f15445b = jVar;
            } else {
                jVar.t(m7.n.f16010a);
            }
            m7.n nVar = m7.n.f16010a;
        }
        Object s10 = jVar.s();
        if (s10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return s10;
        }
        return m7.n.f16010a;
    }

    public final void m() {
        if (this.n == 0 && this.f15439t <= 1) {
            return;
        }
        Object[] objArr = this.f15435p;
        v7.g.c(objArr);
        while (this.f15439t > 0) {
            long r3 = r();
            int i10 = this.f15438s;
            int i11 = this.f15439t;
            if (objArr[(objArr.length - 1) & ((int) ((r3 + (i10 + i11)) - 1))] == e.f15357a) {
                this.f15439t = i11 - 1;
                objArr[(objArr.length - 1) & ((int) (r() + this.f15438s + this.f15439t))] = null;
            } else {
                return;
            }
        }
    }

    public final void o() {
        Object[] objArr;
        Object[] objArr2 = this.f15435p;
        v7.g.c(objArr2);
        objArr2[(objArr2.length - 1) & ((int) r())] = null;
        this.f15438s--;
        long r3 = r() + 1;
        if (this.f15436q < r3) {
            this.f15436q = r3;
        }
        if (this.f15437r < r3) {
            if (this.f16028j != 0 && (objArr = this.f16027i) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        q qVar = (q) obj;
                        long j2 = qVar.f15444a;
                        if (j2 >= 0 && j2 < r3) {
                            qVar.f15444a = r3;
                        }
                    }
                }
            }
            this.f15437r = r3;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f15438s + this.f15439t;
        Object[] objArr = this.f15435p;
        if (objArr == null) {
            objArr = s(0, 2, null);
        } else if (i10 >= objArr.length) {
            objArr = s(i10, objArr.length * 2, objArr);
        }
        objArr[((int) (r() + i10)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final p7.c<m7.n>[] q(p7.c<m7.n>[] cVarArr) {
        Object[] objArr;
        q qVar;
        ja.j jVar;
        int length = cVarArr.length;
        if (this.f16028j != 0 && (objArr = this.f16027i) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj != null && (jVar = (qVar = (q) obj).f15445b) != null && u(qVar) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        v7.g.e(copyOf, "copyOf(this, newSize)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = jVar;
                    qVar.f15445b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long r() {
        return Math.min(this.f15437r, this.f15436q);
    }

    public final Object[] s(int i10, int i11, Object[] objArr) {
        boolean z10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i11];
            this.f15435p = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r3 = r();
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (int) (i12 + r3);
                objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(T t10) {
        int i10 = this.f16028j;
        int i11 = this.f15433m;
        if (i10 == 0) {
            if (i11 != 0) {
                p(t10);
                int i12 = this.f15438s + 1;
                this.f15438s = i12;
                if (i12 > i11) {
                    o();
                }
                this.f15437r = r() + this.f15438s;
            }
            return true;
        }
        int i13 = this.f15438s;
        int i14 = this.n;
        if (i13 >= i14 && this.f15437r <= this.f15436q) {
            int ordinal = this.f15434o.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        p(t10);
        int i15 = this.f15438s + 1;
        this.f15438s = i15;
        if (i15 > i14) {
            o();
        }
        long r3 = r() + this.f15438s;
        long j2 = this.f15436q;
        if (((int) (r3 - j2)) > i11) {
            w(j2 + 1, this.f15437r, r() + this.f15438s, r() + this.f15438s + this.f15439t);
        }
        return true;
    }

    public final long u(q qVar) {
        long j2 = qVar.f15444a;
        if (j2 < r() + this.f15438s) {
            return j2;
        }
        if (this.n > 0 || j2 > r() || this.f15439t == 0) {
            return -1L;
        }
        return j2;
    }

    public final Object v(q qVar) {
        Object obj;
        p7.c<m7.n>[] cVarArr = m0.b.c;
        synchronized (this) {
            long u10 = u(qVar);
            if (u10 < 0) {
                obj = e.f15357a;
            } else {
                long j2 = qVar.f15444a;
                Object[] objArr = this.f15435p;
                v7.g.c(objArr);
                Object obj2 = objArr[((int) u10) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f15442k;
                }
                qVar.f15444a = u10 + 1;
                Object obj3 = obj2;
                cVarArr = x(j2);
                obj = obj3;
            }
        }
        for (p7.c<m7.n> cVar : cVarArr) {
            if (cVar != null) {
                cVar.t(m7.n.f16010a);
            }
        }
        return obj;
    }

    public final void w(long j2, long j10, long j11, long j12) {
        long min = Math.min(j10, j2);
        for (long r3 = r(); r3 < min; r3++) {
            Object[] objArr = this.f15435p;
            v7.g.c(objArr);
            objArr[((int) r3) & (objArr.length - 1)] = null;
        }
        this.f15436q = j2;
        this.f15437r = j10;
        this.f15438s = (int) (j11 - min);
        this.f15439t = (int) (j12 - j11);
    }

    public final p7.c<m7.n>[] x(long j2) {
        int i10;
        long j10;
        long j11;
        long j12;
        boolean z10;
        long j13;
        Object[] objArr;
        long j14 = this.f15437r;
        p7.c<m7.n>[] cVarArr = m0.b.c;
        if (j2 > j14) {
            return cVarArr;
        }
        long r3 = r();
        long j15 = this.f15438s + r3;
        int i11 = this.n;
        if (i11 == 0 && this.f15439t > 0) {
            j15++;
        }
        if (this.f16028j != 0 && (objArr = this.f16027i) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j16 = ((q) obj).f15444a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f15437r) {
            return cVarArr;
        }
        long r10 = r() + this.f15438s;
        if (this.f16028j > 0) {
            i10 = Math.min(this.f15439t, i11 - ((int) (r10 - j15)));
        } else {
            i10 = this.f15439t;
        }
        long j17 = this.f15439t + r10;
        kotlinx.coroutines.internal.r rVar = e.f15357a;
        if (i10 > 0) {
            cVarArr = new p7.c[i10];
            Object[] objArr2 = this.f15435p;
            v7.g.c(objArr2);
            long j18 = r10;
            int i12 = 0;
            while (true) {
                if (r10 < j17) {
                    j10 = j15;
                    int i13 = (int) r10;
                    Object obj2 = objArr2[(objArr2.length - 1) & i13];
                    if (obj2 != rVar) {
                        if (obj2 != null) {
                            a aVar = (a) obj2;
                            j11 = j17;
                            int i14 = i12 + 1;
                            cVarArr[i12] = aVar.f15443l;
                            objArr2[i13 & (objArr2.length - 1)] = rVar;
                            objArr2[((int) j18) & (objArr2.length - 1)] = aVar.f15442k;
                            j13 = 1;
                            j18++;
                            if (i14 >= i10) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j11 = j17;
                        j13 = 1;
                    }
                    r10 += j13;
                    j15 = j10;
                    j17 = j11;
                } else {
                    j10 = j15;
                    j11 = j17;
                    break;
                }
            }
            r10 = j18;
        } else {
            j10 = j15;
            j11 = j17;
        }
        p7.c<m7.n>[] cVarArr2 = cVarArr;
        int i15 = (int) (r10 - r3);
        if (this.f16028j == 0) {
            j12 = r10;
        } else {
            j12 = j10;
        }
        long max = Math.max(this.f15436q, r10 - Math.min(this.f15433m, i15));
        if (i11 == 0 && max < j11) {
            Object[] objArr3 = this.f15435p;
            v7.g.c(objArr3);
            if (v7.g.a(objArr3[((int) max) & (objArr3.length - 1)], rVar)) {
                r10++;
                max++;
            }
        }
        w(max, j12, r10, j11);
        m();
        if (cVarArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return q(cVarArr2);
        }
        return cVarArr2;
    }
}
