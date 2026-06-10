package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class p0 extends Writer {

    /* renamed from: j  reason: collision with root package name */
    public final StringBuilder f5248j = new StringBuilder(128);

    /* renamed from: i  reason: collision with root package name */
    public final String f5247i = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f5248j;
        if (sb.length() > 0) {
            Log.d(this.f5247i, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c = cArr[i10 + i12];
            if (c == '\n') {
                a();
            } else {
                this.f5248j.append(c);
            }
        }
    }
}
