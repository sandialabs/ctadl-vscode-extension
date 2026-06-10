package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1062a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f1063b;
    public b1 c;

    /* renamed from: d  reason: collision with root package name */
    public int f1064d = 0;

    public p(ImageView imageView) {
        this.f1062a = imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        b1 b1Var;
        ImageView imageView = this.f1062a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j0.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i10 <= 21 && i10 == 21) {
                z10 = true;
                if (z10) {
                    if (this.c == null) {
                        this.c = new b1();
                    }
                    b1 b1Var2 = this.c;
                    b1Var2.f859a = null;
                    b1Var2.f861d = false;
                    b1Var2.f860b = null;
                    b1Var2.c = false;
                    ColorStateList a10 = e3.d.a(imageView);
                    if (a10 != null) {
                        b1Var2.f861d = true;
                        b1Var2.f859a = a10;
                    }
                    PorterDuff.Mode b5 = e3.d.b(imageView);
                    if (b5 != null) {
                        b1Var2.c = true;
                        b1Var2.f860b = b5;
                    }
                    if (!b1Var2.f861d && !b1Var2.c) {
                        z11 = false;
                        if (z11) {
                            return;
                        }
                    }
                    k.e(drawable, b1Var2, imageView.getDrawableState());
                    if (z11) {
                    }
                }
                b1Var = this.f1063b;
                if (b1Var == null) {
                    k.e(drawable, b1Var, imageView.getDrawableState());
                    return;
                }
                return;
            }
            z10 = false;
            if (z10) {
            }
            b1Var = this.f1063b;
            if (b1Var == null) {
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int i11;
        ImageView imageView = this.f1062a;
        Context context = imageView.getContext();
        int[] iArr = a1.b.f44p;
        d1 m10 = d1.m(context, attributeSet, iArr, i10);
        a3.j0.o(imageView, imageView.getContext(), iArr, attributeSet, m10.f903b, i10, 0);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (i11 = m10.i(1, -1)) != -1 && (drawable3 = e.a.a(imageView.getContext(), i11)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                j0.a(drawable3);
            }
            if (m10.l(2)) {
                ColorStateList b5 = m10.b(2);
                int i12 = Build.VERSION.SDK_INT;
                e3.d.c(imageView, b5);
                if (i12 == 21 && (drawable2 = imageView.getDrawable()) != null && e3.d.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (m10.l(3)) {
                PorterDuff.Mode d5 = j0.d(m10.h(3, -1), null);
                int i13 = Build.VERSION.SDK_INT;
                e3.d.d(imageView, d5);
                if (i13 == 21 && (drawable = imageView.getDrawable()) != null && e3.d.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        Drawable drawable;
        ImageView imageView = this.f1062a;
        if (i10 != 0) {
            drawable = e.a.a(imageView.getContext(), i10);
            if (drawable != null) {
                j0.a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        a();
    }
}
