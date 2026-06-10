package androidx.compose.ui.graphics;

import a4.b;
import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import v0.u;
import v7.g;

/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final l<u, n> f3075j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerModifier(l<? super u, n> lVar, l<? super n0, n> lVar2) {
        super(lVar2);
        g.f(lVar2, "inspectorInfo");
        this.f3075j = lVar;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BlockGraphicsLayerModifier) {
            return g.a(this.f3075j, ((BlockGraphicsLayerModifier) obj).f3075j);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f3075j.hashCode();
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        g.f(tVar, "$this$measure");
        b0 b5 = pVar.b(j2);
        m02 = tVar.m0(b5.f12640i, b5.f12641j, kotlin.collections.d.K1(), new BlockGraphicsLayerModifier$measure$1(b5, this));
        return m02;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3075j + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return b.a(this, lVar);
    }
}
