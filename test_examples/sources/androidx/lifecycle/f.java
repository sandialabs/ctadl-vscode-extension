package androidx.lifecycle;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public boolean f5384b;
    public boolean c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5383a = true;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f5385d = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0012, B:12:0x0016, B:19:0x0021, B:21:0x0029), top: B:28:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (true) {
                ArrayDeque arrayDeque = this.f5385d;
                if (!(!arrayDeque.isEmpty())) {
                    break;
                }
                if (!this.f5384b && this.f5383a) {
                    z10 = false;
                    if (z10) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
        } finally {
            this.c = false;
        }
    }
}
