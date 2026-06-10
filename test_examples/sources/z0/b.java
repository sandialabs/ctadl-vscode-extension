package z0;

import java.util.ArrayList;
import java.util.List;
import v0.p;
import x0.a;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    public float[] f18979b;

    /* renamed from: f  reason: collision with root package name */
    public v0.h f18982f;

    /* renamed from: g  reason: collision with root package name */
    public e f18983g;

    /* renamed from: h  reason: collision with root package name */
    public u7.a<m7.n> f18984h;

    /* renamed from: j  reason: collision with root package name */
    public float f18986j;

    /* renamed from: k  reason: collision with root package name */
    public float f18987k;

    /* renamed from: l  reason: collision with root package name */
    public float f18988l;

    /* renamed from: o  reason: collision with root package name */
    public float f18990o;

    /* renamed from: p  reason: collision with root package name */
    public float f18991p;
    public final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<? extends d> f18980d = j.f19079a;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18981e = true;

    /* renamed from: i  reason: collision with root package name */
    public String f18985i = "";

    /* renamed from: m  reason: collision with root package name */
    public float f18989m = 1.0f;
    public float n = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18992q = true;

    @Override // z0.f
    public final void a(x0.f fVar) {
        v7.g.f(fVar, "<this>");
        if (this.f18992q) {
            float[] fArr = this.f18979b;
            if (fArr == null) {
                fArr = p.k();
                this.f18979b = fArr;
            } else {
                p.G(fArr);
            }
            p.I(fArr, this.f18987k + this.f18990o, this.f18988l + this.f18991p);
            double d5 = (this.f18986j * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d5);
            float sin = (float) Math.sin(d5);
            float f10 = fArr[0];
            float f11 = fArr[4];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = -sin;
            float f14 = (f11 * cos) + (f10 * f13);
            float f15 = fArr[1];
            float f16 = fArr[5];
            float f17 = (sin * f16) + (cos * f15);
            float f18 = (f16 * cos) + (f15 * f13);
            float f19 = fArr[2];
            float f20 = fArr[6];
            float f21 = (sin * f20) + (cos * f19);
            float f22 = (f20 * cos) + (f19 * f13);
            float f23 = fArr[3];
            float f24 = fArr[7];
            float f25 = (sin * f24) + (cos * f23);
            float f26 = (cos * f24) + (f13 * f23);
            fArr[0] = f12;
            fArr[1] = f17;
            fArr[2] = f21;
            fArr[3] = f25;
            fArr[4] = f14;
            fArr[5] = f18;
            fArr[6] = f22;
            fArr[7] = f26;
            float f27 = this.f18989m;
            float f28 = this.n;
            fArr[0] = f12 * f27;
            fArr[1] = f17 * f27;
            fArr[2] = f21 * f27;
            fArr[3] = f25 * f27;
            fArr[4] = f14 * f28;
            fArr[5] = f18 * f28;
            fArr[6] = f22 * f28;
            fArr[7] = f26 * f28;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            p.I(fArr, -this.f18987k, -this.f18988l);
            this.f18992q = false;
        }
        if (this.f18981e) {
            if (!this.f18980d.isEmpty()) {
                e eVar = this.f18983g;
                if (eVar == null) {
                    eVar = new e();
                    this.f18983g = eVar;
                } else {
                    eVar.f19062a.clear();
                }
                v0.h hVar = this.f18982f;
                if (hVar == null) {
                    hVar = m0.b.k();
                    this.f18982f = hVar;
                } else {
                    hVar.l();
                }
                List<? extends d> list = this.f18980d;
                v7.g.f(list, "nodes");
                eVar.f19062a.addAll(list);
                eVar.c(hVar);
            }
            this.f18981e = false;
        }
        a.b N = fVar.N();
        long a10 = N.a();
        N.b().m();
        float[] fArr2 = this.f18979b;
        x0.b bVar = N.f18556a;
        if (fArr2 != null) {
            bVar.e(fArr2);
        }
        v0.h hVar2 = this.f18982f;
        if ((!this.f18980d.isEmpty()) && hVar2 != null) {
            bVar.a(hVar2, 1);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) arrayList.get(i10)).a(fVar);
        }
        N.b().l();
        N.c(a10);
    }

    @Override // z0.f
    public final u7.a<m7.n> b() {
        return this.f18984h;
    }

    @Override // z0.f
    public final void d(u7.a<m7.n> aVar) {
        this.f18984h = aVar;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) arrayList.get(i10)).d(aVar);
        }
    }

    public final void e(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ArrayList arrayList = this.c;
            if (i10 < arrayList.size()) {
                ((f) arrayList.get(i10)).d(null);
                arrayList.remove(i10);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f18985i);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append("\t");
            sb.append(((f) arrayList.get(i10)).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
