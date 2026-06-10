package v0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* loaded from: classes.dex */
public final class j {
    public static final w0.c a(Bitmap bitmap) {
        ColorSpace colorSpace;
        w0.c b5;
        v7.g.f(bitmap, "<this>");
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b5 = b(colorSpace)) == null) {
            float[] fArr = ColorSpaces.f3096a;
            return ColorSpaces.c;
        }
        return b5;
    }

    public static final w0.c b(ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        v7.g.f(colorSpace, "<this>");
        named = ColorSpace.Named.SRGB;
        colorSpace2 = ColorSpace.get(named);
        if (!v7.g.a(colorSpace, colorSpace2)) {
            named2 = ColorSpace.Named.ACES;
            colorSpace3 = ColorSpace.get(named2);
            if (v7.g.a(colorSpace, colorSpace3)) {
                return ColorSpaces.f3108o;
            }
            named3 = ColorSpace.Named.ACESCG;
            colorSpace4 = ColorSpace.get(named3);
            if (v7.g.a(colorSpace, colorSpace4)) {
                return ColorSpaces.f3109p;
            }
            named4 = ColorSpace.Named.ADOBE_RGB;
            colorSpace5 = ColorSpace.get(named4);
            if (v7.g.a(colorSpace, colorSpace5)) {
                return ColorSpaces.f3107m;
            }
            named5 = ColorSpace.Named.BT2020;
            colorSpace6 = ColorSpace.get(named5);
            if (v7.g.a(colorSpace, colorSpace6)) {
                return ColorSpaces.f3102h;
            }
            named6 = ColorSpace.Named.BT709;
            colorSpace7 = ColorSpace.get(named6);
            if (v7.g.a(colorSpace, colorSpace7)) {
                return ColorSpaces.f3101g;
            }
            named7 = ColorSpace.Named.CIE_LAB;
            colorSpace8 = ColorSpace.get(named7);
            if (v7.g.a(colorSpace, colorSpace8)) {
                return ColorSpaces.f3111r;
            }
            named8 = ColorSpace.Named.CIE_XYZ;
            colorSpace9 = ColorSpace.get(named8);
            if (v7.g.a(colorSpace, colorSpace9)) {
                return ColorSpaces.f3110q;
            }
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = ColorSpace.get(named9);
            if (v7.g.a(colorSpace, colorSpace10)) {
                return ColorSpaces.f3103i;
            }
            named10 = ColorSpace.Named.DISPLAY_P3;
            colorSpace11 = ColorSpace.get(named10);
            if (v7.g.a(colorSpace, colorSpace11)) {
                return ColorSpaces.f3104j;
            }
            named11 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace12 = ColorSpace.get(named11);
            if (v7.g.a(colorSpace, colorSpace12)) {
                return ColorSpaces.f3099e;
            }
            named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace13 = ColorSpace.get(named12);
            if (v7.g.a(colorSpace, colorSpace13)) {
                return ColorSpaces.f3100f;
            }
            named13 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace14 = ColorSpace.get(named13);
            if (v7.g.a(colorSpace, colorSpace14)) {
                return ColorSpaces.f3098d;
            }
            named14 = ColorSpace.Named.NTSC_1953;
            colorSpace15 = ColorSpace.get(named14);
            if (v7.g.a(colorSpace, colorSpace15)) {
                return ColorSpaces.f3105k;
            }
            named15 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace16 = ColorSpace.get(named15);
            if (v7.g.a(colorSpace, colorSpace16)) {
                return ColorSpaces.n;
            }
            named16 = ColorSpace.Named.SMPTE_C;
            colorSpace17 = ColorSpace.get(named16);
            if (v7.g.a(colorSpace, colorSpace17)) {
                return ColorSpaces.f3106l;
            }
        }
        return ColorSpaces.c;
    }

    public static final Bitmap c(int i10, int i11, int i12, boolean z10, w0.c cVar) {
        Bitmap createBitmap;
        v7.g.f(cVar, "colorSpace");
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, a1.c.J1(i12), z10, d(cVar));
        v7.g.e(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    public static final ColorSpace d(w0.c cVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        v7.g.f(cVar, "<this>");
        if (v7.g.a(cVar, ColorSpaces.c)) {
            named = ColorSpace.Named.SRGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3108o)) {
            named = ColorSpace.Named.ACES;
        } else if (v7.g.a(cVar, ColorSpaces.f3109p)) {
            named = ColorSpace.Named.ACESCG;
        } else if (v7.g.a(cVar, ColorSpaces.f3107m)) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3102h)) {
            named = ColorSpace.Named.BT2020;
        } else if (v7.g.a(cVar, ColorSpaces.f3101g)) {
            named = ColorSpace.Named.BT709;
        } else if (v7.g.a(cVar, ColorSpaces.f3111r)) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (v7.g.a(cVar, ColorSpaces.f3110q)) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (v7.g.a(cVar, ColorSpaces.f3103i)) {
            named = ColorSpace.Named.DCI_P3;
        } else if (v7.g.a(cVar, ColorSpaces.f3104j)) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (v7.g.a(cVar, ColorSpaces.f3099e)) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3100f)) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3098d)) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3105k)) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (v7.g.a(cVar, ColorSpaces.n)) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (v7.g.a(cVar, ColorSpaces.f3106l)) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        colorSpace = ColorSpace.get(named);
        v7.g.e(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
