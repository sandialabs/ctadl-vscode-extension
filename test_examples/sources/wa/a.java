package wa;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public int f18498a;
    public String c;

    /* renamed from: b */
    public final k f18499b = new k();

    /* renamed from: d */
    public final StringBuilder f18500d = new StringBuilder();

    public static /* synthetic */ void p(a aVar, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = aVar.f18498a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        aVar.o(i10, str, str2);
        throw null;
    }

    public final int a(int i10, CharSequence charSequence) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            int r3 = r(i10 + 3, charSequence);
            this.f18500d.append((char) (r3 + (r(i10, charSequence) << 12) + (r(i10 + 1, charSequence) << 8) + (r(i10 + 2, charSequence) << 4)));
            return i11;
        }
        this.f18498a = i10;
        if (i11 < charSequence.length()) {
            return a(this.f18498a, charSequence);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public abstract boolean b();

    public final boolean c(int i10) {
        int u10 = u(i10);
        if (u10 >= s().length() || u10 == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        int i11 = u10 + 1;
        int charAt = s().charAt(u10) | ' ';
        if (charAt == 102) {
            d("alse", i11);
            return false;
        } else if (charAt == 116) {
            d("rue", i11);
            return true;
        } else {
            p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
            throw null;
        }
    }

    public final void d(String str, int i10) {
        if (s().length() - i10 < str.length()) {
            p(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (s().charAt(i10 + i11) | ' ')) {
                p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f18498a = str.length() + i10;
    }

    public abstract String e();

    public abstract String f(String str, boolean z10);

    public abstract byte g();

    public final byte h(byte b5) {
        byte g10 = g();
        if (g10 == b5) {
            return g10;
        }
        q(b5);
        throw null;
    }

    public abstract void i(char c);

    public final long j() {
        boolean z10;
        int u10 = u(v());
        int i10 = 6;
        int i11 = 0;
        if (u10 >= s().length() || u10 == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        if (s().charAt(u10) == '\"') {
            u10++;
            if (u10 == s().length()) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = u10;
        boolean z11 = true;
        boolean z12 = false;
        long j2 = 0;
        while (z11) {
            char charAt = s().charAt(i12);
            if (charAt != '-') {
                if (a1.b.u(charAt) != 0) {
                    break;
                }
                i12++;
                z11 = i12 != s().length();
                int i13 = charAt - '0';
                if (!(i13 >= 0 && i13 < 10)) {
                    p(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6);
                    throw null;
                }
                j2 = (j2 * 10) - i13;
                if (j2 > 0) {
                    p(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                i10 = 6;
                i11 = 0;
            } else if (i12 != u10) {
                p(this, "Unexpected symbol '-' in numeric literal", i11, null, i10);
                throw null;
            } else {
                i12++;
                z12 = true;
            }
        }
        if (u10 == i12 || (z12 && u10 == i12 - 1)) {
            p(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z10) {
            if (!z11) {
                p(this, "EOF", 0, null, 6);
                throw null;
            } else if (s().charAt(i12) != '\"') {
                p(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            } else {
                i12++;
            }
        }
        this.f18498a = i12;
        if (z12) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        p(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String k() {
        String str = this.c;
        if (str != null) {
            v7.g.c(str);
            this.c = null;
            return str;
        }
        return e();
    }

    public final String l() {
        String n;
        String str = this.c;
        if (str != null) {
            v7.g.c(str);
            this.c = null;
            return str;
        }
        int v3 = v();
        if (v3 < s().length() && v3 != -1) {
            byte u10 = a1.b.u(s().charAt(v3));
            if (u10 == 1) {
                return k();
            }
            if (u10 == 0) {
                boolean z10 = false;
                while (a1.b.u(s().charAt(v3)) == 0) {
                    v3++;
                    if (v3 >= s().length()) {
                        this.f18500d.append((CharSequence) s(), this.f18498a, v3);
                        int u11 = u(v3);
                        if (u11 == -1) {
                            this.f18498a = v3;
                            return n(0, 0);
                        }
                        v3 = u11;
                        z10 = true;
                    }
                }
                int i10 = this.f18498a;
                if (!z10) {
                    n = s().subSequence(i10, v3).toString();
                } else {
                    n = n(i10, v3);
                }
                this.f18498a = v3;
                return n;
            }
            p(this, "Expected beginning of the string, but got " + s().charAt(v3), 0, null, 6);
            throw null;
        }
        p(this, "EOF", v3, null, 4);
        throw null;
    }

    public final String m() {
        String l2 = l();
        if (v7.g.a(l2, "null")) {
            boolean z10 = true;
            if (s().charAt(this.f18498a - 1) == '\"') {
                z10 = false;
            }
            if (z10) {
                p(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return l2;
    }

    public final String n(int i10, int i11) {
        String s10 = s();
        StringBuilder sb = this.f18500d;
        sb.append((CharSequence) s10, i10, i11);
        String sb2 = sb.toString();
        v7.g.e(sb2, "escapedString.toString()");
        sb.setLength(0);
        return sb2;
    }

    public final void o(int i10, String str, String str2) {
        v7.g.f(str, "message");
        v7.g.f(str2, "hint");
        String concat = str2.length() == 0 ? "" : "\n".concat(str2);
        throw a1.c.q(i10, str + " at path: " + this.f18499b.a() + concat, s());
    }

    public final void q(byte b5) {
        String str;
        String str2 = b5 == 1 ? "quotation mark '\"'" : b5 == 4 ? "comma ','" : b5 == 5 ? "colon ':'" : b5 == 6 ? "start of the object '{'" : b5 == 7 ? "end of the object '}'" : b5 == 8 ? "start of the array '['" : b5 == 9 ? "end of the array ']'" : "valid token";
        if (this.f18498a != s().length() && this.f18498a > 0) {
            str = String.valueOf(s().charAt(this.f18498a - 1));
            p(this, "Expected " + str2 + ", but had '" + str + "' instead", this.f18498a - 1, null, 4);
            throw null;
        }
        str = "EOF";
        p(this, "Expected " + str2 + ", but had '" + str + "' instead", this.f18498a - 1, null, 4);
        throw null;
    }

    public final int r(int i10, CharSequence charSequence) {
        char charAt = charSequence.charAt(i10);
        boolean z10 = true;
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        char c = 'a';
        if (!('a' <= charAt && charAt < 'g')) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z10 = false;
            }
            if (!z10) {
                p(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
                throw null;
            }
        }
        return (charAt - c) + 10;
    }

    public abstract String s();

    public final byte t() {
        String s10 = s();
        int i10 = this.f18498a;
        while (true) {
            int u10 = u(i10);
            if (u10 == -1) {
                this.f18498a = u10;
                return (byte) 10;
            }
            char charAt = s10.charAt(u10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f18498a = u10;
                return a1.b.u(charAt);
            }
            i10 = u10 + 1;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) s());
        sb.append("', currentPosition=");
        return androidx.activity.e.h(sb, this.f18498a, ')');
    }

    public abstract int u(int i10);

    public abstract int v();

    public abstract boolean w();

    public final boolean x(boolean z10) {
        int u10 = u(v());
        int length = s().length() - u10;
        if (length >= 4 && u10 != -1) {
            for (int i10 = 0; i10 < 4; i10++) {
                if ("null".charAt(i10) != s().charAt(u10 + i10)) {
                    return false;
                }
            }
            if (length <= 4 || a1.b.u(s().charAt(u10 + 4)) != 0) {
                if (z10) {
                    this.f18498a = u10 + 4;
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y(char c) {
        int i10 = this.f18498a - 1;
        this.f18498a = i10;
        if (i10 >= 0 && c == '\"' && v7.g.a(l(), "null")) {
            o(this.f18498a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        } else {
            q(a1.b.u(c));
            throw null;
        }
    }
}
