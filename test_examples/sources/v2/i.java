package v2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements j {
    public static final Locale[] c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f18151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18152b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public i(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f18151a = c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        sb2.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb2.append('-');
                            sb2.append(locale2.getCountry());
                        }
                        if (i10 < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                } else {
                    throw new NullPointerException(a4.b.i("list[", i10, "] is null"));
                }
            }
            this.f18151a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f18152b = sb;
    }

    @Override // v2.j
    public final String a() {
        return this.f18152b;
    }

    @Override // v2.j
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            Locale[] localeArr = ((i) obj).f18151a;
            Locale[] localeArr2 = this.f18151a;
            if (localeArr2.length != localeArr.length) {
                return false;
            }
            for (int i10 = 0; i10 < localeArr2.length; i10++) {
                if (!localeArr2[i10].equals(localeArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // v2.j
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f18151a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f18151a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // v2.j
    public final boolean isEmpty() {
        return this.f18151a.length == 0;
    }

    @Override // v2.j
    public final int size() {
        return this.f18151a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f18151a;
            if (i10 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i10]);
            if (i10 < localeArr.length - 1) {
                sb.append(',');
            }
            i10++;
        }
    }
}
