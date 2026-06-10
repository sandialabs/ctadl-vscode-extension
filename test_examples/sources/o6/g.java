package o6;

import android.annotation.SuppressLint;
import android.view.ViewParent;
import com.airbnb.epoxy.c0;
import com.airbnb.epoxy.m;
import com.airbnb.epoxy.r;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import o6.f;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public final class g extends f implements c0<f.a> {
    @Override // com.airbnb.epoxy.z
    public final /* bridge */ /* synthetic */ void C(f.a aVar) {
        f.a aVar2 = aVar;
    }

    public final g F(NotoColor notoColor) {
        p();
        this.f16367m = notoColor;
        return this;
    }

    public final g G(w6.i iVar) {
        p();
        this.f16368o = iVar;
        return this;
    }

    public final g H(String str) {
        p();
        v7.g.f(str, "<set-?>");
        this.f16365k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.c0
    public final void a(Object obj, int i10) {
        f.a aVar = (f.a) obj;
        v("The model was changed between being added to the controller and being bound.", i10);
    }

    @Override // com.airbnb.epoxy.c0
    public final void b(int i10, Object obj) {
        f.a aVar = (f.a) obj;
        v("The model was changed during the bind call.", i10);
    }

    @Override // com.airbnb.epoxy.r
    public final void c(m mVar) {
        mVar.addInternal(this);
        d(mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r5.f16367m != null) goto L22;
     */
    @Override // com.airbnb.epoxy.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        E();
        if (!E().equals(gVar.E()) || this.f16366l != gVar.f16366l) {
            return false;
        }
        NotoColor notoColor = this.f16367m;
        if (notoColor != null) {
            if (!notoColor.equals(gVar.f16367m)) {
                return false;
            }
            if (this.n == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gVar.n == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
            if (this.f16368o == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (gVar.f16368o == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 != z13) {
                return false;
            }
            if (this.f16369p == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (gVar.f16369p == null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z14 == z15) {
                return true;
            }
            return false;
        }
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        return R.layout.header_item;
    }

    @Override // com.airbnb.epoxy.r
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        E();
        int hashCode = (((E().hashCode() + (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31)) * 31) + (this.f16366l ? 1 : 0)) * 31;
        NotoColor notoColor = this.f16367m;
        if (notoColor != null) {
            i10 = notoColor.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (hashCode + i10) * 31;
        if (this.n != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f16368o != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        if (this.f16369p != null) {
            i13 = 1;
        }
        return i16 + i13;
    }

    @Override // com.airbnb.epoxy.r
    public final r k(long j2) {
        super.k(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.r
    public final String toString() {
        return "HeaderItem_{title=" + E() + ", isVisible=" + this.f16366l + ", color=" + this.f16367m + ", onClickListener=" + this.n + ", onLongClickListener=" + this.f16368o + ", onCreateClickListener=" + this.f16369p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        f.a aVar = (f.a) obj;
    }

    @Override // com.airbnb.epoxy.z
    public final f.a z(ViewParent viewParent) {
        return new f.a();
    }
}
