package z6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.noto.R;
import z6.a;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class c extends a implements com.airbnb.epoxy.c0<a.C0250a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(a.C0250a c0250a) {
        a.C0250a c0250a2 = c0250a;
    }

    public final c F() {
        l("all_folders");
        return this;
    }

    public final c G(boolean z10) {
        p();
        this.f19121k = z10;
        return this;
    }

    public final c H(x xVar) {
        p();
        this.f19122l = xVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        a.C0250a c0250a = (a.C0250a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        a.C0250a c0250a = (a.C0250a) obj;
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
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        if (this.f19121k != cVar.f19121k) {
            return false;
        }
        E();
        cVar.E();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.all_folders_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        return (((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f19121k ? 1 : 0)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "AllFoldersItem_{isSelected=" + this.f19121k + ", onClickListener=" + E() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        a.C0250a c0250a = (a.C0250a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final a.C0250a z(ViewParent viewParent) {
        return new a.C0250a();
    }
}
