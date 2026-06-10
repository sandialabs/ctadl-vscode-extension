package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class z implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6000a;

    public z(RecyclerView recyclerView) {
        this.f6000a = recyclerView;
    }

    public final int a() {
        return this.f6000a.getChildCount();
    }

    public final void b(int i10) {
        RecyclerView recyclerView = this.f6000a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
