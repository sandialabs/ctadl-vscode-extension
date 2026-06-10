package wa;

/* loaded from: classes.dex */
public final class j extends androidx.datastore.preferences.protobuf.k {

    /* renamed from: i  reason: collision with root package name */
    public final a f18509i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18510j;

    public j(a aVar, va.a aVar2) {
        v7.g.f(aVar, "lexer");
        v7.g.f(aVar2, "json");
        this.f18509i = aVar;
        this.f18510j = aVar2.f18192b;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final int O() {
        a aVar = this.f18509i;
        String l2 = aVar.l();
        try {
            v7.g.f(l2, "<this>");
            m7.h C1 = m0.b.C1(l2);
            if (C1 != null) {
                return C1.f15998i;
            }
            ha.h.O0(l2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, "Failed to parse type 'UInt' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte T() {
        m7.f fVar;
        a aVar = this.f18509i;
        String l2 = aVar.l();
        try {
            v7.g.f(l2, "<this>");
            m7.h C1 = m0.b.C1(l2);
            if (C1 != null) {
                int i10 = C1.f15998i;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) <= 0) {
                    fVar = new m7.f((byte) i10);
                    if (fVar == null) {
                        return fVar.f15994i;
                    }
                    ha.h.O0(l2);
                    throw null;
                }
            }
            fVar = null;
            if (fVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            a.p(aVar, "Failed to parse type 'UByte' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short b0() {
        m7.l lVar;
        a aVar = this.f18509i;
        String l2 = aVar.l();
        try {
            v7.g.f(l2, "<this>");
            m7.h C1 = m0.b.C1(l2);
            if (C1 != null) {
                int i10 = C1.f15998i;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) <= 0) {
                    lVar = new m7.l((short) i10);
                    if (lVar == null) {
                        return lVar.f16006i;
                    }
                    ha.h.O0(l2);
                    throw null;
                }
            }
            lVar = null;
            if (lVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            a.p(aVar, "Failed to parse type 'UShort' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ta.a
    public final androidx.datastore.preferences.protobuf.k c() {
        return this.f18510j;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final long f() {
        a aVar = this.f18509i;
        String l2 = aVar.l();
        try {
            v7.g.f(l2, "<this>");
            m7.j D1 = m0.b.D1(l2);
            if (D1 != null) {
                return D1.f16002i;
            }
            ha.h.O0(l2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, "Failed to parse type 'ULong' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ta.a
    public final int t(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
