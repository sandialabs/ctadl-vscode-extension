package androidx.compose.ui.graphics.colorspace;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v0.p;
import v7.i;
import w0.b;
import w0.c;
import w0.g;
import w0.h;

/* loaded from: classes.dex */
public final class Rgb extends c {

    /* renamed from: p  reason: collision with root package name */
    public static final l<Double, Double> f3117p = Rgb$Companion$DoubleIdentity$1.f3135j;

    /* renamed from: d  reason: collision with root package name */
    public final h f3118d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3119e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3120f;

    /* renamed from: g  reason: collision with root package name */
    public final g f3121g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f3122h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f3123i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f3124j;

    /* renamed from: k  reason: collision with root package name */
    public final l<Double, Double> f3125k;

    /* renamed from: l  reason: collision with root package name */
    public final l<Double, Double> f3126l;

    /* renamed from: m  reason: collision with root package name */
    public final l<Double, Double> f3127m;
    public final l<Double, Double> n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f3128o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g f3129j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar) {
            super(1);
            this.f3129j = gVar;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double d10;
            double doubleValue = d5.doubleValue();
            g gVar = this.f3129j;
            double d11 = gVar.f18248b;
            double d12 = gVar.f18250e;
            double d13 = gVar.f18249d;
            if (doubleValue >= d12 * d13) {
                d10 = (Math.pow(doubleValue, 1.0d / gVar.f18247a) - gVar.c) / d11;
            } else {
                d10 = doubleValue / d13;
            }
            return Double.valueOf(d10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g f3130j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar) {
            super(1);
            this.f3130j = gVar;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double d10;
            double doubleValue = d5.doubleValue();
            g gVar = this.f3130j;
            double d11 = gVar.f18248b;
            double d12 = gVar.f18250e;
            double d13 = gVar.f18249d;
            if (doubleValue >= d12 * d13) {
                d10 = (Math.pow(doubleValue - gVar.f18251f, 1.0d / gVar.f18247a) - gVar.c) / d11;
            } else {
                d10 = (doubleValue - gVar.f18252g) / d13;
            }
            return Double.valueOf(d10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g f3131j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g gVar) {
            super(1);
            this.f3131j = gVar;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double d10;
            double doubleValue = d5.doubleValue();
            g gVar = this.f3131j;
            double d11 = gVar.f18248b;
            if (doubleValue >= gVar.f18250e) {
                d10 = Math.pow((d11 * doubleValue) + gVar.c, gVar.f18247a);
            } else {
                d10 = doubleValue * gVar.f18249d;
            }
            return Double.valueOf(d10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g f3132j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(g gVar) {
            super(1);
            this.f3132j = gVar;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double d10;
            double doubleValue = d5.doubleValue();
            g gVar = this.f3132j;
            double d11 = gVar.f18248b;
            if (doubleValue >= gVar.f18250e) {
                d10 = Math.pow((d11 * doubleValue) + gVar.c, gVar.f18247a) + gVar.f18251f;
            } else {
                d10 = gVar.f18252g + (gVar.f18249d * doubleValue);
            }
            return Double.valueOf(d10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ double f3133j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(double d5) {
            super(1);
            this.f3133j = d5;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double doubleValue = d5.doubleValue();
            if (doubleValue < 0.0d) {
                doubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(doubleValue, 1.0d / this.f3133j));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements l<Double, Double> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ double f3134j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(double d5) {
            super(1);
            this.f3134j = d5;
        }

        @Override // u7.l
        public final Double U(Double d5) {
            double doubleValue = d5.doubleValue();
            if (doubleValue < 0.0d) {
                doubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(doubleValue, this.f3134j));
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static float a(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        public static boolean b(double d5, l lVar, l lVar2) {
            return Math.abs(((Number) lVar.U(Double.valueOf(d5))).doubleValue() - ((Number) lVar2.U(Double.valueOf(d5))).doubleValue()) <= 0.001d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, h hVar, double d5, float f10, float f11, int i10) {
        this(str, fArr, hVar, null, r3 ? r4 : new AnonymousClass5(d5), r6 == 0 ? r4 : new AnonymousClass6(d5), f10, f11, new g(d5, 1.0d, 0.0d, 0.0d, 0.0d), i10);
        int i11 = (d5 > 1.0d ? 1 : (d5 == 1.0d ? 0 : -1));
        boolean z10 = i11 == 0;
        l<Double, Double> lVar = f3117p;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, h hVar, g gVar, int i10) {
        this(str, fArr, hVar, null, r8, r0, 0.0f, 1.0f, gVar, i10);
        l anonymousClass2;
        l anonymousClass4;
        int i11 = (gVar.f18251f > 0.0d ? 1 : (gVar.f18251f == 0.0d ? 0 : -1));
        boolean z10 = i11 == 0;
        double d5 = gVar.f18252g;
        if (z10) {
            if (d5 == 0.0d) {
                anonymousClass2 = new AnonymousClass1(gVar);
                l lVar = anonymousClass2;
                if (i11 != 0) {
                    if (d5 == 0.0d) {
                        anonymousClass4 = new AnonymousClass3(gVar);
                    }
                }
                anonymousClass4 = new AnonymousClass4(gVar);
            }
        }
        anonymousClass2 = new AnonymousClass2(gVar);
        l lVar2 = anonymousClass2;
        if (i11 != 0) {
        }
        anonymousClass4 = new AnonymousClass4(gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(String str, float[] fArr, h hVar, float[] fArr2, l<? super Double, Double> lVar, l<? super Double, Double> lVar2, float f10, float f11, g gVar, int i10) {
        super(str, b.f18237a, i10);
        boolean z10;
        v7.g.f(str, "name");
        v7.g.f(fArr, "primaries");
        v7.g.f(lVar, "oetf");
        v7.g.f(lVar2, "eotf");
        this.f3118d = hVar;
        this.f3119e = f10;
        this.f3120f = f11;
        this.f3121g = gVar;
        this.f3125k = lVar;
        this.f3126l = new Rgb$oetf$1(this);
        this.f3127m = lVar2;
        this.n = new Rgb$eotf$1(this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        boolean z11 = false;
        if (fArr.length == 9) {
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = f12 + f13 + fArr[2];
            fArr3[0] = f12 / f14;
            fArr3[1] = f13 / f14;
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = f15 + f16 + fArr[5];
            fArr3[2] = f15 / f17;
            fArr3[3] = f16 / f17;
            float f18 = fArr[6];
            float f19 = fArr[7];
            float f20 = f18 + f19 + fArr[8];
            fArr3[4] = f18 / f20;
            fArr3[5] = f19 / f20;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f3122h = fArr3;
        if (fArr2 == null) {
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr3[2];
            float f24 = fArr3[3];
            float f25 = fArr3[4];
            float f26 = fArr3[5];
            float f27 = 1;
            float f28 = (f27 - f21) / f22;
            float f29 = hVar.f18253a;
            float f30 = hVar.f18254b;
            float f31 = f21 / f22;
            float f32 = (f23 / f24) - f31;
            float f33 = (f29 / f30) - f31;
            float f34 = ((f27 - f23) / f24) - f28;
            float f35 = (f25 / f26) - f31;
            float f36 = (((((f27 - f29) / f30) - f28) * f32) - (f33 * f34)) / (((((f27 - f25) / f26) - f28) * f32) - (f34 * f35));
            float f37 = (f33 - (f35 * f36)) / f32;
            float f38 = (1.0f - f37) - f36;
            float f39 = f38 / f22;
            float f40 = f37 / f24;
            float f41 = f36 / f26;
            this.f3123i = new float[]{f39 * f21, f38, ((1.0f - f21) - f22) * f39, f40 * f23, f37, ((1.0f - f23) - f24) * f40, f41 * f25, f36, ((1.0f - f25) - f26) * f41};
        } else if (fArr2.length != 9) {
            throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
        } else {
            this.f3123i = fArr2;
        }
        this.f3124j = p.s(this.f3123i);
        float a10 = a.a(fArr3);
        float[] fArr4 = ColorSpaces.f3096a;
        if (a10 / a.a(ColorSpaces.f3097b) > 0.9f) {
            float[] fArr5 = ColorSpaces.f3096a;
            float f42 = fArr3[0];
            float f43 = fArr5[0];
            float f44 = f42 - f43;
            float f45 = fArr3[1];
            float f46 = fArr5[1];
            float f47 = f45 - f46;
            float f48 = fArr3[2];
            float f49 = fArr5[2];
            float f50 = f48 - f49;
            float f51 = fArr3[3];
            float f52 = fArr5[3];
            float f53 = f51 - f52;
            float f54 = fArr3[4];
            float f55 = fArr5[4];
            float f56 = f54 - f55;
            float f57 = fArr3[5];
            float f58 = fArr5[5];
            float f59 = f57 - f58;
            if (((f46 - f58) * f44) - ((f43 - f55) * f47) >= 0.0f && ((f43 - f49) * f47) - ((f46 - f52) * f44) >= 0.0f && ((f52 - f46) * f50) - ((f49 - f43) * f53) >= 0.0f && ((f49 - f55) * f53) - ((f52 - f58) * f50) >= 0.0f && ((f58 - f52) * f56) - ((f55 - f49) * f59) >= 0.0f && ((f55 - f43) * f59) - ((f58 - f46) * f56) >= 0.0f) {
            }
        }
        if (i10 != 0) {
            float[] fArr6 = ColorSpaces.f3096a;
            if (fArr3 != fArr6) {
                for (int i11 = 0; i11 < 6; i11++) {
                    if (Float.compare(fArr3[i11], fArr6[i11]) != 0 && Math.abs(fArr3[i11] - fArr6[i11]) > 0.001f) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10 && p.i(hVar, v8.b.f18177d)) {
                if (f10 == 0.0f) {
                    if (f11 == 1.0f) {
                        float[] fArr7 = ColorSpaces.f3096a;
                        Rgb rgb = ColorSpaces.c;
                        for (double d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                            if (a.b(d5, lVar, rgb.f3125k) && a.b(d5, lVar2, rgb.f3127m)) {
                            }
                        }
                    }
                }
            }
            this.f3128o = z11;
        }
        z11 = true;
        this.f3128o = z11;
    }

    @Override // w0.c
    public final float[] a(float[] fArr) {
        v7.g.f(fArr, "v");
        p.A(this.f3124j, fArr);
        Rgb$oetf$1 rgb$oetf$1 = (Rgb$oetf$1) this.f3126l;
        fArr[0] = (float) ((Number) rgb$oetf$1.U(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) rgb$oetf$1.U(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) rgb$oetf$1.U(Double.valueOf(fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // w0.c
    public final float b(int i10) {
        return this.f3120f;
    }

    @Override // w0.c
    public final float c(int i10) {
        return this.f3119e;
    }

    @Override // w0.c
    public final boolean d() {
        return this.f3128o;
    }

    @Override // w0.c
    public final float[] e(float[] fArr) {
        Rgb$eotf$1 rgb$eotf$1 = (Rgb$eotf$1) this.n;
        fArr[0] = (float) ((Number) rgb$eotf$1.U(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) rgb$eotf$1.U(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) rgb$eotf$1.U(Double.valueOf(fArr[2]))).doubleValue();
        p.A(this.f3123i, fArr);
        return fArr;
    }

    @Override // w0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v7.g.a(i.a(Rgb.class), i.a(obj.getClass())) && super.equals(obj)) {
            Rgb rgb = (Rgb) obj;
            if (Float.compare(rgb.f3119e, this.f3119e) == 0 && Float.compare(rgb.f3120f, this.f3120f) == 0 && v7.g.a(this.f3118d, rgb.f3118d) && Arrays.equals(this.f3122h, rgb.f3122h)) {
                g gVar = rgb.f3121g;
                g gVar2 = this.f3121g;
                if (gVar2 != null) {
                    return v7.g.a(gVar2, gVar);
                }
                if (gVar == null) {
                    return true;
                }
                if (v7.g.a(this.f3125k, rgb.f3125k)) {
                    return v7.g.a(this.f3127m, rgb.f3127m);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // w0.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f3122h) + ((this.f3118d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        boolean z10 = true;
        float f10 = this.f3119e;
        int floatToIntBits = (hashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f3120f;
        if (f11 != 0.0f) {
            z10 = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z10 ? Float.floatToIntBits(f11) : 0)) * 31;
        g gVar = this.f3121g;
        int hashCode2 = floatToIntBits2 + (gVar != null ? gVar.hashCode() : 0);
        if (gVar == null) {
            return this.f3127m.hashCode() + ((this.f3125k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }
}
