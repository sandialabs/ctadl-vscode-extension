package q2;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f16875a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f16876b;

        public a(char c, float[] fArr) {
            this.f16875a = c;
            this.f16876b = fArr;
        }

        public a(a aVar) {
            this.f16875a = aVar.f16875a;
            float[] fArr = aVar.f16876b;
            this.f16876b = d.b(fArr, fArr.length);
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d5;
            double d10;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d11 = f10;
            double d12 = f11;
            double d13 = (d12 * sin) + (d11 * cos);
            double d14 = d11;
            double d15 = f14;
            double d16 = d13 / d15;
            double d17 = f15;
            double d18 = ((d12 * cos) + ((-f10) * sin)) / d17;
            double d19 = d12;
            double d20 = f13;
            double d21 = ((d20 * sin) + (f12 * cos)) / d15;
            double d22 = ((d20 * cos) + ((-f12) * sin)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d24 * d24) + (d23 * d23);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d23 * sqrt2;
            double d30 = sqrt2 * d24;
            if (z10 == z11) {
                d5 = d25 - d30;
                d10 = d26 + d29;
            } else {
                d5 = d25 + d30;
                d10 = d26 - d29;
            }
            double atan2 = Math.atan2(d18 - d10, d16 - d5);
            double atan22 = Math.atan2(d22 - d10, d21 - d5) - atan2;
            int i10 = 0;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d31 = d5 * d15;
            double d32 = d10 * d17;
            double d33 = (d31 * cos) - (d32 * sin);
            double d34 = (d32 * cos) + (d31 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d35 = -d15;
            double d36 = d35 * cos2;
            double d37 = d17 * sin2;
            double d38 = (d36 * sin3) - (d37 * cos3);
            double d39 = d35 * sin2;
            double d40 = d17 * cos2;
            double d41 = (cos3 * d40) + (sin3 * d39);
            double d42 = atan22 / ceil;
            double d43 = atan2;
            while (i10 < ceil) {
                double d44 = d43 + d42;
                double sin4 = Math.sin(d44);
                double cos4 = Math.cos(d44);
                double d45 = d42;
                double d46 = (((d15 * cos2) * cos4) + d33) - (d37 * sin4);
                double d47 = d33;
                double d48 = (d40 * sin4) + (d15 * sin2 * cos4) + d34;
                double d49 = (d36 * sin4) - (d37 * cos4);
                double d50 = (cos4 * d40) + (sin4 * d39);
                double d51 = d44 - d43;
                double tan = Math.tan(d51 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d38 * sqrt3) + d14), (float) ((d41 * sqrt3) + d19), (float) (d46 - (sqrt3 * d49)), (float) (d48 - (sqrt3 * d50)), (float) d46, (float) d48);
                i10++;
                d40 = d40;
                d39 = d39;
                ceil = ceil;
                cos2 = cos2;
                d43 = d44;
                d15 = d15;
                d41 = d50;
                d38 = d49;
                d14 = d46;
                d19 = d48;
                d42 = d45;
                d33 = d47;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            char c;
            a aVar;
            int i12;
            boolean z10;
            boolean z11;
            float f10;
            float f11;
            boolean z12;
            boolean z13;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            a[] aVarArr2 = aVarArr;
            float[] fArr = new float[6];
            char c10 = 'm';
            char c11 = 0;
            char c12 = 'm';
            int i13 = 0;
            while (i13 < aVarArr2.length) {
                a aVar2 = aVarArr2[i13];
                char c13 = aVar2.f16875a;
                float f31 = fArr[c11];
                float f32 = fArr[1];
                float f33 = fArr[2];
                float f34 = fArr[3];
                float f35 = fArr[4];
                float f36 = fArr[5];
                switch (c13) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f35, f36);
                        f31 = f35;
                        f33 = f31;
                        f32 = f36;
                        f34 = f32;
                        i10 = 2;
                        break;
                    default:
                        i10 = 2;
                        break;
                }
                float f37 = f35;
                float f38 = f36;
                float f39 = f31;
                float f40 = f32;
                int i14 = 0;
                while (true) {
                    float[] fArr2 = aVar2.f16876b;
                    if (i14 < fArr2.length) {
                        if (c13 != 'A') {
                            if (c13 != 'C') {
                                if (c13 != 'H') {
                                    if (c13 != 'Q') {
                                        if (c13 != 'V') {
                                            if (c13 != 'a') {
                                                if (c13 != 'c') {
                                                    if (c13 != 'h') {
                                                        if (c13 != 'q') {
                                                            if (c13 != 'v') {
                                                                if (c13 != 'L') {
                                                                    if (c13 != 'M') {
                                                                        if (c13 != 'S') {
                                                                            if (c13 != 'T') {
                                                                                if (c13 != 'l') {
                                                                                    if (c13 != c10) {
                                                                                        if (c13 != 's') {
                                                                                            if (c13 == 't') {
                                                                                                if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                                    f30 = 0.0f;
                                                                                                    f29 = 0.0f;
                                                                                                    int i15 = i14 + 0;
                                                                                                    int i16 = i14 + 1;
                                                                                                    path.rQuadTo(f29, f30, fArr2[i15], fArr2[i16]);
                                                                                                    float f41 = f29 + f39;
                                                                                                    float f42 = f30 + f40;
                                                                                                    f39 += fArr2[i15];
                                                                                                    f40 += fArr2[i16];
                                                                                                    f34 = f42;
                                                                                                    f33 = f41;
                                                                                                }
                                                                                                f29 = f39 - f33;
                                                                                                f30 = f40 - f34;
                                                                                                int i152 = i14 + 0;
                                                                                                int i162 = i14 + 1;
                                                                                                path.rQuadTo(f29, f30, fArr2[i152], fArr2[i162]);
                                                                                                float f412 = f29 + f39;
                                                                                                float f422 = f30 + f40;
                                                                                                f39 += fArr2[i152];
                                                                                                f40 += fArr2[i162];
                                                                                                f34 = f422;
                                                                                                f33 = f412;
                                                                                            }
                                                                                            i11 = i14;
                                                                                        } else {
                                                                                            if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                                f27 = 0.0f;
                                                                                                f28 = 0.0f;
                                                                                                int i17 = i14 + 0;
                                                                                                int i18 = i14 + 1;
                                                                                                int i19 = i14 + 2;
                                                                                                int i20 = i14 + 3;
                                                                                                i11 = i14;
                                                                                                f12 = f40;
                                                                                                float f43 = f39;
                                                                                                path.rCubicTo(f28, f27, fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                                                                                f13 = fArr2[i17] + f43;
                                                                                                f14 = fArr2[i18] + f12;
                                                                                                f15 = f43 + fArr2[i19];
                                                                                                f16 = fArr2[i20];
                                                                                            }
                                                                                            float f44 = f39 - f33;
                                                                                            f27 = f40 - f34;
                                                                                            f28 = f44;
                                                                                            int i172 = i14 + 0;
                                                                                            int i182 = i14 + 1;
                                                                                            int i192 = i14 + 2;
                                                                                            int i202 = i14 + 3;
                                                                                            i11 = i14;
                                                                                            f12 = f40;
                                                                                            float f432 = f39;
                                                                                            path.rCubicTo(f28, f27, fArr2[i172], fArr2[i182], fArr2[i192], fArr2[i202]);
                                                                                            f13 = fArr2[i172] + f432;
                                                                                            f14 = fArr2[i182] + f12;
                                                                                            f15 = f432 + fArr2[i192];
                                                                                            f16 = fArr2[i202];
                                                                                        }
                                                                                    } else {
                                                                                        i11 = i14;
                                                                                        float f45 = fArr2[i11 + 0];
                                                                                        f39 += f45;
                                                                                        float f46 = fArr2[i11 + 1];
                                                                                        f40 += f46;
                                                                                        if (i11 > 0) {
                                                                                            path.rLineTo(f45, f46);
                                                                                        } else {
                                                                                            path.rMoveTo(f45, f46);
                                                                                            f38 = f40;
                                                                                            f37 = f39;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i11 = i14;
                                                                                    f19 = f40;
                                                                                    int i21 = i11 + 0;
                                                                                    float f47 = fArr2[i21];
                                                                                    int i22 = i11 + 1;
                                                                                    path.rLineTo(f47, fArr2[i22]);
                                                                                    f39 += fArr2[i21];
                                                                                    f20 = fArr2[i22];
                                                                                }
                                                                            } else {
                                                                                i11 = i14;
                                                                                float f48 = f40;
                                                                                float f49 = f39;
                                                                                if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                    f25 = f49;
                                                                                    f26 = f48;
                                                                                    int i23 = i11 + 0;
                                                                                    int i24 = i11 + 1;
                                                                                    path.quadTo(f25, f26, fArr2[i23], fArr2[i24]);
                                                                                    f34 = f26;
                                                                                    f33 = f25;
                                                                                    c = c13;
                                                                                    aVar = aVar2;
                                                                                    i12 = i13;
                                                                                    f39 = fArr2[i23];
                                                                                    f40 = fArr2[i24];
                                                                                }
                                                                                f25 = (f49 * 2.0f) - f33;
                                                                                f26 = (f48 * 2.0f) - f34;
                                                                                int i232 = i11 + 0;
                                                                                int i242 = i11 + 1;
                                                                                path.quadTo(f25, f26, fArr2[i232], fArr2[i242]);
                                                                                f34 = f26;
                                                                                f33 = f25;
                                                                                c = c13;
                                                                                aVar = aVar2;
                                                                                i12 = i13;
                                                                                f39 = fArr2[i232];
                                                                                f40 = fArr2[i242];
                                                                            }
                                                                        } else {
                                                                            i11 = i14;
                                                                            float f50 = f40;
                                                                            float f51 = f39;
                                                                            if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                f24 = f51;
                                                                                f23 = f50;
                                                                                int i25 = i11 + 0;
                                                                                int i26 = i11 + 1;
                                                                                int i27 = i11 + 2;
                                                                                int i28 = i11 + 3;
                                                                                path.cubicTo(f24, f23, fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                                                                float f52 = fArr2[i25];
                                                                                float f53 = fArr2[i26];
                                                                                f18 = fArr2[i27];
                                                                                f17 = fArr2[i28];
                                                                                f33 = f52;
                                                                                f34 = f53;
                                                                                f39 = f18;
                                                                                f40 = f17;
                                                                            }
                                                                            f23 = (f50 * 2.0f) - f34;
                                                                            f24 = (f51 * 2.0f) - f33;
                                                                            int i252 = i11 + 0;
                                                                            int i262 = i11 + 1;
                                                                            int i272 = i11 + 2;
                                                                            int i282 = i11 + 3;
                                                                            path.cubicTo(f24, f23, fArr2[i252], fArr2[i262], fArr2[i272], fArr2[i282]);
                                                                            float f522 = fArr2[i252];
                                                                            float f532 = fArr2[i262];
                                                                            f18 = fArr2[i272];
                                                                            f17 = fArr2[i282];
                                                                            f33 = f522;
                                                                            f34 = f532;
                                                                            f39 = f18;
                                                                            f40 = f17;
                                                                        }
                                                                    } else {
                                                                        i11 = i14;
                                                                        f21 = fArr2[i11 + 0];
                                                                        f22 = fArr2[i11 + 1];
                                                                        if (i11 > 0) {
                                                                            path.lineTo(f21, f22);
                                                                        } else {
                                                                            path.moveTo(f21, f22);
                                                                            f37 = f21;
                                                                            f38 = f22;
                                                                        }
                                                                    }
                                                                    f39 = f37;
                                                                    f40 = f38;
                                                                } else {
                                                                    i11 = i14;
                                                                    int i29 = i11 + 0;
                                                                    int i30 = i11 + 1;
                                                                    path.lineTo(fArr2[i29], fArr2[i30]);
                                                                    f21 = fArr2[i29];
                                                                    f22 = fArr2[i30];
                                                                }
                                                                f39 = f21;
                                                                f40 = f22;
                                                            } else {
                                                                i11 = i14;
                                                                f19 = f40;
                                                                float f54 = f39;
                                                                int i31 = i11 + 0;
                                                                path.rLineTo(0.0f, fArr2[i31]);
                                                                f20 = fArr2[i31];
                                                            }
                                                            f40 = f19 + f20;
                                                        } else {
                                                            i11 = i14;
                                                            f12 = f40;
                                                            float f55 = f39;
                                                            int i32 = i11 + 0;
                                                            float f56 = fArr2[i32];
                                                            int i33 = i11 + 1;
                                                            int i34 = i11 + 2;
                                                            int i35 = i11 + 3;
                                                            path.rQuadTo(f56, fArr2[i33], fArr2[i34], fArr2[i35]);
                                                            f13 = fArr2[i32] + f55;
                                                            f14 = fArr2[i33] + f12;
                                                            float f57 = f55 + fArr2[i34];
                                                            float f58 = fArr2[i35];
                                                            f15 = f57;
                                                            f16 = f58;
                                                        }
                                                    } else {
                                                        i11 = i14;
                                                        float f59 = f40;
                                                        int i36 = i11 + 0;
                                                        path.rLineTo(fArr2[i36], 0.0f);
                                                        f39 += fArr2[i36];
                                                    }
                                                    c = c13;
                                                    aVar = aVar2;
                                                    i12 = i13;
                                                } else {
                                                    i11 = i14;
                                                    f12 = f40;
                                                    float f60 = f39;
                                                    int i37 = i11 + 2;
                                                    int i38 = i11 + 3;
                                                    int i39 = i11 + 4;
                                                    int i40 = i11 + 5;
                                                    path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                                    f13 = fArr2[i37] + f60;
                                                    f14 = fArr2[i38] + f12;
                                                    f15 = f60 + fArr2[i39];
                                                    f16 = fArr2[i40];
                                                }
                                                f17 = f12 + f16;
                                                f33 = f13;
                                                f34 = f14;
                                                f18 = f15;
                                                f39 = f18;
                                                f40 = f17;
                                                c = c13;
                                                aVar = aVar2;
                                                i12 = i13;
                                            } else {
                                                i11 = i14;
                                                float f61 = f40;
                                                float f62 = f39;
                                                int i41 = i11 + 5;
                                                float f63 = fArr2[i41] + f62;
                                                int i42 = i11 + 6;
                                                float f64 = fArr2[i42] + f61;
                                                float f65 = fArr2[i11 + 0];
                                                float f66 = fArr2[i11 + 1];
                                                float f67 = fArr2[i11 + 2];
                                                if (fArr2[i11 + 3] != 0.0f) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (fArr2[i11 + 4] != 0.0f) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c = c13;
                                                aVar = aVar2;
                                                i12 = i13;
                                                a(path, f62, f61, f63, f64, f65, f66, f67, z12, z13);
                                                f39 = f62 + fArr2[i41];
                                                f40 = f61 + fArr2[i42];
                                            }
                                        } else {
                                            i11 = i14;
                                            c = c13;
                                            aVar = aVar2;
                                            i12 = i13;
                                            int i43 = i11 + 0;
                                            path.lineTo(f39, fArr2[i43]);
                                            f40 = fArr2[i43];
                                        }
                                    } else {
                                        i11 = i14;
                                        c = c13;
                                        aVar = aVar2;
                                        i12 = i13;
                                        int i44 = i11 + 0;
                                        int i45 = i11 + 1;
                                        int i46 = i11 + 2;
                                        int i47 = i11 + 3;
                                        path.quadTo(fArr2[i44], fArr2[i45], fArr2[i46], fArr2[i47]);
                                        f10 = fArr2[i44];
                                        f11 = fArr2[i45];
                                        f39 = fArr2[i46];
                                        f40 = fArr2[i47];
                                    }
                                } else {
                                    i11 = i14;
                                    c = c13;
                                    aVar = aVar2;
                                    i12 = i13;
                                    int i48 = i11 + 0;
                                    path.lineTo(fArr2[i48], f40);
                                    f39 = fArr2[i48];
                                }
                                i14 = i11 + i10;
                                aVar2 = aVar;
                                c12 = c;
                                c13 = c12;
                                i13 = i12;
                                c10 = 'm';
                            } else {
                                i11 = i14;
                                c = c13;
                                aVar = aVar2;
                                i12 = i13;
                                int i49 = i11 + 2;
                                int i50 = i11 + 3;
                                int i51 = i11 + 4;
                                int i52 = i11 + 5;
                                path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i49], fArr2[i50], fArr2[i51], fArr2[i52]);
                                float f68 = fArr2[i51];
                                float f69 = fArr2[i52];
                                f10 = fArr2[i49];
                                f39 = f68;
                                f40 = f69;
                                f11 = fArr2[i50];
                            }
                            f33 = f10;
                            f34 = f11;
                            i14 = i11 + i10;
                            aVar2 = aVar;
                            c12 = c;
                            c13 = c12;
                            i13 = i12;
                            c10 = 'm';
                        } else {
                            i11 = i14;
                            float f70 = f40;
                            float f71 = f39;
                            c = c13;
                            aVar = aVar2;
                            i12 = i13;
                            int i53 = i11 + 5;
                            float f72 = fArr2[i53];
                            int i54 = i11 + 6;
                            float f73 = fArr2[i54];
                            float f74 = fArr2[i11 + 0];
                            float f75 = fArr2[i11 + 1];
                            float f76 = fArr2[i11 + 2];
                            if (fArr2[i11 + 3] != 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fArr2[i11 + 4] != 0.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a(path, f71, f70, f72, f73, f74, f75, f76, z10, z11);
                            f39 = fArr2[i53];
                            f40 = fArr2[i54];
                        }
                        f34 = f40;
                        f33 = f39;
                        i14 = i11 + i10;
                        aVar2 = aVar;
                        c12 = c;
                        c13 = c12;
                        i13 = i12;
                        c10 = 'm';
                    }
                }
                int i55 = i13;
                fArr[0] = f39;
                fArr[1] = f40;
                fArr[2] = f33;
                fArr[3] = f34;
                fArr[4] = f37;
                fArr[5] = f38;
                i13 = i55 + 1;
                c12 = aVarArr[i55].f16875a;
                c10 = 'm';
                c11 = 0;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        int i10;
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        while (i10 < aVarArr.length) {
            a aVar = aVarArr[i10];
            char c = aVar.f16875a;
            a aVar2 = aVarArr2[i10];
            i10 = (c == aVar2.f16875a && aVar.f16876b.length == aVar2.f16876b.length) ? i10 + 1 : 0;
            return false;
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] c(String str) {
        String trim;
        float[] fArr;
        int i10;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char charAt = str.charAt(i12);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i12++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i13, i12).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i11) != 'z' && trim.charAt(i11) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i14 = 0;
                                for (int i15 = 1; i15 < length; i15 = i10) {
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    boolean z13 = false;
                                    i10 = i15;
                                    while (i10 < trim.length()) {
                                        char charAt2 = trim.charAt(i10);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case '-':
                                                        if (i10 != i15) {
                                                        }
                                                        break;
                                                    case '.':
                                                        if (!z12) {
                                                            z12 = true;
                                                            break;
                                                        }
                                                        z11 = true;
                                                        break;
                                                }
                                                z13 = false;
                                                if (!z10) {
                                                }
                                            } else {
                                                z13 = true;
                                                if (!z10) {
                                                    i10++;
                                                } else {
                                                    if (i15 < i10) {
                                                        fArr2[i14] = Float.parseFloat(trim.substring(i15, i10));
                                                        i14++;
                                                    }
                                                    if (z11) {
                                                        i10++;
                                                    }
                                                }
                                            }
                                        }
                                        z10 = true;
                                        z13 = false;
                                        if (!z10) {
                                        }
                                    }
                                    if (i15 < i10) {
                                    }
                                    if (z11) {
                                    }
                                }
                                fArr = b(fArr2, i14);
                                i11 = 0;
                                arrayList.add(new a(trim.charAt(i11), fArr));
                            } catch (NumberFormatException e10) {
                                throw new RuntimeException(a4.b.m("error in parsing \"", trim, "\""), e10);
                            }
                        }
                        fArr = new float[i11];
                        arrayList.add(new a(trim.charAt(i11), fArr));
                    }
                    i13 = i12;
                    i12++;
                    i11 = 0;
                }
                i12++;
            }
            trim = str.substring(i13, i12).trim();
            if (trim.length() > 0) {
            }
            i13 = i12;
            i12++;
            i11 = 0;
        }
        if (i12 - i13 == 1 && i13 < str.length()) {
            arrayList.add(new a(str.charAt(i13), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c = c(str);
        if (c != null) {
            try {
                a.b(c, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException("Error in parsing " + str, e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
