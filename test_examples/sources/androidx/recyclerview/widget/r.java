package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class r extends RecyclerView.w {
    @SuppressLint({"UnknownNullness"})

    /* renamed from: k  reason: collision with root package name */
    public PointF f5990k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f5991l;
    public float n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f5988i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f5989j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f5992m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f5993o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f5994p = 0;

    @SuppressLint({"UnknownNullness"})
    public r(Context context) {
        this.f5991l = context.getResources().getDisplayMetrics();
    }

    public static int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    @SuppressLint({"UnknownNullness"})
    public final void c(int i10, int i11, RecyclerView.w.a aVar) {
        if (this.f5730b.f5643v.A() == 0) {
            f();
            return;
        }
        int i12 = this.f5993o;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f5993o = i13;
        int i15 = this.f5994p;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f5994p = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a10 = a(this.f5729a);
            if (a10 != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    float f11 = a10.y;
                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                    float f12 = a10.x / sqrt;
                    a10.x = f12;
                    float f13 = a10.y / sqrt;
                    a10.y = f13;
                    this.f5990k = a10;
                    this.f5993o = (int) (f12 * 10000.0f);
                    this.f5994p = (int) (f13 * 10000.0f);
                    int i17 = i(10000);
                    LinearInterpolator linearInterpolator = this.f5988i;
                    aVar.f5736a = (int) (this.f5993o * 1.2f);
                    aVar.f5737b = (int) (this.f5994p * 1.2f);
                    aVar.c = (int) (i17 * 1.2f);
                    aVar.f5739e = linearInterpolator;
                    aVar.f5740f = true;
                    return;
                }
            }
            aVar.f5738d = this.f5729a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public final void d() {
        this.f5994p = 0;
        this.f5993o = 0;
        this.f5990k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(View view, RecyclerView.w.a aVar) {
        int i10;
        RecyclerView.l lVar;
        int i11;
        PointF pointF;
        RecyclerView.l lVar2;
        int ceil;
        int i12;
        int i13;
        PointF pointF2 = this.f5990k;
        int i14 = -1;
        int i15 = 0;
        if (pointF2 != null && pointF2.x != 0.0f) {
            if (i13 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            lVar = this.c;
            if (lVar != null && lVar.h()) {
                RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                i11 = g((view.getLeft() - RecyclerView.l.F(view)) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, RecyclerView.l.M(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.H(), lVar.f5704o - lVar.I(), i10);
                pointF = this.f5990k;
                if (pointF != null && pointF.y != 0.0f) {
                    if (i12 > 0) {
                        i14 = 1;
                    }
                    lVar2 = this.c;
                    if (lVar2 != null && lVar2.i()) {
                        RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
                        i15 = g((view.getTop() - RecyclerView.l.O(view)) - ((ViewGroup.MarginLayoutParams) mVar2).topMargin, RecyclerView.l.y(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin, lVar2.J(), lVar2.f5705p - lVar2.G(), i14);
                    }
                    ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
                    if (ceil <= 0) {
                        DecelerateInterpolator decelerateInterpolator = this.f5989j;
                        aVar.f5736a = -i11;
                        aVar.f5737b = -i15;
                        aVar.c = ceil;
                        aVar.f5739e = decelerateInterpolator;
                        aVar.f5740f = true;
                        return;
                    }
                    return;
                }
                i14 = 0;
                lVar2 = this.c;
                if (lVar2 != null) {
                    RecyclerView.m mVar22 = (RecyclerView.m) view.getLayoutParams();
                    i15 = g((view.getTop() - RecyclerView.l.O(view)) - ((ViewGroup.MarginLayoutParams) mVar22).topMargin, RecyclerView.l.y(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) mVar22).bottomMargin, lVar2.J(), lVar2.f5705p - lVar2.G(), i14);
                }
                ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
                if (ceil <= 0) {
                }
            }
            i11 = 0;
            pointF = this.f5990k;
            if (pointF != null) {
                if (i12 > 0) {
                }
                lVar2 = this.c;
                if (lVar2 != null) {
                }
                ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
                if (ceil <= 0) {
                }
            }
            i14 = 0;
            lVar2 = this.c;
            if (lVar2 != null) {
            }
            ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
            if (ceil <= 0) {
            }
        }
        i10 = 0;
        lVar = this.c;
        if (lVar != null) {
            RecyclerView.m mVar3 = (RecyclerView.m) view.getLayoutParams();
            i11 = g((view.getLeft() - RecyclerView.l.F(view)) - ((ViewGroup.MarginLayoutParams) mVar3).leftMargin, RecyclerView.l.M(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) mVar3).rightMargin, lVar.H(), lVar.f5704o - lVar.I(), i10);
            pointF = this.f5990k;
            if (pointF != null) {
            }
            i14 = 0;
            lVar2 = this.c;
            if (lVar2 != null) {
            }
            ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
            if (ceil <= 0) {
            }
        }
        i11 = 0;
        pointF = this.f5990k;
        if (pointF != null) {
        }
        i14 = 0;
        lVar2 = this.c;
        if (lVar2 != null) {
        }
        ceil = (int) Math.ceil(i((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    @SuppressLint({"UnknownNullness"})
    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i10) {
        float abs = Math.abs(i10);
        if (!this.f5992m) {
            this.n = h(this.f5991l);
            this.f5992m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }
}
