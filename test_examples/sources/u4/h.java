package u4;

import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y4.a f17787a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17788b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<s4.a<T>> f17789d;

    /* renamed from: e  reason: collision with root package name */
    public T f17790e;

    public h(Context context, y4.b bVar) {
        this.f17787a = bVar;
        Context applicationContext = context.getApplicationContext();
        v7.g.e(applicationContext, "context.applicationContext");
        this.f17788b = applicationContext;
        this.c = new Object();
        this.f17789d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(t4.c cVar) {
        v7.g.f(cVar, "listener");
        synchronized (this.c) {
            if (this.f17789d.remove(cVar) && this.f17789d.isEmpty()) {
                e();
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    public final void c(T t10) {
        synchronized (this.c) {
            T t11 = this.f17790e;
            if (t11 != null && v7.g.a(t11, t10)) {
                return;
            }
            this.f17790e = t10;
            ((y4.b) this.f17787a).c.execute(new p2.g(kotlin.collections.c.L2(this.f17789d), 4, this));
            m7.n nVar = m7.n.f16010a;
        }
    }

    public abstract void d();

    public abstract void e();
}
