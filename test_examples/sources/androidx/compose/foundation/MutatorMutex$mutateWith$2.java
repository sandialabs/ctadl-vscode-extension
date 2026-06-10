package androidx.compose.foundation;

import androidx.compose.foundation.MutatorMutex;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import ja.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.MutexImpl;
import m7.n;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutatorMutex$mutateWith$2 extends SuspendLambda implements p<x, p7.c<? super R>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public kotlinx.coroutines.sync.b f1551m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public Object f1552o;

    /* renamed from: p  reason: collision with root package name */
    public MutatorMutex f1553p;

    /* renamed from: q  reason: collision with root package name */
    public int f1554q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1555r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ MutatePriority f1556s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ MutatorMutex f1557t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p<T, p7.c<? super R>, Object> f1558u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ T f1559v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p<? super T, ? super p7.c<? super R>, ? extends Object> pVar, T t10, p7.c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.f1556s = mutatePriority;
        this.f1557t = mutatorMutex;
        this.f1558u = pVar;
        this.f1559v = t10;
    }

    @Override // u7.p
    public final Object R(x xVar, Object obj) {
        return ((MutatorMutex$mutateWith$2) a(xVar, (p7.c) obj)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f1556s, this.f1557t, this.f1558u, this.f1559v, cVar);
        mutatorMutex$mutateWith$2.f1555r = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x008c, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:41:0x00c8, B:42:0x00ca, B:45:0x00d1, B:51:0x00e0, B:52:0x00e2, B:54:0x00e8, B:57:0x00ef), top: B:61:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.b, int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlinx.coroutines.sync.b] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        MutatorMutex mutatorMutex;
        MutatorMutex.a aVar;
        boolean z10;
        Object obj2;
        MutatorMutex.a aVar2;
        MutexImpl mutexImpl;
        p pVar;
        boolean z11;
        MutatorMutex.a aVar3;
        MutatorMutex mutatorMutex2;
        Throwable th;
        AtomicReference<MutatorMutex.a> atomicReference;
        MutexImpl mutexImpl2;
        AtomicReference<MutatorMutex.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.f1554q;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.n;
                            ?? r12 = this.f1551m;
                            aVar3 = (MutatorMutex.a) this.f1555r;
                            try {
                                m0.b.n1(obj);
                                mutexImpl2 = r12;
                                atomicReference2 = mutatorMutex2.f1547a;
                                while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                                }
                                mutexImpl2.a(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.f1547a;
                                while (!atomicReference.compareAndSet(aVar3, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutatorMutex mutatorMutex3 = this.f1553p;
                    obj2 = this.f1552o;
                    pVar = (p) this.n;
                    ?? r62 = this.f1551m;
                    aVar2 = (MutatorMutex.a) this.f1555r;
                    m0.b.n1(obj);
                    mutatorMutex = mutatorMutex3;
                    mutexImpl = r62;
                } else {
                    m0.b.n1(obj);
                    CoroutineContext.a a10 = ((x) this.f1555r).j().a(u0.b.f12806i);
                    g.c(a10);
                    MutatorMutex.a aVar4 = new MutatorMutex.a(this.f1556s, (u0) a10);
                    do {
                        mutatorMutex = this.f1557t;
                        AtomicReference<MutatorMutex.a> atomicReference3 = mutatorMutex.f1547a;
                        aVar = atomicReference3.get();
                        z10 = false;
                        if (aVar != null) {
                            if (aVar4.f1549a.compareTo(aVar.f1549a) >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (true) {
                            if (atomicReference3.compareAndSet(aVar, aVar4)) {
                                z10 = true;
                                continue;
                                break;
                            } else if (atomicReference3.get() != aVar) {
                                break;
                            }
                        }
                    } while (!z10);
                    if (aVar != null) {
                        aVar.f1550b.c(null);
                    }
                    this.f1555r = aVar4;
                    MutexImpl mutexImpl3 = mutatorMutex.f1548b;
                    this.f1551m = mutexImpl3;
                    p pVar2 = this.f1558u;
                    this.n = pVar2;
                    Object obj3 = this.f1559v;
                    this.f1552o = obj3;
                    this.f1553p = mutatorMutex;
                    this.f1554q = 1;
                    if (mutexImpl3.b(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = obj3;
                    aVar2 = aVar4;
                    mutexImpl = mutexImpl3;
                    pVar = pVar2;
                }
                this.f1555r = aVar2;
                this.f1551m = mutexImpl;
                this.n = mutatorMutex;
                this.f1552o = null;
                this.f1553p = null;
                this.f1554q = 2;
                Object R = pVar.R(obj2, this);
                if (R == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutatorMutex2 = mutatorMutex;
                obj = R;
                aVar3 = aVar2;
                mutexImpl2 = mutexImpl;
                atomicReference2 = mutatorMutex2.f1547a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                    while (!atomicReference2.compareAndSet(aVar3, null)) {
                    }
                }
                mutexImpl2.a(null);
                return obj;
            } catch (Throwable th3) {
                aVar3 = aVar2;
                mutatorMutex2 = mutatorMutex;
                th = th3;
                atomicReference = mutatorMutex2.f1547a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.a(null);
            throw th4;
        }
    }
}
