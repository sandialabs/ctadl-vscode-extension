package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.n0;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ActionMenuView extends n0 implements f.b, androidx.appcompat.view.menu.k {
    public boolean A;
    public androidx.appcompat.widget.c B;
    public j.a C;
    public f.a D;
    public boolean E;
    public int F;
    public final int G;
    public final int H;
    public e I;

    /* renamed from: x  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f734x;

    /* renamed from: y  reason: collision with root package name */
    public Context f735y;

    /* renamed from: z  reason: collision with root package name */
    public int f736z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends n0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f737a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f738b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f739d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f740e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f741f;

        public c() {
            super(-2, -2);
            this.f737a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f737a = cVar.f737a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            boolean z10;
            boolean z11;
            e eVar = ActionMenuView.this.I;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<a3.r> it = toolbar.O.f208a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().c()) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                Toolbar.h hVar = toolbar.Q;
                if (hVar != null) {
                    z11 = hVar.onMenuItemClick(menuItem);
                } else {
                    z11 = false;
                }
            }
            if (!z11) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            f.a aVar = ActionMenuView.this.D;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.G = (int) (56.0f * f10);
        this.H = (int) (f10 * 4.0f);
        this.f735y = context;
        this.f736z = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.f734x.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.f734x = fVar;
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.n0
    public final n0.a f() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.n0
    public final n0.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f734x == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.f734x = fVar;
            fVar.f616e = new d();
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.B = cVar;
            cVar.f865t = true;
            cVar.f866u = true;
            j.a aVar = this.C;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f572m = aVar;
            this.f734x.b(cVar, this.f735y);
            androidx.appcompat.widget.c cVar2 = this.B;
            cVar2.f574p = this;
            this.f734x = cVar2.f570k;
        }
        return this.f734x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.B;
        c.d dVar = cVar.f862q;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f864s) {
            return cVar.f863r;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f736z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.n0
    public final /* bridge */ /* synthetic */ n0.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.B;
        if (cVar != null) {
            cVar.f();
            if (this.B.g()) {
                this.B.c();
                this.B.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.B;
        if (cVar != null) {
            cVar.c();
            c.a aVar = cVar.B;
            if (aVar != null && aVar.b()) {
                aVar.f671j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.E) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = n1.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f737a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    k(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f737a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f737a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // androidx.appcompat.widget.n0, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r42;
        boolean z15;
        int i18;
        int i19;
        int i20;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i21;
        boolean z17;
        androidx.appcompat.view.menu.f fVar;
        boolean z18 = this.E;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        if (z18 != z10) {
            this.F = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.E && (fVar = this.f734x) != null && size != this.F) {
            this.F = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (this.E && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i22 = size2 - paddingRight;
            int i23 = this.G;
            int i24 = i22 / i23;
            int i25 = i22 % i23;
            if (i24 == 0) {
                setMeasuredDimension(i22, 0);
                return;
            }
            int i26 = (i25 / i24) + i23;
            int childCount2 = getChildCount();
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            boolean z19 = false;
            long j2 = 0;
            int i31 = 0;
            while (true) {
                i12 = this.H;
                if (i30 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i30);
                int i32 = size3;
                int i33 = i22;
                if (childAt.getVisibility() == 8) {
                    i19 = mode;
                    i20 = paddingBottom;
                } else {
                    boolean z20 = childAt instanceof ActionMenuItemView;
                    int i34 = i28 + 1;
                    if (z20) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f741f = false;
                    cVar.c = 0;
                    cVar.f738b = 0;
                    cVar.f739d = false;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                    if (z20 && ((ActionMenuItemView) childAt).l()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    cVar.f740e = z15;
                    if (cVar.f737a) {
                        i18 = 1;
                    } else {
                        i18 = i24;
                    }
                    c cVar2 = (c) childAt.getLayoutParams();
                    i19 = mode;
                    i20 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z20) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i18 > 0 && (!z16 || i18 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i21 = measuredWidth / i26;
                        if (measuredWidth % i26 != 0) {
                            i21++;
                        }
                        if (z16 && i21 < 2) {
                            i21 = 2;
                        }
                    } else {
                        i21 = 0;
                    }
                    if (!cVar2.f737a && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    cVar2.f739d = z17;
                    cVar2.f738b = i21;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i21, 1073741824), makeMeasureSpec);
                    i29 = Math.max(i29, i21);
                    if (cVar.f739d) {
                        i31++;
                    }
                    if (cVar.f737a) {
                        z19 = true;
                    }
                    i24 -= i21;
                    i27 = Math.max(i27, childAt.getMeasuredHeight());
                    if (i21 == 1) {
                        j2 |= 1 << i30;
                    }
                    i28 = i34;
                }
                i30++;
                size3 = i32;
                i22 = i33;
                paddingBottom = i20;
                mode = i19;
            }
            int i35 = mode;
            int i36 = i22;
            int i37 = size3;
            if (z19 && i28 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = false;
            while (i31 > 0 && i24 > 0) {
                int i38 = Integer.MAX_VALUE;
                int i39 = 0;
                int i40 = 0;
                long j10 = 0;
                while (i40 < childCount2) {
                    c cVar3 = (c) getChildAt(i40).getLayoutParams();
                    boolean z22 = z21;
                    if (cVar3.f739d) {
                        int i41 = cVar3.f738b;
                        if (i41 < i38) {
                            j10 = 1 << i40;
                            i38 = i41;
                            i39 = 1;
                        } else if (i41 == i38) {
                            j10 |= 1 << i40;
                            i39++;
                        }
                    }
                    i40++;
                    z21 = z22;
                }
                z12 = z21;
                j2 |= j10;
                if (i39 > i24) {
                    break;
                }
                int i42 = i38 + 1;
                int i43 = 0;
                while (i43 < childCount2) {
                    View childAt2 = getChildAt(i43);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i44 = i27;
                    int i45 = childMeasureSpec;
                    int i46 = childCount2;
                    long j11 = 1 << i43;
                    if ((j10 & j11) == 0) {
                        if (cVar4.f738b == i42) {
                            j2 |= j11;
                        }
                    } else {
                        if (z11 && cVar4.f740e) {
                            r42 = 1;
                            r42 = 1;
                            if (i24 == 1) {
                                childAt2.setPadding(i12 + i26, 0, i12, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        cVar4.f738b += r42;
                        cVar4.f741f = r42;
                        i24--;
                    }
                    i43++;
                    childMeasureSpec = i45;
                    i27 = i44;
                    childCount2 = i46;
                }
                z21 = true;
            }
            z12 = z21;
            int i47 = i27;
            int i48 = childMeasureSpec;
            int i49 = childCount2;
            if (!z19 && i28 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i24 > 0 && j2 != 0 && (i24 < i28 - 1 || z13 || i29 > 1)) {
                float bitCount = Long.bitCount(j2);
                if (!z13) {
                    if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f740e) {
                        bitCount -= 0.5f;
                    }
                    int i50 = i49 - 1;
                    if ((j2 & (1 << i50)) != 0 && !((c) getChildAt(i50).getLayoutParams()).f740e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i17 = (int) ((i24 * i26) / bitCount);
                } else {
                    i17 = 0;
                }
                boolean z23 = z12;
                i13 = i49;
                for (int i51 = 0; i51 < i13; i51++) {
                    if ((j2 & (1 << i51)) != 0) {
                        View childAt3 = getChildAt(i51);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.c = i17;
                            cVar5.f741f = true;
                            if (i51 == 0 && !cVar5.f740e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i17) / 2;
                            }
                        } else if (cVar5.f737a) {
                            cVar5.c = i17;
                            cVar5.f741f = true;
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i17) / 2;
                        } else {
                            if (i51 != 0) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = i17 / 2;
                            }
                            if (i51 != i13 - 1) {
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = i17 / 2;
                            }
                        }
                        z23 = true;
                    }
                }
                z14 = z23;
            } else {
                i13 = i49;
                z14 = z12;
            }
            if (z14) {
                int i52 = 0;
                while (i52 < i13) {
                    View childAt4 = getChildAt(i52);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (!cVar6.f741f) {
                        i16 = i48;
                    } else {
                        i16 = i48;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f738b * i26) + cVar6.c, 1073741824), i16);
                    }
                    i52++;
                    i48 = i16;
                }
            }
            if (i35 != 1073741824) {
                i15 = i36;
                i14 = i47;
            } else {
                i14 = i37;
                i15 = i36;
            }
            setMeasuredDimension(i15, i14);
            return;
        }
        for (int i53 = 0; i53 < childCount; i53++) {
            c cVar7 = (c) getChildAt(i53).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.B.f870y = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.B;
        c.d dVar = cVar.f862q;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f864s = true;
        cVar.f863r = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.A = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f736z != i10) {
            this.f736z = i10;
            if (i10 == 0) {
                this.f735y = getContext();
            } else {
                this.f735y = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.B = cVar;
        cVar.f574p = this;
        this.f734x = cVar.f570k;
    }
}
