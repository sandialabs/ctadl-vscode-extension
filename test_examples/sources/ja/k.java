package ja;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class k extends s {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(k.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(p7.c<?> cVar, Throwable th, boolean z10) {
        super(th, z10);
        if (th == null) {
            th = new CancellationException("Continuation " + cVar + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
