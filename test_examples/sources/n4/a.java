package n4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f16073a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16074b;

    public a(boolean z10) {
        this.f16074b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f16074b ? "WM.task-" : "androidx.work-";
        return new Thread(runnable, str + this.f16073a.incrementAndGet());
    }
}
