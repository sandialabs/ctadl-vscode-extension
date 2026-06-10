package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b.d f596i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MenuItem f597j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f f598k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b.c f599l;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f599l = cVar;
        this.f596i = dVar;
        this.f597j = hVar;
        this.f598k = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f596i;
        if (dVar != null) {
            b.c cVar = this.f599l;
            b.this.I = true;
            dVar.f595b.c(false);
            b.this.I = false;
        }
        MenuItem menuItem = this.f597j;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f598k.q(menuItem, null, 4);
        }
    }
}
