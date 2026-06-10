package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.unit.LayoutDirection;
import b2.g;
import b2.h;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import m7.n;
import q0.d;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class WrapContentModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final Direction f1987j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1988k;

    /* renamed from: l  reason: collision with root package name */
    public final p<h, LayoutDirection, g> f1989l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f1990m;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(Direction direction, boolean z10, p<? super h, ? super LayoutDirection, g> pVar, Object obj, l<? super n0, n> lVar) {
        super(lVar);
        this.f1987j = direction;
        this.f1988k = z10;
        this.f1989l = pVar;
        this.f1990m = obj;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WrapContentModifier) {
            WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
            return this.f1987j == wrapContentModifier.f1987j && this.f1988k == wrapContentModifier.f1988k && v7.g.a(this.f1990m, wrapContentModifier.f1990m);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f1990m.hashCode() + (((this.f1987j.hashCode() * 31) + (this.f1988k ? 1231 : 1237)) * 31);
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        int h10;
        int f10;
        r m02;
        v7.g.f(tVar, "$this$measure");
        Direction direction = Direction.Vertical;
        int i10 = 0;
        Direction direction2 = this.f1987j;
        if (direction2 != direction) {
            h10 = 0;
        } else {
            h10 = b2.a.h(j2);
        }
        Direction direction3 = Direction.Horizontal;
        if (direction2 == direction3) {
            i10 = b2.a.g(j2);
        }
        int i11 = Integer.MAX_VALUE;
        boolean z10 = this.f1988k;
        if (direction2 != direction && z10) {
            f10 = Integer.MAX_VALUE;
        } else {
            f10 = b2.a.f(j2);
        }
        if (direction2 == direction3 || !z10) {
            i11 = b2.a.e(j2);
        }
        b0 b5 = pVar.b(v8.b.b(h10, f10, i10, i11));
        int c0 = a1.c.c0(b5.f12640i, b2.a.h(j2), b2.a.f(j2));
        int c02 = a1.c.c0(b5.f12641j, b2.a.g(j2), b2.a.e(j2));
        m02 = tVar.m0(c0, c02, kotlin.collections.d.K1(), new WrapContentModifier$measure$1(this, c0, b5, c02, tVar));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
