package androidx.biometric;

import androidx.biometric.BiometricPrompt;
import androidx.work.d;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import o4.d0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f1190i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f1191j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f1192k;

    public /* synthetic */ f(Object obj, int i10, Object obj2) {
        this.f1190i = i10;
        this.f1191j = obj;
        this.f1192k = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1190i) {
            case 0:
                BiometricPrompt.b bVar = (BiometricPrompt.b) this.f1192k;
                n nVar = ((k) this.f1191j).f1203d0;
                if (nVar.f1213e == null) {
                    nVar.f1213e = new m();
                }
                nVar.f1213e.a(bVar);
                return;
            case 1:
                m6.a aVar = (m6.a) this.f1192k;
                if (((d0) this.f1191j).f16309x.f6306i instanceof AbstractFuture.b) {
                    aVar.cancel(true);
                    return;
                }
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1191j;
                m6.a<? extends d.a> aVar2 = (m6.a) this.f1192k;
                v7.g.f(constraintTrackingWorker, "this$0");
                v7.g.f(aVar2, "$innerFuture");
                synchronized (constraintTrackingWorker.n) {
                    if (constraintTrackingWorker.f6328o) {
                        androidx.work.impl.utils.futures.a<d.a> aVar3 = constraintTrackingWorker.f6329p;
                        v7.g.e(aVar3, "future");
                        String str = z4.a.f19117a;
                        aVar3.i(new d.a.b());
                    } else {
                        constraintTrackingWorker.f6329p.k(aVar2);
                    }
                    m7.n nVar2 = m7.n.f16010a;
                }
                return;
        }
    }
}
