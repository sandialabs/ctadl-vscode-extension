package h6;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.noto.R;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f11459e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11460f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f11461g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f11462h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f11463i;

    /* renamed from: j  reason: collision with root package name */
    public final b f11464j;

    /* renamed from: k  reason: collision with root package name */
    public final c f11465k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f11466l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f11467m;

    public f(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f11464j = new b(0, this);
        this.f11465k = new c(this, 0);
        this.f11459e = v5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f11460f = v5.a.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f11461g = v5.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, e5.a.f10647a);
        this.f11462h = v5.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, e5.a.f10649d);
    }

    @Override // h6.o
    public final void a() {
        if (this.f11487b.f7470x != null) {
            return;
        }
        t(u());
    }

    @Override // h6.o
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // h6.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // h6.o
    public final View.OnFocusChangeListener e() {
        return this.f11465k;
    }

    @Override // h6.o
    public final View.OnClickListener f() {
        return this.f11464j;
    }

    @Override // h6.o
    public final View.OnFocusChangeListener g() {
        return this.f11465k;
    }

    @Override // h6.o
    public final void m(EditText editText) {
        this.f11463i = editText;
        this.f11486a.setEndIconVisible(u());
    }

    @Override // h6.o
    public final void p(boolean z10) {
        if (this.f11487b.f7470x == null) {
            return;
        }
        t(z10);
    }

    @Override // h6.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f11462h);
        ofFloat.setDuration(this.f11460f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h6.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar = f.this;
                fVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = fVar.f11488d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f11461g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f11459e;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new k5.a(1, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11466l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f11466l.addListener(new d(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new k5.a(1, this));
        this.f11467m = ofFloat3;
        ofFloat3.addListener(new e(this));
    }

    @Override // h6.o
    public final void s() {
        EditText editText = this.f11463i;
        if (editText != null) {
            editText.post(new androidx.activity.b(12, this));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f11487b.c() == z10;
        if (z10 && !this.f11466l.isRunning()) {
            this.f11467m.cancel();
            this.f11466l.start();
            if (z11) {
                this.f11466l.end();
            }
        } else if (z10) {
        } else {
            this.f11466l.cancel();
            this.f11467m.start();
            if (z11) {
                this.f11467m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f11463i;
        return editText != null && (editText.hasFocus() || this.f11488d.hasFocus()) && this.f11463i.getText().length() > 0;
    }
}
