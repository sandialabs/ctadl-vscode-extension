package kotlinx.coroutines.channels;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import la.k;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
/* loaded from: classes.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public k f15195l;

    /* renamed from: m  reason: collision with root package name */
    public u7.a f15196m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f15197o;

    public ProduceKt$awaitClose$1(p7.c<? super ProduceKt$awaitClose$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f15197o |= Integer.MIN_VALUE;
        return ProduceKt.a(null, null, this);
    }
}
