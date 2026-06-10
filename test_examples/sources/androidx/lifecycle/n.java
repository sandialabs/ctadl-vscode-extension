package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f5411a = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a extends g {
        @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            v7.g.f(activity, "activity");
            int i10 = b0.f5365j;
            b0.b.b(activity);
        }
    }
}
