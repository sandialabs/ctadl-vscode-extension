package w2;

import p2.f;
import q2.e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ma.i f18262i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f18263j;

    public b(ma.i iVar, int i10) {
        this.f18262i = iVar;
        this.f18263j = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f18262i).f16879y;
        if (eVar != null) {
            eVar.c(this.f18263j);
        }
    }
}
