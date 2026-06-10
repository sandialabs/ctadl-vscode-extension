package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;
import u7.r;
import z0.c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements r<Float, Float, d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$3(c cVar) {
        super(4);
        this.f3248j = cVar;
    }

    @Override // u7.r
    public final n l0(Float f10, Float f11, d dVar, Integer num) {
        f10.floatValue();
        f11.floatValue();
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VectorPainterKt.a(this.f3248j.f18997f, null, dVar2, 0, 2);
        return n.f16010a;
    }
}
