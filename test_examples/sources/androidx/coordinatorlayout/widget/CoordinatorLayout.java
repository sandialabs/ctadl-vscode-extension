package androidx.coordinatorlayout.widget;

import a3.b1;
import a3.j0;
import a3.k;
import a3.u;
import a3.v;
import a3.v0;
import a3.w;
import a3.x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.noto.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n2.a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements u, v {
    public static final String A;
    public static final Class<?>[] B;
    public static final ThreadLocal<Map<String, Constructor<c>>> C;
    public static final i D;
    public static final z2.d E;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f4574i;

    /* renamed from: j  reason: collision with root package name */
    public final d2.a f4575j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4576k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f4577l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f4578m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4579o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f4580p;

    /* renamed from: q  reason: collision with root package name */
    public View f4581q;

    /* renamed from: r  reason: collision with root package name */
    public View f4582r;

    /* renamed from: s  reason: collision with root package name */
    public g f4583s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4584t;

    /* renamed from: u  reason: collision with root package name */
    public b1 f4585u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4586v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f4587w;

    /* renamed from: x  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4588x;

    /* renamed from: y  reason: collision with root package name */
    public a f4589y;

    /* renamed from: z  reason: collision with root package name */
    public final w f4590z;

    /* loaded from: classes.dex */
    public class a implements x {
        public a() {
        }

        @Override // a3.x
        public final b1 a(View view, b1 b1Var) {
            boolean z10;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!z2.b.a(coordinatorLayout.f4585u, b1Var)) {
                coordinatorLayout.f4585u = b1Var;
                boolean z11 = true;
                if (b1Var.f() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.f4586v = z10;
                if (z10 || coordinatorLayout.getBackground() != null) {
                    z11 = false;
                }
                coordinatorLayout.setWillNotDraw(z11);
                b1.k kVar = b1Var.f140a;
                if (!kVar.n()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        if (j0.d.b(childAt) && ((f) childAt.getLayoutParams()).f4593a != null && kVar.n()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return b1Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v3, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v3, Rect rect, boolean z10) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v3, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4588x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f4588x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f4593a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4594b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4595d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4596e;

        /* renamed from: f  reason: collision with root package name */
        public int f4597f;

        /* renamed from: g  reason: collision with root package name */
        public int f4598g;

        /* renamed from: h  reason: collision with root package name */
        public int f4599h;

        /* renamed from: i  reason: collision with root package name */
        public int f4600i;

        /* renamed from: j  reason: collision with root package name */
        public int f4601j;

        /* renamed from: k  reason: collision with root package name */
        public View f4602k;

        /* renamed from: l  reason: collision with root package name */
        public View f4603l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4604m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f4605o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f4606p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f4607q;

        public f() {
            super(-2, -2);
            this.f4594b = false;
            this.c = 0;
            this.f4595d = 0;
            this.f4596e = -1;
            this.f4597f = -1;
            this.f4598g = 0;
            this.f4599h = 0;
            this.f4607q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f4594b = false;
            this.c = 0;
            this.f4595d = 0;
            this.f4596e = -1;
            this.f4597f = -1;
            this.f4598g = 0;
            this.f4599h = 0;
            this.f4607q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.J0);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f4597f = obtainStyledAttributes.getResourceId(1, -1);
            this.f4595d = obtainStyledAttributes.getInteger(2, 0);
            this.f4596e = obtainStyledAttributes.getInteger(6, -1);
            this.f4598g = obtainStyledAttributes.getInt(5, 0);
            this.f4599h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f4594b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.A;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.A;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.C;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.B);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException("Could not inflate Behavior subclass " + string, e10);
                    }
                }
                this.f4593a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f4593a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4594b = false;
            this.c = 0;
            this.f4595d = 0;
            this.f4596e = -1;
            this.f4597f = -1;
            this.f4598g = 0;
            this.f4599h = 0;
            this.f4607q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4594b = false;
            this.c = 0;
            this.f4595d = 0;
            this.f4596e = -1;
            this.f4597f = -1;
            this.f4598g = 0;
            this.f4599h = 0;
            this.f4607q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f4594b = false;
            this.c = 0;
            this.f4595d = 0;
            this.f4596e = -1;
            this.f4597f = -1;
            this.f4598g = 0;
            this.f4599h = 0;
            this.f4607q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f4605o;
            }
            return this.n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f4593a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f4593a = cVar;
                this.f4594b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends h3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public SparseArray<Parcelable> f4609k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f4609k = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f4609k.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f11358i, i10);
            SparseArray<Parcelable> sparseArray = this.f4609k;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f4609k.keyAt(i12);
                parcelableArr[i12] = this.f4609k.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            float m10 = j0.i.m(view);
            float m11 = j0.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        A = r02 != null ? r02.getName() : null;
        D = new i();
        B = new Class[]{Context.class, AttributeSet.class};
        C = new ThreadLocal<>();
        E = new z2.d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f4574i = new ArrayList();
        this.f4575j = new d2.a(1);
        this.f4576k = new ArrayList();
        this.f4577l = new int[2];
        this.f4578m = new int[2];
        this.f4590z = new w();
        int[] iArr = a1.b.I0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4580p = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f4580p;
                iArr2[i10] = (int) (iArr2[i10] * f10);
            }
        }
        this.f4587w = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        z();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.c(this) == 0) {
            j0.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) E.a();
        return rect == null ? new Rect() : rect;
    }

    public static void h(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int i13 = fVar.c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f4595d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public static f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f4594b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
            }
            fVar.f4594b = true;
        }
        return fVar;
    }

    public static void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f4600i;
        if (i11 != i10) {
            j0.j(view, i10 - i11);
            fVar.f4600i = i10;
        }
    }

    public static void y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f4601j;
        if (i11 != i10) {
            j0.k(view, i10 - i11);
            fVar.f4601j = i10;
        }
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void c(View view) {
        ArrayList arrayList = (ArrayList) ((p.h) this.f4575j.f10382b).getOrDefault(view, null);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                View view2 = (View) arrayList.get(i10);
                c cVar = ((f) view2.getLayoutParams()).f4593a;
                if (cVar != null) {
                    cVar.d(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                g(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        c cVar = ((f) view.getLayoutParams()).f4593a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4587w;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final List<View> e(View view) {
        p.h hVar = (p.h) this.f4575j.f10382b;
        int i10 = hVar.f16580k;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) hVar.k(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hVar.i(i11));
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    @Override // a3.u
    public final void f(View view, View view2, int i10, int i11) {
        w wVar = this.f4590z;
        if (i11 == 1) {
            wVar.f219b = i10;
        } else {
            wVar.f218a = i10;
        }
        this.f4582r = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    public final void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = k2.a.f12869a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = k2.a.f12869a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k2.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = k2.a.f12870b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.f4574i);
    }

    public final b1 getLastWindowInsets() {
        return this.f4585u;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.f4590z;
        return wVar.f219b | wVar.f218a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4587w;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // a3.u
    public final void i(View view, int i10) {
        w wVar = this.f4590z;
        if (i10 == 1) {
            wVar.f219b = 0;
        } else {
            wVar.f218a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f4593a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        fVar.f4605o = false;
                    }
                } else {
                    fVar.n = false;
                }
                fVar.f4606p = false;
            }
        }
        this.f4582r = null;
    }

    @Override // a3.u
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f4593a) != null) {
                    int[] iArr2 = this.f4577l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f4577l;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr3[1]);
                    } else {
                        min2 = Math.min(i14, iArr3[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            q(1);
        }
    }

    public final int k(int i10) {
        StringBuilder sb;
        int[] iArr = this.f4580p;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i10);
        } else {
            if (i10 >= 0 && i10 < iArr.length) {
                return iArr[i10];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i10);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // a3.v
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f4593a) != null) {
                    int[] iArr2 = this.f4577l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, view, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            q(1);
        }
    }

    @Override // a3.u
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f4578m);
    }

    @Override // a3.u
    public final boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f4593a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            fVar.f4605o = p10;
                        }
                    } else {
                        fVar.n = p10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        fVar.f4605o = false;
                    }
                } else {
                    fVar.n = false;
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
        if (this.f4584t) {
            if (this.f4583s == null) {
                this.f4583s = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4583s);
        }
        if (this.f4585u == null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.d.b(this)) {
                j0.h.c(this);
            }
        }
        this.f4579o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w();
        if (this.f4584t && this.f4583s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4583s);
        }
        View view = this.f4582r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4579o = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4586v || this.f4587w == null) {
            return;
        }
        b1 b1Var = this.f4585u;
        int f10 = b1Var != null ? b1Var.f() : 0;
        if (f10 > 0) {
            this.f4587w.setBounds(0, 0, getWidth(), f10);
            this.f4587w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w();
        }
        boolean u10 = u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4581q = null;
            w();
        }
        return u10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int d5 = j0.e.d(this);
        ArrayList arrayList = this.f4574i;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f4593a) == null || !cVar.h(this, view, d5))) {
                r(view, d5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c cVar;
        int i17;
        ArrayList arrayList;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        v();
        int childCount = getChildCount();
        int i25 = 0;
        while (true) {
            if (i25 < childCount) {
                View childAt = getChildAt(i25);
                p.h hVar = (p.h) this.f4575j.f10382b;
                int i26 = hVar.f16580k;
                int i27 = 0;
                while (true) {
                    if (i27 < i26) {
                        ArrayList arrayList2 = (ArrayList) hVar.k(i27);
                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                            z13 = true;
                            break;
                        }
                        i27++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                if (z13) {
                    z10 = true;
                    break;
                }
                i25++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10 != this.f4584t) {
            if (z10) {
                if (this.f4579o) {
                    if (this.f4583s == null) {
                        this.f4583s = new g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f4583s);
                }
                this.f4584t = true;
            } else {
                if (this.f4579o && this.f4583s != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f4583s);
                }
                this.f4584t = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int d5 = j0.e.d(this);
        if (d5 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i28 = paddingLeft + paddingRight;
        int i29 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f4585u != null && j0.d.b(this)) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList3 = this.f4574i;
        int size3 = arrayList3.size();
        int i30 = suggestedMinimumWidth;
        int i31 = suggestedMinimumHeight;
        int i32 = 0;
        int i33 = 0;
        while (i33 < size3) {
            View view = (View) arrayList3.get(i33);
            int i34 = i32;
            if (view.getVisibility() == 8) {
                i17 = size3;
                arrayList = arrayList3;
                i20 = paddingLeft;
                i23 = paddingRight;
                i18 = d5;
                i32 = i34;
                i22 = i33;
            } else {
                f fVar = (f) view.getLayoutParams();
                int i35 = fVar.f4596e;
                if (i35 >= 0 && mode != 0) {
                    int k3 = k(i35);
                    i12 = i33;
                    int i36 = fVar.c;
                    if (i36 == 0) {
                        i36 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i36, d5) & 7;
                    i13 = i31;
                    if ((absoluteGravity == 3 && !z11) || (absoluteGravity == 5 && z11)) {
                        i14 = Math.max(0, (size - paddingRight) - k3);
                    } else if ((absoluteGravity == 5 && !z11) || (absoluteGravity == 3 && z11)) {
                        i14 = Math.max(0, k3 - paddingLeft);
                    }
                    if (!z12 && !j0.d.b(view)) {
                        int e10 = this.f4585u.e() + this.f4585u.d();
                        int c10 = this.f4585u.c() + this.f4585u.f();
                        i15 = View.MeasureSpec.makeMeasureSpec(size - e10, mode);
                        i16 = View.MeasureSpec.makeMeasureSpec(size2 - c10, mode2);
                    } else {
                        i15 = i10;
                        i16 = i11;
                    }
                    cVar = fVar.f4593a;
                    if (cVar == null) {
                        i22 = i12;
                        i20 = paddingLeft;
                        i21 = i34;
                        int i37 = i13;
                        i23 = paddingRight;
                        i24 = i37;
                        i18 = d5;
                        i19 = i30;
                        i17 = size3;
                        arrayList = arrayList3;
                        if (!cVar.i(this, view, i15, i14, i16)) {
                        }
                        int max = Math.max(i19, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int max2 = Math.max(i24, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i30 = max;
                        i32 = View.combineMeasuredStates(i21, view.getMeasuredState());
                        i31 = max2;
                    } else {
                        i17 = size3;
                        arrayList = arrayList3;
                        i18 = d5;
                        i19 = i30;
                        int i38 = i12;
                        i20 = paddingLeft;
                        i21 = i34;
                        i22 = i38;
                        int i39 = i13;
                        i23 = paddingRight;
                        i24 = i39;
                    }
                    measureChildWithMargins(view, i15, i14, i16, 0);
                    int max3 = Math.max(i19, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max22 = Math.max(i24, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i30 = max3;
                    i32 = View.combineMeasuredStates(i21, view.getMeasuredState());
                    i31 = max22;
                } else {
                    i12 = i33;
                    i13 = i31;
                }
                i14 = 0;
                if (!z12) {
                }
                i15 = i10;
                i16 = i11;
                cVar = fVar.f4593a;
                if (cVar == null) {
                }
                measureChildWithMargins(view, i15, i14, i16, 0);
                int max32 = Math.max(i19, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i24, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i30 = max32;
                i32 = View.combineMeasuredStates(i21, view.getMeasuredState());
                i31 = max222;
            }
            i33 = i22 + 1;
            paddingLeft = i20;
            paddingRight = i23;
            d5 = i18;
            size3 = i17;
            arrayList3 = arrayList;
        }
        int i40 = i32;
        setMeasuredDimension(View.resolveSizeAndState(i30, i10, (-16777216) & i40), View.resolveSizeAndState(i31, i11, i40 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f4593a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f4593a) != null) {
                    z10 |= cVar.j(this, childAt, view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f11358i);
        SparseArray<Parcelable> sparseArray = hVar.f4609k;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = l(childAt).f4593a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f4593a;
            if (id != -1 && cVar != null && (o10 = cVar.o(childAt)) != null) {
                sparseArray.append(id, o10);
            }
        }
        hVar.f4609k = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean u10;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f4581q;
        boolean z10 = false;
        if (view != null) {
            c cVar = ((f) view.getLayoutParams()).f4593a;
            u10 = cVar != null ? cVar.r(this, this.f4581q, motionEvent) : false;
        } else {
            u10 = u(motionEvent, 1);
            if (actionMasked != 0 && u10) {
                z10 = true;
            }
        }
        if (this.f4581q != null && actionMasked != 3) {
            if (z10) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                this.f4581q = null;
                w();
            }
            return u10;
        }
        u10 |= super.onTouchEvent(motionEvent);
        if (actionMasked != 1) {
        }
        this.f4581q = null;
        w();
        return u10;
    }

    public final boolean p(View view, int i10, int i11) {
        z2.d dVar = E;
        Rect a10 = a();
        g(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            dVar.b(a10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        f fVar;
        ArrayList arrayList2;
        int i20;
        Rect rect2;
        int i21;
        View view;
        z2.d dVar;
        f fVar2;
        int i22;
        boolean z14;
        int i23;
        int i24;
        c cVar;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int d5 = j0.e.d(this);
        ArrayList arrayList3 = this.f4574i;
        int size = arrayList3.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i25 = i10;
        int i26 = 0;
        while (true) {
            z2.d dVar2 = E;
            if (i26 < size) {
                View view2 = (View) arrayList3.get(i26);
                f fVar3 = (f) view2.getLayoutParams();
                if (i25 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = a12;
                    i11 = i26;
                } else {
                    int i27 = 0;
                    while (i27 < i26) {
                        if (fVar3.f4603l == ((View) arrayList3.get(i27))) {
                            f fVar4 = (f) view2.getLayoutParams();
                            if (fVar4.f4602k != null) {
                                Rect a13 = a();
                                Rect a14 = a();
                                arrayList2 = arrayList3;
                                Rect a15 = a();
                                i19 = i27;
                                g(fVar4.f4602k, a13);
                                d(view2, a14, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i20 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i21 = i26;
                                fVar = fVar3;
                                view = view2;
                                rect2 = a12;
                                dVar = dVar2;
                                h(d5, a13, a15, fVar4, measuredWidth, measuredHeight);
                                if (a15.left == a14.left && a15.top == a14.top) {
                                    fVar2 = fVar4;
                                    i22 = measuredWidth;
                                    z14 = false;
                                    b(fVar2, a15, i22, measuredHeight);
                                    i23 = a15.left - a14.left;
                                    i24 = a15.top - a14.top;
                                    if (i23 != 0) {
                                        j0.j(view, i23);
                                    }
                                    if (i24 != 0) {
                                        j0.k(view, i24);
                                    }
                                    if (z14 && (cVar = fVar2.f4593a) != null) {
                                        cVar.d(this, view, fVar2.f4602k);
                                    }
                                    a13.setEmpty();
                                    dVar.b(a13);
                                    a14.setEmpty();
                                    dVar.b(a14);
                                    a15.setEmpty();
                                    dVar.b(a15);
                                    i27 = i19 + 1;
                                    dVar2 = dVar;
                                    view2 = view;
                                    arrayList3 = arrayList2;
                                    size = i20;
                                    i26 = i21;
                                    fVar3 = fVar;
                                    a12 = rect2;
                                }
                                fVar2 = fVar4;
                                i22 = measuredWidth;
                                z14 = true;
                                b(fVar2, a15, i22, measuredHeight);
                                i23 = a15.left - a14.left;
                                i24 = a15.top - a14.top;
                                if (i23 != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (z14) {
                                    cVar.d(this, view, fVar2.f4602k);
                                }
                                a13.setEmpty();
                                dVar.b(a13);
                                a14.setEmpty();
                                dVar.b(a14);
                                a15.setEmpty();
                                dVar.b(a15);
                                i27 = i19 + 1;
                                dVar2 = dVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i20;
                                i26 = i21;
                                fVar3 = fVar;
                                a12 = rect2;
                            }
                        }
                        i19 = i27;
                        fVar = fVar3;
                        arrayList2 = arrayList3;
                        i20 = size;
                        rect2 = a12;
                        i21 = i26;
                        view = view2;
                        dVar = dVar2;
                        i27 = i19 + 1;
                        dVar2 = dVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i20;
                        i26 = i21;
                        fVar3 = fVar;
                        a12 = rect2;
                    }
                    f fVar5 = fVar3;
                    ArrayList arrayList4 = arrayList3;
                    int i28 = size;
                    Rect rect3 = a12;
                    i11 = i26;
                    View view3 = view2;
                    z2.d dVar3 = dVar2;
                    d(view3, a11, true);
                    if (fVar5.f4598g != 0 && !a11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f4598g, d5);
                        int i29 = absoluteGravity & 112;
                        if (i29 != 48) {
                            if (i29 == 80) {
                                a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                            }
                        } else {
                            a10.top = Math.max(a10.top, a11.bottom);
                        }
                        int i30 = absoluteGravity & 7;
                        if (i30 != 3) {
                            if (i30 == 5) {
                                a10.right = Math.max(a10.right, getWidth() - a11.left);
                            }
                        } else {
                            a10.left = Math.max(a10.left, a11.right);
                        }
                    }
                    if (fVar5.f4599h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        if (j0.g.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            f fVar6 = (f) view3.getLayoutParams();
                            c cVar2 = fVar6.f4593a;
                            Rect a16 = a();
                            Rect a17 = a();
                            a17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (cVar2 != null && cVar2.a(view3, a16)) {
                                if (!a17.contains(a16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a16.toShortString() + " | Bounds:" + a17.toShortString());
                                }
                            } else {
                                a16.set(a17);
                            }
                            a17.setEmpty();
                            dVar3.b(a17);
                            if (!a16.isEmpty()) {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.f4599h, d5);
                                if ((absoluteGravity2 & 48) == 48 && (i17 = (a16.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f4601j) < (i18 = a10.top)) {
                                    y(view3, i18 - i17);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f4601j) < (i16 = a10.bottom)) {
                                    y(view3, height - i16);
                                    z11 = true;
                                }
                                if (!z11) {
                                    y(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i14 = (a16.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f4600i) < (i15 = a10.left)) {
                                    x(view3, i15 - i14);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f4600i) < (i13 = a10.right)) {
                                    x(view3, width - i13);
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                if (!z13) {
                                    x(view3, 0);
                                }
                            }
                            a16.setEmpty();
                            dVar3.b(a16);
                        }
                    }
                    if (i10 != 2) {
                        rect = rect3;
                        rect.set(((f) view3.getLayoutParams()).f4607q);
                        if (rect.equals(a11)) {
                            arrayList = arrayList4;
                            i12 = i28;
                            i25 = i10;
                        } else {
                            ((f) view3.getLayoutParams()).f4607q.set(a11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i31 = i11 + 1;
                    i12 = i28;
                    while (true) {
                        arrayList = arrayList4;
                        if (i31 >= i12) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i31);
                        f fVar7 = (f) view4.getLayoutParams();
                        c cVar3 = fVar7.f4593a;
                        if (cVar3 != null && cVar3.b(view4, view3)) {
                            if (i10 == 0 && fVar7.f4606p) {
                                fVar7.f4606p = false;
                            } else {
                                if (i10 != 2) {
                                    z10 = cVar3.d(this, view4, view3);
                                } else {
                                    cVar3.e(this, view3);
                                    z10 = true;
                                }
                                if (i10 == 1) {
                                    fVar7.f4606p = z10;
                                }
                            }
                        }
                        i31++;
                        arrayList4 = arrayList;
                    }
                    i25 = i10;
                }
                i26 = i11 + 1;
                a12 = rect;
                size = i12;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a12;
                a10.setEmpty();
                dVar2.b(a10);
                a11.setEmpty();
                dVar2.b(a11);
                rect4.setEmpty();
                dVar2.b(rect4);
                return;
            }
        }
    }

    public final void r(View view, int i10) {
        boolean z10;
        Rect a10;
        Rect a11;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f4602k;
        int i11 = 0;
        if (view2 == null && fVar.f4597f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            z2.d dVar = E;
            if (view2 != null) {
                a10 = a();
                a11 = a();
                try {
                    g(view2, a10);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    h(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                    b(fVar2, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                    a10.setEmpty();
                    dVar.b(a10);
                    a11.setEmpty();
                    dVar.b(a11);
                    return;
                } finally {
                    a10.setEmpty();
                    dVar.b(a10);
                    a11.setEmpty();
                    dVar.b(a11);
                }
            }
            int i12 = fVar.f4596e;
            if (i12 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i13 = fVar3.c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int k3 = k(i12) - measuredWidth2;
                if (i14 != 1) {
                    if (i14 == 5) {
                        k3 += measuredWidth2;
                    }
                } else {
                    k3 += measuredWidth2 / 2;
                }
                if (i15 != 16) {
                    if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                } else {
                    i11 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(k3, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            a10 = a();
            a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.f4585u != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.d.b(this) && !j0.d.b(view)) {
                    a10.left = this.f4585u.d() + a10.left;
                    a10.top = this.f4585u.f() + a10.top;
                    a10.right -= this.f4585u.e();
                    a10.bottom -= this.f4585u.c();
                }
            }
            a11 = a();
            int i16 = fVar4.c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            k.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f4593a;
        if (cVar != null && cVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.n) {
            if (this.f4581q == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    c cVar = ((f) childAt.getLayoutParams()).f4593a;
                    if (cVar != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        cVar.g(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            w();
            this.n = true;
        }
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4588x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f4587w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4587w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4587w.setState(getDrawableState());
                }
                Drawable drawable4 = this.f4587w;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                r2.a.c(drawable4, j0.e.d(this));
                Drawable drawable5 = this.f4587w;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f4587w.setCallback(this);
            }
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            j0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = n2.a.f16069a;
            drawable = a.b.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f4587w;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f4587w.setVisible(z10, false);
    }

    public final boolean t(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return cVar.r(this, view, motionEvent);
            }
            throw new IllegalArgumentException();
        }
        return cVar.g(this, view, motionEvent);
    }

    public final boolean u(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4576k;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        i iVar = D;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f4593a;
            if ((z11 || z12) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = MotionEvent.obtain(motionEvent);
                        motionEvent2.setAction(3);
                    }
                    t(cVar, view, motionEvent2, i10);
                }
            } else {
                if (!z12 && !z11 && cVar != null && (z11 = t(cVar, view, motionEvent, i10))) {
                    this.f4581q = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i14 = 0; i14 < i13; i14++) {
                            View view2 = (View) arrayList.get(i14);
                            c cVar2 = ((f) view2.getLayoutParams()).f4593a;
                            if (cVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = MotionEvent.obtain(motionEvent);
                                    motionEvent2.setAction(3);
                                }
                                t(cVar2, view2, motionEvent2, i10);
                            }
                        }
                    }
                }
                if (fVar.f4593a == null) {
                    fVar.f4604m = false;
                }
                boolean z13 = fVar.f4604m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f4604m = z10;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r10 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015d, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        ArrayList arrayList = this.f4574i;
        arrayList.clear();
        d2.a aVar = this.f4575j;
        p.h hVar = (p.h) aVar.f10382b;
        int i10 = hVar.f16580k;
        int i11 = 0;
        while (true) {
            obj = aVar.f10381a;
            if (i11 >= i10) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) hVar.k(i11);
            if (arrayList2 != null) {
                arrayList2.clear();
                ((h1.c) obj).b(arrayList2);
            }
            i11++;
        }
        hVar.clear();
        int childCount = getChildCount();
        int i12 = 0;
        loop1: while (true) {
            Object obj2 = aVar.f10382b;
            if (i12 < childCount) {
                View childAt = getChildAt(i12);
                f l2 = l(childAt);
                if (l2.f4597f == -1) {
                    l2.f4603l = null;
                    l2.f4602k = null;
                } else {
                    View view = l2.f4602k;
                    if (view != null) {
                        if (view.getId() == l2.f4597f) {
                            View view2 = l2.f4602k;
                            for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                                if (parent != null && parent != childAt) {
                                    if (parent instanceof View) {
                                        view2 = (View) parent;
                                    }
                                }
                                l2.f4603l = null;
                                l2.f4602k = null;
                            }
                            l2.f4603l = view2;
                            z10 = true;
                        }
                        z10 = false;
                        break;
                    }
                    View findViewById = findViewById(l2.f4597f);
                    l2.f4602k = findViewById;
                    if (findViewById != null) {
                        if (findViewById == this) {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                            }
                        } else {
                            for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                                if (parent2 == childAt) {
                                    if (!isInEditMode()) {
                                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                    }
                                } else {
                                    if (parent2 instanceof View) {
                                        findViewById = (View) parent2;
                                    }
                                }
                            }
                            l2.f4603l = findViewById;
                        }
                    } else if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(l2.f4597f) + " to anchor view " + childAt);
                    }
                    l2.f4603l = null;
                    l2.f4602k = null;
                }
                p.h hVar2 = (p.h) obj2;
                if (!hVar2.containsKey(childAt)) {
                    hVar2.put(childAt, null);
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (i13 != i12) {
                        View childAt2 = getChildAt(i13);
                        if (childAt2 != l2.f4603l) {
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                            int d5 = j0.e.d(this);
                            int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f4598g, d5);
                            if (absoluteGravity != 0 && (Gravity.getAbsoluteGravity(l2.f4599h, d5) & absoluteGravity) == absoluteGravity) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12 && ((cVar = l2.f4593a) == null || !cVar.b(childAt, childAt2))) {
                                z11 = false;
                                if (z11) {
                                    if (!((p.h) obj2).containsKey(childAt2)) {
                                        p.h hVar3 = (p.h) obj2;
                                        if (!hVar3.containsKey(childAt2)) {
                                            hVar3.put(childAt2, null);
                                        }
                                    }
                                    p.h hVar4 = (p.h) obj2;
                                    if (!hVar4.containsKey(childAt2) || !hVar4.containsKey(childAt)) {
                                        break loop1;
                                    }
                                    ArrayList arrayList3 = (ArrayList) hVar4.getOrDefault(childAt2, null);
                                    if (arrayList3 == null) {
                                        arrayList3 = (ArrayList) ((h1.c) obj).a();
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        hVar4.put(childAt2, arrayList3);
                                    }
                                    arrayList3.add(childAt);
                                } else {
                                    continue;
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                }
                i12++;
            } else {
                ArrayList arrayList4 = (ArrayList) aVar.c;
                arrayList4.clear();
                ((HashSet) aVar.f10383d).clear();
                p.h hVar5 = (p.h) obj2;
                int i14 = hVar5.f16580k;
                for (int i15 = 0; i15 < i14; i15++) {
                    aVar.a(hVar5.i(i15), arrayList4, (HashSet) aVar.f10383d);
                }
                arrayList.addAll(arrayList4);
                Collections.reverse(arrayList);
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4587w) {
            return false;
        }
        return true;
    }

    public final void w() {
        View view = this.f4581q;
        if (view != null) {
            c cVar = ((f) view.getLayoutParams()).f4593a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                cVar.r(this, this.f4581q, obtain);
                obtain.recycle();
            }
            this.f4581q = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).f4604m = false;
        }
        this.n = false;
    }

    public final void z() {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.b(this)) {
            if (this.f4589y == null) {
                this.f4589y = new a();
            }
            j0.i.u(this, this.f4589y);
            setSystemUiVisibility(1280);
            return;
        }
        j0.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
