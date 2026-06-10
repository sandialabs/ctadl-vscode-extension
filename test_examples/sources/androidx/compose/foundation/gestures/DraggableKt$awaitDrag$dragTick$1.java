package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import h1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import la.q;
import m7.n;
import t.a;
import u7.l;
import v0.p;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/o;", "event", "Lm7/n;", "invoke", "(Lg1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class DraggableKt$awaitDrag$dragTick$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f1703j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Orientation f1704k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q<t.a> f1705l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f1706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDrag$dragTick$1(e eVar, Orientation orientation, la.c cVar, boolean z10) {
        super(1);
        this.f1703j = eVar;
        this.f1704k = orientation;
        this.f1705l = cVar;
        this.f1706m = z10;
    }

    @Override // u7.l
    public final n U(o oVar) {
        float b5;
        o oVar2 = oVar;
        g.f(oVar2, "event");
        p.e(this.f1703j, oVar2);
        long C = p.C(oVar2, false);
        if (this.f1704k == Orientation.Vertical) {
            b5 = u0.c.c(C);
        } else {
            b5 = u0.c.b(C);
        }
        oVar2.a();
        if (this.f1706m) {
            b5 *= -1;
        }
        this.f1705l.F(new a.b(b5, oVar2.c));
        return n.f16010a;
    }
}
