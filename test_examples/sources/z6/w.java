package z6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.noto.R;
import z6.v;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class w extends v implements com.airbnb.epoxy.c0<v.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(v.a aVar) {
        v.a aVar2 = aVar;
    }

    public final w F() {
        l("none");
        return this;
    }

    public final w G(boolean z10) {
        p();
        this.f19164k = z10;
        return this;
    }

    public final w H(g gVar) {
        p();
        this.f19165l = gVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        v.a aVar = (v.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        v.a aVar = (v.a) obj;
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
        if (!(obj instanceof w) || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        wVar.getClass();
        if (this.f19164k != wVar.f19164k) {
            return false;
        }
        E();
        wVar.E();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.none_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        return (((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f19164k ? 1 : 0)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "NoneItem_{isSelected=" + this.f19164k + ", onClickListener=" + E() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        v.a aVar = (v.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final v.a z(ViewParent viewParent) {
        return new v.a();
    }
}
