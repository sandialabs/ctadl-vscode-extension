package com.noto.app.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.NotoThemeKt;
import e0.l;
import g0.c;
import g0.d;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import n6.b;
import q0.a;
import q0.b;
import u7.p;
import u7.q;
import v.e;
import v7.g;
import z.f;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDialogKt$BottomSheetDialog$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f7600j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ScrollState f7601k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f7602l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7603m;
    public final /* synthetic */ q<v.d, d, Integer, n> n;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.components.BottomSheetDialogKt$BottomSheetDialog$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ q0.d f7604j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ScrollState f7605k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f7606l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f7607m;
        public final /* synthetic */ q<v.d, d, Integer, n> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(q0.d dVar, ScrollState scrollState, String str, int i10, q<? super v.d, ? super d, ? super Integer, n> qVar) {
            super(2);
            this.f7604j = dVar;
            this.f7605k = scrollState;
            this.f7606l = str;
            this.f7607m = i10;
            this.n = qVar;
        }

        @Override // u7.p
        public final n R(d dVar, Integer num) {
            d dVar2 = dVar;
            if ((num.intValue() & 11) == 2 && dVar2.s()) {
                dVar2.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            q0.d d5 = a.d(this.f7604j, this.f7605k);
            dVar2.f(2054871046);
            dVar2.u();
            q0.d c12 = a1.c.c1(d5, ((b) dVar2.w(NotoThemeKt.f7585h)).c);
            b.a aVar = a.C0210a.f16817g;
            dVar2.f(-483455358);
            j1.q a10 = ColumnKt.a(androidx.compose.foundation.layout.b.c, aVar, dVar2);
            dVar2.f(-1323940314);
            b2.b bVar = (b2.b) dVar2.w(CompositionLocalsKt.f3703e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.w(CompositionLocalsKt.f3709k);
            j1 j1Var = (j1) dVar2.w(CompositionLocalsKt.f3712o);
            ComposeUiNode.f3400a.getClass();
            u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
            ComposableLambdaImpl a11 = androidx.compose.ui.layout.a.a(c12);
            if (dVar2.y() instanceof c) {
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
                a11.O(new v0(dVar2), dVar2, 0);
                dVar2.f(2058660585);
                dVar2.f(-1163856341);
                e eVar = e.f18047a;
                BottomSheetDialogKt.b(eVar, null, dVar2, 6, 1);
                int i10 = this.f7607m;
                BottomSheetDialogKt.c(this.f7606l, null, dVar2, (i10 >> 3) & 14, 2);
                this.n.O(eVar, dVar2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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
    public BottomSheetDialogKt$BottomSheetDialog$1(q0.d dVar, ScrollState scrollState, String str, int i10, q<? super v.d, ? super d, ? super Integer, n> qVar) {
        super(2);
        this.f7600j = dVar;
        this.f7601k = scrollState;
        this.f7602l = str;
        this.f7603m = i10;
        this.n = qVar;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        n6.b bVar = NotoThemeKt.f7579a;
        g.f((l) dVar2.w(ShapesKt.f2400a), "<this>");
        float f10 = 8;
        float f11 = 0;
        SurfaceKt.a(null, f.b(f10, f10, f11, f11), ((e0.c) dVar2.w(ColorSchemeKt.f2278a)).a(), 0L, 0.0f, a1.c.i0(dVar2, 1210012492, new AnonymousClass1(this.f7600j, this.f7601k, this.f7602l, this.f7603m, this.n)), dVar2, 12582912, 121);
        return n.f16010a;
    }
}
