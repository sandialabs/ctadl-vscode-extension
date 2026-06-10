package androidx.lifecycle;

import android.os.Looper;
import androidx.fragment.app.m;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import l.b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f5327k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f5328a;

    /* renamed from: b  reason: collision with root package name */
    public final l.b<w<? super T>, LiveData<T>.c> f5329b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5330d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f5331e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f5332f;

    /* renamed from: g  reason: collision with root package name */
    public int f5333g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5334h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5335i;

    /* renamed from: j  reason: collision with root package name */
    public final a f5336j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements o {

        /* renamed from: m  reason: collision with root package name */
        public final q f5337m;

        public LifecycleBoundObserver(q qVar, w<? super T> wVar) {
            super(wVar);
            this.f5337m = qVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void c() {
            this.f5337m.i0().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean e(q qVar) {
            return this.f5337m == qVar;
        }

        @Override // androidx.lifecycle.o
        public final void f(q qVar, Lifecycle.Event event) {
            q qVar2 = this.f5337m;
            Lifecycle.State state = qVar2.i0().f5413d;
            if (state == Lifecycle.State.DESTROYED) {
                LiveData.this.h(this.f5339i);
                return;
            }
            Lifecycle.State state2 = null;
            while (state2 != state) {
                a(g());
                state2 = state;
                state = qVar2.i0().f5413d;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            if (this.f5337m.i0().f5413d.compareTo(Lifecycle.State.STARTED) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f5328a) {
                obj = LiveData.this.f5332f;
                LiveData.this.f5332f = LiveData.f5327k;
            }
            LiveData.this.i(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, m.d dVar) {
            super(dVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: i  reason: collision with root package name */
        public final w<? super T> f5339i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5340j;

        /* renamed from: k  reason: collision with root package name */
        public int f5341k = -1;

        public c(w<? super T> wVar) {
            this.f5339i = wVar;
        }

        public final void a(boolean z10) {
            int i10;
            boolean z11;
            boolean z12;
            if (z10 == this.f5340j) {
                return;
            }
            this.f5340j = z10;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            LiveData liveData = LiveData.this;
            int i11 = liveData.c;
            liveData.c = i10 + i11;
            if (!liveData.f5330d) {
                liveData.f5330d = true;
                while (true) {
                    try {
                        int i12 = liveData.c;
                        if (i11 == i12) {
                            break;
                        }
                        if (i11 == 0 && i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 > 0 && i12 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            liveData.f();
                        } else if (z12) {
                            liveData.g();
                        }
                        i11 = i12;
                    } finally {
                        liveData.f5330d = false;
                    }
                }
            }
            if (this.f5340j) {
                liveData.c(this);
            }
        }

        public void c() {
        }

        public boolean e(q qVar) {
            return false;
        }

        public abstract boolean g();
    }

    public LiveData() {
        this.f5328a = new Object();
        this.f5329b = new l.b<>();
        this.c = 0;
        Object obj = f5327k;
        this.f5332f = obj;
        this.f5336j = new a();
        this.f5331e = obj;
        this.f5333g = -1;
    }

    public LiveData(T t10) {
        this.f5328a = new Object();
        this.f5329b = new l.b<>();
        this.c = 0;
        this.f5332f = f5327k;
        this.f5336j = new a();
        this.f5331e = t10;
        this.f5333g = 0;
    }

    public static void a(String str) {
        boolean z10;
        k.c.L0().f12824i.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(a4.b.m("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f5340j) {
            if (!cVar.g()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f5341k;
            int i11 = this.f5333g;
            if (i10 >= i11) {
                return;
            }
            cVar.f5341k = i11;
            cVar.f5339i.b((Object) this.f5331e);
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f5334h) {
            this.f5335i = true;
            return;
        }
        this.f5334h = true;
        do {
            this.f5335i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                l.b<w<? super T>, LiveData<T>.c> bVar = this.f5329b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f15707k.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f5335i) {
                        break;
                    }
                }
            }
        } while (this.f5335i);
        this.f5334h = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(q qVar, w<? super T> wVar) {
        a("observe");
        if (qVar.i0().f5413d == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(qVar, wVar);
        LiveData<T>.c d5 = this.f5329b.d(wVar, lifecycleBoundObserver);
        if (d5 != null && !d5.e(qVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        qVar.i0().a(lifecycleBoundObserver);
    }

    public final void e(m.d dVar) {
        a("observeForever");
        b bVar = new b(this, dVar);
        LiveData<T>.c d5 = this.f5329b.d(dVar, bVar);
        if (d5 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d5 != null) {
            return;
        }
        bVar.a(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(w<? super T> wVar) {
        a("removeObserver");
        LiveData<T>.c g10 = this.f5329b.g(wVar);
        if (g10 == null) {
            return;
        }
        g10.c();
        g10.a(false);
    }

    public abstract void i(T t10);
}
