package androidx.compose.foundation.selection;

import a1.c;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.e;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.g;
import q0.d;
import s.m;
import u.j;
import u7.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ToggleableKt$toggleableImpl$1 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f2060j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f2061k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ j f2062l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ m f2063m = null;
    public final /* synthetic */ g n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f2064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1(u7.a aVar, boolean z10, j jVar, g gVar, ToggleableState toggleableState) {
        super(3);
        this.f2060j = aVar;
        this.f2061k = z10;
        this.f2062l = jVar;
        this.n = gVar;
        this.f2064o = toggleableState;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        d dVar3 = dVar;
        g0.d dVar4 = dVar2;
        num.intValue();
        v7.g.f(dVar3, "$this$composed");
        dVar4.f(2121285826);
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = c.V0(null);
            dVar4.q(g10);
        }
        dVar4.u();
        g0 g0Var = (g0) g10;
        d.a aVar = d.a.f16824i;
        g gVar = this.n;
        ToggleableState toggleableState = this.f2064o;
        boolean z10 = this.f2061k;
        u7.a<n> aVar2 = this.f2060j;
        q0.d j12 = m0.b.j1(aVar, true, new ToggleableKt$toggleableImpl$1$semantics$1(gVar, toggleableState, z10, aVar2));
        g0 l12 = c.l1(aVar2, dVar4);
        dVar4.f(-2134919160);
        j jVar = this.f2062l;
        if (z10) {
            ClickableKt.a(jVar, g0Var, dVar4, 48);
        }
        dVar4.u();
        u7.a a10 = androidx.compose.foundation.c.a(dVar4);
        dVar4.f(-492369756);
        Object g11 = dVar4.g();
        if (g11 == c0120a) {
            g11 = c.V0(Boolean.TRUE);
            dVar4.q(g11);
        }
        dVar4.u();
        g0 g0Var2 = (g0) g11;
        q0.d a11 = SuspendingPointerInputFilterKt.a(aVar, jVar, Boolean.valueOf(z10), new ToggleableKt$toggleableImpl$1$gestures$1(this.f2061k, this.f2062l, g0Var, c.l1(new ToggleableKt$toggleableImpl$1$delayPressInteraction$1(g0Var2, a10), dVar4), l12, null));
        dVar4.f(-492369756);
        Object g12 = dVar4.g();
        if (g12 == c0120a) {
            g12 = new y.a(g0Var2);
            dVar4.q(g12);
        }
        dVar4.u();
        q0.d Z = androidx.compose.foundation.d.b(jVar, e.a(jVar, IndicationKt.a(dVar3.Z((q0.d) g12).Z(j12), jVar, this.f2063m), z10), z10).Z(a11);
        dVar4.u();
        return Z;
    }
}
