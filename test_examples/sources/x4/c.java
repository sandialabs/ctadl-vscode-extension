package x4;

import androidx.work.impl.WorkDatabase;
import o4.a0;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a0 f18579j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f18580k = "VaultTimeout";

    public c(a0 a0Var) {
        this.f18579j = a0Var;
    }

    @Override // x4.e
    public final void b() {
        a0 a0Var = this.f18579j;
        WorkDatabase workDatabase = a0Var.c;
        workDatabase.c();
        try {
            for (String str : workDatabase.w().p(this.f18580k)) {
                e.a(a0Var, str);
            }
            workDatabase.p();
            workDatabase.k();
            o4.s.a(a0Var.f16281b, a0Var.c, a0Var.f16283e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
