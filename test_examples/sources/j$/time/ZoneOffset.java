package j$.time;

import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.zone.ZoneRules;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.l, j$.time.temporal.m, Comparable<ZoneOffset> {

    /* renamed from: b  reason: collision with root package name */
    private final int f11888b;
    private final transient String c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f11884d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f11885e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = x(0);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f11886f = x(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f11887g = x(64800);

    private ZoneOffset(int i10) {
        String sb;
        this.f11888b = i10;
        if (i10 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            String str = ":0";
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                if (i13 >= 10) {
                    str = ":";
                }
                sb2.append(str);
                sb2.append(i13);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        return w(-r0, -r2, -r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset of(String str) {
        int y10;
        int i10;
        int i11;
        char charAt;
        if (str != null) {
            ZoneOffset zoneOffset = (ZoneOffset) f11885e.get(str);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            int length = str.length();
            if (length == 2) {
                str = str.charAt(0) + "0" + str.charAt(1);
            } else if (length != 3) {
                if (length == 5) {
                    y10 = y(str, 1, false);
                    i10 = y(str, 3, false);
                } else if (length != 6) {
                    if (length == 7) {
                        y10 = y(str, 1, false);
                        i10 = y(str, 3, false);
                        i11 = y(str, 5, false);
                    } else if (length != 9) {
                        throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    } else {
                        y10 = y(str, 1, false);
                        i10 = y(str, 4, true);
                        i11 = y(str, 7, true);
                    }
                    charAt = str.charAt(0);
                    if (charAt != '+' && charAt != '-') {
                        throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    }
                    return w(y10, i10, i11);
                } else {
                    y10 = y(str, 1, false);
                    i10 = y(str, 4, true);
                }
                i11 = 0;
                charAt = str.charAt(0);
                if (charAt != '+') {
                    throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                return w(y10, i10, i11);
            }
            y10 = y(str, 1, false);
            i10 = 0;
            i11 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            return w(y10, i10, i11);
        }
        throw new NullPointerException("offsetId");
    }

    public static ZoneOffset u(j$.time.temporal.l lVar) {
        if (lVar != null) {
            ZoneOffset zoneOffset = (ZoneOffset) lVar.r(j$.time.temporal.n.h());
            if (zoneOffset != null) {
                return zoneOffset;
            }
            throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    public static ZoneOffset w(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        } else if (i12 < -59 || i12 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        } else {
            if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
            return x((i11 * 60) + (i10 * 3600) + i12);
        }
    }

    public static ZoneOffset x(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f11884d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i10));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                f11885e.putIfAbsent(zoneOffset2.c, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i10);
    }

    private static int y(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i10);
        char charAt2 = charSequence.charAt(i10 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.e(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f11888b - this.f11888b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f11888b == ((ZoneOffset) obj).f11888b;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f11888b;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new s("Unsupported field: " + oVar);
        }
        return j$.time.temporal.n.c(this, oVar).a(o(oVar), oVar);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.i(this);
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f11888b;
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.c(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(this.f11888b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f11888b;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new s("Unsupported field: " + oVar);
        }
        return oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar != j$.time.temporal.n.h() && qVar != j$.time.temporal.n.j()) {
            return j$.time.temporal.n.b(this, qVar);
        }
        return this;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.c;
    }

    public final int v() {
        return this.f11888b;
    }
}
