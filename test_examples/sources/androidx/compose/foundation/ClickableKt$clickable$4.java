package androidx.compose.foundation;

import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.g0;
import k1.h;
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
public final class ClickableKt$clickable$4 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1425j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f1426k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ j f1427l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ m f1428m;
    public final /* synthetic */ String n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g f1429o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4(m mVar, j jVar, g gVar, String str, u7.a aVar, boolean z10) {
        super(3);
        this.f1425j = aVar;
        this.f1426k = z10;
        this.f1427l = jVar;
        this.f1428m = mVar;
        this.n = str;
        this.f1429o = gVar;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        v7.g.f(dVar, "$this$composed");
        dVar3.f(92076020);
        u7.a<n> aVar = this.f1425j;
        g0 l12 = a1.c.l1(aVar, dVar3);
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = a1.c.V0(null);
            dVar3.q(g10);
        }
        dVar3.u();
        g0 g0Var = (g0) g10;
        dVar3.f(1841981204);
        boolean z10 = this.f1426k;
        j jVar = this.f1427l;
        if (z10) {
            ClickableKt.a(jVar, g0Var, dVar3, 48);
        }
        dVar3.u();
        u7.a a10 = c.a(dVar3);
        dVar3.f(-492369756);
        Object g11 = dVar3.g();
        if (g11 == c0120a) {
            g11 = a1.c.V0(Boolean.TRUE);
            dVar3.q(g11);
        }
        dVar3.u();
        g0 g0Var2 = (g0) g11;
        q0.d a11 = SuspendingPointerInputFilterKt.a(d.a.f16824i, jVar, Boolean.valueOf(z10), new ClickableKt$clickable$4$gesture$1(this.f1426k, this.f1427l, g0Var, a1.c.l1(new ClickableKt$clickable$4$delayPressInteraction$1(g0Var2, a10), dVar3), l12, null));
        dVar3.f(-492369756);
        Object g12 = dVar3.g();
        if (g12 == c0120a) {
            g12 = new b(g0Var2);
            dVar3.q(g12);
        }
        dVar3.u();
        q0.d dVar4 = (q0.d) g12;
        v7.g.f(dVar4, "other");
        v7.g.f(a11, "gestureModifiers");
        v7.g.f(jVar, "interactionSource");
        v7.g.f(aVar, "onClick");
        q0.d j12 = m0.b.j1(dVar4, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(this.f1429o, this.n, z10, aVar));
        ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 clickableKt$genericClickableWithoutGesture$detectClickFromKey$1 = new ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(z10, aVar);
        h<e1.c> hVar = KeyInputModifierKt.f3249a;
        v7.g.f(j12, "<this>");
        q0.d Z = d.b(jVar, e.a(jVar, IndicationKt.a(InspectableValueKt.a(j12, InspectableValueKt.f3744a, new e1.c(clickableKt$genericClickableWithoutGesture$detectClickFromKey$1)), jVar, this.f1428m), z10), z10).Z(a11);
        dVar3.u();
        return Z;
    }
}
