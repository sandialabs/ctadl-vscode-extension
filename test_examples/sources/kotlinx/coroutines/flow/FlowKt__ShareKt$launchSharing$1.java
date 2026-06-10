package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.s;
import ma.f;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15281m;
    public final /* synthetic */ s n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b<Object> f15282o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ j<Object> f15283p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f15284q;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u7.p<Integer, p7.c<? super Boolean>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ int f15285m;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Integer num, p7.c<? super Boolean> cVar) {
            return ((AnonymousClass1) a(Integer.valueOf(num.intValue()), cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f15285m = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            boolean z10;
            m0.b.n1(obj);
            if (this.f15285m > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u7.p<SharingCommand, p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f15286m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ b<Object> f15287o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ j<Object> f15288p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ Object f15289q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b<Object> bVar, j<Object> jVar, Object obj, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f15287o = bVar;
            this.f15288p = jVar;
            this.f15289q = obj;
        }

        @Override // u7.p
        public final Object R(SharingCommand sharingCommand, p7.c<? super m7.n> cVar) {
            return ((AnonymousClass2) a(sharingCommand, cVar)).k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f15287o, this.f15288p, this.f15289q, cVar);
            anonymousClass2.n = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f15286m;
            if (i10 == 0) {
                m0.b.n1(obj);
                int ordinal = ((SharingCommand) this.n).ordinal();
                j<Object> jVar = this.f15288p;
                if (ordinal == 0) {
                    this.f15286m = 1;
                    if (this.f15287o.a(jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (ordinal == 2) {
                    kotlinx.coroutines.internal.r rVar = e.f15357a;
                    Object obj2 = this.f15289q;
                    if (obj2 == rVar) {
                        jVar.d();
                    } else {
                        jVar.e(obj2);
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m0.b.n1(obj);
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(s sVar, b<Object> bVar, j<Object> jVar, Object obj, p7.c<? super FlowKt__ShareKt$launchSharing$1> cVar) {
        super(2, cVar);
        this.n = sVar;
        this.f15282o = bVar;
        this.f15283p = jVar;
        this.f15284q = obj;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.n, this.f15282o, this.f15283p, this.f15284q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15281m;
        b<Object> bVar = this.f15282o;
        j<Object> jVar = this.f15283p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    this.f15281m = 3;
                    if (bVar.a(jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return m7.n.f16010a;
                }
            }
            m0.b.n1(obj);
            return m7.n.f16010a;
        }
        m0.b.n1(obj);
        t tVar = s.a.f15449a;
        s sVar = this.n;
        if (sVar == tVar) {
            this.f15281m = 1;
            if (bVar.a(jVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (sVar == s.a.f15450b) {
            ma.l h10 = jVar.h();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.f15281m = 2;
            if (FlowKt__ReduceKt.b(h10, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f15281m = 3;
            if (bVar.a(jVar, this) == coroutineSingletons) {
            }
        } else {
            b K = a1.b.K(sVar.a(jVar.h()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, jVar, this.f15284q, null);
            this.f15281m = 4;
            Object a10 = f.a.a(h.a(anonymousClass2, K), null, 0, BufferOverflow.SUSPEND, 1).a(ma.h.f16035i, this);
            if (a10 != coroutineSingletons) {
                a10 = m7.n.f16010a;
            }
            if (a10 != coroutineSingletons) {
                a10 = m7.n.f16010a;
            }
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
