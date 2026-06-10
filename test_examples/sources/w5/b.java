package w5;

import a3.j0;
import a3.v0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.noto.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import w5.c;

/* loaded from: classes.dex */
public abstract class b<S extends w5.c> extends ProgressBar {

    /* renamed from: i  reason: collision with root package name */
    public final S f18368i;

    /* renamed from: j  reason: collision with root package name */
    public int f18369j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18370k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18371l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18372m;
    public w5.a n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18373o;

    /* renamed from: p  reason: collision with root package name */
    public int f18374p;

    /* renamed from: q  reason: collision with root package name */
    public final a f18375q;

    /* renamed from: r  reason: collision with root package name */
    public final RunnableC0236b f18376r;

    /* renamed from: s  reason: collision with root package name */
    public final c f18377s;

    /* renamed from: t  reason: collision with root package name */
    public final d f18378t;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b f18379i;

        public a(CircularProgressIndicator circularProgressIndicator) {
            this.f18379i = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f18379i;
            if (bVar.f18372m > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* renamed from: w5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0236b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b f18380i;

        public RunnableC0236b(CircularProgressIndicator circularProgressIndicator) {
            this.f18380i = circularProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f18380i;
            boolean z10 = false;
            ((l) bVar.getCurrentDrawable()).c(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                bVar.setVisibility(4);
            }
            bVar.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class c extends i4.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f18381b;

        public c(CircularProgressIndicator circularProgressIndicator) {
            this.f18381b = circularProgressIndicator;
        }

        @Override // i4.c
        public final void a(Drawable drawable) {
            b bVar = this.f18381b;
            bVar.setIndeterminate(false);
            bVar.a(bVar.f18369j, bVar.f18370k);
        }
    }

    /* loaded from: classes.dex */
    public class d extends i4.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f18382b;

        public d(CircularProgressIndicator circularProgressIndicator) {
            this.f18382b = circularProgressIndicator;
        }

        @Override // i4.c
        public final void a(Drawable drawable) {
            b bVar = this.f18382b;
            if (!bVar.f18373o) {
                bVar.setVisibility(bVar.f18374p);
            }
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132083803), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.f18373o = false;
        this.f18374p = 4;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this;
        this.f18375q = new a(circularProgressIndicator);
        this.f18376r = new RunnableC0236b(circularProgressIndicator);
        this.f18377s = new c(circularProgressIndicator);
        this.f18378t = new d(circularProgressIndicator);
        Context context2 = getContext();
        this.f18368i = new h(context2, attributeSet);
        TypedArray d5 = u5.j.d(context2, attributeSet, a1.b.P, R.attr.circularProgressIndicatorStyle, 2132083754, new int[0]);
        d5.getInt(5, -1);
        this.f18372m = Math.min(d5.getInt(3, -1), 1000);
        d5.recycle();
        this.n = new w5.a();
        this.f18371l = true;
    }

    private m<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f18428t;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().f18409t;
        }
    }

    public final void a(int i10, boolean z10) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f18369j = i10;
                this.f18370k = z10;
                this.f18373o = true;
                if (getIndeterminateDrawable().isVisible()) {
                    w5.a aVar = this.n;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().f18429u.h();
                        return;
                    }
                }
                this.f18377s.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i10);
        if (getProgressDrawable() != null && !z10) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (!j0.g.b(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (true) {
            if (view.getVisibility() != 0) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
        }
        boolean z10 = false;
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f18368i.f18387f;
    }

    @Override // android.widget.ProgressBar
    public n<S> getIndeterminateDrawable() {
        return (n) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f18368i.c;
    }

    @Override // android.widget.ProgressBar
    public i<S> getProgressDrawable() {
        return (i) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f18368i.f18386e;
    }

    public int getTrackColor() {
        return this.f18368i.f18385d;
    }

    public int getTrackCornerRadius() {
        return this.f18368i.f18384b;
    }

    public int getTrackThickness() {
        return this.f18368i.f18383a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18429u.g(this.f18377s);
        }
        i<S> progressDrawable = getProgressDrawable();
        d dVar = this.f18378t;
        if (progressDrawable != null) {
            i<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.n == null) {
                progressDrawable2.n = new ArrayList();
            }
            if (!progressDrawable2.n.contains(dVar)) {
                progressDrawable2.n.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            n<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.n == null) {
                indeterminateDrawable.n = new ArrayList();
            }
            if (!indeterminateDrawable.n.contains(dVar)) {
                indeterminateDrawable.n.add(dVar);
            }
        }
        if (b()) {
            if (this.f18372m > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f18376r);
        removeCallbacks(this.f18375q);
        ((l) getCurrentDrawable()).c(false, false, false);
        n<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.f18378t;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(dVar);
            getIndeterminateDrawable().f18429u.j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        int d5;
        int d10;
        m<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        if (((w5.d) currentDrawingDelegate).d() < 0) {
            d5 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        } else {
            d5 = ((w5.d) currentDrawingDelegate).d() + getPaddingLeft() + getPaddingRight();
        }
        if (((w5.d) currentDrawingDelegate).d() < 0) {
            d10 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        } else {
            d10 = ((w5.d) currentDrawingDelegate).d() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(d5, d10);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f18371l) {
            ((l) getCurrentDrawable()).c(b(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f18371l) {
            ((l) getCurrentDrawable()).c(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(w5.a aVar) {
        this.n = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f18419k = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18419k = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f18368i.f18387f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        l lVar = (l) getCurrentDrawable();
        if (lVar != null) {
            lVar.c(false, false, false);
        }
        super.setIndeterminate(z10);
        l lVar2 = (l) getCurrentDrawable();
        if (lVar2 != null) {
            lVar2.c(b(), false, false);
        }
        if ((lVar2 instanceof n) && b()) {
            ((n) lVar2).f18429u.i();
        }
        this.f18373o = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof n) {
            ((l) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{a1.b.S(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f18368i.c = iArr;
            getIndeterminateDrawable().f18429u.f();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        a(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof i) {
            i iVar = (i) drawable;
            iVar.c(false, false, false);
            super.setProgressDrawable(iVar);
            iVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f18368i.f18386e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f18368i;
        if (s10.f18385d != i10) {
            s10.f18385d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f18368i;
        if (s10.f18384b != i10) {
            s10.f18384b = Math.min(i10, s10.f18383a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f18368i;
        if (s10.f18383a != i10) {
            s10.f18383a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f18374p = i10;
    }
}
