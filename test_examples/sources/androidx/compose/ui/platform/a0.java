package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a0 extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<c2.a, LayoutNode> f3820i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<LayoutNode, c2.a> f3821j;

    public a0(Context context) {
        super(context);
        setClipChildren(false);
        this.f3820i = new HashMap<>();
        this.f3821j = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<c2.a, LayoutNode> getHolderToLayoutNode() {
        return this.f3820i;
    }

    public final HashMap<LayoutNode, c2.a> getLayoutNodeToHolder() {
        return this.f3821j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
        v7.g.f(view, "child");
        v7.g.f(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<c2.a> keySet = this.f3820i.keySet();
        v7.g.e(keySet, "holderToLayoutNode.keys");
        for (c2.a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                z11 = false;
            }
            if (z11) {
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                Set<c2.a> keySet = this.f3820i.keySet();
                v7.g.e(keySet, "holderToLayoutNode.keys");
                for (c2.a aVar : keySet) {
                    int i13 = aVar.f6525r;
                    if (i13 != Integer.MIN_VALUE && (i12 = aVar.f6526s) != Integer.MIN_VALUE) {
                        aVar.measure(i13, i12);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutNode layoutNode = this.f3820i.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.b bVar = LayoutNode.S;
                layoutNode.M(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
