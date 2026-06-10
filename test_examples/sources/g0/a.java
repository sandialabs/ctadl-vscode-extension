package g0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f11026a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11027b = new ArrayList();
    public T c;

    public a(T t10) {
        this.f11026a = t10;
        this.c = t10;
    }

    @Override // g0.c
    public final T a() {
        return this.c;
    }

    @Override // g0.c
    public final void c(T t10) {
        this.f11027b.add(this.c);
        this.c = t10;
    }

    @Override // g0.c
    public final void clear() {
        this.f11027b.clear();
        this.c = this.f11026a;
        j();
    }

    @Override // g0.c
    public final /* synthetic */ void d() {
    }

    @Override // g0.c
    public /* synthetic */ void f() {
    }

    @Override // g0.c
    public final void i() {
        ArrayList arrayList = this.f11027b;
        if (!arrayList.isEmpty()) {
            this.c = (T) arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public abstract void j();
}
