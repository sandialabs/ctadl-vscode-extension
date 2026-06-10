package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {399}, m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Ref$LongRef f1816l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1817m;
    public final /* synthetic */ ScrollingLogic n;

    /* renamed from: o  reason: collision with root package name */
    public int f1818o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, p7.c<? super ScrollingLogic$doFlingAnimation$1> cVar) {
        super(cVar);
        this.n = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1817m = obj;
        this.f1818o |= Integer.MIN_VALUE;
        return this.n.b(0L, this);
    }
}
