package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* renamed from: u  reason: collision with root package name */
    public static final m7.e<CoroutineContext> f3677u = kotlin.a.b(AndroidUiDispatcher$Companion$Main$2.f3688j);

    /* renamed from: v  reason: collision with root package name */
    public static final a f3678v = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Choreographer f3679k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f3680l;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3684q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3685r;

    /* renamed from: t  reason: collision with root package name */
    public final x f3687t;

    /* renamed from: m  reason: collision with root package name */
    public final Object f3681m = new Object();
    public final n7.g<Runnable> n = new n7.g<>();

    /* renamed from: o  reason: collision with root package name */
    public List<Choreographer.FrameCallback> f3682o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public List<Choreographer.FrameCallback> f3683p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final b f3686s = new b();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            v7.g.e(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a10 = v2.g.a(myLooper);
                v7.g.e(a10, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a10);
                return androidUiDispatcher.m(androidUiDispatcher.f3687t);
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Choreographer.FrameCallback, Runnable {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j2) {
            AndroidUiDispatcher.this.f3680l.removeCallbacks(this);
            AndroidUiDispatcher.W(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f3681m) {
                if (androidUiDispatcher.f3685r) {
                    androidUiDispatcher.f3685r = false;
                    List<Choreographer.FrameCallback> list = androidUiDispatcher.f3682o;
                    androidUiDispatcher.f3682o = androidUiDispatcher.f3683p;
                    androidUiDispatcher.f3683p = list;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).doFrame(j2);
                    }
                    list.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidUiDispatcher.W(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f3681m) {
                if (androidUiDispatcher.f3682o.isEmpty()) {
                    androidUiDispatcher.f3679k.removeFrameCallback(this);
                    androidUiDispatcher.f3685r = false;
                }
                m7.n nVar = m7.n.f16010a;
            }
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f3679k = choreographer;
        this.f3680l = handler;
        this.f3687t = new x(choreographer);
    }

    public static final void W(AndroidUiDispatcher androidUiDispatcher) {
        boolean z10;
        while (true) {
            Runnable X = androidUiDispatcher.X();
            if (X != null) {
                X.run();
            } else {
                synchronized (androidUiDispatcher.f3681m) {
                    if (androidUiDispatcher.n.isEmpty()) {
                        z10 = false;
                        androidUiDispatcher.f3684q = false;
                    } else {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        v7.g.f(coroutineContext, "context");
        v7.g.f(runnable, "block");
        synchronized (this.f3681m) {
            this.n.addLast(runnable);
            if (!this.f3684q) {
                this.f3684q = true;
                this.f3680l.post(this.f3686s);
                if (!this.f3685r) {
                    this.f3685r = true;
                    this.f3679k.postFrameCallback(this.f3686s);
                }
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    public final Runnable X() {
        Runnable removeFirst;
        Runnable runnable;
        synchronized (this.f3681m) {
            n7.g<Runnable> gVar = this.n;
            if (gVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = gVar.removeFirst();
            }
            runnable = removeFirst;
        }
        return runnable;
    }
}
