package j$.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.k, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final j f12000e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f12001f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f12002g;

    /* renamed from: h  reason: collision with root package name */
    private static final j[] f12003h = new j[24];

    /* renamed from: a  reason: collision with root package name */
    private final byte f12004a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f12005b;
    private final byte c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12006d;

    static {
        int i10 = 0;
        while (true) {
            j[] jVarArr = f12003h;
            if (i10 >= jVarArr.length) {
                j jVar = jVarArr[0];
                f12002g = jVar;
                j jVar2 = jVarArr[12];
                f12000e = jVar;
                f12001f = new j(23, 59, 59, 999999999);
                return;
            }
            jVarArr[i10] = new j(i10, 0, 0, 0);
            i10++;
        }
    }

    private j(int i10, int i11, int i12, int i13) {
        this.f12004a = (byte) i10;
        this.f12005b = (byte) i11;
        this.c = (byte) i12;
        this.f12006d = i13;
    }

    public static j A(int i10, int i11, int i12, int i13) {
        j$.time.temporal.a.HOUR_OF_DAY.r(i10);
        j$.time.temporal.a.MINUTE_OF_HOUR.r(i11);
        j$.time.temporal.a.SECOND_OF_MINUTE.r(i12);
        j$.time.temporal.a.NANO_OF_SECOND.r(i13);
        return u(i10, i11, i12, i13);
    }

    public static j B(long j2) {
        j$.time.temporal.a.NANO_OF_DAY.r(j2);
        int i10 = (int) (j2 / 3600000000000L);
        long j10 = j2 - (i10 * 3600000000000L);
        int i11 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i11 * 60000000000L);
        int i12 = (int) (j11 / 1000000000);
        return u(i10, i11, i12, (int) (j11 - (i12 * 1000000000)));
    }

    private static j u(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f12003h[i10] : new j(i10, i11, i12, i13);
    }

    public static j v(j$.time.temporal.l lVar) {
        if (lVar != null) {
            j jVar = (j) lVar.r(j$.time.temporal.n.f());
            if (jVar != null) {
                return jVar;
            }
            throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    private int w(j$.time.temporal.o oVar) {
        int i10 = i.f11998a[((j$.time.temporal.a) oVar).ordinal()];
        byte b5 = this.f12005b;
        int i11 = this.f12006d;
        byte b10 = this.f12004a;
        switch (i10) {
            case 1:
                return i11;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                throw new s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return i11 / 1000;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                throw new s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i11 / 1000000;
            case 6:
                return (int) (G() / 1000000);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.c;
            case 8:
                return H();
            case ma.i.f16046m /* 9 */:
                return b5;
            case ma.i.f16047o /* 10 */:
                return (b10 * 60) + b5;
            case 11:
                return b10 % 12;
            case 12:
                int i12 = b10 % 12;
                if (i12 % 12 == 0) {
                    return 12;
                }
                return i12;
            case 13:
                return b10;
            case 14:
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case ma.i.f16049q /* 15 */:
                return b10 / 12;
            default:
                throw new s("Unsupported field: " + oVar);
        }
    }

    public static j z() {
        j$.time.temporal.a.HOUR_OF_DAY.r(0);
        return f12003h[0];
    }

    public final j C(long j2) {
        if (j2 == 0) {
            return this;
        }
        return u(((((int) (j2 % 24)) + this.f12004a) + 24) % 24, this.f12005b, this.c, this.f12006d);
    }

    public final j D(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i10 = (this.f12004a * 60) + this.f12005b;
        int i11 = ((((int) (j2 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : u(i11 / 60, i11 % 60, this.c, this.f12006d);
    }

    public final j E(long j2) {
        if (j2 == 0) {
            return this;
        }
        long G = G();
        long j10 = (((j2 % 86400000000000L) + G) + 86400000000000L) % 86400000000000L;
        return G == j10 ? this : u((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
    }

    public final j F(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i10 = (this.f12005b * 60) + (this.f12004a * 3600) + this.c;
        int i11 = ((((int) (j2 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : u(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f12006d);
    }

    public final long G() {
        return (this.c * 1000000000) + (this.f12005b * 60000000000L) + (this.f12004a * 3600000000000L) + this.f12006d;
    }

    public final int H() {
        return (this.f12005b * 60) + (this.f12004a * 3600) + this.c;
    }

    @Override // j$.time.temporal.k
    /* renamed from: I */
    public final j e(long j2, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.r(j2);
            int i10 = i.f11998a[aVar.ordinal()];
            byte b5 = this.f12005b;
            byte b10 = this.c;
            int i11 = this.f12006d;
            byte b11 = this.f12004a;
            switch (i10) {
                case 1:
                    return J((int) j2);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    return B(j2);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    return J(((int) j2) * 1000);
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    return B(j2 * 1000);
                case 5:
                    return J(((int) j2) * 1000000);
                case 6:
                    return B(j2 * 1000000);
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    int i12 = (int) j2;
                    if (b10 == i12) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.r(i12);
                    return u(b11, b5, i12, i11);
                case 8:
                    return F(j2 - H());
                case ma.i.f16046m /* 9 */:
                    int i13 = (int) j2;
                    if (b5 == i13) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.r(i13);
                    return u(b11, i13, b10, i11);
                case ma.i.f16047o /* 10 */:
                    return D(j2 - ((b11 * 60) + b5));
                case 11:
                    return C(j2 - (b11 % 12));
                case 12:
                    if (j2 == 12) {
                        j2 = 0;
                    }
                    return C(j2 - (b11 % 12));
                case 13:
                    int i14 = (int) j2;
                    if (b11 == i14) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.r(i14);
                    return u(i14, b5, b10, i11);
                case 14:
                    if (j2 == 24) {
                        j2 = 0;
                    }
                    int i15 = (int) j2;
                    if (b11 == i15) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.r(i15);
                    return u(i15, b5, b10, i11);
                case ma.i.f16049q /* 15 */:
                    return C((j2 - (b11 / 12)) * 12);
                default:
                    throw new s("Unsupported field: " + oVar);
            }
        }
        return (j) oVar.k(this, j2);
    }

    public final j J(int i10) {
        if (this.f12006d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.r(i10);
        return u(this.f12004a, this.f12005b, this.c, i10);
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar.isTimeBased() : oVar != null && oVar.e(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f12004a == jVar.f12004a && this.f12005b == jVar.f12005b && this.c == jVar.c && this.f12006d == jVar.f12006d;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? w(oVar) : j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k h(LocalDate localDate) {
        return (j) (localDate instanceof j ? localDate : localDate.k(this));
    }

    public final int hashCode() {
        long G = G();
        return (int) (G ^ (G >>> 32));
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.c(this, oVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // j$.time.temporal.k
    public final j$.time.temporal.k j(long j2, r rVar) {
        long j10;
        long j11;
        if (rVar instanceof j$.time.temporal.b) {
            switch (i.f11999b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return E(j2);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    j10 = j2 % 86400000000L;
                    j11 = 1000;
                    j2 = j10 * j11;
                    return E(j2);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    j10 = j2 % 86400000;
                    j11 = 1000000;
                    j2 = j10 * j11;
                    return E(j2);
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    return F(j2);
                case 5:
                    return D(j2);
                case 6:
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    j2 = (j2 % 2) * 12;
                    break;
                default:
                    throw new s("Unsupported unit: " + rVar);
            }
            return C(j2);
        }
        return (j) rVar.e(this, j2);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(G(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.NANO_OF_DAY ? G() : oVar == j$.time.temporal.a.MICRO_OF_DAY ? G() / 1000 : w(oVar) : oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar != j$.time.temporal.n.d() && qVar != j$.time.temporal.n.k() && qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.h()) {
            if (qVar == j$.time.temporal.n.f()) {
                return this;
            }
            if (qVar == j$.time.temporal.n.e()) {
                return null;
            }
            return qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : qVar.d(this);
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: t */
    public final int compareTo(j jVar) {
        int compare = Integer.compare(this.f12004a, jVar.f12004a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f12005b, jVar.f12005b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.c, jVar.c);
                return compare3 == 0 ? Integer.compare(this.f12006d, jVar.f12006d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder(18);
        byte b5 = this.f12004a;
        sb.append(b5 < 10 ? "0" : "");
        sb.append((int) b5);
        String str = ":0";
        byte b10 = this.f12005b;
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        byte b11 = this.c;
        int i11 = this.f12006d;
        if (b11 > 0 || i11 > 0) {
            if (b11 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append((int) b11);
            if (i11 > 0) {
                sb.append('.');
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = 1000000000;
                    }
                    i10 = i11 + i12;
                }
                sb.append(Integer.toString(i10).substring(1));
            }
        }
        return sb.toString();
    }

    public final int x() {
        return this.f12006d;
    }

    public final int y() {
        return this.c;
    }
}
