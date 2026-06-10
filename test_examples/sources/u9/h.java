package u9;

import java.util.Iterator;
import l8.u;
import l8.v;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final v f17928a;

    public h(v vVar) {
        v7.g.f(vVar, "packageFragmentProvider");
        this.f17928a = vVar;
    }

    @Override // u9.c
    public final b a(h9.b bVar) {
        b a10;
        v7.g.f(bVar, "classId");
        h9.c h10 = bVar.h();
        v7.g.e(h10, "classId.packageFqName");
        Iterator it = m0.b.T0(this.f17928a, h10).iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if ((uVar instanceof i) && (a10 = ((i) uVar).M0().a(bVar)) != null) {
                return a10;
            }
        }
        return null;
    }
}
