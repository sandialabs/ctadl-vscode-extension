package w2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f18290a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f18291b = 10;

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: i  reason: collision with root package name */
        public final int f18292i;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f18292i = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f18292i);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f18290a, this.f18291b);
    }
}
