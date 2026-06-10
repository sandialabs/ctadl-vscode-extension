package j$.time.zone;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.AbstractC0261c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f12052i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final b[] f12053j = new b[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f12054k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final a[] f12055l = new a[0];

    /* renamed from: a  reason: collision with root package name */
    private final long[] f12056a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f12057b;
    private final long[] c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f12058d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f12059e;

    /* renamed from: f  reason: collision with root package name */
    private final b[] f12060f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f12061g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f12062h = new ConcurrentHashMap();

    private ZoneRules(ZoneOffset zoneOffset) {
        this.f12057b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f12052i;
        this.f12056a = jArr;
        this.c = jArr;
        this.f12058d = f12054k;
        this.f12059e = zoneOffsetArr;
        this.f12060f = f12053j;
        this.f12061g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRules(TimeZone timeZone) {
        this.f12057b = r0;
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        long[] jArr = f12052i;
        this.f12056a = jArr;
        this.c = jArr;
        this.f12058d = f12054k;
        this.f12059e = zoneOffsetArr;
        this.f12060f = f12053j;
        this.f12061g = timeZone;
    }

    private static Object a(LocalDateTime localDateTime, a aVar) {
        LocalDateTime f10 = aVar.f();
        boolean o10 = aVar.o();
        boolean y10 = localDateTime.y(f10);
        return o10 ? y10 ? aVar.j() : localDateTime.y(aVar.e()) ? aVar : aVar.i() : !y10 ? aVar.i() : localDateTime.y(aVar.e()) ? aVar.j() : aVar;
    }

    private a[] b(int i10) {
        long j2;
        Integer valueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f12062h;
        a[] aVarArr = (a[]) concurrentHashMap.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        TimeZone timeZone = this.f12061g;
        if (timeZone == null) {
            b[] bVarArr = this.f12060f;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                b bVar = bVarArr[0];
                throw null;
            }
            if (i10 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        a[] aVarArr3 = f12055l;
        if (i10 < 1800) {
            return aVarArr3;
        }
        long G = LocalDateTime.z(i10 - 1).G(this.f12057b[0]);
        int offset = timeZone.getOffset(G * 1000);
        long j10 = 31968000 + G;
        while (G < j10) {
            long j11 = 7776000 + G;
            long j12 = G;
            if (offset != timeZone.getOffset(j11 * 1000)) {
                G = j12;
                while (j11 - G > 1) {
                    int i11 = offset;
                    long j13 = j10;
                    long g10 = j$.time.a.g(j11 + G, 2L);
                    if (timeZone.getOffset(g10 * 1000) == i11) {
                        G = g10;
                    } else {
                        j11 = g10;
                    }
                    offset = i11;
                    j10 = j13;
                }
                j2 = j10;
                int i12 = offset;
                if (timeZone.getOffset(G * 1000) == i12) {
                    G = j11;
                }
                ZoneOffset j14 = j(i12);
                offset = timeZone.getOffset(G * 1000);
                ZoneOffset j15 = j(offset);
                if (c(G, j15) == i10) {
                    aVarArr3 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                    aVarArr3[aVarArr3.length - 1] = new a(G, j14, j15);
                }
            } else {
                j2 = j10;
                int i13 = offset;
                G = j11;
            }
            j10 = j2;
        }
        if (1916 <= i10 && i10 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, aVarArr3);
        }
        return aVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.y(j$.time.a.g(j2 + zoneOffset.v(), 86400L)).getYear();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f12057b;
        int i10 = 0;
        TimeZone timeZone = this.f12061g;
        if (timeZone != null) {
            a[] b5 = b(localDateTime.getYear());
            if (b5.length == 0) {
                return j(timeZone.getOffset(localDateTime.G(zoneOffsetArr[0]) * 1000));
            }
            int length = b5.length;
            while (i10 < length) {
                a aVar = b5[i10];
                Object a10 = a(localDateTime, aVar);
                if (!(a10 instanceof a) && !a10.equals(aVar.j())) {
                    i10++;
                    obj = a10;
                }
                return a10;
            }
            return obj;
        } else if (this.c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f12060f.length;
            LocalDateTime[] localDateTimeArr = this.f12058d;
            if (length2 > 0 && localDateTime.x(localDateTimeArr[localDateTimeArr.length - 1])) {
                a[] b10 = b(localDateTime.getYear());
                int length3 = b10.length;
                while (i10 < length3) {
                    a aVar2 = b10[i10];
                    Object a11 = a(localDateTime, aVar2);
                    if (!(a11 instanceof a) && !a11.equals(aVar2.j())) {
                        i10++;
                        obj = a11;
                    }
                    return a11;
                }
                return obj;
            }
            int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
            ZoneOffset[] zoneOffsetArr2 = this.f12059e;
            if (binarySearch == -1) {
                return zoneOffsetArr2[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < localDateTimeArr.length - 1) {
                int i11 = binarySearch + 1;
                if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i11])) {
                    binarySearch = i11;
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i12 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr2[i12];
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i12 + 1];
                return zoneOffset2.v() > zoneOffset.v() ? new a(localDateTime2, zoneOffset, zoneOffset2) : new a(localDateTime3, zoneOffset, zoneOffset2);
            }
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
    }

    public static ZoneRules i(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new ZoneRules(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    private static ZoneOffset j(int i10) {
        return ZoneOffset.x(i10 / 1000);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f12061g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.f12057b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f12060f.length;
        ZoneOffset[] zoneOffsetArr = this.f12059e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        a[] b5 = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        a aVar = null;
        for (int i10 = 0; i10 < b5.length; i10++) {
            aVar = b5[i10];
            if (epochSecond < aVar.s()) {
                return aVar.j();
            }
        }
        return aVar.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            return AbstractC0261c.o(this.f12061g, zoneRules.f12061g) && Arrays.equals(this.f12056a, zoneRules.f12056a) && Arrays.equals(this.f12057b, zoneRules.f12057b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.f12059e, zoneRules.f12059e) && Arrays.equals(this.f12060f, zoneRules.f12060f);
        }
        return false;
    }

    public final a f(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        if (e10 instanceof a) {
            return (a) e10;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof a ? ((a) e10).k() : Collections.singletonList((ZoneOffset) e10);
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f12061g;
        if (timeZone != null) {
            zoneOffset = j(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.f12057b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.f12056a, instant.getEpochSecond());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(d(instant));
    }

    public final int hashCode() {
        TimeZone timeZone = this.f12061g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f12056a)) ^ Arrays.hashCode(this.f12057b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.f12059e)) ^ Arrays.hashCode(this.f12060f);
    }

    public boolean isFixedOffset() {
        a aVar;
        TimeZone timeZone = this.f12061g;
        if (timeZone == null) {
            return this.c.length == 0;
        }
        if (!timeZone.useDaylightTime() && timeZone.getDSTSavings() == 0) {
            Instant instant = Instant.EPOCH;
            Instant instant2 = Clock.systemUTC().instant();
            long epochSecond = instant2.getEpochSecond();
            if (instant2.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int c = c(epochSecond, d(instant2));
            a[] b5 = b(c);
            int length = b5.length - 1;
            while (true) {
                if (length < 0) {
                    if (c > 1800) {
                        a[] b10 = b(c - 1);
                        int length2 = b10.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long p10 = LocalDate.of(1800, 1, 1).p() * 86400;
                                for (long min = Math.min(epochSecond - 31104000, (Clock.systemUTC().a() / 1000) + 31968000); p10 <= min; min -= 7776000) {
                                    int offset2 = timeZone.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c10 = c(min, j(offset2));
                                        a[] b11 = b(c10 + 1);
                                        int length3 = b11.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                a[] b12 = b(c10);
                                                aVar = b12[b12.length - 1];
                                                break;
                                            } else if (epochSecond > b11[length3].s()) {
                                                aVar = b11[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    }
                                }
                            } else if (epochSecond > b10[length2].s()) {
                                aVar = b10[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                    aVar = null;
                } else if (epochSecond > b5[length].s()) {
                    aVar = b5[length];
                    break;
                } else {
                    length--;
                }
            }
            return aVar == null;
        }
        return false;
    }

    public final String toString() {
        TimeZone timeZone = this.f12061g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        StringBuilder sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f12057b;
        sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
