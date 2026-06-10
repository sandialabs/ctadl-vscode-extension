package androidx.viewpager2.adapter;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f6115i;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f6115i = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f6115i;
        fragmentStateAdapter.f6099j = false;
        fragmentStateAdapter.v();
    }
}
