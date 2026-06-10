package f5;

import a3.b1;
import a3.j0;
import a3.k;
import a3.v0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class g extends h<View> {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f10933d;

    /* renamed from: e  reason: collision with root package name */
    public int f10934e;

    /* renamed from: f  reason: collision with root package name */
    public int f10935f;

    public g() {
        this.c = new Rect();
        this.f10933d = new Rect();
        this.f10934e = 0;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f10933d = new Rect();
        this.f10934e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout u10;
        int i13;
        b1 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (u10 = u(coordinatorLayout.e(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.d.b(u10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.c() + lastWindowInsets.f();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int w10 = w(u10) + size;
            int measuredHeight = u10.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                w10 -= measuredHeight;
            }
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = Integer.MIN_VALUE;
            }
            coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec(w10, i13));
            return true;
        }
        return false;
    }

    @Override // f5.h
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        AppBarLayout u10 = u(coordinatorLayout.e(view));
        int i12 = 0;
        if (u10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = u10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, ((u10.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            b1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.d.b(coordinatorLayout) && !j0.d.b(view)) {
                    rect.left = lastWindowInsets.d() + rect.left;
                    rect.right -= lastWindowInsets.e();
                }
            }
            Rect rect2 = this.f10933d;
            int i13 = fVar.c;
            if (i13 == 0) {
                i11 = 8388659;
            } else {
                i11 = i13;
            }
            k.b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f10935f != 0) {
                float v3 = v(u10);
                int i14 = this.f10935f;
                i12 = v8.b.n((int) (v3 * i14), 0, i14);
            }
            view.layout(rect2.left, rect2.top - i12, rect2.right, rect2.bottom - i12);
            i12 = rect2.top - u10.getBottom();
        } else {
            coordinatorLayout.r(view, i10);
        }
        this.f10934e = i12;
    }

    public abstract AppBarLayout u(List list);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}
