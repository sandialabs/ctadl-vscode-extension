package androidx.compose.material3;

import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.PaddingValuesModifier;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.UnspecifiedConstraintsModifier;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.p0;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.a;
import q0.b;
import u7.l;
import u7.p;
import u7.q;
import v.o;
import v.r;
import v.s;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class ButtonKt$Button$2 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f2248j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ o f2249k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q<r, g0.d, Integer, n> f2250l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2251m;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$Button$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<g0.d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o f2252j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ q<r, g0.d, Integer, n> f2253k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f2254l;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
        /* renamed from: androidx.compose.material3.ButtonKt$Button$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00201 extends Lambda implements p<g0.d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o f2255j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ q<r, g0.d, Integer, n> f2256k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f2257l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00201(o oVar, q<? super r, ? super g0.d, ? super Integer, n> qVar, int i10) {
                super(2);
                this.f2255j = oVar;
                this.f2256k = qVar;
                this.f2257l = i10;
            }

            @Override // u7.p
            public final n R(g0.d dVar, Integer num) {
                g0.d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                float f10 = e0.b.c;
                float f11 = e0.b.f10512d;
                FillModifier fillModifier = SizeKt.f1957a;
                l<n0, n> lVar = InspectableValueKt.f3744a;
                UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = new UnspecifiedConstraintsModifier(f10, f11, lVar);
                o oVar = this.f2255j;
                g.f(oVar, "paddingValues");
                q0.d Z = unspecifiedConstraintsModifier.Z(new PaddingValuesModifier(oVar, lVar));
                b.C0019b c0019b = androidx.compose.foundation.layout.b.f2001e;
                b.C0211b c0211b = a.C0210a.f16815e;
                int i10 = ((this.f2257l >> 18) & 7168) | 432;
                dVar2.f(693286680);
                j1.q a10 = RowKt.a(c0019b, c0211b, dVar2);
                dVar2.f(-1323940314);
                b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
                LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
                j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
                ComposeUiNode.f3400a.getClass();
                u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
                ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(Z);
                int i11 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
                if (dVar2.y() instanceof g0.c) {
                    dVar2.r();
                    if (dVar2.l()) {
                        dVar2.m(aVar);
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
                    this.f2256k.O(s.f18077a, dVar2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(o oVar, q<? super r, ? super g0.d, ? super Integer, n> qVar, int i10) {
            super(2);
            this.f2252j = oVar;
            this.f2253k = qVar;
            this.f2254l = i10;
        }

        @Override // u7.p
        public final n R(g0.d dVar, Integer num) {
            g0.d dVar2 = dVar;
            if ((num.intValue() & 11) == 2 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            TextKt.a(((e0.r) dVar2.w(TypographyKt.f2598a)).f10587m, a1.c.i0(dVar2, -2136309793, new C00201(this.f2252j, this.f2253k, this.f2254l)), dVar2, 48);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonKt$Button$2(long j2, o oVar, q<? super r, ? super g0.d, ? super Integer, n> qVar, int i10) {
        super(2);
        this.f2248j = j2;
        this.f2249k = oVar;
        this.f2250l = qVar;
        this.f2251m = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new v0.r(this.f2248j))}, a1.c.i0(dVar2, 1582292974, new AnonymousClass1(this.f2249k, this.f2250l, this.f2251m)), dVar2, 56);
        return n.f16010a;
    }
}
