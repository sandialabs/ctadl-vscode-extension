package l1;

import androidx.compose.ui.platform.o0;
import q0.d;
import q0.d.c;

/* loaded from: classes.dex */
public abstract class t<N extends d.c> extends o0 implements d.b {
    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public abstract N c();

    public abstract d.c d();

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        v7.g.f(obj, "b");
        if (t.class != obj.getClass()) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        t tVar = (t) obj;
        return v7.g.a(null, null);
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
