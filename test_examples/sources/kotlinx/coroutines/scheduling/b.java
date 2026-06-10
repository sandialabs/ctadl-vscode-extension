package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final b f15525l = new b();

    public b() {
        super(j.f15533b, j.c, j.f15534d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
