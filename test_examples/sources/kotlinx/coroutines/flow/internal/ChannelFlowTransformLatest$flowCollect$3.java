package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import m7.n;
import u7.p;
import u7.q;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15375m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> f15376o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c<R> f15377p;

    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<u0> f15378i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ x f15379j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f15380k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.c<R> f15381l;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
        @q7.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public int f15382m;
            public final /* synthetic */ ChannelFlowTransformLatest<T, R> n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.c<R> f15383o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ T f15384p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.c<? super R> cVar, T t10, p7.c<? super AnonymousClass2> cVar2) {
                super(2, cVar2);
                this.n = channelFlowTransformLatest;
                this.f15383o = cVar;
                this.f15384p = t10;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new AnonymousClass2(this.n, this.f15383o, this.f15384p, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f15382m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    q<kotlinx.coroutines.flow.c<? super R>, T, p7.c<? super n>, Object> qVar = this.n.f15374m;
                    this.f15382m = 1;
                    if (qVar.O(this.f15383o, this.f15384p, this) == obj2) {
                        return obj2;
                    }
                }
                return n.f16010a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<u0> ref$ObjectRef, x xVar, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.c<? super R> cVar) {
            this.f15378i = ref$ObjectRef;
            this.f15379j = xVar;
            this.f15380k = channelFlowTransformLatest;
            this.f15381l = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t10, p7.c<? super n> cVar) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            int i10;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) cVar;
                int i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15389q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f15389q = i11 - Integer.MIN_VALUE;
                    Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15387o;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15389q;
                    if (i10 != 0) {
                        m0.b.n1(obj);
                        u0 u0Var = this.f15378i.f13060i;
                        if (u0Var != null) {
                            u0Var.c(new ChildCancelledException());
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f15385l = this;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f15386m = t10;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.n = u0Var;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.f15389q = 1;
                            if (u0Var.R(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        anonymousClass1 = this;
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        t10 = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.f15386m;
                        anonymousClass1 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15385l;
                        m0.b.n1(obj);
                    }
                    anonymousClass1.f15378i.f13060i = (T) m0.b.M0(anonymousClass1.f15379j, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.f15380k, anonymousClass1.f15381l, t10, null), 1);
                    return n.f16010a;
                }
            }
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
            Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15387o;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f15389q;
            if (i10 != 0) {
            }
            anonymousClass1.f15378i.f13060i = (T) m0.b.M0(anonymousClass1.f15379j, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.f15380k, anonymousClass1.f15381l, t10, null), 1);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.c<? super R> cVar, p7.c<? super ChannelFlowTransformLatest$flowCollect$3> cVar2) {
        super(2, cVar2);
        this.f15376o = channelFlowTransformLatest;
        this.f15377p = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f15376o, this.f15377p, cVar);
        channelFlowTransformLatest$flowCollect$3.n = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15375m;
        if (i10 == 0) {
            m0.b.n1(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.f15376o;
            kotlinx.coroutines.flow.b<S> bVar = channelFlowTransformLatest.f15426l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, (x) this.n, channelFlowTransformLatest, this.f15377p);
            this.f15375m = 1;
            if (bVar.a(anonymousClass1, this) == coroutineSingletons) {
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
