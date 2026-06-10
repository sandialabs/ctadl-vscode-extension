package h6;

import a3.j0;
import a3.v0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.widget.j1;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f11473e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11474f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f11475g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f11476h;

    /* renamed from: i  reason: collision with root package name */
    public final b f11477i;

    /* renamed from: j  reason: collision with root package name */
    public final c f11478j;

    /* renamed from: k  reason: collision with root package name */
    public final i f11479k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11480l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11481m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public long f11482o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f11483p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f11484q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f11485r;

    public n(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f11477i = new b(1, this);
        this.f11478j = new c(this, 1);
        this.f11479k = new i(this);
        this.f11482o = Long.MAX_VALUE;
        this.f11474f = v5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f11473e = v5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f11475g = v5.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, e5.a.f10647a);
    }

    @Override // h6.o
    public final void a() {
        boolean z10;
        if (this.f11483p.isTouchExplorationEnabled()) {
            if (this.f11476h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f11488d.hasFocus()) {
                this.f11476h.dismissDropDown();
            }
        }
        this.f11476h.post(new j1(7, this));
    }

    @Override // h6.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // h6.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // h6.o
    public final View.OnFocusChangeListener e() {
        return this.f11478j;
    }

    @Override // h6.o
    public final View.OnClickListener f() {
        return this.f11477i;
    }

    @Override // h6.o
    public final b3.d h() {
        return this.f11479k;
    }

    @Override // h6.o
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // h6.o
    public final boolean j() {
        return this.f11480l;
    }

    @Override // h6.o
    public final boolean l() {
        return this.n;
    }

    @Override // h6.o
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f11476h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: h6.k
                /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z10;
                    n nVar = n.this;
                    nVar.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - nVar.f11482o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z10 = false;
                            if (z10) {
                                nVar.f11481m = false;
                            }
                            nVar.u();
                            nVar.f11481m = true;
                            nVar.f11482o = System.currentTimeMillis();
                        }
                        z10 = true;
                        if (z10) {
                        }
                        nVar.u();
                        nVar.f11481m = true;
                        nVar.f11482o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f11476h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: h6.l
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    n nVar = n.this;
                    nVar.f11481m = true;
                    nVar.f11482o = System.currentTimeMillis();
                    nVar.t(false);
                }
            });
            boolean z10 = false;
            this.f11476h.setThreshold(0);
            TextInputLayout textInputLayout = this.f11486a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f11483p.isTouchExplorationEnabled()) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.s(this.f11488d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // h6.o
    public final void n(b3.g gVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f11476h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            gVar.i(Spinner.class.getName());
        }
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6357a;
        if (i10 >= 26) {
            z11 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
            }
            z11 = false;
        }
        if (z11) {
            gVar.n(null);
        }
    }

    @Override // h6.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (accessibilityEvent.getEventType() == 1 && this.f11483p.isEnabled()) {
            if (this.f11476h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                u();
                this.f11481m = true;
                this.f11482o = System.currentTimeMillis();
            }
        }
    }

    @Override // h6.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f11475g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f11474f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h6.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                nVar.getClass();
                nVar.f11488d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f11485r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f11473e);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h6.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                nVar.getClass();
                nVar.f11488d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f11484q = ofFloat2;
        ofFloat2.addListener(new m(this));
        this.f11483p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // h6.o
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f11476h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f11476h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            this.f11485r.cancel();
            this.f11484q.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        boolean z10;
        if (this.f11476h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f11482o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
            if (z10) {
                this.f11481m = false;
            }
            if (this.f11481m) {
                t(!this.n);
                if (this.n) {
                    this.f11476h.requestFocus();
                    this.f11476h.showDropDown();
                    return;
                }
                this.f11476h.dismissDropDown();
                return;
            }
            this.f11481m = false;
            return;
        }
        z10 = true;
        if (z10) {
        }
        if (this.f11481m) {
        }
    }
}
