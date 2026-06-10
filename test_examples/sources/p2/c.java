package p2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f16713a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f16714b;
    public int c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f16713a = shader;
        this.f16714b = colorStateList;
        this.c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
        if (r8.size() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
        r0 = new p2.e((java.util.ArrayList) r8, (java.util.ArrayList) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
        if (r19 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
        r0 = new p2.e(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0192, code lost:
        r0 = new p2.e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
        if (r11 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
        if (r11 == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
        r4 = r0.f16724a;
        r0 = r0.f16725b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
        if (r7 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
        if (r7 == 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ab, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, (float) r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01be, code lost:
        r3 = new android.graphics.SweepGradient((float) r7, (float) r9, r0.f16724a, r0.f16725b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d3, code lost:
        if (r8 <= 0.0f) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d5, code lost:
        r1 = r0.f16724a;
        r0 = r0.f16725b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dc, code lost:
        if (r7 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
        if (r7 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e1, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e7, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e9, code lost:
        r3 = new android.graphics.RadialGradient((float) r7, (float) r9, (float) r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0201, code lost:
        return new p2.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0209, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Type inference failed for: r15v2, types: [float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [float, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        int color;
        int color2;
        int color3;
        float f10;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            next = xml.next();
            if (next == 2 || next == 1) {
                break;
            }
        }
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b5 = b.b(resources, xml, asAttributeSet, theme);
                    return new c(null, b5, b5.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray g10 = k.g(resources, theme, asAttributeSet, a1.c.M);
                float c = k.c(g10, xml, "startX", 8, 0.0f);
                float c10 = k.c(g10, xml, "startY", 9, 0.0f);
                float c11 = k.c(g10, xml, "endX", 10, 0.0f);
                k.c(g10, xml, "endY", 11, 0.0f);
                k.c(g10, xml, "centerX", 3, 0.0f);
                k.c(g10, xml, "centerY", 4, 0.0f);
                int d5 = k.d(g10, xml, "type", 2, 0);
                if (!k.f(xml, "startColor")) {
                    color = 0;
                } else {
                    color = g10.getColor(0, 0);
                }
                boolean f11 = k.f(xml, "centerColor");
                if (!k.f(xml, "centerColor")) {
                    color2 = 0;
                } else {
                    color2 = g10.getColor(7, 0);
                }
                if (!k.f(xml, "endColor")) {
                    color3 = 0;
                } else {
                    color3 = g10.getColor(1, 0);
                }
                int d10 = k.d(g10, xml, "tileMode", 6, 0);
                k.c(g10, xml, "gradientRadius", 5, 0.0f);
                g10.recycle();
                int depth = xml.getDepth() + 1;
                ?? arrayList = new ArrayList(20);
                ?? arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    float f12 = c11;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f10 = c10;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                            TypedArray g11 = k.g(resources, theme, asAttributeSet, a1.c.N);
                            boolean hasValue = g11.hasValue(0);
                            boolean hasValue2 = g11.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color4 = g11.getColor(0, 0);
                            float f13 = g11.getFloat(1, 0.0f);
                            g11.recycle();
                            arrayList2.add(Integer.valueOf(color4));
                            arrayList.add(Float.valueOf(f13));
                        }
                        c11 = f12;
                        c10 = f10;
                    } else {
                        f10 = c10;
                        break;
                    }
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f16713a == null && (colorStateList = this.f16714b) != null && colorStateList.isStateful();
    }
}
