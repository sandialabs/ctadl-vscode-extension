package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import la.j;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChannelFlow$collect$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15367m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c<Object> f15368o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a<Object> f15369p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(p7.c cVar, kotlinx.coroutines.flow.c cVar2, a aVar) {
        super(2, cVar);
        this.f15368o = cVar2;
        this.f15369p = aVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ChannelFlow$collect$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(cVar, this.f15368o, this.f15369p);
        channelFlow$collect$2.n = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15367m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            x xVar = (x) this.n;
            a<Object> aVar = this.f15369p;
            CoroutineContext coroutineContext = aVar.f15423i;
            int i11 = aVar.f15424j;
            if (i11 == -3) {
                i11 = -2;
            }
            CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
            p channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(aVar, null);
            j jVar = new j(CoroutineContextKt.c(xVar, coroutineContext), a1.b.f(i11, aVar.f15425k, 4));
            jVar.D0(coroutineStart, jVar, channelFlow$collectToFun$1);
            this.f15367m = 1;
            Object e10 = e.e(this.f15368o, jVar, true, this);
            if (e10 != obj2) {
                e10 = n.f16010a;
            }
            if (e10 == obj2) {
                return obj2;
            }
        }
        return n.f16010a;
    }
}
