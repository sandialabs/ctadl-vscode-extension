package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.z;

/* loaded from: classes.dex */
public final class a0 extends g {
    final /* synthetic */ z this$0;

    /* loaded from: classes.dex */
    public static final class a extends g {
        final /* synthetic */ z this$0;

        public a(z zVar) {
            this.this$0 = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            v7.g.f(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            v7.g.f(activity, "activity");
            z zVar = this.this$0;
            int i10 = zVar.f5426i + 1;
            zVar.f5426i = i10;
            if (i10 == 1 && zVar.f5429l) {
                zVar.n.f(Lifecycle.Event.ON_START);
                zVar.f5429l = false;
            }
        }
    }

    public a0(z zVar) {
        this.this$0 = zVar;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        v7.g.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = b0.f5365j;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            v7.g.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((b0) findFragmentByTag).f5366i = this.this$0.f5432p;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        v7.g.f(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f5427j - 1;
        zVar.f5427j = i10;
        if (i10 == 0) {
            Handler handler = zVar.f5430m;
            v7.g.c(handler);
            handler.postDelayed(zVar.f5431o, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        v7.g.f(activity, "activity");
        z.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        v7.g.f(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f5426i - 1;
        zVar.f5426i = i10;
        if (i10 == 0 && zVar.f5428k) {
            zVar.n.f(Lifecycle.Event.ON_STOP);
            zVar.f5429l = true;
        }
    }
}
