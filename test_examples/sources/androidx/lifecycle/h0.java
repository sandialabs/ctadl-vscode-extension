package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f5392a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5393b;
    public a c;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final r f5394i;

        /* renamed from: j  reason: collision with root package name */
        public final Lifecycle.Event f5395j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5396k;

        public a(r rVar, Lifecycle.Event event) {
            v7.g.f(rVar, "registry");
            v7.g.f(event, "event");
            this.f5394i = rVar;
            this.f5395j = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f5396k) {
                return;
            }
            this.f5394i.f(this.f5395j);
            this.f5396k = true;
        }
    }

    public h0(q qVar) {
        v7.g.f(qVar, "provider");
        this.f5392a = new r(qVar);
        this.f5393b = new Handler();
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f5392a, event);
        this.c = aVar2;
        this.f5393b.postAtFrontOfQueue(aVar2);
    }
}
