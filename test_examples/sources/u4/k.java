package u4;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class k extends h<s4.b> {

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f17793f;

    /* renamed from: g  reason: collision with root package name */
    public final j f17794g;

    public k(Context context, y4.b bVar) {
        super(context, bVar);
        Object systemService = this.f17788b.getSystemService("connectivity");
        v7.g.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f17793f = (ConnectivityManager) systemService;
        this.f17794g = new j(this);
    }

    @Override // u4.h
    public final s4.b a() {
        return l.a(this.f17793f);
    }

    @Override // u4.h
    public final void d() {
        n4.g d5;
        try {
            n4.g.d().a(l.f17795a, "Registering network callback");
            x4.k.a(this.f17793f, this.f17794g);
        } catch (IllegalArgumentException e10) {
            e = e10;
            d5 = n4.g.d();
            d5.c(l.f17795a, "Received exception while registering network callback", e);
        } catch (SecurityException e11) {
            e = e11;
            d5 = n4.g.d();
            d5.c(l.f17795a, "Received exception while registering network callback", e);
        }
    }

    @Override // u4.h
    public final void e() {
        n4.g d5;
        try {
            n4.g.d().a(l.f17795a, "Unregistering network callback");
            x4.i.c(this.f17793f, this.f17794g);
        } catch (IllegalArgumentException e10) {
            e = e10;
            d5 = n4.g.d();
            d5.c(l.f17795a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e11) {
            e = e11;
            d5 = n4.g.d();
            d5.c(l.f17795a, "Received exception while unregistering network callback", e);
        }
    }
}
