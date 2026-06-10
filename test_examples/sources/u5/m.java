package u5;

import a3.b1;
import a3.j0;
import a3.v0;
import android.view.View;
import java.util.WeakHashMap;
import u5.n;

/* loaded from: classes.dex */
public final class m implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f17825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f17826b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n.b f17827d;

    public m(boolean z10, boolean z11, boolean z12, h5.a aVar) {
        this.f17825a = z10;
        this.f17826b = z11;
        this.c = z12;
        this.f17827d = aVar;
    }

    @Override // u5.n.b
    public final b1 a(View view, b1 b1Var, n.c cVar) {
        if (this.f17825a) {
            cVar.f17832d = b1Var.c() + cVar.f17832d;
        }
        boolean e10 = n.e(view);
        if (this.f17826b) {
            if (e10) {
                cVar.c = b1Var.d() + cVar.c;
            } else {
                cVar.f17830a = b1Var.d() + cVar.f17830a;
            }
        }
        if (this.c) {
            if (e10) {
                cVar.f17830a = b1Var.e() + cVar.f17830a;
            } else {
                cVar.c = b1Var.e() + cVar.c;
            }
        }
        int i10 = cVar.f17830a;
        int i11 = cVar.c;
        int i12 = cVar.f17832d;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.e.k(view, i10, cVar.f17831b, i11, i12);
        n.b bVar = this.f17827d;
        if (bVar != null) {
            return bVar.a(view, b1Var, cVar);
        }
        return b1Var;
    }
}
