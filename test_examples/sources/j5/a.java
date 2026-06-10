package j5;

import a1.b;
import a3.j0;
import a3.v0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b6.g;
import b6.k;
import b6.o;
import com.google.android.material.button.MaterialButton;
import com.noto.R;
import java.util.WeakHashMap;
import r2.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f12683u;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f12684v;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f12685a;

    /* renamed from: b  reason: collision with root package name */
    public k f12686b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f12687d;

    /* renamed from: e  reason: collision with root package name */
    public int f12688e;

    /* renamed from: f  reason: collision with root package name */
    public int f12689f;

    /* renamed from: g  reason: collision with root package name */
    public int f12690g;

    /* renamed from: h  reason: collision with root package name */
    public int f12691h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f12692i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f12693j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12694k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12695l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f12696m;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12699q;

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f12701s;

    /* renamed from: t  reason: collision with root package name */
    public int f12702t;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12697o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12698p = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12700r = true;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f12683u = true;
        if (i10 > 22) {
            z10 = false;
        }
        f12684v = z10;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f12685a = materialButton;
        this.f12686b = kVar;
    }

    public final o a() {
        LayerDrawable layerDrawable = this.f12701s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (o) (this.f12701s.getNumberOfLayers() > 2 ? this.f12701s.getDrawable(2) : this.f12701s.getDrawable(1));
    }

    public final g b(boolean z10) {
        LayerDrawable layerDrawable = this.f12701s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f12683u ? (LayerDrawable) ((InsetDrawable) this.f12701s.getDrawable(0)).getDrawable() : this.f12701s).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f12686b = kVar;
        if (f12684v && !this.f12697o) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            MaterialButton materialButton = this.f12685a;
            int f10 = j0.e.f(materialButton);
            int paddingTop = materialButton.getPaddingTop();
            int e10 = j0.e.e(materialButton);
            int paddingBottom = materialButton.getPaddingBottom();
            e();
            j0.e.k(materialButton, f10, paddingTop, e10, paddingBottom);
            return;
        }
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        MaterialButton materialButton = this.f12685a;
        int f10 = j0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = j0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f12688e;
        int i13 = this.f12689f;
        this.f12689f = i11;
        this.f12688e = i10;
        if (!this.f12697o) {
            e();
        }
        j0.e.k(materialButton, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        int i10;
        InsetDrawable insetDrawable;
        g gVar = new g(this.f12686b);
        MaterialButton materialButton = this.f12685a;
        gVar.k(materialButton.getContext());
        a.b.h(gVar, this.f12693j);
        PorterDuff.Mode mode = this.f12692i;
        if (mode != null) {
            a.b.i(gVar, mode);
        }
        ColorStateList colorStateList = this.f12694k;
        gVar.f6391i.f6418k = this.f12691h;
        gVar.invalidateSelf();
        gVar.s(colorStateList);
        g gVar2 = new g(this.f12686b);
        gVar2.setTint(0);
        float f10 = this.f12691h;
        if (this.n) {
            i10 = b.T(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        gVar2.f6391i.f6418k = f10;
        gVar2.invalidateSelf();
        gVar2.s(ColorStateList.valueOf(i10));
        if (f12683u) {
            g gVar3 = new g(this.f12686b);
            this.f12696m = gVar3;
            a.b.g(gVar3, -1);
            ?? rippleDrawable = new RippleDrawable(y5.b.b(this.f12695l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.c, this.f12688e, this.f12687d, this.f12689f), this.f12696m);
            this.f12701s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            y5.a aVar = new y5.a(this.f12686b);
            this.f12696m = aVar;
            a.b.h(aVar, y5.b.b(this.f12695l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f12696m});
            this.f12701s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.c, this.f12688e, this.f12687d, this.f12689f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g b5 = b(false);
        if (b5 != null) {
            b5.m(this.f12702t);
            b5.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        g b5 = b(false);
        g b10 = b(true);
        if (b5 != null) {
            ColorStateList colorStateList = this.f12694k;
            b5.f6391i.f6418k = this.f12691h;
            b5.invalidateSelf();
            b5.s(colorStateList);
            if (b10 != null) {
                float f10 = this.f12691h;
                if (this.n) {
                    i10 = b.T(this.f12685a, R.attr.colorSurface);
                }
                b10.f6391i.f6418k = f10;
                b10.invalidateSelf();
                b10.s(ColorStateList.valueOf(i10));
            }
        }
    }
}
