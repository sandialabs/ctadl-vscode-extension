package e7;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import e7.a;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class b extends a implements c0<a.C0111a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(a.C0111a c0111a) {
        a.C0111a c0111a2 = c0111a;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        a.C0111a c0111a = (a.C0111a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        a.C0111a c0111a = (a.C0111a) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    @Override // com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b) && super.equals(obj)) {
            b bVar = (b) obj;
            bVar.getClass();
            E();
            return E().equals(bVar.E());
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.release_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        return E().hashCode() + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31);
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "ReleaseItem_{release=" + E() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        a.C0111a c0111a = (a.C0111a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final a.C0111a z(ViewParent viewParent) {
        return new a.C0111a();
    }
}
