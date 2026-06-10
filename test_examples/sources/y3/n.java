package y3;

import java.io.File;

/* loaded from: classes.dex */
public final class n implements c4.c, b {

    /* renamed from: i  reason: collision with root package name */
    public a f18877i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18878j;

    @Override // c4.c
    public final c4.b L() {
        if (!this.f18878j) {
            c(true);
            this.f18878j = true;
        }
        throw null;
    }

    @Override // y3.b
    public final c4.c a() {
        return null;
    }

    public final void b(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void c(boolean z10) {
        if (getDatabaseName() != null) {
            throw null;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // c4.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // c4.c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // c4.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
