package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import t.a;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {390, 393, 395}, m = "processDragStart")
/* loaded from: classes.dex */
public final class DragLogic$processDragStart$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public DragLogic f1684l;

    /* renamed from: m  reason: collision with root package name */
    public x f1685m;
    public a.c n;

    /* renamed from: o  reason: collision with root package name */
    public u.b f1686o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1687p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ DragLogic f1688q;

    /* renamed from: r  reason: collision with root package name */
    public int f1689r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStart$1(DragLogic dragLogic, p7.c<? super DragLogic$processDragStart$1> cVar) {
        super(cVar);
        this.f1688q = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1687p = obj;
        this.f1689r |= Integer.MIN_VALUE;
        return this.f1688q.b(null, null, this);
    }
}
