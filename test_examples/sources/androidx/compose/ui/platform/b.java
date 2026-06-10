package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static b f3829d;
    public BreakIterator c;

    public b(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        v7.g.e(characterInstance, "getCharacterInstance(locale)");
        this.c = characterInstance;
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] a(int i10) {
        int length = d().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            do {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    v7.g.l("impl");
                    throw null;
                } else if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        v7.g.l("impl");
                        throw null;
                    }
                    int preceding = breakIterator2.preceding(i10);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i10);
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        v7.g.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                }
            } while (i10 != -1);
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] b(int i10) {
        int length = d().length();
        if (length > 0 && i10 < length) {
            if (i10 < 0) {
                i10 = 0;
            }
            do {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    v7.g.l("impl");
                    throw null;
                } else if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 == null) {
                        v7.g.l("impl");
                        throw null;
                    }
                    int following = breakIterator2.following(i10);
                    if (following == -1) {
                        return null;
                    }
                    return c(i10, following);
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 == null) {
                        v7.g.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                }
            } while (i10 != -1);
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.a
    public final void e(String str) {
        v7.g.f(str, "text");
        this.f3818a = str;
        BreakIterator breakIterator = this.c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            v7.g.l("impl");
            throw null;
        }
    }
}
