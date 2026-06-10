package androidx.compose.animation;

import r.h;
import r.z;
import u7.l;
import v0.r;
import w0.c;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt {

    /* renamed from: a  reason: collision with root package name */
    public static final l<c, z<r, h>> f1250a = ColorVectorConverterKt$ColorToVector$1.f1252j;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f1251b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    public static final float[] c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final float a(int i10, float f10, float f11, float f12, float[] fArr) {
        float f13 = f10 * fArr[i10];
        return (f12 * fArr[i10 + 6]) + (f11 * fArr[i10 + 3]) + f13;
    }
}
