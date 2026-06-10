package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lja/x;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@c(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutinesRoom$Companion$execute$2 extends SuspendLambda implements p<x, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f6020m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<Object> callable, p7.c<? super CoroutinesRoom$Companion$execute$2> cVar) {
        super(2, cVar);
        this.f6020m = callable;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<Object> cVar) {
        return ((CoroutinesRoom$Companion$execute$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$2(this.f6020m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        return this.f6020m.call();
    }
}
