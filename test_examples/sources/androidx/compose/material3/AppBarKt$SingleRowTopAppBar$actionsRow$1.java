package androidx.compose.material3;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import q0.b;
import q0.d;
import u7.p;
import u7.q;
import v.r;
import v.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$actionsRow$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q<r, g0.d, Integer, n> f2198j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$SingleRowTopAppBar$actionsRow$1(q<? super r, ? super g0.d, ? super Integer, n> qVar, int i10) {
        super(2);
        this.f2198j = qVar;
        this.f2199k = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        b.c cVar = androidx.compose.foundation.layout.b.f1999b;
        b.C0211b c0211b = a.C0210a.f16815e;
        int i10 = ((this.f2199k >> 6) & 7168) | 432;
        dVar2.f(693286680);
        d.a aVar = d.a.f16824i;
        j1.q a10 = RowKt.a(cVar, c0211b, dVar2);
        dVar2.f(-1323940314);
        b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(aVar);
        int i11 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
        if (dVar2.y() instanceof g0.c) {
            dVar2.r();
            if (dVar2.l()) {
                dVar2.m(aVar2);
            } else {
                dVar2.n();
            }
            dVar2.x();
            a1.c.s1(dVar2, a10, ComposeUiNode.Companion.f3404e);
            a1.c.s1(dVar2, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(dVar2, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(dVar2, j1Var, ComposeUiNode.Companion.f3406g);
            dVar2.h();
            a11.O(new v0(dVar2), dVar2, Integer.valueOf((i11 >> 3) & 112));
            dVar2.f(2058660585);
            dVar2.f(-678309503);
            if (((i11 >> 9) & 14 & 11) == 2 && dVar2.s()) {
                dVar2.e();
                dVar2.u();
                dVar2.u();
                dVar2.v();
                dVar2.u();
                dVar2.u();
                return n.f16010a;
            }
            this.f2198j.O(s.f18077a, dVar2, Integer.valueOf(((i10 >> 6) & 112) | 6));
            dVar2.u();
            dVar2.u();
            dVar2.v();
            dVar2.u();
            dVar2.u();
            return n.f16010a;
        }
        a1.c.L0();
        throw null;
    }
}
