package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.j1;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l extends f.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f5014d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5015a;

        /* renamed from: b  reason: collision with root package name */
        public final w2.e f5016b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f5017d;

        /* renamed from: e  reason: collision with root package name */
        public Handler f5018e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f5019f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f5020g;

        /* renamed from: h  reason: collision with root package name */
        public f.h f5021h;

        public b(Context context, w2.e eVar) {
            a aVar = l.f5014d;
            this.f5017d = new Object();
            if (context != null) {
                this.f5015a = context.getApplicationContext();
                this.f5016b = eVar;
                this.c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            synchronized (this.f5017d) {
                this.f5021h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f5017d) {
                this.f5021h = null;
                Handler handler = this.f5018e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5018e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5020g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5019f = null;
                this.f5020g = null;
            }
        }

        public final void c() {
            synchronized (this.f5017d) {
                if (this.f5021h == null) {
                    return;
                }
                if (this.f5019f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5020g = threadPoolExecutor;
                    this.f5019f = threadPoolExecutor;
                }
                this.f5019f.execute(new j1(3, this));
            }
        }

        public final w2.l d() {
            try {
                a aVar = this.c;
                Context context = this.f5015a;
                w2.e eVar = this.f5016b;
                aVar.getClass();
                w2.k a10 = w2.d.a(context, eVar);
                int i10 = a10.f18284a;
                if (i10 == 0) {
                    w2.l[] lVarArr = a10.f18285b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(a4.b.i("fetchFonts failed (", i10, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public l(Context context, w2.e eVar) {
        super(new b(context, eVar));
    }
}
