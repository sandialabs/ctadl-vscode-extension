package z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends g0.a<f> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar) {
        super(bVar);
        v7.g.f(bVar, "root");
    }

    public static b k(f fVar) {
        if (fVar instanceof b) {
            return (b) fVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // g0.c
    public final void b(int i10, Object obj) {
        v7.g.f((f) obj, "instance");
    }

    @Override // g0.c
    public final void e(int i10, Object obj) {
        f fVar = (f) obj;
        v7.g.f(fVar, "instance");
        b k3 = k((f) this.c);
        k3.getClass();
        ArrayList arrayList = k3.c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, fVar);
        } else {
            arrayList.add(fVar);
        }
        fVar.d(k3.f18984h);
        k3.c();
    }

    @Override // g0.c
    public final void g(int i10, int i11, int i12) {
        b k3 = k((f) this.c);
        ArrayList arrayList = k3.c;
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                arrayList.remove(i10);
                arrayList.add(i11, (f) arrayList.get(i10));
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                arrayList.remove(i10);
                arrayList.add(i11 - 1, (f) arrayList.get(i10));
                i13++;
            }
        }
        k3.c();
    }

    @Override // g0.c
    public final void h(int i10, int i11) {
        k((f) this.c).e(i10, i11);
    }

    @Override // g0.a
    public final void j() {
        b k3 = k((f) this.f11026a);
        k3.e(0, k3.c.size());
    }
}
