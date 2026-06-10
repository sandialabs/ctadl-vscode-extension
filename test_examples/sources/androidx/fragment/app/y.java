package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f5269a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final z f5270b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final z.k f5271a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5272b = false;

        public a(z.k kVar) {
            this.f5271a = kVar;
        }
    }

    public y(z zVar) {
        this.f5270b = zVar;
    }

    public final void a(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.a(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        z zVar = this.f5270b;
        Context context = zVar.f5286p.f5263j;
        Fragment fragment = zVar.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.b(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.c(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void d(Fragment fragment, boolean z10) {
        z zVar = this.f5270b;
        Fragment fragment2 = zVar.f5288r;
        if (fragment2 != null) {
            fragment2.l().f5284m.d(fragment, true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.a(zVar, fragment);
            }
        }
    }

    public final void e(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.e(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void f(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.f(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void g(boolean z10) {
        z zVar = this.f5270b;
        Context context = zVar.f5286p.f5263j;
        Fragment fragment = zVar.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.g(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.h(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void i(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.i(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void j(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.j(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.k(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.l(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        z zVar = this.f5270b;
        Fragment fragment2 = zVar.f5288r;
        if (fragment2 != null) {
            fragment2.l().f5284m.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.b(zVar, fragment, view);
            }
        }
    }

    public final void n(boolean z10) {
        Fragment fragment = this.f5270b.f5288r;
        if (fragment != null) {
            fragment.l().f5284m.n(true);
        }
        Iterator<a> it = this.f5269a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f5272b) {
                next.f5271a.getClass();
            }
        }
    }
}
