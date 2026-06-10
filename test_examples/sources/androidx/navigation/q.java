package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.x;

@x.a("navigation")
/* loaded from: classes.dex */
public final class q extends x<p> {

    /* renamed from: a  reason: collision with root package name */
    public final y f5527a;

    public q(y yVar) {
        this.f5527a = yVar;
    }

    @Override // androidx.navigation.x
    public final p a() {
        return new p(this);
    }

    @Override // androidx.navigation.x
    public final n b(n nVar, Bundle bundle, t tVar) {
        String str;
        p pVar = (p) nVar;
        int i10 = pVar.f5522r;
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
            int i11 = pVar.f5511k;
            if (i11 != 0) {
                if (pVar.f5512l == null) {
                    pVar.f5512l = Integer.toString(i11);
                }
                str = pVar.f5512l;
            } else {
                str = "the root navigation";
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        n v3 = pVar.v(i10, false);
        if (v3 == null) {
            if (pVar.f5523s == null) {
                pVar.f5523s = Integer.toString(pVar.f5522r);
            }
            throw new IllegalArgumentException(a4.b.m("navigation destination ", pVar.f5523s, " is not a direct child of this NavGraph"));
        }
        return this.f5527a.c(v3.f5509i).b(v3, v3.c(bundle), tVar);
    }

    @Override // androidx.navigation.x
    public final boolean e() {
        return true;
    }
}
