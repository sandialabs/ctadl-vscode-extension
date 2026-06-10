package j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d implements Comparable, Serializable {
    public static final d c = new d(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f11896a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11897b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private d(long j2, int i10) {
        this.f11896a = j2;
        this.f11897b = i10;
    }

    private static d e(long j2, int i10) {
        return (((long) i10) | j2) == 0 ? c : new d(j2, i10);
    }

    public static d h(long j2) {
        long j10 = j2 / 1000000000;
        int i10 = (int) (j2 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j10--;
        }
        return e(j10, i10);
    }

    public static d i() {
        return e(a.d(Long.MAX_VALUE, a.g(999999999L, 1000000000L)), (int) a.e(999999999L, 1000000000L));
    }

    public static d j(long j2) {
        return e(j2, 0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int compare = Long.compare(this.f11896a, dVar.f11896a);
        return compare != 0 ? compare : this.f11897b - dVar.f11897b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f11896a == dVar.f11896a && this.f11897b == dVar.f11897b;
        }
        return false;
    }

    public final long f() {
        return this.f11896a;
    }

    public final int hashCode() {
        long j2 = this.f11896a;
        return (this.f11897b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j2 = this.f11896a;
        long j10 = j2 / 3600;
        int i10 = (int) ((j2 % 3600) / 60);
        int i11 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        int i12 = this.f11897b;
        if (i11 == 0 && i12 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i11 >= 0 || i12 <= 0) {
            sb.append(i11);
        } else if (i11 == -1) {
            sb.append("-0");
        } else {
            sb.append(i11 + 1);
        }
        if (i12 > 0) {
            int length = sb.length();
            if (i11 < 0) {
                sb.append(2000000000 - i12);
            } else {
                sb.append(i12 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
