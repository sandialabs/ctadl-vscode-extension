package x4;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import o4.a0;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a0 f18577j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ UUID f18578k;

    public b(a0 a0Var, UUID uuid) {
        this.f18577j = a0Var;
        this.f18578k = uuid;
    }

    @Override // x4.e
    public final void b() {
        a0 a0Var = this.f18577j;
        WorkDatabase workDatabase = a0Var.c;
        workDatabase.c();
        try {
            e.a(a0Var, this.f18578k.toString());
            workDatabase.p();
            workDatabase.k();
            o4.s.a(a0Var.f16281b, a0Var.c, a0Var.f16283e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
