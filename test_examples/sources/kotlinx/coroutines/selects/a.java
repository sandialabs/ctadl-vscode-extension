package kotlinx.coroutines.selects;

import ja.h0;
import ja.s;
import ja.u0;
import ja.v0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.r;
import m0.b;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a<R> extends h implements kotlinx.coroutines.selects.c<R>, p7.c<R>, q7.b {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15543m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_result");

    /* renamed from: l  reason: collision with root package name */
    public final p7.c<R> f15544l;
    volatile /* synthetic */ Object _state = kotlinx.coroutines.selects.d.f15551a;
    private volatile /* synthetic */ Object _result = kotlinx.coroutines.selects.d.c;
    private volatile /* synthetic */ Object _parentHandle = null;

    /* renamed from: kotlinx.coroutines.selects.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0174a extends kotlinx.coroutines.internal.c<Object> {

        /* renamed from: b  reason: collision with root package name */
        public final a<?> f15545b;
        public final kotlinx.coroutines.internal.b c;

        /* renamed from: d  reason: collision with root package name */
        public final long f15546d;

        public C0174a(a aVar, AbstractChannel.g gVar) {
            this.f15545b = aVar;
            this.c = gVar;
            e eVar = kotlinx.coroutines.selects.d.f15554e;
            eVar.getClass();
            this.f15546d = e.f15555a.incrementAndGet(eVar);
            gVar.f15471a = this;
        }

        @Override // kotlinx.coroutines.internal.c
        public final void d(Object obj, Object obj2) {
            boolean z10;
            r rVar;
            a<?> aVar;
            boolean z11 = true;
            if (obj2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rVar = null;
            } else {
                rVar = kotlinx.coroutines.selects.d.f15551a;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f15543m;
            while (true) {
                aVar = this.f15545b;
                if (!atomicReferenceFieldUpdater.compareAndSet(aVar, this, rVar)) {
                    if (atomicReferenceFieldUpdater.get(aVar) != this) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z11 && z10) {
                aVar.M();
            }
            this.c.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.c
        public final long g() {
            return this.f15546d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
            r0 = null;
         */
        @Override // kotlinx.coroutines.internal.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object i(Object obj) {
            r rVar;
            boolean z10;
            if (obj == null) {
                a<?> aVar = this.f15545b;
                while (true) {
                    Object obj2 = aVar._state;
                    if (obj2 == this) {
                        break;
                    } else if (obj2 instanceof m) {
                        ((m) obj2).c(this.f15545b);
                    } else {
                        r rVar2 = kotlinx.coroutines.selects.d.f15551a;
                        if (obj2 == rVar2) {
                            a<?> aVar2 = this.f15545b;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f15543m;
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(aVar2, rVar2, this)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(aVar2) != rVar2) {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                break;
                            }
                        } else {
                            rVar = kotlinx.coroutines.selects.d.f15552b;
                            break;
                        }
                    }
                }
                if (rVar != null) {
                    return rVar;
                }
            }
            try {
                return this.c.b(this);
            } catch (Throwable th) {
                if (obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.f15543m;
                    r rVar3 = kotlinx.coroutines.selects.d.f15551a;
                    while (true) {
                        a<?> aVar3 = this.f15545b;
                        if (atomicReferenceFieldUpdater2.compareAndSet(aVar3, this, rVar3) || atomicReferenceFieldUpdater2.get(aVar3) != this) {
                            break;
                        }
                    }
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.m
        public final String toString() {
            return "AtomicSelectOp(sequence=" + this.f15546d + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends LockFreeLinkedListNode {

        /* renamed from: l  reason: collision with root package name */
        public final h0 f15547l;

        public b(h0 h0Var) {
            this.f15547l = h0Var;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends v0 {
        public c() {
        }

        @Override // ja.u
        public final void M(Throwable th) {
            a<R> aVar = a.this;
            if (aVar.m()) {
                aVar.i(N().C());
            }
        }

        @Override // u7.l
        public final /* bridge */ /* synthetic */ n U(Throwable th) {
            M(th);
            return n.f16010a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ l f15550j;

        public d(l lVar) {
            this.f15550j = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p7.c<n> cVar;
            final a aVar = a.this;
            if (aVar.m()) {
                final l lVar = this.f15550j;
                try {
                    g.f(lVar, "<this>");
                    if (lVar instanceof BaseContinuationImpl) {
                        cVar = ((BaseContinuationImpl) lVar).i(aVar);
                    } else {
                        final CoroutineContext f10 = aVar.f();
                        if (f10 == EmptyCoroutineContext.f13021i) {
                            cVar = new RestrictedContinuationImpl(aVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

                                /* renamed from: j  reason: collision with root package name */
                                public int f13026j;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object k(Object obj) {
                                    int i10 = this.f13026j;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            this.f13026j = 2;
                                            b.n1(obj);
                                            return obj;
                                        }
                                        throw new IllegalStateException("This coroutine had already completed".toString());
                                    }
                                    this.f13026j = 1;
                                    b.n1(obj);
                                    l lVar2 = lVar;
                                    g.d(lVar2, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                                    v7.l.d(1, lVar2);
                                    return lVar2.U(this);
                                }
                            };
                        } else {
                            cVar = new ContinuationImpl(aVar, f10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

                                /* renamed from: l  reason: collision with root package name */
                                public int f13028l;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object k(Object obj) {
                                    int i10 = this.f13028l;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            this.f13028l = 2;
                                            b.n1(obj);
                                            return obj;
                                        }
                                        throw new IllegalStateException("This coroutine had already completed".toString());
                                    }
                                    this.f13028l = 1;
                                    b.n1(obj);
                                    l lVar2 = lVar;
                                    g.d(lVar2, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                                    v7.l.d(1, lVar2);
                                    return lVar2.U(this);
                                }
                            };
                        }
                    }
                    a1.b.z0(m0.b.y0(cVar), n.f16010a, null);
                } catch (Throwable th) {
                    aVar.t(m0.b.Q(th));
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(p7.c<? super R> cVar) {
        this.f15544l = cVar;
    }

    public final void M() {
        h0 h0Var = (h0) this._parentHandle;
        if (h0Var != null) {
            h0Var.a();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) A(); !g.a(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.C()) {
            if (lockFreeLinkedListNode instanceof b) {
                ((b) lockFreeLinkedListNode).f15547l.a();
            }
        }
    }

    public final Object N() {
        u0 u0Var;
        boolean z10 = true;
        if (!u() && (u0Var = (u0) f().a(u0.b.f12806i)) != null) {
            h0 a10 = u0.a.a(u0Var, true, new c(), 2);
            this._parentHandle = a10;
            if (u()) {
                a10.a();
            }
        }
        Object obj = this._result;
        r rVar = kotlinx.coroutines.selects.d.c;
        if (obj == rVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, coroutineSingletons)) {
                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                return coroutineSingletons;
            }
            obj = this._result;
        }
        if (obj != kotlinx.coroutines.selects.d.f15553d) {
            if (!(obj instanceof s)) {
                return obj;
            }
            throw ((s) obj).f12801a;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final void P(long j2, l<? super p7.c<? super R>, ? extends Object> lVar) {
        Object Q;
        if (j2 <= 0) {
            if (m()) {
                try {
                    v7.l.d(1, lVar);
                    Q = lVar.U(this);
                } catch (Throwable th) {
                    Q = m0.b.Q(th);
                }
                if (Q != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    t(Q);
                    return;
                }
                return;
            }
            return;
        }
        w(m0.b.l0(f()).j(j2, new d(lVar), f()));
    }

    @Override // kotlinx.coroutines.selects.c
    public final Object d(AbstractChannel.g gVar) {
        return new C0174a(this, gVar).c(null);
    }

    @Override // kotlinx.coroutines.selects.c
    public final a e() {
        return this;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f15544l.f();
    }

    @Override // q7.b
    public final q7.b g() {
        p7.c<R> cVar = this.f15544l;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.selects.c
    public final void i(Throwable th) {
        while (true) {
            Object obj = this._result;
            r rVar = kotlinx.coroutines.selects.d.c;
            boolean z10 = false;
            if (obj == rVar) {
                s sVar = new s(th, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, sVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj == coroutineSingletons) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    r rVar2 = kotlinx.coroutines.selects.d.f15553d;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, rVar2)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                            break;
                        }
                    }
                    if (z10) {
                        m0.b.y0(this.f15544l).t(m0.b.Q(th));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.c
    public final Object j() {
        boolean z10;
        while (true) {
            Object obj = this._state;
            r rVar = kotlinx.coroutines.selects.d.f15551a;
            r rVar2 = a1.b.K0;
            if (obj == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15543m;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    M();
                    return rVar2;
                }
            } else if (!(obj instanceof m)) {
                return null;
            } else {
                ((m) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.selects.c
    public final boolean m() {
        Object j2 = j();
        if (j2 == a1.b.K0) {
            return true;
        }
        if (j2 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + j2).toString());
    }

    @Override // p7.c
    public final void t(Object obj) {
        Object sVar;
        p7.c<R> cVar;
        while (true) {
            Object obj2 = this._result;
            r rVar = kotlinx.coroutines.selects.d.c;
            boolean z10 = true;
            if (obj2 == rVar) {
                Throwable a10 = Result.a(obj);
                if (a10 == null) {
                    sVar = obj;
                } else {
                    sVar = new s(a10, false);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, sVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 == coroutineSingletons) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    r rVar2 = kotlinx.coroutines.selects.d.f15553d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, rVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        if (obj instanceof Result.Failure) {
                            cVar = this.f15544l;
                            Throwable a11 = Result.a(obj);
                            g.c(a11);
                            obj = m0.b.Q(a11);
                        } else {
                            cVar = this.f15544l;
                        }
                        cVar.t(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @Override // kotlinx.coroutines.selects.c
    public final boolean u() {
        while (true) {
            Object obj = this._state;
            if (obj == kotlinx.coroutines.selects.d.f15551a) {
                return false;
            }
            if (!(obj instanceof m)) {
                return true;
            }
            ((m) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.c
    public final void w(h0 h0Var) {
        b bVar = new b(h0Var);
        if (!u()) {
            do {
            } while (!F().x(bVar, this));
            if (!u()) {
                return;
            }
        }
        h0Var.a();
    }
}
