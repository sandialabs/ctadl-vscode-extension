package k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12821i;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12821i) {
            case 0:
                c.L0().f12824i.f12826j.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
