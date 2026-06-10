package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.g0;
import g0.s;
import g0.t0;
import g0.z0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q.e;
import q0.d;
import r.o;
import s.r;
import t.j;
import u.k;
import u7.q;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ScrollableKt$scrollable$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Orientation f1800j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ j f1801k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f1802l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ u.j f1803m;
    public final /* synthetic */ t.c n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ r f1804o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f1805p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(r rVar, t.c cVar, Orientation orientation, ScrollState scrollState, k kVar, boolean z10, boolean z11) {
        super(3);
        this.f1800j = orientation;
        this.f1801k = scrollState;
        this.f1802l = z10;
        this.f1803m = kVar;
        this.n = cVar;
        this.f1804o = rVar;
        this.f1805p = z11;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        a aVar;
        d dVar3;
        g0.d dVar4 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar4.f(-629830927);
        dVar4.f(773894976);
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g0.k kVar = new g0.k(s.e(EmptyCoroutineContext.f13021i, dVar4));
            dVar4.q(kVar);
            g10 = kVar;
        }
        dVar4.u();
        x xVar = ((g0.k) g10).f11060a;
        dVar4.u();
        Orientation orientation = this.f1800j;
        j jVar = this.f1801k;
        boolean z10 = this.f1802l;
        Object[] objArr = {xVar, orientation, jVar, Boolean.valueOf(z10)};
        dVar4.f(-568225417);
        boolean z11 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            z11 |= dVar4.z(objArr[i10]);
        }
        Object g11 = dVar4.g();
        if (z11 || g11 == c0120a) {
            g11 = new ContentInViewModifier(xVar, orientation, jVar, z10);
            dVar4.q(g11);
        }
        dVar4.u();
        d.a aVar2 = d.a.f16824i;
        q0.d Z = androidx.compose.foundation.d.a().Z(((ContentInViewModifier) g11).f1605p);
        u.j jVar2 = this.f1803m;
        Orientation orientation2 = this.f1800j;
        boolean z12 = this.f1802l;
        j jVar3 = this.f1801k;
        r rVar = this.f1804o;
        boolean z13 = this.f1805p;
        dVar4.f(-2012025036);
        dVar4.f(-1730187034);
        t.c cVar = this.n;
        if (cVar == null) {
            dVar4.f(1107739818);
            float f10 = e.f16810a;
            dVar4.f(904445851);
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            b2.b bVar = (b2.b) dVar4.w(CompositionLocalsKt.f3703e);
            Float valueOf = Float.valueOf(bVar.getDensity());
            dVar4.f(1157296644);
            boolean z14 = dVar4.z(valueOf);
            Object g12 = dVar4.g();
            if (z14 || g12 == c0120a) {
                g12 = new o(new q.d(bVar));
                dVar4.q(g12);
            }
            dVar4.u();
            r.n nVar = (r.n) g12;
            dVar4.u();
            dVar4.f(1157296644);
            boolean z15 = dVar4.z(nVar);
            Object g13 = dVar4.g();
            if (z15 || g13 == c0120a) {
                g13 = new a(nVar);
                dVar4.q(g13);
            }
            dVar4.u();
            dVar4.u();
            aVar = (a) g13;
        } else {
            aVar = cVar;
        }
        dVar4.u();
        dVar4.f(-492369756);
        Object g14 = dVar4.g();
        if (g14 == c0120a) {
            g14 = a1.c.V0(new NestedScrollDispatcher());
            dVar4.q(g14);
        }
        dVar4.u();
        g0 g0Var = (g0) g14;
        g0 l12 = a1.c.l1(new ScrollingLogic(orientation2, z12, g0Var, jVar3, aVar, rVar), dVar4);
        Boolean valueOf2 = Boolean.valueOf(z13);
        dVar4.f(1157296644);
        boolean z16 = dVar4.z(valueOf2);
        Object g15 = dVar4.g();
        if (z16 || g15 == c0120a) {
            g15 = new ScrollableKt$scrollableNestedScrollConnection$1(l12, z13);
            dVar4.q(g15);
        }
        dVar4.u();
        f1.a aVar3 = (f1.a) g15;
        dVar4.f(-492369756);
        Object g16 = dVar4.g();
        if (g16 == c0120a) {
            g16 = new c(l12);
            dVar4.q(g16);
        }
        dVar4.u();
        dVar4.f(-1485272842);
        dVar4.u();
        m0.b bVar2 = m0.b.f15895h;
        q0.d a10 = NestedScrollModifierKt.a(SuspendingPointerInputFilterKt.a(DraggableKt.c(Z, new ScrollableKt$pointerScrollable$1((c) g16), ScrollableKt$pointerScrollable$2.f1794j, orientation2, z13, jVar2, new ScrollableKt$pointerScrollable$3(l12), new DraggableKt$draggable$6(null), new ScrollableKt$pointerScrollable$4(g0Var, l12, null), false), l12, bVar2, new ScrollableKt$mouseWheelScroll$1(bVar2, l12, null)), aVar3, (NestedScrollDispatcher) g0Var.getValue());
        dVar4.u();
        if (this.f1805p) {
            dVar3 = t.d.f17539i;
        } else {
            dVar3 = aVar2;
        }
        q0.d Z2 = a10.Z(dVar3);
        dVar4.u();
        return Z2;
    }
}
