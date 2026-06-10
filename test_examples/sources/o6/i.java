package o6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import o6.h;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class i extends h implements c0<h.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(h.a aVar) {
        h.a aVar2 = aVar;
    }

    public final i E() {
        l("placeholder");
        return this;
    }

    public final i F(String str) {
        p();
        this.f16371k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        h.a aVar = (h.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        h.a aVar = (h.a) obj;
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
        if ((obj instanceof i) && super.equals(obj)) {
            i iVar = (i) obj;
            iVar.getClass();
            D();
            return D().equals(iVar.D());
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.placeholder_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        D();
        return D().hashCode() + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31);
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "PlaceholderItem_{placeholder=" + D() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        h.a aVar = (h.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final h.a z(ViewParent viewParent) {
        return new h.a();
    }
}
