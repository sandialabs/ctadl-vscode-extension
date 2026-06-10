package p2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class k {
    public static ColorStateList a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        ColorStateList colorStateList = null;
        if (!f(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 != 2) {
            if (i10 >= 28 && i10 <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal<TypedValue> threadLocal = b.f16712a;
            try {
                colorStateList = b.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e10) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            }
            return colorStateList;
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static c b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        c cVar;
        if (f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new c(null, null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c(null, null, 0);
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !f(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !f(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static String e(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (f(xmlResourceParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
