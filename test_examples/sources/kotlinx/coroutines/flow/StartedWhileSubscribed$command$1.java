package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements u7.q<c<? super SharingCommand>, Integer, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f15339m;
    public /* synthetic */ c n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ int f15340o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ StartedWhileSubscribed f15341p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, p7.c<? super StartedWhileSubscribed$command$1> cVar) {
        super(3, cVar);
        this.f15341p = startedWhileSubscribed;
    }

    @Override // u7.q
    public final Object O(c<? super SharingCommand> cVar, Integer num, p7.c<? super m7.n> cVar2) {
        int intValue = num.intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f15341p, cVar2);
        startedWhileSubscribed$command$1.n = cVar;
        startedWhileSubscribed$command$1.f15340o = intValue;
        return startedWhileSubscribed$command$1.k(m7.n.f16010a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        c cVar;
        long j2;
        SharingCommand sharingCommand;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15339m;
        StartedWhileSubscribed startedWhileSubscribed = this.f15341p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            cVar = this.n;
                            m0.b.n1(obj);
                            sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                            this.n = null;
                            this.f15339m = 5;
                            if (cVar.c(sharingCommand, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return m7.n.f16010a;
                        }
                    } else {
                        cVar = this.n;
                        m0.b.n1(obj);
                        j2 = startedWhileSubscribed.f15338b;
                        this.n = cVar;
                        this.f15339m = 4;
                        if (m0.b.S(j2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                        this.n = null;
                        this.f15339m = 5;
                        if (cVar.c(sharingCommand, this) == coroutineSingletons) {
                        }
                        return m7.n.f16010a;
                    }
                } else {
                    cVar = this.n;
                    m0.b.n1(obj);
                    if (startedWhileSubscribed.f15338b > 0) {
                        SharingCommand sharingCommand2 = SharingCommand.STOP;
                        this.n = cVar;
                        this.f15339m = 3;
                        if (cVar.c(sharingCommand2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j2 = startedWhileSubscribed.f15338b;
                        this.n = cVar;
                        this.f15339m = 4;
                        if (m0.b.S(j2, this) == coroutineSingletons) {
                        }
                    }
                    sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                    this.n = null;
                    this.f15339m = 5;
                    if (cVar.c(sharingCommand, this) == coroutineSingletons) {
                    }
                    return m7.n.f16010a;
                }
            }
            m0.b.n1(obj);
            return m7.n.f16010a;
        }
        m0.b.n1(obj);
        c cVar2 = this.n;
        if (this.f15340o > 0) {
            SharingCommand sharingCommand3 = SharingCommand.START;
            this.f15339m = 1;
            if (cVar2.c(sharingCommand3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return m7.n.f16010a;
        }
        long j10 = startedWhileSubscribed.f15337a;
        this.n = cVar2;
        this.f15339m = 2;
        if (m0.b.S(j10, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar = cVar2;
        if (startedWhileSubscribed.f15338b > 0) {
        }
        sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
        this.n = null;
        this.f15339m = 5;
        if (cVar.c(sharingCommand, this) == coroutineSingletons) {
        }
        return m7.n.f16010a;
    }
}
