package v2;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f18153a;

    public k(Object obj) {
        this.f18153a = (LocaleList) obj;
    }

    @Override // v2.j
    public final String a() {
        String languageTags;
        languageTags = this.f18153a.toLanguageTags();
        return languageTags;
    }

    @Override // v2.j
    public final Object b() {
        return this.f18153a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f18153a.equals(((j) obj).b());
        return equals;
    }

    @Override // v2.j
    public final Locale get(int i10) {
        Locale locale;
        locale = this.f18153a.get(i10);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f18153a.hashCode();
        return hashCode;
    }

    @Override // v2.j
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f18153a.isEmpty();
        return isEmpty;
    }

    @Override // v2.j
    public final int size() {
        int size;
        size = this.f18153a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f18153a.toString();
        return localeList;
    }
}
