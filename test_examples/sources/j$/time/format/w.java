package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: h  reason: collision with root package name */
    private static final C0251a f11977h = new j$.time.temporal.q() { // from class: j$.time.format.a
        @Override // j$.time.temporal.q
        public final Object d(j$.time.temporal.l lVar) {
            int i10 = w.f11979j;
            ZoneId zoneId = (ZoneId) lVar.r(j$.time.temporal.n.k());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap f11978i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f11979j = 0;

    /* renamed from: a  reason: collision with root package name */
    private w f11980a;

    /* renamed from: b  reason: collision with root package name */
    private final w f11981b;
    private final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11982d;

    /* renamed from: e  reason: collision with root package name */
    private int f11983e;

    /* renamed from: f  reason: collision with root package name */
    private char f11984f;

    /* renamed from: g  reason: collision with root package name */
    private int f11985g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        f11978i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.o oVar = j$.time.temporal.j.f12024a;
        hashMap.put('Q', oVar);
        hashMap.put('q', oVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public w() {
        this.f11980a = this;
        this.c = new ArrayList();
        this.f11985g = -1;
        this.f11981b = null;
        this.f11982d = false;
    }

    private w(w wVar) {
        this.f11980a = this;
        this.c = new ArrayList();
        this.f11985g = -1;
        this.f11981b = wVar;
        this.f11982d = true;
    }

    private int d(InterfaceC0257g interfaceC0257g) {
        if (interfaceC0257g != null) {
            w wVar = this.f11980a;
            int i10 = wVar.f11983e;
            if (i10 > 0) {
                m mVar = new m(interfaceC0257g, i10, wVar.f11984f);
                wVar.f11983e = 0;
                wVar.f11984f = (char) 0;
                interfaceC0257g = mVar;
            }
            wVar.c.add(interfaceC0257g);
            w wVar2 = this.f11980a;
            wVar2.f11985g = -1;
            return wVar2.c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    private void l(k kVar) {
        k g10;
        F f10;
        w wVar = this.f11980a;
        int i10 = wVar.f11985g;
        if (i10 < 0) {
            wVar.f11985g = d(kVar);
            return;
        }
        k kVar2 = (k) wVar.c.get(i10);
        int i11 = kVar.f11944b;
        int i12 = kVar.c;
        if (i11 == i12) {
            f10 = kVar.f11945d;
            if (f10 == F.NOT_NEGATIVE) {
                g10 = kVar2.h(i12);
                d(kVar.g());
                this.f11980a.f11985g = i10;
                this.f11980a.c.set(i10, g10);
            }
        }
        g10 = kVar2.g();
        this.f11980a.f11985g = d(kVar);
        this.f11980a.c.set(i10, g10);
    }

    private DateTimeFormatter v(Locale locale, E e10, j$.time.chrono.e eVar) {
        if (locale != null) {
            while (this.f11980a.f11981b != null) {
                o();
            }
            C0256f c0256f = new C0256f(this.c, false);
            C c = C.f11905a;
            return new DateTimeFormatter(c0256f, locale, e10, eVar);
        }
        throw new NullPointerException("locale");
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            throw new NullPointerException("formatter");
        }
        d(dateTimeFormatter.h());
    }

    public final void b(j$.time.temporal.a aVar, int i10, int i11, boolean z10) {
        d(new C0258h(aVar, i10, i11, z10));
    }

    public final void c() {
        d(new i());
    }

    public final void e(char c) {
        d(new C0255e(c));
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("literal");
        }
        if (str.length() > 0) {
            d(str.length() == 1 ? new C0255e(str.charAt(0)) : new j(1, str));
        }
    }

    public final void g(String str, String str2) {
        d(new l(str, str2));
    }

    public final void h() {
        d(l.f11947d);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        t tVar;
        String str2;
        String str3;
        G g10;
        boolean z10;
        G g11;
        int i10;
        int i11;
        if (str == null) {
            throw new NullPointerException("pattern");
        }
        int i12 = 0;
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i13 = i12 + 1;
                while (i13 < str.length() && str.charAt(i13) == charAt) {
                    i13++;
                }
                int i14 = i13 - i12;
                if (charAt == 'p') {
                    if (i13 >= str.length() || (((charAt = str.charAt(i13)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i10 = i13;
                        i11 = i14;
                        i14 = 0;
                    } else {
                        i10 = i13 + 1;
                        while (i10 < str.length() && str.charAt(i10) == charAt) {
                            i10++;
                        }
                        i11 = i10 - i13;
                    }
                    if (i14 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i14 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i14);
                    }
                    w wVar = this.f11980a;
                    wVar.f11983e = i14;
                    wVar.f11984f = ' ';
                    wVar.f11985g = -1;
                    i14 = i11;
                    i13 = i10;
                }
                j$.time.temporal.o oVar = (j$.time.temporal.o) f11978i.get(Character.valueOf(charAt));
                if (oVar != null) {
                    if (charAt != 'Q') {
                        if (charAt != 'S') {
                            if (charAt != 'a') {
                                if (charAt != 'h' && charAt != 'k' && charAt != 'm') {
                                    if (charAt != 'q') {
                                        if (charAt != 's') {
                                            if (charAt != 'u' && charAt != 'y') {
                                                switch (charAt) {
                                                    case 'D':
                                                        if (i14 == 1) {
                                                            l(new k(oVar, 1, 19, F.NORMAL));
                                                            break;
                                                        } else if (i14 > 3) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                        } else {
                                                            m(oVar, i14);
                                                            break;
                                                        }
                                                    case 'E':
                                                        break;
                                                    case 'F':
                                                        if (i14 != 1) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                        }
                                                        l(new k(oVar, 1, 19, F.NORMAL));
                                                        break;
                                                    case 'G':
                                                        if (i14 != 1 && i14 != 2 && i14 != 3) {
                                                            if (i14 != 4) {
                                                                if (i14 != 5) {
                                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                }
                                                                g11 = G.NARROW;
                                                                if (g11 == null) {
                                                                    throw new NullPointerException("textStyle");
                                                                }
                                                                d(new s(oVar, g11, new B()));
                                                                break;
                                                            }
                                                            g11 = G.FULL;
                                                            if (g11 == null) {
                                                            }
                                                        }
                                                        break;
                                                    case 'H':
                                                        break;
                                                    default:
                                                        switch (charAt) {
                                                            case 'K':
                                                                break;
                                                            case 'L':
                                                                break;
                                                            case 'M':
                                                                break;
                                                            default:
                                                                switch (charAt) {
                                                                    case 'c':
                                                                        if (i14 == 2) {
                                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                        }
                                                                        break;
                                                                    case 'd':
                                                                        break;
                                                                    case 'e':
                                                                        break;
                                                                    default:
                                                                        if (i14 == 1) {
                                                                            l(new k(oVar, 1, 19, F.NORMAL));
                                                                            break;
                                                                        }
                                                                        m(oVar, i14);
                                                                        break;
                                                                }
                                                        }
                                                }
                                            } else if (i14 == 2) {
                                                LocalDate localDate = q.f11961i;
                                                if (localDate == null) {
                                                    throw new NullPointerException("baseDate");
                                                }
                                                l(new q(oVar, localDate));
                                            } else {
                                                k(oVar, i14, 19, i14 < 4 ? F.NORMAL : F.EXCEEDS_PAD);
                                            }
                                        }
                                    }
                                    z10 = true;
                                    if (i14 != 1 || i14 == 2) {
                                        if (charAt != 'c' && charAt != 'e') {
                                            if (charAt != 'E') {
                                                if (i14 != 1) {
                                                    m(oVar, 2);
                                                }
                                                l(new k(oVar, 1, 19, F.NORMAL));
                                            }
                                        }
                                        d(new t(charAt, i14));
                                    } else {
                                        if (i14 != 3) {
                                            if (i14 == 4) {
                                                if (z10) {
                                                    g11 = G.FULL_STANDALONE;
                                                }
                                                g11 = G.FULL;
                                            } else if (i14 != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                            } else {
                                                if (z10) {
                                                    g11 = G.NARROW_STANDALONE;
                                                }
                                                g11 = G.NARROW;
                                            }
                                        } else if (z10) {
                                            g11 = G.SHORT_STANDALONE;
                                        }
                                        if (g11 == null) {
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                    l(new k(oVar, 1, 19, F.NORMAL));
                                } else {
                                    if (i14 != 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                    }
                                    m(oVar, i14);
                                }
                            } else if (i14 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            g11 = G.SHORT;
                            if (g11 == null) {
                            }
                        } else {
                            b(j$.time.temporal.a.NANO_OF_SECOND, i14, i14, false);
                        }
                    }
                    z10 = false;
                    if (i14 != 1) {
                    }
                    if (charAt != 'c') {
                        if (charAt != 'E') {
                        }
                        g11 = G.SHORT;
                        if (g11 == null) {
                        }
                    }
                    d(new t(charAt, i14));
                } else if (charAt == 'z') {
                    if (i14 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    d(new v(i14 == 4 ? G.FULL : G.SHORT));
                } else if (charAt != 'V') {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i14 < 4) {
                            str2 = "+HHMM";
                            g(str2, str4);
                        } else if (i14 == 4) {
                            g10 = G.FULL;
                            if (g10 == null) {
                                throw new NullPointerException("style");
                            }
                            if (g10 != G.FULL && g10 != G.SHORT) {
                                throw new IllegalArgumentException("Style must be either full or short");
                            }
                            d(new j(0, g10));
                        } else if (i14 != 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        } else {
                            str3 = "+HH:MM:ss";
                            g(str3, "Z");
                        }
                    } else if (charAt == 'O') {
                        if (i14 == 1) {
                            g10 = G.SHORT;
                            if (g10 == null) {
                            }
                        } else {
                            if (i14 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            g10 = G.FULL;
                            if (g10 == null) {
                            }
                        }
                    } else if (charAt == 'X') {
                        if (i14 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        str3 = l.c[i14 + (i14 == 1 ? 0 : 1)];
                        g(str3, "Z");
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i14 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            tVar = new t(charAt, i14);
                        } else if (charAt == 'w') {
                            if (i14 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            tVar = new t(charAt, i14);
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else {
                            tVar = new t(charAt, i14);
                        }
                        d(tVar);
                    } else if (i14 > 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else {
                        if (i14 == 1) {
                            str4 = "+00";
                        } else if (i14 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = l.c[i14 + (i14 == 1 ? 0 : 1)];
                        g(str2, str4);
                    }
                } else if (i14 != 2) {
                    throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                } else {
                    d(new u(j$.time.temporal.n.k(), "ZoneId()"));
                }
                i12 = (-1) + i13;
            } else if (charAt == '\'') {
                int i15 = i12 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 < str.length() && str.charAt(i17) == '\'') {
                            i16 = i17;
                        }
                        if (i16 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i15, i16);
                        if (substring.length() == 0) {
                            e('\'');
                        } else {
                            f(substring.replace("''", "'"));
                        }
                        i12 = i16;
                    }
                    i16++;
                }
                if (i16 < str.length()) {
                }
            } else if (charAt == '[') {
                p();
            } else if (charAt == ']') {
                if (this.f11980a.f11981b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                e(charAt);
            }
            i12++;
        }
    }

    public final void j(j$.time.temporal.a aVar, HashMap hashMap) {
        if (aVar == null) {
            throw new NullPointerException("field");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        G g10 = G.FULL;
        d(new s(aVar, g10, new C0252b(new A(Collections.singletonMap(g10, linkedHashMap)))));
    }

    public final w k(j$.time.temporal.o oVar, int i10, int i11, F f10) {
        if (i10 == i11 && f10 == F.NOT_NEGATIVE) {
            m(oVar, i11);
            return this;
        } else if (oVar != null) {
            if (f10 != null) {
                if (i10 < 1 || i10 > 19) {
                    throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
                } else if (i11 < 1 || i11 > 19) {
                    throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
                } else if (i11 >= i10) {
                    l(new k(oVar, i10, i11, f10));
                    return this;
                } else {
                    throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
                }
            }
            throw new NullPointerException("signStyle");
        } else {
            throw new NullPointerException("field");
        }
    }

    public final void m(j$.time.temporal.o oVar, int i10) {
        if (oVar == null) {
            throw new NullPointerException("field");
        }
        if (i10 >= 1 && i10 <= 19) {
            l(new k(oVar, i10, i10, F.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public final void n() {
        d(new u(f11977h, "ZoneRegionId()"));
    }

    public final void o() {
        w wVar = this.f11980a;
        if (wVar.f11981b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (wVar.c.size() <= 0) {
            this.f11980a = this.f11980a.f11981b;
            return;
        }
        w wVar2 = this.f11980a;
        C0256f c0256f = new C0256f(wVar2.c, wVar2.f11982d);
        this.f11980a = this.f11980a.f11981b;
        d(c0256f);
    }

    public final void p() {
        w wVar = this.f11980a;
        wVar.f11985g = -1;
        this.f11980a = new w(wVar);
    }

    public final void q() {
        d(r.INSENSITIVE);
    }

    public final void r() {
        d(r.SENSITIVE);
    }

    public final void s() {
        d(r.LENIENT);
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), E.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter u(E e10, j$.time.chrono.e eVar) {
        return v(Locale.getDefault(), e10, eVar);
    }
}
