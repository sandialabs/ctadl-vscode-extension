package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import z0.h;
import z0.i;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainterKt$RenderVectorGroup$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f3244j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Map<String, h> f3245k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3246l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3247m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainterKt$RenderVectorGroup$2(i iVar, Map<String, ? extends h> map, int i10, int i11) {
        super(2);
        this.f3244j = iVar;
        this.f3245k = map;
        this.f3246l = i10;
        this.f3247m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        VectorPainterKt.a(this.f3244j, this.f3245k, dVar, this.f3246l | 1, this.f3247m);
        return n.f16010a;
    }
}
