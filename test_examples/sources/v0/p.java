package v0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import q0.d;
import w0.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static Method f18126a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f18127b;
    public static boolean c;

    public static final void A(float[] fArr, float[] fArr2) {
        v7.g.f(fArr, "lhs");
        v7.g.f(fArr2, "rhs");
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f13 = fArr[2] * f10;
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + f13;
    }

    public static final h1.b B(ArrayList arrayList, ArrayList arrayList2) {
        float f10;
        float f11;
        float c10;
        if (arrayList.size() == arrayList2.size()) {
            if (!arrayList.isEmpty()) {
                int size = 2 >= arrayList.size() ? arrayList.size() - 1 : 2;
                ArrayList arrayList3 = new ArrayList(3);
                int i10 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i10 >= 3) {
                        break;
                    }
                    arrayList3.add(Float.valueOf(0.0f));
                    i10++;
                }
                int size2 = arrayList.size();
                int i11 = size + 1;
                g0.l0 l0Var = new g0.l0(i11, size2);
                int i12 = 0;
                while (true) {
                    f11 = 1.0f;
                    if (i12 >= size2) {
                        break;
                    }
                    l0Var.e(1.0f, 0, i12);
                    for (int i13 = 1; i13 < i11; i13++) {
                        l0Var.e(((Number) arrayList.get(i12)).floatValue() * l0Var.b(i13 - 1, i12), i13, i12);
                    }
                    i12++;
                }
                g0.l0 l0Var2 = new g0.l0(i11, size2);
                g0.l0 l0Var3 = new g0.l0(i11, i11);
                for (int i14 = 0; i14 < i11; i14++) {
                    for (int i15 = 0; i15 < size2; i15++) {
                        l0Var2.e(l0Var.b(i14, i15), i14, i15);
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        float c11 = l0Var2.d(i14).c(l0Var2.d(i16));
                        for (int i17 = 0; i17 < size2; i17++) {
                            l0Var2.e(l0Var2.b(i14, i17) - (l0Var2.b(i16, i17) * c11), i14, i17);
                        }
                    }
                    h1.c d5 = l0Var2.d(i14);
                    float sqrt = (float) Math.sqrt(d5.c(d5));
                    if (sqrt >= 1.0E-6d) {
                        float f12 = 1.0f / sqrt;
                        for (int i18 = 0; i18 < size2; i18++) {
                            l0Var2.e(l0Var2.b(i14, i18) * f12, i14, i18);
                        }
                        for (int i19 = 0; i19 < i11; i19++) {
                            if (i19 < i14) {
                                c10 = 0.0f;
                            } else {
                                c10 = l0Var2.d(i14).c(l0Var.d(i19));
                            }
                            l0Var3.e(c10, i14, i19);
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                h1.c cVar = new h1.c(size2, 0);
                for (int i20 = 0; i20 < size2; i20++) {
                    ((Float[]) cVar.f11346b)[i20] = Float.valueOf(((Number) arrayList2.get(i20)).floatValue() * 1.0f);
                }
                int i21 = i11 - 1;
                for (int i22 = i21; -1 < i22; i22--) {
                    arrayList3.set(i22, Float.valueOf(l0Var2.d(i22).c(cVar)));
                    int i23 = i22 + 1;
                    if (i23 <= i21) {
                        int i24 = i21;
                        while (true) {
                            arrayList3.set(i22, Float.valueOf(((Number) arrayList3.get(i22)).floatValue() - (((Number) arrayList3.get(i24)).floatValue() * l0Var3.b(i22, i24))));
                            if (i24 != i23) {
                                i24--;
                            }
                        }
                    }
                    arrayList3.set(i22, Float.valueOf(((Number) arrayList3.get(i22)).floatValue() / l0Var3.b(i22, i22)));
                }
                float f13 = 0.0f;
                for (int i25 = 0; i25 < size2; i25++) {
                    f13 += ((Number) arrayList2.get(i25)).floatValue();
                }
                float f14 = f13 / size2;
                float f15 = 0.0f;
                for (int i26 = 0; i26 < size2; i26++) {
                    float floatValue = ((Number) arrayList2.get(i26)).floatValue() - ((Number) arrayList3.get(0)).floatValue();
                    float f16 = 1.0f;
                    for (int i27 = 1; i27 < i11; i27++) {
                        f16 *= ((Number) arrayList.get(i26)).floatValue();
                        floatValue -= ((Number) arrayList3.get(i27)).floatValue() * f16;
                    }
                    f15 += floatValue * 1.0f * floatValue;
                    float floatValue2 = ((Number) arrayList2.get(i26)).floatValue() - f14;
                    f10 += floatValue2 * 1.0f * floatValue2;
                }
                if (f10 > 1.0E-6f) {
                    f11 = 1.0f - (f15 / f10);
                }
                return new h1.b(arrayList3, f11);
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("x and y must be the same length");
    }

    public static final long C(g1.o oVar, boolean z10) {
        long e10 = u0.c.e(oVar.c, oVar.f11166f);
        if (!z10 && oVar.b()) {
            int i10 = u0.c.f17723e;
            return u0.c.f17721b;
        }
        return e10;
    }

    public static final NodeCoordinator D(l1.b bVar, int i10) {
        v7.g.f(bVar, "$this$requireCoordinator");
        NodeCoordinator nodeCoordinator = bVar.e().n;
        v7.g.c(nodeCoordinator);
        if (nodeCoordinator.U0() == bVar && m0.b.o0(i10)) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator.f3500p;
            v7.g.c(nodeCoordinator2);
            return nodeCoordinator2;
        }
        return nodeCoordinator;
    }

    public static final LayoutNode E(l1.b bVar) {
        v7.g.f(bVar, "<this>");
        NodeCoordinator nodeCoordinator = bVar.e().n;
        v7.g.c(nodeCoordinator);
        return nodeCoordinator.f3499o;
    }

    public static final l1.b0 F(l1.b bVar) {
        v7.g.f(bVar, "<this>");
        l1.b0 b0Var = E(bVar).f3420p;
        v7.g.c(b0Var);
        return b0Var;
    }

    public static final void G(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ac, code lost:
        if (r9.a() == 1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(int i10, Object obj, u1.d dVar, u1.m mVar, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        Typeface a10;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        u1.m mVar2;
        boolean z20;
        v7.g.f(obj, "typeface");
        v7.g.f(dVar, "font");
        v7.g.f(mVar, "requestedWeight");
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z21 = false;
        int i13 = 0;
        z21 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i10 == 2) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (!z20) {
                z11 = false;
                if (z11 && !v7.g.a(dVar.c(), mVar)) {
                    mVar2 = u1.m.f17753l;
                    if (mVar.compareTo(mVar2) >= 0 && dVar.c().compareTo(mVar2) < 0) {
                        z12 = true;
                        if (i10 != 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (i10 == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (!z19) {
                                z14 = false;
                                if (z14) {
                                    if (i11 == dVar.a()) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (!z18) {
                                        z15 = true;
                                        if (z15 && !z12) {
                                            return obj;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            if (z15) {
                                                if (i11 == 1) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    z16 = true;
                                                    if (!z16 && z12) {
                                                        i13 = 3;
                                                    } else if (!z12) {
                                                        i13 = 1;
                                                    } else if (z16) {
                                                        i13 = 2;
                                                    }
                                                    a10 = Typeface.create((Typeface) obj, i13);
                                                }
                                            }
                                            z16 = false;
                                            if (!z16) {
                                            }
                                            if (!z12) {
                                            }
                                            a10 = Typeface.create((Typeface) obj, i13);
                                        } else {
                                            if (z12) {
                                                i12 = mVar.f17759i;
                                            } else {
                                                i12 = dVar.c().f17759i;
                                            }
                                            if (z15) {
                                                if (i11 == 1) {
                                                    z21 = true;
                                                }
                                                a10 = u1.v.f17767a.a((Typeface) obj, i12, z21);
                                            }
                                        }
                                        v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                                        return a10;
                                    }
                                }
                                z15 = false;
                                if (z15) {
                                }
                                if (Build.VERSION.SDK_INT >= 28) {
                                }
                                v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                                return a10;
                            }
                        }
                        z14 = true;
                        if (z14) {
                        }
                        z15 = false;
                        if (z15) {
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                        }
                        v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                        return a10;
                    }
                }
                z12 = false;
                if (i10 != 1) {
                }
                if (!z13) {
                }
                z14 = true;
                if (z14) {
                }
                z15 = false;
                if (z15) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
                v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                return a10;
            }
        }
        z11 = true;
        if (z11) {
            mVar2 = u1.m.f17753l;
            if (mVar.compareTo(mVar2) >= 0) {
                z12 = true;
                if (i10 != 1) {
                }
                if (!z13) {
                }
                z14 = true;
                if (z14) {
                }
                z15 = false;
                if (z15) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
                v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
                return a10;
            }
        }
        z12 = false;
        if (i10 != 1) {
        }
        if (!z13) {
        }
        z14 = true;
        if (z14) {
        }
        z15 = false;
        if (z15) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
        v7.g.e(a10, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return a10;
    }

    public static void I(float[] fArr, float f10, float f11) {
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = fArr[3] * f10;
        float f16 = fArr[11] * 0.0f;
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f16 + (fArr[7] * f11) + f15 + fArr[15];
    }

    public static u1.s a(int i10, u1.m mVar, int i11, int i12) {
        int i13;
        if ((i12 & 2) != 0) {
            mVar = u1.m.n;
        }
        u1.m mVar2 = mVar;
        if ((i12 & 4) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        v7.g.f(mVar2, "weight");
        return new u1.s(i10, mVar2, i13, new u1.l(new u1.k[0]), 0);
    }

    public static final void b(h0.e eVar, d.c cVar) {
        h0.e<LayoutNode> r3 = E(cVar).r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            int i11 = i10 - 1;
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                eVar.b(layoutNodeArr[i11].J.f15781e);
                i11--;
            } while (i11 >= 0);
        }
    }

    public static final d.c c(l1.b bVar, int i10) {
        d.c cVar = bVar.e().f16829m;
        if (cVar != null && (cVar.f16827k & i10) != 0) {
            while (cVar != null) {
                int i11 = cVar.f16826j;
                if ((i11 & 2) != 0) {
                    break;
                } else if ((i11 & i10) == 0) {
                    cVar = cVar.f16829m;
                } else {
                    return cVar;
                }
            }
        }
        return null;
    }

    public static w0.c d(w0.c cVar) {
        w0.h hVar = v8.b.f18176b;
        a.C0235a c0235a = w0.a.f18235b;
        v7.g.f(cVar, "<this>");
        if (w0.b.a(cVar.f18242b, w0.b.f18237a)) {
            Rgb rgb = (Rgb) cVar;
            if (!i(rgb.f3118d, hVar)) {
                float[] a10 = hVar.a();
                return new Rgb(rgb.f18241a, rgb.f3122h, hVar, y(h(c0235a.f18236a, rgb.f3118d.a(), a10), rgb.f3123i), rgb.f3125k, rgb.f3127m, rgb.f3119e, rgb.f3120f, rgb.f3121g, -1);
            }
            return cVar;
        }
        return cVar;
    }

    public static final void e(h1.e eVar, g1.o oVar) {
        v7.g.f(eVar, "<this>");
        v7.g.f(oVar, "event");
        boolean f10 = f(oVar);
        h1.a[] aVarArr = eVar.f11351a;
        long j2 = oVar.c;
        if (f10) {
            eVar.c = j2;
            n7.i.h2(aVarArr, null);
        }
        List list = oVar.f11171k;
        if (list == null) {
            list = EmptyList.f12981i;
        }
        int size = list.size();
        long j10 = oVar.f11166f;
        int i10 = 0;
        while (i10 < size) {
            g1.e eVar2 = (g1.e) list.get(i10);
            long f11 = u0.c.f(eVar.c, u0.c.e(eVar2.f11142b, j10));
            eVar.c = f11;
            int i11 = (eVar.f11352b + 1) % 20;
            eVar.f11352b = i11;
            aVarArr[i11] = new h1.a(f11, eVar2.f11141a);
            i10++;
            j10 = eVar2.f11142b;
        }
        long f12 = u0.c.f(eVar.c, u0.c.e(j2, j10));
        eVar.c = f12;
        int i12 = (eVar.f11352b + 1) % 20;
        eVar.f11352b = i12;
        aVarArr[i12] = new h1.a(f12, oVar.f11163b);
    }

    public static final boolean f(g1.o oVar) {
        v7.g.f(oVar, "<this>");
        return !oVar.f11167g && oVar.f11164d;
    }

    public static final boolean g(g1.o oVar) {
        v7.g.f(oVar, "<this>");
        return oVar.f11167g && !oVar.f11164d;
    }

    public static final float[] h(float[] fArr, float[] fArr2, float[] fArr3) {
        v7.g.f(fArr, "matrix");
        A(fArr, fArr2);
        A(fArr, fArr3);
        return y(s(fArr), z(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean i(w0.h hVar, w0.h hVar2) {
        v7.g.f(hVar, "a");
        v7.g.f(hVar2, "b");
        if (hVar == hVar2) {
            return true;
        }
        return Math.abs(hVar.f18253a - hVar2.f18253a) < 0.001f && Math.abs(hVar.f18254b - hVar2.f18254b) < 0.001f;
    }

    public static androidx.compose.ui.graphics.colorspace.a j(w0.c cVar, w0.c cVar2, int i10) {
        androidx.compose.ui.graphics.colorspace.a aVar;
        if ((i10 & 1) != 0) {
            cVar2 = ColorSpaces.c;
        }
        v7.g.f(cVar, "$this$connect");
        v7.g.f(cVar2, "destination");
        if (cVar == cVar2) {
            return new w0.d(cVar);
        }
        long j2 = w0.b.f18237a;
        if (w0.b.a(cVar.f18242b, j2) && w0.b.a(cVar2.f18242b, j2)) {
            aVar = new a.C0022a((Rgb) cVar, (Rgb) cVar2, 0);
        } else {
            aVar = new androidx.compose.ui.graphics.colorspace.a(cVar, cVar2, 0);
        }
        return aVar;
    }

    public static float[] k() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void l(Canvas canvas, boolean z10) {
        Method method;
        Method declaredMethod;
        v7.g.f(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            q.f18128a.a(canvas, z10);
            return;
        }
        if (!c) {
            try {
                if (i10 == 28) {
                    Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f18126a = (Method) declaredMethod2.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    declaredMethod = (Method) declaredMethod2.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f18126a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    declaredMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                f18127b = declaredMethod;
                Method method2 = f18126a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f18127b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        if (z10) {
            try {
                Method method4 = f18126a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f18127b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final void m(LayoutNode layoutNode, List list) {
        h0.e<LayoutNode> q10 = layoutNode.q();
        int i10 = q10.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = q10.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                l1.h0 r3 = r(layoutNode2);
                if (r3 != null) {
                    list.add(r3);
                } else {
                    m(layoutNode2, list);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public static final int n(int i10, ArrayList arrayList) {
        char c10;
        v7.g.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            p1.e eVar = (p1.e) arrayList.get(i12);
            if (eVar.f16657b > i10) {
                c10 = 1;
            } else if (eVar.c <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int o(int i10, ArrayList arrayList) {
        char c10;
        v7.g.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            p1.e eVar = (p1.e) arrayList.get(i12);
            if (eVar.f16658d > i10) {
                c10 = 1;
            } else if (eVar.f16659e <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final int p(ArrayList arrayList, float f10) {
        char c10;
        v7.g.f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            p1.e eVar = (p1.e) arrayList.get(i11);
            if (eVar.f16660f > f10) {
                c10 = 1;
            } else if (eVar.f16661g <= f10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final l1.h0 q(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "<this>");
        d.c cVar = layoutNode.J.f15781e;
        if ((cVar.f16827k & 8) != 0) {
            while (cVar != null) {
                if ((cVar.f16826j & 8) == 0 || !(cVar instanceof l1.h0) || !((l1.h0) cVar).t().f16207j) {
                    if ((cVar.f16827k & 8) == 0) {
                        break;
                    }
                    cVar = cVar.f16829m;
                } else {
                    break;
                }
            }
        }
        cVar = null;
        return (l1.h0) cVar;
    }

    public static final l1.h0 r(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "<this>");
        d.c cVar = layoutNode.J.f15781e;
        if ((cVar.f16827k & 8) != 0) {
            while (cVar != null) {
                if ((cVar.f16826j & 8) != 0 && (cVar instanceof l1.h0)) {
                    break;
                } else if ((cVar.f16827k & 8) == 0) {
                    break;
                } else {
                    cVar = cVar.f16829m;
                }
            }
        }
        cVar = null;
        return (l1.h0) cVar;
    }

    public static final float[] s(float[] fArr) {
        v7.g.f(fArr, "m");
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final boolean t(float[] fArr, float[] fArr2) {
        v7.g.f(fArr, "$this$invertTo");
        v7.g.f(fArr2, "other");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    public static final boolean u(g1.o oVar, long j2) {
        v7.g.f(oVar, "$this$isOutOfBounds");
        long j10 = oVar.c;
        float b5 = u0.c.b(j10);
        float c10 = u0.c.c(j10);
        int i10 = (int) (j2 >> 32);
        int b10 = b2.h.b(j2);
        if (b5 >= 0.0f && b5 <= i10 && c10 >= 0.0f && c10 <= b10) {
            return false;
        }
        return true;
    }

    public static final boolean v(g1.o oVar, long j2, long j10) {
        boolean z10;
        v7.g.f(oVar, "$this$isOutOfBounds");
        if (oVar.f11168h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return u(oVar, j2);
        }
        long j11 = oVar.c;
        float b5 = u0.c.b(j11);
        float c10 = u0.c.c(j11);
        float d5 = u0.f.d(j10) + ((int) (j2 >> 32));
        float f10 = -u0.f.b(j10);
        float b10 = u0.f.b(j10) + b2.h.b(j2);
        if (b5 >= (-u0.f.d(j10)) && b5 <= d5 && c10 >= f10 && c10 <= b10) {
            return false;
        }
        return true;
    }

    public static final long w(float[] fArr, long j2) {
        float b5 = u0.c.b(j2);
        float c10 = u0.c.c(j2);
        float f10 = 1 / (((fArr[7] * c10) + (fArr[3] * b5)) + fArr[15]);
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            f10 = 0.0f;
        }
        return a1.c.s(((fArr[4] * c10) + (fArr[0] * b5) + fArr[12]) * f10, ((fArr[5] * c10) + (fArr[1] * b5) + fArr[13]) * f10);
    }

    public static final void x(float[] fArr, u0.b bVar) {
        long w10 = w(fArr, a1.c.s(bVar.f17718a, bVar.f17719b));
        long w11 = w(fArr, a1.c.s(bVar.f17718a, bVar.f17720d));
        long w12 = w(fArr, a1.c.s(bVar.c, bVar.f17719b));
        long w13 = w(fArr, a1.c.s(bVar.c, bVar.f17720d));
        bVar.f17718a = Math.min(Math.min(u0.c.b(w10), u0.c.b(w11)), Math.min(u0.c.b(w12), u0.c.b(w13)));
        bVar.f17719b = Math.min(Math.min(u0.c.c(w10), u0.c.c(w11)), Math.min(u0.c.c(w12), u0.c.c(w13)));
        bVar.c = Math.max(Math.max(u0.c.b(w10), u0.c.b(w11)), Math.max(u0.c.b(w12), u0.c.b(w13)));
        bVar.f17720d = Math.max(Math.max(u0.c.c(w10), u0.c.c(w11)), Math.max(u0.c.c(w12), u0.c.c(w13)));
    }

    public static final float[] y(float[] fArr, float[] fArr2) {
        v7.g.f(fArr, "lhs");
        v7.g.f(fArr2, "rhs");
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = f10 * f11;
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = f13 * f14;
        float f16 = fArr[1];
        float f17 = fArr2[0];
        float f18 = fArr[4];
        float f19 = f11 * f18;
        float f20 = fArr[7];
        float f21 = f20 * f14;
        float f22 = fArr[5];
        float f23 = fArr2[1] * f22;
        float f24 = fArr[8];
        float f25 = f14 * f24;
        float f26 = fArr[0];
        float f27 = fArr2[4];
        float f28 = (f10 * f27) + (fArr2[3] * f26);
        float f29 = fArr2[5];
        float f30 = fArr[1];
        float f31 = fArr2[3];
        float f32 = f18 * f27;
        float f33 = fArr[2];
        float f34 = f22 * fArr2[4];
        float f35 = f26 * fArr2[6];
        float f36 = fArr[3];
        float f37 = fArr2[7];
        float f38 = (f36 * f37) + f35;
        float f39 = fArr2[8];
        float f40 = fArr2[6];
        return new float[]{f15 + f12 + (fArr[0] * fArr2[0]), f21 + f19 + (f16 * f17), f25 + f23 + (fArr[2] * f17), (f13 * f29) + f28, (f20 * f29) + f32 + (f30 * f31), (f29 * f24) + f34 + (f31 * f33), (f13 * f39) + f38, (f20 * f39) + (fArr[4] * f37) + (f30 * f40), (f24 * f39) + (fArr[5] * fArr2[7]) + (f33 * f40)};
    }

    public static final float[] z(float[] fArr, float[] fArr2) {
        v7.g.f(fArr2, "rhs");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f10, fArr2[4] * f11, fArr2[5] * f12, f10 * fArr2[6], f11 * fArr2[7], f12 * fArr2[8]};
    }
}
