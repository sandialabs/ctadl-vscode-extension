package ja;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<k0> f12787a = new ThreadLocal<>();

    public static k0 a() {
        ThreadLocal<k0> threadLocal = f12787a;
        k0 k0Var = threadLocal.get();
        if (k0Var == null) {
            e eVar = new e(Thread.currentThread());
            threadLocal.set(eVar);
            return eVar;
        }
        return k0Var;
    }
}
