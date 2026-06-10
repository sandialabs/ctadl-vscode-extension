package s1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: i  reason: collision with root package name */
    public final float f17243i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17244j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final int f17245k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f17246l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f17247m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public int f17248o;

    /* renamed from: p  reason: collision with root package name */
    public int f17249p;

    /* renamed from: q  reason: collision with root package name */
    public int f17250q;

    /* renamed from: r  reason: collision with root package name */
    public int f17251r;

    /* renamed from: s  reason: collision with root package name */
    public int f17252s;

    /* renamed from: t  reason: collision with root package name */
    public int f17253t;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r5 == -1.0f) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(float f10, int i10, boolean z10, boolean z11, float f11) {
        this.f17243i = f10;
        boolean z12 = false;
        this.f17245k = i10;
        this.f17246l = z10;
        this.f17247m = z11;
        this.n = f11;
        if (!(0.0f <= f11 && f11 <= 1.0f)) {
        }
        z12 = true;
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        double d5;
        v7.g.f(charSequence, "text");
        v7.g.f(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z12 = false;
        if (i10 == this.f17244j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == this.f17245k) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = this.f17247m;
        boolean z14 = this.f17246l;
        if (z10 && z11 && z14 && z13) {
            return;
        }
        if (z10) {
            int ceil = (int) Math.ceil(this.f17243i);
            int i16 = ceil - (fontMetricsInt.descent - fontMetricsInt.ascent);
            float f10 = this.n;
            if (f10 == -1.0f) {
                z12 = true;
            }
            if (z12) {
                f10 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            float f11 = i16;
            if (i16 <= 0) {
                d5 = f11 * f10;
            } else {
                d5 = (1.0f - f10) * f11;
            }
            int i17 = fontMetricsInt.descent;
            int ceil2 = ((int) Math.ceil(d5)) + i17;
            this.f17250q = ceil2;
            int i18 = ceil2 - ceil;
            this.f17249p = i18;
            if (z14) {
                i18 = fontMetricsInt.ascent;
            }
            this.f17248o = i18;
            if (z13) {
                ceil2 = i17;
            }
            this.f17251r = ceil2;
            this.f17252s = fontMetricsInt.ascent - i18;
            this.f17253t = ceil2 - i17;
        }
        if (z10) {
            i14 = this.f17248o;
        } else {
            i14 = this.f17249p;
        }
        fontMetricsInt.ascent = i14;
        if (z11) {
            i15 = this.f17251r;
        } else {
            i15 = this.f17250q;
        }
        fontMetricsInt.descent = i15;
    }
}
