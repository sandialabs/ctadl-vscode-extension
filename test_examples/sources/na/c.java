package na;

import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;

@qa.d(with = pa.d.class)
/* loaded from: classes.dex */
public final class c implements Comparable<c> {
    public static final a Companion = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final c f16145j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f16146k;

    /* renamed from: i  reason: collision with root package name */
    public final Instant f16147i;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x002f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c a(String str) {
            boolean z10;
            v7.g.f(str, "isoString");
            try {
                int d12 = kotlin.text.b.d1(str, 'T', 0, true, 2);
                if (d12 != -1) {
                    int length = str.length() - 1;
                    if (length >= 0) {
                        while (true) {
                            int i10 = length - 1;
                            char charAt = str.charAt(length);
                            if (charAt != '+' && charAt != '-') {
                                z10 = false;
                                if (z10) {
                                    break;
                                } else if (i10 < 0) {
                                    break;
                                } else {
                                    length = i10;
                                }
                            }
                            z10 = true;
                            if (z10) {
                            }
                        }
                        if (length >= d12 && kotlin.text.b.d1(str, ':', length, false, 4) == -1) {
                            str = str + ":00";
                        }
                    }
                    length = -1;
                    if (length >= d12) {
                        str = str + ":00";
                    }
                }
                Instant instant = OffsetDateTime.parse(str).toInstant();
                v7.g.e(instant, "parse(fixOffsetRepresent…n(isoString)).toInstant()");
                return new c(instant);
            } catch (DateTimeParseException e10) {
                throw new DateTimeFormatException(e10);
            }
        }

        public final qa.b<c> serializer() {
            return pa.d.f16791a;
        }
    }

    static {
        Instant ofEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        v7.g.e(ofEpochSecond, "ofEpochSecond(DISTANT_PAST_SECONDS, 999_999_999)");
        new c(ofEpochSecond);
        Instant ofEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        v7.g.e(ofEpochSecond2, "ofEpochSecond(DISTANT_FUTURE_SECONDS, 0)");
        new c(ofEpochSecond2);
        Instant instant = Instant.MIN;
        v7.g.e(instant, "MIN");
        f16145j = new c(instant);
        Instant instant2 = Instant.MAX;
        v7.g.e(instant2, "MAX");
        f16146k = new c(instant2);
    }

    public c(Instant instant) {
        v7.g.f(instant, "value");
        this.f16147i = instant;
    }

    public final long a() {
        Instant instant = this.f16147i;
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        v7.g.f(cVar2, "other");
        return this.f16147i.compareTo(cVar2.f16147i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                if (v7.g.a(this.f16147i, ((c) obj).f16147i)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16147i.hashCode();
    }

    public final String toString() {
        String instant = this.f16147i.toString();
        v7.g.e(instant, "value.toString()");
        return instant;
    }
}
