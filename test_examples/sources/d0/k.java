package d0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;
import v0.r;

/* loaded from: classes.dex */
public final class k extends RippleDrawable {

    /* renamed from: m  reason: collision with root package name */
    public static Method f10371m;
    public static boolean n;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10372i;

    /* renamed from: j  reason: collision with root package name */
    public r f10373j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f10374k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10375l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10376a = new a();

        public final void a(RippleDrawable rippleDrawable, int i10) {
            v7.g.f(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i10);
        }
    }

    public k(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f10372i = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f10372i) {
            this.f10375l = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        v7.g.e(dirtyBounds, "super.getDirtyBounds()");
        this.f10375l = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10375l;
    }
}
