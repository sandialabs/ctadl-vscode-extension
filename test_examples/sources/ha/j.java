package ha;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class j extends kotlin.text.b {
    public static final String x1(String str, int i10) {
        boolean z10;
        v7.g.f(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(i10);
            v7.g.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(a4.b.i("Requested character count ", i10, " is less than zero.").toString());
    }

    public static final char y1(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(kotlin.text.b.a1(charSequence));
    }

    public static final Character z1(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(str.length() - 1));
    }
}
