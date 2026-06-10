package e6;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f10668i;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10668i = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10668i.d();
    }
}
