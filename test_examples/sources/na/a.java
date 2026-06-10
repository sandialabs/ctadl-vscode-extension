package na;

import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;

@qa.d(with = pa.b.class)
/* loaded from: classes.dex */
public abstract class a {
    public static final C0195a Companion = new C0195a();

    /* renamed from: a  reason: collision with root package name */
    public static final e f16140a;

    /* renamed from: na.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0195a {
        public final qa.b<a> serializer() {
            return pa.b.f16787a;
        }
    }

    @qa.d(with = pa.a.class)
    /* loaded from: classes.dex */
    public static abstract class b extends a {
        public static final C0196a Companion = new C0196a();

        /* renamed from: na.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0196a {
            public final qa.b<b> serializer() {
                return pa.a.f16785a;
            }
        }
    }

    @qa.d(with = DayBasedDateTimeUnitSerializer.class)
    /* loaded from: classes.dex */
    public static final class c extends b {
        public static final C0197a Companion = new C0197a();

        /* renamed from: b  reason: collision with root package name */
        public final int f16141b;

        /* renamed from: na.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0197a {
            public final qa.b<c> serializer() {
                return DayBasedDateTimeUnitSerializer.f15566a;
            }
        }

        public c(int i10) {
            boolean z10;
            this.f16141b = i10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            throw new IllegalArgumentException(a4.b.i("Unit duration must be positive, but was ", i10, " days.").toString());
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if (this.f16141b == ((c) obj).f16141b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f16141b ^ 65536;
        }

        public final String toString() {
            String str;
            int i10 = this.f16141b;
            if (i10 % 7 == 0) {
                i10 /= 7;
                str = "WEEK";
            } else {
                str = "DAY";
            }
            return a.a(str, i10);
        }
    }

    @qa.d(with = MonthBasedDateTimeUnitSerializer.class)
    /* loaded from: classes.dex */
    public static final class d extends b {
        public static final C0198a Companion = new C0198a();

        /* renamed from: b  reason: collision with root package name */
        public final int f16142b;

        /* renamed from: na.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0198a {
            public final qa.b<d> serializer() {
                return MonthBasedDateTimeUnitSerializer.f15569a;
            }
        }

        public d(int i10) {
            boolean z10;
            this.f16142b = i10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            throw new IllegalArgumentException(a4.b.i("Unit duration must be positive, but was ", i10, " months.").toString());
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    if (this.f16142b == ((d) obj).f16142b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f16142b ^ 131072;
        }

        public final String toString() {
            String str;
            int i10 = this.f16142b;
            if (i10 % 1200 == 0) {
                i10 /= 1200;
                str = "CENTURY";
            } else if (i10 % 12 == 0) {
                i10 /= 12;
                str = "YEAR";
            } else if (i10 % 3 == 0) {
                i10 /= 3;
                str = "QUARTER";
            } else {
                str = "MONTH";
            }
            return a.a(str, i10);
        }
    }

    @qa.d(with = TimeBasedDateTimeUnitSerializer.class)
    /* loaded from: classes.dex */
    public static final class e extends a {
        public static final C0199a Companion = new C0199a();

        /* renamed from: b  reason: collision with root package name */
        public final long f16143b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final long f16144d;

        /* renamed from: na.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0199a {
            public final qa.b<e> serializer() {
                return TimeBasedDateTimeUnitSerializer.f15572a;
            }
        }

        public e(long j2) {
            boolean z10;
            String str;
            this.f16143b = j2;
            if (j2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j10 = 3600000000000L;
                if (j2 % 3600000000000L == 0) {
                    str = "HOUR";
                } else {
                    j10 = 60000000000L;
                    if (j2 % 60000000000L == 0) {
                        str = "MINUTE";
                    } else {
                        j10 = 1000000000;
                        if (j2 % j10 == 0) {
                            str = "SECOND";
                        } else {
                            j10 = 1000000;
                            if (j2 % j10 == 0) {
                                str = "MILLISECOND";
                            } else {
                                j10 = 1000;
                                if (j2 % j10 == 0) {
                                    str = "MICROSECOND";
                                } else {
                                    this.c = "NANOSECOND";
                                    this.f16144d = j2;
                                    return;
                                }
                            }
                        }
                    }
                }
                this.c = str;
                j2 /= j10;
                this.f16144d = j2;
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + j2 + " ns.").toString());
        }

        public final e b(int i10) {
            boolean z10;
            long j2;
            long j10 = i10;
            long j11 = this.f16143b;
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11);
            if (numberOfLeadingZeros > 65) {
                j2 = j11 * j10;
            } else {
                if (numberOfLeadingZeros >= 64) {
                    boolean z11 = true;
                    int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j10 == Long.MIN_VALUE) {
                        z11 = false;
                    }
                    if (z11 | z10) {
                        long j12 = j11 * j10;
                        if (i11 == 0 || j12 / j11 == j10) {
                            j2 = j12;
                        }
                    }
                }
                throw new ArithmeticException();
            }
            return new e(j2);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    if (this.f16143b == ((e) obj).f16143b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j2 = this.f16143b;
            return ((int) j2) ^ ((int) (j2 >> 32));
        }

        public final String toString() {
            String str = this.c;
            v7.g.f(str, "unit");
            long j2 = this.f16144d;
            if (j2 != 1) {
                return j2 + '-' + str;
            }
            return str;
        }
    }

    static {
        int i10;
        e b5 = new e(1L).b(1000).b(1000).b(1000);
        f16140a = b5;
        b5.b(60).b(60);
        long j2 = new c(1).f16141b * 7;
        int i11 = (int) j2;
        if (j2 == i11) {
            new c(i11);
            int i12 = new d(1).f16142b;
            long j10 = i12 * 3;
            int i13 = (int) j10;
            if (j10 == i13) {
                new d(i13);
                long j11 = i12 * 12;
                if (j11 == ((int) j11)) {
                    long j12 = new d(i10).f16142b * 100;
                    int i14 = (int) j12;
                    if (j12 == i14) {
                        new d(i14);
                        return;
                    }
                    throw new ArithmeticException();
                }
                throw new ArithmeticException();
            }
            throw new ArithmeticException();
        }
        throw new ArithmeticException();
    }

    public static String a(String str, int i10) {
        if (i10 == 1) {
            return str;
        }
        return i10 + '-' + str;
    }
}
