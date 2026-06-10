package kotlinx.coroutines.channels;

import ja.h0;
import ja.j;
import ja.y;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.r;
import la.f;
import m7.n;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.a<E> implements la.c<E> {

    /* loaded from: classes.dex */
    public static final class a<E> implements la.e<E> {

        /* renamed from: a  reason: collision with root package name */
        public final AbstractChannel<E> f15177a;

        /* renamed from: b  reason: collision with root package name */
        public Object f15178b = a1.c.R;

        public a(AbstractChannel<E> abstractChannel) {
            this.f15177a = abstractChannel;
        }

        @Override // la.e
        public final Object a(ContinuationImpl continuationImpl) {
            Object Q;
            l<Throwable, n> lVar;
            Object obj = this.f15178b;
            r rVar = a1.c.R;
            boolean z10 = false;
            if (obj != rVar) {
                if (obj instanceof la.g) {
                    la.g gVar = (la.g) obj;
                    if (gVar.f15880l != null) {
                        Throwable W = gVar.W();
                        int i10 = q.f15494a;
                        throw W;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            AbstractChannel<E> abstractChannel = this.f15177a;
            Object v3 = abstractChannel.v();
            this.f15178b = v3;
            if (v3 != rVar) {
                if (v3 instanceof la.g) {
                    la.g gVar2 = (la.g) v3;
                    if (gVar2.f15880l != null) {
                        Throwable W2 = gVar2.W();
                        int i11 = q.f15494a;
                        throw W2;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            j s02 = m0.b.s0(m0.b.y0(continuationImpl));
            d dVar = new d(this, s02);
            while (true) {
                if (abstractChannel.p(dVar)) {
                    s02.x(new f(dVar));
                    break;
                }
                Object v10 = abstractChannel.v();
                this.f15178b = v10;
                if (v10 instanceof la.g) {
                    la.g gVar3 = (la.g) v10;
                    if (gVar3.f15880l == null) {
                        Q = Boolean.FALSE;
                    } else {
                        Q = m0.b.Q(gVar3.W());
                    }
                    s02.t(Q);
                } else if (v10 != rVar) {
                    Boolean bool = Boolean.TRUE;
                    l<E, n> lVar2 = abstractChannel.f15200i;
                    if (lVar2 != null) {
                        lVar = OnUndeliveredElementKt.a(lVar2, v10, s02.f12777m);
                    } else {
                        lVar = null;
                    }
                    s02.D(bool, s02.f12761k, lVar);
                }
            }
            return s02.s();
        }

        @Override // la.e
        public final E next() {
            E e10 = (E) this.f15178b;
            if (e10 instanceof la.g) {
                Throwable W = ((la.g) e10).W();
                int i10 = q.f15494a;
                throw W;
            }
            r rVar = a1.c.R;
            if (e10 != rVar) {
                this.f15178b = rVar;
                return e10;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    /* loaded from: classes.dex */
    public static class b<E> extends la.l<E> {

        /* renamed from: l  reason: collision with root package name */
        public final ja.i<Object> f15179l;

        /* renamed from: m  reason: collision with root package name */
        public final int f15180m;

        public b(j jVar, int i10) {
            this.f15179l = jVar;
            this.f15180m = i10;
        }

        @Override // la.l
        public final void N(la.g<?> gVar) {
            Object Q;
            if (this.f15180m == 1) {
                Q = new la.f(new f.a(gVar.f15880l));
            } else {
                Q = m0.b.Q(gVar.W());
            }
            this.f15179l.t(Q);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // la.n
        public final r c(Object obj) {
            la.f fVar;
            if (this.f15180m == 1) {
                fVar = new la.f(obj);
            } else {
                fVar = obj;
            }
            if (this.f15179l.o(fVar, null, M(obj)) == null) {
                return null;
            }
            return a1.b.K0;
        }

        @Override // la.n
        public final void h(E e10) {
            this.f15179l.r();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReceiveElement@");
            sb.append(y.a(this));
            sb.append("[receiveMode=");
            return androidx.activity.e.h(sb, this.f15180m, ']');
        }
    }

    /* loaded from: classes.dex */
    public static final class c<E> extends b<E> {
        public final l<E, n> n;

        public c(j jVar, int i10, l lVar) {
            super(jVar, i10);
            this.n = lVar;
        }

        @Override // la.l
        public final l<Throwable, n> M(E e10) {
            return OnUndeliveredElementKt.a(this.n, e10, this.f15179l.f());
        }
    }

    /* loaded from: classes.dex */
    public static class d<E> extends la.l<E> {

        /* renamed from: l  reason: collision with root package name */
        public final a<E> f15181l;

        /* renamed from: m  reason: collision with root package name */
        public final ja.i<Boolean> f15182m;

        public d(a aVar, j jVar) {
            this.f15181l = aVar;
            this.f15182m = jVar;
        }

        @Override // la.l
        public final l<Throwable, n> M(E e10) {
            l<E, n> lVar = this.f15181l.f15177a.f15200i;
            if (lVar != null) {
                return OnUndeliveredElementKt.a(lVar, e10, this.f15182m.f());
            }
            return null;
        }

        @Override // la.l
        public final void N(la.g<?> gVar) {
            r T;
            Throwable th = gVar.f15880l;
            ja.i<Boolean> iVar = this.f15182m;
            if (th == null) {
                T = iVar.n(Boolean.FALSE, null);
            } else {
                T = iVar.T(gVar.W());
            }
            if (T != null) {
                this.f15181l.f15178b = gVar;
                iVar.r();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // la.n
        public final r c(Object obj) {
            if (this.f15182m.o(Boolean.TRUE, null, M(obj)) == null) {
                return null;
            }
            return a1.b.K0;
        }

        @Override // la.n
        public final void h(E e10) {
            this.f15181l.f15178b = e10;
            this.f15182m.r();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "ReceiveHasNext@" + y.a(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<R, E> extends la.l<E> implements h0 {

        /* renamed from: l  reason: collision with root package name */
        public final AbstractChannel<E> f15183l;

        /* renamed from: m  reason: collision with root package name */
        public final kotlinx.coroutines.selects.c<R> f15184m;
        public final p<Object, p7.c<? super R>, Object> n;

        /* renamed from: o  reason: collision with root package name */
        public final int f15185o = 1;

        public e(p pVar, AbstractChannel abstractChannel, kotlinx.coroutines.selects.c cVar) {
            this.f15183l = abstractChannel;
            this.f15184m = cVar;
            this.n = pVar;
        }

        @Override // la.l
        public final l<Throwable, n> M(E e10) {
            l<E, n> lVar = this.f15183l.f15200i;
            if (lVar != null) {
                return OnUndeliveredElementKt.a(lVar, e10, this.f15184m.e().f());
            }
            return null;
        }

        @Override // la.l
        public final void N(la.g<?> gVar) {
            kotlinx.coroutines.selects.c<R> cVar = this.f15184m;
            if (!cVar.m()) {
                return;
            }
            int i10 = this.f15185o;
            if (i10 != 0) {
                if (i10 == 1) {
                    p<Object, p7.c<? super R>, Object> pVar = this.n;
                    la.f fVar = new la.f(new f.a(gVar.f15880l));
                    kotlinx.coroutines.selects.a e10 = cVar.e();
                    try {
                        a1.b.z0(m0.b.y0(m0.b.P(fVar, e10, pVar)), n.f16010a, null);
                        return;
                    } catch (Throwable th) {
                        e10.t(m0.b.Q(th));
                        throw th;
                    }
                }
                return;
            }
            cVar.i(gVar.W());
        }

        @Override // ja.h0
        public final void a() {
            if (I()) {
                this.f15183l.getClass();
            }
        }

        @Override // la.n
        public final r c(Object obj) {
            return (r) this.f15184m.j();
        }

        @Override // la.n
        public final void h(E e10) {
            Object obj;
            if (this.f15185o == 1) {
                obj = new la.f(e10);
            } else {
                obj = e10;
            }
            kotlinx.coroutines.selects.a e11 = this.f15184m.e();
            try {
                a1.b.z0(m0.b.y0(m0.b.P(obj, e11, this.n)), n.f16010a, M(e10));
            } catch (Throwable th) {
                e11.t(m0.b.Q(th));
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReceiveSelect@");
            sb.append(y.a(this));
            sb.append('[');
            sb.append(this.f15184m);
            sb.append(",receiveMode=");
            return androidx.activity.e.h(sb, this.f15185o, ']');
        }
    }

    /* loaded from: classes.dex */
    public final class f extends ja.c {

        /* renamed from: i  reason: collision with root package name */
        public final la.l<?> f15186i;

        public f(la.l<?> lVar) {
            this.f15186i = lVar;
        }

        @Override // u7.l
        public final /* bridge */ /* synthetic */ n U(Throwable th) {
            a(th);
            return n.f16010a;
        }

        @Override // ja.h
        public final void a(Throwable th) {
            if (this.f15186i.I()) {
                AbstractChannel.this.getClass();
            }
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f15186i + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class g<E> extends LockFreeLinkedListNode.d<la.p> {
        public g(kotlinx.coroutines.internal.h hVar) {
            super(hVar);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.d, kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final Object c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof la.g) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof la.p) {
                return null;
            }
            return a1.c.R;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final Object h(LockFreeLinkedListNode.c cVar) {
            r Q = ((la.p) cVar.f15456a).Q(cVar);
            if (Q == null) {
                return a1.b.S0;
            }
            r rVar = a1.b.P0;
            if (Q == rVar) {
                return rVar;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.a
        public final void i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((la.p) lockFreeLinkedListNode).S();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends LockFreeLinkedListNode.b {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AbstractChannel f15188d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f15188d = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.c
        public final Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            if (this.f15188d.r()) {
                return null;
            }
            return a1.c.H;
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements kotlinx.coroutines.selects.b<la.f<? extends E>> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ AbstractChannel<E> f15189i;

        public i(AbstractChannel<E> abstractChannel) {
            this.f15189i = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.b
        public final <R> void s(kotlinx.coroutines.selects.c<? super R> cVar, p<? super la.f<? extends E>, ? super p7.c<? super R>, ? extends Object> pVar) {
            boolean z10;
            la.f fVar;
            AbstractChannel<E> abstractChannel = this.f15189i;
            abstractChannel.getClass();
            while (!cVar.u()) {
                if (!(abstractChannel.f15201j.C() instanceof la.p) && abstractChannel.r()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    e eVar = new e(pVar, abstractChannel, cVar);
                    boolean p10 = abstractChannel.p(eVar);
                    if (p10) {
                        cVar.w(eVar);
                    }
                    if (p10) {
                        return;
                    }
                } else {
                    Object w10 = abstractChannel.w(cVar);
                    if (w10 == kotlinx.coroutines.selects.d.f15552b) {
                        return;
                    }
                    if (w10 != a1.c.R && w10 != a1.b.P0) {
                        boolean z11 = w10 instanceof la.g;
                        if (z11) {
                            if (cVar.m()) {
                                fVar = new la.f(new f.a(((la.g) w10).f15880l));
                            }
                        } else {
                            if (z11) {
                                w10 = new f.a(((la.g) w10).f15880l);
                            }
                            fVar = new la.f(w10);
                        }
                        a1.c.A1(fVar, cVar.e(), pVar);
                    }
                }
            }
        }
    }

    public AbstractChannel(l<? super E, n> lVar) {
        super(lVar);
    }

    @Override // la.m
    public final Object E() {
        Object v3 = v();
        if (v3 == a1.c.R) {
            return la.f.f15877b;
        }
        if (v3 instanceof la.g) {
            return new f.a(((la.g) v3).f15880l);
        }
        return v3;
    }

    @Override // la.m
    public final Object L(SuspendLambda suspendLambda) {
        Object v3 = v();
        return (v3 == a1.c.R || (v3 instanceof la.g)) ? y(0, suspendLambda) : v3;
    }

    @Override // la.m
    public final void c(CancellationException cancellationException) {
        if (s()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        t(d(cancellationException));
    }

    @Override // la.m
    public final la.e<E> iterator() {
        return new a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // la.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(p7.c<? super la.f<? extends E>> cVar) {
        AbstractChannel$receiveCatching$1 abstractChannel$receiveCatching$1;
        int i10;
        if (cVar instanceof AbstractChannel$receiveCatching$1) {
            abstractChannel$receiveCatching$1 = (AbstractChannel$receiveCatching$1) cVar;
            int i11 = abstractChannel$receiveCatching$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                abstractChannel$receiveCatching$1.n = i11 - Integer.MIN_VALUE;
                Object obj = abstractChannel$receiveCatching$1.f15190l;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = abstractChannel$receiveCatching$1.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Object v3 = v();
                    if (v3 != a1.c.R) {
                        if (v3 instanceof la.g) {
                            return new f.a(((la.g) v3).f15880l);
                        }
                        return v3;
                    }
                    abstractChannel$receiveCatching$1.n = 1;
                    obj = y(1, abstractChannel$receiveCatching$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return ((la.f) obj).f15878a;
            }
        }
        abstractChannel$receiveCatching$1 = new AbstractChannel$receiveCatching$1(this, cVar);
        Object obj2 = abstractChannel$receiveCatching$1.f15190l;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = abstractChannel$receiveCatching$1.n;
        if (i10 == 0) {
        }
        return ((la.f) obj2).f15878a;
    }

    @Override // kotlinx.coroutines.channels.a
    public final la.n<E> n() {
        la.n<E> n = super.n();
        if (n != null) {
            boolean z10 = n instanceof la.g;
        }
        return n;
    }

    public boolean p(la.l<? super E> lVar) {
        LockFreeLinkedListNode F;
        boolean q10 = q();
        kotlinx.coroutines.internal.h hVar = this.f15201j;
        if (!q10) {
            h hVar2 = new h(lVar, this);
            while (true) {
                LockFreeLinkedListNode F2 = hVar.F();
                if (!(!(F2 instanceof la.p))) {
                    break;
                }
                int L = F2.L(lVar, hVar, hVar2);
                if (L == 1) {
                    return true;
                }
                if (L == 2) {
                    break;
                }
            }
        } else {
            do {
                F = hVar.F();
                if (!(!(F instanceof la.p))) {
                }
            } while (!F.x(lVar, hVar));
            return true;
        }
        return false;
    }

    public abstract boolean q();

    public abstract boolean r();

    public boolean s() {
        la.g gVar;
        LockFreeLinkedListNode C = this.f15201j.C();
        la.g gVar2 = null;
        if (C instanceof la.g) {
            gVar = (la.g) C;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            kotlinx.coroutines.channels.a.h(gVar);
            gVar2 = gVar;
        }
        if (gVar2 != null && r()) {
            return true;
        }
        return false;
    }

    public void t(boolean z10) {
        la.g<?> g10 = g();
        if (g10 != null) {
            Object obj = null;
            while (true) {
                LockFreeLinkedListNode F = g10.F();
                if (F instanceof kotlinx.coroutines.internal.h) {
                    u(obj, g10);
                    return;
                } else if (!F.I()) {
                    ((kotlinx.coroutines.internal.n) F.A()).f15492a.G();
                } else {
                    obj = a1.c.j1(obj, (la.p) F);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void u(Object obj, la.g<?> gVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((la.p) obj).P(gVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((la.p) arrayList.get(size)).P(gVar);
            }
        }
    }

    public Object v() {
        while (true) {
            la.p o10 = o();
            if (o10 == null) {
                return a1.c.R;
            }
            if (o10.Q(null) != null) {
                o10.M();
                return o10.N();
            }
            o10.S();
        }
    }

    public Object w(kotlinx.coroutines.selects.c<?> cVar) {
        g gVar = new g(this.f15201j);
        Object d5 = cVar.d(gVar);
        if (d5 != null) {
            return d5;
        }
        ((la.p) gVar.m()).M();
        return ((la.p) gVar.m()).N();
    }

    @Override // la.m
    public final kotlinx.coroutines.selects.b<la.f<E>> x() {
        return new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.channels.AbstractChannel$b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.channels.a, kotlinx.coroutines.channels.AbstractChannel<E>, kotlinx.coroutines.channels.AbstractChannel] */
    public final Object y(int i10, ContinuationImpl continuationImpl) {
        c cVar;
        Object obj;
        j s02 = m0.b.s0(m0.b.y0(continuationImpl));
        l<E, n> lVar = this.f15200i;
        if (lVar == null) {
            cVar = new b(s02, i10);
        } else {
            cVar = new c(s02, i10, lVar);
        }
        while (true) {
            if (p(cVar)) {
                s02.x(new f(cVar));
                break;
            }
            Object v3 = v();
            if (v3 instanceof la.g) {
                cVar.N((la.g) v3);
                break;
            } else if (v3 != a1.c.R) {
                if (cVar.f15180m == 1) {
                    obj = new la.f(v3);
                } else {
                    obj = v3;
                }
                s02.D(obj, s02.f12761k, cVar.M(v3));
            }
        }
        return s02.s();
    }
}
