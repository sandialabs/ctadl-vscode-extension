package z0;

import java.util.ArrayList;
import java.util.List;
import v0.z;
import z0.d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f19062a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final a f19063b = new a(0);
    public final a c = new a(0);

    /* renamed from: d  reason: collision with root package name */
    public final a f19064d = new a(0);

    /* renamed from: e  reason: collision with root package name */
    public final a f19065e = new a(0);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public float f19066a;

        /* renamed from: b  reason: collision with root package name */
        public float f19067b;

        public a() {
            this(0);
        }

        public a(int i10) {
            this.f19066a = 0.0f;
            this.f19067b = 0.0f;
        }

        public final void a() {
            this.f19066a = 0.0f;
            this.f19067b = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(Float.valueOf(this.f19066a), Float.valueOf(aVar.f19066a)) && v7.g.a(Float.valueOf(this.f19067b), Float.valueOf(aVar.f19067b));
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f19067b) + (Float.floatToIntBits(this.f19066a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PathPoint(x=");
            sb.append(this.f19066a);
            sb.append(", y=");
            return a4.b.n(sb, this.f19067b, ')');
        }
    }

    public static void b(z zVar, double d5, double d10, double d11, double d12, double d13, double d14, double d15, boolean z10, boolean z11) {
        double d16;
        double d17;
        double d18 = d13;
        double d19 = (d15 / 180) * 3.141592653589793d;
        double cos = Math.cos(d19);
        double sin = Math.sin(d19);
        double d20 = ((d10 * sin) + (d5 * cos)) / d18;
        double d21 = ((d10 * cos) + ((-d5) * sin)) / d14;
        double d22 = ((d12 * sin) + (d11 * cos)) / d18;
        double d23 = ((d12 * cos) + ((-d11) * sin)) / d14;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d25 * d25) + (d24 * d24);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(zVar, d5, d10, d11, d12, d18 * sqrt, d14 * sqrt, d15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d30);
        double d31 = d24 * sqrt2;
        double d32 = sqrt2 * d25;
        if (z10 == z11) {
            d16 = d27 - d32;
            d17 = d28 + d31;
        } else {
            d16 = d27 + d32;
            d17 = d28 - d31;
        }
        double atan2 = Math.atan2(d21 - d17, d20 - d16);
        double atan22 = Math.atan2(d23 - d17, d22 - d16) - atan2;
        int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z11 != (i10 >= 0)) {
            atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d33 = d16 * d18;
        double d34 = d17 * d14;
        double d35 = (d33 * cos) - (d34 * sin);
        double d36 = (d34 * cos) + (d33 * sin);
        double d37 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d37) / 3.141592653589793d));
        double cos2 = Math.cos(d19);
        double sin2 = Math.sin(d19);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d38 = -d18;
        double d39 = d38 * cos2;
        double d40 = d14 * sin2;
        double d41 = d38 * sin2;
        double d42 = d14 * cos2;
        double d43 = atan22 / ceil;
        double d44 = d5;
        double d45 = d10;
        double d46 = (d39 * sin3) - (d40 * cos3);
        double d47 = (cos3 * d42) + (sin3 * d41);
        int i11 = 0;
        double d48 = atan2;
        while (i11 < ceil) {
            double d49 = d48 + d43;
            double sin4 = Math.sin(d49);
            double cos4 = Math.cos(d49);
            double d50 = d43;
            double d51 = (((d18 * cos2) * cos4) + d35) - (d40 * sin4);
            int i12 = ceil;
            double d52 = (d42 * sin4) + (d18 * sin2 * cos4) + d36;
            double d53 = (d39 * sin4) - (d40 * cos4);
            double d54 = (cos4 * d42) + (sin4 * d41);
            double d55 = d49 - d48;
            double tan = Math.tan(d55 / d26);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d37) - 1) * Math.sin(d55)) / 3;
            zVar.d((float) ((d46 * sqrt3) + d44), (float) ((d47 * sqrt3) + d45), (float) (d51 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d51, (float) d52);
            i11++;
            d41 = d41;
            sin2 = sin2;
            d35 = d35;
            d44 = d51;
            d45 = d52;
            d48 = d49;
            d47 = d54;
            d46 = d53;
            ceil = i12;
            d43 = d50;
            d18 = d13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(char c, float[] fArr) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        char c10;
        boolean z12;
        boolean z13;
        char c11;
        boolean z14;
        ArrayList arrayList2;
        List list;
        d dVar;
        ArrayList arrayList3 = this.f19062a;
        if (c != 'z' && c != 'Z') {
            z10 = false;
            if (!z10) {
                list = a1.c.N0(d.b.c);
            } else {
                char c12 = 2;
                if (c == 'm') {
                    b8.g C1 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(n7.l.Z1(C1, 10));
                    b8.h it = C1.iterator();
                    while (it.f6502k) {
                        int nextInt = it.nextInt();
                        float[] e22 = n7.i.e2(fArr, nextInt, nextInt + 2);
                        float f10 = e22[0];
                        float f11 = e22[1];
                        d nVar = new d.n(f10, f11);
                        if ((nVar instanceof d.f) && nextInt > 0) {
                            nVar = new d.e(f10, f11);
                        } else if (nextInt > 0) {
                            nVar = new d.m(f10, f11);
                        }
                        arrayList2.add(nVar);
                    }
                } else if (c == 'M') {
                    b8.g C12 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(n7.l.Z1(C12, 10));
                    b8.h it2 = C12.iterator();
                    while (it2.f6502k) {
                        int nextInt2 = it2.nextInt();
                        float[] e23 = n7.i.e2(fArr, nextInt2, nextInt2 + 2);
                        float f12 = e23[0];
                        float f13 = e23[1];
                        d fVar = new d.f(f12, f13);
                        if (nextInt2 > 0) {
                            fVar = new d.e(f12, f13);
                        } else if ((fVar instanceof d.n) && nextInt2 > 0) {
                            fVar = new d.m(f12, f13);
                        }
                        arrayList2.add(fVar);
                    }
                } else if (c == 'l') {
                    b8.g C13 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(n7.l.Z1(C13, 10));
                    b8.h it3 = C13.iterator();
                    while (it3.f6502k) {
                        int nextInt3 = it3.nextInt();
                        float[] e24 = n7.i.e2(fArr, nextInt3, nextInt3 + 2);
                        float f14 = e24[0];
                        float f15 = e24[1];
                        d mVar = new d.m(f14, f15);
                        if ((mVar instanceof d.f) && nextInt3 > 0) {
                            mVar = new d.e(f14, f15);
                        } else if ((mVar instanceof d.n) && nextInt3 > 0) {
                            mVar = new d.m(f14, f15);
                        }
                        arrayList2.add(mVar);
                    }
                } else if (c == 'L') {
                    b8.g C14 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(n7.l.Z1(C14, 10));
                    b8.h it4 = C14.iterator();
                    while (it4.f6502k) {
                        int nextInt4 = it4.nextInt();
                        float[] e25 = n7.i.e2(fArr, nextInt4, nextInt4 + 2);
                        float f16 = e25[0];
                        float f17 = e25[1];
                        d eVar = new d.e(f16, f17);
                        if ((eVar instanceof d.f) && nextInt4 > 0) {
                            eVar = new d.e(f16, f17);
                        } else if ((eVar instanceof d.n) && nextInt4 > 0) {
                            eVar = new d.m(f16, f17);
                        }
                        arrayList2.add(eVar);
                    }
                } else if (c == 'h') {
                    b8.g C15 = a1.c.C1(new b8.i(0, fArr.length - 1), 1);
                    arrayList2 = new ArrayList(n7.l.Z1(C15, 10));
                    b8.h it5 = C15.iterator();
                    while (it5.f6502k) {
                        int nextInt5 = it5.nextInt();
                        float[] e26 = n7.i.e2(fArr, nextInt5, nextInt5 + 1);
                        float f18 = e26[0];
                        d lVar = new d.l(f18);
                        if ((lVar instanceof d.f) && nextInt5 > 0) {
                            lVar = new d.e(f18, e26[1]);
                        } else if ((lVar instanceof d.n) && nextInt5 > 0) {
                            lVar = new d.m(f18, e26[1]);
                        }
                        arrayList2.add(lVar);
                    }
                } else if (c == 'H') {
                    b8.g C16 = a1.c.C1(new b8.i(0, fArr.length - 1), 1);
                    arrayList2 = new ArrayList(n7.l.Z1(C16, 10));
                    b8.h it6 = C16.iterator();
                    while (it6.f6502k) {
                        int nextInt6 = it6.nextInt();
                        float[] e27 = n7.i.e2(fArr, nextInt6, nextInt6 + 1);
                        float f19 = e27[0];
                        d c0248d = new d.C0248d(f19);
                        if ((c0248d instanceof d.f) && nextInt6 > 0) {
                            c0248d = new d.e(f19, e27[1]);
                        } else if ((c0248d instanceof d.n) && nextInt6 > 0) {
                            c0248d = new d.m(f19, e27[1]);
                        }
                        arrayList2.add(c0248d);
                    }
                } else if (c == 'v') {
                    b8.g C17 = a1.c.C1(new b8.i(0, fArr.length - 1), 1);
                    arrayList2 = new ArrayList(n7.l.Z1(C17, 10));
                    b8.h it7 = C17.iterator();
                    while (it7.f6502k) {
                        int nextInt7 = it7.nextInt();
                        float[] e28 = n7.i.e2(fArr, nextInt7, nextInt7 + 1);
                        float f20 = e28[0];
                        d rVar = new d.r(f20);
                        if ((rVar instanceof d.f) && nextInt7 > 0) {
                            rVar = new d.e(f20, e28[1]);
                        } else if ((rVar instanceof d.n) && nextInt7 > 0) {
                            rVar = new d.m(f20, e28[1]);
                        }
                        arrayList2.add(rVar);
                    }
                } else if (c == 'V') {
                    b8.g C18 = a1.c.C1(new b8.i(0, fArr.length - 1), 1);
                    arrayList2 = new ArrayList(n7.l.Z1(C18, 10));
                    b8.h it8 = C18.iterator();
                    while (it8.f6502k) {
                        int nextInt8 = it8.nextInt();
                        float[] e29 = n7.i.e2(fArr, nextInt8, nextInt8 + 1);
                        float f21 = e29[0];
                        d sVar = new d.s(f21);
                        if ((sVar instanceof d.f) && nextInt8 > 0) {
                            sVar = new d.e(f21, e29[1]);
                        } else if ((sVar instanceof d.n) && nextInt8 > 0) {
                            sVar = new d.m(f21, e29[1]);
                        }
                        arrayList2.add(sVar);
                    }
                } else {
                    char c13 = 5;
                    char c14 = 3;
                    if (c == 'c') {
                        b8.g C19 = a1.c.C1(new b8.i(0, fArr.length - 6), 6);
                        arrayList = new ArrayList(n7.l.Z1(C19, 10));
                        b8.h it9 = C19.iterator();
                        while (it9.f6502k) {
                            int nextInt9 = it9.nextInt();
                            float[] e210 = n7.i.e2(fArr, nextInt9, nextInt9 + 6);
                            float f22 = e210[0];
                            float f23 = e210[1];
                            d kVar = new d.k(f22, f23, e210[2], e210[3], e210[4], e210[c13]);
                            if ((kVar instanceof d.f) && nextInt9 > 0) {
                                dVar = new d.e(f22, f23);
                            } else if ((kVar instanceof d.n) && nextInt9 > 0) {
                                dVar = new d.m(f22, f23);
                            } else {
                                dVar = kVar;
                            }
                            arrayList.add(dVar);
                            c13 = 5;
                        }
                    } else if (c == 'C') {
                        b8.g C110 = a1.c.C1(new b8.i(0, fArr.length - 6), 6);
                        arrayList = new ArrayList(n7.l.Z1(C110, 10));
                        b8.h it10 = C110.iterator();
                        while (it10.f6502k) {
                            int nextInt10 = it10.nextInt();
                            float[] e211 = n7.i.e2(fArr, nextInt10, nextInt10 + 6);
                            float f24 = e211[0];
                            float f25 = e211[1];
                            d cVar = new d.c(f24, f25, e211[2], e211[c14], e211[4], e211[5]);
                            if ((cVar instanceof d.f) && nextInt10 > 0) {
                                cVar = new d.e(f24, f25);
                            } else if ((cVar instanceof d.n) && nextInt10 > 0) {
                                cVar = new d.m(f24, f25);
                            }
                            arrayList.add(cVar);
                            c14 = 3;
                        }
                    } else if (c == 's') {
                        b8.g C111 = a1.c.C1(new b8.i(0, fArr.length - 4), 4);
                        arrayList = new ArrayList(n7.l.Z1(C111, 10));
                        b8.h it11 = C111.iterator();
                        while (it11.f6502k) {
                            int nextInt11 = it11.nextInt();
                            float[] e212 = n7.i.e2(fArr, nextInt11, nextInt11 + 4);
                            float f26 = e212[0];
                            float f27 = e212[1];
                            d pVar = new d.p(f26, f27, e212[2], e212[3]);
                            if ((pVar instanceof d.f) && nextInt11 > 0) {
                                pVar = new d.e(f26, f27);
                            } else if ((pVar instanceof d.n) && nextInt11 > 0) {
                                pVar = new d.m(f26, f27);
                            }
                            arrayList.add(pVar);
                        }
                    } else if (c == 'S') {
                        b8.g C112 = a1.c.C1(new b8.i(0, fArr.length - 4), 4);
                        arrayList = new ArrayList(n7.l.Z1(C112, 10));
                        b8.h it12 = C112.iterator();
                        while (it12.f6502k) {
                            int nextInt12 = it12.nextInt();
                            float[] e213 = n7.i.e2(fArr, nextInt12, nextInt12 + 4);
                            float f28 = e213[0];
                            float f29 = e213[1];
                            d hVar = new d.h(f28, f29, e213[2], e213[3]);
                            if ((hVar instanceof d.f) && nextInt12 > 0) {
                                hVar = new d.e(f28, f29);
                            } else if ((hVar instanceof d.n) && nextInt12 > 0) {
                                hVar = new d.m(f28, f29);
                            }
                            arrayList.add(hVar);
                        }
                    } else if (c == 'q') {
                        b8.g C113 = a1.c.C1(new b8.i(0, fArr.length - 4), 4);
                        arrayList = new ArrayList(n7.l.Z1(C113, 10));
                        b8.h it13 = C113.iterator();
                        while (it13.f6502k) {
                            int nextInt13 = it13.nextInt();
                            float[] e214 = n7.i.e2(fArr, nextInt13, nextInt13 + 4);
                            float f30 = e214[0];
                            float f31 = e214[1];
                            d oVar = new d.o(f30, f31, e214[2], e214[3]);
                            if ((oVar instanceof d.f) && nextInt13 > 0) {
                                oVar = new d.e(f30, f31);
                            } else if ((oVar instanceof d.n) && nextInt13 > 0) {
                                oVar = new d.m(f30, f31);
                            }
                            arrayList.add(oVar);
                        }
                    } else if (c == 'Q') {
                        b8.g C114 = a1.c.C1(new b8.i(0, fArr.length - 4), 4);
                        arrayList = new ArrayList(n7.l.Z1(C114, 10));
                        b8.h it14 = C114.iterator();
                        while (it14.f6502k) {
                            int nextInt14 = it14.nextInt();
                            float[] e215 = n7.i.e2(fArr, nextInt14, nextInt14 + 4);
                            float f32 = e215[0];
                            float f33 = e215[1];
                            d gVar = new d.g(f32, f33, e215[2], e215[3]);
                            if ((gVar instanceof d.f) && nextInt14 > 0) {
                                gVar = new d.e(f32, f33);
                            } else if ((gVar instanceof d.n) && nextInt14 > 0) {
                                gVar = new d.m(f32, f33);
                            }
                            arrayList.add(gVar);
                        }
                    } else if (c == 't') {
                        b8.g C115 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                        arrayList2 = new ArrayList(n7.l.Z1(C115, 10));
                        b8.h it15 = C115.iterator();
                        while (it15.f6502k) {
                            int nextInt15 = it15.nextInt();
                            float[] e216 = n7.i.e2(fArr, nextInt15, nextInt15 + 2);
                            float f34 = e216[0];
                            float f35 = e216[1];
                            d qVar = new d.q(f34, f35);
                            if ((qVar instanceof d.f) && nextInt15 > 0) {
                                qVar = new d.e(f34, f35);
                            } else if ((qVar instanceof d.n) && nextInt15 > 0) {
                                qVar = new d.m(f34, f35);
                            }
                            arrayList2.add(qVar);
                        }
                    } else if (c == 'T') {
                        b8.g C116 = a1.c.C1(new b8.i(0, fArr.length - 2), 2);
                        arrayList2 = new ArrayList(n7.l.Z1(C116, 10));
                        b8.h it16 = C116.iterator();
                        while (it16.f6502k) {
                            int nextInt16 = it16.nextInt();
                            float[] e217 = n7.i.e2(fArr, nextInt16, nextInt16 + 2);
                            float f36 = e217[0];
                            float f37 = e217[1];
                            d iVar = new d.i(f36, f37);
                            if ((iVar instanceof d.f) && nextInt16 > 0) {
                                iVar = new d.e(f36, f37);
                            } else if ((iVar instanceof d.n) && nextInt16 > 0) {
                                iVar = new d.m(f36, f37);
                            }
                            arrayList2.add(iVar);
                        }
                    } else if (c == 'a') {
                        b8.g C117 = a1.c.C1(new b8.i(0, fArr.length - 7), 7);
                        arrayList = new ArrayList(n7.l.Z1(C117, 10));
                        b8.h it17 = C117.iterator();
                        while (it17.f6502k) {
                            int nextInt17 = it17.nextInt();
                            float[] e218 = n7.i.e2(fArr, nextInt17, nextInt17 + 7);
                            float f38 = e218[0];
                            float f39 = e218[1];
                            float f40 = e218[2];
                            if (Float.compare(e218[3], 0.0f) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (Float.compare(e218[4], 0.0f) != 0) {
                                c11 = 5;
                                z14 = true;
                            } else {
                                c11 = 5;
                                z14 = false;
                            }
                            d jVar = new d.j(f38, f39, f40, z13, z14, e218[c11], e218[6]);
                            if ((jVar instanceof d.f) && nextInt17 > 0) {
                                jVar = new d.e(e218[0], e218[1]);
                            } else if ((jVar instanceof d.n) && nextInt17 > 0) {
                                jVar = new d.m(e218[0], e218[1]);
                            }
                            arrayList.add(jVar);
                        }
                    } else if (c == 'A') {
                        b8.g C118 = a1.c.C1(new b8.i(0, fArr.length - 7), 7);
                        arrayList = new ArrayList(n7.l.Z1(C118, 10));
                        b8.h it18 = C118.iterator();
                        while (it18.f6502k) {
                            int nextInt18 = it18.nextInt();
                            float[] e219 = n7.i.e2(fArr, nextInt18, nextInt18 + 7);
                            float f41 = e219[0];
                            float f42 = e219[1];
                            float f43 = e219[c12];
                            if (Float.compare(e219[3], 0.0f) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (Float.compare(e219[4], 0.0f) != 0) {
                                c10 = 5;
                                z12 = true;
                            } else {
                                c10 = 5;
                                z12 = false;
                            }
                            d aVar = new d.a(f41, f42, f43, z11, z12, e219[c10], e219[6]);
                            if ((aVar instanceof d.f) && nextInt18 > 0) {
                                aVar = new d.e(e219[0], e219[1]);
                            } else if ((aVar instanceof d.n) && nextInt18 > 0) {
                                aVar = new d.m(e219[0], e219[1]);
                            }
                            arrayList.add(aVar);
                            c12 = 2;
                        }
                    } else {
                        throw new IllegalArgumentException("Unknown command for: " + c);
                    }
                    list = arrayList;
                }
                list = arrayList2;
            }
            arrayList3.addAll(list);
        }
        z10 = true;
        if (!z10) {
        }
        arrayList3.addAll(list);
    }

    public final void c(z zVar) {
        int i10;
        a aVar;
        d dVar;
        int i11;
        a aVar2;
        ArrayList arrayList;
        a aVar3;
        a aVar4;
        a aVar5;
        int i12;
        d dVar2;
        a aVar6;
        float f10;
        float f11;
        z zVar2 = zVar;
        v7.g.f(zVar2, "target");
        zVar.l();
        a aVar7 = this.f19063b;
        aVar7.a();
        a aVar8 = this.c;
        aVar8.a();
        a aVar9 = this.f19064d;
        aVar9.a();
        a aVar10 = this.f19065e;
        aVar10.a();
        ArrayList arrayList2 = this.f19062a;
        int size = arrayList2.size();
        d dVar3 = null;
        int i13 = 0;
        while (i13 < size) {
            d dVar4 = (d) arrayList2.get(i13);
            if (dVar3 == null) {
                dVar3 = dVar4;
            }
            if (dVar4 instanceof d.b) {
                aVar7.f19066a = aVar9.f19066a;
                aVar7.f19067b = aVar9.f19067b;
                aVar8.f19066a = aVar9.f19066a;
                aVar8.f19067b = aVar9.f19067b;
                zVar.close();
                zVar2.c(aVar7.f19066a, aVar7.f19067b);
            } else if (dVar4 instanceof d.n) {
                d.n nVar = (d.n) dVar4;
                float f12 = aVar7.f19066a;
                float f13 = nVar.c;
                aVar7.f19066a = f12 + f13;
                float f14 = aVar7.f19067b;
                float f15 = nVar.f19054d;
                aVar7.f19067b = f14 + f15;
                zVar2.e(f13, f15);
                aVar9.f19066a = aVar7.f19066a;
                aVar9.f19067b = aVar7.f19067b;
            } else if (dVar4 instanceof d.f) {
                d.f fVar = (d.f) dVar4;
                float f16 = fVar.c;
                aVar7.f19066a = f16;
                float f17 = fVar.f19034d;
                aVar7.f19067b = f17;
                zVar2.c(f16, f17);
                aVar9.f19066a = aVar7.f19066a;
                aVar9.f19067b = aVar7.f19067b;
            } else if (dVar4 instanceof d.m) {
                d.m mVar = (d.m) dVar4;
                float f18 = mVar.c;
                float f19 = mVar.f19053d;
                zVar2.j(f18, f19);
                aVar7.f19066a += mVar.c;
                aVar7.f19067b += f19;
            } else if (dVar4 instanceof d.e) {
                d.e eVar = (d.e) dVar4;
                float f20 = eVar.c;
                float f21 = eVar.f19033d;
                zVar2.k(f20, f21);
                aVar7.f19066a = eVar.c;
                aVar7.f19067b = f21;
            } else if (dVar4 instanceof d.l) {
                d.l lVar = (d.l) dVar4;
                zVar2.j(lVar.c, 0.0f);
                aVar7.f19066a += lVar.c;
            } else if (dVar4 instanceof d.C0248d) {
                d.C0248d c0248d = (d.C0248d) dVar4;
                zVar2.k(c0248d.c, aVar7.f19067b);
                aVar7.f19066a = c0248d.c;
            } else if (dVar4 instanceof d.r) {
                d.r rVar = (d.r) dVar4;
                zVar2.j(0.0f, rVar.c);
                aVar7.f19067b += rVar.c;
            } else if (dVar4 instanceof d.s) {
                d.s sVar = (d.s) dVar4;
                zVar2.k(aVar7.f19066a, sVar.c);
                aVar7.f19067b = sVar.c;
            } else {
                if (dVar4 instanceof d.k) {
                    d.k kVar = (d.k) dVar4;
                    i10 = size;
                    aVar = aVar9;
                    dVar = dVar4;
                    zVar.f(kVar.c, kVar.f19048d, kVar.f19049e, kVar.f19050f, kVar.f19051g, kVar.f19052h);
                    aVar8.f19066a = aVar7.f19066a + kVar.f19049e;
                    aVar8.f19067b = aVar7.f19067b + kVar.f19050f;
                    aVar7.f19066a += kVar.f19051g;
                    aVar7.f19067b += kVar.f19052h;
                } else {
                    i10 = size;
                    aVar = aVar9;
                    dVar = dVar4;
                    if (dVar instanceof d.c) {
                        d.c cVar = (d.c) dVar;
                        zVar.d(cVar.c, cVar.f19028d, cVar.f19029e, cVar.f19030f, cVar.f19031g, cVar.f19032h);
                        aVar8.f19066a = cVar.f19029e;
                        aVar8.f19067b = cVar.f19030f;
                        aVar7.f19066a = cVar.f19031g;
                        aVar7.f19067b = cVar.f19032h;
                    } else if (dVar instanceof d.p) {
                        d.p pVar = (d.p) dVar;
                        v7.g.c(dVar3);
                        if (dVar3.f19020a) {
                            aVar10.f19066a = aVar7.f19066a - aVar8.f19066a;
                            aVar10.f19067b = aVar7.f19067b - aVar8.f19067b;
                        } else {
                            aVar10.a();
                        }
                        zVar.f(aVar10.f19066a, aVar10.f19067b, pVar.c, pVar.f19058d, pVar.f19059e, pVar.f19060f);
                        aVar8.f19066a = aVar7.f19066a + pVar.c;
                        aVar8.f19067b = aVar7.f19067b + pVar.f19058d;
                        aVar7.f19066a += pVar.f19059e;
                        aVar7.f19067b += pVar.f19060f;
                    } else if (dVar instanceof d.h) {
                        d.h hVar = (d.h) dVar;
                        v7.g.c(dVar3);
                        if (dVar3.f19020a) {
                            float f22 = 2;
                            aVar10.f19066a = (aVar7.f19066a * f22) - aVar8.f19066a;
                            f11 = (f22 * aVar7.f19067b) - aVar8.f19067b;
                        } else {
                            aVar10.f19066a = aVar7.f19066a;
                            f11 = aVar7.f19067b;
                        }
                        float f23 = f11;
                        aVar10.f19067b = f23;
                        zVar.d(aVar10.f19066a, f23, hVar.c, hVar.f19038d, hVar.f19039e, hVar.f19040f);
                        aVar8.f19066a = hVar.c;
                        aVar8.f19067b = hVar.f19038d;
                        aVar7.f19066a = hVar.f19039e;
                        aVar7.f19067b = hVar.f19040f;
                    } else if (dVar instanceof d.o) {
                        d.o oVar = (d.o) dVar;
                        float f24 = oVar.c;
                        float f25 = oVar.f19055d;
                        float f26 = oVar.f19056e;
                        float f27 = oVar.f19057f;
                        zVar2.i(f24, f25, f26, f27);
                        aVar8.f19066a = aVar7.f19066a + oVar.c;
                        aVar8.f19067b = aVar7.f19067b + f25;
                        aVar7.f19066a += f26;
                        aVar7.f19067b += f27;
                    } else if (dVar instanceof d.g) {
                        d.g gVar = (d.g) dVar;
                        float f28 = gVar.c;
                        float f29 = gVar.f19035d;
                        float f30 = gVar.f19036e;
                        float f31 = gVar.f19037f;
                        zVar2.g(f28, f29, f30, f31);
                        aVar8.f19066a = gVar.c;
                        aVar8.f19067b = f29;
                        aVar7.f19066a = f30;
                        aVar7.f19067b = f31;
                    } else if (dVar instanceof d.q) {
                        d.q qVar = (d.q) dVar;
                        v7.g.c(dVar3);
                        if (dVar3.f19021b) {
                            aVar10.f19066a = aVar7.f19066a - aVar8.f19066a;
                            aVar10.f19067b = aVar7.f19067b - aVar8.f19067b;
                        } else {
                            aVar10.a();
                        }
                        float f32 = aVar10.f19066a;
                        float f33 = aVar10.f19067b;
                        float f34 = qVar.c;
                        float f35 = qVar.f19061d;
                        zVar2.i(f32, f33, f34, f35);
                        aVar8.f19066a = aVar7.f19066a + aVar10.f19066a;
                        aVar8.f19067b = aVar7.f19067b + aVar10.f19067b;
                        aVar7.f19066a += qVar.c;
                        aVar7.f19067b += f35;
                    } else if (dVar instanceof d.i) {
                        d.i iVar = (d.i) dVar;
                        v7.g.c(dVar3);
                        if (dVar3.f19021b) {
                            float f36 = 2;
                            aVar10.f19066a = (aVar7.f19066a * f36) - aVar8.f19066a;
                            f10 = (f36 * aVar7.f19067b) - aVar8.f19067b;
                        } else {
                            aVar10.f19066a = aVar7.f19066a;
                            f10 = aVar7.f19067b;
                        }
                        aVar10.f19067b = f10;
                        float f37 = aVar10.f19066a;
                        float f38 = iVar.c;
                        float f39 = iVar.f19041d;
                        zVar2.g(f37, f10, f38, f39);
                        aVar8.f19066a = aVar10.f19066a;
                        aVar8.f19067b = aVar10.f19067b;
                        aVar7.f19066a = iVar.c;
                        aVar7.f19067b = f39;
                    } else {
                        if (dVar instanceof d.j) {
                            d.j jVar = (d.j) dVar;
                            float f40 = jVar.f19046h;
                            float f41 = aVar7.f19066a;
                            float f42 = f40 + f41;
                            float f43 = aVar7.f19067b;
                            float f44 = jVar.f19047i + f43;
                            i11 = i13;
                            i12 = i10;
                            aVar2 = aVar10;
                            arrayList = arrayList2;
                            aVar5 = aVar;
                            dVar2 = dVar;
                            b(zVar, f41, f43, f42, f44, jVar.c, jVar.f19042d, jVar.f19043e, jVar.f19044f, jVar.f19045g);
                            aVar4 = aVar7;
                            aVar4.f19066a = f42;
                            aVar4.f19067b = f44;
                            aVar3 = aVar8;
                            aVar3.f19066a = f42;
                            aVar3.f19067b = f44;
                        } else {
                            i11 = i13;
                            aVar2 = aVar10;
                            arrayList = arrayList2;
                            aVar3 = aVar8;
                            aVar4 = aVar7;
                            aVar5 = aVar;
                            i12 = i10;
                            if (dVar instanceof d.a) {
                                d.a aVar11 = (d.a) dVar;
                                float f45 = aVar11.f19027i;
                                dVar2 = dVar;
                                b(zVar, aVar4.f19066a, aVar4.f19067b, aVar11.f19026h, f45, aVar11.c, aVar11.f19022d, aVar11.f19023e, aVar11.f19024f, aVar11.f19025g);
                                float f46 = aVar11.f19026h;
                                aVar4 = aVar4;
                                aVar4.f19066a = f46;
                                aVar4.f19067b = f45;
                                aVar6 = aVar3;
                                aVar6.f19066a = f46;
                                aVar6.f19067b = f45;
                                i13 = i11 + 1;
                                zVar2 = zVar;
                                aVar7 = aVar4;
                                aVar8 = aVar6;
                                arrayList2 = arrayList;
                                size = i12;
                                aVar10 = aVar2;
                                aVar9 = aVar5;
                                dVar3 = dVar2;
                            } else {
                                dVar2 = dVar;
                            }
                        }
                        aVar6 = aVar3;
                        i13 = i11 + 1;
                        zVar2 = zVar;
                        aVar7 = aVar4;
                        aVar8 = aVar6;
                        arrayList2 = arrayList;
                        size = i12;
                        aVar10 = aVar2;
                        aVar9 = aVar5;
                        dVar3 = dVar2;
                    }
                }
                i11 = i13;
                aVar2 = aVar10;
                arrayList = arrayList2;
                aVar6 = aVar8;
                dVar2 = dVar;
                aVar4 = aVar7;
                aVar5 = aVar;
                i12 = i10;
                i13 = i11 + 1;
                zVar2 = zVar;
                aVar7 = aVar4;
                aVar8 = aVar6;
                arrayList2 = arrayList;
                size = i12;
                aVar10 = aVar2;
                aVar9 = aVar5;
                dVar3 = dVar2;
            }
            dVar2 = dVar4;
            i12 = size;
            i11 = i13;
            aVar2 = aVar10;
            arrayList = arrayList2;
            aVar6 = aVar8;
            aVar5 = aVar9;
            aVar4 = aVar7;
            i13 = i11 + 1;
            zVar2 = zVar;
            aVar7 = aVar4;
            aVar8 = aVar6;
            arrayList2 = arrayList;
            size = i12;
            aVar10 = aVar2;
            aVar9 = aVar5;
            dVar3 = dVar2;
        }
    }
}
