package s;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class g extends o0 implements s0.f {

    /* renamed from: j  reason: collision with root package name */
    public final AndroidEdgeEffectOverscrollEffect f17211j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, u7.l<? super n0, m7.n> lVar) {
        super(lVar);
        v7.g.f(androidEdgeEffectOverscrollEffect, "overscrollEffect");
        v7.g.f(lVar, "inspectorInfo");
        this.f17211j = androidEdgeEffectOverscrollEffect;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return v7.g.a(this.f17211j, ((g) obj).f17211j);
        }
        return false;
    }

    @Override // s0.f
    public final void f(x0.c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        v7.g.f(cVar, "<this>");
        cVar.o0();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f17211j;
        androidEdgeEffectOverscrollEffect.getClass();
        v0.o b5 = cVar.N().b();
        androidEdgeEffectOverscrollEffect.f1376k.getValue();
        Canvas canvas = v0.d.f18088a;
        v7.g.f(b5, "<this>");
        Canvas canvas2 = ((v0.c) b5).f18085a;
        EdgeEffect edgeEffect = androidEdgeEffectOverscrollEffect.f1374i;
        boolean z15 = true;
        if (m0.b.n0(edgeEffect) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            androidEdgeEffectOverscrollEffect.j(cVar, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = androidEdgeEffectOverscrollEffect.f1369d;
        if (!edgeEffect2.isFinished()) {
            z11 = androidEdgeEffectOverscrollEffect.i(cVar, edgeEffect2, canvas2);
            m0.b.S0(edgeEffect, m0.b.n0(edgeEffect2));
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect3 = androidEdgeEffectOverscrollEffect.f1372g;
        if (m0.b.n0(edgeEffect3) == 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            androidEdgeEffectOverscrollEffect.h(cVar, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = androidEdgeEffectOverscrollEffect.f1368b;
        boolean isFinished = edgeEffect4.isFinished();
        q qVar = androidEdgeEffectOverscrollEffect.f1367a;
        if (!isFinished) {
            int save = canvas2.save();
            canvas2.translate(0.0f, cVar.H(qVar.f17225b.c()));
            boolean draw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(save);
            if (!draw && !z11) {
                z11 = false;
                m0.b.S0(edgeEffect3, m0.b.n0(edgeEffect4));
            }
            z11 = true;
            m0.b.S0(edgeEffect3, m0.b.n0(edgeEffect4));
        }
        EdgeEffect edgeEffect5 = androidEdgeEffectOverscrollEffect.f1375j;
        if (m0.b.n0(edgeEffect5) == 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            androidEdgeEffectOverscrollEffect.i(cVar, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = androidEdgeEffectOverscrollEffect.f1370e;
        if (!edgeEffect6.isFinished()) {
            if (!androidEdgeEffectOverscrollEffect.j(cVar, edgeEffect6, canvas2) && !z11) {
                z11 = false;
                m0.b.S0(edgeEffect5, m0.b.n0(edgeEffect6));
            }
            z11 = true;
            m0.b.S0(edgeEffect5, m0.b.n0(edgeEffect6));
        }
        EdgeEffect edgeEffect7 = androidEdgeEffectOverscrollEffect.f1373h;
        if (m0.b.n0(edgeEffect7) == 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            int save2 = canvas2.save();
            canvas2.translate(0.0f, cVar.H(qVar.f17225b.c()));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(save2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = androidEdgeEffectOverscrollEffect.c;
        if (!edgeEffect8.isFinished()) {
            if (!androidEdgeEffectOverscrollEffect.h(cVar, edgeEffect8, canvas2) && !z11) {
                z15 = false;
            }
            m0.b.S0(edgeEffect7, m0.b.n0(edgeEffect8));
            z11 = z15;
        }
        if (z11) {
            androidEdgeEffectOverscrollEffect.k();
        }
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f17211j.hashCode();
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f17211j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
