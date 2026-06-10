package g5;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b6.g;
import com.noto.R;
import g5.b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import u5.h;
import u5.j;
import x5.d;

/* loaded from: classes.dex */
public final class a extends Drawable implements h.b {

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<Context> f11224i;

    /* renamed from: j  reason: collision with root package name */
    public final g f11225j;

    /* renamed from: k  reason: collision with root package name */
    public final h f11226k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f11227l;

    /* renamed from: m  reason: collision with root package name */
    public final b f11228m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f11229o;

    /* renamed from: p  reason: collision with root package name */
    public int f11230p;

    /* renamed from: q  reason: collision with root package name */
    public float f11231q;

    /* renamed from: r  reason: collision with root package name */
    public float f11232r;

    /* renamed from: s  reason: collision with root package name */
    public float f11233s;

    /* renamed from: t  reason: collision with root package name */
    public WeakReference<View> f11234t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<FrameLayout> f11235u;

    public a(Context context) {
        d dVar;
        Context context2;
        FrameLayout frameLayout;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f11224i = weakReference;
        j.c(context, j.f17822b, "Theme.MaterialComponents");
        this.f11227l = new Rect();
        g gVar = new g();
        this.f11225j = gVar;
        h hVar = new h(this);
        this.f11226k = hVar;
        TextPaint textPaint = hVar.f17815a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && hVar.f17819f != (dVar = new d(context3, 2132083227)) && (context2 = weakReference.get()) != null) {
            hVar.b(dVar, context2);
            g();
        }
        b bVar = new b(context);
        this.f11228m = bVar;
        b.a aVar = bVar.f11237b;
        this.f11230p = ((int) Math.pow(10.0d, aVar.n - 1.0d)) - 1;
        hVar.f17817d = true;
        g();
        invalidateSelf();
        hVar.f17817d = true;
        g();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(aVar.f11241j.intValue());
        if (gVar.f6391i.c != valueOf) {
            gVar.n(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar.f11242k.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f11234t;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f11234t.get();
            WeakReference<FrameLayout> weakReference3 = this.f11235u;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            f(view, frameLayout);
        }
        g();
        setVisible(aVar.f11250t.booleanValue(), false);
    }

    @Override // u5.h.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int d5 = d();
        int i10 = this.f11230p;
        b bVar = this.f11228m;
        if (d5 <= i10) {
            return NumberFormat.getInstance(bVar.f11237b.f11245o).format(d());
        }
        Context context = this.f11224i.get();
        if (context == null) {
            return "";
        }
        return String.format(bVar.f11237b.f11245o, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f11230p), "+");
    }

    public final FrameLayout c() {
        WeakReference<FrameLayout> weakReference = this.f11235u;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int d() {
        if (e()) {
            return this.f11228m.f11237b.f11244m;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f11225j.draw(canvas);
            if (e()) {
                Rect rect = new Rect();
                String b5 = b();
                h hVar = this.f11226k;
                hVar.f17815a.getTextBounds(b5, 0, b5.length(), rect);
                canvas.drawText(b5, this.n, this.f11229o + (rect.height() / 2), hVar.f17815a);
            }
        }
    }

    public final boolean e() {
        if (this.f11228m.f11237b.f11244m != -1) {
            return true;
        }
        return false;
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.f11234t = new WeakReference<>(view);
        this.f11235u = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (a3.j0.e.d(r1) == 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        View view;
        int intValue;
        int i10;
        int i11;
        int intValue2;
        float f10;
        Context context = this.f11224i.get();
        WeakReference<View> weakReference = this.f11234t;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f11227l;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.f11235u;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean e10 = e();
            b bVar = this.f11228m;
            if (e10) {
                intValue = bVar.f11237b.f11254x.intValue();
            } else {
                intValue = bVar.f11237b.f11252v.intValue();
            }
            int intValue3 = bVar.f11237b.f11256z.intValue() + intValue;
            b.a aVar = bVar.f11237b;
            int intValue4 = aVar.f11249s.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                i10 = rect3.top + intValue3;
            } else {
                i10 = rect3.bottom - intValue3;
            }
            this.f11229o = i10;
            int d5 = d();
            float f11 = bVar.f11238d;
            if (d5 <= 9) {
                if (!e()) {
                    f11 = bVar.c;
                }
                this.f11231q = f11;
                this.f11233s = f11;
            } else {
                this.f11231q = f11;
                this.f11233s = f11;
                f11 = (this.f11226k.a(b()) / 2.0f) + bVar.f11239e;
            }
            this.f11232r = f11;
            Resources resources = context.getResources();
            if (e()) {
                i11 = R.dimen.mtrl_badge_text_horizontal_edge_offset;
            } else {
                i11 = R.dimen.mtrl_badge_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i11);
            if (e()) {
                intValue2 = aVar.f11253w.intValue();
            } else {
                intValue2 = aVar.f11251u.intValue();
            }
            int intValue5 = aVar.f11255y.intValue() + intValue2;
            int intValue6 = aVar.f11249s.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.e.d(view) == 0) {
                    f10 = ((rect3.right + this.f11232r) - dimensionPixelSize) - intValue5;
                }
                f10 = (rect3.left - this.f11232r) + dimensionPixelSize + intValue5;
            } else {
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            }
            this.n = f10;
            float f12 = this.f11229o;
            float f13 = this.f11232r;
            float f14 = this.f11233s;
            rect2.set((int) (f10 - f13), (int) (f12 - f14), (int) (f10 + f13), (int) (f12 + f14));
            float f15 = this.f11231q;
            g gVar = this.f11225j;
            gVar.setShapeAppearanceModel(gVar.f6391i.f6409a.e(f15));
            if (!rect.equals(rect2)) {
                gVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11228m.f11237b.f11243l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f11227l.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f11227l.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, u5.h.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f11228m;
        bVar.f11236a.f11243l = i10;
        bVar.f11237b.f11243l = i10;
        this.f11226k.f17815a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
