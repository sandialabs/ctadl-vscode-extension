package g1;

import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final h0.e<i> f11158a = new h0.e<>(new i[16]);

    public boolean a(Map<n, o> map, j1.h hVar, f fVar, boolean z10) {
        v7.g.f(map, "changes");
        v7.g.f(hVar, "parentCoordinates");
        h0.e<i> eVar = this.f11158a;
        int i10 = eVar.f11334k;
        if (i10 <= 0) {
            return false;
        }
        i[] iVarArr = eVar.f11332i;
        v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        boolean z11 = false;
        do {
            if (!iVarArr[i11].a(map, hVar, fVar, z10) && !z11) {
                z11 = false;
                i11++;
            }
            z11 = true;
            i11++;
        } while (i11 < i10);
        return z11;
    }

    public void b(f fVar) {
        boolean z10;
        h0.e<i> eVar = this.f11158a;
        for (int i10 = eVar.f11334k - 1; -1 < i10; i10--) {
            if (eVar.f11332i[i10].c.f11334k == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                eVar.n(i10);
            }
        }
    }

    public void c() {
        h0.e<i> eVar = this.f11158a;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            i[] iVarArr = eVar.f11332i;
            v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                iVarArr[i11].c();
                i11++;
            } while (i11 < i10);
        }
    }

    public boolean d(f fVar) {
        h0.e<i> eVar = this.f11158a;
        int i10 = eVar.f11334k;
        boolean z10 = false;
        if (i10 > 0) {
            i[] iVarArr = eVar.f11332i;
            v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            boolean z11 = false;
            do {
                if (!iVarArr[i11].d(fVar) && !z11) {
                    z11 = false;
                    i11++;
                }
                z11 = true;
                i11++;
            } while (i11 < i10);
            z10 = z11;
        }
        b(fVar);
        return z10;
    }

    public boolean e(Map<n, o> map, j1.h hVar, f fVar, boolean z10) {
        v7.g.f(map, "changes");
        v7.g.f(hVar, "parentCoordinates");
        h0.e<i> eVar = this.f11158a;
        int i10 = eVar.f11334k;
        if (i10 <= 0) {
            return false;
        }
        i[] iVarArr = eVar.f11332i;
        v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        boolean z11 = false;
        do {
            if (!iVarArr[i11].e(map, hVar, fVar, z10) && !z11) {
                z11 = false;
                i11++;
            }
            z11 = true;
            i11++;
        } while (i11 < i10);
        return z11;
    }

    public final void f() {
        int i10 = 0;
        while (true) {
            h0.e<i> eVar = this.f11158a;
            if (i10 < eVar.f11334k) {
                i iVar = eVar.f11332i[i10];
                if (!m0.b.A0(iVar.f11151b)) {
                    eVar.n(i10);
                    iVar.c();
                } else {
                    i10++;
                    iVar.f();
                }
            } else {
                return;
            }
        }
    }
}
