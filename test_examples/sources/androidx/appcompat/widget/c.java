package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import com.noto.R;
import java.util.ArrayList;
import r2.a;

/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.a {
    public e A;
    public a B;
    public RunnableC0009c C;
    public b D;
    public final f E;

    /* renamed from: q  reason: collision with root package name */
    public d f862q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f863r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f864s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f865t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f866u;

    /* renamed from: v  reason: collision with root package name */
    public int f867v;

    /* renamed from: w  reason: collision with root package name */
    public int f868w;

    /* renamed from: x  reason: collision with root package name */
    public int f869x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f870y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f871z;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false);
            if (!((mVar.A.f659x & 32) == 32)) {
                View view2 = c.this.f862q;
                this.f667f = view2 == null ? (View) c.this.f574p : view2;
            }
            f fVar = c.this.E;
            this.f670i = fVar;
            j.d dVar = this.f671j;
            if (dVar != null) {
                dVar.j(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c.this.B = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0009c implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final e f874i;

        public RunnableC0009c(e eVar) {
            this.f874i = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f570k;
            if (fVar != null && (aVar = fVar.f616e) != null) {
                aVar.b(fVar);
            }
            View view = (View) cVar.f574p;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f874i;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f667f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    cVar.A = eVar;
                }
            }
            cVar.C = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends q implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends m0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.m0
            public final j.f b() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.m0
            public final boolean c() {
                c.this.l();
                return true;
            }

            @Override // androidx.appcompat.widget.m0
            public final boolean d() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.c();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            i1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f668g = 8388613;
            f fVar2 = c.this.E;
            this.f670i = fVar2;
            j.d dVar2 = this.f671j;
            if (dVar2 != null) {
                dVar2.j(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f570k;
            if (fVar != null) {
                fVar.c(true);
            }
            cVar.A = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof androidx.appcompat.view.menu.m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f572m;
            if (aVar != null) {
                aVar.b(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f570k) {
                return false;
            }
            ((androidx.appcompat.view.menu.m) fVar).A.getClass();
            cVar.getClass();
            j.a aVar = cVar.f572m;
            if (aVar == null) {
                return false;
            }
            return aVar.c(fVar);
        }
    }

    public c(Context context) {
        super(context);
        this.f871z = new SparseBooleanArray();
        this.E = new f();
    }

    public final View a(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i10 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f571l.inflate(this.f573o, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f574p);
            if (this.D == null) {
                this.D = new b();
            }
            actionMenuItemView.setPopupCallback(this.D);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        c();
        a aVar = this.B;
        if (aVar != null && aVar.b()) {
            aVar.f671j.dismiss();
        }
        j.a aVar2 = this.f572m;
        if (aVar2 != null) {
            aVar2.b(fVar, z10);
        }
    }

    public final boolean c() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0009c runnableC0009c = this.C;
        if (runnableC0009c != null && (kVar = this.f574p) != null) {
            ((View) kVar).removeCallbacks(runnableC0009c);
            this.C = null;
            return true;
        }
        e eVar = this.A;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f671j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f569j = context;
        LayoutInflater.from(context);
        this.f570k = fVar;
        Resources resources = context.getResources();
        if (!this.f866u) {
            this.f865t = true;
        }
        int i10 = 2;
        this.f867v = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
                this.f869x = i10;
                int i13 = this.f867v;
                if (this.f865t) {
                    if (this.f862q == null) {
                        d dVar = new d(this.f568i);
                        this.f862q = dVar;
                        if (this.f864s) {
                            dVar.setImageDrawable(this.f863r);
                            this.f863r = null;
                            this.f864s = false;
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        this.f862q.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    i13 -= this.f862q.getMeasuredWidth();
                } else {
                    this.f862q = null;
                }
                this.f868w = i13;
                float f10 = resources.getDisplayMetrics().density;
            }
            i10 = 4;
            this.f869x = i10;
            int i132 = this.f867v;
            if (this.f865t) {
            }
            this.f868w = i132;
            float f102 = resources.getDisplayMetrics().density;
        }
        i10 = 5;
        this.f869x = i10;
        int i1322 = this.f867v;
        if (this.f865t) {
        }
        this.f868w = i1322;
        float f1022 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f() {
        int i10;
        boolean z10;
        boolean z11;
        androidx.appcompat.view.menu.h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f574p;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f570k;
            if (fVar != null) {
                fVar.i();
                ArrayList<androidx.appcompat.view.menu.h> l2 = this.f570k.l();
                int size = l2.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.h hVar2 = l2.get(i11);
                    if ((hVar2.f659x & 32) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a10 = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f574p).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f862q) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z10 = true;
                }
                if (!z10) {
                    i10++;
                }
            }
        }
        ((View) this.f574p).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f570k;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<androidx.appcompat.view.menu.h> arrayList2 = fVar2.f620i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                a3.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f570k;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f621j;
        }
        if (this.f865t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        d dVar = this.f862q;
        if (z12) {
            if (dVar == null) {
                this.f862q = new d(this.f568i);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f862q.getParent();
            if (viewGroup3 != this.f574p) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f862q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f574p;
                d dVar2 = this.f862q;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f737a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.k kVar = this.f574p;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.f862q);
            }
        }
        ((ActionMenuView) this.f574p).setOverflowReserved(this.f865t);
    }

    public final boolean g() {
        e eVar = this.A;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(androidx.appcompat.view.menu.m mVar) {
        View childAt;
        boolean z10;
        boolean z11 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (true) {
            androidx.appcompat.view.menu.f fVar = mVar2.f693z;
            if (fVar == this.f570k) {
                break;
            }
            mVar2 = (androidx.appcompat.view.menu.m) fVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f574p;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == mVar2.A) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt == null) {
            return false;
        }
        mVar.A.getClass();
        int size = mVar.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                MenuItem item = mVar.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        a aVar = new a(this.f569j, mVar, childAt);
        this.B = aVar;
        aVar.f669h = z10;
        j.d dVar = aVar.f671j;
        if (dVar != null) {
            dVar.o(z10);
        }
        a aVar2 = this.B;
        if (!aVar2.b()) {
            if (aVar2.f667f != null) {
                aVar2.d(0, 0, false, false);
            } else if (!z11) {
                j.a aVar3 = this.f572m;
                if (aVar3 != null) {
                    aVar3.c(mVar);
                }
                return true;
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        z11 = true;
        if (!z11) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i() {
        ArrayList<androidx.appcompat.view.menu.h> arrayList;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f570k;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = cVar.f869x;
        int i13 = cVar.f868w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f574p;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.h hVar = arrayList.get(i14);
            int i17 = hVar.f660y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (cVar.f870y && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.f865t && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.f871z;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f660y;
            if ((i21 & 2) == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i22 = hVar2.f639b;
            if (z11) {
                View a10 = cVar.a(hVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                hVar2.f(z10);
            } else {
                if ((i21 & 1) == z10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z19 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = cVar.a(hVar2, null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i19; i23++) {
                            androidx.appcompat.view.menu.h hVar3 = arrayList.get(i23);
                            if (hVar3.f639b == i22) {
                                if ((hVar3.f659x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                hVar3.f(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    hVar2.f(z13);
                } else {
                    hVar2.f(false);
                    i19++;
                    i11 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            cVar = this;
            z10 = true;
        }
        return true;
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (this.f865t && !g() && (fVar = this.f570k) != null && this.f574p != null && this.C == null) {
            fVar.i();
            if (!fVar.f621j.isEmpty()) {
                RunnableC0009c runnableC0009c = new RunnableC0009c(new e(this.f569j, this.f570k, this.f862q));
                this.C = runnableC0009c;
                ((View) this.f574p).post(runnableC0009c);
                return true;
            }
            return false;
        }
        return false;
    }
}
