package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.w.b {
    public int A;
    public int B;
    public final d C;
    public final int D;
    public boolean E;
    public boolean F;
    public e G;
    public int H;
    public final Rect I;
    public final b J;
    public boolean K;
    public final boolean L;
    public int[] M;
    public final a N;

    /* renamed from: q  reason: collision with root package name */
    public int f5754q;

    /* renamed from: r  reason: collision with root package name */
    public f[] f5755r;

    /* renamed from: s  reason: collision with root package name */
    public w f5756s;

    /* renamed from: t  reason: collision with root package name */
    public w f5757t;

    /* renamed from: u  reason: collision with root package name */
    public int f5758u;

    /* renamed from: v  reason: collision with root package name */
    public int f5759v;

    /* renamed from: w  reason: collision with root package name */
    public final q f5760w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5761x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5762y;

    /* renamed from: z  reason: collision with root package name */
    public BitSet f5763z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.K0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5765a;

        /* renamed from: b  reason: collision with root package name */
        public int f5766b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5767d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5768e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f5769f;

        public b() {
            a();
        }

        public final void a() {
            this.f5765a = -1;
            this.f5766b = Integer.MIN_VALUE;
            this.c = false;
            this.f5767d = false;
            this.f5768e = false;
            int[] iArr = this.f5769f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.m {

        /* renamed from: m  reason: collision with root package name */
        public f f5771m;
        public boolean n;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f5772a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f5773b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0042a();

            /* renamed from: i  reason: collision with root package name */
            public int f5774i;

            /* renamed from: j  reason: collision with root package name */
            public int f5775j;

            /* renamed from: k  reason: collision with root package name */
            public int[] f5776k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f5777l;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0042a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f5774i = parcel.readInt();
                this.f5775j = parcel.readInt();
                boolean z10 = true;
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                this.f5777l = z10;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5776k = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f5774i + ", mGapDir=" + this.f5775j + ", mHasUnwantedGapAfter=" + this.f5777l + ", mGapPerSpan=" + Arrays.toString(this.f5776k) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f5774i);
                parcel.writeInt(this.f5775j);
                parcel.writeInt(this.f5777l ? 1 : 0);
                int[] iArr = this.f5776k;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f5776k);
            }
        }

        public final void a(a aVar) {
            if (this.f5773b == null) {
                this.f5773b = new ArrayList();
            }
            int size = this.f5773b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f5773b.get(i10);
                if (aVar2.f5774i == aVar.f5774i) {
                    this.f5773b.remove(i10);
                }
                if (aVar2.f5774i >= aVar.f5774i) {
                    this.f5773b.add(i10, aVar);
                    return;
                }
            }
            this.f5773b.add(aVar);
        }

        public final void b() {
            int[] iArr = this.f5772a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5773b = null;
        }

        public final void c(int i10) {
            int[] iArr = this.f5772a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f5772a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f5772a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5772a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void d(int i10) {
            List<a> list = this.f5773b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f5773b.get(size).f5774i >= i10) {
                        this.f5773b.remove(size);
                    }
                }
            }
            g(i10);
        }

        public final a e(int i10, int i11, int i12) {
            List<a> list = this.f5773b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f5773b.get(i13);
                int i14 = aVar.f5774i;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f5775j == i12 || aVar.f5777l)) {
                    return aVar;
                }
            }
            return null;
        }

        public final a f(int i10) {
            List<a> list = this.f5773b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5773b.get(size);
                if (aVar.f5774i == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int g(int i10) {
            int i11;
            int[] iArr = this.f5772a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            if (this.f5773b != null) {
                a f10 = f(i10);
                if (f10 != null) {
                    this.f5773b.remove(f10);
                }
                int size = this.f5773b.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (this.f5773b.get(i12).f5774i >= i10) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    this.f5773b.remove(i12);
                    i11 = this.f5773b.get(i12).f5774i;
                    if (i11 != -1) {
                        int[] iArr2 = this.f5772a;
                        Arrays.fill(iArr2, i10, iArr2.length, -1);
                        return this.f5772a.length;
                    }
                    int min = Math.min(i11 + 1, this.f5772a.length);
                    Arrays.fill(this.f5772a, i10, min, -1);
                    return min;
                }
            }
            i11 = -1;
            if (i11 != -1) {
            }
        }

        public final void h(int i10, int i11) {
            int[] iArr = this.f5772a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f5772a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f5772a, i10, i12, -1);
                List<a> list = this.f5773b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f5773b.get(size);
                        int i13 = aVar.f5774i;
                        if (i13 >= i10) {
                            aVar.f5774i = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void i(int i10, int i11) {
            int[] iArr = this.f5772a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f5772a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f5772a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f5773b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f5773b.get(size);
                        int i13 = aVar.f5774i;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f5773b.remove(size);
                            } else {
                                aVar.f5774i = i13 - i11;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public int f5778i;

        /* renamed from: j  reason: collision with root package name */
        public int f5779j;

        /* renamed from: k  reason: collision with root package name */
        public int f5780k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f5781l;

        /* renamed from: m  reason: collision with root package name */
        public int f5782m;
        public int[] n;

        /* renamed from: o  reason: collision with root package name */
        public List<d.a> f5783o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f5784p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f5785q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f5786r;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f5778i = parcel.readInt();
            this.f5779j = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5780k = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5781l = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5782m = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.n = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5784p = parcel.readInt() == 1;
            this.f5785q = parcel.readInt() == 1;
            this.f5786r = parcel.readInt() == 1;
            this.f5783o = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f5780k = eVar.f5780k;
            this.f5778i = eVar.f5778i;
            this.f5779j = eVar.f5779j;
            this.f5781l = eVar.f5781l;
            this.f5782m = eVar.f5782m;
            this.n = eVar.n;
            this.f5784p = eVar.f5784p;
            this.f5785q = eVar.f5785q;
            this.f5786r = eVar.f5786r;
            this.f5783o = eVar.f5783o;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5778i);
            parcel.writeInt(this.f5779j);
            parcel.writeInt(this.f5780k);
            if (this.f5780k > 0) {
                parcel.writeIntArray(this.f5781l);
            }
            parcel.writeInt(this.f5782m);
            if (this.f5782m > 0) {
                parcel.writeIntArray(this.n);
            }
            parcel.writeInt(this.f5784p ? 1 : 0);
            parcel.writeInt(this.f5785q ? 1 : 0);
            parcel.writeInt(this.f5786r ? 1 : 0);
            parcel.writeList(this.f5783o);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f5787a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f5788b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f5789d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f5790e;

        public f(int i10) {
            this.f5790e = i10;
        }

        public static c j(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f5771m = this;
            ArrayList<View> arrayList = this.f5787a;
            arrayList.add(view);
            this.c = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f5788b = Integer.MIN_VALUE;
            }
            if (cVar.e() || cVar.d()) {
                this.f5789d = StaggeredGridLayoutManager.this.f5756s.c(view) + this.f5789d;
            }
        }

        public final void b() {
            d.a f10;
            int i10;
            ArrayList<View> arrayList = this.f5787a;
            View view = arrayList.get(arrayList.size() - 1);
            c j2 = j(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.c = staggeredGridLayoutManager.f5756s.b(view);
            if (j2.n && (f10 = staggeredGridLayoutManager.C.f(j2.c())) != null && f10.f5775j == 1) {
                int i11 = this.c;
                int[] iArr = f10.f5776k;
                if (iArr == null) {
                    i10 = 0;
                } else {
                    i10 = iArr[this.f5790e];
                }
                this.c = i10 + i11;
            }
        }

        public final void c() {
            d.a f10;
            int i10 = 0;
            View view = this.f5787a.get(0);
            c j2 = j(view);
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f5788b = staggeredGridLayoutManager.f5756s.e(view);
            if (j2.n && (f10 = staggeredGridLayoutManager.C.f(j2.c())) != null && f10.f5775j == -1) {
                int i11 = this.f5788b;
                int[] iArr = f10.f5776k;
                if (iArr != null) {
                    i10 = iArr[this.f5790e];
                }
                this.f5788b = i11 - i10;
            }
        }

        public final void d() {
            this.f5787a.clear();
            this.f5788b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.f5789d = 0;
        }

        public final int e() {
            int size;
            int i10;
            boolean z10 = StaggeredGridLayoutManager.this.f5761x;
            ArrayList<View> arrayList = this.f5787a;
            if (z10) {
                i10 = arrayList.size() - 1;
                size = -1;
            } else {
                size = arrayList.size();
                i10 = 0;
            }
            return g(i10, size, false, false, true);
        }

        public final int f() {
            boolean z10 = StaggeredGridLayoutManager.this.f5761x;
            ArrayList<View> arrayList = this.f5787a;
            if (z10) {
                return g(0, arrayList.size(), false, false, true);
            }
            return g(arrayList.size() - 1, -1, false, false, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (r10 < r4) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            if (r11 > r3) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int g(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            boolean z13;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k3 = staggeredGridLayoutManager.f5756s.k();
            int g10 = staggeredGridLayoutManager.f5756s.g();
            int i12 = i10;
            int i13 = i11 > i12 ? 1 : -1;
            while (i12 != i11) {
                View view = this.f5787a.get(i12);
                int e10 = staggeredGridLayoutManager.f5756s.e(view);
                int b5 = staggeredGridLayoutManager.f5756s.b(view);
                boolean z14 = false;
                if (z12) {
                    z13 = e10 <= g10;
                }
                if (z12) {
                    if (b5 >= k3) {
                        z14 = true;
                    }
                    if (z13 && z14) {
                        if (z10 && z11) {
                            if (e10 >= k3 && b5 <= g10) {
                                return RecyclerView.l.K(view);
                            }
                        } else if (z11) {
                            return RecyclerView.l.K(view);
                        } else {
                            if (e10 < k3 || b5 > g10) {
                                return RecyclerView.l.K(view);
                            }
                        }
                    }
                    i12 += i13;
                }
            }
            return -1;
        }

        public final int h(int i10) {
            int i11 = this.c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f5787a.size() == 0) {
                return i10;
            }
            b();
            return this.c;
        }

        public final View i(int i10, int i11) {
            ArrayList<View> arrayList = this.f5787a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f5761x && RecyclerView.l.K(view2) >= i10) || ((!staggeredGridLayoutManager.f5761x && RecyclerView.l.K(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.f5761x && RecyclerView.l.K(view3) <= i10) || ((!staggeredGridLayoutManager.f5761x && RecyclerView.l.K(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int k(int i10) {
            int i11 = this.f5788b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f5787a.size() == 0) {
                return i10;
            }
            c();
            return this.f5788b;
        }

        public final void l() {
            ArrayList<View> arrayList = this.f5787a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            c j2 = j(remove);
            j2.f5771m = null;
            if (j2.e() || j2.d()) {
                this.f5789d -= StaggeredGridLayoutManager.this.f5756s.c(remove);
            }
            if (size == 1) {
                this.f5788b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public final void m() {
            ArrayList<View> arrayList = this.f5787a;
            View remove = arrayList.remove(0);
            c j2 = j(remove);
            j2.f5771m = null;
            if (arrayList.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (j2.e() || j2.d()) {
                this.f5789d -= StaggeredGridLayoutManager.this.f5756s.c(remove);
            }
            this.f5788b = Integer.MIN_VALUE;
        }

        public final void n(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f5771m = this;
            ArrayList<View> arrayList = this.f5787a;
            arrayList.add(0, view);
            this.f5788b = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (cVar.e() || cVar.d()) {
                this.f5789d = StaggeredGridLayoutManager.this.f5756s.c(view) + this.f5789d;
            }
        }
    }

    public StaggeredGridLayoutManager() {
        this.f5754q = -1;
        this.f5761x = false;
        this.f5762y = false;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.C = new d();
        this.D = 2;
        this.I = new Rect();
        this.J = new b();
        this.K = false;
        this.L = true;
        this.N = new a();
        this.f5758u = 1;
        k1(1);
        this.f5760w = new q();
        this.f5756s = w.a(this, this.f5758u);
        this.f5757t = w.a(this, 1 - this.f5758u);
    }

    public static int o1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void A0(Rect rect, int i10, int i11) {
        int k3;
        int k10;
        int I = I() + H();
        int G = G() + J();
        if (this.f5758u == 1) {
            int height = rect.height() + G;
            RecyclerView recyclerView = this.f5693b;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            k10 = RecyclerView.l.k(i11, height, j0.d.d(recyclerView));
            k3 = RecyclerView.l.k(i10, (this.f5759v * this.f5754q) + I, j0.d.e(this.f5693b));
        } else {
            int width = rect.width() + I;
            RecyclerView recyclerView2 = this.f5693b;
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            k3 = RecyclerView.l.k(i10, width, j0.d.e(recyclerView2));
            k10 = RecyclerView.l.k(i11, (this.f5759v * this.f5754q) + G, j0.d.d(this.f5693b));
        }
        this.f5693b.setMeasuredDimension(k3, k10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void G0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.f5729a = i10;
        H0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean I0() {
        return this.G == null;
    }

    public final int J0(int i10) {
        if (A() == 0) {
            return this.f5762y ? 1 : -1;
        }
        return (i10 < T0()) != this.f5762y ? -1 : 1;
    }

    public final boolean K0() {
        int T0;
        int U0;
        int i10;
        int i11;
        if (A() != 0 && this.D != 0 && this.f5697g) {
            if (this.f5762y) {
                T0 = U0();
                U0 = T0();
            } else {
                T0 = T0();
                U0 = U0();
            }
            d dVar = this.C;
            if (T0 == 0 && Y0() != null) {
                dVar.b();
            } else if (!this.K) {
                return false;
            } else {
                if (this.f5762y) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                int i12 = U0 + 1;
                d.a e10 = dVar.e(T0, i12, i10);
                if (e10 == null) {
                    this.K = false;
                    dVar.d(i12);
                    return false;
                }
                d.a e11 = dVar.e(T0, e10.f5774i, i10 * (-1));
                if (e11 == null) {
                    i11 = e10.f5774i;
                } else {
                    i11 = e11.f5774i + 1;
                }
                dVar.d(i11);
            }
            this.f5696f = true;
            u0();
            return true;
        }
        return false;
    }

    public final int L0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        w wVar = this.f5756s;
        boolean z10 = this.L;
        return c0.a(xVar, wVar, Q0(!z10), P0(!z10), this, this.L);
    }

    public final int M0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        w wVar = this.f5756s;
        boolean z10 = this.L;
        return c0.b(xVar, wVar, Q0(!z10), P0(!z10), this, this.L, this.f5762y);
    }

    public final int N0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        w wVar = this.f5756s;
        boolean z10 = this.L;
        return c0.c(xVar, wVar, Q0(!z10), P0(!z10), this, this.L);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int O0(RecyclerView.s sVar, q qVar, RecyclerView.x xVar) {
        int i10;
        int k3;
        boolean z10;
        int V0;
        int i11;
        boolean z11;
        f fVar;
        int B;
        boolean z12;
        int B2;
        int B3;
        int k10;
        int i12;
        int i13;
        int i14;
        boolean z13;
        int k11;
        int c10;
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView.s sVar2 = sVar;
        char c11 = 0;
        int i19 = 1;
        this.f5763z.set(0, this.f5754q, true);
        q qVar2 = this.f5760w;
        if (qVar2.f5987i) {
            if (qVar.f5983e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (qVar.f5983e == 1) {
            i10 = qVar.f5985g + qVar.f5981b;
        } else {
            i10 = qVar.f5984f - qVar.f5981b;
        }
        l1(qVar.f5983e, i10);
        if (this.f5762y) {
            k3 = this.f5756s.g();
        } else {
            k3 = this.f5756s.k();
        }
        boolean z15 = false;
        while (true) {
            int i20 = qVar.c;
            if (i20 >= 0 && i20 < xVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!qVar2.f5987i && this.f5763z.isEmpty())) {
                break;
            }
            View d5 = sVar2.d(qVar.c);
            qVar.c += qVar.f5982d;
            c cVar = (c) d5.getLayoutParams();
            int c12 = cVar.c();
            d dVar = this.C;
            int[] iArr = dVar.f5772a;
            if (iArr != null && c12 < iArr.length) {
                i11 = iArr[c12];
                if (i11 != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (cVar.n) {
                        fVar = this.f5755r[c11];
                    } else {
                        if (c1(qVar.f5983e)) {
                            i17 = this.f5754q - i19;
                            i16 = -1;
                            i18 = -1;
                        } else {
                            i16 = this.f5754q;
                            i17 = 0;
                            i18 = 1;
                        }
                        f fVar2 = null;
                        if (qVar.f5983e == i19) {
                            int k12 = this.f5756s.k();
                            int i21 = Integer.MAX_VALUE;
                            while (i17 != i16) {
                                f fVar3 = this.f5755r[i17];
                                int h10 = fVar3.h(k12);
                                if (h10 < i21) {
                                    i21 = h10;
                                    fVar2 = fVar3;
                                }
                                i17 += i18;
                            }
                        } else {
                            int g10 = this.f5756s.g();
                            int i22 = Integer.MIN_VALUE;
                            while (i17 != i16) {
                                f fVar4 = this.f5755r[i17];
                                int k13 = fVar4.k(g10);
                                if (k13 > i22) {
                                    fVar2 = fVar4;
                                    i22 = k13;
                                }
                                i17 += i18;
                            }
                        }
                        fVar = fVar2;
                    }
                    dVar.c(c12);
                    dVar.f5772a[c12] = fVar.f5790e;
                } else {
                    fVar = this.f5755r[i11];
                }
                cVar.f5771m = fVar;
                if (qVar.f5983e != 1) {
                    c(d5);
                } else {
                    d(d5, 0, false);
                }
                if (!cVar.n) {
                    if (this.f5758u == 1) {
                        B3 = this.H;
                    } else {
                        a1(d5, RecyclerView.l.B(true, this.f5704o, this.f5703m, I() + H(), ((ViewGroup.MarginLayoutParams) cVar).width), this.H, false);
                        if (qVar.f5983e != 1) {
                            if (cVar.n) {
                                i14 = V0(k3);
                            } else {
                                i14 = fVar.h(k3);
                            }
                            int c13 = this.f5756s.c(d5) + i14;
                            if (z11 && cVar.n) {
                                d.a aVar = new d.a();
                                aVar.f5776k = new int[this.f5754q];
                                int i23 = 0;
                                while (i23 < this.f5754q) {
                                    aVar.f5776k[i23] = i14 - this.f5755r[i23].h(i14);
                                    i23++;
                                    c13 = c13;
                                }
                                i15 = c13;
                                aVar.f5775j = -1;
                                aVar.f5774i = c12;
                                dVar.a(aVar);
                            } else {
                                i15 = c13;
                            }
                            i12 = i15;
                        } else {
                            if (cVar.n) {
                                k10 = W0(k3);
                            } else {
                                k10 = fVar.k(k3);
                            }
                            i12 = k10;
                            int c14 = i12 - this.f5756s.c(d5);
                            if (z11 && cVar.n) {
                                d.a aVar2 = new d.a();
                                aVar2.f5776k = new int[this.f5754q];
                                int i24 = 0;
                                while (i24 < this.f5754q) {
                                    aVar2.f5776k[i24] = this.f5755r[i24].k(i12) - i12;
                                    i24++;
                                    c14 = c14;
                                }
                                i13 = c14;
                                aVar2.f5775j = 1;
                                aVar2.f5774i = c12;
                                dVar.a(aVar2);
                            } else {
                                i13 = c14;
                            }
                            i14 = i13;
                        }
                        if (!cVar.n && qVar.f5982d == -1) {
                            z13 = true;
                            if (z11) {
                                this.K = true;
                            } else {
                                if (qVar.f5983e == 1) {
                                    int h11 = this.f5755r[0].h(Integer.MIN_VALUE);
                                    for (int i25 = 1; i25 < this.f5754q; i25++) {
                                        if (this.f5755r[i25].h(Integer.MIN_VALUE) != h11) {
                                            z13 = true;
                                            z14 = false;
                                            break;
                                        }
                                    }
                                    z13 = true;
                                    z14 = true;
                                } else {
                                    int k14 = this.f5755r[0].k(Integer.MIN_VALUE);
                                    for (int i26 = 1; i26 < this.f5754q; i26++) {
                                        if (this.f5755r[i26].k(Integer.MIN_VALUE) != k14) {
                                            z13 = true;
                                            z14 = false;
                                            break;
                                        }
                                    }
                                    z13 = true;
                                    z14 = true;
                                }
                                if (!z14) {
                                    d.a f10 = dVar.f(c12);
                                    if (f10 != null) {
                                        f10.f5777l = z13;
                                    }
                                    this.K = z13;
                                }
                                if (qVar.f5983e == z13) {
                                    if (cVar.n) {
                                        int i27 = this.f5754q;
                                        while (true) {
                                            i27--;
                                            if (i27 < 0) {
                                                break;
                                            }
                                            this.f5755r[i27].a(d5);
                                        }
                                    } else {
                                        cVar.f5771m.a(d5);
                                    }
                                } else if (cVar.n) {
                                    int i28 = this.f5754q;
                                    while (true) {
                                        i28--;
                                        if (i28 < 0) {
                                            break;
                                        }
                                        this.f5755r[i28].n(d5);
                                    }
                                } else {
                                    cVar.f5771m.n(d5);
                                }
                                if (!Z0() && this.f5758u == 1) {
                                    if (cVar.n) {
                                        c10 = this.f5757t.g();
                                    } else {
                                        c10 = this.f5757t.g() - (((this.f5754q - 1) - fVar.f5790e) * this.f5759v);
                                    }
                                    k11 = c10 - this.f5757t.c(d5);
                                } else {
                                    if (cVar.n) {
                                        k11 = this.f5757t.k();
                                    } else {
                                        k11 = this.f5757t.k() + (fVar.f5790e * this.f5759v);
                                    }
                                    c10 = this.f5757t.c(d5) + k11;
                                }
                                if (this.f5758u == 1) {
                                    int i29 = k11;
                                    k11 = i14;
                                    i14 = i29;
                                    int i30 = c10;
                                    c10 = i12;
                                    i12 = i30;
                                }
                                RecyclerView.l.S(d5, i14, k11, i12, c10);
                                if (cVar.n) {
                                    l1(qVar2.f5983e, i10);
                                } else {
                                    n1(fVar, qVar2.f5983e, i10);
                                }
                                sVar2 = sVar;
                                e1(sVar2, qVar2);
                                if (qVar2.f5986h && d5.hasFocusable()) {
                                    if (!cVar.n) {
                                        this.f5763z.clear();
                                    } else {
                                        this.f5763z.set(fVar.f5790e, false);
                                        c11 = 0;
                                        i19 = 1;
                                        z15 = true;
                                    }
                                }
                                c11 = 0;
                                i19 = 1;
                                z15 = true;
                            }
                        } else {
                            z13 = true;
                        }
                        if (qVar.f5983e == z13) {
                        }
                        if (!Z0()) {
                        }
                        if (cVar.n) {
                        }
                        c10 = this.f5757t.c(d5) + k11;
                        if (this.f5758u == 1) {
                        }
                        RecyclerView.l.S(d5, i14, k11, i12, c10);
                        if (cVar.n) {
                        }
                        sVar2 = sVar;
                        e1(sVar2, qVar2);
                        if (qVar2.f5986h) {
                            if (!cVar.n) {
                            }
                        }
                        c11 = 0;
                        i19 = 1;
                        z15 = true;
                    }
                } else if (this.f5758u == 1) {
                    B3 = RecyclerView.l.B(false, this.f5759v, this.f5703m, 0, ((ViewGroup.MarginLayoutParams) cVar).width);
                } else {
                    B = RecyclerView.l.B(true, this.f5704o, this.f5703m, I() + H(), ((ViewGroup.MarginLayoutParams) cVar).width);
                    z12 = false;
                    B2 = RecyclerView.l.B(false, this.f5759v, this.n, 0, ((ViewGroup.MarginLayoutParams) cVar).height);
                    a1(d5, B, B2, z12);
                    if (qVar.f5983e != 1) {
                    }
                    if (!cVar.n) {
                    }
                    z13 = true;
                    if (qVar.f5983e == z13) {
                    }
                    if (!Z0()) {
                    }
                    if (cVar.n) {
                    }
                    c10 = this.f5757t.c(d5) + k11;
                    if (this.f5758u == 1) {
                    }
                    RecyclerView.l.S(d5, i14, k11, i12, c10);
                    if (cVar.n) {
                    }
                    sVar2 = sVar;
                    e1(sVar2, qVar2);
                    if (qVar2.f5986h) {
                    }
                    c11 = 0;
                    i19 = 1;
                    z15 = true;
                }
                B2 = RecyclerView.l.B(true, this.f5705p, this.n, G() + J(), ((ViewGroup.MarginLayoutParams) cVar).height);
                B = B3;
                z12 = false;
                a1(d5, B, B2, z12);
                if (qVar.f5983e != 1) {
                }
                if (!cVar.n) {
                }
                z13 = true;
                if (qVar.f5983e == z13) {
                }
                if (!Z0()) {
                }
                if (cVar.n) {
                }
                c10 = this.f5757t.c(d5) + k11;
                if (this.f5758u == 1) {
                }
                RecyclerView.l.S(d5, i14, k11, i12, c10);
                if (cVar.n) {
                }
                sVar2 = sVar;
                e1(sVar2, qVar2);
                if (qVar2.f5986h) {
                }
                c11 = 0;
                i19 = 1;
                z15 = true;
            }
            i11 = -1;
            if (i11 != -1) {
            }
            if (!z11) {
            }
            cVar.f5771m = fVar;
            if (qVar.f5983e != 1) {
            }
            if (!cVar.n) {
            }
            B2 = RecyclerView.l.B(true, this.f5705p, this.n, G() + J(), ((ViewGroup.MarginLayoutParams) cVar).height);
            B = B3;
            z12 = false;
            a1(d5, B, B2, z12);
            if (qVar.f5983e != 1) {
            }
            if (!cVar.n) {
            }
            z13 = true;
            if (qVar.f5983e == z13) {
            }
            if (!Z0()) {
            }
            if (cVar.n) {
            }
            c10 = this.f5757t.c(d5) + k11;
            if (this.f5758u == 1) {
            }
            RecyclerView.l.S(d5, i14, k11, i12, c10);
            if (cVar.n) {
            }
            sVar2 = sVar;
            e1(sVar2, qVar2);
            if (qVar2.f5986h) {
            }
            c11 = 0;
            i19 = 1;
            z15 = true;
        }
        if (!z15) {
            e1(sVar2, qVar2);
        }
        if (qVar2.f5983e == -1) {
            V0 = this.f5756s.k() - W0(this.f5756s.k());
        } else {
            V0 = V0(this.f5756s.g()) - this.f5756s.g();
        }
        if (V0 > 0) {
            return Math.min(qVar.f5981b, V0);
        }
        return 0;
    }

    public final View P0(boolean z10) {
        int k3 = this.f5756s.k();
        int g10 = this.f5756s.g();
        View view = null;
        for (int A = A() - 1; A >= 0; A--) {
            View z11 = z(A);
            int e10 = this.f5756s.e(z11);
            int b5 = this.f5756s.b(z11);
            if (b5 > k3 && e10 < g10) {
                if (b5 > g10 && z10) {
                    if (view == null) {
                        view = z11;
                    }
                }
                return z11;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean Q() {
        return this.D != 0;
    }

    public final View Q0(boolean z10) {
        int k3 = this.f5756s.k();
        int g10 = this.f5756s.g();
        int A = A();
        View view = null;
        for (int i10 = 0; i10 < A; i10++) {
            View z11 = z(i10);
            int e10 = this.f5756s.e(z11);
            if (this.f5756s.b(z11) > k3 && e10 < g10) {
                if (e10 < k3 && z10) {
                    if (view == null) {
                        view = z11;
                    }
                }
                return z11;
            }
        }
        return view;
    }

    public final void R0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int V0 = V0(Integer.MIN_VALUE);
        if (V0 != Integer.MIN_VALUE && (g10 = this.f5756s.g() - V0) > 0) {
            int i10 = g10 - (-i1(-g10, sVar, xVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f5756s.p(i10);
        }
    }

    public final void S0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k3;
        int W0 = W0(Integer.MAX_VALUE);
        if (W0 != Integer.MAX_VALUE && (k3 = W0 - this.f5756s.k()) > 0) {
            int i12 = k3 - i1(k3, sVar, xVar);
            if (!z10 || i12 <= 0) {
                return;
            }
            this.f5756s.p(-i12);
        }
    }

    public final int T0() {
        if (A() == 0) {
            return 0;
        }
        return RecyclerView.l.K(z(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void U(int i10) {
        super.U(i10);
        for (int i11 = 0; i11 < this.f5754q; i11++) {
            f fVar = this.f5755r[i11];
            int i12 = fVar.f5788b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f5788b = i12 + i10;
            }
            int i13 = fVar.c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.c = i13 + i10;
            }
        }
    }

    public final int U0() {
        int A = A();
        if (A == 0) {
            return 0;
        }
        return RecyclerView.l.K(z(A - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void V(int i10) {
        super.V(i10);
        for (int i11 = 0; i11 < this.f5754q; i11++) {
            f fVar = this.f5755r[i11];
            int i12 = fVar.f5788b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f5788b = i12 + i10;
            }
            int i13 = fVar.c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.c = i13 + i10;
            }
        }
    }

    public final int V0(int i10) {
        int h10 = this.f5755r[0].h(i10);
        for (int i11 = 1; i11 < this.f5754q; i11++) {
            int h11 = this.f5755r[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView.Adapter adapter) {
        this.C.b();
        for (int i10 = 0; i10 < this.f5754q; i10++) {
            this.f5755r[i10].d();
        }
    }

    public final int W0(int i10) {
        int k3 = this.f5755r[0].k(i10);
        for (int i11 = 1; i11 < this.f5754q; i11++) {
            int k10 = this.f5755r[i11].k(i10);
            if (k10 < k3) {
                k3 = k10;
            }
        }
        return k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(int i10, int i11, int i12) {
        int i13;
        int i14;
        int U0 = this.f5762y ? U0() : T0();
        if (i12 != 8) {
            i13 = i10 + i11;
        } else if (i10 >= i11) {
            i13 = i10 + 1;
            i14 = i11;
            d dVar = this.C;
            dVar.g(i14);
            if (i12 != 1) {
                dVar.h(i10, i11);
            } else if (i12 == 2) {
                dVar.i(i10, i11);
            } else if (i12 == 8) {
                dVar.i(i10, 1);
                dVar.h(i11, 1);
            }
            if (i13 > U0) {
                return;
            }
            if (i14 <= (this.f5762y ? T0() : U0())) {
                u0();
                return;
            }
            return;
        } else {
            i13 = i11 + 1;
        }
        i14 = i10;
        d dVar2 = this.C;
        dVar2.g(i14);
        if (i12 != 1) {
        }
        if (i13 > U0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5693b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.N);
        }
        for (int i10 = 0; i10 < this.f5754q; i10++) {
            this.f5755r[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r11 == r12) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Y0() {
        char c10;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        View view;
        boolean z13;
        ArrayList<View> arrayList;
        int A = A() - 1;
        BitSet bitSet = new BitSet(this.f5754q);
        bitSet.set(0, this.f5754q, true);
        if (this.f5758u == 1 && Z0()) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.f5762y) {
            i10 = -1;
        } else {
            i10 = A + 1;
            A = 0;
        }
        if (A < i10) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (A != i10) {
            View z14 = z(A);
            c cVar = (c) z14.getLayoutParams();
            if (bitSet.get(cVar.f5771m.f5790e)) {
                f fVar = cVar.f5771m;
                if (this.f5762y) {
                    int i13 = fVar.c;
                    if (i13 == Integer.MIN_VALUE) {
                        fVar.b();
                        i13 = fVar.c;
                    }
                    if (i13 < this.f5756s.g()) {
                        view = fVar.f5787a.get(arrayList.size() - 1);
                        fVar.getClass();
                        z13 = !f.j(view).n;
                    }
                    z13 = false;
                } else {
                    int i14 = fVar.f5788b;
                    if (i14 == Integer.MIN_VALUE) {
                        fVar.c();
                        i14 = fVar.f5788b;
                    }
                    if (i14 > this.f5756s.k()) {
                        view = fVar.f5787a.get(0);
                        fVar.getClass();
                        z13 = !f.j(view).n;
                    }
                    z13 = false;
                }
                if (z13) {
                    return z14;
                }
                bitSet.clear(cVar.f5771m.f5790e);
            }
            if (!cVar.n && (i12 = A + i11) != i10) {
                View z15 = z(i12);
                if (this.f5762y) {
                    int b5 = this.f5756s.b(z14);
                    int b10 = this.f5756s.b(z15);
                    if (b5 < b10) {
                        return z14;
                    }
                    if (b5 == b10) {
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    int e10 = this.f5756s.e(z14);
                    int e11 = this.f5756s.e(z15);
                    if (e10 > e11) {
                        return z14;
                    }
                }
                if (z10) {
                    if (cVar.f5771m.f5790e - ((c) z15.getLayoutParams()).f5771m.f5790e < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c10 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 != z12) {
                        return z14;
                    }
                } else {
                    continue;
                }
            }
            A += i11;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
        if (Z0() == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Z(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        View C;
        int i11;
        int T0;
        boolean z10;
        boolean z11;
        int f10;
        int f11;
        int f12;
        View i12;
        if (A() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f5693b;
        if (recyclerView != null) {
            C = recyclerView.C(view);
            if (C != null) {
                if (this.f5692a.k(C)) {
                }
                if (C != null) {
                    return null;
                }
                h1();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 != 66) {
                                    if (i10 == 130 && this.f5758u == 1) {
                                        i11 = 1;
                                    }
                                } else if (this.f5758u == 0) {
                                    i11 = 1;
                                }
                            } else if (this.f5758u == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else {
                            if (this.f5758u == 0) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        }
                    } else {
                        if (this.f5758u != 1 && Z0()) {
                            i11 = -1;
                        }
                        i11 = 1;
                    }
                } else {
                    if (this.f5758u != 1) {
                    }
                    i11 = -1;
                }
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                c cVar = (c) C.getLayoutParams();
                boolean z12 = cVar.n;
                f fVar = cVar.f5771m;
                if (i11 == 1) {
                    T0 = U0();
                } else {
                    T0 = T0();
                }
                m1(T0, xVar);
                j1(i11);
                q qVar = this.f5760w;
                qVar.c = qVar.f5982d + T0;
                qVar.f5981b = (int) (this.f5756s.l() * 0.33333334f);
                qVar.f5986h = true;
                qVar.f5980a = false;
                O0(sVar, qVar, xVar);
                this.E = this.f5762y;
                if (!z12 && (i12 = fVar.i(T0, i11)) != null && i12 != C) {
                    return i12;
                }
                if (c1(i11)) {
                    for (int i13 = this.f5754q - 1; i13 >= 0; i13--) {
                        View i14 = this.f5755r[i13].i(T0, i11);
                        if (i14 != null && i14 != C) {
                            return i14;
                        }
                    }
                } else {
                    for (int i15 = 0; i15 < this.f5754q; i15++) {
                        View i16 = this.f5755r[i15].i(T0, i11);
                        if (i16 != null && i16 != C) {
                            return i16;
                        }
                    }
                }
                boolean z13 = !this.f5761x;
                if (i11 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z13 == z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (z11) {
                        f12 = fVar.e();
                    } else {
                        f12 = fVar.f();
                    }
                    View u10 = u(f12);
                    if (u10 != null && u10 != C) {
                        return u10;
                    }
                }
                if (c1(i11)) {
                    for (int i17 = this.f5754q - 1; i17 >= 0; i17--) {
                        if (i17 != fVar.f5790e) {
                            f[] fVarArr = this.f5755r;
                            if (z11) {
                                f11 = fVarArr[i17].e();
                            } else {
                                f11 = fVarArr[i17].f();
                            }
                            View u11 = u(f11);
                            if (u11 != null && u11 != C) {
                                return u11;
                            }
                        }
                    }
                } else {
                    for (int i18 = 0; i18 < this.f5754q; i18++) {
                        f[] fVarArr2 = this.f5755r;
                        if (z11) {
                            f10 = fVarArr2[i18].e();
                        } else {
                            f10 = fVarArr2[i18].f();
                        }
                        View u12 = u(f10);
                        if (u12 != null && u12 != C) {
                            return u12;
                        }
                    }
                }
                return null;
            }
        }
        C = null;
        if (C != null) {
        }
    }

    public final boolean Z0() {
        return E() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        int J0 = J0(i10);
        PointF pointF = new PointF();
        if (J0 == 0) {
            return null;
        }
        if (this.f5758u == 0) {
            pointF.x = J0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = J0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (A() > 0) {
            View Q0 = Q0(false);
            View P0 = P0(false);
            if (Q0 != null && P0 != null) {
                int K = RecyclerView.l.K(Q0);
                int K2 = RecyclerView.l.K(P0);
                if (K < K2) {
                    accessibilityEvent.setFromIndex(K);
                    accessibilityEvent.setToIndex(K2);
                    return;
                }
                accessibilityEvent.setFromIndex(K2);
                accessibilityEvent.setToIndex(K);
            }
        }
    }

    public final void a1(View view, int i10, int i11, boolean z10) {
        Rect rect = this.I;
        g(view, rect);
        c cVar = (c) view.getLayoutParams();
        int o12 = o1(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int o13 = o1(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (D0(view, o12, o13, cVar)) {
            view.measure(o12, o13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        boolean z11;
        d dVar;
        boolean z12;
        e eVar;
        int k3;
        boolean z13;
        int i10;
        int i11;
        int k10;
        boolean z14;
        int k11;
        int T0;
        int g10;
        int i12;
        int k12;
        int e10;
        boolean z15;
        int k13;
        e eVar2 = this.G;
        b bVar = this.J;
        if ((eVar2 != null || this.A != -1) && xVar.b() == 0) {
            r0(sVar);
            bVar.a();
            return;
        }
        boolean z16 = true;
        if (bVar.f5768e && this.A == -1 && this.G == null) {
            z11 = false;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            dVar = this.C;
            if (z11) {
                bVar.a();
                e eVar3 = this.G;
                if (eVar3 != null) {
                    int i13 = eVar3.f5780k;
                    if (i13 > 0) {
                        if (i13 == this.f5754q) {
                            for (int i14 = 0; i14 < this.f5754q; i14++) {
                                this.f5755r[i14].d();
                                e eVar4 = this.G;
                                int i15 = eVar4.f5781l[i14];
                                if (i15 != Integer.MIN_VALUE) {
                                    if (eVar4.f5785q) {
                                        k13 = this.f5756s.g();
                                    } else {
                                        k13 = this.f5756s.k();
                                    }
                                    i15 += k13;
                                }
                                f fVar = this.f5755r[i14];
                                fVar.f5788b = i15;
                                fVar.c = i15;
                            }
                        } else {
                            eVar3.f5781l = null;
                            eVar3.f5780k = 0;
                            eVar3.f5782m = 0;
                            eVar3.n = null;
                            eVar3.f5783o = null;
                            eVar3.f5778i = eVar3.f5779j;
                        }
                    }
                    e eVar5 = this.G;
                    this.F = eVar5.f5786r;
                    boolean z17 = eVar5.f5784p;
                    e(null);
                    e eVar6 = this.G;
                    if (eVar6 != null && eVar6.f5784p != z17) {
                        eVar6.f5784p = z17;
                    }
                    this.f5761x = z17;
                    u0();
                    h1();
                    e eVar7 = this.G;
                    int i16 = eVar7.f5778i;
                    if (i16 != -1) {
                        this.A = i16;
                        z15 = eVar7.f5785q;
                    } else {
                        z15 = this.f5762y;
                    }
                    bVar.c = z15;
                    if (eVar7.f5782m > 1) {
                        dVar.f5772a = eVar7.n;
                        dVar.f5773b = eVar7.f5783o;
                    }
                } else {
                    h1();
                    bVar.c = this.f5762y;
                }
                if (!xVar.f5747g && (i11 = this.A) != -1) {
                    if (i11 >= 0 && i11 < xVar.b()) {
                        e eVar8 = this.G;
                        if (eVar8 != null && eVar8.f5778i != -1 && eVar8.f5780k >= 1) {
                            bVar.f5766b = Integer.MIN_VALUE;
                            bVar.f5765a = this.A;
                            z13 = true;
                            if (!z13) {
                                boolean z18 = this.E;
                                int b5 = xVar.b();
                                if (z18) {
                                    int A = A();
                                    while (true) {
                                        A--;
                                        if (A < 0) {
                                            break;
                                        }
                                        i10 = RecyclerView.l.K(z(A));
                                        if (i10 >= 0 && i10 < b5) {
                                            break;
                                        }
                                    }
                                    i10 = 0;
                                    bVar.f5765a = i10;
                                    bVar.f5766b = Integer.MIN_VALUE;
                                } else {
                                    int A2 = A();
                                    for (int i17 = 0; i17 < A2; i17++) {
                                        int K = RecyclerView.l.K(z(i17));
                                        if (K >= 0 && K < b5) {
                                            i10 = K;
                                            break;
                                        }
                                    }
                                    i10 = 0;
                                    bVar.f5765a = i10;
                                    bVar.f5766b = Integer.MIN_VALUE;
                                }
                            }
                            bVar.f5768e = true;
                        }
                        View u10 = u(this.A);
                        if (u10 != null) {
                            if (this.f5762y) {
                                T0 = U0();
                            } else {
                                T0 = T0();
                            }
                            bVar.f5765a = T0;
                            if (this.B != Integer.MIN_VALUE) {
                                if (bVar.c) {
                                    k12 = this.f5756s.g() - this.B;
                                    e10 = this.f5756s.b(u10);
                                } else {
                                    k12 = this.f5756s.k() + this.B;
                                    e10 = this.f5756s.e(u10);
                                }
                                g10 = k12 - e10;
                            } else {
                                if (this.f5756s.c(u10) > this.f5756s.l()) {
                                    if (bVar.c) {
                                        i12 = this.f5756s.g();
                                    } else {
                                        i12 = this.f5756s.k();
                                    }
                                } else {
                                    int e11 = this.f5756s.e(u10) - this.f5756s.k();
                                    if (e11 < 0) {
                                        i12 = -e11;
                                    } else {
                                        g10 = this.f5756s.g() - this.f5756s.b(u10);
                                        if (g10 >= 0) {
                                            bVar.f5766b = Integer.MIN_VALUE;
                                        }
                                    }
                                }
                                bVar.f5766b = i12;
                            }
                            bVar.f5766b = g10;
                        } else {
                            int i18 = this.A;
                            bVar.f5765a = i18;
                            int i19 = this.B;
                            if (i19 == Integer.MIN_VALUE) {
                                if (J0(i18) == 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar.c = z14;
                                if (z14) {
                                    k11 = staggeredGridLayoutManager.f5756s.g();
                                } else {
                                    k11 = staggeredGridLayoutManager.f5756s.k();
                                }
                                bVar.f5766b = k11;
                            } else {
                                if (bVar.c) {
                                    k10 = staggeredGridLayoutManager.f5756s.g() - i19;
                                } else {
                                    k10 = staggeredGridLayoutManager.f5756s.k() + i19;
                                }
                                bVar.f5766b = k10;
                            }
                            bVar.f5767d = true;
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        bVar.f5768e = true;
                    }
                    this.A = -1;
                    this.B = Integer.MIN_VALUE;
                }
                z13 = false;
                if (!z13) {
                }
                bVar.f5768e = true;
            }
            if (this.G == null && this.A == -1 && (bVar.c != this.E || Z0() != this.F)) {
                dVar.b();
                bVar.f5767d = true;
            }
            if (A() > 0 && ((eVar = this.G) == null || eVar.f5780k < 1)) {
                if (!bVar.f5767d) {
                    for (int i20 = 0; i20 < this.f5754q; i20++) {
                        this.f5755r[i20].d();
                        int i21 = bVar.f5766b;
                        if (i21 != Integer.MIN_VALUE) {
                            f fVar2 = this.f5755r[i20];
                            fVar2.f5788b = i21;
                            fVar2.c = i21;
                        }
                    }
                } else {
                    if (!z11 && bVar.f5769f != null) {
                        for (int i22 = 0; i22 < this.f5754q; i22++) {
                            f fVar3 = this.f5755r[i22];
                            fVar3.d();
                            int i23 = bVar.f5769f[i22];
                            fVar3.f5788b = i23;
                            fVar3.c = i23;
                        }
                    }
                    for (int i24 = 0; i24 < this.f5754q; i24++) {
                        f fVar4 = this.f5755r[i24];
                        boolean z19 = this.f5762y;
                        int i25 = bVar.f5766b;
                        if (z19) {
                            k3 = fVar4.h(Integer.MIN_VALUE);
                        } else {
                            k3 = fVar4.k(Integer.MIN_VALUE);
                        }
                        fVar4.d();
                        if (k3 != Integer.MIN_VALUE) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                            if ((!z19 || k3 >= staggeredGridLayoutManager2.f5756s.g()) && (z19 || k3 <= staggeredGridLayoutManager2.f5756s.k())) {
                                if (i25 != Integer.MIN_VALUE) {
                                    k3 += i25;
                                }
                                fVar4.c = k3;
                                fVar4.f5788b = k3;
                            }
                        }
                    }
                    f[] fVarArr = this.f5755r;
                    int length = fVarArr.length;
                    int[] iArr = bVar.f5769f;
                    if (iArr == null || iArr.length < length) {
                        bVar.f5769f = new int[staggeredGridLayoutManager.f5755r.length];
                    }
                    for (int i26 = 0; i26 < length; i26++) {
                        bVar.f5769f[i26] = fVarArr[i26].k(Integer.MIN_VALUE);
                    }
                }
            }
            t(sVar);
            q qVar = this.f5760w;
            qVar.f5980a = false;
            this.K = false;
            int l2 = this.f5757t.l();
            this.f5759v = l2 / this.f5754q;
            this.H = View.MeasureSpec.makeMeasureSpec(l2, this.f5757t.i());
            m1(bVar.f5765a, xVar);
            if (!bVar.c) {
                j1(-1);
                O0(sVar, qVar, xVar);
                j1(1);
            } else {
                j1(1);
                O0(sVar, qVar, xVar);
                j1(-1);
            }
            qVar.c = bVar.f5765a + qVar.f5982d;
            O0(sVar, qVar, xVar);
            if (this.f5757t.i() == 1073741824) {
                int A3 = A();
                float f10 = 0.0f;
                for (int i27 = 0; i27 < A3; i27++) {
                    View z20 = z(i27);
                    float c10 = this.f5757t.c(z20);
                    if (c10 >= f10) {
                        if (((c) z20.getLayoutParams()).n) {
                            c10 = (c10 * 1.0f) / this.f5754q;
                        }
                        f10 = Math.max(f10, c10);
                    }
                }
                int i28 = this.f5759v;
                int round = Math.round(f10 * this.f5754q);
                if (this.f5757t.i() == Integer.MIN_VALUE) {
                    round = Math.min(round, this.f5757t.l());
                }
                this.f5759v = round / this.f5754q;
                this.H = View.MeasureSpec.makeMeasureSpec(round, this.f5757t.i());
                if (this.f5759v != i28) {
                    for (int i29 = 0; i29 < A3; i29++) {
                        View z21 = z(i29);
                        c cVar = (c) z21.getLayoutParams();
                        if (!cVar.n) {
                            if (Z0() && this.f5758u == 1) {
                                int i30 = this.f5754q;
                                int i31 = cVar.f5771m.f5790e;
                                z21.offsetLeftAndRight(((-((i30 - 1) - i31)) * this.f5759v) - ((-((i30 - 1) - i31)) * i28));
                            } else {
                                int i32 = cVar.f5771m.f5790e;
                                int i33 = this.f5758u;
                                int i34 = (this.f5759v * i32) - (i32 * i28);
                                if (i33 == 1) {
                                    z21.offsetLeftAndRight(i34);
                                } else {
                                    z21.offsetTopAndBottom(i34);
                                }
                            }
                        }
                    }
                }
            }
            if (A() > 0) {
                if (this.f5762y) {
                    R0(sVar, xVar, true);
                    S0(sVar, xVar, false);
                } else {
                    S0(sVar, xVar, true);
                    R0(sVar, xVar, false);
                }
            }
            if (z10 && !xVar.f5747g) {
                if (this.D == 0 && A() > 0 && (this.K || Y0() != null)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    RecyclerView recyclerView = this.f5693b;
                    if (recyclerView != null) {
                        recyclerView.removeCallbacks(this.N);
                    }
                    if (K0()) {
                        if (xVar.f5747g) {
                            bVar.a();
                        }
                        this.E = bVar.c;
                        this.F = Z0();
                        if (z16) {
                            bVar.a();
                            b1(sVar, xVar, false);
                            return;
                        }
                        return;
                    }
                }
            }
            z16 = false;
            if (xVar.f5747g) {
            }
            this.E = bVar.c;
            this.F = Z0();
            if (z16) {
            }
        }
        z11 = true;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
        dVar = this.C;
        if (z11) {
        }
        if (this.G == null) {
            dVar.b();
            bVar.f5767d = true;
        }
        if (A() > 0) {
            if (!bVar.f5767d) {
            }
        }
        t(sVar);
        q qVar2 = this.f5760w;
        qVar2.f5980a = false;
        this.K = false;
        int l22 = this.f5757t.l();
        this.f5759v = l22 / this.f5754q;
        this.H = View.MeasureSpec.makeMeasureSpec(l22, this.f5757t.i());
        m1(bVar.f5765a, xVar);
        if (!bVar.c) {
        }
        qVar2.c = bVar.f5765a + qVar2.f5982d;
        O0(sVar, qVar2, xVar);
        if (this.f5757t.i() == 1073741824) {
        }
        if (A() > 0) {
        }
        if (z10) {
            if (this.D == 0) {
            }
            z12 = false;
            if (z12) {
            }
        }
        z16 = false;
        if (xVar.f5747g) {
        }
        this.E = bVar.c;
        this.F = Z0();
        if (z16) {
        }
    }

    public final boolean c1(int i10) {
        if (this.f5758u == 0) {
            return (i10 == -1) != this.f5762y;
        }
        return ((i10 == -1) == this.f5762y) == Z0();
    }

    public final void d1(int i10, RecyclerView.x xVar) {
        int T0;
        int i11;
        if (i10 > 0) {
            T0 = U0();
            i11 = 1;
        } else {
            T0 = T0();
            i11 = -1;
        }
        q qVar = this.f5760w;
        qVar.f5980a = true;
        m1(T0, xVar);
        j1(i11);
        qVar.c = T0 + qVar.f5982d;
        qVar.f5981b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(String str) {
        if (this.G == null) {
            super.e(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(int i10, int i11) {
        X0(i10, i11, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.f5983e == (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(RecyclerView.s sVar, q qVar) {
        int min;
        int min2;
        if (qVar.f5980a && !qVar.f5987i) {
            if (qVar.f5981b != 0) {
                int i10 = 1;
                if (qVar.f5983e == -1) {
                    int i11 = qVar.f5984f;
                    int k3 = this.f5755r[0].k(i11);
                    while (i10 < this.f5754q) {
                        int k10 = this.f5755r[i10].k(i11);
                        if (k10 > k3) {
                            k3 = k10;
                        }
                        i10++;
                    }
                    int i12 = i11 - k3;
                    if (i12 < 0) {
                        min2 = qVar.f5985g;
                        f1(min2, sVar);
                        return;
                    }
                    min2 = qVar.f5985g - Math.min(i12, qVar.f5981b);
                    f1(min2, sVar);
                    return;
                }
                int i13 = qVar.f5985g;
                int h10 = this.f5755r[0].h(i13);
                while (i10 < this.f5754q) {
                    int h11 = this.f5755r[i10].h(i13);
                    if (h11 < h10) {
                        h10 = h11;
                    }
                    i10++;
                }
                int i14 = h10 - qVar.f5985g;
                if (i14 < 0) {
                    min = qVar.f5984f;
                    g1(min, sVar);
                }
                min = Math.min(i14, qVar.f5981b) + qVar.f5984f;
                g1(min, sVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f0() {
        this.C.b();
        u0();
    }

    public final void f1(int i10, RecyclerView.s sVar) {
        for (int A = A() - 1; A >= 0; A--) {
            View z10 = z(A);
            if (this.f5756s.e(z10) >= i10 && this.f5756s.o(z10) >= i10) {
                c cVar = (c) z10.getLayoutParams();
                if (cVar.n) {
                    for (int i11 = 0; i11 < this.f5754q; i11++) {
                        if (this.f5755r[i11].f5787a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f5754q; i12++) {
                        this.f5755r[i12].l();
                    }
                } else if (cVar.f5771m.f5787a.size() == 1) {
                    return;
                } else {
                    cVar.f5771m.l();
                }
                androidx.recyclerview.widget.d dVar = this.f5692a;
                z zVar = (z) dVar.f5810a;
                int indexOfChild = zVar.f6000a.indexOfChild(z10);
                if (indexOfChild >= 0) {
                    if (dVar.f5811b.f(indexOfChild)) {
                        dVar.m(z10);
                    }
                    zVar.b(indexOfChild);
                }
                sVar.i(z10);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i10, int i11) {
        X0(i10, i11, 8);
    }

    public final void g1(int i10, RecyclerView.s sVar) {
        while (A() > 0) {
            View z10 = z(0);
            if (this.f5756s.b(z10) <= i10 && this.f5756s.n(z10) <= i10) {
                c cVar = (c) z10.getLayoutParams();
                if (cVar.n) {
                    for (int i11 = 0; i11 < this.f5754q; i11++) {
                        if (this.f5755r[i11].f5787a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f5754q; i12++) {
                        this.f5755r[i12].m();
                    }
                } else if (cVar.f5771m.f5787a.size() == 1) {
                    return;
                } else {
                    cVar.f5771m.m();
                }
                androidx.recyclerview.widget.d dVar = this.f5692a;
                z zVar = (z) dVar.f5810a;
                int indexOfChild = zVar.f6000a.indexOfChild(z10);
                if (indexOfChild >= 0) {
                    if (dVar.f5811b.f(indexOfChild)) {
                        dVar.m(z10);
                    }
                    zVar.b(indexOfChild);
                }
                sVar.i(z10);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean h() {
        return this.f5758u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(int i10, int i11) {
        X0(i10, i11, 2);
    }

    public final void h1() {
        boolean z10;
        if (this.f5758u != 1 && Z0()) {
            z10 = !this.f5761x;
            this.f5762y = z10;
        }
        z10 = this.f5761x;
        this.f5762y = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean i() {
        return this.f5758u == 1;
    }

    public final int i1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (A() != 0 && i10 != 0) {
            d1(i10, xVar);
            q qVar = this.f5760w;
            int O0 = O0(sVar, qVar, xVar);
            if (qVar.f5981b >= O0) {
                i10 = i10 < 0 ? -O0 : O0;
            }
            this.f5756s.p(-i10);
            this.E = this.f5762y;
            qVar.f5981b = 0;
            e1(sVar, qVar);
            return i10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean j(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j0(RecyclerView recyclerView, int i10, int i11) {
        X0(i10, i11, 4);
    }

    public final void j1(int i10) {
        q qVar = this.f5760w;
        qVar.f5983e = i10;
        int i11 = 1;
        if (this.f5762y != (i10 == -1)) {
            i11 = -1;
        }
        qVar.f5982d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k0(RecyclerView.s sVar, RecyclerView.x xVar) {
        b1(sVar, xVar, true);
    }

    public final void k1(int i10) {
        e(null);
        if (i10 != this.f5754q) {
            this.C.b();
            u0();
            this.f5754q = i10;
            this.f5763z = new BitSet(this.f5754q);
            this.f5755r = new f[this.f5754q];
            for (int i11 = 0; i11 < this.f5754q; i11++) {
                this.f5755r[i11] = new f(i11);
            }
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l(int i10, int i11, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        q qVar;
        boolean z10;
        int h10;
        int i12;
        if (this.f5758u != 0) {
            i10 = i11;
        }
        if (A() != 0 && i10 != 0) {
            d1(i10, xVar);
            int[] iArr = this.M;
            if (iArr == null || iArr.length < this.f5754q) {
                this.M = new int[this.f5754q];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f5754q;
                qVar = this.f5760w;
                if (i13 >= i15) {
                    break;
                }
                if (qVar.f5982d == -1) {
                    h10 = qVar.f5984f;
                    i12 = this.f5755r[i13].k(h10);
                } else {
                    h10 = this.f5755r[i13].h(qVar.f5985g);
                    i12 = qVar.f5985g;
                }
                int i16 = h10 - i12;
                if (i16 >= 0) {
                    this.M[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.M, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = qVar.c;
                if (i18 >= 0 && i18 < xVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((m.b) cVar).a(qVar.c, this.M[i17]);
                    qVar.c += qVar.f5982d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l0(RecyclerView.x xVar) {
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.G = null;
        this.J.a();
    }

    public final void l1(int i10, int i11) {
        for (int i12 = 0; i12 < this.f5754q; i12++) {
            if (!this.f5755r[i12].f5787a.isEmpty()) {
                n1(this.f5755r[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void m0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.G = eVar;
            if (this.A != -1) {
                eVar.f5781l = null;
                eVar.f5780k = 0;
                eVar.f5778i = -1;
                eVar.f5779j = -1;
                eVar.f5781l = null;
                eVar.f5780k = 0;
                eVar.f5782m = 0;
                eVar.n = null;
                eVar.f5783o = null;
            }
            u0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(int i10, RecyclerView.x xVar) {
        boolean z10;
        int i11;
        int i12;
        RecyclerView recyclerView;
        boolean z11;
        int i13;
        boolean z12;
        q qVar = this.f5760w;
        boolean z13 = false;
        qVar.f5981b = 0;
        qVar.c = i10;
        RecyclerView.w wVar = this.f5695e;
        if (wVar != null && wVar.f5732e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i13 = xVar.f5742a) != -1) {
            boolean z14 = this.f5762y;
            if (i13 < i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 == z12) {
                i11 = this.f5756s.l();
            } else {
                i12 = this.f5756s.l();
                i11 = 0;
                recyclerView = this.f5693b;
                if (recyclerView == null && recyclerView.f5631p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    qVar.f5984f = this.f5756s.k() - i12;
                    qVar.f5985g = this.f5756s.g() + i11;
                } else {
                    qVar.f5985g = this.f5756s.f() + i11;
                    qVar.f5984f = -i12;
                }
                qVar.f5986h = false;
                qVar.f5980a = true;
                if (this.f5756s.i() == 0 && this.f5756s.f() == 0) {
                    z13 = true;
                }
                qVar.f5987i = z13;
            }
        } else {
            i11 = 0;
        }
        i12 = 0;
        recyclerView = this.f5693b;
        if (recyclerView == null) {
        }
        z11 = false;
        if (!z11) {
        }
        qVar.f5986h = false;
        qVar.f5980a = true;
        if (this.f5756s.i() == 0) {
            z13 = true;
        }
        qVar.f5987i = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable n0() {
        int T0;
        View Q0;
        int k3;
        int k10;
        int[] iArr;
        e eVar = this.G;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f5784p = this.f5761x;
        eVar2.f5785q = this.E;
        eVar2.f5786r = this.F;
        d dVar = this.C;
        if (dVar != null && (iArr = dVar.f5772a) != null) {
            eVar2.n = iArr;
            eVar2.f5782m = iArr.length;
            eVar2.f5783o = dVar.f5773b;
        } else {
            eVar2.f5782m = 0;
        }
        int i10 = -1;
        if (A() > 0) {
            if (this.E) {
                T0 = U0();
            } else {
                T0 = T0();
            }
            eVar2.f5778i = T0;
            if (this.f5762y) {
                Q0 = P0(true);
            } else {
                Q0 = Q0(true);
            }
            if (Q0 != null) {
                i10 = RecyclerView.l.K(Q0);
            }
            eVar2.f5779j = i10;
            int i11 = this.f5754q;
            eVar2.f5780k = i11;
            eVar2.f5781l = new int[i11];
            for (int i12 = 0; i12 < this.f5754q; i12++) {
                if (this.E) {
                    k3 = this.f5755r[i12].h(Integer.MIN_VALUE);
                    if (k3 != Integer.MIN_VALUE) {
                        k10 = this.f5756s.g();
                        k3 -= k10;
                        eVar2.f5781l[i12] = k3;
                    } else {
                        eVar2.f5781l[i12] = k3;
                    }
                } else {
                    k3 = this.f5755r[i12].k(Integer.MIN_VALUE);
                    if (k3 != Integer.MIN_VALUE) {
                        k10 = this.f5756s.k();
                        k3 -= k10;
                        eVar2.f5781l[i12] = k3;
                    } else {
                        eVar2.f5781l[i12] = k3;
                    }
                }
            }
        } else {
            eVar2.f5778i = -1;
            eVar2.f5779j = -1;
            eVar2.f5780k = 0;
        }
        return eVar2;
    }

    public final void n1(f fVar, int i10, int i11) {
        int i12 = fVar.f5789d;
        if (i10 == -1) {
            int i13 = fVar.f5788b;
            if (i13 == Integer.MIN_VALUE) {
                fVar.c();
                i13 = fVar.f5788b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = fVar.c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.b();
                i14 = fVar.c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.f5763z.set(fVar.f5790e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void o0(int i10) {
        if (i10 == 0) {
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return N0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int r(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int s(RecyclerView.x xVar) {
        return N0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m v() {
        return this.f5758u == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return i1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m w(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void w0(int i10) {
        e eVar = this.G;
        if (eVar != null && eVar.f5778i != i10) {
            eVar.f5781l = null;
            eVar.f5780k = 0;
            eVar.f5778i = -1;
            eVar.f5779j = -1;
        }
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m x(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int x0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return i1(i10, sVar, xVar);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5754q = -1;
        this.f5761x = false;
        this.f5762y = false;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.C = new d();
        this.D = 2;
        this.I = new Rect();
        this.J = new b();
        this.K = false;
        this.L = true;
        this.N = new a();
        RecyclerView.l.d L = RecyclerView.l.L(context, attributeSet, i10, i11);
        int i12 = L.f5708a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        e(null);
        if (i12 != this.f5758u) {
            this.f5758u = i12;
            w wVar = this.f5756s;
            this.f5756s = this.f5757t;
            this.f5757t = wVar;
            u0();
        }
        k1(L.f5709b);
        boolean z10 = L.c;
        e(null);
        e eVar = this.G;
        if (eVar != null && eVar.f5784p != z10) {
            eVar.f5784p = z10;
        }
        this.f5761x = z10;
        u0();
        this.f5760w = new q();
        this.f5756s = w.a(this, this.f5758u);
        this.f5757t = w.a(this, 1 - this.f5758u);
    }
}
