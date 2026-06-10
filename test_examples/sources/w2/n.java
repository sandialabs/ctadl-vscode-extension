package w2;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class n<T> implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final Callable<T> f18293i;

    /* renamed from: j  reason: collision with root package name */
    public final z2.a<T> f18294j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f18295k;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ z2.a f18296i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f18297j;

        public a(z2.a aVar, Object obj) {
            this.f18296i = aVar;
            this.f18297j = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f18296i.accept(this.f18297j);
        }
    }

    public n(Handler handler, h hVar, i iVar) {
        this.f18293i = hVar;
        this.f18294j = iVar;
        this.f18295k = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t10;
        try {
            t10 = this.f18293i.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f18295k.post(new a(this.f18294j, t10));
    }
}
