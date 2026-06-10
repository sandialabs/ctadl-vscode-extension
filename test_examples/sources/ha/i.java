package ha;

import java.util.Collection;

/* loaded from: classes.dex */
public class i extends h {
    public static boolean R0(String str, String str2) {
        v7.g.f(str, "<this>");
        v7.g.f(str2, "suffix");
        return str.endsWith(str2);
    }

    public static final boolean S0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean T0(CharSequence charSequence) {
        boolean z10;
        v7.g.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        b8.i iVar = new b8.i(0, charSequence.length() - 1);
        if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
            b8.h it = iVar.iterator();
            while (it.f6502k) {
                if (!a1.b.o0(charSequence.charAt(it.nextInt()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    public static final boolean U0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        v7.g.f(str, "<this>");
        v7.g.f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String V0(String str, char c, char c10) {
        v7.g.f(str, "<this>");
        String replace = str.replace(c, c10);
        v7.g.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    public static String W0(String str, String str2, String str3) {
        v7.g.f(str, "<this>");
        int b12 = kotlin.text.b.b1(0, str, str2, false);
        if (b12 >= 0) {
            int length = str2.length();
            int i10 = 1;
            if (length >= 1) {
                i10 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i11 = 0;
                do {
                    sb.append((CharSequence) str, i11, b12);
                    sb.append(str3);
                    i11 = b12 + length;
                    if (b12 >= str.length()) {
                        break;
                    }
                    b12 = kotlin.text.b.b1(b12 + i10, str, str2, false);
                } while (b12 > 0);
                sb.append((CharSequence) str, i11, str.length());
                String sb2 = sb.toString();
                v7.g.e(sb2, "stringBuilder.append(this, i, length).toString()");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean X0(String str, String str2, boolean z10) {
        v7.g.f(str, "<this>");
        v7.g.f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : U0(0, 0, str2.length(), str, str2, z10);
    }
}
