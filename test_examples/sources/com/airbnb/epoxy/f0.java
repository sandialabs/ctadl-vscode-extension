package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f0 implements Executor {

    /* renamed from: i  reason: collision with root package name */
    public final Handler f6640i;

    public f0(Handler handler) {
        this.f6640i = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.f6640i;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
