package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import q0.a;
import q0.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class SizeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final FillModifier f1957a = new FillModifier(Direction.Horizontal, 1.0f, new SizeKt$createFillWidthModifier$1(1.0f));

    /* renamed from: b  reason: collision with root package name */
    public static final FillModifier f1958b = new FillModifier(Direction.Both, 1.0f, new SizeKt$createFillSizeModifier$1(1.0f));
    public static final WrapContentModifier c = a(a.C0210a.f16815e, false);

    /* renamed from: d  reason: collision with root package name */
    public static final WrapContentModifier f1959d = a(a.C0210a.f16814d, false);

    /* renamed from: e  reason: collision with root package name */
    public static final WrapContentModifier f1960e = b(a.C0210a.c, false);

    /* renamed from: f  reason: collision with root package name */
    public static final WrapContentModifier f1961f = b(a.C0210a.f16812a, false);

    public static final WrapContentModifier a(a.c cVar, boolean z10) {
        return new WrapContentModifier(Direction.Vertical, z10, new SizeKt$createWrapContentHeightModifier$1(cVar), cVar, new SizeKt$createWrapContentHeightModifier$2(cVar, z10));
    }

    public static final WrapContentModifier b(q0.a aVar, boolean z10) {
        return new WrapContentModifier(Direction.Both, z10, new SizeKt$createWrapContentSizeModifier$1(aVar), aVar, new SizeKt$createWrapContentSizeModifier$2(aVar, z10));
    }

    public static d c(d dVar) {
        g.f(dVar, "<this>");
        return dVar.Z(f1957a);
    }

    public static final d d(d dVar, float f10) {
        g.f(dVar, "$this$size");
        return dVar.Z(new SizeModifier(f10, f10, f10, f10, true, (l) InspectableValueKt.f3744a));
    }

    public static final d e(d dVar, float f10) {
        g.f(dVar, "$this$width");
        return dVar.Z(new SizeModifier(f10, 0.0f, f10, 0.0f, InspectableValueKt.f3744a, 10));
    }
}
