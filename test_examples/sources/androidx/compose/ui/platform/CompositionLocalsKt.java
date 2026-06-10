package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import u1.d;
import u1.e;

/* loaded from: classes.dex */
public final class CompositionLocalsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final g0.h1 f3700a = CompositionLocalKt.c(CompositionLocalsKt$LocalAccessibilityManager$1.f3715j);

    /* renamed from: b  reason: collision with root package name */
    public static final g0.h1 f3701b = CompositionLocalKt.c(CompositionLocalsKt$LocalAutofill$1.f3716j);
    public static final g0.h1 c = CompositionLocalKt.c(CompositionLocalsKt$LocalAutofillTree$1.f3717j);

    /* renamed from: d  reason: collision with root package name */
    public static final g0.h1 f3702d = CompositionLocalKt.c(CompositionLocalsKt$LocalClipboardManager$1.f3718j);

    /* renamed from: e  reason: collision with root package name */
    public static final g0.h1 f3703e = CompositionLocalKt.c(CompositionLocalsKt$LocalDensity$1.f3719j);

    /* renamed from: f  reason: collision with root package name */
    public static final g0.h1 f3704f = CompositionLocalKt.c(CompositionLocalsKt$LocalFocusManager$1.f3720j);

    /* renamed from: g  reason: collision with root package name */
    public static final g0.h1 f3705g = CompositionLocalKt.c(CompositionLocalsKt$LocalFontLoader$1.f3722j);

    /* renamed from: h  reason: collision with root package name */
    public static final g0.h1 f3706h = CompositionLocalKt.c(CompositionLocalsKt$LocalFontFamilyResolver$1.f3721j);

    /* renamed from: i  reason: collision with root package name */
    public static final g0.h1 f3707i = CompositionLocalKt.c(CompositionLocalsKt$LocalHapticFeedback$1.f3723j);

    /* renamed from: j  reason: collision with root package name */
    public static final g0.h1 f3708j = CompositionLocalKt.c(CompositionLocalsKt$LocalInputModeManager$1.f3724j);

    /* renamed from: k  reason: collision with root package name */
    public static final g0.h1 f3709k = CompositionLocalKt.c(CompositionLocalsKt$LocalLayoutDirection$1.f3725j);

    /* renamed from: l  reason: collision with root package name */
    public static final g0.h1 f3710l = CompositionLocalKt.c(CompositionLocalsKt$LocalTextInputService$1.f3727j);

    /* renamed from: m  reason: collision with root package name */
    public static final g0.h1 f3711m = CompositionLocalKt.c(CompositionLocalsKt$LocalTextToolbar$1.f3728j);
    public static final g0.h1 n = CompositionLocalKt.c(CompositionLocalsKt$LocalUriHandler$1.f3729j);

    /* renamed from: o  reason: collision with root package name */
    public static final g0.h1 f3712o = CompositionLocalKt.c(CompositionLocalsKt$LocalViewConfiguration$1.f3730j);

    /* renamed from: p  reason: collision with root package name */
    public static final g0.h1 f3713p = CompositionLocalKt.c(CompositionLocalsKt$LocalWindowInfo$1.f3731j);

    /* renamed from: q  reason: collision with root package name */
    public static final g0.h1 f3714q = CompositionLocalKt.c(CompositionLocalsKt$LocalPointerIconService$1.f3726j);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(l1.b0 b0Var, d1 d1Var, u7.p<? super g0.d, ? super Integer, m7.n> pVar, g0.d dVar, int i10) {
        int i11;
        g0.r0 T;
        int i12;
        int i13;
        int i14;
        v7.g.f(b0Var, "owner");
        v7.g.f(d1Var, "uriHandler");
        v7.g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(874662829);
        if ((i10 & 14) == 0) {
            if (p10.z(b0Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (p10.z(d1Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (p10.z(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new CompositionLocalsKt$ProvideCommonCompositionLocals$1(b0Var, d1Var, pVar, i10);
                return;
            }
            return;
        }
        u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
        d.a fontLoader = b0Var.getFontLoader();
        g0.h1 h1Var = f3705g;
        h1Var.getClass();
        e.a fontFamilyResolver = b0Var.getFontFamilyResolver();
        g0.h1 h1Var2 = f3706h;
        h1Var2.getClass();
        CompositionLocalKt.a(new g0.p0[]{f3700a.b(b0Var.getAccessibilityManager()), f3701b.b(b0Var.getAutofill()), c.b(b0Var.getAutofillTree()), f3702d.b(b0Var.getClipboardManager()), f3703e.b(b0Var.getDensity()), f3704f.b(b0Var.getFocusManager()), new g0.p0(h1Var, fontLoader, false), new g0.p0(h1Var2, fontFamilyResolver, false), f3707i.b(b0Var.getHapticFeedBack()), f3708j.b(b0Var.getInputModeManager()), f3709k.b(b0Var.getLayoutDirection()), f3710l.b(b0Var.getTextInputService()), f3711m.b(b0Var.getTextToolbar()), n.b(d1Var), f3712o.b(b0Var.getViewConfiguration()), f3713p.b(b0Var.getWindowInfo()), f3714q.b(b0Var.getPointerIconService())}, pVar, p10, ((i11 >> 3) & 112) | 8);
        T = p10.T();
        if (T == null) {
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
