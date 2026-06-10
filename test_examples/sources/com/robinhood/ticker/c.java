package com.robinhood.ticker;

import android.graphics.Paint;
import android.text.TextPaint;
import com.robinhood.ticker.TickerView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f10197a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10198b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f10199d;

    /* renamed from: e  reason: collision with root package name */
    public TickerView.ScrollingDirection f10200e;

    public c(TextPaint textPaint) {
        HashMap hashMap = new HashMap(256);
        this.f10198b = hashMap;
        this.f10200e = TickerView.ScrollingDirection.ANY;
        this.f10197a = textPaint;
        hashMap.clear();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        this.c = f10 - f11;
        this.f10199d = -f11;
    }

    public final float a(char c) {
        if (c == 0) {
            return 0.0f;
        }
        HashMap hashMap = this.f10198b;
        Float f10 = (Float) hashMap.get(Character.valueOf(c));
        if (f10 != null) {
            return f10.floatValue();
        }
        float measureText = this.f10197a.measureText(Character.toString(c));
        hashMap.put(Character.valueOf(c), Float.valueOf(measureText));
        return measureText;
    }
}
