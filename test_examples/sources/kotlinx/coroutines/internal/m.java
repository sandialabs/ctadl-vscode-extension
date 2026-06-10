package kotlinx.coroutines.internal;

import ja.y;

/* loaded from: classes.dex */
public abstract class m {
    public abstract c<?> a();

    public final boolean b(m mVar) {
        c<?> a10;
        c<?> a11 = a();
        return (a11 == null || (a10 = mVar.a()) == null || a11.g() >= a10.g()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return getClass().getSimpleName() + '@' + y.a(this);
    }
}
