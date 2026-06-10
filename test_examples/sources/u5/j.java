package u5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.noto.R;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f17821a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f17822b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.A0, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f17822b, "Theme.MaterialComponents");
            }
        }
        c(context, f17821a, "Theme.AppCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.A0, i10, i11);
        boolean z10 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
        } else if (iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
                z10 = true;
            }
            obtainStyledAttributes.recycle();
            if (!z10) {
                return;
            }
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        } else {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            for (int i12 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i12, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z10 = true;
            obtainStyledAttributes.recycle();
            if (!z10) {
            }
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i10)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i10++;
            } else {
                obtainStyledAttributes.recycle();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(a4.b.m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }
}
