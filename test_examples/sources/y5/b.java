package y5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.noto.R;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18890a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f18891b = {16842908};
    public static final int[] c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f18892d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18893e = {16842910, 16842919};

    /* renamed from: f  reason: collision with root package name */
    public static final String f18894f = b.class.getSimpleName();

    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i10) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10);
            ColorStateList valueOf = ColorStateList.valueOf(0);
            TypedValue a10 = x5.b.a(context, R.attr.colorControlHighlight);
            if (a10 != null) {
                int i11 = a10.resourceId;
                if (i11 != 0) {
                    colorStateList = n2.a.c(context, i11);
                } else {
                    colorStateList = ColorStateList.valueOf(a10.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                valueOf = colorStateList;
            }
            return new RippleDrawable(valueOf, null, insetDrawable);
        }
    }

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        return q2.a.d(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f18893e, 0)) != 0) {
                Log.w(f18894f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean c(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else {
                if (i10 != 16842908 && i10 != 16842919 && i10 != 16843623) {
                }
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
