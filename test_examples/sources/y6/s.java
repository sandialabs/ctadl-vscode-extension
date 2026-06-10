package y6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.noto.R;
import y6.r;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class s extends r implements c0<r.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(r.a aVar) {
        r.a aVar2 = aVar;
    }

    public final s G(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        r.a aVar = (r.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        r.a aVar = (r.a) obj;
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
        if ((obj instanceof s) && super.equals(obj)) {
            s sVar = (s) obj;
            sVar.getClass();
            F();
            if (F().equals(sVar.F())) {
                E();
                return E().equals(sVar.E());
            }
            return false;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.note_label_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        F();
        int hashCode = F().hashCode();
        E();
        return E().hashCode() + ((hashCode + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31);
    }

    @Override // com.airbnb.epoxy.r
    public final com.airbnb.epoxy.r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "NoteLabelItem_{label=" + F() + ", color=" + E() + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        r.a aVar = (r.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final r.a z(ViewParent viewParent) {
        return new r.a();
    }
}
