package j$.time.format;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private char f11968a;

    /* renamed from: b  reason: collision with root package name */
    private int f11969b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(char c, int i10) {
        this.f11968a = c;
        this.f11969b = i10;
    }

    private k a(Locale locale) {
        j$.time.temporal.o i10;
        j$.time.temporal.r rVar = j$.time.temporal.v.f12046h;
        if (locale != null) {
            Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
            j$.time.temporal.v g10 = j$.time.temporal.v.g(j$.time.c.SUNDAY.v(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
            char c = this.f11968a;
            if (c == 'W') {
                i10 = g10.i();
            } else if (c == 'Y') {
                j$.time.temporal.o h10 = g10.h();
                int i11 = this.f11969b;
                if (i11 == 2) {
                    return new q(h10, q.f11961i, 0);
                }
                return new k(h10, i11, 19, i11 < 4 ? F.NORMAL : F.EXCEEDS_PAD, -1);
            } else if (c == 'c' || c == 'e') {
                i10 = g10.d();
            } else if (c != 'w') {
                throw new IllegalStateException("unreachable");
            } else {
                i10 = g10.j();
            }
            return new k(i10, this.f11969b == 2 ? 2 : 1, 2, F.NOT_NEGATIVE);
        }
        throw new NullPointerException("locale");
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        return a(zVar.c()).e(zVar, sb);
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        return a(xVar.i()).f(xVar, charSequence, i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f11968a;
        if (c == 'Y') {
            int i10 = this.f11969b;
            if (i10 == 1) {
                sb.append("WeekBasedYear");
            } else if (i10 == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f11969b);
                sb.append(",19,");
                sb.append(this.f11969b < 4 ? F.NORMAL : F.EXCEEDS_PAD);
            }
        } else {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(this.f11969b);
        }
        sb.append(")");
        return sb.toString();
    }
}
