package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {

    /* renamed from: h  reason: collision with root package name */
    public static final DateTimeFormatter f11912h;

    /* renamed from: i  reason: collision with root package name */
    public static final DateTimeFormatter f11913i;

    /* renamed from: j  reason: collision with root package name */
    public static final DateTimeFormatter f11914j;

    /* renamed from: k  reason: collision with root package name */
    public static final DateTimeFormatter f11915k;

    /* renamed from: a  reason: collision with root package name */
    private final C0256f f11916a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f11917b;
    private final C c;

    /* renamed from: d  reason: collision with root package name */
    private final E f11918d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f11919e;

    /* renamed from: f  reason: collision with root package name */
    private final j$.time.chrono.d f11920f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneId f11921g;

    static {
        w wVar = new w();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        F f10 = F.EXCEEDS_PAD;
        wVar.k(aVar, 4, 10, f10);
        wVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        wVar.m(aVar2, 2);
        wVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        wVar.m(aVar3, 2);
        E e10 = E.STRICT;
        j$.time.chrono.e eVar = j$.time.chrono.e.f11895a;
        DateTimeFormatter u10 = wVar.u(e10, eVar);
        f11912h = u10;
        w wVar2 = new w();
        wVar2.q();
        wVar2.a(u10);
        wVar2.h();
        wVar2.u(e10, eVar);
        w wVar3 = new w();
        wVar3.q();
        wVar3.a(u10);
        wVar3.p();
        wVar3.h();
        wVar3.u(e10, eVar);
        w wVar4 = new w();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        wVar4.m(aVar4, 2);
        wVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        wVar4.m(aVar5, 2);
        wVar4.p();
        wVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        wVar4.m(aVar6, 2);
        wVar4.p();
        wVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter u11 = wVar4.u(e10, null);
        w wVar5 = new w();
        wVar5.q();
        wVar5.a(u11);
        wVar5.h();
        wVar5.u(e10, null);
        w wVar6 = new w();
        wVar6.q();
        wVar6.a(u11);
        wVar6.p();
        wVar6.h();
        wVar6.u(e10, null);
        w wVar7 = new w();
        wVar7.q();
        wVar7.a(u10);
        wVar7.e('T');
        wVar7.a(u11);
        DateTimeFormatter u12 = wVar7.u(e10, eVar);
        f11913i = u12;
        w wVar8 = new w();
        wVar8.q();
        wVar8.a(u12);
        wVar8.h();
        DateTimeFormatter u13 = wVar8.u(e10, eVar);
        f11914j = u13;
        w wVar9 = new w();
        wVar9.a(u13);
        wVar9.p();
        wVar9.e('[');
        wVar9.r();
        wVar9.n();
        wVar9.e(']');
        wVar9.u(e10, eVar);
        w wVar10 = new w();
        wVar10.a(u12);
        wVar10.p();
        wVar10.h();
        wVar10.p();
        wVar10.e('[');
        wVar10.r();
        wVar10.n();
        wVar10.e(']');
        wVar10.u(e10, eVar);
        w wVar11 = new w();
        wVar11.q();
        wVar11.k(aVar, 4, 10, f10);
        wVar11.e('-');
        wVar11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        wVar11.p();
        wVar11.h();
        wVar11.u(e10, eVar);
        w wVar12 = new w();
        wVar12.q();
        wVar12.k(j$.time.temporal.j.c, 4, 10, f10);
        wVar12.f("-W");
        wVar12.m(j$.time.temporal.j.f12025b, 2);
        wVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        wVar12.m(aVar7, 1);
        wVar12.p();
        wVar12.h();
        wVar12.u(e10, eVar);
        w wVar13 = new w();
        wVar13.q();
        wVar13.c();
        f11915k = wVar13.u(e10, null);
        w wVar14 = new w();
        wVar14.q();
        wVar14.m(aVar, 4);
        wVar14.m(aVar2, 2);
        wVar14.m(aVar3, 2);
        wVar14.p();
        wVar14.g("+HHMMss", "Z");
        wVar14.u(e10, eVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        w wVar15 = new w();
        wVar15.q();
        wVar15.s();
        wVar15.p();
        wVar15.j(aVar7, hashMap);
        wVar15.f(", ");
        wVar15.o();
        wVar15.k(aVar3, 1, 2, F.NOT_NEGATIVE);
        wVar15.e(' ');
        wVar15.j(aVar2, hashMap2);
        wVar15.e(' ');
        wVar15.m(aVar, 4);
        wVar15.e(' ');
        wVar15.m(aVar4, 2);
        wVar15.e(':');
        wVar15.m(aVar5, 2);
        wVar15.p();
        wVar15.e(':');
        wVar15.m(aVar6, 2);
        wVar15.o();
        wVar15.e(' ');
        wVar15.g("+HHMM", "GMT");
        wVar15.u(E.SMART, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C0256f c0256f, Locale locale, E e10, j$.time.chrono.e eVar) {
        C c = C.f11905a;
        this.f11916a = c0256f;
        this.f11919e = null;
        if (locale == null) {
            throw new NullPointerException("locale");
        }
        this.f11917b = locale;
        this.c = c;
        if (e10 == null) {
            throw new NullPointerException("resolverStyle");
        }
        this.f11918d = e10;
        this.f11920f = eVar;
        this.f11921g = null;
    }

    private j$.time.temporal.l g(CharSequence charSequence) {
        String charSequence2;
        ParsePosition parsePosition = new ParsePosition(0);
        if (charSequence != null) {
            x xVar = new x(this);
            int f10 = this.f11916a.f(xVar, charSequence, parsePosition.getIndex());
            if (f10 < 0) {
                parsePosition.setErrorIndex(~f10);
                xVar = null;
            } else {
                parsePosition.setIndex(f10);
            }
            if (xVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                return xVar.t(this.f11918d, this.f11919e);
            }
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        throw new NullPointerException("text");
    }

    public static DateTimeFormatter ofPattern(String str) {
        w wVar = new w();
        wVar.i(str);
        return wVar.t();
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb = new StringBuilder(32);
        if (lVar != null) {
            try {
                this.f11916a.e(new z(lVar, this), sb);
                return sb.toString();
            } catch (IOException e10) {
                throw new DateTimeException(e10.getMessage(), e10);
            }
        }
        throw new NullPointerException("temporal");
    }

    public final j$.time.chrono.d b() {
        return this.f11920f;
    }

    public final C c() {
        return this.c;
    }

    public final Locale d() {
        return this.f11917b;
    }

    public final ZoneId e() {
        return this.f11921g;
    }

    public final Object f(CharSequence charSequence, j$.time.f fVar) {
        String charSequence2;
        if (charSequence != null) {
            try {
                return ((D) g(charSequence)).r(fVar);
            } catch (DateTimeParseException e10) {
                throw e10;
            } catch (RuntimeException e11) {
                if (charSequence.length() > 64) {
                    charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
                } else {
                    charSequence2 = charSequence.toString();
                }
                throw new DateTimeParseException("Text '" + charSequence2 + "' could not be parsed: " + e11.getMessage(), charSequence, e11);
            }
        }
        throw new NullPointerException("text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0256f h() {
        return this.f11916a.a();
    }

    public final String toString() {
        String c0256f = this.f11916a.toString();
        return c0256f.startsWith("[") ? c0256f : c0256f.substring(1, c0256f.length() - 1);
    }
}
