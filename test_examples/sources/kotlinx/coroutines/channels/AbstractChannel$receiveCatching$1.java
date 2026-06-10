package kotlinx.coroutines.channels;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import la.f;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
/* loaded from: classes.dex */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f15190l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ AbstractChannel<E> f15191m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, p7.c<? super AbstractChannel$receiveCatching$1> cVar) {
        super(cVar);
        this.f15191m = abstractChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15190l = obj;
        this.n |= Integer.MIN_VALUE;
        Object k3 = this.f15191m.k(this);
        if (k3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k3;
        }
        return new f(k3);
    }
}
