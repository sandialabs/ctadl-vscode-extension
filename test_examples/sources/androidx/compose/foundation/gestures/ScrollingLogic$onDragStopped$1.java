package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public ScrollingLogic f1830l;

    /* renamed from: m  reason: collision with root package name */
    public ScrollingLogic f1831m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public long f1832o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1833p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f1834q;

    /* renamed from: r  reason: collision with root package name */
    public int f1835r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, p7.c<? super ScrollingLogic$onDragStopped$1> cVar) {
        super(cVar);
        this.f1834q = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1833p = obj;
        this.f1835r |= Integer.MIN_VALUE;
        return this.f1834q.c(0.0f, this);
    }
}
