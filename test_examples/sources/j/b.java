package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p.h;
import w5.b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f12607a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12608b;
    public Object c;

    public /* synthetic */ b() {
        this.f12608b = new float[2];
        this.c = new int[1];
    }

    public abstract void c();

    public final MenuItem d(MenuItem menuItem) {
        if (menuItem instanceof t2.b) {
            t2.b bVar = (t2.b) menuItem;
            if (((h) this.f12608b) == null) {
                this.f12608b = new h();
            }
            MenuItem menuItem2 = (MenuItem) ((h) this.f12608b).getOrDefault(bVar, null);
            if (menuItem2 == null) {
                c cVar = new c((Context) this.f12607a, bVar);
                ((h) this.f12608b).put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu e(SubMenu subMenu) {
        if (subMenu instanceof t2.c) {
            t2.c cVar = (t2.c) subMenu;
            if (((h) this.c) == null) {
                this.c = new h();
            }
            SubMenu subMenu2 = (SubMenu) ((h) this.c).getOrDefault(cVar, null);
            if (subMenu2 == null) {
                g gVar = new g((Context) this.f12607a, cVar);
                ((h) this.c).put(cVar, gVar);
                return gVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public abstract void f();

    public abstract void g(b.c cVar);

    public abstract void h();

    public abstract void i();

    public abstract void j();
}
