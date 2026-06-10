package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class d implements Closeable, ja.x {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f5374i;

    public d(CoroutineContext coroutineContext) {
        v7.g.f(coroutineContext, "context");
        this.f5374i = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a1.b.r(this.f5374i, null);
    }

    @Override // ja.x
    public final CoroutineContext j() {
        return this.f5374i;
    }
}
