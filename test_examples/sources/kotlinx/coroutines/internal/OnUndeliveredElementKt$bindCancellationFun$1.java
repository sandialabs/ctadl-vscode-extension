package kotlinx.coroutines.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements u7.l<Throwable, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.l<E, m7.n> f15460j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ E f15461k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f15462l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnUndeliveredElementKt$bindCancellationFun$1(u7.l<? super E, m7.n> lVar, E e10, CoroutineContext coroutineContext) {
        super(1);
        this.f15460j = lVar;
        this.f15461k = e10;
        this.f15462l = coroutineContext;
    }

    @Override // u7.l
    public final m7.n U(Throwable th) {
        Throwable th2 = th;
        UndeliveredElementException b5 = OnUndeliveredElementKt.b(this.f15460j, this.f15461k, null);
        if (b5 != null) {
            m0.b.v0(this.f15462l, b5);
        }
        return m7.n.f16010a;
    }
}
