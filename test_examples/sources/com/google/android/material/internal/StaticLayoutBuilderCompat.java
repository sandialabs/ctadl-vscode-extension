package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: m  reason: collision with root package name */
    public static final int f7196m;
    public static boolean n;

    /* renamed from: o  reason: collision with root package name */
    public static Constructor<StaticLayout> f7197o;

    /* renamed from: p  reason: collision with root package name */
    public static TextDirectionHeuristic f7198p;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f7199a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f7200b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f7201d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7208k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f7202e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f7203f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f7204g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f7205h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f7206i = f7196m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7207j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f7209l = null;

    /* loaded from: classes.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Exception exc) {
            super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
        }
    }

    static {
        f7196m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public StaticLayoutBuilderCompat(int i10, TextPaint textPaint, CharSequence charSequence) {
        this.f7199a = charSequence;
        this.f7200b = textPaint;
        this.c = i10;
        this.f7201d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        if (this.f7199a == null) {
            this.f7199a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f7199a;
        int i10 = this.f7203f;
        TextPaint textPaint = this.f7200b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f7209l);
        }
        int min = Math.min(charSequence.length(), this.f7201d);
        this.f7201d = min;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            if (this.f7208k && this.f7203f == 1) {
                this.f7202e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.f7202e);
            obtain.setIncludePad(this.f7207j);
            if (this.f7208k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f7209l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f7203f);
            float f10 = this.f7204g;
            if (f10 != 0.0f || this.f7205h != 1.0f) {
                obtain.setLineSpacing(f10, this.f7205h);
            }
            if (this.f7203f > 1) {
                obtain.setHyphenationFrequency(this.f7206i);
            }
            build = obtain.build();
            return build;
        }
        if (!n) {
            try {
                if (this.f7208k && i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f7198p = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f7197o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                n = true;
            } catch (Exception e10) {
                throw new StaticLayoutBuilderCompatException(e10);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f7197o;
            constructor.getClass();
            TextDirectionHeuristic textDirectionHeuristic3 = f7198p;
            textDirectionHeuristic3.getClass();
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f7201d), textPaint, Integer.valueOf(max), this.f7202e, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f7207j), null, Integer.valueOf(max), Integer.valueOf(this.f7203f));
        } catch (Exception e11) {
            throw new StaticLayoutBuilderCompatException(e11);
        }
    }
}
