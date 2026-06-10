package f7;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.noto.R;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import na.a;
import na.c;
import na.g;

/* loaded from: classes.dex */
public final class g {
    public static final String a(na.c cVar, Context context) {
        String str;
        String format;
        String str2;
        String str3;
        long j2;
        boolean z10;
        v7.g.f(cVar, "<this>");
        Instant instant = cVar.f16147i;
        v7.g.f(context, "context");
        na.g.Companion.getClass();
        na.g a10 = g.a.a();
        na.d e10 = e(cVar);
        na.e J0 = a1.b.J0(cVar, a10);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        c.a aVar = na.c.Companion;
        aVar.getClass();
        Instant instant2 = Clock.systemUTC().instant();
        v7.g.e(instant2, "systemUTC().instant()");
        na.e J02 = a1.b.J0(new na.c(instant2), a10);
        LocalDateTime localDateTime = J0.f16149i;
        if (localDateTime.getYear() == J02.f16149i.getYear()) {
            if (is24HourFormat) {
                str3 = "EEE, d MMM HH:mm";
            } else {
                str3 = "EEE, d MMM h:mm a";
            }
            format = localDateTime.format(DateTimeFormatter.ofPattern(str3));
            String obj = DateUtils.getRelativeTimeSpanString(cVar.a(), a1.b.I0(J02, a10).a(), 1000L).toString();
            aVar.getClass();
            Instant instant3 = Clock.systemUTC().instant();
            v7.g.e(instant3, "systemUTC().instant()");
            Instant instant4 = new na.c(instant3).f16147i;
            na.a.Companion.getClass();
            a.e eVar = na.a.f16140a;
            v7.g.f(eVar, "unit");
            try {
                j2 = a1.b.t0(instant4.getEpochSecond() - instant.getEpochSecond(), instant4.getNano() - instant.getNano(), eVar.f16143b);
            } catch (ArithmeticException unused) {
                if (instant.compareTo(instant4) < 0) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = Long.MIN_VALUE;
                }
            }
            if (0 <= j2 && j2 < 61) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                format = q.f(context, R.string.just_now, new Object[0]);
            } else if (d(e10)) {
                format = obj;
            } else if (c(e10)) {
                format = obj + " (" + format + ")";
            }
            str2 = "{\n        val format = i…dDateTime\n        }\n    }";
        } else {
            if (is24HourFormat) {
                str = "EEE, d MMM yyyy HH:mm";
            } else {
                str = "EEE, d MMM yyyy h:mm a";
            }
            format = localDateTime.format(DateTimeFormatter.ofPattern(str));
            str2 = "{\n        val format = i…  formattedDateTime\n    }";
        }
        v7.g.e(format, str2);
        return format;
    }

    public static final String b(na.d dVar) {
        String format;
        String str;
        v7.g.f(dVar, "<this>");
        na.g.Companion.getClass();
        na.g a10 = g.a.a();
        na.c.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        v7.g.e(instant, "systemUTC().instant()");
        na.e J0 = a1.b.J0(new na.c(instant), a10);
        LocalDate localDate = dVar.f16148i;
        if (localDate.getYear() == J0.f16149i.getYear()) {
            format = localDate.format(DateTimeFormatter.ofPattern("EEE, d MMM"));
            String obj = DateUtils.getRelativeTimeSpanString(new na.c(localDate.atStartOfDay(a10.f16151a).toInstant()).a(), a1.b.I0(J0, a10).a(), 86400000L).toString();
            if (d(dVar)) {
                format = obj;
            } else if (c(dVar)) {
                format = obj + " (" + format + ")";
            }
            str = "{\n        val format = \"…attedDate\n        }\n    }";
        } else {
            format = localDate.format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy"));
            str = "{\n        val format = \"…      formattedDate\n    }";
        }
        v7.g.e(format, str);
        return format;
    }

    public static final boolean c(na.d dVar) {
        na.c.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        v7.g.e(instant, "systemUTC().instant()");
        if (dVar.a() >= e(new na.c(instant)).a() - 6) {
            return true;
        }
        return false;
    }

    public static final boolean d(na.d dVar) {
        na.c.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        v7.g.e(instant, "systemUTC().instant()");
        if (dVar.a() == e(new na.c(instant)).a()) {
            return true;
        }
        return false;
    }

    public static final na.d e(na.c cVar) {
        v7.g.f(cVar, "<this>");
        na.g.Companion.getClass();
        LocalDate m10 = a1.b.J0(cVar, g.a.a()).f16149i.m();
        v7.g.e(m10, "value.toLocalDate()");
        return new na.d(m10);
    }
}
