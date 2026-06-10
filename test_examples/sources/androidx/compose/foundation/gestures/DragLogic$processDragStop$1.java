package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import t.a;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {400, 403}, m = "processDragStop")
/* loaded from: classes.dex */
public final class DragLogic$processDragStop$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public DragLogic f1690l;

    /* renamed from: m  reason: collision with root package name */
    public x f1691m;
    public a.d n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f1692o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ DragLogic f1693p;

    /* renamed from: q  reason: collision with root package name */
    public int f1694q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStop$1(DragLogic dragLogic, p7.c<? super DragLogic$processDragStop$1> cVar) {
        super(cVar);
        this.f1693p = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1692o = obj;
        this.f1694q |= Integer.MIN_VALUE;
        return this.f1693p.c(null, null, this);
    }
}
