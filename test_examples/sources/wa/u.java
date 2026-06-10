package wa;

/* loaded from: classes.dex */
public final class u extends a {

    /* renamed from: e  reason: collision with root package name */
    public final String f18540e;

    public u(String str) {
        v7.g.f(str, "source");
        this.f18540e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
        if (r1 != ',') goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    @Override // wa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean z10;
        boolean z11;
        int i10 = this.f18498a;
        boolean z12 = false;
        if (i10 == -1) {
            return false;
        }
        while (true) {
            String str = this.f18540e;
            if (i10 >= str.length()) {
                this.f18498a = i10;
                return false;
            }
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f18498a = i10;
                if (charAt != '}' && charAt != ']') {
                    z10 = false;
                    if (!z10 && charAt != ':') {
                        z11 = false;
                        if (!z11) {
                        }
                        z12 = true;
                        return !z12;
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    z12 = true;
                    return !z12;
                }
                z10 = true;
                if (!z10) {
                    z11 = false;
                    if (!z11) {
                    }
                    z12 = true;
                    return !z12;
                }
                z11 = true;
                if (!z11) {
                }
                z12 = true;
                return !z12;
            }
            i10++;
        }
    }

    @Override // wa.a
    public final String e() {
        String n;
        char c;
        i('\"');
        int i10 = this.f18498a;
        String str = this.f18540e;
        int d12 = kotlin.text.b.d1(str, '\"', i10, false, 4);
        if (d12 != -1) {
            int i11 = i10;
            while (i11 < d12) {
                if (str.charAt(i11) == '\\') {
                    int i12 = this.f18498a;
                    char charAt = str.charAt(i11);
                    boolean z10 = false;
                    while (charAt != '\"') {
                        StringBuilder sb = this.f18500d;
                        if (charAt == '\\') {
                            sb.append((CharSequence) s(), i12, i11);
                            int u10 = u(i11 + 1);
                            if (u10 != -1) {
                                int i13 = u10 + 1;
                                char charAt2 = str.charAt(u10);
                                if (charAt2 == 'u') {
                                    i13 = a(i13, str);
                                } else {
                                    if (charAt2 < 'u') {
                                        c = e.f18504a[charAt2];
                                    } else {
                                        c = 0;
                                    }
                                    if (c != 0) {
                                        sb.append(c);
                                    } else {
                                        a.p(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                        throw null;
                                    }
                                }
                                i12 = u(i13);
                                if (i12 == -1) {
                                    a.p(this, "EOF", i12, null, 4);
                                    throw null;
                                }
                            } else {
                                a.p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                                throw null;
                            }
                        } else {
                            i11++;
                            if (i11 >= str.length()) {
                                sb.append((CharSequence) s(), i12, i11);
                                i12 = u(i11);
                                if (i12 == -1) {
                                    a.p(this, "EOF", i12, null, 4);
                                    throw null;
                                }
                            } else {
                                continue;
                                charAt = str.charAt(i11);
                            }
                        }
                        i11 = i12;
                        z10 = true;
                        charAt = str.charAt(i11);
                    }
                    if (!z10) {
                        n = s().subSequence(i12, i11).toString();
                    } else {
                        n = n(i12, i11);
                    }
                    this.f18498a = i11 + 1;
                    return n;
                }
                i11++;
            }
            this.f18498a = d12 + 1;
            String substring = str.substring(i10, d12);
            v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        q((byte) 1);
        throw null;
    }

    @Override // wa.a
    public final String f(String str, boolean z10) {
        v7.g.f(str, "keyToMatch");
        int i10 = this.f18498a;
        try {
            if (g() != 6) {
                return null;
            }
            if (v7.g.a(z10 ? e() : m(), str)) {
                if (g() != 5) {
                    return null;
                }
                return z10 ? k() : m();
            }
            return null;
        } finally {
            this.f18498a = i10;
        }
    }

    @Override // wa.a
    public final byte g() {
        byte u10;
        do {
            int i10 = this.f18498a;
            if (i10 == -1) {
                return (byte) 10;
            }
            String str = this.f18540e;
            if (i10 >= str.length()) {
                return (byte) 10;
            }
            int i11 = this.f18498a;
            this.f18498a = i11 + 1;
            u10 = a1.b.u(str.charAt(i11));
        } while (u10 == 3);
        return u10;
    }

    @Override // wa.a
    public final void i(char c) {
        if (this.f18498a == -1) {
            y(c);
            throw null;
        }
        while (true) {
            int i10 = this.f18498a;
            String str = this.f18540e;
            if (i10 >= str.length()) {
                y(c);
                throw null;
            }
            int i11 = this.f18498a;
            this.f18498a = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                }
                y(c);
                throw null;
            }
        }
    }

    @Override // wa.a
    public final String s() {
        return this.f18540e;
    }

    @Override // wa.a
    public final int u(int i10) {
        if (i10 < this.f18540e.length()) {
            return i10;
        }
        return -1;
    }

    @Override // wa.a
    public final int v() {
        char charAt;
        int i10 = this.f18498a;
        if (i10 == -1) {
            return i10;
        }
        while (true) {
            String str = this.f18540e;
            if (i10 >= str.length() || !((charAt = str.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f18498a = i10;
        return i10;
    }

    @Override // wa.a
    public final boolean w() {
        int v3 = v();
        String str = this.f18540e;
        if (v3 != str.length() && v3 != -1 && str.charAt(v3) == ',') {
            this.f18498a++;
            return true;
        }
        return false;
    }
}
