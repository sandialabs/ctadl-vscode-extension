package w1;

import java.util.Locale;
import v7.g;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f18255a;

    public a(Locale locale) {
        this.f18255a = locale;
    }

    @Override // w1.d
    public final String a() {
        String languageTag = this.f18255a.toLanguageTag();
        g.e(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
