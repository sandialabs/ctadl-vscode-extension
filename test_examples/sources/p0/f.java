package p0;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import g0.e1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public SnapshotIdSet f16602a;

    /* renamed from: b  reason: collision with root package name */
    public int f16603b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f16604d;

    /* loaded from: classes.dex */
    public static final class a {
        public static e a(u7.p pVar) {
            SnapshotKt.f(SnapshotKt.f2938a);
            synchronized (SnapshotKt.c) {
                SnapshotKt.f2943g.add(pVar);
            }
            return new e(pVar);
        }
    }

    public f(int i10, SnapshotIdSet snapshotIdSet) {
        int a10;
        this.f16602a = snapshotIdSet;
        this.f16603b = i10;
        int i11 = -1;
        if (i10 != 0) {
            SnapshotIdSet e10 = e();
            u7.l<SnapshotIdSet, m7.n> lVar = SnapshotKt.f2938a;
            v7.g.f(e10, "invalid");
            int[] iArr = e10.f2932l;
            int i12 = 0;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                int i13 = e10.f2931k;
                long j2 = e10.f2930j;
                if (j2 == 0) {
                    j2 = e10.f2929i;
                    i13 = j2 != 0 ? i13 + 64 : i13;
                }
                if ((4294967295L & j2) == 0) {
                    i12 = 32;
                    j2 >>= 32;
                }
                if ((65535 & j2) == 0) {
                    i12 += 16;
                    j2 >>= 16;
                }
                if ((255 & j2) == 0) {
                    i12 += 8;
                    j2 >>= 8;
                }
                if ((15 & j2) == 0) {
                    i12 += 4;
                    j2 >>= 4;
                }
                if ((1 & j2) != 0) {
                    i11 = i12;
                } else if ((2 & j2) != 0) {
                    i11 = i12 + 1;
                } else if ((4 & j2) != 0) {
                    i11 = i12 + 2;
                } else if ((j2 & 8) != 0) {
                    i11 = i12 + 3;
                }
                i10 = i11 + i13;
            }
            synchronized (SnapshotKt.c) {
                a10 = SnapshotKt.f2942f.a(i10);
            }
            i11 = a10;
        }
        this.f16604d = i11;
    }

    public static void o(f fVar) {
        SnapshotKt.f2939b.g(fVar);
    }

    public final void a() {
        synchronized (SnapshotKt.c) {
            b();
            n();
            m7.n nVar = m7.n.f16010a;
        }
    }

    public void b() {
        SnapshotKt.f2940d = SnapshotKt.f2940d.d(d());
    }

    public void c() {
        this.c = true;
        synchronized (SnapshotKt.c) {
            int i10 = this.f16604d;
            if (i10 >= 0) {
                SnapshotKt.q(i10);
                this.f16604d = -1;
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    public int d() {
        return this.f16603b;
    }

    public SnapshotIdSet e() {
        return this.f16602a;
    }

    public abstract u7.l<Object, m7.n> f();

    public abstract boolean g();

    public abstract u7.l<Object, m7.n> h();

    public final f i() {
        e1 e1Var = SnapshotKt.f2939b;
        f fVar = (f) e1Var.d();
        e1Var.g(this);
        return fVar;
    }

    public abstract void j(f fVar);

    public abstract void k(f fVar);

    public abstract void l();

    public abstract void m(w wVar);

    public void n() {
        int i10 = this.f16604d;
        if (i10 >= 0) {
            SnapshotKt.q(i10);
            this.f16604d = -1;
        }
    }

    public void p(int i10) {
        this.f16603b = i10;
    }

    public void q(SnapshotIdSet snapshotIdSet) {
        v7.g.f(snapshotIdSet, "<set-?>");
        this.f16602a = snapshotIdSet;
    }

    public abstract f r(u7.l<Object, m7.n> lVar);
}
