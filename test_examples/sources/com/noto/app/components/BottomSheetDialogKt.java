package com.noto.app.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.noto.app.NotoThemeKt;
import com.noto.app.domain.model.Theme;
import e0.r;
import g0.c;
import g0.h1;
import g0.r0;
import g0.t0;
import g0.z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import m7.n;
import o6.b;
import q0.d;
import u7.l;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class BottomSheetDialogKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7597a = 5;

    /* renamed from: b  reason: collision with root package name */
    public static final float f7598b = 30;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
        r11 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(b bVar, String str, d dVar, q<? super v.d, ? super g0.d, ? super Integer, n> qVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        int i17;
        d dVar3;
        r0 T;
        g.f(bVar, "<this>");
        g.f(str, "title");
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(-212515674);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(bVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (p10.z(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            obj = dVar;
            if (p10.z(obj)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
            if ((i11 & 4) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (p10.z(qVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((i17 & 5851) == 1170 && p10.s()) {
                p10.e();
                dVar3 = obj;
                T = p10.T();
                if (T == null) {
                    T.f11073d = new BottomSheetDialogKt$BottomSheetDialog$2(bVar, str, dVar3, qVar, i10, i11);
                    return;
                }
                return;
            }
            d.a aVar = obj;
            q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            NotoThemeKt.a((Theme) a1.c.f0(((com.noto.app.settings.c) a.a(LazyThreadSafetyMode.SYNCHRONIZED, new BottomSheetDialogKt$BottomSheetDialog$$inlined$viewModel$default$1(bVar)).getValue()).f9664i, p10).getValue(), a1.c.i0(p10, -1200718393, new BottomSheetDialogKt$BottomSheetDialog$1(aVar, androidx.compose.foundation.a.b(p10), str, i17, qVar)), p10, 48);
            dVar3 = aVar;
            T = p10.T();
            if (T == null) {
            }
        }
        obj = dVar;
        if ((i11 & 4) == 0) {
        }
        i17 = i12;
        if ((i17 & 5851) == 1170) {
            p10.e();
            dVar3 = obj;
            T = p10.T();
            if (T == null) {
            }
        }
        d.a aVar2 = obj;
        q<c<?>, z0, t0, n> qVar22 = ComposerKt.f2737a;
        NotoThemeKt.a((Theme) a1.c.f0(((com.noto.app.settings.c) a.a(LazyThreadSafetyMode.SYNCHRONIZED, new BottomSheetDialogKt$BottomSheetDialog$$inlined$viewModel$default$1(bVar)).getValue()).f9664i, p10).getValue(), a1.c.i0(p10, -1200718393, new BottomSheetDialogKt$BottomSheetDialog$1(aVar2, androidx.compose.foundation.a.b(p10), str, i17, qVar)), p10, 48);
        dVar3 = aVar2;
        T = p10.T();
        if (T == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        r4 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(v.d dVar, d dVar2, g0.d dVar3, int i10, int i11) {
        int i12;
        int i13;
        Object obj;
        int i14;
        Object obj2;
        r0 T;
        ComposerImpl p10 = dVar3.p(-345457984);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(dVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = dVar2;
            if (p10.z(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i12 & 91) == 18 && p10.s()) {
                p10.e();
                obj2 = obj;
                T = p10.T();
                if (T == null) {
                    T.f11073d = new BottomSheetDialogKt$Tip$1(dVar, obj2, i10, i11);
                    return;
                }
                return;
            }
            obj2 = obj;
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            p10.f(2054871046);
            p10.Q(false);
            d e12 = a1.c.e1(obj2, 0.0f, 0.0f, 0.0f, ((n6.b) p10.w(NotoThemeKt.f7585h)).f16106a, 7);
            float f10 = f7598b;
            float f11 = f7597a;
            FillModifier fillModifier = SizeKt.f1957a;
            g.f(e12, "$this$size");
            BoxKt.a(a1.c.P(dVar.b(e12.Z(new SizeModifier(f10, f11, f10, f11, true, (l) InspectableValueKt.f3744a))), ((e0.c) p10.w(ColorSchemeKt.f2278a)).q(), ((e0.l) p10.w(ShapesKt.f2400a)).f10557e), p10, 0);
            T = p10.T();
            if (T == null) {
            }
        }
        obj = dVar2;
        if ((i12 & 91) == 18) {
            p10.e();
            obj2 = obj;
            T = p10.T();
            if (T == null) {
            }
        }
        obj2 = obj;
        q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        p10.f(2054871046);
        p10.Q(false);
        d e122 = a1.c.e1(obj2, 0.0f, 0.0f, 0.0f, ((n6.b) p10.w(NotoThemeKt.f7585h)).f16106a, 7);
        float f102 = f7598b;
        float f112 = f7597a;
        FillModifier fillModifier2 = SizeKt.f1957a;
        g.f(e122, "$this$size");
        BoxKt.a(a1.c.P(dVar.b(e122.Z(new SizeModifier(f102, f112, f102, f112, true, (l) InspectableValueKt.f3744a))), ((e0.c) p10.w(ColorSchemeKt.f2278a)).q(), ((e0.l) p10.w(ShapesKt.f2400a)).f10557e), p10, 0);
        T = p10.T();
        if (T == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        r24 = q0.d.a.f16824i;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, d dVar, g0.d dVar2, int i10, int i11) {
        int i12;
        int i13;
        Object obj;
        int i14;
        int i15;
        ComposerImpl composerImpl;
        r0 T;
        ComposerImpl p10 = dVar2.p(1953186606);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (p10.z(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            obj = dVar;
            if (p10.z(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i12;
            if ((i15 & 91) == 18 && p10.s()) {
                p10.e();
                composerImpl = p10;
                T = composerImpl.T();
                if (T == null) {
                    T.f11073d = new BottomSheetDialogKt$Title$1(str, obj, i10, i11);
                    return;
                }
                return;
            }
            d.a aVar = obj;
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            p10.f(2054871046);
            h1 h1Var = NotoThemeKt.f7585h;
            p10.Q(false);
            float f10 = ((n6.b) p10.w(h1Var)).f16106a;
            p10.f(2054871046);
            p10.Q(false);
            composerImpl = p10;
            TextKt.b(str, a1.c.e1(aVar, 0.0f, f10, 0.0f, ((n6.b) p10.w(h1Var)).c, 5), ((e0.c) p10.w(ColorSchemeKt.f2278a)).f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((r) p10.w(TypographyKt.f2598a)).f10582h, composerImpl, i15 & 14, 0, 32760);
            obj = aVar;
            T = composerImpl.T();
            if (T == null) {
            }
        }
        obj = dVar;
        i15 = i12;
        if ((i15 & 91) == 18) {
            p10.e();
            composerImpl = p10;
            T = composerImpl.T();
            if (T == null) {
            }
        }
        d.a aVar2 = obj;
        q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        p10.f(2054871046);
        h1 h1Var2 = NotoThemeKt.f7585h;
        p10.Q(false);
        float f102 = ((n6.b) p10.w(h1Var2)).f16106a;
        p10.f(2054871046);
        p10.Q(false);
        composerImpl = p10;
        TextKt.b(str, a1.c.e1(aVar2, 0.0f, f102, 0.0f, ((n6.b) p10.w(h1Var2)).c, 5), ((e0.c) p10.w(ColorSchemeKt.f2278a)).f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((r) p10.w(TypographyKt.f2598a)).f10582h, composerImpl, i15 & 14, 0, 32760);
        obj = aVar2;
        T = composerImpl.T();
        if (T == null) {
        }
    }
}
