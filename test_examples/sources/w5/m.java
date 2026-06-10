package w5;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import w5.c;

/* loaded from: classes.dex */
public abstract class m<S extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final S f18426a;

    /* renamed from: b  reason: collision with root package name */
    public l f18427b;

    public m(S s10) {
        this.f18426a = s10;
    }

    public abstract void a(Canvas canvas, Paint paint, float f10, float f11, int i10);

    public abstract void b(Canvas canvas, Paint paint);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, Rect rect, float f10) {
        int i10;
        int i11;
        boolean z10;
        ValueAnimator valueAnimator;
        boolean z11;
        ValueAnimator valueAnimator2;
        boolean z12;
        ValueAnimator valueAnimator3;
        this.f18426a.getClass();
        d dVar = (d) this;
        float width = rect.width() / dVar.d();
        float height = rect.height() / dVar.d();
        h hVar = (h) dVar.f18426a;
        float f11 = (hVar.f18405g / 2.0f) + hVar.f18406h;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        boolean z13 = true;
        if (hVar.f18407i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        dVar.c = i10;
        dVar.f18388d = hVar.f18383a * f10;
        dVar.f18389e = hVar.f18384b * f10;
        dVar.f18390f = (hVar.f18405g - i11) / 2.0f;
        ValueAnimator valueAnimator4 = dVar.f18427b.f18420l;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            z10 = true;
            if (z10 || hVar.f18386e != 2) {
                valueAnimator = dVar.f18427b.f18421m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    z11 = true;
                    if (z11 || hVar.f18387f != 1) {
                        valueAnimator2 = dVar.f18427b.f18420l;
                        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                            z12 = true;
                            if (z12 || hVar.f18386e != 1) {
                                valueAnimator3 = dVar.f18427b.f18421m;
                                if (((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) || hVar.f18387f != 2) {
                                    return;
                                }
                            }
                            dVar.f18390f -= ((1.0f - f10) * hVar.f18383a) / 2.0f;
                            return;
                        }
                        z12 = false;
                        if (z12) {
                        }
                        valueAnimator3 = dVar.f18427b.f18421m;
                        if ((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) {
                            return;
                        }
                        return;
                    }
                }
                z11 = false;
                if (z11) {
                }
                valueAnimator2 = dVar.f18427b.f18420l;
                if (valueAnimator2 != null) {
                    z12 = true;
                    if (z12) {
                    }
                    valueAnimator3 = dVar.f18427b.f18421m;
                    if ((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) {
                    }
                }
                z12 = false;
                if (z12) {
                }
                valueAnimator3 = dVar.f18427b.f18421m;
                if ((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) {
                }
            }
            dVar.f18390f = (((1.0f - f10) * hVar.f18383a) / 2.0f) + dVar.f18390f;
            return;
        }
        z10 = false;
        if (z10) {
        }
        valueAnimator = dVar.f18427b.f18421m;
        if (valueAnimator != null) {
            z11 = true;
            if (z11) {
            }
            valueAnimator2 = dVar.f18427b.f18420l;
            if (valueAnimator2 != null) {
            }
            z12 = false;
            if (z12) {
            }
            valueAnimator3 = dVar.f18427b.f18421m;
            if ((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) {
            }
        }
        z11 = false;
        if (z11) {
        }
        valueAnimator2 = dVar.f18427b.f18420l;
        if (valueAnimator2 != null) {
        }
        z12 = false;
        if (z12) {
        }
        valueAnimator3 = dVar.f18427b.f18421m;
        if ((valueAnimator3 == null && valueAnimator3.isRunning()) ? false : false) {
        }
    }
}
