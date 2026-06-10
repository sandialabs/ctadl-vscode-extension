package com.google.android.material.transformation;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.noto.R;
import e5.g;
import java.util.HashMap;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f7522i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f7522i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f4593a instanceof FabTransformationScrimBehavior)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (childAt != view2 && !z12) {
                    HashMap hashMap = this.f7522i;
                    if (!z10) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            i10 = ((Integer) this.f7522i.get(childAt)).intValue();
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        i10 = 4;
                    }
                    j0.d.s(childAt, i10);
                }
            }
            if (!z10) {
                this.f7522i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.b z(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f7517a = g.b(context, i10);
        bVar.f7518b = new a1.b();
        return bVar;
    }
}
