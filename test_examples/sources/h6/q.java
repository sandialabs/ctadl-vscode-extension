package h6;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f11489a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11490b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f11491d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f11492e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f11493f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f11494g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f11495h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f11496i;

    /* renamed from: j  reason: collision with root package name */
    public int f11497j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f11498k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f11499l;

    /* renamed from: m  reason: collision with root package name */
    public final float f11500m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f11501o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f11502p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11503q;

    /* renamed from: r  reason: collision with root package name */
    public e0 f11504r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f11505s;

    /* renamed from: t  reason: collision with root package name */
    public int f11506t;

    /* renamed from: u  reason: collision with root package name */
    public int f11507u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f11508v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f11509w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11510x;

    /* renamed from: y  reason: collision with root package name */
    public e0 f11511y;

    /* renamed from: z  reason: collision with root package name */
    public int f11512z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11513a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f11514b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f11515d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f11513a = i10;
            this.f11514b = textView;
            this.c = i11;
            this.f11515d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            e0 e0Var;
            int i10 = this.f11513a;
            q qVar = q.this;
            qVar.n = i10;
            qVar.f11499l = null;
            TextView textView = this.f11514b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && (e0Var = qVar.f11504r) != null) {
                    e0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f11515d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f11515d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11494g = context;
        this.f11495h = textInputLayout;
        this.f11500m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f11489a = v5.a.c(context, R.attr.motionDurationShort4, 217);
        this.f11490b = v5.a.c(context, R.attr.motionDurationMedium4, 167);
        this.c = v5.a.c(context, R.attr.motionDurationShort4, 167);
        this.f11491d = v5.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, e5.a.f10649d);
        LinearInterpolator linearInterpolator = e5.a.f10647a;
        this.f11492e = v5.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f11493f = v5.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TextView textView, int i10) {
        boolean z10;
        if (this.f11496i == null && this.f11498k == null) {
            Context context = this.f11494g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f11496i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f11496i;
            TextInputLayout textInputLayout = this.f11495h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f11498k = new FrameLayout(context);
            this.f11496i.addView(this.f11498k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            z10 = false;
            if (z10) {
                this.f11496i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            } else {
                this.f11498k.setVisibility(0);
                this.f11498k.addView(textView);
            }
            this.f11496i.setVisibility(0);
            this.f11497j++;
        }
        z10 = true;
        if (z10) {
        }
        this.f11496i.setVisibility(0);
        this.f11497j++;
    }

    public final void b() {
        boolean z10;
        LinearLayout linearLayout = this.f11496i;
        TextInputLayout textInputLayout = this.f11495h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f11494g;
            boolean e10 = x5.c.e(context);
            LinearLayout linearLayout2 = this.f11496i;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            int f10 = j0.e.f(editText);
            if (e10) {
                f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (e10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e11 = j0.e.e(editText);
            if (e10) {
                e11 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            j0.e.k(linearLayout2, f10, dimensionPixelSize, e11, 0);
        }
    }

    public final void c() {
        Animator animator = this.f11499l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i10 != i12 && i10 != i11) {
                z11 = false;
                if (!z11) {
                    if (i12 == i10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f10);
                    int i14 = this.c;
                    if (z12) {
                        i13 = this.f11490b;
                    } else {
                        i13 = i14;
                    }
                    ofFloat.setDuration(i13);
                    if (z12) {
                        timeInterpolator = this.f11492e;
                    } else {
                        timeInterpolator = this.f11493f;
                    }
                    ofFloat.setInterpolator(timeInterpolator);
                    if (i10 == i12 && i11 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        ofFloat.setStartDelay(i14);
                    }
                    arrayList.add(ofFloat);
                    if (i12 == i10 && i11 != 0) {
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f11500m, 0.0f);
                        ofFloat2.setDuration(this.f11489a);
                        ofFloat2.setInterpolator(this.f11491d);
                        ofFloat2.setStartDelay(i14);
                        arrayList.add(ofFloat2);
                        return;
                    }
                    return;
                }
                return;
            }
            z11 = true;
            if (!z11) {
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f11511y;
        }
        return this.f11504r;
    }

    public final void f() {
        this.f11502p = null;
        c();
        if (this.n == 1) {
            this.f11501o = (!this.f11510x || TextUtils.isEmpty(this.f11509w)) ? 0 : 2;
        }
        i(this.n, this.f11501o, h(this.f11504r, ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000e, code lost:
        r4 = r2.f11498k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0012, code lost:
        r0 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TextView textView, int i10) {
        ViewGroup viewGroup = this.f11496i;
        if (viewGroup == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        viewGroup.removeView(textView);
        int i11 = this.f11497j - 1;
        this.f11497j = i11;
        LinearLayout linearLayout = this.f11496i;
        if (i11 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        TextInputLayout textInputLayout = this.f11495h;
        if (j0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.f11501o != this.n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11499l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f11510x, this.f11511y, 2, i10, i11);
            d(arrayList, this.f11503q, this.f11504r, 1, i10, i11);
            a1.c.i1(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.n = i11;
        }
        TextInputLayout textInputLayout = this.f11495h;
        textInputLayout.p();
        textInputLayout.s(z10, false);
        textInputLayout.v();
    }
}
