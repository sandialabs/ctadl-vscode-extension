package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n.f f5976i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f5977j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n f5978k;

    public o(n nVar, n.f fVar, int i10) {
        this.f5978k = nVar;
        this.f5976i = fVar;
        this.f5977j = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f5978k;
        RecyclerView recyclerView = nVar.f5947r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            n.f fVar = this.f5976i;
            if (!fVar.f5973k) {
                RecyclerView.b0 b0Var = fVar.f5967e;
                if (b0Var.c() != -1) {
                    RecyclerView.i itemAnimator = nVar.f5947r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.l()) {
                        ArrayList arrayList = nVar.f5945p;
                        int size = arrayList.size();
                        boolean z10 = false;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            } else if (!((n.f) arrayList.get(i10)).f5974l) {
                                z10 = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (!z10) {
                            nVar.f5943m.o(b0Var, this.f5977j);
                            return;
                        }
                    }
                    nVar.f5947r.post(this);
                }
            }
        }
    }
}
