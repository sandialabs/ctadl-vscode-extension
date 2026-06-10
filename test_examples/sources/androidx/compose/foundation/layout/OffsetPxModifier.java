package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.o0;
import b2.g;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import q0.d;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class OffsetPxModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final l<b2.b, g> f1924j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1925k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier(l lVar, l lVar2) {
        super(lVar2);
        v7.g.f(lVar2, "inspectorInfo");
        this.f1924j = lVar;
        this.f1925k = true;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxModifier offsetPxModifier = obj instanceof OffsetPxModifier ? (OffsetPxModifier) obj : null;
        return offsetPxModifier != null && v7.g.a(this.f1924j, offsetPxModifier.f1924j) && this.f1925k == offsetPxModifier.f1925k;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return (this.f1924j.hashCode() * 31) + (this.f1925k ? 1231 : 1237);
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        v7.g.f(tVar, "$this$measure");
        b0 b5 = pVar.b(j2);
        m02 = tVar.m0(b5.f12640i, b5.f12641j, kotlin.collections.d.K1(), new OffsetPxModifier$measure$1(this, tVar, b5));
        return m02;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1924j + ", rtlAware=" + this.f1925k + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
