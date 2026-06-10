package androidx.compose.ui.graphics.colorspace;

import v8.b;
import w0.c;
import w0.e;
import w0.f;
import w0.g;
import w0.h;
import w0.i;

/* loaded from: classes.dex */
public final class ColorSpaces {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f3096a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f3097b;
    public static final Rgb c;

    /* renamed from: d  reason: collision with root package name */
    public static final Rgb f3098d;

    /* renamed from: e  reason: collision with root package name */
    public static final Rgb f3099e;

    /* renamed from: f  reason: collision with root package name */
    public static final Rgb f3100f;

    /* renamed from: g  reason: collision with root package name */
    public static final Rgb f3101g;

    /* renamed from: h  reason: collision with root package name */
    public static final Rgb f3102h;

    /* renamed from: i  reason: collision with root package name */
    public static final Rgb f3103i;

    /* renamed from: j  reason: collision with root package name */
    public static final Rgb f3104j;

    /* renamed from: k  reason: collision with root package name */
    public static final Rgb f3105k;

    /* renamed from: l  reason: collision with root package name */
    public static final Rgb f3106l;

    /* renamed from: m  reason: collision with root package name */
    public static final Rgb f3107m;
    public static final Rgb n;

    /* renamed from: o  reason: collision with root package name */
    public static final Rgb f3108o;

    /* renamed from: p  reason: collision with root package name */
    public static final Rgb f3109p;

    /* renamed from: q  reason: collision with root package name */
    public static final i f3110q;

    /* renamed from: r  reason: collision with root package name */
    public static final e f3111r;

    /* renamed from: s  reason: collision with root package name */
    public static final Rgb f3112s;

    /* renamed from: t  reason: collision with root package name */
    public static final f f3113t;

    /* renamed from: u  reason: collision with root package name */
    public static final c[] f3114u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f3096a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f3097b = fArr2;
        g gVar = new g(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        g gVar2 = new g(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        h hVar = b.f18177d;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, hVar, gVar, 0);
        c = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, hVar, 1.0d, 0.0f, 1.0f, 1);
        f3098d = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, hVar, null, ColorSpaces$ExtendedSrgb$1.f3115j, ColorSpaces$ExtendedSrgb$2.f3116j, -0.799f, 2.399f, gVar, 2);
        f3099e = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, hVar, 1.0d, -0.5f, 7.499f, 3);
        f3100f = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, hVar, new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f3101g = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, hVar, new g(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f3102h = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new h(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f3103i = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, hVar, gVar, 7);
        f3104j = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, b.f18175a, new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f3105k = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, hVar, new g(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f3106l = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, hVar, 2.2d, 0.0f, 1.0f, 10);
        f3107m = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, b.f18176b, new g(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        n = rgb12;
        h hVar2 = b.c;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, hVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f3108o = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, hVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f3109p = rgb14;
        i iVar = new i();
        f3110q = iVar;
        e eVar = new e();
        f3111r = eVar;
        Rgb rgb15 = new Rgb("None", fArr, hVar, gVar2, 16);
        f3112s = rgb15;
        f fVar = new f();
        f3113t = fVar;
        f3114u = new c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, iVar, eVar, rgb15, fVar};
    }
}
