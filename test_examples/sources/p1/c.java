package p1;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import java.util.ArrayList;
import java.util.List;
import v0.f0;
import v0.g0;
import v0.i0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final MultiParagraphIntrinsics f16649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16650b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16651d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16652e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16653f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16654g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f16655h;

    public c(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        u0.d dVar;
        int e10;
        this.f16649a = multiParagraphIntrinsics;
        this.f16650b = i10;
        if (b2.a.h(j2) == 0 && b2.a.g(j2) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = multiParagraphIntrinsics.f3998e;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            float f10 = 0.0f;
            while (i11 < size) {
                f fVar = (f) arrayList2.get(i11);
                g gVar = fVar.f16662a;
                int f11 = b2.a.f(j2);
                if (b2.a.c(j2)) {
                    e10 = b2.a.e(j2) - ((int) Math.ceil(f10));
                    if (e10 < 0) {
                        e10 = 0;
                    }
                } else {
                    e10 = b2.a.e(j2);
                }
                long c = v8.b.c(f11, e10, 5);
                v7.g.f(gVar, "paragraphIntrinsics");
                AndroidParagraph androidParagraph = new AndroidParagraph((androidx.compose.ui.text.platform.a) gVar, this.f16650b - i12, z10, c);
                float a10 = androidParagraph.a() + f10;
                androidx.compose.ui.text.android.b bVar = androidParagraph.f3986d;
                int i13 = i12 + bVar.f4071e;
                arrayList.add(new e(androidParagraph, fVar.f16663b, fVar.c, i12, i13, f10, a10));
                if (!bVar.c) {
                    i12 = i13;
                    if (i12 != this.f16650b || i11 == a1.c.B0(this.f16649a.f3998e)) {
                        i11++;
                        f10 = a10;
                    }
                } else {
                    i12 = i13;
                }
                f10 = a10;
                z12 = true;
                break;
            }
            z12 = false;
            this.f16652e = f10;
            this.f16653f = i12;
            this.c = z12;
            this.f16655h = arrayList;
            this.f16651d = b2.a.f(j2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                e eVar = (e) arrayList.get(i14);
                List<u0.d> d5 = eVar.f16656a.d();
                ArrayList arrayList4 = new ArrayList(d5.size());
                int size3 = d5.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    u0.d dVar2 = d5.get(i15);
                    if (dVar2 != null) {
                        dVar = dVar2.d(a1.c.s(0.0f, eVar.f16660f));
                    } else {
                        dVar = null;
                    }
                    arrayList4.add(dVar);
                }
                n7.n.f2(arrayList4, arrayList3);
            }
            if (arrayList3.size() < this.f16649a.f3996b.size()) {
                int size4 = this.f16649a.f3996b.size() - arrayList3.size();
                ArrayList arrayList5 = new ArrayList(size4);
                for (int i16 = 0; i16 < size4; i16++) {
                    arrayList5.add(null);
                }
                arrayList3 = kotlin.collections.c.z2(arrayList5, arrayList3);
            }
            this.f16654g = arrayList3;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public final void a(v0.o oVar, v0.m mVar, float f10, g0 g0Var, a2.g gVar) {
        oVar.m();
        ArrayList arrayList = this.f16655h;
        if (arrayList.size() > 1 && !(mVar instanceof i0)) {
            if (mVar instanceof f0) {
                int size = arrayList.size();
                float f11 = 0.0f;
                float f12 = 0.0f;
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = (e) arrayList.get(i10);
                    f12 += eVar.f16656a.a();
                    f11 = Math.max(f11, eVar.f16656a.b());
                }
                a1.c.v(f11, f12);
                Shader b5 = ((f0) mVar).b();
                Matrix matrix = new Matrix();
                b5.getLocalMatrix(matrix);
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    e eVar2 = (e) arrayList.get(i11);
                    eVar2.f16656a.h(oVar, new v0.n(b5), f10, g0Var, gVar, null);
                    d dVar = eVar2.f16656a;
                    oVar.i(0.0f, dVar.a());
                    matrix.setTranslate(0.0f, -dVar.a());
                    b5.setLocalMatrix(matrix);
                }
            }
            oVar.l();
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            e eVar3 = (e) arrayList.get(i12);
            eVar3.f16656a.h(oVar, mVar, f10, g0Var, gVar, null);
            oVar.i(0.0f, eVar3.f16656a.a());
        }
        oVar.l();
    }

    public final void b(v0.o oVar, long j2, g0 g0Var, a2.g gVar) {
        oVar.m();
        ArrayList arrayList = this.f16655h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            eVar.f16656a.g(oVar, j2, g0Var, gVar);
            oVar.i(0.0f, eVar.f16656a.a());
        }
        oVar.l();
    }

    public final void c(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f16653f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i10 + ')').toString());
    }
}
