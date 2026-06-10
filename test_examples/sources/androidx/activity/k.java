package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f466b;

    public /* synthetic */ k(Runnable runnable, int i10) {
        this.f465a = i10;
        this.f466b = runnable;
    }

    public final void onBackInvoked() {
        switch (this.f465a) {
            case 0:
            default:
                this.f466b.run();
                return;
        }
    }
}
