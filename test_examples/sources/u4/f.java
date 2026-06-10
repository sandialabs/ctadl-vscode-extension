package u4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class f<T> extends h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final e f17785f;

    public f(Context context, y4.b bVar) {
        super(context, bVar);
        this.f17785f = new e(this);
    }

    @Override // u4.h
    public final void d() {
        n4.g.d().a(g.f17786a, getClass().getSimpleName().concat(": registering receiver"));
        this.f17788b.registerReceiver(this.f17785f, f());
    }

    @Override // u4.h
    public final void e() {
        n4.g.d().a(g.f17786a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f17788b.unregisterReceiver(this.f17785f);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
