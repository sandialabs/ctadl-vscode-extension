package p2;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f16707a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16708b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16709d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16710e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16711f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f16707a = f10;
        this.f16708b = f11;
        this.c = f12;
        this.f16709d = f13;
        this.f16710e = f14;
        this.f16711f = f15;
    }

    public static a a(int i10) {
        float f10;
        float pow;
        l lVar = l.f16740k;
        float B = ma.i.B(Color.red(i10));
        float B2 = ma.i.B(Color.green(i10));
        float B3 = ma.i.B(Color.blue(i10));
        float[][] fArr = ma.i.f16044k;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * B3) + (fArr2[1] * B2) + (fArr2[0] * B);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * B3) + (fArr3[1] * B2) + (fArr3[0] * B);
        float[] fArr4 = fArr[2];
        float f13 = (B3 * fArr4[2]) + (B2 * fArr4[1]) + (B * fArr4[0]);
        float[][] fArr5 = ma.i.f16041h;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = fArr7[1] * f12;
        float f16 = fArr7[2] * f13;
        float[] fArr8 = fArr5[2];
        float f17 = f11 * fArr8[0];
        float f18 = f13 * fArr8[2];
        float[] fArr9 = lVar.f16746g;
        float f19 = fArr9[0] * f14;
        float f20 = fArr9[1] * (f16 + f15 + (fArr7[0] * f11));
        float f21 = fArr9[2] * (f18 + (f12 * fArr8[1]) + f17);
        float abs = Math.abs(f19);
        float f22 = lVar.f16747h;
        float pow2 = (float) Math.pow((abs * f22) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d5 = signum3;
        float f23 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d5)) / 11.0f;
        float f24 = ((float) ((signum + signum2) - (d5 * 2.0d))) / 9.0f;
        float f25 = signum2 * 20.0f;
        float f26 = ((21.0f * signum3) + ((signum * 20.0f) + f25)) / 20.0f;
        float f27 = (((signum * 40.0f) + f25) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f28 = atan2;
        float f29 = (3.1415927f * f28) / 180.0f;
        float f30 = f27 * lVar.f16742b;
        float f31 = lVar.f16741a;
        double d10 = f30 / f31;
        float f32 = lVar.f16749j;
        float f33 = lVar.f16743d;
        float pow5 = ((float) Math.pow(d10, f32 * f33)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f34 = f31 + 4.0f;
        if (f28 < 20.14d) {
            f10 = 360.0f + f28;
        } else {
            f10 = f28;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f16745f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f16744e) * lVar.c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f33) / f34);
        float f35 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((lVar.f16748i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f29;
        return new a(f28, pow6, pow5, f35, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar;
        double d5;
        float f13 = l.f16740k.f16743d;
        Math.sqrt(f10 / 100.0d);
        Math.sqrt(((f11 / ((float) Math.sqrt(d5))) * lVar.f16743d) / (lVar.f16741a + 4.0f));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((lVar.f16748i * f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float f10;
        float[] fArr;
        float f11 = this.f16708b;
        float f12 = this.c;
        if (f11 != 0.0d) {
            double d5 = f12;
            if (d5 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d5 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, lVar.f16745f), 0.73d), 1.1111111111111112d);
                double d10 = (this.f16707a * 3.1415927f) / 180.0f;
                float pow2 = lVar.f16741a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.f16743d) / lVar.f16749j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * lVar.f16744e * lVar.c;
                float f13 = pow2 / lVar.f16742b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f18);
                float f21 = 100.0f / lVar.f16747h;
                float pow3 = signum * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float[] fArr2 = lVar.f16746g;
                float f22 = pow3 / fArr2[0];
                float f23 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f20) * f21) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = ma.i.f16042i;
                float[] fArr4 = fArr3[0];
                float f24 = (fArr4[2] * signum3) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr3[1];
                float f25 = fArr5[1] * f23;
                float f26 = fArr5[2] * signum3;
                float f27 = f22 * fArr3[2][0];
                return q2.a.a(f24, f26 + f25 + (fArr5[0] * f22), (signum3 * fArr[2]) + (f23 * fArr[1]) + f27);
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, lVar.f16745f), 0.73d), 1.1111111111111112d);
        double d102 = (this.f16707a * 3.1415927f) / 180.0f;
        float pow22 = lVar.f16741a * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.f16743d) / lVar.f16749j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * lVar.f16744e * lVar.c;
        float f132 = pow22 / lVar.f16742b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f142 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f182);
        float f212 = 100.0f / lVar.f16747h;
        float pow32 = signum4 * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float[] fArr22 = lVar.f16746g;
        float f222 = pow32 / fArr22[0];
        float f232 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f202) * f212) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = ma.i.f16042i;
        float[] fArr42 = fArr32[0];
        float f242 = (fArr42[2] * signum32) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr32[1];
        float f252 = fArr52[1] * f232;
        float f262 = fArr52[2] * signum32;
        float f272 = f222 * fArr32[2][0];
        return q2.a.a(f242, f262 + f252 + (fArr52[0] * f222), (signum32 * fArr[2]) + (f232 * fArr[1]) + f272);
    }
}
