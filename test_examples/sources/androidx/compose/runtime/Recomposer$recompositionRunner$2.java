package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c0;
import g0.l;
import ja.u0;
import ja.x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import m7.n;
import ma.i;
import p0.f;
import u7.p;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {882}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public p0.e f2805m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f2806o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2807p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q<x, c0, p7.c<? super n>, Object> f2808q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ c0 f2809r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    @q7.c(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {883}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2810m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ q<x, c0, p7.c<? super n>, Object> f2811o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ c0 f2812p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(q<? super x, ? super c0, ? super p7.c<? super n>, ? extends Object> qVar, c0 c0Var, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f2811o = qVar;
            this.f2812p = c0Var;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f2811o, this.f2812p, cVar);
            anonymousClass2.n = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2810m;
            if (i10 == 0) {
                m0.b.n1(obj);
                this.f2810m = 1;
                if (this.f2811o.O((x) this.n, this.f2812p, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m0.b.n1(obj);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, q<? super x, ? super c0, ? super p7.c<? super n>, ? extends Object> qVar, c0 c0Var, p7.c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.f2807p = recomposer;
        this.f2808q = qVar;
        this.f2809r = c0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((Recomposer$recompositionRunner$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.f2807p, this.f2808q, this.f2809r, cVar);
        recomposer$recompositionRunner$2.f2806o = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        u0 X;
        StateFlowImpl stateFlowImpl;
        i0.e eVar;
        Object e10;
        p0.e eVar2;
        Throwable th;
        Recomposer recomposer;
        StateFlowImpl stateFlowImpl2;
        i0.e eVar3;
        Object remove;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                eVar2 = this.f2805m;
                X = (u0) this.f2806o;
                try {
                    m0.b.n1(obj);
                } catch (Throwable th2) {
                    th = th2;
                    eVar2.a();
                    recomposer = this.f2807p;
                    synchronized (recomposer.f2777d) {
                        if (recomposer.f2778e == X) {
                            recomposer.f2778e = null;
                        }
                        recomposer.x();
                    }
                    StateFlowImpl stateFlowImpl3 = Recomposer.f2773s;
                    Recomposer.c cVar = this.f2807p.f2790r;
                    while (true) {
                        StateFlowImpl stateFlowImpl4 = Recomposer.f2773s;
                        i0.e eVar4 = (i0.e) stateFlowImpl4.getValue();
                        Object remove2 = eVar4.remove((Object) cVar);
                        if (eVar4 == remove2) {
                            break;
                        }
                        Object obj2 = i.f16036b;
                        if (remove2 == null) {
                            remove2 = obj2;
                        }
                        if (stateFlowImpl4.l(eVar4, remove2)) {
                            break;
                        }
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            X = a1.b.X(((x) this.f2806o).j());
            Recomposer.u(this.f2807p, X);
            p0.e a10 = f.a.a(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.f2807p));
            Recomposer.c cVar2 = this.f2807p.f2790r;
            try {
                do {
                    stateFlowImpl = Recomposer.f2773s;
                    eVar = (i0.e) stateFlowImpl.getValue();
                    e10 = eVar.e(cVar2);
                    if (eVar == e10) {
                        break;
                    }
                    Object obj3 = i.f16036b;
                    if (e10 == null) {
                        e10 = obj3;
                    }
                } while (!stateFlowImpl.l(eVar, e10));
                break;
                Recomposer recomposer2 = this.f2807p;
                synchronized (recomposer2.f2777d) {
                    ArrayList arrayList = recomposer2.f2780g;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((l) arrayList.get(i11)).y();
                    }
                    n nVar = n.f16010a;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f2808q, this.f2809r, null);
                this.f2806o = X;
                this.f2805m = a10;
                this.n = 1;
                if (a1.b.H(anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar2 = a10;
            } catch (Throwable th3) {
                eVar2 = a10;
                th = th3;
                eVar2.a();
                recomposer = this.f2807p;
                synchronized (recomposer.f2777d) {
                }
            }
        }
        eVar2.a();
        Recomposer recomposer3 = this.f2807p;
        synchronized (recomposer3.f2777d) {
            if (recomposer3.f2778e == X) {
                recomposer3.f2778e = null;
            }
            recomposer3.x();
        }
        StateFlowImpl stateFlowImpl5 = Recomposer.f2773s;
        Recomposer.c cVar3 = this.f2807p.f2790r;
        do {
            stateFlowImpl2 = Recomposer.f2773s;
            eVar3 = (i0.e) stateFlowImpl2.getValue();
            remove = eVar3.remove((Object) cVar3);
            if (eVar3 == remove) {
                break;
            }
            Object obj4 = i.f16036b;
            if (remove == null) {
                remove = obj4;
            }
        } while (!stateFlowImpl2.l(eVar3, remove));
        return n.f16010a;
    }
}
