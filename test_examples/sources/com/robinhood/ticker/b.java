package com.robinhood.ticker;

import android.graphics.Canvas;
import android.text.TextPaint;
import com.robinhood.ticker.TickerView;
import com.robinhood.ticker.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a[] f10182a;

    /* renamed from: b  reason: collision with root package name */
    public final c f10183b;
    public char c = 0;

    /* renamed from: d  reason: collision with root package name */
    public char f10184d = 0;

    /* renamed from: e  reason: collision with root package name */
    public char[] f10185e;

    /* renamed from: f  reason: collision with root package name */
    public int f10186f;

    /* renamed from: g  reason: collision with root package name */
    public int f10187g;

    /* renamed from: h  reason: collision with root package name */
    public int f10188h;

    /* renamed from: i  reason: collision with root package name */
    public float f10189i;

    /* renamed from: j  reason: collision with root package name */
    public float f10190j;

    /* renamed from: k  reason: collision with root package name */
    public float f10191k;

    /* renamed from: l  reason: collision with root package name */
    public float f10192l;

    /* renamed from: m  reason: collision with root package name */
    public float f10193m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f10194o;

    /* renamed from: p  reason: collision with root package name */
    public float f10195p;

    /* renamed from: q  reason: collision with root package name */
    public int f10196q;

    public b(a[] aVarArr, c cVar) {
        this.f10182a = aVarArr;
        this.f10183b = cVar;
    }

    public static boolean b(Canvas canvas, TextPaint textPaint, char[] cArr, int i10, float f10) {
        if (i10 < 0 || i10 >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i10, 1, 0.0f, f10, textPaint);
        return true;
    }

    public final void a() {
        float a10 = this.f10183b.a(this.f10184d);
        float f10 = this.f10192l;
        float f11 = this.f10193m;
        if (f10 != f11 || f11 == a10) {
            return;
        }
        this.f10193m = a10;
        this.f10192l = a10;
        this.n = a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (((r11 - r9) + r10) < (r9 - r10)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (((r11 - r10) + r9) < (r10 - r9)) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(char c) {
        int i10;
        a.C0101a c0101a;
        this.f10184d = c;
        this.f10191k = this.f10192l;
        c cVar = this.f10183b;
        float a10 = cVar.a(c);
        this.f10193m = a10;
        this.n = Math.max(this.f10191k, a10);
        this.f10185e = null;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f10182a;
            i10 = 1;
            if (i11 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i11];
            char c10 = this.c;
            char c11 = this.f10184d;
            TickerView.ScrollingDirection scrollingDirection = cVar.f10200e;
            int a11 = aVar.a(c10);
            int a12 = aVar.a(c11);
            if (a11 >= 0 && a12 >= 0) {
                int ordinal = scrollingDirection.ordinal();
                int i12 = aVar.f10178a;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (c11 == 0) {
                                a12 = aVar.f10179b.length;
                            } else if (a12 < a11) {
                                a12 += i12;
                            }
                        }
                    } else if (a11 < a12) {
                        a11 += i12;
                    }
                    c0101a = new a.C0101a(a11, a12);
                    if (c0101a != null) {
                        this.f10185e = this.f10182a[i11].f10179b;
                        this.f10186f = c0101a.f10180a;
                        this.f10187g = c0101a.f10181b;
                    }
                    i11++;
                } else {
                    if (c10 != 0 && c11 != 0) {
                        if (a12 >= a11) {
                            if (a11 < a12) {
                            }
                        }
                    }
                    c0101a = new a.C0101a(a11, a12);
                    if (c0101a != null) {
                    }
                    i11++;
                }
            }
            c0101a = null;
            if (c0101a != null) {
            }
            i11++;
        }
        if (this.f10185e == null) {
            char c12 = this.c;
            char c13 = this.f10184d;
            if (c12 == c13) {
                this.f10185e = new char[]{c12};
                this.f10187g = 0;
                this.f10186f = 0;
            } else {
                this.f10185e = new char[]{c12, c13};
                this.f10186f = 0;
                this.f10187g = 1;
            }
        }
        if (this.f10187g >= this.f10186f) {
            z10 = true;
        }
        if (!z10) {
            i10 = -1;
        }
        this.f10196q = i10;
        this.f10195p = this.f10194o;
        this.f10194o = 0.0f;
    }
}
