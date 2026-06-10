package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class DirectExecutor implements Executor {

    /* renamed from: i  reason: collision with root package name */
    public static final DirectExecutor f6325i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f6326j;

    static {
        DirectExecutor directExecutor = new DirectExecutor();
        f6325i = directExecutor;
        f6326j = new DirectExecutor[]{directExecutor};
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f6326j.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
