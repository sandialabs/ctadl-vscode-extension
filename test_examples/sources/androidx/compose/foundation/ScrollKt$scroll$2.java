package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.AndroidOverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.k;
import g0.s;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import q0.d;
import s.r;
import u7.q;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ScrollKt$scroll$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1563j = true;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ScrollState f1564k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f1565l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ t.c f1566m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2(ScrollState scrollState, t.c cVar, boolean z10, boolean z11) {
        super(3);
        this.f1564k = scrollState;
        this.f1565l = z10;
        this.f1566m = cVar;
        this.n = z11;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        Orientation orientation;
        boolean z10;
        q0.d dVar3;
        g0.d dVar4 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar4.f(1478351300);
        dVar4.f(1809802212);
        AndroidOverscrollKt.a aVar = AndroidOverscrollKt.f1384a;
        dVar4.f(-81138291);
        Context context = (Context) dVar4.w(AndroidCompositionLocals_androidKt.f3656b);
        s.q qVar = (s.q) dVar4.w(OverscrollConfigurationKt.f1560a);
        dVar4.f(511388516);
        boolean z11 = dVar4.z(context) | dVar4.z(qVar);
        AndroidOverscrollKt.a g10 = dVar4.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (z11 || g10 == c0120a) {
            if (qVar != null) {
                g10 = new AndroidEdgeEffectOverscrollEffect(context, qVar);
            } else {
                g10 = AndroidOverscrollKt.f1384a;
            }
            dVar4.q(g10);
        }
        dVar4.u();
        r rVar = (r) g10;
        dVar4.u();
        dVar4.u();
        dVar4.f(773894976);
        dVar4.f(-492369756);
        Object g11 = dVar4.g();
        if (g11 == c0120a) {
            k kVar = new k(s.e(EmptyCoroutineContext.f13021i, dVar4));
            dVar4.q(kVar);
            g11 = kVar;
        }
        dVar4.u();
        x xVar = ((k) g11).f11060a;
        dVar4.u();
        boolean z12 = false;
        q0.d j12 = m0.b.j1(d.a.f16824i, false, new ScrollKt$scroll$2$semantics$1(this.n, this.f1563j, this.f1565l, this.f1564k, xVar));
        Orientation orientation2 = Orientation.Vertical;
        boolean z13 = this.f1563j;
        if (z13) {
            orientation = orientation2;
        } else {
            orientation = Orientation.Horizontal;
        }
        boolean z14 = this.n;
        boolean z15 = !z14;
        if (dVar4.w(CompositionLocalsKt.f3709k) == LayoutDirection.Rtl) {
            z12 = true;
        }
        if (z12 && !z13) {
            z10 = !z15;
        } else {
            z10 = z15;
        }
        ScrollState scrollState = this.f1564k;
        q0.d b5 = ScrollableKt.b(scrollState, orientation, rVar, this.f1565l, z10, this.f1566m, scrollState.f1582b);
        ScrollingLayoutModifier scrollingLayoutModifier = new ScrollingLayoutModifier(scrollState, z14, z13, rVar);
        float f10 = s.e.f17206a;
        g.f(j12, "<this>");
        if (orientation == orientation2) {
            dVar3 = s.e.c;
        } else {
            dVar3 = s.e.f17207b;
        }
        q0.d Z = j12.Z(dVar3);
        g.f(Z, "<this>");
        q0.d Z2 = Z.Z(rVar.e()).Z(b5).Z(scrollingLayoutModifier);
        dVar4.u();
        return Z2;
    }
}
