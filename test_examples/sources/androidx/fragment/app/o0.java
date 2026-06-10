package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import t3.a;

/* loaded from: classes.dex */
public final class o0 implements androidx.lifecycle.i, b4.d, androidx.lifecycle.n0 {

    /* renamed from: i  reason: collision with root package name */
    public final Fragment f5241i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.m0 f5242j;

    /* renamed from: k  reason: collision with root package name */
    public k0.b f5243k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.lifecycle.r f5244l = null;

    /* renamed from: m  reason: collision with root package name */
    public b4.c f5245m = null;

    public o0(Fragment fragment, androidx.lifecycle.m0 m0Var) {
        this.f5241i = fragment;
        this.f5242j = m0Var;
    }

    @Override // androidx.lifecycle.n0
    public final androidx.lifecycle.m0 X() {
        b();
        return this.f5242j;
    }

    public final void a(Lifecycle.Event event) {
        this.f5244l.f(event);
    }

    public final void b() {
        if (this.f5244l == null) {
            this.f5244l = new androidx.lifecycle.r(this);
            this.f5245m = new b4.c(this);
        }
    }

    @Override // b4.d
    public final b4.b e() {
        b();
        return this.f5245m.f6385b;
    }

    @Override // androidx.lifecycle.i
    public final k0.b f() {
        Application application;
        Fragment fragment = this.f5241i;
        k0.b f10 = fragment.f();
        if (!f10.equals(fragment.X)) {
            this.f5243k = f10;
            return f10;
        }
        if (this.f5243k == null) {
            Context applicationContext = fragment.S().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f5243k = new androidx.lifecycle.f0(application, this, fragment.n);
        }
        return this.f5243k;
    }

    @Override // androidx.lifecycle.i
    public final t3.a g() {
        return a.C0224a.f17563b;
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.r i0() {
        b();
        return this.f5244l;
    }
}
