package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import la.f;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lla/f;", "", "value", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements u7.p<la.f<? extends Object>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Ref$ObjectRef f15233m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f15234o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<Object> f15235p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c<Object> f15236q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(p7.c cVar, Ref$ObjectRef ref$ObjectRef, c cVar2) {
        super(2, cVar);
        this.f15235p = ref$ObjectRef;
        this.f15236q = cVar2;
    }

    @Override // u7.p
    public final Object R(la.f<? extends Object> fVar, p7.c<? super m7.n> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) a(new la.f(fVar.f15878a), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(cVar, this.f15235p, this.f15236q);
        flowKt__DelayKt$debounceInternal$1$3$2.f15234o = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.internal.r, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        f.a aVar;
        Throwable th;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                ref$ObjectRef2 = this.f15233m;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            ?? r72 = ((la.f) this.f15234o).f15878a;
            boolean z10 = r72 instanceof f.b;
            ref$ObjectRef = this.f15235p;
            if (!z10) {
                ref$ObjectRef.f13060i = r72;
            }
            if (z10) {
                Object obj2 = null;
                if (r72 instanceof f.a) {
                    aVar = (f.a) r72;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    th = aVar.f15879a;
                } else {
                    th = null;
                }
                if (th == null) {
                    Object obj3 = ref$ObjectRef.f13060i;
                    if (obj3 != null) {
                        if (obj3 != ma.i.f16036b) {
                            obj2 = obj3;
                        }
                        this.f15234o = r72;
                        this.f15233m = ref$ObjectRef;
                        this.n = 1;
                        if (this.f15236q.c(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.f13060i = ma.i.f16037d;
                } else {
                    throw th;
                }
            }
            return m7.n.f16010a;
        }
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f13060i = ma.i.f16037d;
        return m7.n.f16010a;
    }
}
