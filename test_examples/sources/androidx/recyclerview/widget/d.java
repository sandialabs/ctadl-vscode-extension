package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f5810a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5811b = new a();
    public final ArrayList c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5812a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f5813b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f5812a &= ~(1 << i10);
                return;
            }
            a aVar = this.f5813b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public final int b(int i10) {
            long j2;
            a aVar = this.f5813b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j2 = this.f5812a;
                    return Long.bitCount(j2);
                }
            } else if (i10 >= 64) {
                return Long.bitCount(this.f5812a) + aVar.b(i10 - 64);
            }
            j2 = this.f5812a & ((1 << i10) - 1);
            return Long.bitCount(j2);
        }

        public final void c() {
            if (this.f5813b == null) {
                this.f5813b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f5812a & (1 << i10)) != 0;
            }
            c();
            return this.f5813b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f5813b.e(i10 - 64, z10);
                return;
            }
            long j2 = this.f5812a;
            boolean z11 = (Long.MIN_VALUE & j2) != 0;
            long j10 = (1 << i10) - 1;
            this.f5812a = ((j2 & (~j10)) << 1) | (j2 & j10);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f5813b != null) {
                c();
                this.f5813b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f5813b.f(i10 - 64);
            }
            long j2 = 1 << i10;
            long j10 = this.f5812a;
            boolean z10 = (j10 & j2) != 0;
            long j11 = j10 & (~j2);
            this.f5812a = j11;
            long j12 = j2 - 1;
            this.f5812a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f5813b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f5813b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f5812a = 0L;
            a aVar = this.f5813b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f5812a |= 1 << i10;
                return;
            }
            c();
            this.f5813b.h(i10 - 64);
        }

        public final String toString() {
            if (this.f5813b == null) {
                return Long.toBinaryString(this.f5812a);
            }
            return this.f5813b.toString() + "xx" + Long.toBinaryString(this.f5812a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public d(z zVar) {
        this.f5810a = zVar;
    }

    public final void a(View view, int i10, boolean z10) {
        int f10;
        b bVar = this.f5810a;
        if (i10 < 0) {
            f10 = ((z) bVar).a();
        } else {
            f10 = f(i10);
        }
        this.f5811b.e(f10, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = ((z) bVar).f6000a;
        recyclerView.addView(view, f10);
        RecyclerView.b0 L = RecyclerView.L(view);
        RecyclerView.Adapter adapter = recyclerView.f5641u;
        if (adapter != null && L != null) {
            adapter.m(L);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.n) recyclerView.L.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f10;
        b bVar = this.f5810a;
        if (i10 < 0) {
            f10 = ((z) bVar).a();
        } else {
            f10 = f(i10);
        }
        this.f5811b.e(f10, z10);
        if (z10) {
            i(view);
        }
        z zVar = (z) bVar;
        zVar.getClass();
        RecyclerView.b0 L = RecyclerView.L(view);
        RecyclerView recyclerView = zVar.f6000a;
        if (L != null) {
            if (!L.m() && !L.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + L + recyclerView.A());
            }
            L.f5674j &= -257;
        }
        recyclerView.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.b0 L;
        int f10 = f(i10);
        this.f5811b.f(f10);
        z zVar = (z) this.f5810a;
        View childAt = zVar.f6000a.getChildAt(f10);
        RecyclerView recyclerView = zVar.f6000a;
        if (childAt != null && (L = RecyclerView.L(childAt)) != null) {
            if (L.m() && !L.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + L + recyclerView.A());
            }
            L.b(256);
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((z) this.f5810a).f6000a.getChildAt(f(i10));
    }

    public final int e() {
        return ((z) this.f5810a).a() - this.c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((z) this.f5810a).a();
        int i11 = i10;
        while (i11 < a10) {
            a aVar = this.f5811b;
            int b5 = i10 - (i11 - aVar.b(i11));
            if (b5 == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b5;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((z) this.f5810a).f6000a.getChildAt(i10);
    }

    public final int h() {
        return ((z) this.f5810a).a();
    }

    public final void i(View view) {
        this.c.add(view);
        z zVar = (z) this.f5810a;
        zVar.getClass();
        RecyclerView.b0 L = RecyclerView.L(view);
        if (L != null) {
            int i10 = L.f5680q;
            View view2 = L.f5666a;
            if (i10 == -1) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                i10 = j0.d.c(view2);
            }
            L.f5679p = i10;
            RecyclerView recyclerView = zVar.f6000a;
            if (recyclerView.N()) {
                L.f5680q = 4;
                recyclerView.D0.add(L);
                return;
            }
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            j0.d.s(view2, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((z) this.f5810a).f6000a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        a aVar = this.f5811b;
        if (aVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - aVar.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.c.contains(view);
    }

    public final void l(int i10) {
        int f10 = f(i10);
        z zVar = (z) this.f5810a;
        View childAt = zVar.f6000a.getChildAt(f10);
        if (childAt == null) {
            return;
        }
        if (this.f5811b.f(f10)) {
            m(childAt);
        }
        zVar.b(f10);
    }

    public final void m(View view) {
        if (this.c.remove(view)) {
            z zVar = (z) this.f5810a;
            zVar.getClass();
            RecyclerView.b0 L = RecyclerView.L(view);
            if (L != null) {
                int i10 = L.f5679p;
                RecyclerView recyclerView = zVar.f6000a;
                if (recyclerView.N()) {
                    L.f5680q = i10;
                    recyclerView.D0.add(L);
                } else {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.s(L.f5666a, i10);
                }
                L.f5679p = 0;
            }
        }
    }

    public final String toString() {
        return this.f5811b.toString() + ", hidden list:" + this.c.size();
    }
}
