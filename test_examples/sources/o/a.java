package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.noto.R;

/* loaded from: classes.dex */
public class a extends FrameLayout {
    public static final int[] n = {16842801};

    /* renamed from: o  reason: collision with root package name */
    public static final m0.b f16156o = new m0.b();

    /* renamed from: i  reason: collision with root package name */
    public boolean f16157i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16158j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f16159k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f16160l;

    /* renamed from: m  reason: collision with root package name */
    public final C0201a f16161m;

    /* renamed from: o.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0201a implements b {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f16162a;

        public C0201a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            a aVar = a.this;
            aVar.f16160l.set(i10, i11, i12, i13);
            Rect rect = aVar.f16159k;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f16159k = rect;
        this.f16160l = new Rect();
        C0201a c0201a = new C0201a();
        this.f16161m = c0201a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.b.f15891d, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(n);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i11 = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f16157i = obtainStyledAttributes.getBoolean(7, false);
        this.f16158j = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        m0.b bVar = f16156o;
        c cVar = new c(dimension, valueOf);
        c0201a.f16162a = cVar;
        setBackgroundDrawable(cVar);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.k1(c0201a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((c) this.f16161m.f16162a).f16170h;
    }

    public float getCardElevation() {
        return a.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f16159k.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f16159k.left;
    }

    public int getContentPaddingRight() {
        return this.f16159k.right;
    }

    public int getContentPaddingTop() {
        return this.f16159k.top;
    }

    public float getMaxCardElevation() {
        return ((c) this.f16161m.f16162a).f16167e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f16158j;
    }

    public float getRadius() {
        return ((c) this.f16161m.f16162a).f16164a;
    }

    public boolean getUseCompatPadding() {
        return this.f16157i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        c cVar = (c) this.f16161m.f16162a;
        cVar.b(valueOf);
        cVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        a.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f16156o.k1(this.f16161m, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f16158j) {
            this.f16158j = z10;
            m0.b bVar = f16156o;
            C0201a c0201a = this.f16161m;
            bVar.k1(c0201a, ((c) c0201a.f16162a).f16167e);
        }
    }

    public void setRadius(float f10) {
        c cVar = (c) this.f16161m.f16162a;
        if (f10 != cVar.f16164a) {
            cVar.f16164a = f10;
            cVar.c(null);
            cVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f16157i != z10) {
            this.f16157i = z10;
            m0.b bVar = f16156o;
            C0201a c0201a = this.f16161m;
            bVar.k1(c0201a, ((c) c0201a.f16162a).f16167e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c cVar = (c) this.f16161m.f16162a;
        cVar.b(colorStateList);
        cVar.invalidateSelf();
    }
}
