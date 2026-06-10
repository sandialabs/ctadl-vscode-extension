package kotlinx.coroutines.flow;

import ja.u0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public final class StateFlowImpl<T> extends ma.a<v> implements k<T>, b, ma.f<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: m  reason: collision with root package name */
    public int f15343m;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (v7.g.a(r0, r13) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e2, B:58:0x00fa, B:64:0x010d, B:65:0x0112, B:68:0x0119, B:61:0x0105, B:44:0x00ae, B:48:0x00b5, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:78:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e2, B:58:0x00fa, B:64:0x010d, B:65:0x0112, B:68:0x0119, B:61:0x0105, B:44:0x00ae, B:48:0x00b5, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:78:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e0 -> B:34:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x011b -> B:34:0x0096). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super T> cVar, p7.c<?> cVar2) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        v vVar;
        StateFlowImpl<T> stateFlowImpl;
        v vVar2;
        u0 u0Var;
        c cVar3;
        CoroutineSingletons coroutineSingletons2;
        Object obj;
        Object andSet;
        boolean z10;
        Object obj2;
        Object obj3;
        c<? super T> cVar4 = cVar;
        try {
            if (cVar2 instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) cVar2;
                int i11 = stateFlowImpl$collect$1.f15350s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.f15350s = i11 - Integer.MIN_VALUE;
                    Object obj4 = stateFlowImpl$collect$1.f15348q;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = stateFlowImpl$collect$1.f15350s;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    obj = stateFlowImpl$collect$1.f15347p;
                                    u0Var = stateFlowImpl$collect$1.f15346o;
                                    vVar2 = stateFlowImpl$collect$1.n;
                                    cVar3 = stateFlowImpl$collect$1.f15345m;
                                    stateFlowImpl = stateFlowImpl$collect$1.f15344l;
                                    m0.b.n1(obj4);
                                    coroutineSingletons2 = coroutineSingletons;
                                    obj2 = stateFlowImpl._state;
                                    if (u0Var != null && !u0Var.b()) {
                                        throw u0Var.C();
                                    }
                                    if (obj2 == ma.i.f16036b) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    stateFlowImpl$collect$1.f15344l = stateFlowImpl;
                                    stateFlowImpl$collect$1.f15345m = cVar3;
                                    stateFlowImpl$collect$1.n = vVar2;
                                    stateFlowImpl$collect$1.f15346o = u0Var;
                                    stateFlowImpl$collect$1.f15347p = obj2;
                                    stateFlowImpl$collect$1.f15350s = 2;
                                    if (cVar3.c(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    obj = obj2;
                                    cVar3 = cVar3;
                                    vVar2.getClass();
                                    kotlinx.coroutines.internal.r rVar = f.f15358a;
                                    andSet = v.f15451a.getAndSet(vVar2, rVar);
                                    v7.g.c(andSet);
                                    boolean z11 = false;
                                    if (andSet != f.f15359b) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        stateFlowImpl$collect$1.f15344l = stateFlowImpl;
                                        stateFlowImpl$collect$1.f15345m = cVar3;
                                        stateFlowImpl$collect$1.n = vVar2;
                                        stateFlowImpl$collect$1.f15346o = u0Var;
                                        stateFlowImpl$collect$1.f15347p = obj;
                                        stateFlowImpl$collect$1.f15350s = 3;
                                        ja.j jVar = new ja.j(1, m0.b.y0(stateFlowImpl$collect$1));
                                        jVar.u();
                                        while (true) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v.f15451a;
                                            if (atomicReferenceFieldUpdater.compareAndSet(vVar2, rVar, jVar)) {
                                                z11 = true;
                                                break;
                                            } else if (atomicReferenceFieldUpdater.get(vVar2) != rVar) {
                                                break;
                                            }
                                        }
                                        if (!z11) {
                                            jVar.t(m7.n.f16010a);
                                        }
                                        Object s10 = jVar.s();
                                        if (s10 != coroutineSingletons2) {
                                            s10 = m7.n.f16010a;
                                        }
                                        if (s10 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                    obj2 = stateFlowImpl._state;
                                    if (u0Var != null) {
                                        throw u0Var.C();
                                    }
                                    if (obj2 == ma.i.f16036b) {
                                    }
                                    stateFlowImpl$collect$1.f15344l = stateFlowImpl;
                                    stateFlowImpl$collect$1.f15345m = cVar3;
                                    stateFlowImpl$collect$1.n = vVar2;
                                    stateFlowImpl$collect$1.f15346o = u0Var;
                                    stateFlowImpl$collect$1.f15347p = obj2;
                                    stateFlowImpl$collect$1.f15350s = 2;
                                    if (cVar3.c(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = stateFlowImpl$collect$1.f15347p;
                                u0Var = stateFlowImpl$collect$1.f15346o;
                                vVar2 = stateFlowImpl$collect$1.n;
                                c cVar5 = stateFlowImpl$collect$1.f15345m;
                                stateFlowImpl = stateFlowImpl$collect$1.f15344l;
                                m0.b.n1(obj4);
                                coroutineSingletons2 = coroutineSingletons;
                                cVar3 = cVar5;
                                vVar2.getClass();
                                kotlinx.coroutines.internal.r rVar2 = f.f15358a;
                                andSet = v.f15451a.getAndSet(vVar2, rVar2);
                                v7.g.c(andSet);
                                boolean z112 = false;
                                if (andSet != f.f15359b) {
                                }
                                if (!z10) {
                                }
                                obj2 = stateFlowImpl._state;
                                if (u0Var != null) {
                                }
                                if (obj2 == ma.i.f16036b) {
                                }
                                stateFlowImpl$collect$1.f15344l = stateFlowImpl;
                                stateFlowImpl$collect$1.f15345m = cVar3;
                                stateFlowImpl$collect$1.n = vVar2;
                                stateFlowImpl$collect$1.f15346o = u0Var;
                                stateFlowImpl$collect$1.f15347p = obj2;
                                stateFlowImpl$collect$1.f15350s = 2;
                                if (cVar3.c(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                                }
                            }
                        } else {
                            vVar2 = stateFlowImpl$collect$1.n;
                            cVar4 = stateFlowImpl$collect$1.f15345m;
                            stateFlowImpl = stateFlowImpl$collect$1.f15344l;
                            m0.b.n1(obj4);
                        }
                    } else {
                        m0.b.n1(obj4);
                        vVar = g();
                        try {
                            if (cVar4 instanceof w) {
                                stateFlowImpl$collect$1.f15344l = this;
                                stateFlowImpl$collect$1.f15345m = cVar4;
                                stateFlowImpl$collect$1.n = vVar;
                                stateFlowImpl$collect$1.f15350s = 1;
                                if (((w) cVar4).a(stateFlowImpl$collect$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            stateFlowImpl = this;
                            vVar2 = vVar;
                        } catch (Throwable th) {
                            th = th;
                            stateFlowImpl = this;
                            stateFlowImpl.k(vVar);
                            throw th;
                        }
                    }
                    CoroutineContext coroutineContext = stateFlowImpl$collect$1.f13036j;
                    v7.g.c(coroutineContext);
                    u0Var = (u0) coroutineContext.a(u0.b.f12806i);
                    cVar3 = cVar4;
                    coroutineSingletons2 = coroutineSingletons;
                    obj = null;
                    obj2 = stateFlowImpl._state;
                    if (u0Var != null) {
                    }
                    if (obj2 == ma.i.f16036b) {
                    }
                    stateFlowImpl$collect$1.f15344l = stateFlowImpl;
                    stateFlowImpl$collect$1.f15345m = cVar3;
                    stateFlowImpl$collect$1.n = vVar2;
                    stateFlowImpl$collect$1.f15346o = u0Var;
                    stateFlowImpl$collect$1.f15347p = obj2;
                    stateFlowImpl$collect$1.f15350s = 2;
                    if (cVar3.c(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                    }
                }
            }
            if (i10 == 0) {
            }
            CoroutineContext coroutineContext2 = stateFlowImpl$collect$1.f13036j;
            v7.g.c(coroutineContext2);
            u0Var = (u0) coroutineContext2.a(u0.b.f12806i);
            cVar3 = cVar4;
            coroutineSingletons2 = coroutineSingletons;
            obj = null;
            obj2 = stateFlowImpl._state;
            if (u0Var != null) {
            }
            if (obj2 == ma.i.f16036b) {
            }
            stateFlowImpl$collect$1.f15344l = stateFlowImpl;
            stateFlowImpl$collect$1.f15345m = cVar3;
            stateFlowImpl$collect$1.n = vVar2;
            stateFlowImpl$collect$1.f15346o = u0Var;
            stateFlowImpl$collect$1.f15347p = obj2;
            stateFlowImpl$collect$1.f15350s = 2;
            if (cVar3.c(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVar2;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, cVar2);
        Object obj42 = stateFlowImpl$collect$1.f15348q;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = stateFlowImpl$collect$1.f15350s;
    }

    @Override // kotlinx.coroutines.flow.o
    public final List<T> b() {
        return a1.c.N0(getValue());
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super m7.n> cVar) {
        setValue(t10);
        return m7.n.f16010a;
    }

    @Override // kotlinx.coroutines.flow.j
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.j
    public final boolean e(T t10) {
        setValue(t10);
        return true;
    }

    @Override // ma.f
    public final b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((!z10 && i10 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && ((i10 != 0 && i10 != -3) || bufferOverflow != BufferOverflow.SUSPEND)) {
            return new ma.c(i10, coroutineContext, bufferOverflow, this);
        }
        return this;
    }

    @Override // kotlinx.coroutines.flow.u
    public final T getValue() {
        kotlinx.coroutines.internal.r rVar = ma.i.f16036b;
        T t10 = (T) this._state;
        if (t10 == rVar) {
            return null;
        }
        return t10;
    }

    @Override // ma.a
    public final v i() {
        return new v();
    }

    @Override // ma.a
    public final ma.b[] j() {
        return new v[2];
    }

    public final boolean l(Object obj, Object obj2) {
        int i10;
        Object obj3;
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        boolean z11;
        synchronized (this) {
            Object obj4 = this._state;
            if (obj != null && !v7.g.a(obj4, obj)) {
                return false;
            }
            if (v7.g.a(obj4, obj2)) {
                return true;
            }
            this._state = obj2;
            int i11 = this.f15343m;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f15343m = i12;
                Object obj5 = this.f16027i;
                m7.n nVar = m7.n.f16010a;
                while (true) {
                    v[] vVarArr = (v[]) obj5;
                    if (vVarArr != null) {
                        for (v vVar : vVarArr) {
                            if (vVar != null) {
                                while (true) {
                                    Object obj6 = vVar._state;
                                    if (obj6 != null && obj6 != (rVar = f.f15359b)) {
                                        kotlinx.coroutines.internal.r rVar2 = f.f15358a;
                                        if (obj6 == rVar2) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v.f15451a;
                                            while (true) {
                                                if (atomicReferenceFieldUpdater.compareAndSet(vVar, obj6, rVar)) {
                                                    z10 = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater.get(vVar) != obj6) {
                                                    z10 = false;
                                                    break;
                                                }
                                            }
                                            if (z10) {
                                                break;
                                            }
                                        } else {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v.f15451a;
                                            while (true) {
                                                if (atomicReferenceFieldUpdater2.compareAndSet(vVar, obj6, rVar2)) {
                                                    z11 = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater2.get(vVar) != obj6) {
                                                    z11 = false;
                                                    break;
                                                }
                                            }
                                            if (z11) {
                                                ((ja.j) obj6).t(m7.n.f16010a);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f15343m;
                        if (i10 == i12) {
                            this.f15343m = i12 + 1;
                            return true;
                        }
                        obj3 = this.f16027i;
                        m7.n nVar2 = m7.n.f16010a;
                    }
                    obj5 = obj3;
                    i12 = i10;
                }
            } else {
                this.f15343m = i11 + 2;
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.k
    public final void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) ma.i.f16036b;
        }
        l(null, t10);
    }
}
