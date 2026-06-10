package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f902a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f903b;
    public TypedValue c;

    public d1(Context context, TypedArray typedArray) {
        this.f902a = context;
        this.f903b = typedArray;
    }

    public static d1 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f903b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList c;
        TypedArray typedArray = this.f903b;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (c = n2.a.c(this.f902a, resourceId)) != null) {
            return c;
        }
        return typedArray.getColorStateList(i10);
    }

    public final int c(int i10, int i11) {
        return this.f903b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f903b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        TypedArray typedArray = this.f903b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : e.a.a(this.f902a, resourceId);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable g10;
        if (this.f903b.hasValue(i10) && (resourceId = this.f903b.getResourceId(i10, 0)) != 0) {
            k a10 = k.a();
            Context context = this.f902a;
            synchronized (a10) {
                g10 = a10.f981a.g(context, resourceId, true);
            }
            return g10;
        }
        return null;
    }

    public final Typeface g(int i10, int i11, c0.a aVar) {
        int resourceId = this.f903b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
        Context context = this.f902a;
        if (context.isRestricted()) {
            return null;
        }
        return p2.f.c(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f903b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f903b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f903b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f903b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f903b.hasValue(i10);
    }

    public final void n() {
        this.f903b.recycle();
    }
}
