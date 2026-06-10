package ua;

import kotlin.time.DurationUnit;
import sa.d;

/* loaded from: classes.dex */
public final class a0 implements qa.b<ia.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f17944a = new a0();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f17945b = new k1("kotlin.time.Duration", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f17945b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[ADDED_TO_REGION] */
    @Override // qa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ta.d dVar, Object obj) {
        boolean z10;
        boolean z11;
        long j2;
        int m10;
        int m11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10 = ((ia.b) obj).f11865i;
        v7.g.f(dVar, "encoder");
        int i10 = ia.b.f11864l;
        StringBuilder sb = new StringBuilder();
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb.append('-');
        }
        sb.append("PT");
        if (i11 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j2 = ia.b.o(j10);
        } else {
            j2 = j10;
        }
        long m12 = ia.b.m(j2, DurationUnit.HOURS);
        if (ia.b.k(j2)) {
            m10 = 0;
        } else {
            m10 = (int) (ia.b.m(j2, DurationUnit.MINUTES) % 60);
        }
        if (ia.b.k(j2)) {
            m11 = 0;
        } else {
            m11 = (int) (ia.b.m(j2, DurationUnit.SECONDS) % 60);
        }
        int j11 = ia.b.j(j2);
        if (ia.b.k(j10)) {
            m12 = 9999999999999L;
        }
        if (m12 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m11 == 0 && j11 == 0) {
            z13 = false;
            if (m10 == 0 && (!z13 || !z12)) {
                z14 = false;
                if (z12) {
                    sb.append(m12);
                    sb.append('H');
                }
                if (z14) {
                    sb.append(m10);
                    sb.append('M');
                }
                if (!z13 || (!z12 && !z14)) {
                    ia.b.b(sb, m11, j11, 9, "S", true);
                }
                String sb2 = sb.toString();
                v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
                dVar.l0(sb2);
            }
            z14 = true;
            if (z12) {
            }
            if (z14) {
            }
            if (!z13) {
            }
            ia.b.b(sb, m11, j11, 9, "S", true);
            String sb22 = sb.toString();
            v7.g.e(sb22, "StringBuilder().apply(builderAction).toString()");
            dVar.l0(sb22);
        }
        z13 = true;
        if (m10 == 0) {
            z14 = false;
            if (z12) {
            }
            if (z14) {
            }
            if (!z13) {
            }
            ia.b.b(sb, m11, j11, 9, "S", true);
            String sb222 = sb.toString();
            v7.g.e(sb222, "StringBuilder().apply(builderAction).toString()");
            dVar.l0(sb222);
        }
        z14 = true;
        if (z12) {
        }
        if (z14) {
        }
        if (!z13) {
        }
        ia.b.b(sb, m11, j11, 9, "S", true);
        String sb2222 = sb.toString();
        v7.g.e(sb2222, "StringBuilder().apply(builderAction).toString()");
        dVar.l0(sb2222);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        int i10 = ia.b.f11864l;
        String c0 = cVar.c0();
        v7.g.f(c0, "value");
        try {
            return new ia.b(m0.b.r(c0));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(a4.b.m("Invalid ISO duration string format: '", c0, "'."), e10);
        }
    }
}
