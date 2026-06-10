package y5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b6.g;
import b6.k;
import b6.o;

/* loaded from: classes.dex */
public final class a extends Drawable implements o, r2.b {

    /* renamed from: i  reason: collision with root package name */
    public C0245a f18887i;

    /* renamed from: y5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0245a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final g f18888a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18889b;

        public C0245a(g gVar) {
            this.f18888a = gVar;
            this.f18889b = false;
        }

        public C0245a(C0245a c0245a) {
            this.f18888a = (g) c0245a.f18888a.f6391i.newDrawable();
            this.f18889b = c0245a.f18889b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(new C0245a(this));
        }
    }

    public a(k kVar) {
        this(new C0245a(new g(kVar)));
    }

    public a(C0245a c0245a) {
        this.f18887i = c0245a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0245a c0245a = this.f18887i;
        if (c0245a.f18889b) {
            c0245a.f18888a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f18887i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f18887i.f18888a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f18887i = new C0245a(this.f18887i);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f18887i.f18888a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f18887i.f18888a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c = b.c(iArr);
        C0245a c0245a = this.f18887i;
        if (c0245a.f18889b != c) {
            c0245a.f18889b = c;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f18887i.f18888a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18887i.f18888a.setColorFilter(colorFilter);
    }

    @Override // b6.o
    public final void setShapeAppearanceModel(k kVar) {
        this.f18887i.f18888a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f18887i.f18888a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f18887i.f18888a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f18887i.f18888a.setTintMode(mode);
    }
}
