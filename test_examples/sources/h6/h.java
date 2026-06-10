package h6;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
public class h extends b6.g {
    public static final /* synthetic */ int G = 0;
    public final RectF F;

    @TargetApi(18)
    /* loaded from: classes.dex */
    public static class a extends h {
        public a(b6.k kVar) {
            super(kVar);
        }

        @Override // b6.g
        public final void g(Canvas canvas) {
            RectF rectF = this.F;
            if (rectF.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(rectF);
            } else {
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(b6.k kVar) {
        super(kVar);
        if (kVar == null) {
            kVar = new b6.k();
        }
        this.F = new RectF();
    }

    public final void w(float f10, float f11, float f12, float f13) {
        RectF rectF = this.F;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
