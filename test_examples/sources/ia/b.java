package ia;

import b8.h;
import b8.i;
import b8.l;
import kotlin.time.DurationUnit;
import v7.g;

/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: j  reason: collision with root package name */
    public static final long f11862j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f11863k;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f11864l = 0;

    /* renamed from: i  reason: collision with root package name */
    public final long f11865i;

    static {
        int i10 = c.f11866a;
        f11862j = m0.b.T(4611686018427387903L);
        f11863k = m0.b.T(-4611686018427387903L);
    }

    public static final long a(long j2, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j2 + j12;
        if (new l(-4611686018426L, 4611686018426L).g(j13)) {
            return m0.b.V((j13 * j11) + (j10 - (j12 * j11)));
        }
        return m0.b.T(a1.c.d0(j13, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void b(StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        CharSequence charSequence;
        boolean z11;
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i11);
            g.f(valueOf, "<this>");
            if (i12 >= 0) {
                if (i12 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i12);
                    h it = new i(1, i12 - valueOf.length()).iterator();
                    while (it.f6502k) {
                        it.nextInt();
                        sb2.append('0');
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i13 = -1;
                int length = obj.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i14 = length - 1;
                        if (obj.charAt(length) != '0') {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i13 = length;
                            break;
                        } else if (i14 < 0) {
                            break;
                        } else {
                            length = i14;
                        }
                    }
                }
                int i15 = i13 + 1;
                if (z10 || i15 >= 3) {
                    i15 = ((i15 + 2) / 3) * 3;
                }
                sb.append((CharSequence) obj, 0, i15);
            } else {
                throw new IllegalArgumentException(a4.b.i("Desired length ", i12, " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static int i(long j2, long j10) {
        long j11 = j2 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j2) & 1) - (((int) j10) & 1);
            return j2 < 0 ? -i10 : i10;
        }
        int i11 = (j2 > j10 ? 1 : (j2 == j10 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    public static final int j(long j2) {
        long j10;
        boolean z10 = false;
        if (k(j2)) {
            return 0;
        }
        if ((((int) j2) & 1) == 1) {
            z10 = true;
        }
        if (z10) {
            j10 = ((j2 >> 1) % 1000) * 1000000;
        } else {
            j10 = (j2 >> 1) % 1000000000;
        }
        return (int) j10;
    }

    public static final boolean k(long j2) {
        if (j2 != f11862j && j2 != f11863k) {
            return false;
        }
        return true;
    }

    public static final long l(long j2, long j10) {
        boolean z10 = true;
        if (k(j2)) {
            if (!(!k(j10)) && (j10 ^ j2) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j2;
        } else if (k(j10)) {
            return j10;
        } else {
            int i10 = ((int) j2) & 1;
            boolean z11 = false;
            if (i10 == (((int) j10) & 1)) {
                long j11 = (j2 >> 1) + (j10 >> 1);
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    if (new l(-4611686018426999999L, 4611686018426999999L).g(j11)) {
                        return m0.b.V(j11);
                    }
                    return m0.b.T(j11 / 1000000);
                }
                return m0.b.U(j11);
            }
            if (i10 == 1) {
                z11 = true;
            }
            if (z11) {
                return a(j2 >> 1, j10 >> 1);
            }
            return a(j10 >> 1, j2 >> 1);
        }
    }

    public static final long m(long j2, DurationUnit durationUnit) {
        DurationUnit durationUnit2;
        g.f(durationUnit, "unit");
        if (j2 == f11862j) {
            return Long.MAX_VALUE;
        }
        if (j2 == f11863k) {
            return Long.MIN_VALUE;
        }
        boolean z10 = true;
        long j10 = j2 >> 1;
        if ((((int) j2) & 1) != 0) {
            z10 = false;
        }
        if (z10) {
            durationUnit2 = DurationUnit.NANOSECONDS;
        } else {
            durationUnit2 = DurationUnit.MILLISECONDS;
        }
        g.f(durationUnit2, "sourceUnit");
        return durationUnit.f15142i.convert(j10, durationUnit2.f15142i);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n(long j2) {
        boolean z10;
        boolean z11;
        long j10;
        int m10;
        int m11;
        int m12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        int i17 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i17 == 0) {
            return "0s";
        }
        if (j2 == f11862j) {
            return "Infinity";
        }
        if (j2 == f11863k) {
            return "-Infinity";
        }
        if (i17 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append('-');
        }
        if (i17 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j10 = o(j2);
        } else {
            j10 = j2;
        }
        long m13 = m(j10, DurationUnit.DAYS);
        if (k(j10)) {
            m10 = 0;
        } else {
            m10 = (int) (m(j10, DurationUnit.HOURS) % 24);
        }
        if (k(j10)) {
            m11 = 0;
        } else {
            m11 = (int) (m(j10, DurationUnit.MINUTES) % 60);
        }
        if (k(j10)) {
            m12 = 0;
        } else {
            m12 = (int) (m(j10, DurationUnit.SECONDS) % 60);
        }
        int j11 = j(j10);
        if (m13 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m10 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (m11 != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (m12 == 0 && j11 == 0) {
            z15 = false;
            if (!z12) {
                sb.append(m13);
                sb.append('d');
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!z13 || (z12 && (z14 || z15))) {
                int i18 = i10 + 1;
                if (i10 > 0) {
                    sb.append(' ');
                }
                sb.append(m10);
                sb.append('h');
                i10 = i18;
            }
            if (!z14 || (z15 && (z13 || z12))) {
                int i19 = i10 + 1;
                if (i10 > 0) {
                    sb.append(' ');
                }
                sb.append(m11);
                sb.append('m');
                i10 = i19;
            }
            if (z15) {
                int i20 = i10 + 1;
                if (i10 > 0) {
                    sb.append(' ');
                }
                if (m12 == 0 && !z12 && !z13 && !z14) {
                    if (j11 >= 1000000) {
                        i14 = j11 / 1000000;
                        i15 = j11 % 1000000;
                        i16 = 6;
                        str2 = "ms";
                    } else if (j11 >= 1000) {
                        i14 = j11 / 1000;
                        i15 = j11 % 1000;
                        i16 = 3;
                        str2 = "us";
                    } else {
                        sb.append(j11);
                        sb.append("ns");
                        i10 = i20;
                    }
                    i13 = i16;
                    i11 = i14;
                    str = str2;
                    i12 = i15;
                    b(sb, i11, i12, i13, str, false);
                    i10 = i20;
                }
                str = "s";
                i11 = m12;
                i12 = j11;
                i13 = 9;
                b(sb, i11, i12, i13, str, false);
                i10 = i20;
            }
            if (z10 && i10 > 1) {
                sb.insert(1, '(').append(')');
            }
            String sb2 = sb.toString();
            g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        z15 = true;
        if (!z12) {
        }
        if (!z13) {
        }
        int i182 = i10 + 1;
        if (i10 > 0) {
        }
        sb.append(m10);
        sb.append('h');
        i10 = i182;
        if (!z14) {
        }
        int i192 = i10 + 1;
        if (i10 > 0) {
        }
        sb.append(m11);
        sb.append('m');
        i10 = i192;
        if (z15) {
        }
        if (z10) {
            sb.insert(1, '(').append(')');
        }
        String sb22 = sb.toString();
        g.e(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public static final long o(long j2) {
        long j10 = ((-(j2 >> 1)) << 1) + (((int) j2) & 1);
        int i10 = c.f11866a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return i(this.f11865i, bVar.f11865i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.f11865i != ((b) obj).f11865i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f11865i;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return n(this.f11865i);
    }
}
