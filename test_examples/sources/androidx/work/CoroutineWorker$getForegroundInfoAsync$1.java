package androidx.work;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public c f6171m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c<n4.c> f6172o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f6173p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(c<n4.c> cVar, CoroutineWorker coroutineWorker, p7.c<? super CoroutineWorker$getForegroundInfoAsync$1> cVar2) {
        super(2, cVar2);
        this.f6172o = cVar;
        this.f6173p = coroutineWorker;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f6172o, this.f6173p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                c cVar = this.f6171m;
                m0.b.n1(obj);
                cVar.f6217j.i(obj);
                return n.f16010a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m0.b.n1(obj);
        this.f6171m = this.f6172o;
        this.n = 1;
        this.f6173p.getClass();
        throw new IllegalStateException("Not implemented");
    }
}
