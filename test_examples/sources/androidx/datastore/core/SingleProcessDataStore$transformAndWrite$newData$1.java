package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements p<x, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4743m;
    public final /* synthetic */ p<Object, p7.c<Object>, Object> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f4744o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(Object obj, p7.c cVar, p pVar) {
        super(2, cVar);
        this.n = pVar;
        this.f4744o = obj;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<Object> cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f4744o, cVar, this.n);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4743m;
        if (i10 == 0) {
            m0.b.n1(obj);
            this.f4743m = 1;
            obj = this.n.R(this.f4744o, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return obj;
    }
}
