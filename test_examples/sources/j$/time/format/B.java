package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
class B {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f11903a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f11904b = new C0253c();
    public static final /* synthetic */ int c = 0;

    private static Object b(j$.time.temporal.o oVar, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(oVar, locale);
        ConcurrentHashMap concurrentHashMap = f11903a;
        V v3 = concurrentHashMap.get(simpleImmutableEntry);
        if (v3 == 0) {
            HashMap hashMap = new HashMap();
            int i10 = 0;
            if (oVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i10 < eras.length) {
                    if (!eras[i10].isEmpty()) {
                        long j2 = i10;
                        hashMap2.put(Long.valueOf(j2), eras[i10]);
                        hashMap3.put(Long.valueOf(j2), c(eras[i10]));
                    }
                    i10++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(G.FULL, hashMap2);
                    hashMap.put(G.SHORT, hashMap2);
                    hashMap.put(G.NARROW, hashMap3);
                }
                obj = new A(hashMap);
            } else if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i11 = 0; i11 < months.length; i11++) {
                    if (!months[i11].isEmpty()) {
                        long j10 = i11 + 1;
                        hashMap4.put(Long.valueOf(j10), months[i11]);
                        hashMap5.put(Long.valueOf(j10), c(months[i11]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(G.FULL, hashMap4);
                    hashMap.put(G.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i10 < shortMonths.length) {
                    if (!shortMonths[i10].isEmpty()) {
                        hashMap6.put(Long.valueOf(i10 + 1), shortMonths[i10]);
                    }
                    i10++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(G.SHORT, hashMap6);
                }
                obj = new A(hashMap);
            } else if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(G.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, c(weekdays[2]));
                hashMap8.put(2L, c(weekdays[3]));
                hashMap8.put(3L, c(weekdays[4]));
                hashMap8.put(4L, c(weekdays[5]));
                hashMap8.put(5L, c(weekdays[6]));
                hashMap8.put(6L, c(weekdays[7]));
                hashMap8.put(7L, c(weekdays[1]));
                hashMap.put(G.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(G.SHORT, hashMap9);
                obj = new A(hashMap);
            } else if (oVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i10 < amPmStrings.length) {
                    if (!amPmStrings[i10].isEmpty()) {
                        long j11 = i10;
                        hashMap10.put(Long.valueOf(j11), amPmStrings[i10]);
                        hashMap11.put(Long.valueOf(j11), c(amPmStrings[i10]));
                    }
                    i10++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(G.FULL, hashMap10);
                    hashMap.put(G.SHORT, hashMap10);
                    hashMap.put(G.NARROW, hashMap11);
                }
                obj = new A(hashMap);
            } else {
                obj = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return v3;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public String d(j$.time.temporal.o oVar, long j2, G g10, Locale locale) {
        Object b5 = b(oVar, locale);
        if (b5 instanceof A) {
            return ((A) b5).a(j2, g10);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.o oVar, G g10, Locale locale) {
        Object b5 = b(oVar, locale);
        if (b5 instanceof A) {
            return ((A) b5).b(g10);
        }
        return null;
    }
}
