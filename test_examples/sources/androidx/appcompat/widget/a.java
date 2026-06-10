package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.noto.R;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public final C0008a f826i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f827j;

    /* renamed from: k  reason: collision with root package name */
    public ActionMenuView f828k;

    /* renamed from: l  reason: collision with root package name */
    public c f829l;

    /* renamed from: m  reason: collision with root package name */
    public int f830m;
    public a3.v0 n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f831o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f832p;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008a implements a3.w0 {

        /* renamed from: b  reason: collision with root package name */
        public boolean f833b = false;
        public int c;

        public C0008a() {
        }

        @Override // a3.w0
        public final void a() {
            if (this.f833b) {
                return;
            }
            a aVar = a.this;
            aVar.n = null;
            a.super.setVisibility(this.c);
        }

        @Override // a3.w0
        public final void d(View view) {
            this.f833b = true;
        }

        @Override // a3.w0
        public final void g() {
            a.super.setVisibility(0);
            this.f833b = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f826i = new C0008a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f827j = context;
        } else {
            this.f827j = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final a3.v0 e(long j2, int i10) {
        a3.v0 v0Var = this.n;
        if (v0Var != null) {
            v0Var.b();
        }
        C0008a c0008a = this.f826i;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a3.v0 a10 = a3.j0.a(this);
            a10.a(1.0f);
            a10.c(j2);
            a.this.n = a10;
            c0008a.c = i10;
            a10.d(c0008a);
            return a10;
        }
        a3.v0 a11 = a3.j0.a(this);
        a11.a(0.0f);
        a11.c(j2);
        a.this.n = a11;
        c0008a.c = i10;
        a11.d(c0008a);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.n != null ? this.f826i.c : getVisibility();
    }

    public int getContentHeight() {
        return this.f830m;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        androidx.appcompat.view.menu.f fVar;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a1.b.f35k, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f829l;
        if (cVar != null) {
            Configuration configuration2 = cVar.f569j.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                    cVar.f869x = i10;
                    fVar = cVar.f570k;
                    if (fVar != null) {
                        fVar.p(true);
                        return;
                    }
                    return;
                }
                i10 = 4;
                cVar.f869x = i10;
                fVar = cVar.f570k;
                if (fVar != null) {
                }
            }
            i10 = 5;
            cVar.f869x = i10;
            fVar = cVar.f570k;
            if (fVar != null) {
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f832p = false;
        }
        if (!this.f832p) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f832p = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f832p = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f831o = false;
        }
        if (!this.f831o) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f831o = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f831o = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f830m = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            a3.v0 v0Var = this.n;
            if (v0Var != null) {
                v0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
