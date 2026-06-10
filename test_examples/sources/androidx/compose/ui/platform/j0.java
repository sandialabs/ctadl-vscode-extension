package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.noto.R;

/* loaded from: classes.dex */
public class j0 extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public boolean f3851i;

    public j0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(v0.o oVar, View view, long j2) {
        v7.g.f(oVar, "canvas");
        v7.g.f(view, "view");
        Canvas canvas = v0.d.f18088a;
        super.drawChild(((v0.c) oVar).f18085a, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        v7.g.f(canvas, "canvas");
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                v7.g.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                if (((ViewLayer) childAt).f3774p) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            this.f3851i = true;
            try {
                super.dispatchDraw(canvas);
                this.f3851i = false;
            } catch (Throwable th) {
                this.f3851i = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f3851i) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
