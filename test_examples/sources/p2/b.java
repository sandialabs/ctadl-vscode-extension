package p2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.noto.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16712a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        while (true) {
            next = xmlResourceParser.next();
            if (next == 2 || next == 1) {
                break;
            }
        }
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        Resources resources2;
        boolean z10;
        int color;
        float f10;
        int attributeCount;
        int i10;
        boolean z11;
        int i11;
        int[] iArr;
        int[] iArr2;
        float cbrt;
        float f11;
        int i12;
        int[] iArr3;
        TypedValue typedValue;
        Resources resources3 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (name.equals("selector")) {
            ?? r42 = 1;
            int depth2 = xmlResourceParser.getDepth() + 1;
            int[][] iArr4 = new int[20];
            int[] iArr5 = new int[20];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == r42 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                    int[] iArr6 = a1.c.J;
                    TypedArray obtainAttributes = theme2 == null ? resources3.obtainAttributes(attributeSet2, iArr6) : theme2.obtainStyledAttributes(attributeSet2, iArr6, i13, i13);
                    int resourceId = obtainAttributes.getResourceId(i13, -1);
                    if (resourceId != -1) {
                        ThreadLocal<TypedValue> threadLocal = f16712a;
                        TypedValue typedValue2 = threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources3.getValue(resourceId, typedValue, r42);
                        int i15 = typedValue.type;
                        if (!(i15 >= 28 && i15 <= 31)) {
                            try {
                                color = a(resources3, resources3.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                            }
                            f10 = !obtainAttributes.hasValue(r42) ? obtainAttributes.getFloat(r42, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                            float f12 = obtainAttributes.getFloat((Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? 4 : 2, -1.0f);
                            obtainAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr7 = new int[attributeCount];
                            int i16 = 0;
                            for (i10 = 0; i10 < attributeCount; i10++) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i10);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i17 = i16 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i10, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr7[i16] = attributeNameResource;
                                    i16 = i17;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr7, i16);
                            z11 = f12 < 0.0f && f12 <= 100.0f;
                            if (f10 == 1.0f || z11) {
                                int n = v8.b.n((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                                if (z11) {
                                    i11 = depth2;
                                    iArr = iArr5;
                                    iArr2 = trimStateSet;
                                } else {
                                    a a10 = a.a(color);
                                    l lVar = l.f16740k;
                                    float f13 = a10.f16708b;
                                    if (f13 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
                                        float f14 = a10.f16707a;
                                        float min = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                                        float f15 = f13;
                                        a aVar = null;
                                        boolean z12 = true;
                                        float f16 = 0.0f;
                                        while (true) {
                                            if (Math.abs(f16 - f13) >= 0.4f) {
                                                float f17 = 1000.0f;
                                                float f18 = 1000.0f;
                                                float f19 = 0.0f;
                                                float f20 = 100.0f;
                                                a aVar2 = null;
                                                while (true) {
                                                    if (Math.abs(f19 - f20) <= 0.01f) {
                                                        i11 = depth2;
                                                        iArr = iArr5;
                                                        iArr2 = trimStateSet;
                                                        break;
                                                    }
                                                    float f21 = ((f20 - f19) / 2.0f) + f19;
                                                    int c = a.b(f21, f15, min).c(l.f16740k);
                                                    float B = ma.i.B(Color.red(c));
                                                    float B2 = ma.i.B(Color.green(c));
                                                    float B3 = ma.i.B(Color.blue(c));
                                                    float[] fArr = ma.i.f16044k[1];
                                                    float f22 = ((B3 * fArr[2]) + ((B2 * fArr[1]) + (B * fArr[0]))) / 100.0f;
                                                    if (f22 <= 0.008856452f) {
                                                        cbrt = f22 * 903.2963f;
                                                        iArr = iArr5;
                                                    } else {
                                                        iArr = iArr5;
                                                        cbrt = (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                                    }
                                                    float abs = Math.abs(f12 - cbrt);
                                                    if (abs < 0.2f) {
                                                        a a11 = a.a(c);
                                                        i11 = depth2;
                                                        a b5 = a.b(a11.c, a11.f16708b, min);
                                                        float f23 = a11.f16709d - b5.f16709d;
                                                        f11 = f21;
                                                        float f24 = a11.f16710e - b5.f16710e;
                                                        float f25 = a11.f16711f - b5.f16711f;
                                                        float f26 = f24 * f24;
                                                        iArr2 = trimStateSet;
                                                        float pow = (float) (Math.pow(Math.sqrt((f25 * f25) + f26 + (f23 * f23)), 0.63d) * 1.41d);
                                                        if (pow <= 1.0f) {
                                                            f18 = pow;
                                                            aVar2 = a11;
                                                            f17 = abs;
                                                        }
                                                    } else {
                                                        iArr2 = trimStateSet;
                                                        i11 = depth2;
                                                        f11 = f21;
                                                    }
                                                    if (f17 == 0.0f && f18 == 0.0f) {
                                                        break;
                                                    }
                                                    if (cbrt < f12) {
                                                        f19 = f11;
                                                    } else {
                                                        f20 = f11;
                                                    }
                                                    trimStateSet = iArr2;
                                                    iArr5 = iArr;
                                                    depth2 = i11;
                                                }
                                                a aVar3 = aVar2;
                                                if (!z12) {
                                                    if (aVar3 == null) {
                                                        f13 = f15;
                                                    } else {
                                                        aVar = aVar3;
                                                        f16 = f15;
                                                    }
                                                    f15 = ((f13 - f16) / 2.0f) + f16;
                                                    trimStateSet = iArr2;
                                                    iArr5 = iArr;
                                                    depth2 = i11;
                                                } else if (aVar3 != null) {
                                                    color = aVar3.c(lVar);
                                                    break;
                                                } else {
                                                    f15 = ((f13 - f16) / 2.0f) + f16;
                                                    trimStateSet = iArr2;
                                                    iArr5 = iArr;
                                                    depth2 = i11;
                                                    z12 = false;
                                                }
                                            } else {
                                                i11 = depth2;
                                                iArr = iArr5;
                                                iArr2 = trimStateSet;
                                                if (aVar != null) {
                                                    color = aVar.c(lVar);
                                                }
                                            }
                                        }
                                    }
                                    i11 = depth2;
                                    iArr = iArr5;
                                    iArr2 = trimStateSet;
                                    if (f12 < 1.0f) {
                                        color = -16777216;
                                    } else if (f12 > 99.0f) {
                                        color = -1;
                                    } else {
                                        float f27 = (f12 + 16.0f) / 116.0f;
                                        float f28 = (f12 > 8.0f ? 1 : (f12 == 8.0f ? 0 : -1)) > 0 ? f27 * f27 * f27 : f12 / 903.2963f;
                                        float f29 = f27 * f27 * f27;
                                        boolean z13 = f29 > 0.008856452f;
                                        float f30 = z13 ? f29 : ((f27 * 116.0f) - 16.0f) / 903.2963f;
                                        if (!z13) {
                                            f29 = ((f27 * 116.0f) - 16.0f) / 903.2963f;
                                        }
                                        float[] fArr2 = ma.i.f16043j;
                                        color = q2.a.a(f30 * fArr2[0], f28 * fArr2[1], f29 * fArr2[2]);
                                    }
                                }
                                color = (16777215 & color) | (n << 24);
                            } else {
                                i11 = depth2;
                                iArr = iArr5;
                                iArr2 = trimStateSet;
                            }
                            i12 = i14 + 1;
                            iArr3 = iArr;
                            int i18 = 8;
                            if (i12 > iArr3.length) {
                                int[] iArr8 = new int[i14 <= 4 ? 8 : i14 * 2];
                                System.arraycopy(iArr3, 0, iArr8, 0, i14);
                                iArr3 = iArr8;
                            }
                            iArr3[i14] = color;
                            if (i12 > iArr4.length) {
                                Class<?> componentType = iArr4.getClass().getComponentType();
                                if (i14 > 4) {
                                    i18 = i14 * 2;
                                }
                                ?? r22 = (Object[]) Array.newInstance(componentType, i18);
                                System.arraycopy(iArr4, 0, r22, 0, i14);
                                iArr4 = r22;
                            }
                            iArr4[i14] = iArr2;
                            iArr4 = iArr4;
                            theme2 = theme;
                            i14 = i12;
                            iArr5 = iArr3;
                            depth2 = i11;
                            z10 = true;
                            i13 = 0;
                            resources2 = resources;
                            attributeSet2 = attributeSet;
                            resources3 = resources2;
                            r42 = z10;
                        }
                    }
                    color = obtainAttributes.getColor(i13, -65281);
                    if (!obtainAttributes.hasValue(r42)) {
                    }
                    float f122 = obtainAttributes.getFloat((Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? 4 : 2, -1.0f);
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr72 = new int[attributeCount];
                    int i162 = 0;
                    while (i10 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr72, i162);
                    if (f122 < 0.0f) {
                    }
                    if (f10 == 1.0f) {
                    }
                    int n10 = v8.b.n((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                    if (z11) {
                    }
                    color = (16777215 & color) | (n10 << 24);
                    i12 = i14 + 1;
                    iArr3 = iArr;
                    int i182 = 8;
                    if (i12 > iArr3.length) {
                    }
                    iArr3[i14] = color;
                    if (i12 > iArr4.length) {
                    }
                    iArr4[i14] = iArr2;
                    iArr4 = iArr4;
                    theme2 = theme;
                    i14 = i12;
                    iArr5 = iArr3;
                    depth2 = i11;
                    z10 = true;
                    i13 = 0;
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    resources3 = resources2;
                    r42 = z10;
                }
                resources2 = resources;
                theme2 = theme;
                iArr5 = iArr5;
                depth2 = depth2;
                z10 = true;
                i13 = 0;
                attributeSet2 = attributeSet;
                resources3 = resources2;
                r42 = z10;
            }
            int[] iArr9 = new int[i14];
            int[][] iArr10 = new int[i14];
            System.arraycopy(iArr5, 0, iArr9, 0, i14);
            System.arraycopy(iArr4, 0, iArr10, 0, i14);
            return new ColorStateList(iArr10, iArr9);
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
