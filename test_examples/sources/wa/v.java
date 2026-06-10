package wa;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18541a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f18542b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            char b5 = b(i10 >> 12);
            char b10 = b(i10 >> 8);
            char b11 = b(i10 >> 4);
            char b12 = b(i10);
            strArr[i10] = "\\u" + b5 + b10 + b11 + b12;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f18541a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f18542b = bArr;
    }

    public static final void a(String str, StringBuilder sb) {
        v7.g.f(str, "value");
        sb.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            String[] strArr = f18541a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i10, i11);
                sb.append(strArr[charAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb.append((CharSequence) str, i10, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 97);
    }
}
