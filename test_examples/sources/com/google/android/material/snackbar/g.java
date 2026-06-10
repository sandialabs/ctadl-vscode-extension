package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f7341e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7342a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7343b = new Handler(Looper.getMainLooper(), new a());
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public c f7344d;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f7342a) {
                if (gVar.c == cVar || gVar.f7344d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f7346a;

        /* renamed from: b  reason: collision with root package name */
        public int f7347b;
        public boolean c;

        public c(int i10, BaseTransientBottomBar.c cVar) {
            this.f7346a = new WeakReference<>(cVar);
            this.f7347b = i10;
        }
    }

    public static g b() {
        if (f7341e == null) {
            f7341e = new g();
        }
        return f7341e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f7346a.get();
        if (bVar != null) {
            this.f7343b.removeCallbacksAndMessages(cVar);
            bVar.b(i10);
            return true;
        }
        return false;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        boolean z10;
        c cVar2 = this.c;
        if (cVar2 == null) {
            return false;
        }
        if (cVar != null && cVar2.f7346a.get() == cVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.f7342a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.c;
                    if (!cVar2.c) {
                        cVar2.c = true;
                        this.f7343b.removeCallbacksAndMessages(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.f7342a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.c;
                    if (cVar2.c) {
                        cVar2.c = false;
                        f(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(c cVar) {
        int i10 = cVar.f7347b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f7343b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
