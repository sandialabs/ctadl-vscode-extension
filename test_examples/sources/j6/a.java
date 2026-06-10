package j6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import b6.f;
import b6.g;
import b6.k;
import u5.h;
import x5.d;

/* loaded from: classes.dex */
public final class a extends g implements h.b {
    public CharSequence F;
    public final Context G;
    public final Paint.FontMetrics H;
    public final h I;
    public final View$OnLayoutChangeListenerC0136a J;
    public final Rect K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;

    /* renamed from: j6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0136a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0136a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a aVar = a.this;
            aVar.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.Q = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.K);
        }
    }

    public a(Context context, int i10) {
        super(context, null, 0, i10);
        this.H = new Paint.FontMetrics();
        h hVar = new h(this);
        this.I = hVar;
        this.J = new View$OnLayoutChangeListenerC0136a();
        this.K = new Rect();
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = 0.5f;
        this.U = 1.0f;
        this.G = context;
        TextPaint textPaint = hVar.f17815a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // u5.h.b
    public final void a() {
        invalidateSelf();
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float w10 = w();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.R, this.S, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.T) + getBounds().top);
        canvas.translate(w10, (float) (-((sqrt * this.P) - this.P)));
        super.draw(canvas);
        if (this.F != null) {
            Rect bounds = getBounds();
            h hVar = this.I;
            TextPaint textPaint = hVar.f17815a;
            Paint.FontMetrics fontMetrics = this.H;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d dVar = hVar.f17819f;
            TextPaint textPaint2 = hVar.f17815a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                hVar.f17819f.e(this.G, textPaint2, hVar.f17816b);
                textPaint2.setAlpha((int) (this.U * 255.0f));
            }
            CharSequence charSequence = this.F;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), centerY, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.I.f17815a.getTextSize(), this.N);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float a10;
        float f10 = this.L * 2;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            a10 = 0.0f;
        } else {
            a10 = this.I.a(charSequence.toString());
        }
        return (int) Math.max(f10 + a10, this.M);
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k kVar = this.f6391i.f6409a;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        aVar.f6453k = x();
        setShapeAppearanceModel(new k(aVar));
    }

    @Override // b6.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float w() {
        int i10;
        Rect rect = this.K;
        if (((rect.right - getBounds().right) - this.Q) - this.O < 0) {
            i10 = ((rect.right - getBounds().right) - this.Q) - this.O;
        } else if (((rect.left - getBounds().left) - this.Q) + this.O <= 0) {
            return 0.0f;
        } else {
            i10 = ((rect.left - getBounds().left) - this.Q) + this.O;
        }
        return i10;
    }

    public final b6.h x() {
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.P))) / 2.0f;
        return new b6.h(new f(this.P), Math.min(Math.max(-w(), -width), width));
    }
}
