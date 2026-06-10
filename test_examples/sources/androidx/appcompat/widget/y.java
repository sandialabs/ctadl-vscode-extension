package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.noto.R;
import r2.a;

/* loaded from: classes.dex */
public final class y extends t {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1155d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1156e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1157f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1158g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1159h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1160i;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f1157f = null;
        this.f1158g = null;
        this.f1159h = false;
        this.f1160i = false;
        this.f1155d = seekBar;
    }

    @Override // androidx.appcompat.widget.t
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1155d;
        Context context = seekBar.getContext();
        int[] iArr = a1.b.f46q;
        d1 m10 = d1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        a3.j0.o(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f903b, R.attr.seekBarStyle, 0);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f1156e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1156e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            r2.a.c(e10, j0.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f1158g = j0.d(m10.h(3, -1), this.f1158g);
            this.f1160i = true;
        }
        if (m10.l(2)) {
            this.f1157f = m10.b(2);
            this.f1159h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1156e;
        if (drawable != null) {
            if (this.f1159h || this.f1160i) {
                Drawable g10 = r2.a.g(drawable.mutate());
                this.f1156e = g10;
                if (this.f1159h) {
                    a.b.h(g10, this.f1157f);
                }
                if (this.f1160i) {
                    a.b.i(this.f1156e, this.f1158g);
                }
                if (this.f1156e.isStateful()) {
                    this.f1156e.setState(this.f1155d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f1156e != null) {
            SeekBar seekBar = this.f1155d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1156e.getIntrinsicWidth();
                int intrinsicHeight = this.f1156e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1156e.setBounds(-i10, -i11, i10, i11);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1156e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
