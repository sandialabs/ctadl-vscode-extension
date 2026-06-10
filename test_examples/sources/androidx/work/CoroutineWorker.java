package androidx.work;

import android.content.Context;
import androidx.appcompat.widget.e1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.d;
import ja.f0;
import ja.w0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends d {

    /* renamed from: m  reason: collision with root package name */
    public final w0 f6169m;
    public final androidx.work.impl.utils.futures.a<d.a> n;

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.b f6170o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.f(context, "appContext");
        g.f(workerParameters, "params");
        this.f6169m = new w0(null);
        androidx.work.impl.utils.futures.a<d.a> aVar = new androidx.work.impl.utils.futures.a<>();
        this.n = aVar;
        aVar.a(new e1(8, this), ((y4.b) this.f6219j.f6201d).f18884a);
        this.f6170o = f0.f12766a;
    }

    @Override // androidx.work.d
    public final m6.a<n4.c> e() {
        w0 w0Var = new w0(null);
        kotlinx.coroutines.scheduling.b bVar = this.f6170o;
        bVar.getClass();
        kotlinx.coroutines.internal.e g10 = a1.b.g(CoroutineContext.DefaultImpls.a(bVar, w0Var));
        c cVar = new c(w0Var);
        m0.b.M0(g10, null, null, new CoroutineWorker$getForegroundInfoAsync$1(cVar, this, null), 3);
        return cVar;
    }

    @Override // androidx.work.d
    public final void f() {
        this.n.cancel(false);
    }

    @Override // androidx.work.d
    public final androidx.work.impl.utils.futures.a g() {
        m0.b.M0(a1.b.g(this.f6170o.m(this.f6169m)), null, null, new CoroutineWorker$startWork$1(this, null), 3);
        return this.n;
    }

    public abstract Object i(p7.c<? super d.a> cVar);
}
