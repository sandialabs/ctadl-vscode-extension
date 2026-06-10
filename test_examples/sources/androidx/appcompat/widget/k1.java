package androidx.appcompat.widget;

import a3.j0;
import a3.q0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.noto.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s  reason: collision with root package name */
    public static k1 f1004s;

    /* renamed from: t  reason: collision with root package name */
    public static k1 f1005t;

    /* renamed from: i  reason: collision with root package name */
    public final View f1006i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f1007j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1008k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.activity.b f1009l = new androidx.activity.b(4, this);

    /* renamed from: m  reason: collision with root package name */
    public final j1 f1010m = new j1(0, this);
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f1011o;

    /* renamed from: p  reason: collision with root package name */
    public l1 f1012p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1013q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1014r;

    public k1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1006i = view;
        this.f1007j = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = a3.q0.f209a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = q0.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1008k = scaledTouchSlop;
        this.f1014r = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(k1 k1Var) {
        k1 k1Var2 = f1004s;
        if (k1Var2 != null) {
            k1Var2.f1006i.removeCallbacks(k1Var2.f1009l);
        }
        f1004s = k1Var;
        if (k1Var != null) {
            k1Var.f1006i.postDelayed(k1Var.f1009l, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        k1 k1Var = f1005t;
        View view = this.f1006i;
        if (k1Var == this) {
            f1005t = null;
            l1 l1Var = this.f1012p;
            if (l1Var != null) {
                View view2 = l1Var.f1022b;
                if (view2.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) l1Var.f1021a.getSystemService("window")).removeView(view2);
                }
                this.f1012p = null;
                this.f1014r = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1004s == this) {
            b(null);
        }
        view.removeCallbacks(this.f1010m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
        if ((r0 + r2) <= r8.height()) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        long longPressTimeout;
        long j2;
        long j10;
        boolean z12;
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        View view = this.f1006i;
        if (!j0.g.b(view)) {
            return;
        }
        b(null);
        k1 k1Var = f1005t;
        if (k1Var != null) {
            k1Var.a();
        }
        f1005t = this;
        this.f1013q = z10;
        l1 l1Var = new l1(view.getContext());
        this.f1012p = l1Var;
        int i14 = this.n;
        int i15 = this.f1011o;
        boolean z13 = this.f1013q;
        View view2 = l1Var.f1022b;
        if (view2.getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Context context = l1Var.f1021a;
        if (z11) {
            if (view2.getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        l1Var.c.setText(this.f1007j);
        WindowManager.LayoutParams layoutParams = l1Var.f1023d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i15 + dimensionPixelOffset2;
            i10 = i15 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z13) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = l1Var.f1024e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i12 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = l1Var.f1026g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = l1Var.f1025f;
            view.getLocationOnScreen(iArr2);
            int i16 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i16;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i16 + i14) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i17 = iArr2[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z13) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                }
                layoutParams.y = i19;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f1013q) {
            j10 = 2500;
        } else {
            if ((j0.d.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j2 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j2 = 15000;
            }
            j10 = j2 - longPressTimeout;
        }
        j1 j1Var = this.f1010m;
        view.removeCallbacks(j1Var);
        view.postDelayed(j1Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1012p != null && this.f1013q) {
            return false;
        }
        View view2 = this.f1006i;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f1014r = true;
                a();
            }
        } else if (view2.isEnabled() && this.f1012p == null) {
            int x3 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f1014r) {
                int abs = Math.abs(x3 - this.n);
                int i10 = this.f1008k;
                if (abs <= i10 && Math.abs(y10 - this.f1011o) <= i10) {
                    z10 = false;
                    if (z10) {
                        b(this);
                    }
                }
            }
            this.n = x3;
            this.f1011o = y10;
            this.f1014r = false;
            if (z10) {
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.n = view.getWidth() / 2;
        this.f1011o = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
