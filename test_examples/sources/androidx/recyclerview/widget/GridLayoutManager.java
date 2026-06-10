package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import b3.g;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean F;
    public int G;
    public int[] H;
    public View[] I;
    public final SparseIntArray J;
    public final SparseIntArray K;
    public c L;
    public final Rect M;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.m {

        /* renamed from: m  reason: collision with root package name */
        public int f5577m;
        public int n;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f5577m = -1;
            this.n = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5577m = -1;
            this.n = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5577m = -1;
            this.n = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5577m = -1;
            this.n = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f5578a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f5579b = new SparseIntArray();
        public boolean c = false;

        public final int a(int i10, int i11) {
            int c = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int c10 = c(i14);
                i12 += c10;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = c10;
                }
            }
            return i12 + c > i11 ? i13 + 1 : i13;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004e -> B:27:0x0053). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0050 -> B:27:0x0053). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0052 -> B:27:0x0053). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int b(int i10, int i11) {
            c cVar;
            int i12;
            int i13;
            int c = c(i10);
            if (c == i11) {
                return 0;
            }
            if (this.c) {
                SparseIntArray sparseIntArray = this.f5578a;
                i13 = -1;
                int size = sparseIntArray.size() - 1;
                int i14 = 0;
                while (i14 <= size) {
                    int i15 = (i14 + size) >>> 1;
                    if (sparseIntArray.keyAt(i15) < i10) {
                        i14 = i15 + 1;
                    } else {
                        size = i15 - 1;
                    }
                }
                int i16 = i14 - 1;
                if (i16 >= 0 && i16 < sparseIntArray.size()) {
                    i13 = sparseIntArray.keyAt(i16);
                }
                if (i13 >= 0) {
                    i12 = c(i13) + sparseIntArray.get(i13);
                    cVar = this;
                    i13++;
                    if (i13 >= i10) {
                        int c10 = cVar.c(i13);
                        i12 += c10;
                        if (i12 == i11) {
                            i12 = 0;
                        } else if (i12 > i11) {
                            i12 = c10;
                        }
                        i13++;
                        if (i13 >= i10) {
                            if (c + i12 > i11) {
                                return 0;
                            }
                            return i12;
                        }
                    }
                }
            }
            cVar = this;
            i12 = 0;
            i13 = 0;
            if (i13 >= i10) {
            }
        }

        public abstract int c(int i10);

        public final void d() {
            this.f5578a.clear();
        }
    }

    public GridLayoutManager() {
        super(1);
        this.F = false;
        this.G = -1;
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.L = new a();
        this.M = new Rect();
        v1(2);
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.F = false;
        this.G = -1;
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.L = new a();
        this.M = new Rect();
        v1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.F = false;
        this.G = -1;
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.L = new a();
        this.M = new Rect();
        v1(RecyclerView.l.L(context, attributeSet, i10, i11).f5709b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void A0(Rect rect, int i10, int i11) {
        int k3;
        int k10;
        if (this.H == null) {
            super.A0(rect, i10, i11);
        }
        int I = I() + H();
        int G = G() + J();
        if (this.f5580q == 1) {
            int height = rect.height() + G;
            RecyclerView recyclerView = this.f5693b;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            k10 = RecyclerView.l.k(i11, height, j0.d.d(recyclerView));
            int[] iArr = this.H;
            k3 = RecyclerView.l.k(i10, iArr[iArr.length - 1] + I, j0.d.e(this.f5693b));
        } else {
            int width = rect.width() + I;
            RecyclerView recyclerView2 = this.f5693b;
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            k3 = RecyclerView.l.k(i10, width, j0.d.e(recyclerView2));
            int[] iArr2 = this.H;
            k10 = RecyclerView.l.k(i11, iArr2[iArr2.length - 1] + G, j0.d.d(this.f5693b));
        }
        this.f5693b.setMeasuredDimension(k3, k10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int C(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f5580q == 1) {
            return this.G;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return r1(xVar.b() - 1, sVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final boolean I0() {
        return this.A == null && !this.F;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        boolean z10;
        int i10 = this.G;
        for (int i11 = 0; i11 < this.G; i11++) {
            int i12 = cVar.f5599d;
            if (i12 >= 0 && i12 < xVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && i10 > 0) {
                int i13 = cVar.f5599d;
                ((m.b) cVar2).a(i13, Math.max(0, cVar.f5602g));
                i10 -= this.L.c(i13);
                cVar.f5599d += cVar.f5600e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int N(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f5580q == 0) {
            return this.G;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return r1(xVar.b() - 1, sVar, xVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        r4 = r6;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int A = A();
        int i12 = 1;
        if (z11) {
            i11 = A() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = A;
            i11 = 0;
        }
        int b5 = xVar.b();
        P0();
        int k3 = this.f5582s.k();
        int g10 = this.f5582s.g();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View z12 = z(i11);
            int K = RecyclerView.l.K(z12);
            if (K >= 0 && K < b5 && s1(K, sVar, xVar) == 0) {
                if (((RecyclerView.m) z12.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = z12;
                    }
                } else if (this.f5582s.e(z12) < g10 && this.f5582s.b(z12) >= k3) {
                    return z12;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r13 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010e, code lost:
        if (r13 == r5) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Z(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        View C;
        boolean z10;
        boolean z11;
        int A;
        int i11;
        int i12;
        boolean z12;
        View view2;
        View view3;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        RecyclerView.s sVar2 = sVar;
        RecyclerView.x xVar2 = xVar;
        RecyclerView recyclerView = this.f5693b;
        View view4 = null;
        if (recyclerView != null) {
            C = recyclerView.C(view);
            if (C != null) {
                if (this.f5692a.k(C)) {
                }
                if (C != null) {
                    return null;
                }
                b bVar = (b) C.getLayoutParams();
                int i14 = bVar.f5577m;
                int i15 = bVar.n + i14;
                if (super.Z(view, i10, sVar, xVar) == null) {
                    return null;
                }
                if (O0(i10) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.f5585v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = A() - 1;
                    A = -1;
                    i12 = -1;
                } else {
                    A = A();
                    i11 = 0;
                    i12 = 1;
                }
                if (this.f5580q == 1 && c1()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int r1 = r1(i11, sVar2, xVar2);
                int i16 = i11;
                int i17 = i12;
                int i18 = -1;
                int i19 = 0;
                int i20 = 0;
                int i21 = -1;
                View view5 = null;
                while (i16 != A) {
                    int i22 = A;
                    int r12 = r1(i16, sVar2, xVar2);
                    View z17 = z(i16);
                    if (z17 == C) {
                        break;
                    }
                    if (z17.hasFocusable() && r12 != r1) {
                        if (view4 != null) {
                            break;
                        }
                        view2 = C;
                        view3 = view5;
                        i13 = i19;
                    } else {
                        b bVar2 = (b) z17.getLayoutParams();
                        int i23 = bVar2.f5577m;
                        view2 = C;
                        int i24 = bVar2.n + i23;
                        if (z17.hasFocusable() && i23 == i14 && i24 == i15) {
                            return z17;
                        }
                        if ((z17.hasFocusable() && view4 == null) || (!z17.hasFocusable() && view5 == null)) {
                            view3 = view5;
                        } else {
                            view3 = view5;
                            int min = Math.min(i24, i15) - Math.max(i23, i14);
                            if (z17.hasFocusable()) {
                                if (min <= i19) {
                                    if (min == i19) {
                                        if (i23 > i21) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    }
                                }
                            } else if (view4 == null) {
                                i13 = i19;
                                if (this.c.b(z17) && this.f5694d.b(z17)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z13) {
                                    if (min <= i20) {
                                        if (min == i20) {
                                            if (i23 > i18) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                        }
                                    }
                                    z15 = true;
                                    if (z15) {
                                        if (z17.hasFocusable()) {
                                            int i25 = bVar2.f5577m;
                                            i19 = Math.min(i24, i15) - Math.max(i23, i14);
                                            i21 = i25;
                                            view5 = view3;
                                            view4 = z17;
                                        } else {
                                            int i26 = bVar2.f5577m;
                                            i20 = Math.min(i24, i15) - Math.max(i23, i14);
                                            i18 = i26;
                                            i19 = i13;
                                            view5 = z17;
                                        }
                                        i16 += i17;
                                        sVar2 = sVar;
                                        xVar2 = xVar;
                                        A = i22;
                                        C = view2;
                                    }
                                }
                                z15 = false;
                                if (z15) {
                                }
                            }
                            i13 = i19;
                            z15 = false;
                            if (z15) {
                            }
                        }
                        i13 = i19;
                        z15 = true;
                        if (z15) {
                        }
                    }
                    i19 = i13;
                    view5 = view3;
                    i16 += i17;
                    sVar2 = sVar;
                    xVar2 = xVar;
                    A = i22;
                    C = view2;
                }
                View view6 = view5;
                if (view4 == null) {
                    return view6;
                }
                return view4;
            }
        }
        C = null;
        if (C != null) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void b0(RecyclerView.s sVar, RecyclerView.x xVar, b3.g gVar) {
        super.b0(sVar, xVar, gVar);
        gVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d0(RecyclerView.s sVar, RecyclerView.x xVar, View view, b3.g gVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            c0(view, gVar);
            return;
        }
        b bVar = (b) layoutParams;
        int r1 = r1(bVar.c(), sVar, xVar);
        int i12 = 1;
        if (this.f5580q == 0) {
            int i13 = bVar.f5577m;
            i12 = bVar.n;
            i11 = 1;
            i10 = r1;
            r1 = i13;
        } else {
            i10 = bVar.f5577m;
            i11 = bVar.n;
        }
        gVar.k(g.c.a(r1, i12, i10, i11, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int B;
        int i21;
        View b5;
        int j2 = this.f5582s.j();
        boolean z10 = j2 != 1073741824;
        int i22 = A() > 0 ? this.H[this.G] : 0;
        if (z10) {
            w1();
        }
        boolean z11 = cVar.f5600e == 1;
        int i23 = this.G;
        if (!z11) {
            i23 = s1(cVar.f5599d, sVar, xVar) + t1(cVar.f5599d, sVar, xVar);
        }
        int i24 = 0;
        while (i24 < this.G) {
            int i25 = cVar.f5599d;
            if (!(i25 >= 0 && i25 < xVar.b()) || i23 <= 0) {
                break;
            }
            int i26 = cVar.f5599d;
            int t12 = t1(i26, sVar, xVar);
            if (t12 > this.G) {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + t12 + " spans but GridLayoutManager has only " + this.G + " spans.");
            }
            i23 -= t12;
            if (i23 >= 0 && (b5 = cVar.b(sVar)) != null) {
                this.I[i24] = b5;
                i24++;
            }
        }
        if (i24 == 0) {
            bVar.f5595b = true;
            return;
        }
        if (z11) {
            i11 = i24;
            i10 = 0;
            i12 = 0;
            i13 = 1;
        } else {
            i10 = i24 - 1;
            i11 = -1;
            i12 = 0;
            i13 = -1;
        }
        while (i10 != i11) {
            View view = this.I[i10];
            b bVar2 = (b) view.getLayoutParams();
            int t13 = t1(RecyclerView.l.K(view), sVar, xVar);
            bVar2.n = t13;
            bVar2.f5577m = i12;
            i12 += t13;
            i10 += i13;
        }
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i24; i28++) {
            View view2 = this.I[i28];
            if (cVar.f5606k == null) {
                if (z11) {
                    c(view2);
                } else {
                    d(view2, 0, false);
                }
            } else if (z11) {
                d(view2, -1, true);
            } else {
                d(view2, 0, true);
            }
            g(view2, this.M);
            u1(view2, j2, false);
            int c10 = this.f5582s.c(view2);
            if (c10 > i27) {
                i27 = c10;
            }
            float d5 = (this.f5582s.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).n;
            if (d5 > f10) {
                f10 = d5;
            }
        }
        if (z10) {
            p1(Math.max(Math.round(f10 * this.G), i22));
            i27 = 0;
            for (int i29 = 0; i29 < i24; i29++) {
                View view3 = this.I[i29];
                u1(view3, 1073741824, true);
                int c11 = this.f5582s.c(view3);
                if (c11 > i27) {
                    i27 = c11;
                }
            }
        }
        for (int i30 = 0; i30 < i24; i30++) {
            View view4 = this.I[i30];
            if (this.f5582s.c(view4) != i27) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f5712j;
                int i31 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i32 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int q12 = q1(bVar3.f5577m, bVar3.n);
                if (this.f5580q == 1) {
                    i21 = RecyclerView.l.B(false, q12, 1073741824, i32, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    B = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    B = RecyclerView.l.B(false, q12, 1073741824, i31, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    i21 = makeMeasureSpec;
                }
                if (F0(view4, i21, B, (RecyclerView.m) view4.getLayoutParams())) {
                    view4.measure(i21, B);
                }
            }
        }
        bVar.f5594a = i27;
        if (this.f5580q == 1) {
            if (cVar.f5601f == -1) {
                i19 = cVar.f5598b;
                i20 = i19 - i27;
            } else {
                i20 = cVar.f5598b;
                i19 = i20 + i27;
            }
            i17 = i20;
            i18 = 0;
            i16 = 0;
        } else {
            if (cVar.f5601f == -1) {
                i15 = cVar.f5598b;
                i14 = i15 - i27;
            } else {
                i14 = cVar.f5598b;
                i15 = i14 + i27;
            }
            i16 = i14;
            i17 = 0;
            i18 = i15;
            i19 = 0;
        }
        for (int i33 = 0; i33 < i24; i33++) {
            View view5 = this.I[i33];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f5580q != 1) {
                int J = J() + this.H[bVar4.f5577m];
                i17 = J;
                i19 = this.f5582s.d(view5) + J;
            } else if (c1()) {
                i18 = H() + this.H[this.G - bVar4.f5577m];
                i16 = i18 - this.f5582s.d(view5);
            } else {
                i16 = this.H[bVar4.f5577m] + H();
                i18 = this.f5582s.d(view5) + i16;
            }
            RecyclerView.l.S(view5, i16, i17, i18, i19);
            if (!bVar4.e() && !bVar4.d()) {
                bVar.f5596d = view5.hasFocusable() | bVar.f5596d;
            }
            bVar.c = true;
            bVar.f5596d = view5.hasFocusable() | bVar.f5596d;
        }
        Arrays.fill(this.I, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(int i10, int i11) {
        this.L.d();
        this.L.f5579b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        w1();
        if (xVar.b() > 0 && !xVar.f5747g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int s12 = s1(aVar.f5591b, sVar, xVar);
            if (z10) {
                while (s12 > 0) {
                    int i11 = aVar.f5591b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f5591b = i12;
                    s12 = s1(i12, sVar, xVar);
                }
            } else {
                int b5 = xVar.b() - 1;
                int i13 = aVar.f5591b;
                while (i13 < b5) {
                    int i14 = i13 + 1;
                    int s13 = s1(i14, sVar, xVar);
                    if (s13 <= s12) {
                        break;
                    }
                    i13 = i14;
                    s12 = s13;
                }
                aVar.f5591b = i13;
            }
        }
        View[] viewArr = this.I;
        if (viewArr == null || viewArr.length != this.G) {
            this.I = new View[this.G];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0() {
        this.L.d();
        this.L.f5579b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i10, int i11) {
        this.L.d();
        this.L.f5579b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(int i10, int i11) {
        this.L.d();
        this.L.f5579b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean j(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j0(RecyclerView recyclerView, int i10, int i11) {
        this.L.d();
        this.L.f5579b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void k0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10 = xVar.f5747g;
        SparseIntArray sparseIntArray = this.K;
        SparseIntArray sparseIntArray2 = this.J;
        if (z10) {
            int A = A();
            for (int i10 = 0; i10 < A; i10++) {
                b bVar = (b) z(i10).getLayoutParams();
                int c10 = bVar.c();
                sparseIntArray2.put(c10, bVar.n);
                sparseIntArray.put(c10, bVar.f5577m);
            }
        }
        super.k0(sVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void l0(RecyclerView.x xVar) {
        super.l0(xVar);
        this.F = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void l1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.l1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return N0(xVar);
    }

    public final void p1(int i10) {
        int i11;
        int[] iArr = this.H;
        int i12 = this.G;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.H = iArr;
    }

    public final int q1(int i10, int i11) {
        if (this.f5580q != 1 || !c1()) {
            int[] iArr = this.H;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.H;
        int i12 = this.G;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int r(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final int r1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (!xVar.f5747g) {
            return this.L.a(i10, this.G);
        }
        int b5 = sVar.b(i10);
        if (b5 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.L.a(b5, this.G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int s(RecyclerView.x xVar) {
        return N0(xVar);
    }

    public final int s1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (!xVar.f5747g) {
            c cVar = this.L;
            int i11 = this.G;
            if (!cVar.c) {
                return cVar.b(i10, i11);
            }
            SparseIntArray sparseIntArray = cVar.f5578a;
            int i12 = sparseIntArray.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int b5 = cVar.b(i10, i11);
            sparseIntArray.put(i10, b5);
            return b5;
        }
        int i13 = this.K.get(i10, -1);
        if (i13 != -1) {
            return i13;
        }
        int b10 = sVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        c cVar2 = this.L;
        int i14 = this.G;
        if (!cVar2.c) {
            return cVar2.b(b10, i14);
        }
        SparseIntArray sparseIntArray2 = cVar2.f5578a;
        int i15 = sparseIntArray2.get(b10, -1);
        if (i15 != -1) {
            return i15;
        }
        int b11 = cVar2.b(b10, i14);
        sparseIntArray2.put(b10, b11);
        return b11;
    }

    public final int t1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (!xVar.f5747g) {
            return this.L.c(i10);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b5 = sVar.b(i10);
        if (b5 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.L.c(b5);
    }

    public final void u1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean D0;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f5712j;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int q12 = q1(bVar.f5577m, bVar.n);
        if (this.f5580q == 1) {
            i12 = RecyclerView.l.B(false, q12, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width);
            i11 = RecyclerView.l.B(true, this.f5582s.l(), this.n, i13, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int B = RecyclerView.l.B(false, q12, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height);
            int B2 = RecyclerView.l.B(true, this.f5582s.l(), this.f5703m, i14, ((ViewGroup.MarginLayoutParams) bVar).width);
            i11 = B;
            i12 = B2;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z10) {
            D0 = F0(view, i12, i11, mVar);
        } else {
            D0 = D0(view, i12, i11, mVar);
        }
        if (D0) {
            view.measure(i12, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m v() {
        return this.f5580q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        w1();
        View[] viewArr = this.I;
        if (viewArr == null || viewArr.length != this.G) {
            this.I = new View[this.G];
        }
        return super.v0(i10, sVar, xVar);
    }

    public final void v1(int i10) {
        if (i10 == this.G) {
            return;
        }
        this.F = true;
        if (i10 >= 1) {
            this.G = i10;
            this.L.d();
            u0();
            return;
        }
        throw new IllegalArgumentException(androidx.activity.e.g("Span count should be at least 1. Provided ", i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m w(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final void w1() {
        int G;
        int J;
        if (this.f5580q == 1) {
            G = this.f5704o - I();
            J = H();
        } else {
            G = this.f5705p - G();
            J = J();
        }
        p1(G - J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int x0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        w1();
        View[] viewArr = this.I;
        if (viewArr == null || viewArr.length != this.G) {
            this.I = new View[this.G];
        }
        return super.x0(i10, sVar, xVar);
    }
}
