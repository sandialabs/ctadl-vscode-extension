package androidx.compose.material3;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import g0.d;
import g0.s;
import g0.t0;
import g0.z0;
import m7.n;
import r.a0;
import r.e;
import u.f;
import u.h;
import u.j;
import u.m;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f2602a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2603b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2604d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2605e;

    public b(float f10, float f11, float f12, float f13, float f14) {
        this.f2602a = f10;
        this.f2603b = f11;
        this.c = f12;
        this.f2604d = f13;
        this.f2605e = f14;
    }

    public final e a(boolean z10, j jVar, g0.d dVar, int i10) {
        float f10;
        b2.d dVar2;
        p buttonElevation$animateElevation$3;
        dVar.f(-1312510462);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar.f(-492369756);
        Object g10 = dVar.g();
        Object obj = d.a.f11039a;
        if (g10 == obj) {
            g10 = new SnapshotStateList();
            dVar.q(g10);
        }
        dVar.u();
        SnapshotStateList snapshotStateList = (SnapshotStateList) g10;
        dVar.f(511388516);
        boolean z11 = dVar.z(jVar) | dVar.z(snapshotStateList);
        Object g11 = dVar.g();
        if (z11 || g11 == obj) {
            g11 = new ButtonElevation$animateElevation$1$1(jVar, snapshotStateList, null);
            dVar.q(g11);
        }
        dVar.u();
        s.c(jVar, (p) g11, dVar);
        h hVar = (h) kotlin.collections.c.w2(snapshotStateList);
        if (!z10) {
            f10 = this.f2605e;
        } else if (hVar instanceof m) {
            f10 = this.f2603b;
        } else if (hVar instanceof f) {
            f10 = this.f2604d;
        } else if (hVar instanceof u.d) {
            f10 = this.c;
        } else {
            f10 = this.f2602a;
        }
        float f11 = f10;
        dVar.f(-492369756);
        Object g12 = dVar.g();
        if (g12 == obj) {
            b2.d dVar3 = new b2.d(f11);
            a0 a0Var = VectorConvertersKt.c;
            g.f(a0Var, "typeConverter");
            g12 = new androidx.compose.animation.core.a(dVar3, a0Var, null, "Animatable");
            dVar.q(g12);
        }
        dVar.u();
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) g12;
        if (!z10) {
            dVar.f(-719929912);
            dVar2 = new b2.d(f11);
            buttonElevation$animateElevation$3 = new ButtonElevation$animateElevation$2(aVar, f11, null);
        } else {
            dVar.f(-719929769);
            dVar2 = new b2.d(f11);
            buttonElevation$animateElevation$3 = new ButtonElevation$animateElevation$3(aVar, this, f11, hVar, null);
        }
        s.c(dVar2, buttonElevation$animateElevation$3, dVar);
        dVar.u();
        e<T, V> eVar = aVar.c;
        dVar.u();
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            return b2.d.a(this.f2602a, bVar.f2602a) && b2.d.a(this.f2603b, bVar.f2603b) && b2.d.a(this.c, bVar.c) && b2.d.a(this.f2604d, bVar.f2604d) && b2.d.a(this.f2605e, bVar.f2605e);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2605e) + androidx.activity.e.e(this.f2604d, androidx.activity.e.e(this.c, androidx.activity.e.e(this.f2603b, Float.floatToIntBits(this.f2602a) * 31, 31), 31), 31);
    }
}
