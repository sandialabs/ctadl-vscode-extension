package androidx.compose.runtime;

import g0.c0;
import ja.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class a implements c0 {

    /* renamed from: i  reason: collision with root package name */
    public final u7.a<n> f2842i;

    /* renamed from: k  reason: collision with root package name */
    public Throwable f2844k;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2843j = new Object();

    /* renamed from: l  reason: collision with root package name */
    public List<C0021a<?>> f2845l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public List<C0021a<?>> f2846m = new ArrayList();

    /* renamed from: androidx.compose.runtime.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0021a<R> {

        /* renamed from: a  reason: collision with root package name */
        public final l<Long, R> f2847a;

        /* renamed from: b  reason: collision with root package name */
        public final p7.c<R> f2848b;

        public C0021a(j jVar, l lVar) {
            v7.g.f(lVar, "onFrame");
            this.f2847a = lVar;
            this.f2848b = jVar;
        }
    }

    public a(u7.a<n> aVar) {
        this.f2842i = aVar;
    }

    public static final void d(a aVar, Throwable th) {
        synchronized (aVar.f2843j) {
            if (aVar.f2844k == null) {
                aVar.f2844k = th;
                List<C0021a<?>> list = aVar.f2845l;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).f2848b.t(m0.b.Q(th));
                }
                aVar.f2845l.clear();
                n nVar = n.f16010a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.runtime.a$a] */
    @Override // g0.c0
    public final Object D(p7.c cVar, l lVar) {
        boolean z10;
        u7.a<n> aVar;
        j jVar = new j(1, m0.b.y0(cVar));
        jVar.u();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.f2843j) {
            Throwable th = this.f2844k;
            if (th != null) {
                jVar.t(m0.b.Q(th));
            } else {
                ref$ObjectRef.f13060i = new C0021a(jVar, lVar);
                if (!this.f2845l.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                List<C0021a<?>> list = this.f2845l;
                T t10 = ref$ObjectRef.f13060i;
                if (t10 != 0) {
                    list.add((C0021a) t10);
                    boolean z11 = !z10;
                    jVar.x(new BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                    if (z11 && (aVar = this.f2842i) != null) {
                        try {
                            aVar.k0();
                        } catch (Throwable th2) {
                            d(this, th2);
                        }
                    }
                } else {
                    v7.g.l("awaiter");
                    throw null;
                }
            }
        }
        return jVar.s();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(r3, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        v7.g.f(bVar, "key");
        return CoroutineContext.a.C0140a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        v7.g.f(bVar, "key");
        return (E) CoroutineContext.a.C0140a.a(this, bVar);
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f2843j) {
            z10 = !this.f2845l.isEmpty();
        }
        return z10;
    }

    public final void f(long j2) {
        synchronized (this.f2843j) {
            List<C0021a<?>> list = this.f2845l;
            this.f2845l = this.f2846m;
            this.f2846m = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0021a<?> c0021a = list.get(i10);
                c0021a.getClass();
                c0021a.f2848b.t(c0021a.f2847a.U(Long.valueOf(j2)));
            }
            list.clear();
            n nVar = n.f16010a;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public final CoroutineContext.b getKey() {
        return c0.a.f11038i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }
}
