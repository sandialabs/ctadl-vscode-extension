package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
/* loaded from: classes.dex */
public final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g0 f1527l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1528m;
    public int n;

    public HoverableKt$hoverable$2$invoke$emitExit$1(p7.c<? super HoverableKt$hoverable$2$invoke$emitExit$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1528m = obj;
        this.n |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.b(null, null, this);
    }
}
