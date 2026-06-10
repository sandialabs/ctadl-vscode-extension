package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import w5.b;
import w5.d;
import w5.g;
import w5.h;
import w5.i;
import w5.n;

/* loaded from: classes.dex */
public final class CircularProgressIndicator extends b<h> {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f7253u = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        h hVar = (h) this.f18368i;
        setIndeterminateDrawable(new n(context2, hVar, new d(hVar), new g(hVar)));
        setProgressDrawable(new i(getContext(), hVar, new d(hVar)));
    }

    public int getIndicatorDirection() {
        return ((h) this.f18368i).f18407i;
    }

    public int getIndicatorInset() {
        return ((h) this.f18368i).f18406h;
    }

    public int getIndicatorSize() {
        return ((h) this.f18368i).f18405g;
    }

    public void setIndicatorDirection(int i10) {
        ((h) this.f18368i).f18407i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f18368i;
        if (((h) s10).f18406h != i10) {
            ((h) s10).f18406h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f18368i;
        if (((h) s10).f18405g != max) {
            ((h) s10).f18405g = max;
            ((h) s10).getClass();
            invalidate();
        }
    }

    @Override // w5.b
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((h) this.f18368i).getClass();
    }
}
