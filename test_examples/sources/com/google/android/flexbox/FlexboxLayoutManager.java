package com.google.android.flexbox;

import a3.m;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.l implements c5.a, RecyclerView.w.b {
    public static final Rect O = new Rect();
    public c A;
    public final a B;
    public w C;
    public w D;
    public d E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final SparseArray<View> J;
    public final Context K;
    public View L;
    public int M;
    public final a.C0058a N;

    /* renamed from: q  reason: collision with root package name */
    public int f6735q;

    /* renamed from: r  reason: collision with root package name */
    public int f6736r;

    /* renamed from: s  reason: collision with root package name */
    public int f6737s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6739u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6740v;

    /* renamed from: y  reason: collision with root package name */
    public RecyclerView.s f6743y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView.x f6744z;

    /* renamed from: t  reason: collision with root package name */
    public final int f6738t = -1;

    /* renamed from: w  reason: collision with root package name */
    public List<c5.c> f6741w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final com.google.android.flexbox.a f6742x = new com.google.android.flexbox.a(this);

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6745a;

        /* renamed from: b  reason: collision with root package name */
        public int f6746b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f6747d = 0;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6748e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6749f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6750g;

        public a() {
        }

        public static void a(a aVar) {
            int k3;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (!flexboxLayoutManager.e1() && flexboxLayoutManager.f6739u) {
                if (!aVar.f6748e) {
                    k3 = flexboxLayoutManager.f5704o - flexboxLayoutManager.C.k();
                } else {
                    k3 = flexboxLayoutManager.C.g();
                }
            } else {
                if (!aVar.f6748e) {
                    k3 = flexboxLayoutManager.C.k();
                }
                k3 = flexboxLayoutManager.C.g();
            }
            aVar.c = k3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
            if (r2 == 2) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(a aVar) {
            aVar.f6745a = -1;
            aVar.f6746b = -1;
            aVar.c = Integer.MIN_VALUE;
            boolean z10 = false;
            aVar.f6749f = false;
            aVar.f6750g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.e1()) {
                int i10 = flexboxLayoutManager.f6736r;
                if (i10 == 0) {
                    if (flexboxLayoutManager.f6735q == 1) {
                        z10 = true;
                    }
                } else if (i10 == 2) {
                    z10 = true;
                }
            } else {
                int i11 = flexboxLayoutManager.f6736r;
                if (i11 == 0) {
                    if (flexboxLayoutManager.f6735q == 3) {
                        z10 = true;
                    }
                }
            }
            aVar.f6748e = z10;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f6745a + ", mFlexLinePosition=" + this.f6746b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.f6747d + ", mLayoutFromEnd=" + this.f6748e + ", mValid=" + this.f6749f + ", mAssignedFromSavedState=" + this.f6750g + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.m implements c5.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        public final float f6752m;
        public final float n;

        /* renamed from: o  reason: collision with root package name */
        public final int f6753o;

        /* renamed from: p  reason: collision with root package name */
        public final float f6754p;

        /* renamed from: q  reason: collision with root package name */
        public int f6755q;

        /* renamed from: r  reason: collision with root package name */
        public int f6756r;

        /* renamed from: s  reason: collision with root package name */
        public final int f6757s;

        /* renamed from: t  reason: collision with root package name */
        public final int f6758t;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f6759u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b() {
            super(-2, -2);
            this.f6752m = 0.0f;
            this.n = 1.0f;
            this.f6753o = -1;
            this.f6754p = -1.0f;
            this.f6757s = 16777215;
            this.f6758t = 16777215;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6752m = 0.0f;
            this.n = 1.0f;
            this.f6753o = -1;
            this.f6754p = -1.0f;
            this.f6757s = 16777215;
            this.f6758t = 16777215;
        }

        public b(Parcel parcel) {
            super(-2, -2);
            this.f6752m = 0.0f;
            this.n = 1.0f;
            this.f6753o = -1;
            this.f6754p = -1.0f;
            this.f6757s = 16777215;
            this.f6758t = 16777215;
            this.f6752m = parcel.readFloat();
            this.n = parcel.readFloat();
            this.f6753o = parcel.readInt();
            this.f6754p = parcel.readFloat();
            this.f6755q = parcel.readInt();
            this.f6756r = parcel.readInt();
            this.f6757s = parcel.readInt();
            this.f6758t = parcel.readInt();
            this.f6759u = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // c5.b
        public final boolean A() {
            return this.f6759u;
        }

        @Override // c5.b
        public final int C() {
            return this.f6758t;
        }

        @Override // c5.b
        public final void D(int i10) {
            this.f6755q = i10;
        }

        @Override // c5.b
        public final int E() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // c5.b
        public final int F() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // c5.b
        public final int G() {
            return this.f6757s;
        }

        @Override // c5.b
        public final int H() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // c5.b
        public final int a() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // c5.b
        public final int b() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // c5.b
        public final void j(int i10) {
            this.f6756r = i10;
        }

        @Override // c5.b
        public final float k() {
            return this.f6752m;
        }

        @Override // c5.b
        public final float p() {
            return this.f6754p;
        }

        @Override // c5.b
        public final int r() {
            return this.f6753o;
        }

        @Override // c5.b
        public final float u() {
            return this.n;
        }

        @Override // c5.b
        public final int w() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f6752m);
            parcel.writeFloat(this.n);
            parcel.writeInt(this.f6753o);
            parcel.writeFloat(this.f6754p);
            parcel.writeInt(this.f6755q);
            parcel.writeInt(this.f6756r);
            parcel.writeInt(this.f6757s);
            parcel.writeInt(this.f6758t);
            parcel.writeByte(this.f6759u ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // c5.b
        public final int y() {
            return this.f6756r;
        }

        @Override // c5.b
        public final int z() {
            return this.f6755q;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f6760a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6761b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f6762d;

        /* renamed from: e  reason: collision with root package name */
        public int f6763e;

        /* renamed from: f  reason: collision with root package name */
        public int f6764f;

        /* renamed from: g  reason: collision with root package name */
        public int f6765g;

        /* renamed from: h  reason: collision with root package name */
        public int f6766h = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f6767i = 1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6768j;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f6760a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.c);
            sb.append(", mPosition=");
            sb.append(this.f6762d);
            sb.append(", mOffset=");
            sb.append(this.f6763e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f6764f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.f6765g);
            sb.append(", mItemDirection=");
            sb.append(this.f6766h);
            sb.append(", mLayoutDirection=");
            return e.h(sb, this.f6767i, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public int f6769i;

        /* renamed from: j  reason: collision with root package name */
        public int f6770j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
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
            this.f6769i = parcel.readInt();
            this.f6770j = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f6769i);
            sb.append(", mAnchorOffset=");
            return e.h(sb, this.f6770j, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6769i);
            parcel.writeInt(this.f6770j);
        }

        public d(d dVar) {
            this.f6769i = dVar.f6769i;
            this.f6770j = dVar.f6770j;
        }
    }

    public FlexboxLayoutManager(Context context) {
        a aVar = new a();
        this.B = aVar;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new a.C0058a();
        g1(0);
        h1();
        if (this.f6737s != 4) {
            q0();
            this.f6741w.clear();
            a.b(aVar);
            aVar.f6747d = 0;
            this.f6737s = 4;
            u0();
        }
        this.f5698h = true;
        this.K = context;
    }

    public static boolean R(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 <= 0 || i10 == i12) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i10;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean i1(View view, int i10, int i11, b bVar) {
        if (!view.isLayoutRequested() && this.f5699i && R(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) bVar).width) && R(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) bVar).height)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void G0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.f5729a = i10;
        H0(rVar);
    }

    public final int J0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        int b5 = xVar.b();
        M0();
        View O0 = O0(b5);
        View Q0 = Q0(b5);
        if (xVar.b() != 0 && O0 != null && Q0 != null) {
            return Math.min(this.C.l(), this.C.b(Q0) - this.C.e(O0));
        }
        return 0;
    }

    public final int K0(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        int b5 = xVar.b();
        View O0 = O0(b5);
        View Q0 = Q0(b5);
        if (xVar.b() != 0 && O0 != null && Q0 != null) {
            int K = RecyclerView.l.K(O0);
            int K2 = RecyclerView.l.K(Q0);
            int abs = Math.abs(this.C.b(Q0) - this.C.e(O0));
            int[] iArr = this.f6742x.c;
            int i10 = iArr[K];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((iArr[K2] - i10) + 1))) + (this.C.k() - this.C.e(O0)));
            }
        }
        return 0;
    }

    public final int L0(RecyclerView.x xVar) {
        int K;
        if (A() == 0) {
            return 0;
        }
        int b5 = xVar.b();
        View O0 = O0(b5);
        View Q0 = Q0(b5);
        if (xVar.b() != 0 && O0 != null && Q0 != null) {
            View S0 = S0(0, A());
            int i10 = -1;
            if (S0 == null) {
                K = -1;
            } else {
                K = RecyclerView.l.K(S0);
            }
            View S02 = S0(A() - 1, -1);
            if (S02 != null) {
                i10 = RecyclerView.l.K(S02);
            }
            return (int) ((Math.abs(this.C.b(Q0) - this.C.e(O0)) / ((i10 - K) + 1)) * xVar.b());
        }
        return 0;
    }

    public final void M0() {
        w vVar;
        if (this.C != null) {
            return;
        }
        if (e1()) {
            if (this.f6736r == 0) {
                this.C = new u(this);
                vVar = new v(this);
            } else {
                this.C = new v(this);
                vVar = new u(this);
            }
        } else if (this.f6736r == 0) {
            this.C = new v(this);
            vVar = new u(this);
        } else {
            this.C = new u(this);
            vVar = new v(this);
        }
        this.D = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int N0(RecyclerView.s sVar, RecyclerView.x xVar, c cVar) {
        boolean z10;
        c cVar2;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        b bVar;
        int i16;
        int round;
        int measuredWidth;
        int measuredHeight;
        int i17;
        int i18;
        int i19;
        int i20;
        c5.b bVar2;
        int i21;
        com.google.android.flexbox.a aVar;
        int i22;
        c5.c cVar3;
        int i23;
        int i24;
        int i25;
        int i26;
        int round2;
        int measuredWidth2;
        int i27;
        boolean z12;
        int i28;
        int i29;
        Rect rect;
        int E;
        int E2;
        int H;
        int H2;
        int i30;
        int i31;
        int measuredHeight2;
        int i32;
        c cVar4 = cVar;
        int i33 = cVar4.f6764f;
        if (i33 != Integer.MIN_VALUE) {
            int i34 = cVar4.f6760a;
            if (i34 < 0) {
                cVar4.f6764f = i33 + i34;
            }
            f1(sVar, cVar4);
        }
        int i35 = cVar4.f6760a;
        boolean e12 = e1();
        int i36 = i35;
        int i37 = 0;
        while (true) {
            if (i36 <= 0 && !this.A.f6761b) {
                break;
            }
            List<c5.c> list = this.f6741w;
            int i38 = cVar4.f6762d;
            if (i38 >= 0 && i38 < xVar.b() && (i32 = cVar4.c) >= 0 && i32 < list.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            c5.c cVar5 = this.f6741w.get(cVar4.c);
            cVar4.f6762d = cVar5.f6542k;
            boolean e13 = e1();
            com.google.android.flexbox.a aVar2 = this.f6742x;
            Rect rect2 = O;
            a aVar3 = this.B;
            if (e13) {
                int H3 = H();
                int I = I();
                int i39 = this.f5704o;
                int i40 = cVar4.f6763e;
                if (cVar4.f6767i == -1) {
                    i40 -= cVar5.c;
                }
                int i41 = cVar4.f6762d;
                float f10 = aVar3.f6747d;
                float f11 = H3 - f10;
                float f12 = (i39 - I) - f10;
                float max = Math.max(0.0f, 0.0f);
                int i42 = cVar5.f6535d;
                i10 = i35;
                i11 = i36;
                int i43 = i41;
                int i44 = 0;
                while (i43 < i41 + i42) {
                    View Z0 = Z0(i43);
                    if (Z0 == null) {
                        i25 = i42;
                        z12 = e12;
                        i28 = i37;
                        i27 = i40;
                        rect = rect2;
                        i26 = i41;
                    } else {
                        i25 = i42;
                        int i45 = cVar4.f6767i;
                        g(Z0, rect2);
                        i26 = i41;
                        if (i45 == 1) {
                            c(Z0);
                        } else {
                            d(Z0, i44, false);
                            i44++;
                        }
                        int i46 = i44;
                        long j2 = aVar2.f6773d[i43];
                        int i47 = (int) j2;
                        int i48 = (int) (j2 >> 32);
                        b bVar3 = (b) Z0.getLayoutParams();
                        if (i1(Z0, i47, i48, bVar3)) {
                            Z0.measure(i47, i48);
                        }
                        float F = f11 + RecyclerView.l.F(Z0) + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin;
                        float M = f12 - (RecyclerView.l.M(Z0) + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin);
                        int O2 = RecyclerView.l.O(Z0) + i40;
                        if (this.f6739u) {
                            round2 = Math.round(M) - Z0.getMeasuredWidth();
                            measuredWidth2 = Math.round(M);
                        } else {
                            round2 = Math.round(F);
                            measuredWidth2 = Z0.getMeasuredWidth() + Math.round(F);
                        }
                        int measuredHeight3 = Z0.getMeasuredHeight() + O2;
                        int i49 = measuredWidth2;
                        i27 = i40;
                        c5.b bVar4 = (c5.b) Z0.getLayoutParams();
                        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar2.f6771a;
                        z12 = e12;
                        int i50 = flexboxLayoutManager.f6737s;
                        i28 = i37;
                        if (bVar4.r() != -1) {
                            i29 = bVar4.r();
                        } else {
                            i29 = i50;
                        }
                        int i51 = cVar5.c;
                        rect = rect2;
                        if (i29 != 0) {
                            if (i29 != 1) {
                                if (i29 != 2) {
                                    if (i29 != 3) {
                                        if (i29 != 4) {
                                            int measuredWidth3 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                                            f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                                            f11 = RecyclerView.l.M(Z0) + measuredWidth3 + max + F;
                                            i44 = i46;
                                        }
                                    } else {
                                        int i52 = flexboxLayoutManager.f6736r;
                                        int i53 = cVar5.f6539h;
                                        if (i52 != 2) {
                                            measuredHeight2 = Math.max(i53 - Z0.getBaseline(), bVar4.H());
                                            E = O2 + measuredHeight2;
                                        } else {
                                            E2 = Math.max(Z0.getBaseline() + (i53 - Z0.getMeasuredHeight()), bVar4.E());
                                            E = O2 - E2;
                                            i30 = measuredHeight3 - E2;
                                            i31 = i30;
                                            Z0.layout(round2, E, i49, i31);
                                            int measuredWidth32 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                                            f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                                            f11 = RecyclerView.l.M(Z0) + measuredWidth32 + max + F;
                                            i44 = i46;
                                        }
                                    }
                                } else {
                                    int H4 = ((bVar4.H() + (i51 - Z0.getMeasuredHeight())) - bVar4.E()) / 2;
                                    if (flexboxLayoutManager.f6736r != 2) {
                                        E = O2 + H4;
                                    } else {
                                        E = O2 - H4;
                                    }
                                    i31 = Z0.getMeasuredHeight() + E;
                                    Z0.layout(round2, E, i49, i31);
                                    int measuredWidth322 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                                    f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                                    f11 = RecyclerView.l.M(Z0) + measuredWidth322 + max + F;
                                    i44 = i46;
                                }
                            } else if (flexboxLayoutManager.f6736r != 2) {
                                int i54 = O2 + i51;
                                H = (i54 - Z0.getMeasuredHeight()) - bVar4.E();
                                H2 = i54 - bVar4.E();
                                Z0.layout(round2, H, i49, H2);
                                int measuredWidth3222 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                                f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                                f11 = RecyclerView.l.M(Z0) + measuredWidth3222 + max + F;
                                i44 = i46;
                            } else {
                                E = bVar4.H() + Z0.getMeasuredHeight() + (O2 - i51);
                                measuredHeight2 = Z0.getMeasuredHeight() + (measuredHeight3 - i51);
                                measuredHeight3 = bVar4.H();
                            }
                            i30 = measuredHeight3 + measuredHeight2;
                            i31 = i30;
                            Z0.layout(round2, E, i49, i31);
                            int measuredWidth32222 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                            f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                            f11 = RecyclerView.l.M(Z0) + measuredWidth32222 + max + F;
                            i44 = i46;
                        }
                        if (flexboxLayoutManager.f6736r != 2) {
                            H = bVar4.H() + O2;
                            H2 = bVar4.H() + measuredHeight3;
                            Z0.layout(round2, H, i49, H2);
                            int measuredWidth322222 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                            f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                            f11 = RecyclerView.l.M(Z0) + measuredWidth322222 + max + F;
                            i44 = i46;
                        } else {
                            E = O2 - bVar4.E();
                            E2 = bVar4.E();
                            i30 = measuredHeight3 - E2;
                            i31 = i30;
                            Z0.layout(round2, E, i49, i31);
                            int measuredWidth3222222 = Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                            f12 = M - ((RecyclerView.l.F(Z0) + (Z0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin)) + max);
                            f11 = RecyclerView.l.M(Z0) + measuredWidth3222222 + max + F;
                            i44 = i46;
                        }
                    }
                    i43++;
                    cVar4 = cVar;
                    i42 = i25;
                    i41 = i26;
                    i40 = i27;
                    e12 = z12;
                    rect2 = rect;
                    i37 = i28;
                }
                cVar2 = cVar4;
                z11 = e12;
                i12 = i37;
                cVar2.c += this.A.f6767i;
                i14 = cVar5.c;
            } else {
                cVar2 = cVar4;
                i10 = i35;
                z11 = e12;
                i11 = i36;
                i12 = i37;
                int J = J();
                int G = G();
                int i55 = this.f5705p;
                int i56 = cVar2.f6763e;
                if (cVar2.f6767i == -1) {
                    int i57 = cVar5.c;
                    int i58 = i56 - i57;
                    i13 = i56 + i57;
                    i56 = i58;
                } else {
                    i13 = i56;
                }
                int i59 = cVar2.f6762d;
                float f13 = i55 - G;
                float f14 = aVar3.f6747d;
                float f15 = J - f14;
                float f16 = f13 - f14;
                float max2 = Math.max(0.0f, 0.0f);
                int i60 = cVar5.f6535d;
                int i61 = i59;
                int i62 = 0;
                while (i61 < i59 + i60) {
                    View Z02 = Z0(i61);
                    if (Z02 == null) {
                        i16 = i56;
                        i18 = i13;
                        i21 = i59;
                        i15 = i60;
                        cVar3 = cVar5;
                        aVar = aVar2;
                    } else {
                        int i63 = i59;
                        i15 = i60;
                        long j10 = aVar2.f6773d[i61];
                        int i64 = (int) j10;
                        int i65 = (int) (j10 >> 32);
                        if (i1(Z02, i64, i65, (b) Z02.getLayoutParams())) {
                            Z02.measure(i64, i65);
                        }
                        float O3 = f15 + RecyclerView.l.O(Z02) + ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        float y10 = f16 - (RecyclerView.l.y(Z02) + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                        int i66 = cVar2.f6767i;
                        g(Z02, rect2);
                        if (i66 == 1) {
                            c(Z02);
                        } else {
                            d(Z02, i62, false);
                            i62++;
                        }
                        int F2 = RecyclerView.l.F(Z02) + i56;
                        int M2 = i13 - RecyclerView.l.M(Z02);
                        boolean z13 = this.f6739u;
                        if (z13) {
                            if (this.f6740v) {
                                F2 = M2 - Z02.getMeasuredWidth();
                                round = Math.round(y10) - Z02.getMeasuredHeight();
                                measuredHeight = Math.round(y10);
                                i16 = i56;
                                measuredWidth = M2;
                            } else {
                                F2 = M2 - Z02.getMeasuredWidth();
                                int round3 = Math.round(O3);
                                i17 = i62;
                                i19 = Z02.getMeasuredHeight() + Math.round(O3);
                                i16 = i56;
                                measuredWidth = M2;
                                i18 = i13;
                                i20 = round3;
                                bVar2 = (c5.b) Z02.getLayoutParams();
                                i21 = i63;
                                int i67 = ((FlexboxLayoutManager) aVar2.f6771a).f6737s;
                                aVar = aVar2;
                                if (bVar2.r() == -1) {
                                    i22 = bVar2.r();
                                } else {
                                    i22 = i67;
                                }
                                int i68 = cVar5.c;
                                cVar3 = cVar5;
                                if (i22 != 0) {
                                    if (i22 != 1) {
                                        if (i22 != 2) {
                                            if (i22 != 3 && i22 != 4) {
                                                f16 = y10 - ((RecyclerView.l.O(Z02) + (Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin)) + max2);
                                                f15 = RecyclerView.l.y(Z02) + Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + max2 + O3;
                                                i62 = i17;
                                            }
                                        } else {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) Z02.getLayoutParams();
                                            int c10 = ((m.c(marginLayoutParams) + (i68 - Z02.getMeasuredWidth())) - m.b(marginLayoutParams)) / 2;
                                            if (!z13) {
                                                i23 = F2 + c10;
                                                i24 = measuredWidth + c10;
                                            } else {
                                                i23 = F2 - c10;
                                                i24 = measuredWidth - c10;
                                            }
                                        }
                                    } else if (!z13) {
                                        i23 = ((F2 + i68) - Z02.getMeasuredWidth()) - bVar2.w();
                                        measuredWidth = (measuredWidth + i68) - Z02.getMeasuredWidth();
                                        i24 = measuredWidth - bVar2.w();
                                    } else {
                                        i23 = bVar2.F() + Z02.getMeasuredWidth() + (F2 - i68);
                                        i24 = bVar2.F() + Z02.getMeasuredWidth() + (measuredWidth - i68);
                                    }
                                    Z02.layout(i23, i20, i24, i19);
                                    f16 = y10 - ((RecyclerView.l.O(Z02) + (Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin)) + max2);
                                    f15 = RecyclerView.l.y(Z02) + Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + max2 + O3;
                                    i62 = i17;
                                }
                                if (z13) {
                                    Z02.layout(bVar2.F() + F2, i20, bVar2.F() + measuredWidth, i19);
                                    f16 = y10 - ((RecyclerView.l.O(Z02) + (Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin)) + max2);
                                    f15 = RecyclerView.l.y(Z02) + Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + max2 + O3;
                                    i62 = i17;
                                } else {
                                    i23 = F2 - bVar2.w();
                                    i24 = measuredWidth - bVar2.w();
                                    Z02.layout(i23, i20, i24, i19);
                                    f16 = y10 - ((RecyclerView.l.O(Z02) + (Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin)) + max2);
                                    f15 = RecyclerView.l.y(Z02) + Z02.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + max2 + O3;
                                    i62 = i17;
                                }
                            }
                        } else {
                            i16 = i56;
                            if (this.f6740v) {
                                round = Math.round(y10) - Z02.getMeasuredHeight();
                                measuredWidth = Z02.getMeasuredWidth() + F2;
                                measuredHeight = Math.round(y10);
                            } else {
                                round = Math.round(O3);
                                measuredWidth = Z02.getMeasuredWidth() + F2;
                                measuredHeight = Z02.getMeasuredHeight() + Math.round(O3);
                            }
                        }
                        int i69 = round;
                        i18 = i13;
                        i20 = i69;
                        int i70 = measuredHeight;
                        i17 = i62;
                        i19 = i70;
                        bVar2 = (c5.b) Z02.getLayoutParams();
                        i21 = i63;
                        int i672 = ((FlexboxLayoutManager) aVar2.f6771a).f6737s;
                        aVar = aVar2;
                        if (bVar2.r() == -1) {
                        }
                        int i682 = cVar5.c;
                        cVar3 = cVar5;
                        if (i22 != 0) {
                        }
                        if (z13) {
                        }
                    }
                    i61++;
                    i56 = i16;
                    i60 = i15;
                    i13 = i18;
                    i59 = i21;
                    aVar2 = aVar;
                    cVar5 = cVar3;
                }
                c5.c cVar6 = cVar5;
                cVar2.c += this.A.f6767i;
                i14 = cVar5.c;
            }
            i37 = i12 + i14;
            if (!z11 && this.f6739u) {
                cVar2.f6763e -= cVar5.c * cVar2.f6767i;
            } else {
                cVar2.f6763e = (cVar5.c * cVar2.f6767i) + cVar2.f6763e;
            }
            i36 = i11 - cVar5.c;
            cVar4 = cVar2;
            i35 = i10;
            e12 = z11;
        }
        c cVar7 = cVar4;
        int i71 = i35;
        int i72 = i37;
        int i73 = cVar7.f6760a - i72;
        cVar7.f6760a = i73;
        int i74 = cVar7.f6764f;
        if (i74 != Integer.MIN_VALUE) {
            int i75 = i74 + i72;
            cVar7.f6764f = i75;
            if (i73 < 0) {
                cVar7.f6764f = i75 + i73;
            }
            f1(sVar, cVar7);
        }
        return i71 - cVar7.f6760a;
    }

    public final View O0(int i10) {
        View T0 = T0(0, A(), i10);
        if (T0 == null) {
            return null;
        }
        int i11 = this.f6742x.c[RecyclerView.l.K(T0)];
        if (i11 == -1) {
            return null;
        }
        return P0(T0, this.f6741w.get(i11));
    }

    public final View P0(View view, c5.c cVar) {
        boolean e12 = e1();
        int i10 = cVar.f6535d;
        for (int i11 = 1; i11 < i10; i11++) {
            View z10 = z(i11);
            if (z10 != null && z10.getVisibility() != 8) {
                if (!this.f6739u || e12) {
                    if (this.C.e(view) <= this.C.e(z10)) {
                    }
                    view = z10;
                } else if (this.C.b(view) < this.C.b(z10)) {
                    view = z10;
                }
            }
        }
        return view;
    }

    public final View Q0(int i10) {
        View T0 = T0(A() - 1, -1, i10);
        if (T0 == null) {
            return null;
        }
        return R0(T0, this.f6741w.get(this.f6742x.c[RecyclerView.l.K(T0)]));
    }

    public final View R0(View view, c5.c cVar) {
        boolean e12 = e1();
        int A = (A() - cVar.f6535d) - 1;
        for (int A2 = A() - 2; A2 > A; A2--) {
            View z10 = z(A2);
            if (z10 != null && z10.getVisibility() != 8) {
                if (!this.f6739u || e12) {
                    if (this.C.b(view) >= this.C.b(z10)) {
                    }
                    view = z10;
                } else if (this.C.e(view) > this.C.e(z10)) {
                    view = z10;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[LOOP:0: B:6:0x0006->B:23:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S0(int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View z12 = z(i10);
            int H = H();
            int J = J();
            int I = this.f5704o - I();
            int G = this.f5705p - G();
            int left = (z12.getLeft() - RecyclerView.l.F(z12)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) z12.getLayoutParams())).leftMargin;
            int top = (z12.getTop() - RecyclerView.l.O(z12)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) z12.getLayoutParams())).topMargin;
            int M = RecyclerView.l.M(z12) + z12.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) z12.getLayoutParams())).rightMargin;
            int y10 = RecyclerView.l.y(z12) + z12.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) z12.getLayoutParams())).bottomMargin;
            boolean z13 = false;
            if (left < I && M < H) {
                z10 = false;
                if (top < G && y10 < J) {
                    z11 = false;
                    if (z10 && z11) {
                        z13 = true;
                    }
                    if (!z13) {
                        return z12;
                    }
                    i10 += i12;
                }
                z11 = true;
                if (z10) {
                    z13 = true;
                }
                if (!z13) {
                }
            }
            z10 = true;
            if (top < G) {
                z11 = false;
                if (z10) {
                }
                if (!z13) {
                }
            }
            z11 = true;
            if (z10) {
            }
            if (!z13) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        r3 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T0(int i10, int i11, int i12) {
        int i13;
        M0();
        if (this.A == null) {
            this.A = new c();
        }
        int k3 = this.C.k();
        int g10 = this.C.g();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View z10 = z(i10);
            int K = RecyclerView.l.K(z10);
            if (K >= 0 && K < i12) {
                if (((RecyclerView.m) z10.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = z10;
                    }
                } else if (this.C.e(z10) >= k3 && this.C.b(z10) <= g10) {
                    return z10;
                }
            }
            i10 += i13;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final int U0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int i11;
        int g10;
        if (!e1() && this.f6739u) {
            int k3 = i10 - this.C.k();
            if (k3 <= 0) {
                return 0;
            }
            i11 = c1(k3, sVar, xVar);
        } else {
            int g11 = this.C.g() - i10;
            if (g11 <= 0) {
                return 0;
            }
            i11 = -c1(-g11, sVar, xVar);
        }
        int i12 = i10 + i11;
        if (!z10 || (g10 = this.C.g() - i12) <= 0) {
            return i11;
        }
        this.C.p(g10);
        return g10 + i11;
    }

    public final int V0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int i11;
        int k3;
        if (e1() || !this.f6739u) {
            int k10 = i10 - this.C.k();
            if (k10 <= 0) {
                return 0;
            }
            i11 = -c1(k10, sVar, xVar);
        } else {
            int g10 = this.C.g() - i10;
            if (g10 <= 0) {
                return 0;
            }
            i11 = c1(-g10, sVar, xVar);
        }
        int i12 = i10 + i11;
        if (!z10 || (k3 = i12 - this.C.k()) <= 0) {
            return i11;
        }
        this.C.p(-k3);
        return i11 - k3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView.Adapter adapter) {
        q0();
    }

    public final int W0(int i10, int i11) {
        return RecyclerView.l.B(i(), this.f5705p, this.n, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void X(RecyclerView recyclerView) {
        this.L = (View) recyclerView.getParent();
    }

    public final int X0(int i10, int i11) {
        return RecyclerView.l.B(h(), this.f5704o, this.f5703m, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void Y(RecyclerView recyclerView) {
    }

    public final int Y0(View view) {
        int F;
        int M;
        if (e1()) {
            F = RecyclerView.l.O(view);
            M = RecyclerView.l.y(view);
        } else {
            F = RecyclerView.l.F(view);
            M = RecyclerView.l.M(view);
        }
        return M + F;
    }

    public final View Z0(int i10) {
        View view = this.J.get(i10);
        return view != null ? view : this.f6743y.d(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        if (A() == 0) {
            return null;
        }
        int i11 = i10 < RecyclerView.l.K(z(0)) ? -1 : 1;
        return e1() ? new PointF(0.0f, i11) : new PointF(i11, 0.0f);
    }

    public final int a1() {
        return this.f6744z.b();
    }

    public final int b1() {
        if (this.f6741w.size() == 0) {
            return 0;
        }
        int size = this.f6741w.size();
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.f6741w.get(i11).f6533a);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r19 > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        c cVar;
        int b5;
        com.google.android.flexbox.a aVar;
        if (A() != 0 && i10 != 0) {
            M0();
            this.A.f6768j = true;
            if (!e1() && this.f6739u) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i10 < 0) {
                    i11 = 1;
                }
                i11 = -1;
            }
            int abs = Math.abs(i10);
            this.A.f6767i = i11;
            boolean e12 = e1();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5704o, this.f5703m);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f5705p, this.n);
            if (!e12 && this.f6739u) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.google.android.flexbox.a aVar2 = this.f6742x;
            if (i11 == 1) {
                View z12 = z(A() - 1);
                this.A.f6763e = this.C.b(z12);
                int K = RecyclerView.l.K(z12);
                View R0 = R0(z12, this.f6741w.get(aVar2.c[K]));
                c cVar2 = this.A;
                cVar2.f6766h = 1;
                int i14 = K + 1;
                cVar2.f6762d = i14;
                int[] iArr = aVar2.c;
                if (iArr.length <= i14) {
                    cVar2.c = -1;
                } else {
                    cVar2.c = iArr[i14];
                }
                if (z11) {
                    cVar2.f6763e = this.C.e(R0);
                    this.A.f6764f = this.C.k() + (-this.C.e(R0));
                    cVar = this.A;
                    b5 = cVar.f6764f;
                    if (b5 < 0) {
                        b5 = 0;
                    }
                } else {
                    cVar2.f6763e = this.C.b(R0);
                    cVar = this.A;
                    b5 = this.C.b(R0) - this.C.g();
                }
                cVar.f6764f = b5;
                int i15 = this.A.c;
                if ((i15 == -1 || i15 > this.f6741w.size() - 1) && this.A.f6762d <= a1()) {
                    c cVar3 = this.A;
                    int i16 = abs - cVar3.f6764f;
                    a.C0058a c0058a = this.N;
                    c0058a.f6775a = null;
                    if (i16 > 0) {
                        com.google.android.flexbox.a aVar3 = this.f6742x;
                        if (e12) {
                            aVar = aVar2;
                            aVar3.b(c0058a, makeMeasureSpec, makeMeasureSpec2, i16, cVar3.f6762d, -1, this.f6741w);
                        } else {
                            aVar = aVar2;
                            aVar3.b(c0058a, makeMeasureSpec2, makeMeasureSpec, i16, cVar3.f6762d, -1, this.f6741w);
                        }
                        aVar.e(makeMeasureSpec, makeMeasureSpec2, this.A.f6762d);
                        aVar.o(this.A.f6762d);
                    }
                }
            } else {
                View z13 = z(0);
                this.A.f6763e = this.C.e(z13);
                int K2 = RecyclerView.l.K(z13);
                View P0 = P0(z13, this.f6741w.get(aVar2.c[K2]));
                c cVar4 = this.A;
                cVar4.f6766h = 1;
                int i17 = aVar2.c[K2];
                if (i17 == -1) {
                    i17 = 0;
                }
                if (i17 > 0) {
                    this.A.f6762d = K2 - this.f6741w.get(i17 - 1).f6535d;
                } else {
                    cVar4.f6762d = -1;
                }
                c cVar5 = this.A;
                if (i17 > 0) {
                    i12 = i17 - 1;
                } else {
                    i12 = 0;
                }
                cVar5.c = i12;
                w wVar = this.C;
                if (z11) {
                    cVar5.f6763e = wVar.b(P0);
                    this.A.f6764f = this.C.b(P0) - this.C.g();
                    c cVar6 = this.A;
                    int i18 = cVar6.f6764f;
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    cVar6.f6764f = i18;
                } else {
                    cVar5.f6763e = wVar.e(P0);
                    this.A.f6764f = this.C.k() + (-this.C.e(P0));
                }
            }
            c cVar7 = this.A;
            int i19 = cVar7.f6764f;
            cVar7.f6760a = abs - i19;
            int N0 = N0(sVar, xVar, cVar7) + i19;
            if (N0 < 0) {
                return 0;
            }
            if (z10) {
                if (abs > N0) {
                    i13 = (-i11) * N0;
                }
                i13 = i10;
            } else {
                if (abs > N0) {
                    i13 = i11 * N0;
                }
                i13 = i10;
            }
            this.C.p(-i13);
            this.A.f6765g = i13;
            return i13;
        }
        return 0;
    }

    public final int d1(int i10) {
        int height;
        int i11;
        int i12;
        boolean z10 = false;
        if (A() != 0 && i10 != 0) {
            M0();
            boolean e12 = e1();
            View view = this.L;
            if (e12) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (e12) {
                i11 = this.f5704o;
            } else {
                i11 = this.f5705p;
            }
            if (E() == 1) {
                z10 = true;
            }
            a aVar = this.B;
            if (z10) {
                int abs = Math.abs(i10);
                if (i10 < 0) {
                    return -Math.min((i11 + aVar.f6747d) - height, abs);
                }
                i12 = aVar.f6747d;
                if (i12 + i10 <= 0) {
                    return i10;
                }
            } else if (i10 > 0) {
                return Math.min((i11 - aVar.f6747d) - height, i10);
            } else {
                i12 = aVar.f6747d;
                if (i12 + i10 >= 0) {
                    return i10;
                }
            }
            return -i12;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e0(int i10, int i11) {
        j1(i10);
    }

    public final boolean e1() {
        int i10 = this.f6735q;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r11.C.e(r7) >= (r11.C.f() - r8)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
        if (r11.C.b(r7) <= r8) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(RecyclerView.s sVar, c cVar) {
        int A;
        boolean z10;
        boolean z11;
        if (!cVar.f6768j) {
            return;
        }
        int i10 = cVar.f6767i;
        int i11 = -1;
        com.google.android.flexbox.a aVar = this.f6742x;
        if (i10 == -1) {
            if (cVar.f6764f >= 0) {
                this.C.f();
                int A2 = A();
                if (A2 != 0) {
                    int i12 = A2 - 1;
                    int i13 = aVar.c[RecyclerView.l.K(z(i12))];
                    if (i13 != -1) {
                        c5.c cVar2 = this.f6741w.get(i13);
                        int i14 = i12;
                        while (true) {
                            if (i14 < 0) {
                                break;
                            }
                            View z12 = z(i14);
                            int i15 = cVar.f6764f;
                            if (!e1() && this.f6739u) {
                                if (this.C.b(z12) <= i15) {
                                    z11 = true;
                                }
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            if (cVar2.f6542k == RecyclerView.l.K(z12)) {
                                if (i13 <= 0) {
                                    A2 = i14;
                                    break;
                                }
                                i13 += cVar.f6767i;
                                cVar2 = this.f6741w.get(i13);
                                A2 = i14;
                            }
                            i14--;
                        }
                        while (i12 >= A2) {
                            View z13 = z(i12);
                            if (z(i12) != null) {
                                this.f5692a.l(i12);
                            }
                            sVar.i(z13);
                            i12--;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (cVar.f6764f >= 0 && (A = A()) != 0) {
            int i16 = aVar.c[RecyclerView.l.K(z(0))];
            if (i16 != -1) {
                c5.c cVar3 = this.f6741w.get(i16);
                int i17 = 0;
                while (true) {
                    if (i17 >= A) {
                        break;
                    }
                    View z14 = z(i17);
                    int i18 = cVar.f6764f;
                    if (!e1() && this.f6739u) {
                        if (this.C.f() - this.C.e(z14) <= i18) {
                            z10 = true;
                        }
                        z10 = false;
                    }
                    if (!z10) {
                        break;
                    }
                    if (cVar3.f6543l == RecyclerView.l.K(z14)) {
                        if (i16 >= this.f6741w.size() - 1) {
                            i11 = i17;
                            break;
                        }
                        i16 += cVar.f6767i;
                        cVar3 = this.f6741w.get(i16);
                        i11 = i17;
                    }
                    i17++;
                }
                while (i11 >= 0) {
                    View z15 = z(i11);
                    if (z(i11) != null) {
                        this.f5692a.l(i11);
                    }
                    sVar.i(z15);
                    i11--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g0(int i10, int i11) {
        j1(Math.min(i10, i11));
    }

    public final void g1(int i10) {
        if (this.f6735q != i10) {
            q0();
            this.f6735q = i10;
            this.C = null;
            this.D = null;
            this.f6741w.clear();
            a aVar = this.B;
            a.b(aVar);
            aVar.f6747d = 0;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean h() {
        int i10;
        if (this.f6736r == 0) {
            return e1();
        }
        if (e1()) {
            int i11 = this.f5704o;
            View view = this.L;
            if (view != null) {
                i10 = view.getWidth();
            } else {
                i10 = 0;
            }
            if (i11 <= i10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h0(int i10, int i11) {
        j1(i10);
    }

    public final void h1() {
        int i10 = this.f6736r;
        if (i10 != 1) {
            if (i10 == 0) {
                q0();
                this.f6741w.clear();
                a aVar = this.B;
                a.b(aVar);
                aVar.f6747d = 0;
            }
            this.f6736r = 1;
            this.C = null;
            this.D = null;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean i() {
        int i10;
        if (this.f6736r == 0) {
            return !e1();
        }
        if (e1()) {
            return true;
        }
        int i11 = this.f5705p;
        View view = this.L;
        if (view != null) {
            i10 = view.getHeight();
        } else {
            i10 = 0;
        }
        if (i11 > i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i0(int i10) {
        j1(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean j(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j0(RecyclerView recyclerView, int i10, int i11) {
        j1(i10);
        j1(i10);
    }

    public final void j1(int i10) {
        int i11 = -1;
        View S0 = S0(A() - 1, -1);
        if (S0 != null) {
            i11 = RecyclerView.l.K(S0);
        }
        if (i10 >= i11) {
            return;
        }
        int A = A();
        com.google.android.flexbox.a aVar = this.f6742x;
        aVar.g(A);
        aVar.h(A);
        aVar.f(A);
        if (i10 >= aVar.c.length) {
            return;
        }
        this.M = i10;
        View z10 = z(0);
        if (z10 == null) {
            return;
        }
        this.F = RecyclerView.l.K(z10);
        if (!e1() && this.f6739u) {
            this.G = this.C.h() + this.C.b(z10);
            return;
        }
        this.G = this.C.e(z10) - this.C.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r25.f6736r == 2) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z10;
        com.google.android.flexbox.a aVar;
        d dVar;
        a aVar2;
        boolean z11;
        View O0;
        w wVar;
        int e10;
        int b5;
        int K;
        int i10;
        int size;
        int i11;
        boolean z12;
        int i12;
        d dVar2;
        int k3;
        boolean z13;
        int e11;
        boolean z14;
        boolean e12;
        boolean z15;
        c cVar;
        int i13;
        int i14;
        a.C0058a c0058a;
        int i15;
        a.C0058a c0058a2;
        int i16;
        a aVar3;
        int i17;
        int i18;
        List<c5.c> list;
        int i19;
        boolean z16;
        int i20;
        int i21;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        this.f6743y = sVar;
        this.f6744z = xVar;
        int b10 = xVar.b();
        if (b10 == 0 && xVar.f5747g) {
            return;
        }
        int E = E();
        int i22 = this.f6735q;
        if (i22 != 0) {
            if (i22 != 1) {
                if (i22 != 2) {
                    if (i22 != 3) {
                        this.f6739u = false;
                    } else {
                        if (E == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        this.f6739u = z21;
                        if (this.f6736r == 2) {
                            this.f6739u = !z21;
                        }
                        this.f6740v = true;
                        M0();
                        if (this.A == null) {
                            this.A = new c();
                        }
                        aVar = this.f6742x;
                        aVar.g(b10);
                        aVar.h(b10);
                        aVar.f(b10);
                        this.A.f6768j = false;
                        dVar = this.E;
                        if (dVar != null) {
                            int i23 = dVar.f6769i;
                            if (i23 >= 0 && i23 < b10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                this.F = i23;
                            }
                        }
                        aVar2 = this.B;
                        if (aVar2.f6749f || this.F != -1 || dVar != null) {
                            a.b(aVar2);
                            d dVar3 = this.E;
                            if (!xVar.f5747g && (i12 = this.F) != -1) {
                                if (i12 >= 0 && i12 < xVar.b()) {
                                    int i24 = this.F;
                                    aVar2.f6745a = i24;
                                    aVar2.f6746b = aVar.c[i24];
                                    dVar2 = this.E;
                                    if (dVar2 != null) {
                                        int b11 = xVar.b();
                                        int i25 = dVar2.f6769i;
                                        if (i25 >= 0 && i25 < b11) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            aVar2.c = this.C.k() + dVar3.f6770j;
                                            aVar2.f6750g = true;
                                            aVar2.f6746b = -1;
                                            z11 = true;
                                            if (!z11) {
                                                if (A() != 0) {
                                                    if (aVar2.f6748e) {
                                                        O0 = Q0(xVar.b());
                                                    } else {
                                                        O0 = O0(xVar.b());
                                                    }
                                                    if (O0 != null) {
                                                        FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                                                        if (flexboxLayoutManager.f6736r == 0) {
                                                            wVar = flexboxLayoutManager.D;
                                                        } else {
                                                            wVar = flexboxLayoutManager.C;
                                                        }
                                                        if (!flexboxLayoutManager.e1() && flexboxLayoutManager.f6739u) {
                                                            if (aVar2.f6748e) {
                                                                b5 = wVar.e(O0);
                                                                e10 = wVar.m() + b5;
                                                                aVar2.c = e10;
                                                                K = RecyclerView.l.K(O0);
                                                                aVar2.f6745a = K;
                                                                aVar2.f6750g = false;
                                                                int[] iArr = flexboxLayoutManager.f6742x.c;
                                                                if (K != -1) {
                                                                }
                                                                i10 = iArr[K];
                                                                if (i10 != -1) {
                                                                }
                                                                aVar2.f6746b = i10;
                                                                size = flexboxLayoutManager.f6741w.size();
                                                                i11 = aVar2.f6746b;
                                                                if (size > i11) {
                                                                }
                                                                z12 = true;
                                                            } else {
                                                                e10 = wVar.b(O0);
                                                                aVar2.c = e10;
                                                                K = RecyclerView.l.K(O0);
                                                                aVar2.f6745a = K;
                                                                aVar2.f6750g = false;
                                                                int[] iArr2 = flexboxLayoutManager.f6742x.c;
                                                                if (K != -1) {
                                                                }
                                                                i10 = iArr2[K];
                                                                if (i10 != -1) {
                                                                }
                                                                aVar2.f6746b = i10;
                                                                size = flexboxLayoutManager.f6741w.size();
                                                                i11 = aVar2.f6746b;
                                                                if (size > i11) {
                                                                }
                                                                z12 = true;
                                                            }
                                                        } else if (aVar2.f6748e) {
                                                            b5 = wVar.b(O0);
                                                            e10 = wVar.m() + b5;
                                                            aVar2.c = e10;
                                                            K = RecyclerView.l.K(O0);
                                                            aVar2.f6745a = K;
                                                            aVar2.f6750g = false;
                                                            int[] iArr22 = flexboxLayoutManager.f6742x.c;
                                                            if (K != -1) {
                                                                K = 0;
                                                            }
                                                            i10 = iArr22[K];
                                                            if (i10 != -1) {
                                                                i10 = 0;
                                                            }
                                                            aVar2.f6746b = i10;
                                                            size = flexboxLayoutManager.f6741w.size();
                                                            i11 = aVar2.f6746b;
                                                            if (size > i11) {
                                                                aVar2.f6745a = flexboxLayoutManager.f6741w.get(i11).f6542k;
                                                            }
                                                            z12 = true;
                                                        } else {
                                                            e10 = wVar.e(O0);
                                                            aVar2.c = e10;
                                                            K = RecyclerView.l.K(O0);
                                                            aVar2.f6745a = K;
                                                            aVar2.f6750g = false;
                                                            int[] iArr222 = flexboxLayoutManager.f6742x.c;
                                                            if (K != -1) {
                                                            }
                                                            i10 = iArr222[K];
                                                            if (i10 != -1) {
                                                            }
                                                            aVar2.f6746b = i10;
                                                            size = flexboxLayoutManager.f6741w.size();
                                                            i11 = aVar2.f6746b;
                                                            if (size > i11) {
                                                            }
                                                            z12 = true;
                                                        }
                                                        if (z12) {
                                                            a.a(aVar2);
                                                            aVar2.f6745a = 0;
                                                            aVar2.f6746b = 0;
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                            }
                                            aVar2.f6749f = true;
                                        }
                                    }
                                    if (this.G != Integer.MIN_VALUE) {
                                        View u10 = u(this.F);
                                        if (u10 != null) {
                                            if (this.C.c(u10) <= this.C.l()) {
                                                if (this.C.e(u10) - this.C.k() < 0) {
                                                    aVar2.c = this.C.k();
                                                    aVar2.f6748e = false;
                                                } else if (this.C.g() - this.C.b(u10) < 0) {
                                                    aVar2.c = this.C.g();
                                                    aVar2.f6748e = true;
                                                } else {
                                                    if (aVar2.f6748e) {
                                                        e11 = this.C.m() + this.C.b(u10);
                                                    } else {
                                                        e11 = this.C.e(u10);
                                                    }
                                                    aVar2.c = e11;
                                                }
                                            }
                                        } else if (A() > 0) {
                                            if (this.F < RecyclerView.l.K(z(0))) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            aVar2.f6748e = z13;
                                        }
                                        a.a(aVar2);
                                    } else {
                                        if (!e1() && this.f6739u) {
                                            k3 = this.G - this.C.h();
                                        } else {
                                            k3 = this.C.k() + this.G;
                                        }
                                        aVar2.c = k3;
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    aVar2.f6749f = true;
                                }
                                this.F = -1;
                                this.G = Integer.MIN_VALUE;
                            }
                            z11 = false;
                            if (!z11) {
                            }
                            aVar2.f6749f = true;
                        }
                        t(sVar);
                        if (aVar2.f6748e) {
                            l1(aVar2, false, true);
                        } else {
                            k1(aVar2, false, true);
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5704o, this.f5703m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f5705p, this.n);
                        int i26 = this.f5704o;
                        int i27 = this.f5705p;
                        e12 = e1();
                        Context context = this.K;
                        if (e12) {
                            int i28 = this.H;
                            if (i28 != Integer.MIN_VALUE && i28 != i26) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            cVar = this.A;
                            if (cVar.f6761b) {
                                i13 = context.getResources().getDisplayMetrics().heightPixels;
                            }
                            i13 = cVar.f6760a;
                        } else {
                            int i29 = this.I;
                            if (i29 != Integer.MIN_VALUE && i29 != i27) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            cVar = this.A;
                            if (cVar.f6761b) {
                                i13 = context.getResources().getDisplayMetrics().widthPixels;
                            }
                            i13 = cVar.f6760a;
                        }
                        int i30 = i13;
                        this.H = i26;
                        this.I = i27;
                        i14 = this.M;
                        c0058a = this.N;
                        if (i14 != -1 && (this.F != -1 || z15)) {
                            if (!aVar2.f6748e) {
                                this.f6741w.clear();
                                c0058a.f6775a = null;
                                boolean e13 = e1();
                                com.google.android.flexbox.a aVar4 = this.f6742x;
                                a.C0058a c0058a3 = this.N;
                                if (e13) {
                                    aVar4.b(c0058a3, makeMeasureSpec, makeMeasureSpec2, i30, 0, aVar2.f6745a, this.f6741w);
                                } else {
                                    aVar4.b(c0058a3, makeMeasureSpec2, makeMeasureSpec, i30, 0, aVar2.f6745a, this.f6741w);
                                }
                                this.f6741w = c0058a.f6775a;
                                aVar.e(makeMeasureSpec, makeMeasureSpec2, 0);
                                aVar.o(0);
                                int i31 = aVar.c[aVar2.f6745a];
                                aVar2.f6746b = i31;
                                this.A.c = i31;
                            }
                            aVar3 = aVar2;
                        } else {
                            if (i14 != -1) {
                                i15 = Math.min(i14, aVar2.f6745a);
                            } else {
                                i15 = aVar2.f6745a;
                            }
                            c0058a.f6775a = null;
                            if (e1()) {
                                if (this.f6741w.size() > 0) {
                                    aVar.d(i15, this.f6741w);
                                    i17 = aVar2.f6745a;
                                    i19 = makeMeasureSpec;
                                    list = this.f6741w;
                                    i18 = makeMeasureSpec2;
                                    c0058a2 = c0058a;
                                    i16 = makeMeasureSpec2;
                                    aVar.b(c0058a, i19, i18, i30, i15, i17, list);
                                    aVar3 = aVar2;
                                    this.f6741w = c0058a2.f6775a;
                                    aVar.e(makeMeasureSpec, i16, i15);
                                    aVar.o(i15);
                                } else {
                                    aVar.f(b10);
                                    this.f6742x.b(this.N, makeMeasureSpec, makeMeasureSpec2, i30, 0, -1, this.f6741w);
                                    c0058a2 = c0058a;
                                    i16 = makeMeasureSpec2;
                                    aVar3 = aVar2;
                                    this.f6741w = c0058a2.f6775a;
                                    aVar.e(makeMeasureSpec, i16, i15);
                                    aVar.o(i15);
                                }
                            } else if (this.f6741w.size() > 0) {
                                aVar.d(i15, this.f6741w);
                                i17 = aVar2.f6745a;
                                i18 = makeMeasureSpec;
                                list = this.f6741w;
                                i19 = makeMeasureSpec2;
                                c0058a2 = c0058a;
                                i16 = makeMeasureSpec2;
                                aVar.b(c0058a, i19, i18, i30, i15, i17, list);
                                aVar3 = aVar2;
                                this.f6741w = c0058a2.f6775a;
                                aVar.e(makeMeasureSpec, i16, i15);
                                aVar.o(i15);
                            } else {
                                c0058a2 = c0058a;
                                i16 = makeMeasureSpec2;
                                aVar3 = aVar2;
                                aVar.f(b10);
                                this.f6742x.b(this.N, i16, makeMeasureSpec, i30, 0, -1, this.f6741w);
                                this.f6741w = c0058a2.f6775a;
                                aVar.e(makeMeasureSpec, i16, i15);
                                aVar.o(i15);
                            }
                        }
                        if (aVar3.f6748e) {
                            N0(sVar, xVar, this.A);
                            i21 = this.A.f6763e;
                            z16 = true;
                            k1(aVar3, true, false);
                            N0(sVar, xVar, this.A);
                            i20 = this.A.f6763e;
                        } else {
                            z16 = true;
                            N0(sVar, xVar, this.A);
                            i20 = this.A.f6763e;
                            l1(aVar3, true, false);
                            N0(sVar, xVar, this.A);
                            i21 = this.A.f6763e;
                        }
                        if (A() > 0) {
                            if (aVar3.f6748e) {
                                V0(U0(i20, sVar, xVar, z16) + i21, sVar, xVar, false);
                                return;
                            } else {
                                U0(V0(i21, sVar, xVar, z16) + i20, sVar, xVar, false);
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    if (E == 1) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    this.f6739u = z20;
                    if (this.f6736r == 2) {
                        this.f6739u = !z20;
                    }
                }
            } else {
                if (E != 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                this.f6739u = z19;
                z18 = this.f6736r == 2 ? true : true;
            }
            z18 = false;
        } else {
            if (E == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6739u = z10;
        }
        this.f6740v = z18;
        M0();
        if (this.A == null) {
        }
        aVar = this.f6742x;
        aVar.g(b10);
        aVar.h(b10);
        aVar.f(b10);
        this.A.f6768j = false;
        dVar = this.E;
        if (dVar != null) {
        }
        aVar2 = this.B;
        if (aVar2.f6749f) {
        }
        a.b(aVar2);
        d dVar32 = this.E;
        if (!xVar.f5747g) {
            if (i12 >= 0) {
                int i242 = this.F;
                aVar2.f6745a = i242;
                aVar2.f6746b = aVar.c[i242];
                dVar2 = this.E;
                if (dVar2 != null) {
                }
                if (this.G != Integer.MIN_VALUE) {
                }
                z11 = true;
                if (!z11) {
                }
                aVar2.f6749f = true;
                t(sVar);
                if (aVar2.f6748e) {
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.f5704o, this.f5703m);
                int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(this.f5705p, this.n);
                int i262 = this.f5704o;
                int i272 = this.f5705p;
                e12 = e1();
                Context context2 = this.K;
                if (e12) {
                }
                int i302 = i13;
                this.H = i262;
                this.I = i272;
                i14 = this.M;
                c0058a = this.N;
                if (i14 != -1) {
                }
                if (i14 != -1) {
                }
                c0058a.f6775a = null;
                if (e1()) {
                }
                if (aVar3.f6748e) {
                }
                if (A() > 0) {
                }
            }
            this.F = -1;
            this.G = Integer.MIN_VALUE;
        }
        z11 = false;
        if (!z11) {
        }
        aVar2.f6749f = true;
        t(sVar);
        if (aVar2.f6748e) {
        }
        int makeMeasureSpec32 = View.MeasureSpec.makeMeasureSpec(this.f5704o, this.f5703m);
        int makeMeasureSpec222 = View.MeasureSpec.makeMeasureSpec(this.f5705p, this.n);
        int i2622 = this.f5704o;
        int i2722 = this.f5705p;
        e12 = e1();
        Context context22 = this.K;
        if (e12) {
        }
        int i3022 = i13;
        this.H = i2622;
        this.I = i2722;
        i14 = this.M;
        c0058a = this.N;
        if (i14 != -1) {
        }
        if (i14 != -1) {
        }
        c0058a.f6775a = null;
        if (e1()) {
        }
        if (aVar3.f6748e) {
        }
        if (A() > 0) {
        }
    }

    public final void k1(a aVar, boolean z10, boolean z11) {
        c cVar;
        int g10;
        int i10;
        int i11;
        int i12;
        boolean z12 = false;
        if (z11) {
            if (e1()) {
                i12 = this.n;
            } else {
                i12 = this.f5703m;
            }
            this.A.f6761b = (i12 == 0 || i12 == Integer.MIN_VALUE) ? true : true;
        } else {
            this.A.f6761b = false;
        }
        if (!e1() && this.f6739u) {
            cVar = this.A;
            g10 = aVar.c;
            i10 = I();
        } else {
            cVar = this.A;
            g10 = this.C.g();
            i10 = aVar.c;
        }
        cVar.f6760a = g10 - i10;
        c cVar2 = this.A;
        cVar2.f6762d = aVar.f6745a;
        cVar2.f6766h = 1;
        cVar2.f6767i = 1;
        cVar2.f6763e = aVar.c;
        cVar2.f6764f = Integer.MIN_VALUE;
        cVar2.c = aVar.f6746b;
        if (z10 && this.f6741w.size() > 1 && (i11 = aVar.f6746b) >= 0 && i11 < this.f6741w.size() - 1) {
            c cVar3 = this.A;
            cVar3.c++;
            cVar3.f6762d += this.f6741w.get(aVar.f6746b).f6535d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l0(RecyclerView.x xVar) {
        this.E = null;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.M = -1;
        a.b(this.B);
        this.J.clear();
    }

    public final void l1(a aVar, boolean z10, boolean z11) {
        c cVar;
        int i10;
        c cVar2;
        int i11;
        boolean z12 = false;
        if (z11) {
            if (e1()) {
                i11 = this.n;
            } else {
                i11 = this.f5703m;
            }
            this.A.f6761b = (i11 == 0 || i11 == Integer.MIN_VALUE) ? true : true;
        } else {
            this.A.f6761b = false;
        }
        if (!e1() && this.f6739u) {
            cVar = this.A;
            i10 = this.L.getWidth() - aVar.c;
        } else {
            cVar = this.A;
            i10 = aVar.c;
        }
        cVar.f6760a = i10 - this.C.k();
        c cVar3 = this.A;
        cVar3.f6762d = aVar.f6745a;
        cVar3.f6766h = 1;
        cVar3.f6767i = -1;
        cVar3.f6763e = aVar.c;
        cVar3.f6764f = Integer.MIN_VALUE;
        int i12 = aVar.f6746b;
        cVar3.c = i12;
        if (z10 && i12 > 0) {
            int size = this.f6741w.size();
            int i13 = aVar.f6746b;
            if (size > i13) {
                cVar2.c--;
                this.A.f6762d -= this.f6741w.get(i13).f6535d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.E = (d) parcelable;
            u0();
        }
    }

    public final void m1(View view, int i10) {
        this.J.put(i10, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable n0() {
        d dVar = this.E;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (A() > 0) {
            View z10 = z(0);
            dVar2.f6769i = RecyclerView.l.K(z10);
            dVar2.f6770j = this.C.e(z10) - this.C.k();
        } else {
            dVar2.f6769i = -1;
        }
        return dVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int r(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int s(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m v() {
        return new b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (e1() && (this.f6736r != 0 || !e1())) {
            int d12 = d1(i10);
            this.B.f6747d += d12;
            this.D.p(-d12);
            return d12;
        }
        int c12 = c1(i10, sVar, xVar);
        this.J.clear();
        return c12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.m w(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void w0(int i10) {
        this.F = i10;
        this.G = Integer.MIN_VALUE;
        d dVar = this.E;
        if (dVar != null) {
            dVar.f6769i = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int x0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (!e1() && (this.f6736r != 0 || e1())) {
            int d12 = d1(i10);
            this.B.f6747d += d12;
            this.D.p(-d12);
            return d12;
        }
        int c12 = c1(i10, sVar, xVar);
        this.J.clear();
        return c12;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        int i12;
        a aVar = new a();
        this.B = aVar;
        this.F = -1;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new SparseArray<>();
        this.M = -1;
        this.N = new a.C0058a();
        RecyclerView.l.d L = RecyclerView.l.L(context, attributeSet, i10, i11);
        int i13 = L.f5708a;
        if (i13 != 0) {
            if (i13 == 1) {
                i12 = L.c ? 3 : 2;
                g1(i12);
            }
        } else if (L.c) {
            g1(1);
        } else {
            i12 = 0;
            g1(i12);
        }
        h1();
        if (this.f6737s != 4) {
            q0();
            this.f6741w.clear();
            a.b(aVar);
            aVar.f6747d = 0;
            this.f6737s = 4;
            u0();
        }
        this.f5698h = true;
        this.K = context;
    }
}
