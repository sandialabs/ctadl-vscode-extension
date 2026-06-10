package o6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import o6.k;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class l extends k implements c0<k.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(k.a aVar) {
        k.a aVar2 = aVar;
    }

    public final l E(NotoColor notoColor) {
        p();
        this.f16374k = notoColor;
        return this;
    }

    public final l F() {
        l("loading");
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        k.a aVar = (k.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        k.a aVar = (k.a) obj;
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
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        lVar.getClass();
        NotoColor notoColor = this.f16374k;
        if (notoColor != null) {
            if (!notoColor.equals(lVar.f16374k)) {
                return false;
            }
            return true;
        } else if (lVar.f16374k == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.progress_indicator_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        int i10 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        NotoColor notoColor = this.f16374k;
        if (notoColor != null) {
            i10 = notoColor.hashCode();
        }
        return hashCode + i10;
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "ProgressIndicatorItem_{color=" + this.f16374k + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        k.a aVar = (k.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final k.a z(ViewParent viewParent) {
        return new k.a();
    }
}
