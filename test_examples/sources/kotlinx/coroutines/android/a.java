package kotlinx.coroutines.android;

import a1.b;
import android.os.Handler;
import android.os.Looper;
import ja.b1;
import ja.d1;
import ja.f0;
import ja.h0;
import ja.j;
import java.util.concurrent.CancellationException;
import ka.d;
import ka.e;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.l;
import v7.g;

/* loaded from: classes.dex */
public final class a extends e {
    private volatile a _immediate;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f15164k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15165l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15166m;
    public final a n;

    public a() {
        throw null;
    }

    public a(Handler handler) {
        this(handler, null, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f15164k.post(runnable)) {
            return;
        }
        X(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean V(CoroutineContext coroutineContext) {
        if (this.f15166m && g.a(Looper.myLooper(), this.f15164k.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // ja.b1
    public final b1 W() {
        return this.n;
    }

    public final void X(CoroutineContext coroutineContext, Runnable runnable) {
        b.r(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        f0.f12767b.T(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f15164k == this.f15164k;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f15164k);
    }

    @Override // ka.e, ja.b0
    public final h0 j(long j2, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f15164k.postDelayed(runnable, j2)) {
            return new h0() { // from class: ka.c
                @Override // ja.h0
                public final void a() {
                    kotlinx.coroutines.android.a.this.f15164k.removeCallbacks(runnable);
                }
            };
        }
        X(coroutineContext, runnable);
        return d1.f12762i;
    }

    @Override // ja.b1, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        b1 b1Var;
        String str;
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        b1 b1Var2 = l.f15491a;
        if (this == b1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                b1Var = b1Var2.W();
            } catch (UnsupportedOperationException unused) {
                b1Var = null;
            }
            if (this == b1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f15165l;
            if (str2 == null) {
                str2 = this.f15164k.toString();
            }
            if (this.f15166m) {
                return a4.b.l(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // ja.b0
    public final void v(long j2, j jVar) {
        d dVar = new d(jVar, this);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f15164k.postDelayed(dVar, j2)) {
            jVar.x(new HandlerContext$scheduleResumeAfterDelay$1(this, dVar));
        } else {
            X(jVar.f12777m, dVar);
        }
    }

    public a(Handler handler, String str, boolean z10) {
        this.f15164k = handler;
        this.f15165l = str;
        this.f15166m = z10;
        this._immediate = z10 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.n = aVar;
    }
}
