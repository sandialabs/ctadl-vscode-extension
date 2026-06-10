package androidx.compose.foundation.gestures;

import androidx.activity.e;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.ui.node.NodeCoordinator;
import j1.h;
import j1.x;
import j1.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import q0.d;
import t.j;
import u0.f;
import u7.l;
import u7.p;
import x.g;

/* loaded from: classes.dex */
public final class ContentInViewModifier implements g, y, x {

    /* renamed from: i  reason: collision with root package name */
    public final ja.x f1599i;

    /* renamed from: j  reason: collision with root package name */
    public final Orientation f1600j;

    /* renamed from: k  reason: collision with root package name */
    public final j f1601k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1602l;

    /* renamed from: m  reason: collision with root package name */
    public h f1603m;
    public h n;

    /* renamed from: o  reason: collision with root package name */
    public b2.h f1604o;

    /* renamed from: p  reason: collision with root package name */
    public final d f1605p;

    public ContentInViewModifier(ja.x xVar, Orientation orientation, j jVar, boolean z10) {
        v7.g.f(xVar, "scope");
        v7.g.f(orientation, "orientation");
        v7.g.f(jVar, "scrollableState");
        this.f1599i = xVar;
        this.f1600j = orientation;
        this.f1601k = jVar;
        this.f1602l = z10;
        this.f1605p = BringIntoViewResponderKt.a(FocusedBoundsKt.a(this, new ContentInViewModifier$modifier$1(this)), this);
    }

    public static float g(float f10, float f11, float f12) {
        if ((f10 < 0.0f || f11 > f12) && (f10 >= 0.0f || f11 <= f12)) {
            float f13 = f11 - f12;
            return Math.abs(f10) < Math.abs(f13) ? f10 : f13;
        }
        return 0.0f;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    @Override // x.g
    public final Object a(u0.d dVar, p7.c<? super n> cVar) {
        Object e10 = e(dVar, c(dVar), cVar);
        return e10 == CoroutineSingletons.COROUTINE_SUSPENDED ? e10 : n.f16010a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (b2.h.b(r0.p()) < b2.h.b(r1)) goto L16;
     */
    @Override // j1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j2) {
        boolean z10;
        boolean z11;
        h hVar;
        u0.d t10;
        h hVar2 = this.n;
        b2.h hVar3 = this.f1604o;
        if (hVar3 != null) {
            long j10 = hVar3.f6346a;
            if (!b2.h.a(j10, j2)) {
                if (hVar2 != null && hVar2.P()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (this.f1600j == Orientation.Horizontal) {
                        if (((int) (hVar2.p() >> 32)) < ((int) (j10 >> 32))) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (z11 && (hVar = this.f1603m) != null && (t10 = hVar2.t(hVar, false)) != null) {
                        u0.d t11 = a1.c.t(u0.c.f17721b, v8.b.M(j10));
                        u0.d d5 = d(t10, hVar2.p());
                        boolean b5 = t11.b(t10);
                        boolean z12 = !v7.g.a(d5, t10);
                        if (b5 && z12) {
                            m0.b.M0(this.f1599i, null, null, new ContentInViewModifier$onSizeChanged$1(this, t10, d5, null), 3);
                        }
                    }
                }
            }
        }
        this.f1604o = new b2.h(j2);
    }

    @Override // x.g
    public final u0.d c(u0.d dVar) {
        v7.g.f(dVar, "localRect");
        b2.h hVar = this.f1604o;
        if (hVar != null) {
            return d(dVar, hVar.f6346a);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final u0.d d(u0.d dVar, long j2) {
        long M = v8.b.M(j2);
        int ordinal = this.f1600j.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dVar.c(g(dVar.f17726a, dVar.c, f.d(M)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return dVar.c(0.0f, g(dVar.f17727b, dVar.f17728d, f.b(M)));
    }

    public final Object e(u0.d dVar, u0.d dVar2, p7.c<? super n> cVar) {
        float f10;
        float f11;
        int ordinal = this.f1600j.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f10 = dVar.f17726a;
                f11 = dVar2.f17726a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f10 = dVar.f17727b;
            f11 = dVar2.f17727b;
        }
        float f12 = f10 - f11;
        if (this.f1602l) {
            f12 = -f12;
        }
        Object a10 = ScrollExtensionsKt.a(this.f1601k, f12, a1.c.z1(0.0f, null, 7), cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return n.f16010a;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // j1.x
    public final void o(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "coordinates");
        this.n = nodeCoordinator;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
