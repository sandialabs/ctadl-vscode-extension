package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import j1.b0;
import j1.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v.k;
import v.o;
import v.v;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ v f2378j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f0 f2379k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<b0> f2380l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2381m;
    public final /* synthetic */ List<b0> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Integer f2382o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q<o, g0.d, Integer, n> f2383p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2384q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(v vVar, f0 f0Var, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, q qVar, int i11) {
        super(2);
        this.f2378j = vVar;
        this.f2379k = f0Var;
        this.f2380l = arrayList;
        this.f2381m = i10;
        this.n = arrayList2;
        this.f2382o = num;
        this.f2383p = qVar;
        this.f2384q = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    @Override // u7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n R(g0.d dVar, Integer num) {
        float r02;
        float a10;
        LayoutDirection layoutDirection;
        LayoutDirection layoutDirection2;
        float d5;
        LayoutDirection layoutDirection3;
        float b5;
        Integer num2;
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        v vVar = this.f2378j;
        g.f(vVar, "<this>");
        f0 f0Var = this.f2379k;
        g.f(f0Var, "density");
        k kVar = new k(vVar, f0Var);
        if (this.f2380l.isEmpty()) {
            r02 = kVar.c();
        } else {
            r02 = f0Var.r0(this.f2381m);
        }
        if (!this.n.isEmpty() && (num2 = this.f2382o) != null) {
            a10 = f0Var.r0(num2.intValue());
            layoutDirection = f0Var.getLayoutDirection();
            g.f(layoutDirection, "layoutDirection");
            layoutDirection2 = LayoutDirection.Ltr;
            if (layoutDirection != layoutDirection2) {
                d5 = kVar.b(layoutDirection);
            } else {
                d5 = kVar.d(layoutDirection);
            }
            layoutDirection3 = f0Var.getLayoutDirection();
            g.f(layoutDirection3, "layoutDirection");
            if (layoutDirection3 != layoutDirection2) {
                b5 = kVar.d(layoutDirection3);
            } else {
                b5 = kVar.b(layoutDirection3);
            }
            this.f2383p.O(new v.p(d5, r02, b5, a10), dVar2, Integer.valueOf((this.f2384q >> 3) & 112));
            return n.f16010a;
        }
        a10 = kVar.a();
        layoutDirection = f0Var.getLayoutDirection();
        g.f(layoutDirection, "layoutDirection");
        layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection != layoutDirection2) {
        }
        layoutDirection3 = f0Var.getLayoutDirection();
        g.f(layoutDirection3, "layoutDirection");
        if (layoutDirection3 != layoutDirection2) {
        }
        this.f2383p.O(new v.p(d5, r02, b5, a10), dVar2, Integer.valueOf((this.f2384q >> 3) & 112));
        return n.f16010a;
    }
}
