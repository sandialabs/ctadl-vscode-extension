package k5;

import a3.j0;
import a3.v0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b6.d;
import b6.g;
import b6.j;
import b6.k;
import com.google.android.material.card.MaterialCardView;
import com.noto.R;
import java.util.WeakHashMap;
import r2.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: y  reason: collision with root package name */
    public static final double f12894y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z  reason: collision with root package name */
    public static final ColorDrawable f12895z;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f12896a;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final g f12898d;

    /* renamed from: e  reason: collision with root package name */
    public int f12899e;

    /* renamed from: f  reason: collision with root package name */
    public int f12900f;

    /* renamed from: g  reason: collision with root package name */
    public int f12901g;

    /* renamed from: h  reason: collision with root package name */
    public int f12902h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f12903i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f12904j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12905k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12906l;

    /* renamed from: m  reason: collision with root package name */
    public k f12907m;
    public ColorStateList n;

    /* renamed from: o  reason: collision with root package name */
    public RippleDrawable f12908o;

    /* renamed from: p  reason: collision with root package name */
    public LayerDrawable f12909p;

    /* renamed from: q  reason: collision with root package name */
    public g f12910q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12912s;

    /* renamed from: t  reason: collision with root package name */
    public ValueAnimator f12913t;

    /* renamed from: u  reason: collision with root package name */
    public final TimeInterpolator f12914u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12915v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12916w;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f12897b = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public boolean f12911r = false;

    /* renamed from: x  reason: collision with root package name */
    public float f12917x = 0.0f;

    static {
        f12895z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f12896a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2132083747);
        this.c = gVar;
        gVar.k(materialCardView.getContext());
        gVar.q();
        k kVar = gVar.f6391i.f6409a;
        kVar.getClass();
        k.a aVar = new k.a(kVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, a1.b.S, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            aVar.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f12898d = new g();
        h(new k(aVar));
        this.f12914u = v5.a.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, e5.a.f10647a);
        this.f12915v = v5.a.c(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f12916w = v5.a.c(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(m0.b bVar, float f10) {
        if (bVar instanceof j) {
            return (float) ((1.0d - f12894y) * f10);
        }
        if (bVar instanceof d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        m0.b bVar = this.f12907m.f6433a;
        g gVar = this.c;
        return Math.max(Math.max(b(bVar, gVar.j()), b(this.f12907m.f6434b, gVar.f6391i.f6409a.f6437f.a(gVar.h()))), Math.max(b(this.f12907m.c, gVar.f6391i.f6409a.f6438g.a(gVar.h())), b(this.f12907m.f6435d, gVar.f6391i.f6409a.f6439h.a(gVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f12908o == null) {
            int[] iArr = y5.b.f18890a;
            this.f12910q = new g(this.f12907m);
            this.f12908o = new RippleDrawable(this.f12905k, null, this.f12910q);
        }
        if (this.f12909p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f12908o, this.f12898d, this.f12904j});
            this.f12909p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f12909p;
    }

    public final b d(Drawable drawable) {
        int i10;
        int i11;
        float f10;
        MaterialCardView materialCardView = this.f12896a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            float f11 = 0.0f;
            if (i()) {
                f10 = a();
            } else {
                f10 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f10);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f11 = a();
            }
            i10 = (int) Math.ceil(maxCardElevation2 + f11);
            i11 = ceil;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new b(drawable, i10, i11, i10, i11);
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        if (this.f12909p != null) {
            MaterialCardView materialCardView = this.f12896a;
            boolean z13 = false;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                float f11 = 0.0f;
                if (i()) {
                    f10 = a();
                } else {
                    f10 = 0.0f;
                }
                i12 = (int) Math.ceil((maxCardElevation + f10) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f11 = a();
                }
                i13 = (int) Math.ceil((maxCardElevation2 + f11) * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i20 = this.f12901g;
            if ((i20 & 8388613) == 8388613) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i14 = ((i10 - this.f12899e) - this.f12900f) - i13;
            } else {
                i14 = this.f12899e;
            }
            if ((i20 & 80) == 80) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i15 = this.f12899e;
            } else {
                i15 = ((i11 - this.f12899e) - this.f12900f) - i12;
            }
            int i21 = i15;
            if ((i20 & 8388613) == 8388613) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i16 = this.f12899e;
            } else {
                i16 = ((i10 - this.f12899e) - this.f12900f) - i13;
            }
            if ((i20 & 80) == 80) {
                z13 = true;
            }
            if (z13) {
                i17 = ((i11 - this.f12899e) - this.f12900f) - i12;
            } else {
                i17 = this.f12899e;
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.e.d(materialCardView) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f12909p.setLayerInset(2, i19, i17, i18, i21);
        }
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        int i10;
        Drawable drawable = this.f12904j;
        if (drawable != null) {
            int i11 = 0;
            float f11 = 0.0f;
            if (z11) {
                if (z10) {
                    f11 = 1.0f;
                }
                if (z10) {
                    f10 = 1.0f - this.f12917x;
                } else {
                    f10 = this.f12917x;
                }
                ValueAnimator valueAnimator = this.f12913t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f12913t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12917x, f11);
                this.f12913t = ofFloat;
                ofFloat.addUpdateListener(new a(0, this));
                this.f12913t.setInterpolator(this.f12914u);
                ValueAnimator valueAnimator2 = this.f12913t;
                if (z10) {
                    i10 = this.f12915v;
                } else {
                    i10 = this.f12916w;
                }
                valueAnimator2.setDuration(i10 * f10);
                this.f12913t.start();
                return;
            }
            if (z10) {
                i11 = 255;
            }
            drawable.setAlpha(i11);
            if (z10) {
                f11 = 1.0f;
            }
            this.f12917x = f11;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = r2.a.g(drawable).mutate();
            this.f12904j = mutate;
            a.b.h(mutate, this.f12906l);
            f(this.f12896a.isChecked(), false);
        } else {
            this.f12904j = f12895z;
        }
        LayerDrawable layerDrawable = this.f12909p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f12904j);
        }
    }

    public final void h(k kVar) {
        this.f12907m = kVar;
        g gVar = this.c;
        gVar.setShapeAppearanceModel(kVar);
        gVar.D = !gVar.l();
        g gVar2 = this.f12898d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f12910q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f12896a;
        if (materialCardView.getPreventCornerOverlap() && this.c.l() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final void j() {
        boolean z10;
        float f10;
        MaterialCardView materialCardView = this.f12896a;
        boolean z11 = true;
        if (materialCardView.getPreventCornerOverlap() && !this.c.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !i()) {
            z11 = false;
        }
        float f11 = 0.0f;
        if (z11) {
            f10 = a();
        } else {
            f10 = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f11 = (float) ((1.0d - f12894y) * materialCardView.getCardViewRadius());
        }
        int i10 = (int) (f10 - f11);
        Rect rect = this.f12897b;
        materialCardView.f16159k.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        o.a.f16156o.G1(materialCardView.f16161m);
    }

    public final void k() {
        boolean z10 = this.f12911r;
        MaterialCardView materialCardView = this.f12896a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.f12903i));
    }
}
