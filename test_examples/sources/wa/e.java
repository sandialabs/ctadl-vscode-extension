package wa;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f18504a = new char[117];

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f18505b = new byte[126];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            a('u', i11);
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f18505b;
            if (i10 < 33) {
                bArr[i10] = Byte.MAX_VALUE;
                i10++;
            } else {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
        }
    }

    public static void a(char c, int i10) {
        if (c != 'u') {
            f18504a[c] = (char) i10;
        }
    }
}
