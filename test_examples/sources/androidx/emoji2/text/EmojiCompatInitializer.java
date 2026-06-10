package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.l;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements f4.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f4992b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4975a;

        public b(Context context) {
            this.f4975a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(final f.h hVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    switch (r4) {
                        case 0:
                            EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this;
                            f.h hVar2 = (f.h) hVar;
                            ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) threadPoolExecutor;
                            bVar.getClass();
                            try {
                                l a10 = c.a(bVar.f4975a);
                                if (a10 != null) {
                                    l.b bVar2 = (l.b) a10.f4991a;
                                    synchronized (bVar2.f5017d) {
                                        bVar2.f5019f = threadPoolExecutor2;
                                    }
                                    a10.f4991a.a(new h(hVar2, threadPoolExecutor2));
                                    return;
                                }
                                throw new RuntimeException("EmojiCompat font provider not available on this device.");
                            } catch (Throwable th) {
                                hVar2.a(th);
                                threadPoolExecutor2.shutdown();
                                return;
                            }
                        default:
                            c4.e eVar = (c4.e) hVar;
                            v7.g.f((y3.i) this, "this$0");
                            v7.g.f(eVar, "$query");
                            v7.g.f((y3.j) threadPoolExecutor, "$queryInterceptorProgram");
                            eVar.a();
                            throw null;
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                int i10 = v2.l.f18154a;
                l.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f4981j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f.a().c();
                }
                l.a.b();
            } catch (Throwable th) {
                int i11 = v2.l.f18154a;
                l.a.b();
                throw th;
            }
        }
    }

    @Override // f4.b
    public final List<Class<? extends f4.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // f4.b
    /* renamed from: c */
    public final Boolean b(Context context) {
        a aVar = new a(context);
        if (f.f4981j == null) {
            synchronized (f.f4980i) {
                if (f.f4981j == null) {
                    f.f4981j = new f(aVar);
                }
            }
        }
        d(context);
        return Boolean.TRUE;
    }

    public final void d(Context context) {
        Object obj;
        f4.a c10 = f4.a.c(context);
        c10.getClass();
        synchronized (f4.a.f10911e) {
            try {
                obj = c10.f10912a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.r i02 = ((androidx.lifecycle.q) obj).i0();
        i02.a(new androidx.lifecycle.e() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void b(androidx.lifecycle.q qVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                i02.c(this);
            }

            @Override // androidx.lifecycle.e
            public final void d(androidx.lifecycle.q qVar) {
            }

            @Override // androidx.lifecycle.e
            public final void h(androidx.lifecycle.q qVar) {
            }

            @Override // androidx.lifecycle.e
            public final void m(androidx.lifecycle.q qVar) {
            }

            @Override // androidx.lifecycle.e
            public final void onDestroy(androidx.lifecycle.q qVar) {
            }

            @Override // androidx.lifecycle.e
            public final void v(androidx.lifecycle.q qVar) {
            }
        });
    }
}
