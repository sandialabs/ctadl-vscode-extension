package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements u7.p<SharingCommand, p7.c<? super Boolean>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f15342m;

    public StartedWhileSubscribed$command$2(p7.c<? super StartedWhileSubscribed$command$2> cVar) {
        super(2, cVar);
    }

    @Override // u7.p
    public final Object R(SharingCommand sharingCommand, p7.c<? super Boolean> cVar) {
        return ((StartedWhileSubscribed$command$2) a(sharingCommand, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(cVar);
        startedWhileSubscribed$command$2.f15342m = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        if (((SharingCommand) this.f15342m) != SharingCommand.START) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
