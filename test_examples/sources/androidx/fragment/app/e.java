package androidx.fragment.app;

import android.animation.Animator;
import v2.d;

/* loaded from: classes.dex */
public final class e implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f5135a;

    public e(Animator animator) {
        this.f5135a = animator;
    }

    @Override // v2.d.b
    public final void onCancel() {
        this.f5135a.end();
    }
}
