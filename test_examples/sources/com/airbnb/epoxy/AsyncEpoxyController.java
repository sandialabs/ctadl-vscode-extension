package com.airbnb.epoxy;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public abstract class AsyncEpoxyController extends m {
    public AsyncEpoxyController() {
        this(true);
    }

    public AsyncEpoxyController(boolean z10) {
        this(z10, z10);
    }

    public AsyncEpoxyController(boolean z10, boolean z11) {
        super(getHandler(z10), getHandler(z11));
    }

    private static Handler getHandler(boolean z10) {
        if (z10) {
            if (l.c == null) {
                HandlerThread handlerThread = new HandlerThread("epoxy");
                handlerThread.start();
                l.c = l.a(handlerThread.getLooper(), true);
            }
            return l.c;
        }
        return l.f6653a;
    }
}
