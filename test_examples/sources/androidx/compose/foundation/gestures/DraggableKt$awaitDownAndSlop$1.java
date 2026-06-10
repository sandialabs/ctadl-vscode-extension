package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import h1.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {315, 324, 333, 335}, m = "awaitDownAndSlop")
/* loaded from: classes.dex */
public final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Object f1695l;

    /* renamed from: m  reason: collision with root package name */
    public Object f1696m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public e f1697o;

    /* renamed from: p  reason: collision with root package name */
    public Orientation f1698p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1699q;

    /* renamed from: r  reason: collision with root package name */
    public int f1700r;

    public DraggableKt$awaitDownAndSlop$1(p7.c<? super DraggableKt$awaitDownAndSlop$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1699q = obj;
        this.f1700r |= Integer.MIN_VALUE;
        return DraggableKt.a(null, null, null, null, null, this);
    }
}
