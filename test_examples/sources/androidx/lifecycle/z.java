package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;

/* loaded from: classes.dex */
public final class z implements q {

    /* renamed from: q  reason: collision with root package name */
    public static final z f5425q = new z();

    /* renamed from: i  reason: collision with root package name */
    public int f5426i;

    /* renamed from: j  reason: collision with root package name */
    public int f5427j;

    /* renamed from: m  reason: collision with root package name */
    public Handler f5430m;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5428k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5429l = true;
    public final r n = new r(this);

    /* renamed from: o  reason: collision with root package name */
    public final androidx.activity.b f5431o = new androidx.activity.b(6, this);

    /* renamed from: p  reason: collision with root package name */
    public final b f5432p = new b();

    /* loaded from: classes.dex */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            v7.g.f(activity, "activity");
            v7.g.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements b0.a {
        public b() {
        }

        @Override // androidx.lifecycle.b0.a
        public final void a() {
            z.this.a();
        }

        @Override // androidx.lifecycle.b0.a
        public final void b() {
            z zVar = z.this;
            int i10 = zVar.f5426i + 1;
            zVar.f5426i = i10;
            if (i10 == 1 && zVar.f5429l) {
                zVar.n.f(Lifecycle.Event.ON_START);
                zVar.f5429l = false;
            }
        }

        @Override // androidx.lifecycle.b0.a
        public final void onCreate() {
        }
    }

    public final void a() {
        int i10 = this.f5427j + 1;
        this.f5427j = i10;
        if (i10 == 1) {
            if (this.f5428k) {
                this.n.f(Lifecycle.Event.ON_RESUME);
                this.f5428k = false;
                return;
            }
            Handler handler = this.f5430m;
            v7.g.c(handler);
            handler.removeCallbacks(this.f5431o);
        }
    }

    @Override // androidx.lifecycle.q
    public final r i0() {
        return this.n;
    }
}
