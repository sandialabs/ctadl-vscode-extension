package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {408, 411}, m = "processDragCancel")
/* loaded from: classes.dex */
public final class DragLogic$processDragCancel$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public DragLogic f1680l;

    /* renamed from: m  reason: collision with root package name */
    public x f1681m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ DragLogic f1682o;

    /* renamed from: p  reason: collision with root package name */
    public int f1683p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragCancel$1(DragLogic dragLogic, p7.c<? super DragLogic$processDragCancel$1> cVar) {
        super(cVar);
        this.f1682o = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f1683p |= Integer.MIN_VALUE;
        return this.f1682o.a(null, this);
    }
}
