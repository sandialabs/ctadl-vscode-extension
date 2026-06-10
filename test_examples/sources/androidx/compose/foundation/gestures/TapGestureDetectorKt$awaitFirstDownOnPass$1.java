package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {244}, m = "awaitFirstDownOnPass")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitFirstDownOnPass$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g1.c f1837l;

    /* renamed from: m  reason: collision with root package name */
    public PointerEventPass f1838m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f1839o;

    /* renamed from: p  reason: collision with root package name */
    public int f1840p;

    public TapGestureDetectorKt$awaitFirstDownOnPass$1(p7.c<? super TapGestureDetectorKt$awaitFirstDownOnPass$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1839o = obj;
        this.f1840p |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.a(null, null, false, this);
    }
}
