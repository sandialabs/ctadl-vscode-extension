package y2;

import android.text.SpannableStringBuilder;
import ma.i;
import y2.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f18789d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f18790e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f18791f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f18792g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18794b;
    public final e c;

    /* renamed from: y2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0241a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f18795e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f18796a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18797b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public char f18798d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f18795e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0241a(CharSequence charSequence) {
            this.f18796a = charSequence;
            this.f18797b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f18796a;
            char charAt = charSequence.charAt(this.c - 1);
            this.f18798d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.c--;
            char c = this.f18798d;
            if (c < 1792) {
                return f18795e[c];
            }
            return Character.getDirectionality(c);
        }
    }

    static {
        f.d dVar = f.c;
        f18789d = Character.toString((char) 8206);
        f18790e = Character.toString((char) 8207);
        f18791f = new a(false, 2, dVar);
        f18792g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i10, f.d dVar) {
        this.f18793a = z10;
        this.f18794b = i10;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.c <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.a()) {
            case 14: goto L69;
            case 15: goto L69;
            case 16: goto L64;
            case 17: goto L64;
            case 18: goto L60;
            default: goto L72;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        C0241a c0241a = new C0241a(charSequence);
        c0241a.c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = c0241a.c;
            if (i13 < c0241a.f18797b && i10 == 0) {
                CharSequence charSequence2 = c0241a.f18796a;
                char charAt = charSequence2.charAt(i13);
                c0241a.f18798d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, c0241a.c);
                    c0241a.c = Character.charCount(codePointAt) + c0241a.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c0241a.c++;
                    char c = c0241a.f18798d;
                    if (c < 1792) {
                        directionality = C0241a.f18795e[c];
                    } else {
                        directionality = Character.getDirectionality(c);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case i.f16049q /* 15 */:
                                    i12++;
                                    i11 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i12++;
                                    i11 = 1;
                                    break;
                                case 18:
                                    i12--;
                                    i11 = 0;
                                    break;
                            }
                        }
                    } else if (i12 == 0) {
                    }
                } else if (i12 == 0) {
                }
                i10 = i12;
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence) {
        C0241a c0241a = new C0241a(charSequence);
        c0241a.c = c0241a.f18797b;
        int i10 = 0;
        int i11 = 0;
        while (c0241a.c > 0) {
            byte a10 = c0241a.a();
            if (a10 != 0) {
                if (a10 != 1 && a10 != 2) {
                    if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case i.f16049q /* 15 */:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i10 == 0) {
                    return 1;
                } else {
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            } else if (i10 == 0) {
                return -1;
            } else {
                if (i11 == 0) {
                    i11 = i10;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, e eVar) {
        boolean z10;
        f.d dVar;
        char c;
        f.d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b5 = ((f.c) eVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f18794b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = f18790e;
        String str3 = f18789d;
        boolean z11 = this.f18793a;
        if (z10) {
            if (b5) {
                dVar2 = f.f18804b;
            } else {
                dVar2 = f.f18803a;
            }
            boolean b10 = dVar2.b(charSequence, charSequence.length());
            if (!z11 && (b10 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z11 || (b10 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b5 != z11) {
            if (b5) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b5) {
            dVar = f.f18804b;
        } else {
            dVar = f.f18803a;
        }
        boolean b11 = dVar.b(charSequence, charSequence.length());
        if (!z11 && (b11 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z11 || (b11 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
