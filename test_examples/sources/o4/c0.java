package o4;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.work.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import n4.g;

/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f16292i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d0 f16293j;

    public c0(d0 d0Var, String str) {
        this.f16293j = d0Var;
        this.f16292i = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f16292i;
        d0 d0Var = this.f16293j;
        try {
            try {
                d.a aVar = d0Var.f16309x.get();
                if (aVar == null) {
                    n4.g.d().b(d0.f16294z, d0Var.f16298l.c + " returned a null result. Treating it as a failure.");
                } else {
                    n4.g.d().a(d0.f16294z, d0Var.f16298l.c + " returned a " + aVar + ".");
                    d0Var.f16300o = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                n4.g.d().c(d0.f16294z, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e11) {
                n4.g d5 = n4.g.d();
                String str2 = d0.f16294z;
                String str3 = str + " was cancelled";
                if (((g.a) d5).c <= 4) {
                    Log.i(str2, str3, e11);
                }
            } catch (ExecutionException e12) {
                e = e12;
                n4.g.d().c(d0.f16294z, str + " failed because it threw an exception/error", e);
            }
            d0Var.b();
        } catch (Throwable th) {
            d0Var.b();
            throw th;
        }
    }
}
