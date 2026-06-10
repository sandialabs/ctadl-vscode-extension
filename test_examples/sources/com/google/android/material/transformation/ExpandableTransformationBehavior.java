package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f7509b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void s(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f7509b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet t10 = t(view, view2, z10, z12);
        this.f7509b = t10;
        t10.addListener(new k6.a(this));
        this.f7509b.start();
        if (z11) {
            return;
        }
        this.f7509b.end();
    }

    public abstract AnimatorSet t(View view, View view2, boolean z10, boolean z11);
}
