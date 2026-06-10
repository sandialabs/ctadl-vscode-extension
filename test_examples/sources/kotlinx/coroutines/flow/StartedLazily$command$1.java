package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements u7.p<c<? super SharingCommand>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15331m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ u<Integer> f15332o;

    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f15333i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c<SharingCommand> f15334j;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, c<? super SharingCommand> cVar) {
            this.f15333i = ref$BooleanRef;
            this.f15334j = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(int i10, p7.c<? super m7.n> cVar) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            int i11;
            if (cVar instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) cVar;
                int i12 = startedLazily$command$1$1$emit$1.n;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.n = i12 - Integer.MIN_VALUE;
                    Object obj = startedLazily$command$1$1$emit$1.f15335l;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = startedLazily$command$1$1$emit$1.n;
                    if (i11 != 0) {
                        m0.b.n1(obj);
                        if (i10 > 0) {
                            Ref$BooleanRef ref$BooleanRef = this.f15333i;
                            if (!ref$BooleanRef.f13056i) {
                                ref$BooleanRef.f13056i = true;
                                SharingCommand sharingCommand = SharingCommand.START;
                                startedLazily$command$1$1$emit$1.n = 1;
                                if (this.f15334j.c(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        return m7.n.f16010a;
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m0.b.n1(obj);
                    }
                    return m7.n.f16010a;
                }
            }
            startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
            Object obj2 = startedLazily$command$1$1$emit$1.f15335l;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i11 = startedLazily$command$1$1$emit$1.n;
            if (i11 != 0) {
            }
            return m7.n.f16010a;
        }

        @Override // kotlinx.coroutines.flow.c
        public final /* bridge */ /* synthetic */ Object c(Object obj, p7.c cVar) {
            return a(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(u<Integer> uVar, p7.c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.f15332o = uVar;
    }

    @Override // u7.p
    public final Object R(c<? super SharingCommand> cVar, p7.c<? super m7.n> cVar2) {
        ((StartedLazily$command$1) a(cVar, cVar2)).k(m7.n.f16010a);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f15332o, cVar);
        startedLazily$command$1.n = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15331m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(new Ref$BooleanRef(), (c) this.n);
            this.f15331m = 1;
            if (this.f15332o.a(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        throw new KotlinNothingValueException();
    }
}
