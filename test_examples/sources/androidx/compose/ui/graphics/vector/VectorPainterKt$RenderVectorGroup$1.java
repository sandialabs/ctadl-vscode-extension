package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import z0.h;
import z0.i;
import z0.k;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainterKt$RenderVectorGroup$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k f3242j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Map<String, h> f3243k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainterKt$RenderVectorGroup$1(k kVar, Map<String, ? extends h> map) {
        super(2);
        this.f3242j = kVar;
        this.f3243k = map;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VectorPainterKt.a((i) this.f3242j, this.f3243k, dVar2, 64, 0);
        return n.f16010a;
    }
}
