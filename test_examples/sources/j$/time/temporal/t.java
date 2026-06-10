package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final long f12034a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12035b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12036d;

    private t(long j2, long j10, long j11, long j12) {
        this.f12034a = j2;
        this.f12035b = j10;
        this.c = j11;
        this.f12036d = j12;
    }

    private String c(long j2, o oVar) {
        if (oVar == null) {
            return "Invalid value (valid values " + this + "): " + j2;
        }
        return "Invalid value for " + oVar + " (valid values " + this + "): " + j2;
    }

    public static t i(long j2, long j10) {
        if (j2 <= j10) {
            return new t(j2, j2, j10, j10);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static t j(long j2, long j10, long j11) {
        if (j2 <= 1) {
            if (j10 <= j11) {
                if (1 <= j11) {
                    return new t(j2, 1L, j10, j11);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public static t k(long j2, long j10) {
        return j(1L, j2, j10);
    }

    public final int a(long j2, o oVar) {
        if (g() && h(j2)) {
            return (int) j2;
        }
        throw new DateTimeException(c(j2, oVar));
    }

    public final void b(long j2, o oVar) {
        if (!h(j2)) {
            throw new DateTimeException(c(j2, oVar));
        }
    }

    public final long d() {
        return this.f12036d;
    }

    public final long e() {
        return this.f12034a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f12034a == tVar.f12034a && this.f12035b == tVar.f12035b && this.c == tVar.c && this.f12036d == tVar.f12036d;
        }
        return false;
    }

    public final boolean f() {
        return this.f12034a == this.f12035b && this.c == this.f12036d;
    }

    public final boolean g() {
        return this.f12034a >= -2147483648L && this.f12036d <= 2147483647L;
    }

    public final boolean h(long j2) {
        return j2 >= this.f12034a && j2 <= this.f12036d;
    }

    public final int hashCode() {
        long j2 = this.f12035b;
        long j10 = this.f12034a + (j2 << 16) + (j2 >> 48);
        long j11 = this.c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f12036d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) ((j14 >>> 32) ^ j14);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j2 = this.f12034a;
        sb.append(j2);
        long j10 = this.f12035b;
        if (j2 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        sb.append(" - ");
        long j11 = this.c;
        sb.append(j11);
        long j12 = this.f12036d;
        if (j11 != j12) {
            sb.append('/');
            sb.append(j12);
        }
        return sb.toString();
    }
}
