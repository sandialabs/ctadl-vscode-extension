package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: d  reason: collision with root package name */
    public static g f3843d;
    public BreakIterator c;

    public g(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        v7.g.e(wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] a(int i10) {
        boolean z10;
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !g(i10 - 1) && !f(i10)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                v7.g.l("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i10);
            if (preceding != -1) {
                if (g(preceding) && (preceding == 0 || !g(preceding - 1))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return c(preceding, i10);
                }
            }
            return null;
        }
        v7.g.l("impl");
        throw null;
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] b(int i10) {
        boolean z10;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!g(i10)) {
            if (g(i10) && (i10 == 0 || !g(i10 - 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                break;
            }
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                v7.g.l("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i10);
            if (following != -1 && f(following)) {
                return c(i10, following);
            }
            return null;
        }
        v7.g.l("impl");
        throw null;
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

    public final boolean f(int i10) {
        return i10 > 0 && g(i10 + (-1)) && (i10 == d().length() || !g(i10));
    }

    public final boolean g(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }
}
