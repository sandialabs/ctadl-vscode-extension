package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import ja.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import r.u;
import u7.l;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2 extends SuspendLambda implements p<x, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public kotlinx.coroutines.sync.b f1285m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public u f1286o;

    /* renamed from: p  reason: collision with root package name */
    public int f1287p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1288q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ MutatePriority f1289r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ u f1290s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l<p7.c<Object>, Object> f1291t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, u uVar, l<? super p7.c<Object>, ? extends Object> lVar, p7.c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.f1289r = mutatePriority;
        this.f1290s = uVar;
        this.f1291t = lVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<Object> cVar) {
        return ((MutatorMutex$mutate$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f1289r, this.f1290s, this.f1291t, cVar);
        mutatorMutex$mutate$2.f1288q = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x008a, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:42:0x00bf, B:43:0x00c1, B:46:0x00c8, B:54:0x00d9, B:55:0x00db, B:57:0x00e1, B:60:0x00e8), top: B:63:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.b, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        u uVar;
        u.a aVar;
        boolean z10;
        kotlinx.coroutines.sync.b bVar;
        l<p7.c<Object>, Object> lVar;
        u.a aVar2;
        boolean z11;
        kotlinx.coroutines.sync.b bVar2;
        u.a aVar3;
        u uVar2;
        Throwable th;
        AtomicReference<u.a> atomicReference;
        AtomicReference<u.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.f1287p;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            uVar2 = (u) this.n;
                            bVar2 = this.f1285m;
                            aVar3 = (u.a) this.f1288q;
                            try {
                                m0.b.n1(obj);
                                atomicReference2 = uVar2.f17017a;
                                while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                                }
                                bVar2.a(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = uVar2.f17017a;
                                while (!atomicReference.compareAndSet(aVar3, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u uVar3 = this.f1286o;
                    lVar = (l) this.n;
                    bVar = this.f1285m;
                    aVar2 = (u.a) this.f1288q;
                    m0.b.n1(obj);
                    uVar = uVar3;
                } else {
                    m0.b.n1(obj);
                    CoroutineContext.a a10 = ((x) this.f1288q).j().a(u0.b.f12806i);
                    g.c(a10);
                    u.a aVar4 = new u.a(this.f1289r, (u0) a10);
                    do {
                        uVar = this.f1290s;
                        AtomicReference<u.a> atomicReference3 = uVar.f17017a;
                        aVar = atomicReference3.get();
                        z10 = false;
                        if (aVar != null) {
                            if (aVar4.f17019a.compareTo(aVar.f17019a) >= 0) {
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
                        aVar.f17020b.c(null);
                    }
                    this.f1288q = aVar4;
                    bVar = uVar.f17018b;
                    this.f1285m = bVar;
                    l<p7.c<Object>, Object> lVar2 = this.f1291t;
                    this.n = lVar2;
                    this.f1286o = uVar;
                    this.f1287p = 1;
                    if (bVar.b(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lVar = lVar2;
                    aVar2 = aVar4;
                }
                this.f1288q = aVar2;
                this.f1285m = bVar2;
                this.n = uVar;
                this.f1286o = null;
                this.f1287p = 2;
                Object U = lVar.U(this);
                if (U == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uVar2 = uVar;
                obj = U;
                aVar3 = aVar2;
                atomicReference2 = uVar2.f17017a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                    while (!atomicReference2.compareAndSet(aVar3, null)) {
                    }
                }
                bVar2.a(null);
                return obj;
            } catch (Throwable th3) {
                aVar3 = aVar2;
                uVar2 = uVar;
                th = th3;
                atomicReference = uVar2.f17017a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th;
            }
            bVar2 = bVar;
        } catch (Throwable th4) {
            r1.a(null);
            throw th4;
        }
    }
}
