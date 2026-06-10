package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import androidx.datastore.preferences.PreferencesProto$Value;
import g1.k;
import ja.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilter$awaitPointerEventScope$2$2 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputFilter.a<R> f3291j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilter$awaitPointerEventScope$2$2(SuspendingPointerInputFilter.a<R> aVar) {
        super(1);
        this.f3291j = aVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        SuspendingPointerInputFilter.a<R> aVar = this.f3291j;
        i<? super k> iVar = aVar.f3288k;
        if (iVar != null) {
            iVar.B(th2);
        }
        aVar.f3288k = null;
        return n.f16010a;
    }
}
