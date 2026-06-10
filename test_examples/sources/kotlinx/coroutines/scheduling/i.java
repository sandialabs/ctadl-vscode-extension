package kotlinx.coroutines.scheduling;

import ja.y;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f15531k;

    public i(Runnable runnable, long j2, g gVar) {
        super(j2, gVar);
        this.f15531k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15531k.run();
        } finally {
            this.f15529j.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f15531k;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(y.a(runnable));
        sb.append(", ");
        sb.append(this.f15528i);
        sb.append(", ");
        sb.append(this.f15529j);
        sb.append(']');
        return sb.toString();
    }
}
