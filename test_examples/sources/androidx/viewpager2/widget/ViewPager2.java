package androidx.viewpager2.widget;

import a3.j0;
import a3.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import androidx.viewpager2.widget.c;
import b3.g;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public int A;
    public f B;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f6119i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f6120j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.viewpager2.widget.a f6121k;

    /* renamed from: l  reason: collision with root package name */
    public int f6122l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6123m;
    public final a n;

    /* renamed from: o  reason: collision with root package name */
    public d f6124o;

    /* renamed from: p  reason: collision with root package name */
    public int f6125p;

    /* renamed from: q  reason: collision with root package name */
    public Parcelable f6126q;

    /* renamed from: r  reason: collision with root package name */
    public i f6127r;

    /* renamed from: s  reason: collision with root package name */
    public h f6128s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.viewpager2.widget.c f6129t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.viewpager2.widget.a f6130u;

    /* renamed from: v  reason: collision with root package name */
    public m4.c f6131v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.viewpager2.widget.b f6132w;

    /* renamed from: x  reason: collision with root package name */
    public RecyclerView.i f6133x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6134y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6135z;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f6123m = true;
            viewPager2.f6129t.f6159l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.f {
        @Override // androidx.recyclerview.widget.RecyclerView.f
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void J0(RecyclerView.x xVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.J0(xVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void b0(RecyclerView.s sVar, RecyclerView.x xVar, b3.g gVar) {
            super.b0(sVar, xVar, gVar);
            ViewPager2.this.B.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final boolean p0(RecyclerView.s sVar, RecyclerView.x xVar, int i10, Bundle bundle) {
            ViewPager2.this.B.getClass();
            return super.p0(sVar, xVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i10) {
        }

        public void b(float f10, int i10, int i11) {
        }

        public void c(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f6137a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f6138b = new b();
        public androidx.viewpager2.widget.f c;

        /* loaded from: classes.dex */
        public class a implements b3.k {
            public a() {
            }

            @Override // b3.k
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f6135z) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements b3.k {
            public b() {
            }

            @Override // b3.k
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f6135z) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.s(recyclerView, 2);
            this.c = new androidx.viewpager2.widget.f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (j0.d.c(viewPager2) == 0) {
                j0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int d5;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            j0.m(viewPager2, 16908360);
            boolean z10 = false;
            j0.i(viewPager2, 0);
            j0.m(viewPager2, 16908361);
            j0.i(viewPager2, 0);
            j0.m(viewPager2, 16908358);
            j0.i(viewPager2, 0);
            j0.m(viewPager2, 16908359);
            j0.i(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (d5 = viewPager2.getAdapter().d()) == 0 || !viewPager2.f6135z) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f6138b;
            a aVar = this.f6137a;
            if (orientation == 0) {
                if (viewPager2.f6124o.E() == 1) {
                    z10 = true;
                }
                if (z10) {
                    i10 = 16908360;
                } else {
                    i10 = 16908361;
                }
                if (z10) {
                    i11 = 16908361;
                }
                if (viewPager2.f6122l < d5 - 1) {
                    j0.n(viewPager2, new g.a(i10, (String) null), aVar);
                }
                if (viewPager2.f6122l > 0) {
                    j0.n(viewPager2, new g.a(i11, (String) null), bVar);
                    return;
                }
                return;
            }
            if (viewPager2.f6122l < d5 - 1) {
                j0.n(viewPager2, new g.a(16908359, (String) null), aVar);
            }
            if (viewPager2.f6122l > 0) {
                j0.n(viewPager2, new g.a(16908358, (String) null), bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends y {
        public h() {
        }

        @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.e0
        public final View c(RecyclerView.l lVar) {
            if (((androidx.viewpager2.widget.c) ViewPager2.this.f6131v.f15980b).f6160m) {
                return null;
            }
            return super.c(lVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.B.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f6122l);
            accessibilityEvent.setToIndex(viewPager2.f6122l);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f6135z && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f6135z && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public int f6143i;

        /* renamed from: j  reason: collision with root package name */
        public int f6144j;

        /* renamed from: k  reason: collision with root package name */
        public Parcelable f6145k;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, null) : new j(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new j[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, classLoader) : new j(parcel);
            }
        }

        public j(Parcel parcel) {
            super(parcel);
            this.f6143i = parcel.readInt();
            this.f6144j = parcel.readInt();
            this.f6145k = parcel.readParcelable(null);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6143i);
            parcel.writeInt(this.f6144j);
            parcel.writeParcelable(this.f6145k, i10);
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6143i = parcel.readInt();
            this.f6144j = parcel.readInt();
            this.f6145k = parcel.readParcelable(classLoader);
        }
    }

    /* loaded from: classes.dex */
    public static class k implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final int f6146i;

        /* renamed from: j  reason: collision with root package name */
        public final RecyclerView f6147j;

        public k(int i10, i iVar) {
            this.f6146i = i10;
            this.f6147j = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6147j.j0(this.f6146i);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6119i = new Rect();
        this.f6120j = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.f6121k = aVar;
        this.f6123m = false;
        this.n = new a();
        this.f6125p = -1;
        this.f6133x = null;
        this.f6134y = false;
        this.f6135z = true;
        this.A = -1;
        this.B = new f();
        i iVar = new i(context);
        this.f6127r = iVar;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        iVar.setId(j0.e.a());
        this.f6127r.setDescendantFocusability(131072);
        d dVar = new d();
        this.f6124o = dVar;
        this.f6127r.setLayoutManager(dVar);
        this.f6127r.setScrollingTouchSlop(1);
        int[] iArr = a1.b.Y0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f6127r.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.f6127r;
            m4.d dVar2 = new m4.d();
            if (iVar2.L == null) {
                iVar2.L = new ArrayList();
            }
            iVar2.L.add(dVar2);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f6129t = cVar;
            this.f6131v = new m4.c(this, cVar, this.f6127r);
            h hVar = new h();
            this.f6128s = hVar;
            hVar.a(this.f6127r);
            this.f6127r.h(this.f6129t);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.f6130u = aVar2;
            this.f6129t.f6149a = aVar2;
            androidx.viewpager2.widget.d dVar3 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.f6130u.f6148a.add(dVar3);
            this.f6130u.f6148a.add(eVar);
            this.B.a(this.f6127r);
            this.f6130u.f6148a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.f6124o);
            this.f6132w = bVar;
            this.f6130u.f6148a.add(bVar);
            i iVar3 = this.f6127r;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.Adapter adapter;
        if (this.f6125p == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f6126q;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.f6126q = null;
        }
        int max = Math.max(0, Math.min(this.f6125p, adapter.d() - 1));
        this.f6122l = max;
        this.f6125p = -1;
        this.f6127r.f0(max);
        this.B.b();
    }

    public final void b(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        RecyclerView.Adapter adapter = getAdapter();
        boolean z12 = false;
        if (adapter == null) {
            if (this.f6125p != -1) {
                this.f6125p = Math.max(i10, 0);
            }
        } else if (adapter.d() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.d() - 1);
            int i12 = this.f6122l;
            if (min == i12) {
                if (this.f6129t.f6153f == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
            }
            if (min == i12) {
                return;
            }
            double d5 = i12;
            this.f6122l = min;
            this.B.b();
            androidx.viewpager2.widget.c cVar = this.f6129t;
            if (cVar.f6153f == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                cVar.f();
                c.a aVar = cVar.f6154g;
                d5 = aVar.f6161a + aVar.f6162b;
            }
            androidx.viewpager2.widget.c cVar2 = this.f6129t;
            cVar2.getClass();
            cVar2.f6152e = 2;
            cVar2.f6160m = false;
            if (cVar2.f6156i != min) {
                z12 = true;
            }
            cVar2.f6156i = min;
            cVar2.d(2);
            if (z12) {
                cVar2.c(min);
            }
            double d10 = min;
            if (Math.abs(d10 - d5) > 3.0d) {
                i iVar = this.f6127r;
                if (d10 > d5) {
                    i11 = min - 3;
                } else {
                    i11 = min + 3;
                }
                iVar.f0(i11);
                i iVar2 = this.f6127r;
                iVar2.post(new k(min, iVar2));
                return;
            }
            this.f6127r.j0(min);
        }
    }

    public final void c() {
        h hVar = this.f6128s;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View c10 = hVar.c(this.f6124o);
        if (c10 == null) {
            return;
        }
        this.f6124o.getClass();
        int K = RecyclerView.l.K(c10);
        if (K != this.f6122l && getScrollState() == 0) {
            this.f6130u.c(K);
        }
        this.f6123m = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f6127r.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f6127r.canScrollVertically(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i10 = ((j) parcelable).f6143i;
            sparseArray.put(this.f6127r.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.B.getClass();
        this.B.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f6127r.getAdapter();
    }

    public int getCurrentItem() {
        return this.f6122l;
    }

    public int getItemDecorationCount() {
        return this.f6127r.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public int getOrientation() {
        return this.f6124o.f5580q;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f6127r;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f6129t.f6153f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        RecyclerView.Adapter adapter;
        int d5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            int orientation = viewPager2.getOrientation();
            i10 = viewPager2.getAdapter().d();
            if (orientation != 1) {
                i11 = i10;
                i10 = 0;
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(i10, i11, 0).f6374a);
                adapter = viewPager2.getAdapter();
                if (adapter != null && (d5 = adapter.d()) != 0 && viewPager2.f6135z) {
                    if (viewPager2.f6122l > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (viewPager2.f6122l < d5 - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
                return;
            }
        } else {
            i10 = 0;
        }
        i11 = 0;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(i10, i11, 0).f6374a);
        adapter = viewPager2.getAdapter();
        if (adapter != null) {
            if (viewPager2.f6122l > 0) {
            }
            if (viewPager2.f6122l < d5 - 1) {
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f6127r.getMeasuredWidth();
        int measuredHeight = this.f6127r.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f6119i;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f6120j;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f6127r.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f6123m) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f6127r, i10, i11);
        int measuredWidth = this.f6127r.getMeasuredWidth();
        int measuredHeight = this.f6127r.getMeasuredHeight();
        int measuredState = this.f6127r.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f6125p = jVar.f6144j;
        this.f6126q = jVar.f6145k;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f6143i = this.f6127r.getId();
        int i10 = this.f6125p;
        if (i10 == -1) {
            i10 = this.f6122l;
        }
        jVar.f6144j = i10;
        Parcelable parcelable = this.f6126q;
        if (parcelable == null) {
            RecyclerView.Adapter adapter = this.f6127r.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                parcelable = ((androidx.viewpager2.adapter.g) adapter).a();
            }
            return jVar;
        }
        jVar.f6145k = parcelable;
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int currentItem;
        this.B.getClass();
        boolean z11 = false;
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
            if (!z10) {
                f fVar = this.B;
                fVar.getClass();
                if ((i10 == 8192 || i10 == 4096) ? true : true) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    if (i10 == 8192) {
                        currentItem = viewPager2.getCurrentItem() - 1;
                    } else {
                        currentItem = viewPager2.getCurrentItem() + 1;
                    }
                    if (viewPager2.f6135z) {
                        viewPager2.b(currentItem);
                    }
                    return true;
                }
                throw new IllegalStateException();
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        z10 = true;
        if (!z10) {
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f6127r.getAdapter();
        f fVar = this.B;
        if (adapter2 != null) {
            adapter2.r(fVar.c);
        } else {
            fVar.getClass();
        }
        a aVar = this.n;
        if (adapter2 != null) {
            adapter2.r(aVar);
        }
        this.f6127r.setAdapter(adapter);
        this.f6122l = 0;
        a();
        f fVar2 = this.B;
        fVar2.b();
        if (adapter != null) {
            adapter.p(fVar2.c);
        }
        if (adapter != null) {
            adapter.p(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        if (!((androidx.viewpager2.widget.c) this.f6131v.f15980b).f6160m) {
            b(i10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.B.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.A = i10;
        this.f6127r.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f6124o.k1(i10);
        this.B.b();
    }

    public void setPageTransformer(g gVar) {
        boolean z10 = this.f6134y;
        if (gVar != null) {
            if (!z10) {
                this.f6133x = this.f6127r.getItemAnimator();
                this.f6134y = true;
            }
            this.f6127r.setItemAnimator(null);
        } else if (z10) {
            this.f6127r.setItemAnimator(this.f6133x);
            this.f6133x = null;
            this.f6134y = false;
        }
        this.f6132w.getClass();
        if (gVar == null) {
            return;
        }
        this.f6132w.getClass();
        this.f6132w.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f6135z = z10;
        this.B.b();
    }
}
