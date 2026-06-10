package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f6111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f6112b;
    public final /* synthetic */ FragmentStateAdapter c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.c = fragmentStateAdapter;
        this.f6111a = frameLayout;
        this.f6112b = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FrameLayout frameLayout = this.f6111a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.c.x(this.f6112b);
        }
    }
}
