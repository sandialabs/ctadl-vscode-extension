package com.noto.app.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.PaddingValuesModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.NotoThemeKt;
import g0.d;
import g0.t0;
import g0.v0;
import g0.z0;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o0.f;
import q0.a;
import q7.c;
import r.w;
import u7.a;
import u7.p;
import u7.q;
import v.e;
import v.o;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScreenKt$Screen$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<d, Integer, n> f7632j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f7633k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f7634l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ScrollState f7635m;
    public final /* synthetic */ a<n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ x f7636o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q0.d f7637p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b.k f7638q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a.b f7639r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ q<v.d, d, Integer, n> f7640s;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.components.ScreenKt$Screen$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f7641j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ScrollState f7642k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ u7.a<n> f7643l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f7644m;
        public final /* synthetic */ x n;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.components.ScreenKt$Screen$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00681 extends Lambda implements u7.a<n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ x f7645j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ ScrollState f7646k;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            @c(c = "com.noto.app.components.ScreenKt$Screen$2$1$1$1", f = "Screen.kt", l = {43}, m = "invokeSuspend")
            /* renamed from: com.noto.app.components.ScreenKt$Screen$2$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00691 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

                /* renamed from: m  reason: collision with root package name */
                public int f7647m;
                public final /* synthetic */ ScrollState n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00691(ScrollState scrollState, p7.c<? super C00691> cVar) {
                    super(2, cVar);
                    this.n = scrollState;
                }

                @Override // u7.p
                public final Object R(x xVar, p7.c<? super n> cVar) {
                    return ((C00691) a(xVar, cVar)).k(n.f16010a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                    return new C00691(this.n, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object k(Object obj) {
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f7647m;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        m0.b.n1(obj);
                        this.f7647m = 1;
                        f fVar = ScrollState.f1580f;
                        w wVar = new w(null, 7);
                        ScrollState scrollState = this.n;
                        Object a10 = ScrollExtensionsKt.a(scrollState, 0 - scrollState.d(), wVar, this);
                        if (a10 != obj2) {
                            a10 = n.f16010a;
                        }
                        if (a10 == obj2) {
                            return obj2;
                        }
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00681(x xVar, ScrollState scrollState) {
                super(0);
                this.f7645j = xVar;
                this.f7646k = scrollState;
            }

            @Override // u7.a
            public final n k0() {
                m0.b.M0(this.f7645j, null, null, new C00691(this.f7646k, null), 3);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, ScrollState scrollState, u7.a<n> aVar, int i10, x xVar) {
            super(2);
            this.f7641j = str;
            this.f7642k = scrollState;
            this.f7643l = aVar;
            this.f7644m = i10;
            this.n = xVar;
        }

        @Override // u7.p
        public final n R(d dVar, Integer num) {
            d dVar2 = dVar;
            if ((num.intValue() & 11) == 2 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            String str = this.f7641j;
            x xVar = this.n;
            ScrollState scrollState = this.f7642k;
            C00681 c00681 = new C00681(xVar, scrollState);
            int d5 = scrollState.d();
            u7.a<n> aVar = this.f7643l;
            int i10 = this.f7644m;
            TopAppBarKt.a(str, c00681, d5, null, aVar, dVar2, ((i10 >> 3) & 14) | ((i10 << 3) & 57344), 8);
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.components.ScreenKt$Screen$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements q<o, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ q0.d f7648j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ScrollState f7649k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ b.k f7650l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a.b f7651m;
        public final /* synthetic */ q<v.d, d, Integer, n> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f7652o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(q0.d dVar, ScrollState scrollState, b.k kVar, a.b bVar, q<? super v.d, ? super d, ? super Integer, n> qVar, int i10) {
            super(3);
            this.f7648j = dVar;
            this.f7649k = scrollState;
            this.f7650l = kVar;
            this.f7651m = bVar;
            this.n = qVar;
            this.f7652o = i10;
        }

        @Override // u7.q
        public final n O(o oVar, d dVar, Integer num) {
            int i10;
            o oVar2 = oVar;
            d dVar2 = dVar;
            int intValue = num.intValue();
            g.f(oVar2, "contentPadding");
            if ((intValue & 14) == 0) {
                if (dVar2.z(oVar2)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                intValue |= i10;
            }
            if ((intValue & 91) == 18 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            FillModifier fillModifier = SizeKt.f1957a;
            q0.d dVar3 = this.f7648j;
            g.f(dVar3, "<this>");
            q0.d d5 = androidx.compose.foundation.a.d(dVar3.Z(SizeKt.f1958b), this.f7649k);
            dVar2.f(2054871046);
            dVar2.u();
            q0.d c12 = a1.c.c1(d5, ((n6.b) dVar2.w(NotoThemeKt.f7585h)).c);
            g.f(c12, "<this>");
            q0.d Z = c12.Z(new PaddingValuesModifier(oVar2, InspectableValueKt.f3744a));
            int i11 = this.f7652o >> 12;
            int i12 = (i11 & 7168) | (i11 & 112) | (i11 & 896);
            dVar2.f(-483455358);
            j1.q a10 = ColumnKt.a(this.f7650l, this.f7651m, dVar2);
            dVar2.f(-1323940314);
            b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
            j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(Z);
            int i13 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
                a11.O(new v0(dVar2), dVar2, Integer.valueOf((i13 >> 3) & 112));
                dVar2.f(2058660585);
                dVar2.f(-1163856341);
                if (((i13 >> 9) & 14 & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    dVar2.u();
                    dVar2.u();
                    dVar2.v();
                    dVar2.u();
                    dVar2.u();
                    return n.f16010a;
                }
                this.n.O(e.f18047a, dVar2, Integer.valueOf(((i12 >> 6) & 112) | 6));
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
    public ScreenKt$Screen$2(p<? super d, ? super Integer, n> pVar, int i10, String str, ScrollState scrollState, u7.a<n> aVar, x xVar, q0.d dVar, b.k kVar, a.b bVar, q<? super v.d, ? super d, ? super Integer, n> qVar) {
        super(2);
        this.f7632j = pVar;
        this.f7633k = i10;
        this.f7634l = str;
        this.f7635m = scrollState;
        this.n = aVar;
        this.f7636o = xVar;
        this.f7637p = dVar;
        this.f7638q = kVar;
        this.f7639r = bVar;
        this.f7640s = qVar;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        ScaffoldKt.a(null, a1.c.i0(dVar2, 1163129114, new AnonymousClass1(this.f7634l, this.f7635m, this.n, this.f7633k, this.f7636o)), null, this.f7632j, null, 0, 0L, 0L, null, a1.c.i0(dVar2, -1885884689, new AnonymousClass2(this.f7637p, this.f7635m, this.f7638q, this.f7639r, this.f7640s, this.f7633k)), dVar2, ((this.f7633k >> 3) & 7168) | 805306416, 501);
        return n.f16010a;
    }
}
