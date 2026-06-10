package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "it", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends SuspendLambda implements p<Recomposer.State, p7.c<? super Boolean>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f2801m;

    public Recomposer$join$2(p7.c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    @Override // u7.p
    public final Object R(Recomposer.State state, p7.c<? super Boolean> cVar) {
        return ((Recomposer$join$2) a(state, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.f2801m = obj;
        return recomposer$join$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        if (((Recomposer.State) this.f2801m) == Recomposer.State.ShutDown) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
