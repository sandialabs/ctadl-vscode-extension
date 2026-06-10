package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.f;
import g0.p;
import g0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainter$RenderVector$2 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f3233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainter$RenderVector$2(f fVar) {
        super(1);
        this.f3233j = fVar;
    }

    @Override // u7.l
    public final p U(q qVar) {
        g.f(qVar, "$this$DisposableEffect");
        return new z0.l(this.f3233j);
    }
}
