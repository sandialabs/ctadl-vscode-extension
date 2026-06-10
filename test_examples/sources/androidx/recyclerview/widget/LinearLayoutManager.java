package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.n;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.l implements n.g, RecyclerView.w.b {
    public d A;
    public final a B;
    public final b C;
    public final int D;
    public final int[] E;

    /* renamed from: q  reason: collision with root package name */
    public int f5580q;

    /* renamed from: r  reason: collision with root package name */
    public c f5581r;

    /* renamed from: s  reason: collision with root package name */
    public w f5582s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5583t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5584u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5585v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5586w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f5587x;

    /* renamed from: y  reason: collision with root package name */
    public int f5588y;

    /* renamed from: z  reason: collision with root package name */
    public int f5589z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public w f5590a;

        /* renamed from: b  reason: collision with root package name */
        public int f5591b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5592d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5593e;

        public a() {
            c();
        }

        public final void a(View view, int i10) {
            if (this.f5592d) {
                this.c = this.f5590a.m() + this.f5590a.b(view);
            } else {
                this.c = this.f5590a.e(view);
            }
            this.f5591b = i10;
        }

        public final void b(View view, int i10) {
            int min;
            int m10 = this.f5590a.m();
            if (m10 >= 0) {
                a(view, i10);
                return;
            }
            this.f5591b = i10;
            if (this.f5592d) {
                int g10 = (this.f5590a.g() - m10) - this.f5590a.b(view);
                this.c = this.f5590a.g() - g10;
                if (g10 <= 0) {
                    return;
                }
                int c = this.c - this.f5590a.c(view);
                int k3 = this.f5590a.k();
                int min2 = c - (Math.min(this.f5590a.e(view) - k3, 0) + k3);
                if (min2 >= 0) {
                    return;
                }
                min = Math.min(g10, -min2) + this.c;
            } else {
                int e10 = this.f5590a.e(view);
                int k10 = e10 - this.f5590a.k();
                this.c = e10;
                if (k10 <= 0) {
                    return;
                }
                int g11 = (this.f5590a.g() - Math.min(0, (this.f5590a.g() - m10) - this.f5590a.b(view))) - (this.f5590a.c(view) + e10);
                if (g11 >= 0) {
                    return;
                }
                min = this.c - Math.min(k10, -g11);
            }
            this.c = min;
        }

        public final void c() {
            this.f5591b = -1;
            this.c = Integer.MIN_VALUE;
            this.f5592d = false;
            this.f5593e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f5591b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f5592d + ", mValid=" + this.f5593e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5594a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5595b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5596d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f5598b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5599d;

        /* renamed from: e  reason: collision with root package name */
        public int f5600e;

        /* renamed from: f  reason: collision with root package name */
        public int f5601f;

        /* renamed from: g  reason: collision with root package name */
        public int f5602g;

        /* renamed from: j  reason: collision with root package name */
        public int f5605j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5607l;

        /* renamed from: a  reason: collision with root package name */
        public boolean f5597a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f5603h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f5604i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.b0> f5606k = null;

        public final void a(View view) {
            int c;
            int c10;
            int size = this.f5606k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f5606k.get(i11).f5666a;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.e() && (c10 = (mVar.c() - this.f5599d) * this.f5600e) >= 0 && c10 < i10) {
                    view2 = view3;
                    if (c10 == 0) {
                        break;
                    }
                    i10 = c10;
                }
            }
            if (view2 == null) {
                c = -1;
            } else {
                c = ((RecyclerView.m) view2.getLayoutParams()).c();
            }
            this.f5599d = c;
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.b0> list = this.f5606k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f5606k.get(i10).f5666a;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.e() && this.f5599d == mVar.c()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View d5 = sVar.d(this.f5599d);
            this.f5599d += this.f5600e;
            return d5;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public int f5608i;

        /* renamed from: j  reason: collision with root package name */
        public int f5609j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5610k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f5608i = parcel.readInt();
            this.f5609j = parcel.readInt();
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f5610k = z10;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f5608i = dVar.f5608i;
            this.f5609j = dVar.f5609j;
            this.f5610k = dVar.f5610k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5608i);
            parcel.writeInt(this.f5609j);
            parcel.writeInt(this.f5610k ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i10) {
        this.f5580q = 1;
        this.f5584u = false;
        this.f5585v = false;
        this.f5586w = false;
        this.f5587x = true;
        this.f5588y = -1;
        this.f5589z = Integer.MIN_VALUE;
        this.A = null;
        this.B = new a();
        this.C = new b();
        this.D = 2;
        this.E = new int[2];
        k1(i10);
        e(null);
        if (this.f5584u) {
            this.f5584u = false;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean E0() {
        boolean z10;
        if (this.n == 1073741824 || this.f5703m == 1073741824) {
            return false;
        }
        int A = A();
        int i10 = 0;
        while (true) {
            if (i10 < A) {
                ViewGroup.LayoutParams layoutParams = z(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public void G0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.f5729a = i10;
        H0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean I0() {
        return this.A == null && this.f5583t == this.f5586w;
    }

    public void J0(RecyclerView.x xVar, int[] iArr) {
        boolean z10;
        int i10;
        int i11;
        if (xVar.f5742a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = this.f5582s.l();
        } else {
            i10 = 0;
        }
        if (this.f5581r.f5601f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void K0(RecyclerView.x xVar, c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f5599d;
        if (i10 < 0 || i10 >= xVar.b()) {
            return;
        }
        ((m.b) cVar2).a(i10, Math.max(0, cVar.f5602g));
    }

    public final int L0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        P0();
        w wVar = this.f5582s;
        boolean z10 = !this.f5587x;
        return c0.a(xVar, wVar, S0(z10), R0(z10), this, this.f5587x);
    }

    public final int M0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        P0();
        w wVar = this.f5582s;
        boolean z10 = !this.f5587x;
        return c0.b(xVar, wVar, S0(z10), R0(z10), this, this.f5587x, this.f5585v);
    }

    public final int N0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        P0();
        w wVar = this.f5582s;
        boolean z10 = !this.f5587x;
        return c0.c(xVar, wVar, S0(z10), R0(z10), this, this.f5587x);
    }

    public final int O0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f5580q == 1) ? 1 : Integer.MIN_VALUE : this.f5580q == 0 ? 1 : Integer.MIN_VALUE : this.f5580q == 1 ? -1 : Integer.MIN_VALUE : this.f5580q == 0 ? -1 : Integer.MIN_VALUE : (this.f5580q != 1 && c1()) ? -1 : 1 : (this.f5580q != 1 && c1()) ? 1 : -1;
    }

    public final void P0() {
        if (this.f5581r == null) {
            this.f5581r = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean Q() {
        return true;
    }

    public final int Q0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z10) {
        boolean z11;
        int i10 = cVar.c;
        int i11 = cVar.f5602g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f5602g = i11 + i10;
            }
            f1(sVar, cVar);
        }
        int i12 = cVar.c + cVar.f5603h;
        while (true) {
            if (!cVar.f5607l && i12 <= 0) {
                break;
            }
            int i13 = cVar.f5599d;
            if (i13 >= 0 && i13 < xVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            b bVar = this.C;
            bVar.f5594a = 0;
            bVar.f5595b = false;
            bVar.c = false;
            bVar.f5596d = false;
            d1(sVar, xVar, cVar, bVar);
            if (!bVar.f5595b) {
                int i14 = cVar.f5598b;
                int i15 = bVar.f5594a;
                cVar.f5598b = (cVar.f5601f * i15) + i14;
                if (!bVar.c || cVar.f5606k != null || !xVar.f5747g) {
                    cVar.c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f5602g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f5602g = i17;
                    int i18 = cVar.c;
                    if (i18 < 0) {
                        cVar.f5602g = i17 + i18;
                    }
                    f1(sVar, cVar);
                }
                if (z10 && bVar.f5596d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.c;
    }

    public final View R0(boolean z10) {
        int A;
        int i10;
        if (this.f5585v) {
            i10 = A();
            A = 0;
        } else {
            A = A() - 1;
            i10 = -1;
        }
        return W0(A, i10, z10, true);
    }

    public final View S0(boolean z10) {
        int A;
        int i10;
        if (this.f5585v) {
            A = -1;
            i10 = A() - 1;
        } else {
            A = A();
            i10 = 0;
        }
        return W0(i10, A, z10, true);
    }

    public final int T0() {
        View W0 = W0(0, A(), false, true);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.l.K(W0);
    }

    public final int U0() {
        View W0 = W0(A() - 1, -1, false, true);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.l.K(W0);
    }

    public final View V0(int i10, int i11) {
        int i12;
        int i13;
        P0();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return z(i10);
        }
        if (this.f5582s.e(z(i10)) < this.f5582s.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return (this.f5580q == 0 ? this.c : this.f5694d).a(i10, i11, i12, i13);
    }

    public final View W0(int i10, int i11, boolean z10, boolean z11) {
        P0();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return (this.f5580q == 0 ? this.c : this.f5694d).a(i10, i11, i13, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r14 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r9 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View X0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        P0();
        int A = A();
        if (z11) {
            i11 = A() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = A;
            i11 = 0;
            i12 = 1;
        }
        int b5 = xVar.b();
        int k3 = this.f5582s.k();
        int g10 = this.f5582s.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View z12 = z(i11);
            int K = RecyclerView.l.K(z12);
            int e10 = this.f5582s.e(z12);
            int b10 = this.f5582s.b(z12);
            if (K >= 0 && K < b5) {
                if (!((RecyclerView.m) z12.getLayoutParams()).e()) {
                    boolean z13 = b10 <= k3 && e10 < k3;
                    boolean z14 = e10 >= g10 && b10 > g10;
                    if (!z13 && !z14) {
                        return z12;
                    }
                    if (!z13) {
                        if (view != null) {
                        }
                        view = z12;
                    }
                    view2 = z12;
                } else if (view3 == null) {
                    view3 = z12;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public final void Y(RecyclerView recyclerView) {
    }

    public final int Y0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int g11 = this.f5582s.g() - i10;
        if (g11 > 0) {
            int i11 = -i1(-g11, sVar, xVar);
            int i12 = i10 + i11;
            if (!z10 || (g10 = this.f5582s.g() - i12) <= 0) {
                return i11;
            }
            this.f5582s.p(g10);
            return g10 + i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public View Z(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int O0;
        View V0;
        View a12;
        h1();
        if (A() == 0 || (O0 = O0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        P0();
        m1(O0, (int) (this.f5582s.l() * 0.33333334f), false, xVar);
        c cVar = this.f5581r;
        cVar.f5602g = Integer.MIN_VALUE;
        cVar.f5597a = false;
        Q0(sVar, cVar, xVar, true);
        if (O0 == -1) {
            if (this.f5585v) {
                V0 = V0(A() - 1, -1);
            } else {
                V0 = V0(0, A());
            }
        } else if (this.f5585v) {
            V0 = V0(0, A());
        } else {
            V0 = V0(A() - 1, -1);
        }
        if (O0 == -1) {
            a12 = b1();
        } else {
            a12 = a1();
        }
        if (a12.hasFocusable()) {
            if (V0 == null) {
                return null;
            }
            return a12;
        }
        return V0;
    }

    public final int Z0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k3;
        int k10 = i10 - this.f5582s.k();
        if (k10 > 0) {
            int i11 = -i1(k10, sVar, xVar);
            int i12 = i10 + i11;
            if (!z10 || (k3 = i12 - this.f5582s.k()) <= 0) {
                return i11;
            }
            this.f5582s.p(-k3);
            return i11 - k3;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    @SuppressLint({"UnknownNullness"})
    public PointF a(int i10) {
        if (A() == 0) {
            return null;
        }
        int i11 = (i10 < RecyclerView.l.K(z(0))) != this.f5585v ? -1 : 1;
        return this.f5580q == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (A() > 0) {
            accessibilityEvent.setFromIndex(T0());
            accessibilityEvent.setToIndex(U0());
        }
    }

    public final View a1() {
        return z(this.f5585v ? 0 : A() - 1);
    }

    @Override // androidx.recyclerview.widget.n.g
    public final void b(View view, View view2) {
        int e10;
        e("Cannot drop a view during a scroll or layout calculation");
        P0();
        h1();
        int K = RecyclerView.l.K(view);
        int K2 = RecyclerView.l.K(view2);
        char c10 = K < K2 ? (char) 1 : (char) 65535;
        if (this.f5585v) {
            if (c10 == 1) {
                j1(K2, this.f5582s.g() - (this.f5582s.c(view) + this.f5582s.e(view2)));
                return;
            }
            e10 = this.f5582s.g() - this.f5582s.b(view2);
        } else if (c10 != 65535) {
            j1(K2, this.f5582s.b(view2) - this.f5582s.c(view));
            return;
        } else {
            e10 = this.f5582s.e(view2);
        }
        j1(K2, e10);
    }

    public final View b1() {
        return z(this.f5585v ? A() - 1 : 0);
    }

    public final boolean c1() {
        return E() == 1;
    }

    public void d1(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        boolean z10;
        int d5;
        int i10;
        int i11;
        int i12;
        int H;
        int i13;
        boolean z11;
        View b5 = cVar.b(sVar);
        if (b5 == null) {
            bVar.f5595b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) b5.getLayoutParams();
        if (cVar.f5606k == null) {
            boolean z12 = this.f5585v;
            if (cVar.f5601f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                c(b5);
            } else {
                d(b5, 0, false);
            }
        } else {
            boolean z13 = this.f5585v;
            if (cVar.f5601f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                d(b5, -1, true);
            } else {
                d(b5, 0, true);
            }
        }
        T(b5);
        bVar.f5594a = this.f5582s.c(b5);
        if (this.f5580q == 1) {
            if (c1()) {
                i12 = this.f5704o - I();
                H = i12 - this.f5582s.d(b5);
            } else {
                H = H();
                i12 = this.f5582s.d(b5) + H;
            }
            int i14 = cVar.f5601f;
            i11 = cVar.f5598b;
            if (i14 == -1) {
                i13 = H;
                d5 = i11;
                i11 -= bVar.f5594a;
            } else {
                i13 = H;
                d5 = bVar.f5594a + i11;
            }
            i10 = i13;
        } else {
            int J = J();
            d5 = this.f5582s.d(b5) + J;
            int i15 = cVar.f5601f;
            int i16 = cVar.f5598b;
            if (i15 == -1) {
                i10 = i16 - bVar.f5594a;
                i12 = i16;
                i11 = J;
            } else {
                int i17 = bVar.f5594a + i16;
                i10 = i16;
                i11 = J;
                i12 = i17;
            }
        }
        RecyclerView.l.S(b5, i10, i11, i12, d5);
        if (mVar.e() || mVar.d()) {
            bVar.c = true;
        }
        bVar.f5596d = b5.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public final void e(String str) {
        if (this.A == null) {
            super.e(str);
        }
    }

    public void e1(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i10) {
    }

    public final void f1(RecyclerView.s sVar, c cVar) {
        if (cVar.f5597a && !cVar.f5607l) {
            int i10 = cVar.f5602g;
            int i11 = cVar.f5604i;
            if (cVar.f5601f == -1) {
                int A = A();
                if (i10 >= 0) {
                    int f10 = (this.f5582s.f() - i10) + i11;
                    if (this.f5585v) {
                        for (int i12 = 0; i12 < A; i12++) {
                            View z10 = z(i12);
                            if (this.f5582s.e(z10) >= f10 && this.f5582s.o(z10) >= f10) {
                            }
                            g1(sVar, 0, i12);
                            return;
                        }
                        return;
                    }
                    int i13 = A - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View z11 = z(i14);
                        if (this.f5582s.e(z11) >= f10 && this.f5582s.o(z11) >= f10) {
                        }
                        g1(sVar, i13, i14);
                        return;
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int A2 = A();
                if (this.f5585v) {
                    int i16 = A2 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View z12 = z(i17);
                        if (this.f5582s.b(z12) <= i15 && this.f5582s.n(z12) <= i15) {
                        }
                        g1(sVar, i16, i17);
                        return;
                    }
                    return;
                }
                for (int i18 = 0; i18 < A2; i18++) {
                    View z13 = z(i18);
                    if (this.f5582s.b(z13) <= i15 && this.f5582s.n(z13) <= i15) {
                    }
                    g1(sVar, 0, i18);
                    return;
                }
            }
        }
    }

    public final void g1(RecyclerView.s sVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View z10 = z(i10);
                if (z(i10) != null) {
                    this.f5692a.l(i10);
                }
                sVar.i(z10);
                i10--;
            }
            return;
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                View z11 = z(i11);
                if (z(i11) != null) {
                    this.f5692a.l(i11);
                }
                sVar.i(z11);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean h() {
        return this.f5580q == 0;
    }

    public final void h1() {
        boolean z10;
        if (this.f5580q != 1 && c1()) {
            z10 = !this.f5584u;
            this.f5585v = z10;
        }
        z10 = this.f5584u;
        this.f5585v = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean i() {
        return this.f5580q == 1;
    }

    public final int i1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (A() != 0 && i10 != 0) {
            P0();
            this.f5581r.f5597a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int abs = Math.abs(i10);
            m1(i11, abs, true, xVar);
            c cVar = this.f5581r;
            int Q0 = Q0(sVar, cVar, xVar, false) + cVar.f5602g;
            if (Q0 < 0) {
                return 0;
            }
            if (abs > Q0) {
                i10 = i11 * Q0;
            }
            this.f5582s.p(-i10);
            this.f5581r.f5605j = i10;
            return i10;
        }
        return 0;
    }

    public void j1(int i10, int i11) {
        this.f5588y = i10;
        this.f5589z = i11;
        d dVar = this.A;
        if (dVar != null) {
            dVar.f5608i = -1;
        }
        u0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x02c5, code lost:
        if (r17.f5585v != false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k0(RecyclerView.s sVar, RecyclerView.x xVar) {
        View focusedChild;
        a aVar;
        boolean z10;
        View focusedChild2;
        boolean z11;
        boolean z12;
        View X0;
        int e10;
        int b5;
        int k3;
        int g10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int k10;
        int i10;
        d dVar;
        int k11;
        int i11;
        int g11;
        int i12;
        boolean z17;
        boolean z18;
        int k12;
        int e11;
        int i13;
        boolean z19;
        c cVar;
        int i14;
        int i15;
        boolean z20;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int i20;
        ?? r42;
        List<RecyclerView.b0> list;
        boolean z21;
        char c10;
        int i21;
        int i22;
        int Y0;
        int i23;
        View u10;
        int e12;
        int i24;
        int i25;
        boolean z22;
        if ((this.A != null || this.f5588y != -1) && xVar.b() == 0) {
            r0(sVar);
            return;
        }
        d dVar2 = this.A;
        if (dVar2 != null) {
            int i26 = dVar2.f5608i;
            if (i26 >= 0) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (z22) {
                this.f5588y = i26;
            }
        }
        P0();
        this.f5581r.f5597a = false;
        h1();
        RecyclerView recyclerView = this.f5693b;
        if (recyclerView != null) {
            focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                if (this.f5692a.k(focusedChild)) {
                }
                aVar = this.B;
                if (aVar.f5593e && this.f5588y == -1 && this.A == null) {
                    if (focusedChild != null && (this.f5582s.e(focusedChild) >= this.f5582s.g() || this.f5582s.b(focusedChild) <= this.f5582s.k())) {
                        aVar.b(focusedChild, RecyclerView.l.K(focusedChild));
                    }
                    cVar = this.f5581r;
                    if (cVar.f5605j < 0) {
                        i14 = 1;
                    } else {
                        i14 = -1;
                    }
                    cVar.f5601f = i14;
                    int[] iArr = this.E;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    J0(xVar, iArr);
                    int k13 = this.f5582s.k() + Math.max(0, iArr[0]);
                    int h10 = this.f5582s.h() + Math.max(0, iArr[1]);
                    if (xVar.f5747g && (i23 = this.f5588y) != -1 && this.f5589z != Integer.MIN_VALUE && (u10 = u(i23)) != null) {
                        if (!this.f5585v) {
                            i24 = this.f5582s.g() - this.f5582s.b(u10);
                            e12 = this.f5589z;
                        } else {
                            e12 = this.f5582s.e(u10) - this.f5582s.k();
                            i24 = this.f5589z;
                        }
                        i25 = i24 - e12;
                        if (i25 <= 0) {
                            k13 += i25;
                        } else {
                            h10 -= i25;
                        }
                    }
                    if (!aVar.f5592d) {
                        if (this.f5585v) {
                            i15 = 1;
                        }
                        i15 = -1;
                    }
                    e1(sVar, xVar, aVar, i15);
                    t(sVar);
                    c cVar2 = this.f5581r;
                    if (this.f5582s.i() != 0 && this.f5582s.f() == 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    cVar2.f5607l = z20;
                    this.f5581r.getClass();
                    this.f5581r.f5604i = 0;
                    if (!aVar.f5592d) {
                        o1(aVar.f5591b, aVar.c);
                        c cVar3 = this.f5581r;
                        cVar3.f5603h = k13;
                        Q0(sVar, cVar3, xVar, false);
                        c cVar4 = this.f5581r;
                        i17 = cVar4.f5598b;
                        int i27 = cVar4.f5599d;
                        int i28 = cVar4.c;
                        if (i28 > 0) {
                            h10 += i28;
                        }
                        n1(aVar.f5591b, aVar.c);
                        c cVar5 = this.f5581r;
                        cVar5.f5603h = h10;
                        cVar5.f5599d += cVar5.f5600e;
                        Q0(sVar, cVar5, xVar, false);
                        c cVar6 = this.f5581r;
                        i16 = cVar6.f5598b;
                        int i29 = cVar6.c;
                        if (i29 > 0) {
                            o1(i27, i17);
                            c cVar7 = this.f5581r;
                            cVar7.f5603h = i29;
                            Q0(sVar, cVar7, xVar, false);
                            i17 = this.f5581r.f5598b;
                        }
                    } else {
                        n1(aVar.f5591b, aVar.c);
                        c cVar8 = this.f5581r;
                        cVar8.f5603h = h10;
                        Q0(sVar, cVar8, xVar, false);
                        c cVar9 = this.f5581r;
                        i16 = cVar9.f5598b;
                        int i30 = cVar9.f5599d;
                        int i31 = cVar9.c;
                        if (i31 > 0) {
                            k13 += i31;
                        }
                        o1(aVar.f5591b, aVar.c);
                        c cVar10 = this.f5581r;
                        cVar10.f5603h = k13;
                        cVar10.f5599d += cVar10.f5600e;
                        Q0(sVar, cVar10, xVar, false);
                        c cVar11 = this.f5581r;
                        int i32 = cVar11.f5598b;
                        int i33 = cVar11.c;
                        if (i33 > 0) {
                            n1(i30, i16);
                            c cVar12 = this.f5581r;
                            cVar12.f5603h = i33;
                            Q0(sVar, cVar12, xVar, false);
                            i16 = this.f5581r.f5598b;
                        }
                        i17 = i32;
                    }
                    if (A() > 0) {
                        if (this.f5585v ^ this.f5586w) {
                            int Y02 = Y0(i16, sVar, xVar, true);
                            i21 = i17 + Y02;
                            i22 = i16 + Y02;
                            Y0 = Z0(i21, sVar, xVar, false);
                        } else {
                            int Z0 = Z0(i17, sVar, xVar, true);
                            i21 = i17 + Z0;
                            i22 = i16 + Z0;
                            Y0 = Y0(i22, sVar, xVar, false);
                        }
                        i17 = i21 + Y0;
                        i16 = i22 + Y0;
                    }
                    if (xVar.f5751k && A() != 0 && !xVar.f5747g && I0()) {
                        List<RecyclerView.b0> list2 = sVar.f5722d;
                        size = list2.size();
                        int K = RecyclerView.l.K(z(0));
                        i19 = 0;
                        i20 = 0;
                        for (i18 = 0; i18 < size; i18++) {
                            RecyclerView.b0 b0Var = list2.get(i18);
                            if (!b0Var.k()) {
                                if (b0Var.e() < K) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (z21 != this.f5585v) {
                                    c10 = 65535;
                                } else {
                                    c10 = 1;
                                }
                                int c11 = this.f5582s.c(b0Var.f5666a);
                                if (c10 == 65535) {
                                    i19 += c11;
                                } else {
                                    i20 += c11;
                                }
                            }
                        }
                        this.f5581r.f5606k = list2;
                        if (i19 <= 0) {
                            o1(RecyclerView.l.K(b1()), i17);
                            c cVar13 = this.f5581r;
                            cVar13.f5603h = i19;
                            r42 = 0;
                            cVar13.c = 0;
                            cVar13.a(null);
                            Q0(sVar, this.f5581r, xVar, false);
                        } else {
                            r42 = 0;
                        }
                        if (i20 <= 0) {
                            n1(RecyclerView.l.K(a1()), i16);
                            c cVar14 = this.f5581r;
                            cVar14.f5603h = i20;
                            cVar14.c = r42;
                            list = null;
                            cVar14.a(null);
                            Q0(sVar, this.f5581r, xVar, r42);
                        } else {
                            list = null;
                        }
                        this.f5581r.f5606k = list;
                    }
                    if (xVar.f5747g) {
                        w wVar = this.f5582s;
                        wVar.f5997b = wVar.l();
                    } else {
                        aVar.c();
                    }
                    this.f5583t = this.f5586w;
                }
                aVar.c();
                aVar.f5592d = this.f5585v ^ this.f5586w;
                if (!xVar.f5747g && (i10 = this.f5588y) != -1) {
                    if (i10 >= 0 && i10 < xVar.b()) {
                        int i34 = this.f5588y;
                        aVar.f5591b = i34;
                        dVar = this.A;
                        if (dVar != null) {
                            if (dVar.f5608i >= 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                boolean z23 = dVar.f5610k;
                                aVar.f5592d = z23;
                                if (z23) {
                                    g11 = this.f5582s.g();
                                    i12 = this.A.f5609j;
                                    i13 = g11 - i12;
                                    aVar.c = i13;
                                    z10 = true;
                                    if (!z10) {
                                        if (A() != 0) {
                                            RecyclerView recyclerView2 = this.f5693b;
                                            if (recyclerView2 != null) {
                                                focusedChild2 = recyclerView2.getFocusedChild();
                                                if (focusedChild2 != null) {
                                                    if (!this.f5692a.k(focusedChild2)) {
                                                    }
                                                    if (focusedChild2 != null) {
                                                        RecyclerView.m mVar = (RecyclerView.m) focusedChild2.getLayoutParams();
                                                        if (!mVar.e() && mVar.c() >= 0 && mVar.c() < xVar.b()) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (z16) {
                                                            aVar.b(focusedChild2, RecyclerView.l.K(focusedChild2));
                                                            z15 = true;
                                                            if (!z15) {
                                                                if (aVar.f5592d) {
                                                                    k10 = aVar.f5590a.g();
                                                                } else {
                                                                    k10 = aVar.f5590a.k();
                                                                }
                                                                aVar.c = k10;
                                                                aVar.f5591b = this.f5586w ? xVar.b() - 1 : 0;
                                                            }
                                                        }
                                                    }
                                                    z11 = this.f5583t;
                                                    z12 = this.f5586w;
                                                    if (z11 == z12 && (X0 = X0(sVar, xVar, aVar.f5592d, z12)) != null) {
                                                        aVar.a(X0, RecyclerView.l.K(X0));
                                                        if (!xVar.f5747g && I0()) {
                                                            e10 = this.f5582s.e(X0);
                                                            b5 = this.f5582s.b(X0);
                                                            k3 = this.f5582s.k();
                                                            g10 = this.f5582s.g();
                                                            if (b5 > k3 && e10 < k3) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (e10 < g10 && b5 > g10) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            if (!z13 || z14) {
                                                                if (aVar.f5592d) {
                                                                    k3 = g10;
                                                                }
                                                                aVar.c = k3;
                                                            }
                                                        }
                                                        z15 = true;
                                                        if (!z15) {
                                                        }
                                                    }
                                                }
                                            }
                                            focusedChild2 = null;
                                            if (focusedChild2 != null) {
                                            }
                                            z11 = this.f5583t;
                                            z12 = this.f5586w;
                                            if (z11 == z12) {
                                                aVar.a(X0, RecyclerView.l.K(X0));
                                                if (!xVar.f5747g) {
                                                    e10 = this.f5582s.e(X0);
                                                    b5 = this.f5582s.b(X0);
                                                    k3 = this.f5582s.k();
                                                    g10 = this.f5582s.g();
                                                    if (b5 > k3) {
                                                    }
                                                    z13 = false;
                                                    if (e10 < g10) {
                                                    }
                                                    z14 = false;
                                                    if (!z13) {
                                                    }
                                                    if (aVar.f5592d) {
                                                    }
                                                    aVar.c = k3;
                                                }
                                                z15 = true;
                                                if (!z15) {
                                                }
                                            }
                                        }
                                        z15 = false;
                                        if (!z15) {
                                        }
                                    }
                                    aVar.f5593e = true;
                                    cVar = this.f5581r;
                                    if (cVar.f5605j < 0) {
                                    }
                                    cVar.f5601f = i14;
                                    int[] iArr2 = this.E;
                                    iArr2[0] = 0;
                                    iArr2[1] = 0;
                                    J0(xVar, iArr2);
                                    int k132 = this.f5582s.k() + Math.max(0, iArr2[0]);
                                    int h102 = this.f5582s.h() + Math.max(0, iArr2[1]);
                                    if (xVar.f5747g) {
                                        if (!this.f5585v) {
                                        }
                                        i25 = i24 - e12;
                                        if (i25 <= 0) {
                                        }
                                    }
                                    if (!aVar.f5592d) {
                                    }
                                    e1(sVar, xVar, aVar, i15);
                                    t(sVar);
                                    c cVar22 = this.f5581r;
                                    if (this.f5582s.i() != 0) {
                                    }
                                    z20 = false;
                                    cVar22.f5607l = z20;
                                    this.f5581r.getClass();
                                    this.f5581r.f5604i = 0;
                                    if (!aVar.f5592d) {
                                    }
                                    if (A() > 0) {
                                    }
                                    if (xVar.f5751k) {
                                        List<RecyclerView.b0> list22 = sVar.f5722d;
                                        size = list22.size();
                                        int K2 = RecyclerView.l.K(z(0));
                                        i19 = 0;
                                        i20 = 0;
                                        while (i18 < size) {
                                        }
                                        this.f5581r.f5606k = list22;
                                        if (i19 <= 0) {
                                        }
                                        if (i20 <= 0) {
                                        }
                                        this.f5581r.f5606k = list;
                                    }
                                    if (xVar.f5747g) {
                                    }
                                    this.f5583t = this.f5586w;
                                }
                                k11 = this.f5582s.k();
                                i11 = this.A.f5609j;
                                i13 = k11 + i11;
                                aVar.c = i13;
                                z10 = true;
                                if (!z10) {
                                }
                                aVar.f5593e = true;
                                cVar = this.f5581r;
                                if (cVar.f5605j < 0) {
                                }
                                cVar.f5601f = i14;
                                int[] iArr22 = this.E;
                                iArr22[0] = 0;
                                iArr22[1] = 0;
                                J0(xVar, iArr22);
                                int k1322 = this.f5582s.k() + Math.max(0, iArr22[0]);
                                int h1022 = this.f5582s.h() + Math.max(0, iArr22[1]);
                                if (xVar.f5747g) {
                                }
                                if (!aVar.f5592d) {
                                }
                                e1(sVar, xVar, aVar, i15);
                                t(sVar);
                                c cVar222 = this.f5581r;
                                if (this.f5582s.i() != 0) {
                                }
                                z20 = false;
                                cVar222.f5607l = z20;
                                this.f5581r.getClass();
                                this.f5581r.f5604i = 0;
                                if (!aVar.f5592d) {
                                }
                                if (A() > 0) {
                                }
                                if (xVar.f5751k) {
                                }
                                if (xVar.f5747g) {
                                }
                                this.f5583t = this.f5586w;
                            }
                        }
                        if (this.f5589z != Integer.MIN_VALUE) {
                            View u11 = u(i34);
                            if (u11 != null) {
                                if (this.f5582s.c(u11) <= this.f5582s.l()) {
                                    if (this.f5582s.e(u11) - this.f5582s.k() < 0) {
                                        aVar.c = this.f5582s.k();
                                        aVar.f5592d = false;
                                    } else if (this.f5582s.g() - this.f5582s.b(u11) < 0) {
                                        aVar.c = this.f5582s.g();
                                        aVar.f5592d = true;
                                    } else {
                                        if (aVar.f5592d) {
                                            e11 = this.f5582s.m() + this.f5582s.b(u11);
                                        } else {
                                            e11 = this.f5582s.e(u11);
                                        }
                                        aVar.c = e11;
                                    }
                                    z10 = true;
                                    if (!z10) {
                                    }
                                    aVar.f5593e = true;
                                    cVar = this.f5581r;
                                    if (cVar.f5605j < 0) {
                                    }
                                    cVar.f5601f = i14;
                                    int[] iArr222 = this.E;
                                    iArr222[0] = 0;
                                    iArr222[1] = 0;
                                    J0(xVar, iArr222);
                                    int k13222 = this.f5582s.k() + Math.max(0, iArr222[0]);
                                    int h10222 = this.f5582s.h() + Math.max(0, iArr222[1]);
                                    if (xVar.f5747g) {
                                    }
                                    if (!aVar.f5592d) {
                                    }
                                    e1(sVar, xVar, aVar, i15);
                                    t(sVar);
                                    c cVar2222 = this.f5581r;
                                    if (this.f5582s.i() != 0) {
                                    }
                                    z20 = false;
                                    cVar2222.f5607l = z20;
                                    this.f5581r.getClass();
                                    this.f5581r.f5604i = 0;
                                    if (!aVar.f5592d) {
                                    }
                                    if (A() > 0) {
                                    }
                                    if (xVar.f5751k) {
                                    }
                                    if (xVar.f5747g) {
                                    }
                                    this.f5583t = this.f5586w;
                                }
                            } else if (A() > 0) {
                                if (this.f5588y < RecyclerView.l.K(z(0))) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17 == this.f5585v) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                aVar.f5592d = z18;
                            }
                            if (aVar.f5592d) {
                                k12 = aVar.f5590a.g();
                            } else {
                                k12 = aVar.f5590a.k();
                            }
                            aVar.c = k12;
                            z10 = true;
                            if (!z10) {
                            }
                            aVar.f5593e = true;
                            cVar = this.f5581r;
                            if (cVar.f5605j < 0) {
                            }
                            cVar.f5601f = i14;
                            int[] iArr2222 = this.E;
                            iArr2222[0] = 0;
                            iArr2222[1] = 0;
                            J0(xVar, iArr2222);
                            int k132222 = this.f5582s.k() + Math.max(0, iArr2222[0]);
                            int h102222 = this.f5582s.h() + Math.max(0, iArr2222[1]);
                            if (xVar.f5747g) {
                            }
                            if (!aVar.f5592d) {
                            }
                            e1(sVar, xVar, aVar, i15);
                            t(sVar);
                            c cVar22222 = this.f5581r;
                            if (this.f5582s.i() != 0) {
                            }
                            z20 = false;
                            cVar22222.f5607l = z20;
                            this.f5581r.getClass();
                            this.f5581r.f5604i = 0;
                            if (!aVar.f5592d) {
                            }
                            if (A() > 0) {
                            }
                            if (xVar.f5751k) {
                            }
                            if (xVar.f5747g) {
                            }
                            this.f5583t = this.f5586w;
                        }
                        boolean z24 = this.f5585v;
                        aVar.f5592d = z24;
                        if (z24) {
                            g11 = this.f5582s.g();
                            i12 = this.f5589z;
                            i13 = g11 - i12;
                            aVar.c = i13;
                            z10 = true;
                            if (!z10) {
                            }
                            aVar.f5593e = true;
                            cVar = this.f5581r;
                            if (cVar.f5605j < 0) {
                            }
                            cVar.f5601f = i14;
                            int[] iArr22222 = this.E;
                            iArr22222[0] = 0;
                            iArr22222[1] = 0;
                            J0(xVar, iArr22222);
                            int k1322222 = this.f5582s.k() + Math.max(0, iArr22222[0]);
                            int h1022222 = this.f5582s.h() + Math.max(0, iArr22222[1]);
                            if (xVar.f5747g) {
                            }
                            if (!aVar.f5592d) {
                            }
                            e1(sVar, xVar, aVar, i15);
                            t(sVar);
                            c cVar222222 = this.f5581r;
                            if (this.f5582s.i() != 0) {
                            }
                            z20 = false;
                            cVar222222.f5607l = z20;
                            this.f5581r.getClass();
                            this.f5581r.f5604i = 0;
                            if (!aVar.f5592d) {
                            }
                            if (A() > 0) {
                            }
                            if (xVar.f5751k) {
                            }
                            if (xVar.f5747g) {
                            }
                            this.f5583t = this.f5586w;
                        }
                        k11 = this.f5582s.k();
                        i11 = this.f5589z;
                        i13 = k11 + i11;
                        aVar.c = i13;
                        z10 = true;
                        if (!z10) {
                        }
                        aVar.f5593e = true;
                        cVar = this.f5581r;
                        if (cVar.f5605j < 0) {
                        }
                        cVar.f5601f = i14;
                        int[] iArr222222 = this.E;
                        iArr222222[0] = 0;
                        iArr222222[1] = 0;
                        J0(xVar, iArr222222);
                        int k13222222 = this.f5582s.k() + Math.max(0, iArr222222[0]);
                        int h10222222 = this.f5582s.h() + Math.max(0, iArr222222[1]);
                        if (xVar.f5747g) {
                        }
                        if (!aVar.f5592d) {
                        }
                        e1(sVar, xVar, aVar, i15);
                        t(sVar);
                        c cVar2222222 = this.f5581r;
                        if (this.f5582s.i() != 0) {
                        }
                        z20 = false;
                        cVar2222222.f5607l = z20;
                        this.f5581r.getClass();
                        this.f5581r.f5604i = 0;
                        if (!aVar.f5592d) {
                        }
                        if (A() > 0) {
                        }
                        if (xVar.f5751k) {
                        }
                        if (xVar.f5747g) {
                        }
                        this.f5583t = this.f5586w;
                    }
                    this.f5588y = -1;
                    this.f5589z = Integer.MIN_VALUE;
                }
                z10 = false;
                if (!z10) {
                }
                aVar.f5593e = true;
                cVar = this.f5581r;
                if (cVar.f5605j < 0) {
                }
                cVar.f5601f = i14;
                int[] iArr2222222 = this.E;
                iArr2222222[0] = 0;
                iArr2222222[1] = 0;
                J0(xVar, iArr2222222);
                int k132222222 = this.f5582s.k() + Math.max(0, iArr2222222[0]);
                int h102222222 = this.f5582s.h() + Math.max(0, iArr2222222[1]);
                if (xVar.f5747g) {
                }
                if (!aVar.f5592d) {
                }
                e1(sVar, xVar, aVar, i15);
                t(sVar);
                c cVar22222222 = this.f5581r;
                if (this.f5582s.i() != 0) {
                }
                z20 = false;
                cVar22222222.f5607l = z20;
                this.f5581r.getClass();
                this.f5581r.f5604i = 0;
                if (!aVar.f5592d) {
                }
                if (A() > 0) {
                }
                if (xVar.f5751k) {
                }
                if (xVar.f5747g) {
                }
                this.f5583t = this.f5586w;
            }
        }
        focusedChild = null;
        aVar = this.B;
        if (aVar.f5593e) {
            if (focusedChild != null) {
                aVar.b(focusedChild, RecyclerView.l.K(focusedChild));
            }
            cVar = this.f5581r;
            if (cVar.f5605j < 0) {
            }
            cVar.f5601f = i14;
            int[] iArr22222222 = this.E;
            iArr22222222[0] = 0;
            iArr22222222[1] = 0;
            J0(xVar, iArr22222222);
            int k1322222222 = this.f5582s.k() + Math.max(0, iArr22222222[0]);
            int h1022222222 = this.f5582s.h() + Math.max(0, iArr22222222[1]);
            if (xVar.f5747g) {
            }
            if (!aVar.f5592d) {
            }
            e1(sVar, xVar, aVar, i15);
            t(sVar);
            c cVar222222222 = this.f5581r;
            if (this.f5582s.i() != 0) {
            }
            z20 = false;
            cVar222222222.f5607l = z20;
            this.f5581r.getClass();
            this.f5581r.f5604i = 0;
            if (!aVar.f5592d) {
            }
            if (A() > 0) {
            }
            if (xVar.f5751k) {
            }
            if (xVar.f5747g) {
            }
            this.f5583t = this.f5586w;
        }
        aVar.c();
        aVar.f5592d = this.f5585v ^ this.f5586w;
        if (!xVar.f5747g) {
            if (i10 >= 0) {
                int i342 = this.f5588y;
                aVar.f5591b = i342;
                dVar = this.A;
                if (dVar != null) {
                }
                if (this.f5589z != Integer.MIN_VALUE) {
                }
            }
            this.f5588y = -1;
            this.f5589z = Integer.MIN_VALUE;
        }
        z10 = false;
        if (!z10) {
        }
        aVar.f5593e = true;
        cVar = this.f5581r;
        if (cVar.f5605j < 0) {
        }
        cVar.f5601f = i14;
        int[] iArr222222222 = this.E;
        iArr222222222[0] = 0;
        iArr222222222[1] = 0;
        J0(xVar, iArr222222222);
        int k13222222222 = this.f5582s.k() + Math.max(0, iArr222222222[0]);
        int h10222222222 = this.f5582s.h() + Math.max(0, iArr222222222[1]);
        if (xVar.f5747g) {
        }
        if (!aVar.f5592d) {
        }
        e1(sVar, xVar, aVar, i15);
        t(sVar);
        c cVar2222222222 = this.f5581r;
        if (this.f5582s.i() != 0) {
        }
        z20 = false;
        cVar2222222222.f5607l = z20;
        this.f5581r.getClass();
        this.f5581r.f5604i = 0;
        if (!aVar.f5592d) {
        }
        if (A() > 0) {
        }
        if (xVar.f5751k) {
        }
        if (xVar.f5747g) {
        }
        this.f5583t = this.f5586w;
    }

    public final void k1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(androidx.activity.e.g("invalid orientation:", i10));
        }
        e(null);
        if (i10 != this.f5580q || this.f5582s == null) {
            w a10 = w.a(this, i10);
            this.f5582s = a10;
            this.B.f5590a = a10;
            this.f5580q = i10;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public final void l(int i10, int i11, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        if (this.f5580q != 0) {
            i10 = i11;
        }
        if (A() != 0 && i10 != 0) {
            P0();
            m1(i10 > 0 ? 1 : -1, Math.abs(i10), true, xVar);
            K0(xVar, this.f5581r, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public void l0(RecyclerView.x xVar) {
        this.A = null;
        this.f5588y = -1;
        this.f5589z = Integer.MIN_VALUE;
        this.B.c();
    }

    public void l1(boolean z10) {
        e(null);
        if (this.f5586w == z10) {
            return;
        }
        this.f5586w = z10;
        u0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i10, RecyclerView.l.c cVar) {
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        d dVar = this.A;
        int i13 = 1;
        if (dVar != null) {
            i11 = dVar.f5608i;
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = dVar.f5610k;
                if (z10) {
                    i13 = -1;
                }
                for (i12 = 0; i12 < this.D && i11 >= 0 && i11 < i10; i12++) {
                    ((m.b) cVar).a(i11, 0);
                    i11 += i13;
                }
                return;
            }
        }
        h1();
        z10 = this.f5585v;
        i11 = this.f5588y;
        if (i11 == -1) {
            i11 = z10 ? i10 - 1 : 0;
        }
        if (z10) {
        }
        while (i12 < this.D) {
            ((m.b) cVar).a(i11, 0);
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.A = dVar;
            if (this.f5588y != -1) {
                dVar.f5608i = -1;
            }
            u0();
        }
    }

    public final void m1(int i10, int i11, boolean z10, RecyclerView.x xVar) {
        boolean z11;
        int i12;
        int k3;
        c cVar = this.f5581r;
        boolean z12 = false;
        int i13 = 1;
        if (this.f5582s.i() == 0 && this.f5582s.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.f5607l = z11;
        this.f5581r.f5601f = i10;
        int[] iArr = this.E;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(xVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f5581r;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f5603h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f5604i = max;
        if (z12) {
            cVar2.f5603h = this.f5582s.h() + i12;
            View a12 = a1();
            c cVar3 = this.f5581r;
            if (this.f5585v) {
                i13 = -1;
            }
            cVar3.f5600e = i13;
            int K = RecyclerView.l.K(a12);
            c cVar4 = this.f5581r;
            cVar3.f5599d = K + cVar4.f5600e;
            cVar4.f5598b = this.f5582s.b(a12);
            k3 = this.f5582s.b(a12) - this.f5582s.g();
        } else {
            View b12 = b1();
            c cVar5 = this.f5581r;
            cVar5.f5603h = this.f5582s.k() + cVar5.f5603h;
            c cVar6 = this.f5581r;
            if (!this.f5585v) {
                i13 = -1;
            }
            cVar6.f5600e = i13;
            int K2 = RecyclerView.l.K(b12);
            c cVar7 = this.f5581r;
            cVar6.f5599d = K2 + cVar7.f5600e;
            cVar7.f5598b = this.f5582s.e(b12);
            k3 = (-this.f5582s.e(b12)) + this.f5582s.k();
        }
        c cVar8 = this.f5581r;
        cVar8.c = i11;
        if (z10) {
            cVar8.c = i11 - k3;
        }
        cVar8.f5602g = k3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int n(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public Parcelable n0() {
        d dVar = this.A;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (A() > 0) {
            P0();
            boolean z10 = this.f5583t ^ this.f5585v;
            dVar2.f5610k = z10;
            if (z10) {
                View a12 = a1();
                dVar2.f5609j = this.f5582s.g() - this.f5582s.b(a12);
                dVar2.f5608i = RecyclerView.l.K(a12);
            } else {
                View b12 = b1();
                dVar2.f5608i = RecyclerView.l.K(b12);
                dVar2.f5609j = this.f5582s.e(b12) - this.f5582s.k();
            }
        } else {
            dVar2.f5608i = -1;
        }
        return dVar2;
    }

    public final void n1(int i10, int i11) {
        this.f5581r.c = this.f5582s.g() - i11;
        c cVar = this.f5581r;
        cVar.f5600e = this.f5585v ? -1 : 1;
        cVar.f5599d = i10;
        cVar.f5601f = 1;
        cVar.f5598b = i11;
        cVar.f5602g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int o(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final void o1(int i10, int i11) {
        this.f5581r.c = i11 - this.f5582s.k();
        c cVar = this.f5581r;
        cVar.f5599d = i10;
        cVar.f5600e = this.f5585v ? 1 : -1;
        cVar.f5601f = -1;
        cVar.f5598b = i11;
        cVar.f5602g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int p(RecyclerView.x xVar) {
        return N0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int q(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int r(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int s(RecyclerView.x xVar) {
        return N0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public final View u(int i10) {
        int A = A();
        if (A == 0) {
            return null;
        }
        int K = i10 - RecyclerView.l.K(z(0));
        if (K >= 0 && K < A) {
            View z10 = z(K);
            if (RecyclerView.l.K(z10) == i10) {
                return z10;
            }
        }
        return super.u(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.m v() {
        return new RecyclerView.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f5580q == 1) {
            return 0;
        }
        return i1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void w0(int i10) {
        this.f5588y = i10;
        this.f5589z = Integer.MIN_VALUE;
        d dVar = this.A;
        if (dVar != null) {
            dVar.f5608i = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    @SuppressLint({"UnknownNullness"})
    public int x0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f5580q == 0) {
            return 0;
        }
        return i1(i10, sVar, xVar);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5580q = 1;
        this.f5584u = false;
        this.f5585v = false;
        this.f5586w = false;
        this.f5587x = true;
        this.f5588y = -1;
        this.f5589z = Integer.MIN_VALUE;
        this.A = null;
        this.B = new a();
        this.C = new b();
        this.D = 2;
        this.E = new int[2];
        RecyclerView.l.d L = RecyclerView.l.L(context, attributeSet, i10, i11);
        k1(L.f5708a);
        boolean z10 = L.c;
        e(null);
        if (z10 != this.f5584u) {
            this.f5584u = z10;
            u0();
        }
        l1(L.f5710d);
    }
}
