package kotlin.text;

import a1.c;
import androidx.activity.e;
import b8.h;
import ga.n;
import ha.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import n7.l;
import v7.g;

/* loaded from: classes.dex */
public class b extends i {
    public static final boolean Y0(String str, CharSequence charSequence, boolean z10) {
        g.f(str, "<this>");
        g.f(charSequence, "other");
        if (charSequence instanceof String) {
            if (e1(str, (String) charSequence, 0, z10, 2) < 0) {
                return false;
            }
        } else if (c1(str, charSequence, 0, str.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean Z0(CharSequence charSequence, char c) {
        g.f(charSequence, "<this>");
        if (d1(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static final int a1(CharSequence charSequence) {
        g.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int b1(int i10, CharSequence charSequence, String str, boolean z10) {
        g.f(charSequence, "<this>");
        g.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return c1(charSequence, str, i10, charSequence.length(), z10, false);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x004a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c1(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        b8.g gVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            gVar = new b8.i(i10, i11);
        } else {
            int a12 = a1(charSequence);
            if (i10 > a12) {
                i10 = a12;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            gVar = new b8.g(i10, i11, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = gVar.f6497i;
        int i13 = gVar.f6499k;
        int i14 = gVar.f6498j;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
                while (!i.U0(0, r3, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i12 != i14) {
                        i12 += i13;
                    }
                }
                return i12;
            }
        } else if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
            while (!j1(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                if (i12 != i14) {
                    i12 += i13;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int d1(CharSequence charSequence, char c, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        g.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i10);
        }
        return f1(i10, charSequence, z10, new char[]{c});
    }

    public static /* synthetic */ int e1(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b1(i10, charSequence, str, z10);
    }

    public static final int f1(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        boolean z11;
        g.f(charSequence, "<this>");
        g.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i10);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i10 < 0) {
            i10 = 0;
        }
        h it = new b8.i(i10, a1(charSequence)).iterator();
        while (it.f6502k) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length2 = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    if (a1.b.M(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (z11) {
                return nextInt;
            }
        }
        return -1;
    }

    public static int g1(String str, String str2, int i10) {
        int i11;
        if ((i10 & 2) != 0) {
            i11 = a1(str);
        } else {
            i11 = 0;
        }
        g.f(str, "<this>");
        g.f(str2, "string");
        return str.lastIndexOf(str2, i11);
    }

    public static final List<String> h1(CharSequence charSequence) {
        g.f(charSequence, "<this>");
        return c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.W0(i1(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new StringsKt__StringsKt$splitToSequence$1(charSequence))));
    }

    public static ha.b i1(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        l1(i10);
        return new ha.b(charSequence, 0, i10, new StringsKt__StringsKt$rangesDelimitedBy$2(n7.i.Z1(strArr), z10));
    }

    public static final boolean j1(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        g.f(charSequence, "<this>");
        g.f(charSequence2, "other");
        if (i11 >= 0 && i10 >= 0 && i10 <= charSequence.length() - i12 && i11 <= charSequence2.length() - i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (!a1.b.M(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final String k1(CharSequence charSequence, String str) {
        boolean j12;
        g.f(str, "<this>");
        if (charSequence instanceof String) {
            j12 = i.X0(str, (String) charSequence, false);
        } else {
            j12 = j1(str, 0, charSequence, 0, charSequence.length(), false);
        }
        if (j12) {
            String substring = str.substring(charSequence.length());
            g.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final void l1(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(e.g("Limit must be non-negative, but was ", i10).toString());
    }

    public static final List m1(int i10, CharSequence charSequence, String str, boolean z10) {
        l1(i10);
        int i11 = 0;
        int b12 = b1(0, charSequence, str, z10);
        if (b12 != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            int i12 = 10;
            if (z11 && i10 <= 10) {
                i12 = i10;
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, b12).toString());
                i11 = str.length() + b12;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                b12 = b1(i11, charSequence, str, z10);
            } while (b12 != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return c.N0(charSequence.toString());
    }

    public static List n1(String str, char[] cArr) {
        if (cArr.length == 1) {
            return m1(0, str, String.valueOf(cArr[0]), false);
        }
        l1(0);
        n nVar = new n(new ha.b(str, 0, 0, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, false)));
        ArrayList arrayList = new ArrayList(l.Z1(nVar, 10));
        Iterator<Object> it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(p1(str, (b8.i) it.next()));
        }
        return arrayList;
    }

    public static boolean o1(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && a1.b.M(charSequence.charAt(0), c, false);
    }

    public static final String p1(CharSequence charSequence, b8.i iVar) {
        g.f(charSequence, "<this>");
        g.f(iVar, "range");
        return charSequence.subSequence(Integer.valueOf(iVar.f6497i).intValue(), Integer.valueOf(iVar.f6498j).intValue() + 1).toString();
    }

    public static final String q1(String str, b8.i iVar) {
        g.f(iVar, "range");
        String substring = str.substring(Integer.valueOf(iVar.f6497i).intValue(), Integer.valueOf(iVar.f6498j).intValue() + 1);
        g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String r1(String str, String str2, String str3) {
        g.f(str2, "delimiter");
        g.f(str3, "missingDelimiterValue");
        int e12 = e1(str, str2, 0, false, 6);
        if (e12 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + e12, str.length());
        g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String s1(String str) {
        int d12 = d1(str, '$', 0, false, 6);
        if (d12 == -1) {
            return str;
        }
        String substring = str.substring(d12 + 1, str.length());
        g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String t1(String str, char c, String str2) {
        g.f(str, "<this>");
        g.f(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(c, a1(str));
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static String u1(String str, char c) {
        g.f(str, "<this>");
        g.f(str, "missingDelimiterValue");
        int d12 = d1(str, c, 0, false, 6);
        if (d12 != -1) {
            String substring = str.substring(0, d12);
            g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String v1(String str, String str2) {
        g.f(str, "<this>");
        g.f(str, "missingDelimiterValue");
        int e12 = e1(str, str2, 0, false, 6);
        if (e12 != -1) {
            String substring = str.substring(0, e12);
            g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final CharSequence w1(CharSequence charSequence) {
        g.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean o02 = a1.b.o0(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!o02) {
                    break;
                }
                length--;
            } else if (o02) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
