package androidx.compose.material3;

import androidx.activity.e;
import b2.f;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class MinimumTouchTargetModifier implements k {

    /* renamed from: i  reason: collision with root package name */
    public final long f2335i;

    public MinimumTouchTargetModifier(long j2) {
        this.f2335i = j2;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier;
        if (obj instanceof MinimumTouchTargetModifier) {
            minimumTouchTargetModifier = (MinimumTouchTargetModifier) obj;
        } else {
            minimumTouchTargetModifier = null;
        }
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        int i10 = f.c;
        if (this.f2335i != minimumTouchTargetModifier.f2335i) {
            return false;
        }
        return true;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        int i10 = f.c;
        long j2 = this.f2335i;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        g.f(tVar, "$this$measure");
        b0 b5 = pVar.b(j2);
        int i10 = b5.f12640i;
        long j10 = this.f2335i;
        int max = Math.max(i10, tVar.a0(f.b(j10)));
        int max2 = Math.max(b5.f12641j, tVar.a0(f.a(j10)));
        m02 = tVar.m0(max, max2, kotlin.collections.d.K1(), new MinimumTouchTargetModifier$measure$1(max, max2, b5));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
