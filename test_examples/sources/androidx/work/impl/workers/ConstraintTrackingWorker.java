package androidx.work.impl.workers;

import android.content.Context;
import androidx.appcompat.widget.e1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.utils.futures.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m7.n;
import s4.c;
import v7.g;
import w4.s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/d;", "Ls4/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends d implements c {

    /* renamed from: m  reason: collision with root package name */
    public final WorkerParameters f6327m;
    public final Object n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f6328o;

    /* renamed from: p  reason: collision with root package name */
    public final a<d.a> f6329p;

    /* renamed from: q  reason: collision with root package name */
    public d f6330q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.f(context, "appContext");
        g.f(workerParameters, "workerParameters");
        this.f6327m = workerParameters;
        this.n = new Object();
        this.f6329p = new a<>();
    }

    @Override // s4.c
    public final void b(ArrayList arrayList) {
        g.f(arrayList, "workSpecs");
        n4.g d5 = n4.g.d();
        String str = z4.a.f19117a;
        d5.a(str, "Constraints changed for " + arrayList);
        synchronized (this.n) {
            this.f6328o = true;
            n nVar = n.f16010a;
        }
    }

    @Override // s4.c
    public final void d(List<s> list) {
    }

    @Override // androidx.work.d
    public final void f() {
        d dVar = this.f6330q;
        if (dVar != null && !dVar.f6220k) {
            dVar.h();
        }
    }

    @Override // androidx.work.d
    public final a g() {
        this.f6219j.c.execute(new e1(10, this));
        a<d.a> aVar = this.f6329p;
        g.e(aVar, "future");
        return aVar;
    }
}
