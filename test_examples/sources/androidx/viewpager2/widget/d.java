package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f6163a;

    public d(ViewPager2 viewPager2) {
        this.f6163a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i10) {
        if (i10 == 0) {
            this.f6163a.c();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        ViewPager2 viewPager2 = this.f6163a;
        if (viewPager2.f6122l != i10) {
            viewPager2.f6122l = i10;
            viewPager2.B.b();
        }
    }
}
