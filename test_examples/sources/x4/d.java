package x4;

import androidx.work.impl.WorkDatabase;
import o4.a0;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a0 f18581j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f18582k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f18583l = false;

    public d(a0 a0Var, String str) {
        this.f18581j = a0Var;
        this.f18582k = str;
    }

    @Override // x4.e
    public final void b() {
        a0 a0Var = this.f18581j;
        WorkDatabase workDatabase = a0Var.c;
        workDatabase.c();
        try {
            for (String str : workDatabase.w().f(this.f18582k)) {
                e.a(a0Var, str);
            }
            workDatabase.p();
            workDatabase.k();
            if (this.f18583l) {
                o4.s.a(a0Var.f16281b, a0Var.c, a0Var.f16283e);
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
