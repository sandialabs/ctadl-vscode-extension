package androidx.compose.animation.core;

import r.f0;
import r.k;
import r.r;
import r.v;
import r.z;
import v7.g;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: a  reason: collision with root package name */
    public final float f1365a;

    /* renamed from: b  reason: collision with root package name */
    public final v f1366b;

    public c() {
        this(0.0f, 0.0f, 7);
    }

    public c(float f10, float f11, float f12) {
        this.f1365a = f12;
        v vVar = new v();
        if (f10 >= 0.0f) {
            vVar.f17026g = f10;
            vVar.c = false;
            double d5 = vVar.f17022b;
            if (((float) (d5 * d5)) > 0.0f) {
                vVar.f17022b = Math.sqrt(f11);
                vVar.c = false;
                this.f1366b = vVar;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public /* synthetic */ c(float f10, float f11, int i10) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : 0.0f);
    }

    @Override // r.r
    public final float b(long j2, float f10, float f11, float f12) {
        v vVar = this.f1366b;
        vVar.f17021a = f11;
        return Float.intBitsToFloat((int) (vVar.a(f10, f12, j2 / 1000000) >> 32));
    }

    @Override // r.r
    public final float c(long j2, float f10, float f11, float f12) {
        v vVar = this.f1366b;
        vVar.f17021a = f11;
        return Float.intBitsToFloat((int) (vVar.a(f10, f12, j2 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    @Override // r.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f10, float f11, float f12) {
        boolean z10;
        boolean z11;
        boolean z12;
        double d5;
        double d10;
        SpringEstimationKt$estimateCriticallyDamped$fn$1 springEstimationKt$estimateCriticallyDamped$fn$1;
        SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 springEstimationKt$estimateCriticallyDamped$fnPrime$1;
        int i10;
        double d11;
        double d12;
        long j2;
        boolean z13;
        boolean z14;
        double d13;
        double d14;
        SpringEstimationKt$estimateOverDamped$fn$1 springEstimationKt$estimateOverDamped$fn$1;
        double d15;
        double d16;
        double d17;
        boolean z15;
        v vVar = this.f1366b;
        double d18 = vVar.f17022b;
        float f13 = vVar.f17026g;
        float f14 = this.f1365a;
        double d19 = (float) (d18 * d18);
        double d20 = f13;
        double d21 = f12 / f14;
        double d22 = (f10 - f11) / f14;
        double d23 = 1.0f;
        double sqrt = d20 * 2.0d * Math.sqrt(d19);
        double d24 = -sqrt;
        double d25 = (sqrt * sqrt) - (d19 * 4.0d);
        k h02 = a1.c.h0(d25);
        h02.f16999a = (h02.f16999a + d24) / 2.0d;
        h02.f17000b /= 2.0d;
        k h03 = a1.c.h0(d25);
        double d26 = -1;
        h03.f16999a = ((h03.f16999a * d26) + d24) / 2.0d;
        h03.f17000b = (h03.f17000b * d26) / 2.0d;
        int i11 = (d22 > 0.0d ? 1 : (d22 == 0.0d ? 0 : -1));
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (d21 == 0.0d) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                j2 = 0;
                return j2 * 1000000;
            }
        }
        if (i11 < 0) {
            d21 = -d21;
        }
        double abs = Math.abs(d22);
        if (d20 > 1.0d) {
            double d27 = h02.f16999a;
            double d28 = h03.f16999a;
            double d29 = (d27 * abs) - d21;
            double d30 = d27 - d28;
            double d31 = d29 / d30;
            double d32 = abs - d31;
            d12 = Math.log(Math.abs(d23 / d32)) / d27;
            double log = Math.log(Math.abs(d23 / d31)) / d28;
            if (!Double.isInfinite(d12) && !Double.isNaN(d12)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                d12 = log;
            } else {
                if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!(true ^ z14)) {
                    d12 = Math.max(d12, log);
                }
            }
            double d33 = d32 * d27;
            double log2 = Math.log(d33 / ((-d31) * d28)) / (d28 - d27);
            if (!Double.isNaN(log2) && log2 > 0.0d) {
                if (log2 > 0.0d) {
                    d13 = d32;
                    if ((-((Math.exp(log2 * d28) * d31) + (Math.exp(d27 * log2) * d13))) < d23) {
                        if (d31 > 0.0d && d13 < 0.0d) {
                            d17 = d23;
                            d16 = 0.0d;
                        } else {
                            d16 = d12;
                            d17 = d23;
                        }
                        d15 = -d17;
                        d12 = d16;
                        d14 = d15;
                        double d34 = d13;
                        springEstimationKt$estimateOverDamped$fn$1 = new SpringEstimationKt$estimateOverDamped$fn$1(d34, d27, d31, d28, d14);
                        SpringEstimationKt$estimateOverDamped$fnPrime$1 springEstimationKt$estimateOverDamped$fnPrime$1 = new SpringEstimationKt$estimateOverDamped$fnPrime$1(d34, d27, d31, d28);
                        if (Math.abs(((Number) springEstimationKt$estimateOverDamped$fn$1.U(Double.valueOf(d12))).doubleValue()) >= 1.0E-4d) {
                            double d35 = d12;
                            int i12 = 0;
                            double d36 = Double.MAX_VALUE;
                            for (double d37 = 0.001d; d36 > d37 && i12 < 100; d37 = 0.001d) {
                                i12++;
                                double doubleValue = d35 - (((Number) springEstimationKt$estimateOverDamped$fn$1.U(Double.valueOf(d35))).doubleValue() / ((Number) springEstimationKt$estimateOverDamped$fnPrime$1.U(Double.valueOf(d35))).doubleValue());
                                d36 = Math.abs(d35 - doubleValue);
                                d35 = doubleValue;
                            }
                            d12 = d35;
                        }
                    }
                } else {
                    d13 = d32;
                }
                d15 = d23;
                d12 = Math.log((-((d31 * d28) * d28)) / (d33 * d27)) / d30;
                d14 = d15;
                double d342 = d13;
                springEstimationKt$estimateOverDamped$fn$1 = new SpringEstimationKt$estimateOverDamped$fn$1(d342, d27, d31, d28, d14);
                SpringEstimationKt$estimateOverDamped$fnPrime$1 springEstimationKt$estimateOverDamped$fnPrime$12 = new SpringEstimationKt$estimateOverDamped$fnPrime$1(d342, d27, d31, d28);
                if (Math.abs(((Number) springEstimationKt$estimateOverDamped$fn$1.U(Double.valueOf(d12))).doubleValue()) >= 1.0E-4d) {
                }
            }
            d13 = d32;
            d14 = -d23;
            double d3422 = d13;
            springEstimationKt$estimateOverDamped$fn$1 = new SpringEstimationKt$estimateOverDamped$fn$1(d3422, d27, d31, d28, d14);
            SpringEstimationKt$estimateOverDamped$fnPrime$1 springEstimationKt$estimateOverDamped$fnPrime$122 = new SpringEstimationKt$estimateOverDamped$fnPrime$1(d3422, d27, d31, d28);
            if (Math.abs(((Number) springEstimationKt$estimateOverDamped$fn$1.U(Double.valueOf(d12))).doubleValue()) >= 1.0E-4d) {
            }
        } else if (d20 < 1.0d) {
            double d38 = h02.f16999a;
            double d39 = (d21 - (d38 * abs)) / h02.f17000b;
            d12 = Math.log(d23 / Math.sqrt((d39 * d39) + (abs * abs))) / d38;
        } else {
            double d40 = h02.f16999a;
            double d41 = d40 * abs;
            double d42 = d21 - d41;
            double log3 = Math.log(Math.abs(d23 / abs)) / d40;
            double log4 = Math.log(Math.abs(d23 / d42));
            double d43 = log4;
            for (int i13 = 0; i13 < 6; i13++) {
                d43 = log4 - Math.log(Math.abs(d43 / d40));
            }
            double d44 = d43 / d40;
            if (!Double.isInfinite(log3) && !Double.isNaN(log3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                log3 = d44;
            } else {
                if (!Double.isInfinite(d44) && !Double.isNaN(d44)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!(!z12)) {
                    log3 = Math.max(log3, d44);
                }
            }
            double d45 = (-(d41 + d42)) / (d40 * d42);
            if (!Double.isNaN(d45) && d45 > 0.0d) {
                if (d45 > 0.0d) {
                    double d46 = d40 * d45;
                    if ((-((Math.exp(d46) * d45 * d42) + (Math.exp(d46) * abs))) < d23) {
                        if (d42 < 0.0d && abs > 0.0d) {
                            log3 = 0.0d;
                        }
                    }
                }
                d10 = (-(2.0d / d40)) - (abs / d42);
                d5 = d23;
                springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(abs, d42, d40, d5);
                springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d42, d40, abs);
                i10 = 0;
                d11 = Double.MAX_VALUE;
                while (d11 > 0.001d && i10 < 100) {
                    i10++;
                    double doubleValue2 = d10 - (((Number) springEstimationKt$estimateCriticallyDamped$fn$1.U(Double.valueOf(d10))).doubleValue() / ((Number) springEstimationKt$estimateCriticallyDamped$fnPrime$1.U(Double.valueOf(d10))).doubleValue());
                    d11 = Math.abs(d10 - doubleValue2);
                    d10 = doubleValue2;
                }
                d12 = d10;
            }
            d5 = -d23;
            d10 = log3;
            springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(abs, d42, d40, d5);
            springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d42, d40, abs);
            i10 = 0;
            d11 = Double.MAX_VALUE;
            while (d11 > 0.001d) {
                i10++;
                double doubleValue22 = d10 - (((Number) springEstimationKt$estimateCriticallyDamped$fn$1.U(Double.valueOf(d10))).doubleValue() / ((Number) springEstimationKt$estimateCriticallyDamped$fnPrime$1.U(Double.valueOf(d10))).doubleValue());
                d11 = Math.abs(d10 - doubleValue22);
                d10 = doubleValue22;
            }
            d12 = d10;
        }
        j2 = (long) (d12 * 1000.0d);
        return j2 * 1000000;
    }

    @Override // r.r
    public final float e(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // r.d
    /* renamed from: f */
    public final f0 a(z zVar) {
        g.f(zVar, "converter");
        return new f0(this);
    }
}
