package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.fragment.app.z;

/* loaded from: classes.dex */
public final class b extends z.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f6113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f6114b;
    public final /* synthetic */ FragmentStateAdapter c;

    public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.c = fragmentStateAdapter;
        this.f6113a = fragment;
        this.f6114b = frameLayout;
    }

    @Override // androidx.fragment.app.z.k
    public final void b(z zVar, Fragment fragment, View view) {
        if (fragment == this.f6113a) {
            y yVar = zVar.f5284m;
            synchronized (yVar.f5269a) {
                int size = yVar.f5269a.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (yVar.f5269a.get(i10).f5271a == this) {
                        yVar.f5269a.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            FragmentStateAdapter fragmentStateAdapter = this.c;
            FrameLayout frameLayout = this.f6114b;
            fragmentStateAdapter.getClass();
            FragmentStateAdapter.s(view, frameLayout);
        }
    }
}
