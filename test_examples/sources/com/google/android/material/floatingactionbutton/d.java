package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import b6.k;
import b6.o;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.R;
import java.util.ArrayList;
import java.util.Iterator;
import r2.a;

/* loaded from: classes.dex */
public class d {
    public static final s3.a C = e5.a.c;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {16842919, 16842910};
    public static final int[] I = {16843623, 16842908, 16842910};
    public static final int[] J = {16842908, 16842910};
    public static final int[] K = {16843623, 16842910};
    public static final int[] L = {16842910};
    public static final int[] M = new int[0];
    public t5.c B;

    /* renamed from: a  reason: collision with root package name */
    public k f7151a;

    /* renamed from: b  reason: collision with root package name */
    public b6.g f7152b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public t5.a f7153d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f7154e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7155f;

    /* renamed from: h  reason: collision with root package name */
    public float f7157h;

    /* renamed from: i  reason: collision with root package name */
    public float f7158i;

    /* renamed from: j  reason: collision with root package name */
    public float f7159j;

    /* renamed from: k  reason: collision with root package name */
    public int f7160k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f7161l;

    /* renamed from: m  reason: collision with root package name */
    public e5.g f7162m;
    public e5.g n;

    /* renamed from: o  reason: collision with root package name */
    public float f7163o;

    /* renamed from: q  reason: collision with root package name */
    public int f7165q;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7167s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7168t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<f> f7169u;

    /* renamed from: v  reason: collision with root package name */
    public final FloatingActionButton f7170v;

    /* renamed from: w  reason: collision with root package name */
    public final a6.b f7171w;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7156g = true;

    /* renamed from: p  reason: collision with root package name */
    public float f7164p = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public int f7166r = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f7172x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f7173y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f7174z = new RectF();
    public final Matrix A = new Matrix();

    /* loaded from: classes.dex */
    public class a extends e5.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            d.this.f7164p = f10;
            float[] fArr = this.f10655a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f10656b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr2[i10];
                float f12 = fArr[i10];
                fArr2[i10] = a4.b.f(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7176a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f7177b;
        public final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f7178d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f7179e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f7180f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f7181g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f7182h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f7176a = f10;
            this.f7177b = f11;
            this.c = f12;
            this.f7178d = f13;
            this.f7179e = f14;
            this.f7180f = f15;
            this.f7181g = f16;
            this.f7182h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f7170v.setAlpha(e5.a.a(this.f7176a, this.f7177b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f7170v;
            float f10 = this.f7178d;
            float f11 = this.c;
            floatingActionButton.setScaleX(((f10 - f11) * floatValue) + f11);
            FloatingActionButton floatingActionButton2 = dVar.f7170v;
            float f12 = this.f7179e;
            floatingActionButton2.setScaleY(((f10 - f12) * floatValue) + f12);
            float f13 = this.f7181g;
            float f14 = this.f7180f;
            dVar.f7164p = a4.b.f(f13, f14, floatValue, f14);
            float f15 = a4.b.f(f13, f14, floatValue, f14);
            Matrix matrix = this.f7182h;
            dVar.a(f15, matrix);
            dVar.f7170v.setImageMatrix(matrix);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(t5.d dVar) {
            super(dVar);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062d extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f7184e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0062d(t5.d dVar) {
            super(dVar);
            this.f7184e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f7184e;
            return dVar.f7157h + dVar.f7158i;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f7185e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t5.d dVar) {
            super(dVar);
            this.f7185e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f7185e;
            return dVar.f7157h + dVar.f7159j;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f7186e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(t5.d dVar) {
            super(dVar);
            this.f7186e = dVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f7186e.f7157h;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7187a;

        /* renamed from: b  reason: collision with root package name */
        public float f7188b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f7189d;

        public i(t5.d dVar) {
            this.f7189d = dVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f10 = (int) this.c;
            b6.g gVar = this.f7189d.f7152b;
            if (gVar != null) {
                gVar.m(f10);
            }
            this.f7187a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            boolean z10 = this.f7187a;
            d dVar = this.f7189d;
            if (!z10) {
                b6.g gVar = dVar.f7152b;
                if (gVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = gVar.f6391i.n;
                }
                this.f7188b = f10;
                this.c = a();
                this.f7187a = true;
            }
            float f11 = this.f7188b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f11)) + f11);
            b6.g gVar2 = dVar.f7152b;
            if (gVar2 != null) {
                gVar2.m(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f7170v = floatingActionButton;
        this.f7171w = bVar;
        u5.g gVar = new u5.g();
        t5.d dVar = (t5.d) this;
        gVar.a(H, d(new e(dVar)));
        gVar.a(I, d(new C0062d(dVar)));
        gVar.a(J, d(new C0062d(dVar)));
        gVar.a(K, d(new C0062d(dVar)));
        gVar.a(L, d(new h(dVar)));
        gVar.a(M, d(new c(dVar)));
        this.f7163o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7170v.getDrawable();
        if (drawable == null || this.f7165q == 0) {
            return;
        }
        RectF rectF = this.f7173y;
        RectF rectF2 = this.f7174z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f7165q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f7165q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final AnimatorSet b(e5.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f7170v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f11);
        gVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new t5.b());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f11);
        gVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new t5.b());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new e5.e(), new a(), new Matrix(matrix));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        a1.c.i1(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f7170v;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f7164p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        a1.c.i1(animatorSet, arrayList);
        animatorSet.setDuration(v5.a.c(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(v5.a.d(floatingActionButton.getContext(), i11, e5.a.f10648b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f7155f ? (this.f7160k - this.f7170v.getSizeDimension()) / 2 : 0;
        float e10 = this.f7156g ? e() + this.f7159j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f7169u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            a.b.h(drawable, y5.b.b(colorStateList));
        }
    }

    public final void n(k kVar) {
        this.f7151a = kVar;
        b6.g gVar = this.f7152b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof o) {
            ((o) drawable).setShapeAppearanceModel(kVar);
        }
        t5.a aVar = this.f7153d;
        if (aVar != null) {
            aVar.f17587o = kVar;
            aVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Drawable drawable;
        Rect rect = this.f7172x;
        f(rect);
        v8.b.m(this.f7154e, "Didn't initialize content background");
        if (o()) {
            drawable = new InsetDrawable((Drawable) this.f7154e, rect.left, rect.top, rect.right, rect.bottom);
        } else {
            drawable = this.f7154e;
        }
        FloatingActionButton.b bVar = (FloatingActionButton.b) this.f7171w;
        bVar.a(drawable);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f7134t.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f7131q;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
