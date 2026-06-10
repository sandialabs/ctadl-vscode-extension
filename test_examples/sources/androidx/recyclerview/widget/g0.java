package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final p.h<RecyclerView.b0, a> f5857a = new p.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final p.e<RecyclerView.b0> f5858b = new p.e<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final h1.c f5859d = new h1.c(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f5860a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f5861b;
        public RecyclerView.i.c c;

        public static a a() {
            a aVar = (a) f5859d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    public final RecyclerView.i.c a(RecyclerView.b0 b0Var, int i10) {
        a k3;
        RecyclerView.i.c cVar;
        p.h<RecyclerView.b0, a> hVar = this.f5857a;
        int e10 = hVar.e(b0Var);
        if (e10 >= 0 && (k3 = hVar.k(e10)) != null) {
            int i11 = k3.f5860a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                k3.f5860a = i12;
                if (i10 == 4) {
                    cVar = k3.f5861b;
                } else if (i10 == 8) {
                    cVar = k3.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    hVar.j(e10);
                    k3.f5860a = 0;
                    k3.f5861b = null;
                    k3.c = null;
                    a.f5859d.b(k3);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void b(RecyclerView.b0 b0Var) {
        a orDefault = this.f5857a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f5860a &= -2;
    }

    public final void c(RecyclerView.b0 b0Var) {
        p.e<RecyclerView.b0> eVar = this.f5858b;
        int L = eVar.L() - 1;
        while (true) {
            if (L < 0) {
                break;
            } else if (b0Var == eVar.M(L)) {
                Object[] objArr = eVar.f16555k;
                Object obj = objArr[L];
                Object obj2 = p.e.f16552m;
                if (obj != obj2) {
                    objArr[L] = obj2;
                    eVar.f16553i = true;
                }
            } else {
                L--;
            }
        }
        a remove = this.f5857a.remove(b0Var);
        if (remove != null) {
            remove.f5860a = 0;
            remove.f5861b = null;
            remove.c = null;
            a.f5859d.b(remove);
        }
    }
}
