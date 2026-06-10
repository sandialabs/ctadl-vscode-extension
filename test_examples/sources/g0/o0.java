package g0;

/* loaded from: classes.dex */
public abstract class o0<T> extends j<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u7.a<? extends T> aVar) {
        super(aVar);
        v7.g.f(aVar, "defaultFactory");
    }

    public final p0<T> b(T t10) {
        return new p0<>(this, t10, true);
    }
}
