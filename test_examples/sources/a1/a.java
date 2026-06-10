package a1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.activity.e;
import org.xmlpull.v1.XmlPullParser;
import p2.k;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParser f15a;

    /* renamed from: b  reason: collision with root package name */
    public int f16b = 0;

    public a(XmlResourceParser xmlResourceParser) {
        this.f15a = xmlResourceParser;
    }

    public final p2.c a(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        p2.c b5 = k.b(typedArray, this.f15a, theme, str, i10);
        f(typedArray.getChangingConfigurations());
        return b5;
    }

    public final float b(TypedArray typedArray, String str, int i10, float f10) {
        float c = k.c(typedArray, this.f15a, str, i10, f10);
        f(typedArray.getChangingConfigurations());
        return c;
    }

    public final int c(TypedArray typedArray, String str, int i10, int i11) {
        int d5 = k.d(typedArray, this.f15a, str, i10, i11);
        f(typedArray.getChangingConfigurations());
        return d5;
    }

    public final String d(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        f(typedArray.getChangingConfigurations());
        return string;
    }

    public final TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray g10 = k.g(resources, theme, attributeSet, iArr);
        g.e(g10, "obtainAttributes(\n      …          attrs\n        )");
        f(g10.getChangingConfigurations());
        return g10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return g.a(this.f15a, aVar.f15a) && this.f16b == aVar.f16b;
        }
        return false;
    }

    public final void f(int i10) {
        this.f16b = i10 | this.f16b;
    }

    public final int hashCode() {
        return (this.f15a.hashCode() * 31) + this.f16b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f15a);
        sb.append(", config=");
        return e.h(sb, this.f16b, ')');
    }
}
