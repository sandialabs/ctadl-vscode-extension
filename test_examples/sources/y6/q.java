package y6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import y6.p;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class q extends p implements c0<p.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(p.a aVar) {
        p.a aVar2 = aVar;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        p.a aVar = (p.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        p.a aVar = (p.a) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(com.airbnb.epoxy.m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    @Override // com.airbnb.epoxy.r
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q) && super.equals(obj)) {
            q qVar = (q) obj;
            qVar.getClass();
            E();
            if (E().equals(qVar.E())) {
                F();
                qVar.F();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.new_label_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        return ((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "NewLabelItem_{color=" + E() + ", onClickListener=" + F() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        p.a aVar = (p.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final p.a z(ViewParent viewParent) {
        return new p.a();
    }
}
