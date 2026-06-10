package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import j3.e;
import j3.i;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1;
import kotlinx.coroutines.flow.x;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$data$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.c<Object>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4697m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4698o;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lj3/i;", "it", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    @c(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i<Object>, p7.c<? super Boolean>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f4699m;
        public final /* synthetic */ i<Object> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i<Object> iVar, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = iVar;
        }

        @Override // u7.p
        public final Object R(i<Object> iVar, p7.c<? super Boolean> cVar) {
            return ((AnonymousClass1) a(iVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.n, cVar);
            anonymousClass1.f4699m = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            i<Object> iVar = (i) this.f4699m;
            i<Object> iVar2 = this.n;
            boolean z10 = false;
            if (!(iVar2 instanceof j3.b) && !(iVar2 instanceof e) && iVar == iVar2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<Object> singleProcessDataStore, p7.c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.f4698o = singleProcessDataStore;
    }

    @Override // u7.p
    public final Object R(kotlinx.coroutines.flow.c<Object> cVar, p7.c<? super n> cVar2) {
        return ((SingleProcessDataStore$data$1) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f4698o, cVar);
        singleProcessDataStore$data$1.n = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4697m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.c cVar = (kotlinx.coroutines.flow.c) this.n;
            SingleProcessDataStore<Object> singleProcessDataStore = this.f4698o;
            i iVar = (i) singleProcessDataStore.f4682h.getValue();
            if (!(iVar instanceof j3.b)) {
                singleProcessDataStore.f4684j.a(new SingleProcessDataStore.a.C0033a(iVar));
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(iVar, null);
            this.f4697m = 1;
            if (!(cVar instanceof x)) {
                Object a10 = singleProcessDataStore.f4682h.a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(cVar), anonymousClass1), this);
                if (a10 != coroutineSingletons) {
                    a10 = n.f16010a;
                }
                if (a10 != coroutineSingletons) {
                    a10 = n.f16010a;
                }
                if (a10 != coroutineSingletons) {
                    a10 = n.f16010a;
                }
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ((x) cVar).getClass();
                throw null;
            }
        }
        return n.f16010a;
    }
}
