package p0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u7.p<Set<? extends Object>, f, m7.n> f16601a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(u7.p<? super Set<? extends Object>, ? super f, m7.n> pVar) {
        this.f16601a = pVar;
    }

    @Override // p0.c
    public final void a() {
        u7.p<Set<? extends Object>, f, m7.n> pVar = this.f16601a;
        synchronized (SnapshotKt.c) {
            SnapshotKt.f2943g.remove(pVar);
            m7.n nVar = m7.n.f16010a;
        }
    }
}
