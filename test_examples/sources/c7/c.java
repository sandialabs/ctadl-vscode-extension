package c7;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import c7.b;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import com.noto.app.domain.model.Icon;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class c extends b implements c0<b.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(b.a aVar) {
        b.a aVar2 = aVar;
    }

    public final c G(Icon icon) {
        p();
        this.f6553k = icon;
        return this;
    }

    public final c H(boolean z10) {
        p();
        this.f6554l = z10;
        return this;
    }

    public final c I(com.noto.app.settings.general.a aVar) {
        p();
        this.f6555m = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        b.a aVar = (b.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        b.a aVar = (b.a) obj;
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
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        E();
        if (!E().equals(cVar.E()) || this.f6554l != cVar.f6554l) {
            return false;
        }
        F();
        cVar.F();
        return true;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.icon_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        E();
        int hashCode = E().hashCode();
        F();
        return ((((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f6554l ? 1 : 0)) * 31) + 1;
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "IconItem_{icon=" + E() + ", isSelected=" + this.f6554l + ", onClickListener=" + F() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        b.a aVar = (b.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final b.a z(ViewParent viewParent) {
        return new b.a();
    }
}
