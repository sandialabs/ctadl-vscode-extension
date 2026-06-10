package kotlinx.coroutines.channels;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.i;
import ja.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ProduceKt$awaitClose$4$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i<n> f15198j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(j jVar) {
        super(1);
        this.f15198j = jVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        n nVar = n.f16010a;
        this.f15198j.t(nVar);
        return nVar;
    }
}
