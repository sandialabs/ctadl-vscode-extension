package com.noto.app.settings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.components.BottomSheetDialogKt;
import com.noto.app.components.SelectableDialogItemKt;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import g0.d;
import g0.g0;
import g0.g1;
import g0.t0;
import g0.z0;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScreenBrightnessLevelDialogFragment f9467j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ScreenBrightnessLevel[] f9468j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g1<ScreenBrightnessLevel> f9469k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ScreenBrightnessLevelDialogFragment f9470l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ NumberFormat f9471m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScreenBrightnessLevel[] screenBrightnessLevelArr, g0 g0Var, ScreenBrightnessLevelDialogFragment screenBrightnessLevelDialogFragment, NumberFormat numberFormat) {
            super(3);
            this.f9468j = screenBrightnessLevelArr;
            this.f9469k = g0Var;
            this.f9470l = screenBrightnessLevelDialogFragment;
            this.f9471m = numberFormat;
        }

        @Override // u7.q
        public final n O(v.d dVar, d dVar2, Integer num) {
            ScreenBrightnessLevel[] screenBrightnessLevelArr;
            boolean z10;
            d dVar3 = dVar2;
            int intValue = num.intValue();
            g.f(dVar, "$this$BottomSheetDialog");
            if ((intValue & 81) == 16 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            for (ScreenBrightnessLevel screenBrightnessLevel : this.f9468j) {
                if (this.f9469k.getValue() == screenBrightnessLevel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                SelectableDialogItemKt.a(z10, new ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$1(this.f9470l, screenBrightnessLevel), SizeKt.c(d.a.f16824i), false, a1.c.i0(dVar3, -346107889, new ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1$1$1$2(screenBrightnessLevel, this.f9471m)), dVar3, 24960, 8);
            }
            q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenBrightnessLevelDialogFragment$onCreateView$1$1$1(ScreenBrightnessLevelDialogFragment screenBrightnessLevelDialogFragment) {
        super(2);
        this.f9467j = screenBrightnessLevelDialogFragment;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(-492369756);
        Object g10 = dVar2.g();
        d.a.C0120a c0120a = d.a.f11039a;
        if (g10 == c0120a) {
            g10 = ScreenBrightnessLevel.values();
            dVar2.q(g10);
        }
        dVar2.u();
        ScreenBrightnessLevel[] screenBrightnessLevelArr = (ScreenBrightnessLevel[]) g10;
        ScreenBrightnessLevelDialogFragment screenBrightnessLevelDialogFragment = this.f9467j;
        g0 f02 = a1.c.f0(((c) screenBrightnessLevelDialogFragment.f9465u0.getValue()).f9671q, dVar2);
        dVar2.f(-492369756);
        Object g11 = dVar2.g();
        if (g11 == c0120a) {
            g11 = NumberFormat.getPercentInstance();
            dVar2.q(g11);
        }
        dVar2.u();
        BottomSheetDialogKt.a(this.f9467j, m0.b.m1(R.string.screen_brightness_level, dVar2), null, a1.c.i0(dVar2, -2089047583, new AnonymousClass1(screenBrightnessLevelArr, f02, screenBrightnessLevelDialogFragment, (NumberFormat) g11)), dVar2, 3080, 2);
        return n.f16010a;
    }
}
