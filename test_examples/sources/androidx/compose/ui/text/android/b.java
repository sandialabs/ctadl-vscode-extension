package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import m7.e;
import ma.i;
import q1.f;
import q1.k;
import q1.m;
import q1.o;
import q1.q;
import q1.r;
import s1.d;
import s1.h;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4068a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4069b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Layout f4070d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4071e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4072f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4073g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4074h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4075i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint.FontMetricsInt f4076j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4077k;

    /* renamed from: l  reason: collision with root package name */
    public final h[] f4078l;

    /* renamed from: m  reason: collision with root package name */
    public final q f4079m;
    public final e n;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(CharSequence charSequence, float f10, x1.a aVar, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, int i16, int i17, a aVar2) {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        BoringLayout.Metrics metrics;
        int ceil;
        Layout a10;
        int min;
        boolean z10;
        int i18;
        h[] hVarArr;
        int i19;
        Layout layout;
        Pair pair;
        g.f(charSequence, "charSequence");
        g.f(aVar, "textPaint");
        g.f(aVar2, "layoutIntrinsics");
        this.f4068a = true;
        this.f4069b = true;
        this.f4079m = new q();
        int length = charSequence.length();
        TextDirectionHeuristic a11 = r.a(i11);
        Layout.Alignment alignment3 = o.f16865a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else if (i10 == 2) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i10 == 3) {
                    alignment = o.f16865a;
                } else if (i10 == 4) {
                    alignment = o.f16866b;
                }
                alignment2 = alignment;
                boolean z11 = !(charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, s1.a.class) < length;
                Trace.beginSection("TextLayout:initLayout");
                metrics = (BoringLayout.Metrics) aVar2.f4066a.getValue();
                double d5 = f10;
                ceil = (int) Math.ceil(d5);
                if (metrics != null || ((Number) aVar2.c.getValue()).floatValue() > f10 || z11) {
                    m mVar = k.f16843a;
                    a10 = k.a(charSequence, 0, charSequence.length(), aVar, ceil, a11, alignment2, i12, truncateAt, (int) Math.ceil(d5), 1.0f, 0.0f, i17, true, true, i13, i14, i15, i16, null, null);
                } else {
                    a10 = i.t(charSequence, aVar, ceil, metrics, alignment2, true, true, truncateAt, ceil);
                }
                this.f4070d = a10;
                Trace.endSection();
                min = Math.min(a10.getLineCount(), i12);
                this.f4071e = min;
                if (min < i12) {
                    int i20 = min - 1;
                    if (a10.getEllipsisCount(i20) <= 0) {
                        if (a10.getLineEnd(i20) != charSequence.length()) {
                        }
                    }
                    z10 = true;
                    this.c = z10;
                    Pair pair2 = new Pair(0, 0);
                    if (h() instanceof Spanned) {
                        i18 = 0;
                        hVarArr = (h[]) ((Spanned) h()).getSpans(0, h().length(), h.class);
                        g.e(hVarArr, "lineHeightStyleSpans");
                        if (hVarArr.length == 0) {
                        }
                        this.f4078l = hVarArr;
                        int i21 = 0;
                        int i22 = 0;
                        for (h hVar : hVarArr) {
                            int i23 = hVar.f17252s;
                            i21 = i23 < 0 ? Math.max(i21, Math.abs(i23)) : i21;
                            int i24 = hVar.f17253t;
                            if (i24 < 0) {
                                i22 = Math.max(i21, Math.abs(i24));
                            }
                        }
                        Pair<Integer, Integer> pair3 = (i21 == 0 || i22 != 0) ? new Pair<>(Integer.valueOf(i21), Integer.valueOf(i22)) : r.f16868a;
                        this.f4072f = Math.max(((Number) pair2.f12962i).intValue(), pair3.f12962i.intValue());
                        this.f4073g = Math.max(((Number) pair2.f12963j).intValue(), pair3.f12963j.intValue());
                        h[] hVarArr2 = this.f4078l;
                        i19 = this.f4071e - 1;
                        layout = this.f4070d;
                        if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                            if (!(hVarArr2.length == 0)) {
                                SpannableString spannableString = new SpannableString("\u200b");
                                h hVar2 = (h) kotlin.collections.b.l2(hVarArr2);
                                spannableString.setSpan(new h(hVar2.f17243i, spannableString.length(), (i19 == 0 || !hVar2.f17247m) ? hVar2.f17247m : false, hVar2.f17247m, hVar2.n), i18, spannableString.length(), 33);
                                m mVar2 = k.f16843a;
                                StaticLayout a12 = k.a(spannableString, 0, spannableString.length(), aVar, Integer.MAX_VALUE, a11, q1.e.f16836a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, this.f4068a, this.f4069b, 0, 0, 0, 0, null, null);
                                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                                fontMetricsInt.ascent = a12.getLineAscent(i18);
                                fontMetricsInt.descent = a12.getLineDescent(i18);
                                fontMetricsInt.top = a12.getLineTop(i18);
                                int lineBottom = a12.getLineBottom(i18);
                                fontMetricsInt.bottom = lineBottom;
                                pair = new Pair(fontMetricsInt, Integer.valueOf(lineBottom - ((int) (c(i19) - e(i19)))));
                                this.f4076j = (Paint.FontMetricsInt) pair.f12962i;
                                this.f4077k = ((Number) pair.f12963j).intValue();
                                Layout layout2 = this.f4070d;
                                TextPaint paint = layout2.getPaint();
                                g.e(paint, "this.paint");
                                this.f4074h = d.a(layout2, this.f4071e - 1, paint);
                                Layout layout3 = this.f4070d;
                                TextPaint paint2 = layout3.getPaint();
                                g.e(paint2, "this.paint");
                                this.f4075i = d.b(layout3, this.f4071e - 1, paint2);
                                this.n = kotlin.a.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
                                return;
                            }
                        }
                        pair = new Pair(null, Integer.valueOf(i18));
                        this.f4076j = (Paint.FontMetricsInt) pair.f12962i;
                        this.f4077k = ((Number) pair.f12963j).intValue();
                        Layout layout22 = this.f4070d;
                        TextPaint paint3 = layout22.getPaint();
                        g.e(paint3, "this.paint");
                        this.f4074h = d.a(layout22, this.f4071e - 1, paint3);
                        Layout layout32 = this.f4070d;
                        TextPaint paint22 = layout32.getPaint();
                        g.e(paint22, "this.paint");
                        this.f4075i = d.b(layout32, this.f4071e - 1, paint22);
                        this.n = kotlin.a.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
                        return;
                    }
                    i18 = 0;
                    hVarArr = new h[0];
                    this.f4078l = hVarArr;
                    int i212 = 0;
                    int i222 = 0;
                    while (r6 < r3) {
                    }
                    if (i212 == 0) {
                    }
                    this.f4072f = Math.max(((Number) pair2.f12962i).intValue(), pair3.f12962i.intValue());
                    this.f4073g = Math.max(((Number) pair2.f12963j).intValue(), pair3.f12963j.intValue());
                    h[] hVarArr22 = this.f4078l;
                    i19 = this.f4071e - 1;
                    layout = this.f4070d;
                    if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                    }
                    pair = new Pair(null, Integer.valueOf(i18));
                    this.f4076j = (Paint.FontMetricsInt) pair.f12962i;
                    this.f4077k = ((Number) pair.f12963j).intValue();
                    Layout layout222 = this.f4070d;
                    TextPaint paint32 = layout222.getPaint();
                    g.e(paint32, "this.paint");
                    this.f4074h = d.a(layout222, this.f4071e - 1, paint32);
                    Layout layout322 = this.f4070d;
                    TextPaint paint222 = layout322.getPaint();
                    g.e(paint222, "this.paint");
                    this.f4075i = d.b(layout322, this.f4071e - 1, paint222);
                    this.n = kotlin.a.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
                    return;
                }
                z10 = false;
                this.c = z10;
                Pair pair22 = new Pair(0, 0);
                if (h() instanceof Spanned) {
                }
                i18 = 0;
                hVarArr = new h[0];
                this.f4078l = hVarArr;
                int i2122 = 0;
                int i2222 = 0;
                while (r6 < r3) {
                }
                if (i2122 == 0) {
                }
                this.f4072f = Math.max(((Number) pair22.f12962i).intValue(), pair3.f12962i.intValue());
                this.f4073g = Math.max(((Number) pair22.f12963j).intValue(), pair3.f12963j.intValue());
                h[] hVarArr222 = this.f4078l;
                i19 = this.f4071e - 1;
                layout = this.f4070d;
                if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                }
                pair = new Pair(null, Integer.valueOf(i18));
                this.f4076j = (Paint.FontMetricsInt) pair.f12962i;
                this.f4077k = ((Number) pair.f12963j).intValue();
                Layout layout2222 = this.f4070d;
                TextPaint paint322 = layout2222.getPaint();
                g.e(paint322, "this.paint");
                this.f4074h = d.a(layout2222, this.f4071e - 1, paint322);
                Layout layout3222 = this.f4070d;
                TextPaint paint2222 = layout3222.getPaint();
                g.e(paint2222, "this.paint");
                this.f4075i = d.b(layout3222, this.f4071e - 1, paint2222);
                this.n = kotlin.a.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
                return;
            }
            metrics = (BoringLayout.Metrics) aVar2.f4066a.getValue();
            double d52 = f10;
            ceil = (int) Math.ceil(d52);
            if (metrics != null) {
            }
            m mVar3 = k.f16843a;
            a10 = k.a(charSequence, 0, charSequence.length(), aVar, ceil, a11, alignment2, i12, truncateAt, (int) Math.ceil(d52), 1.0f, 0.0f, i17, true, true, i13, i14, i15, i16, null, null);
            this.f4070d = a10;
            Trace.endSection();
            min = Math.min(a10.getLineCount(), i12);
            this.f4071e = min;
            if (min < i12) {
            }
            z10 = false;
            this.c = z10;
            Pair pair222 = new Pair(0, 0);
            if (h() instanceof Spanned) {
            }
            i18 = 0;
            hVarArr = new h[0];
            this.f4078l = hVarArr;
            int i21222 = 0;
            int i22222 = 0;
            while (r6 < r3) {
            }
            if (i21222 == 0) {
            }
            this.f4072f = Math.max(((Number) pair222.f12962i).intValue(), pair3.f12962i.intValue());
            this.f4073g = Math.max(((Number) pair222.f12963j).intValue(), pair3.f12963j.intValue());
            h[] hVarArr2222 = this.f4078l;
            i19 = this.f4071e - 1;
            layout = this.f4070d;
            if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
            }
            pair = new Pair(null, Integer.valueOf(i18));
            this.f4076j = (Paint.FontMetricsInt) pair.f12962i;
            this.f4077k = ((Number) pair.f12963j).intValue();
            Layout layout22222 = this.f4070d;
            TextPaint paint3222 = layout22222.getPaint();
            g.e(paint3222, "this.paint");
            this.f4074h = d.a(layout22222, this.f4071e - 1, paint3222);
            Layout layout32222 = this.f4070d;
            TextPaint paint22222 = layout32222.getPaint();
            g.e(paint22222, "this.paint");
            this.f4075i = d.b(layout32222, this.f4071e - 1, paint22222);
            this.n = kotlin.a.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
            return;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        alignment2 = alignment;
        if (charSequence instanceof Spanned) {
        }
        Trace.beginSection("TextLayout:initLayout");
    }

    public final int a() {
        boolean z10 = this.c;
        Layout layout = this.f4070d;
        return (z10 ? layout.getLineBottom(this.f4071e - 1) : layout.getHeight()) + this.f4072f + this.f4073g + this.f4077k;
    }

    public final float b(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f4072f + ((i10 != this.f4071e + (-1) || (fontMetricsInt = this.f4076j) == null) ? this.f4070d.getLineBaseline(i10) : e(i10) - fontMetricsInt.ascent);
    }

    public final float c(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f4071e;
        int i12 = i11 - 1;
        Layout layout = this.f4070d;
        if (i10 != i12 || (fontMetricsInt = this.f4076j) == null) {
            return this.f4072f + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f4073g : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int d(int i10) {
        return this.f4070d.getLineForOffset(i10);
    }

    public final float e(int i10) {
        return this.f4070d.getLineTop(i10) + (i10 == 0 ? 0 : this.f4072f);
    }

    public final float f(int i10, boolean z10) {
        float f10;
        float a10 = ((f) this.n.getValue()).a(i10, true, z10);
        if (d(i10) == this.f4071e - 1) {
            f10 = this.f4074h + this.f4075i;
        } else {
            f10 = 0.0f;
        }
        return f10 + a10;
    }

    public final float g(int i10, boolean z10) {
        float f10;
        float a10 = ((f) this.n.getValue()).a(i10, false, z10);
        if (d(i10) == this.f4071e - 1) {
            f10 = this.f4074h + this.f4075i;
        } else {
            f10 = 0.0f;
        }
        return f10 + a10;
    }

    public final CharSequence h() {
        CharSequence text = this.f4070d.getText();
        g.e(text, "layout.text");
        return text;
    }
}
