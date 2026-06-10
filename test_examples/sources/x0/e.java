package x0;

import androidx.datastore.preferences.protobuf.k;
import v0.m;
import v0.s;
import v0.w;
import v0.z;

/* loaded from: classes.dex */
public final /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f18559a = 0;

    static {
        int i10 = f.f18560h;
    }

    public static long a(long j2, long j10) {
        return a1.c.v(u0.f.d(j2) - u0.c.b(j10), u0.f.b(j2) - u0.c.c(j10));
    }

    public static void b(f fVar, w wVar, long j2, long j10, long j11, float f10, s sVar, int i10, int i11) {
        long j12;
        long j13;
        long j14;
        long j15;
        float f11;
        h hVar;
        s sVar2;
        int i12;
        int i13;
        if ((i11 & 2) != 0) {
            j12 = b2.g.f6344b;
        } else {
            j12 = j2;
        }
        if ((i11 & 4) != 0) {
            j13 = v8.b.f(wVar.b(), wVar.a());
        } else {
            j13 = j10;
        }
        if ((i11 & 8) != 0) {
            j14 = b2.g.f6344b;
        } else {
            j14 = 0;
        }
        long j16 = j14;
        if ((i11 & 16) != 0) {
            j15 = j13;
        } else {
            j15 = j11;
        }
        if ((i11 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 64) != 0) {
            hVar = h.f18561i;
        } else {
            hVar = null;
        }
        if ((i11 & 128) != 0) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        if ((i11 & 256) != 0) {
            i12 = 3;
        } else {
            i12 = 0;
        }
        if ((i11 & 512) != 0) {
            i13 = 1;
        } else {
            i13 = i10;
        }
        fVar.p0(wVar, j12, j13, j16, j15, f11, hVar, sVar2, i12, i13);
    }

    public static /* synthetic */ void c(f fVar, z zVar, m mVar, float f10, i iVar, int i10) {
        float f11 = (i10 & 4) != 0 ? 1.0f : f10;
        h hVar = iVar;
        if ((i10 & 8) != 0) {
            hVar = h.f18561i;
        }
        fVar.d0(zVar, mVar, f11, hVar, null, (i10 & 32) != 0 ? 3 : 0);
    }

    public static void d(f fVar, m mVar, long j2, long j10, float f10, k kVar, int i10) {
        long j11;
        long j12;
        float f11;
        h hVar;
        int i11;
        if ((i10 & 2) != 0) {
            j11 = u0.c.f17721b;
        } else {
            j11 = j2;
        }
        if ((i10 & 4) != 0) {
            j12 = a(fVar.a(), j11);
        } else {
            j12 = j10;
        }
        if ((i10 & 8) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 16) != 0) {
            hVar = h.f18561i;
        } else {
            hVar = kVar;
        }
        if ((i10 & 64) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        fVar.F(mVar, j11, j12, f11, hVar, null, i11);
    }

    public static void e(f fVar, long j2, long j10, int i10) {
        long j11;
        long j12;
        float f10;
        h hVar;
        int i11;
        if ((i10 & 2) != 0) {
            j11 = u0.c.f17721b;
        } else {
            j11 = 0;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = a(fVar.a(), j13);
        } else {
            j12 = j10;
        }
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            hVar = h.f18561i;
        } else {
            hVar = null;
        }
        h hVar2 = hVar;
        if ((i10 & 64) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        fVar.Y(j2, j13, j12, f10, hVar2, null, i11);
    }

    public static void f(f fVar, m mVar, long j2, long j10, long j11, i iVar, int i10) {
        long j12;
        long j13;
        long j14;
        float f10;
        h hVar;
        int i11;
        if ((i10 & 2) != 0) {
            j12 = u0.c.f17721b;
        } else {
            j12 = j2;
        }
        if ((i10 & 4) != 0) {
            j13 = a(fVar.a(), j12);
        } else {
            j13 = j10;
        }
        if ((i10 & 8) != 0) {
            j14 = u0.a.f17716a;
        } else {
            j14 = j11;
        }
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            hVar = h.f18561i;
        } else {
            hVar = iVar;
        }
        if ((i10 & 128) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        fVar.j0(mVar, j12, j13, j14, f10, hVar, null, i11);
    }
}
