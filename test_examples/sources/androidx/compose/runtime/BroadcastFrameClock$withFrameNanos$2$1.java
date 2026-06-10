package androidx.compose.runtime;

import androidx.compose.runtime.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f2633j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<a.C0021a<Object>> f2634k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(a aVar, Ref$ObjectRef<a.C0021a<Object>> ref$ObjectRef) {
        super(1);
        this.f2633j = aVar;
        this.f2634k = ref$ObjectRef;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        a aVar = this.f2633j;
        Object obj = aVar.f2843j;
        Ref$ObjectRef<a.C0021a<Object>> ref$ObjectRef = this.f2634k;
        synchronized (obj) {
            List<a.C0021a<?>> list = aVar.f2845l;
            a.C0021a<Object> c0021a = ref$ObjectRef.f13060i;
            if (c0021a != null) {
                list.remove(c0021a);
            } else {
                v7.g.l("awaiter");
                throw null;
            }
        }
        return n.f16010a;
    }
}
