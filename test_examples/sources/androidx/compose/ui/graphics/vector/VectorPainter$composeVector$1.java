package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import u7.r;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class VectorPainter$composeVector$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ r<Float, Float, d, Integer, n> f3239j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ VectorPainter f3240k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter$composeVector$1(r<? super Float, ? super Float, ? super d, ? super Integer, n> rVar, VectorPainter vectorPainter) {
        super(2);
        this.f3239j = rVar;
        this.f3240k = vectorPainter;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        VectorPainter vectorPainter = this.f3240k;
        this.f3239j.l0(Float.valueOf(vectorPainter.f3228h.f3166g), Float.valueOf(vectorPainter.f3228h.f3167h), dVar2, 0);
        return n.f16010a;
    }
}
