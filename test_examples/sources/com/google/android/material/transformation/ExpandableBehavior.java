package com.google.android.material.transformation;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f7504a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ View f7505i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int f7506j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ s5.a f7507k;

        public a(View view, int i10, s5.a aVar) {
            this.f7505i = view;
            this.f7506j = i10;
            this.f7507k = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f7505i;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f7504a == this.f7506j) {
                s5.a aVar = this.f7507k;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f7504a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7504a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        s5.a aVar = (s5.a) view2;
        int i10 = 2;
        if (aVar.a()) {
            int i11 = this.f7504a;
            if (i11 != 0) {
                if (i11 == 2) {
                }
                z10 = false;
            }
        } else {
            z10 = this.f7504a == 1 ? true : true;
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i10 = 1;
        }
        this.f7504a = i10;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        s5.a aVar;
        boolean z10;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (!j0.g.c(view)) {
            List<View> e10 = coordinatorLayout.e(view);
            int size = e10.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = e10.get(i11);
                    if (b(view, view2)) {
                        aVar = (s5.a) view2;
                        break;
                    }
                    i11++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i12 = 2;
                if (aVar.a()) {
                    int i13 = this.f7504a;
                    if (i13 != 0) {
                        if (i13 == 2) {
                        }
                        z10 = false;
                    }
                } else {
                    z10 = this.f7504a == 1 ? true : true;
                    z10 = false;
                }
                if (z10) {
                    if (aVar.a()) {
                        i12 = 1;
                    }
                    this.f7504a = i12;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);
}
