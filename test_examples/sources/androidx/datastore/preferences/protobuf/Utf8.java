package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Utf8 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4824a;

    /* loaded from: classes.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i10, int i11) {
            super(a4.b.j("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b5, byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (!c(b10)) {
                if ((((b10 + 112) + (b5 << 28)) >> 30) == 0 && !c(b11) && !c(b12)) {
                    int i11 = ((b5 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.a();
        }

        public static void b(byte b5, byte b10, byte b11, char[] cArr, int i10) {
            if (c(b10) || ((b5 == -32 && b10 < -96) || ((b5 == -19 && b10 >= -96) || c(b11)))) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i10] = (char) (((b5 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
        }

        public static boolean c(byte b5) {
            return b5 > -65;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract int c(int i10, int i11, byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b5 = bArr[i10];
                    if (b5 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b5;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b10 = bArr[i10];
                    if (b10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b10;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 >= i12) {
                                break;
                            }
                            byte b11 = bArr[i10];
                            if (b11 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b11;
                        }
                    } else {
                        if (b10 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i15 < i12) {
                                int i17 = i15 + 1;
                                byte b12 = bArr[i15];
                                int i18 = i14 + 1;
                                if (b10 >= -62 && !a.c(b12)) {
                                    cArr[i14] = (char) (((b10 & 31) << 6) | (b12 & 63));
                                    i10 = i17;
                                    i14 = i18;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            } else {
                                throw InvalidProtocolBufferException.a();
                            }
                        } else {
                            if (b10 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i15 < i12 - 1) {
                                    int i19 = i15 + 1;
                                    a.b(b10, bArr[i15], bArr[i19], cArr, i14);
                                    i10 = i19 + 1;
                                    i14++;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            } else if (i15 < i12 - 2) {
                                int i20 = i15 + 1;
                                byte b13 = bArr[i15];
                                int i21 = i20 + 1;
                                a.a(b10, b13, bArr[i20], bArr[i21], cArr, i14);
                                i14 = i14 + 1 + 1;
                                i10 = i21 + 1;
                            } else {
                                throw InvalidProtocolBufferException.a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char charAt;
            int length = charSequence.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) charAt;
                i16++;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char charAt2 = charSequence.charAt(i16);
                if (charAt2 >= 128 || i17 >= i15) {
                    if (charAt2 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                        i17 = i18 + 1;
                        bArr[i18] = (byte) ((charAt2 & '?') | 128);
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                            }
                            throw new UnpairedSurrogateException(i16, length);
                        }
                        int i19 = i16 + 1;
                        if (i19 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i20 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i21 = i20 + 1;
                                bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 = i22 + 1;
                                bArr[i22] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new UnpairedSurrogateException(i16 - 1, length);
                    } else {
                        int i23 = i17 + 1;
                        bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i12 = i24 + 1;
                        bArr[i24] = (byte) ((charAt2 & '?') | 128);
                    }
                    i16++;
                } else {
                    i12 = i17 + 1;
                    bArr[i17] = (byte) charAt2;
                }
                i17 = i12;
                i16++;
            }
            return i17;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0078  */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(int i10, int i11, byte[] bArr) {
            int i12;
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 < i11) {
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    byte b5 = bArr[i10];
                    if (b5 < 0) {
                        byte b10 = -1;
                        if (b5 < -32) {
                            if (i13 < i11) {
                                if (b5 >= -62) {
                                    i10 = i13 + 1;
                                    if (bArr[i13] > -65) {
                                    }
                                }
                                return -1;
                            }
                            return b5;
                        } else if (b5 < -16) {
                            if (i13 < i11 - 1) {
                                int i14 = i13 + 1;
                                byte b11 = bArr[i13];
                                if (b11 <= -65 && ((b5 != -32 || b11 >= -96) && (b5 != -19 || b11 < -96))) {
                                    i10 = i14 + 1;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            byte b12 = bArr[i13 - 1];
                            i12 = i11 - i13;
                            if (i12 == 0) {
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        return Utf8.c(b12, bArr[i13], bArr[i13 + 1]);
                                    }
                                    throw new AssertionError();
                                }
                                return Utf8.b(b12, bArr[i13]);
                            }
                            if (b12 <= -12) {
                                b10 = b12;
                            }
                            return b10;
                        } else if (i13 >= i11 - 2) {
                            byte b122 = bArr[i13 - 1];
                            i12 = i11 - i13;
                            if (i12 == 0) {
                            }
                        } else {
                            int i15 = i13 + 1;
                            byte b13 = bArr[i13];
                            if (b13 <= -65) {
                                if ((((b13 + 112) + (b5 << 28)) >> 30) == 0) {
                                    int i16 = i15 + 1;
                                    if (bArr[i15] <= -65) {
                                        i13 = i16 + 1;
                                        if (bArr[i16] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                    }
                    i10 = i13;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {
        public static int d(byte[] bArr, int i10, long j2, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return Utf8.c(i10, f1.g(bArr, j2), f1.g(bArr, j2 + 1));
                    }
                    throw new AssertionError();
                }
                return Utf8.b(i10, f1.g(bArr, j2));
            }
            b bVar = Utf8.f4824a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte g10 = f1.g(bArr, i10);
                    if (g10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) g10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte g11 = f1.g(bArr, i10);
                    if (g11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) g11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 >= i12) {
                                break;
                            }
                            byte g12 = f1.g(bArr, i10);
                            if (g12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) g12;
                        }
                    } else {
                        if (g11 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i15 < i12) {
                                int i17 = i15 + 1;
                                byte g13 = f1.g(bArr, i15);
                                int i18 = i14 + 1;
                                if (g11 >= -62 && !a.c(g13)) {
                                    cArr[i14] = (char) (((g11 & 31) << 6) | (g13 & 63));
                                    i10 = i17;
                                    i14 = i18;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            } else {
                                throw InvalidProtocolBufferException.a();
                            }
                        } else {
                            if (g11 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i15 < i12 - 1) {
                                    int i19 = i15 + 1;
                                    a.b(g11, f1.g(bArr, i15), f1.g(bArr, i19), cArr, i14);
                                    i10 = i19 + 1;
                                    i14++;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            } else if (i15 < i12 - 2) {
                                int i20 = i15 + 1;
                                int i21 = i20 + 1;
                                a.a(g11, f1.g(bArr, i15), f1.g(bArr, i20), f1.g(bArr, i21), cArr, i14);
                                i14 = i14 + 1 + 1;
                                i10 = i21 + 1;
                            } else {
                                throw InvalidProtocolBufferException.a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            long j2;
            char c;
            long j10;
            int i12;
            long j11;
            long j12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j2 = 1;
                c = 128;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                f1.p(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 >= c || j13 >= j14) {
                    if (charAt2 < 2048 && j13 <= j14 - 2) {
                        long j15 = j13 + j2;
                        f1.p(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                        f1.p(bArr, j15, (byte) ((charAt2 & '?') | 128));
                        j12 = j15 + j2;
                        j11 = j2;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i13 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                            }
                            throw new UnpairedSurrogateException(i13, length);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j16 = j13 + 1;
                                f1.p(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j17 = j16 + 1;
                                f1.p(bArr, j16, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j18 = j17 + 1;
                                f1.p(bArr, j17, (byte) (((codePoint >>> 6) & 63) | 128));
                                j11 = 1;
                                j12 = j18 + 1;
                                f1.p(bArr, j18, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new UnpairedSurrogateException(i13 - 1, length);
                    } else {
                        long j19 = j13 + j2;
                        f1.p(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                        long j20 = j19 + j2;
                        f1.p(bArr, j19, (byte) (((charAt2 >>> 6) & 63) | 128));
                        f1.p(bArr, j20, (byte) ((charAt2 & '?') | 128));
                        j10 = j20 + 1;
                    }
                    i13++;
                    c = 128;
                    long j21 = j11;
                    j13 = j12;
                    j2 = j21;
                } else {
                    j10 = j13 + j2;
                    f1.p(bArr, j13, (byte) charAt2);
                }
                j12 = j10;
                j11 = 1;
                i13++;
                c = 128;
                long j212 = j11;
                j13 = j12;
                j2 = j212;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
            return d(r15, r13, r4, r14);
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(int i10, int i11, byte[] bArr) {
            int i12;
            long j2;
            if ((i10 | i11 | (bArr.length - i11)) >= 0) {
                long j10 = i10;
                int i13 = (int) (i11 - j10);
                if (i13 < 16) {
                    i12 = 0;
                } else {
                    long j11 = j10;
                    i12 = 0;
                    while (true) {
                        if (i12 < i13) {
                            long j12 = j11 + 1;
                            if (f1.g(bArr, j11) < 0) {
                                break;
                            }
                            i12++;
                            j11 = j12;
                        } else {
                            i12 = i13;
                            break;
                        }
                    }
                }
                int i14 = i13 - i12;
                long j13 = j10 + i12;
                while (true) {
                    byte b5 = 0;
                    while (true) {
                        if (i14 <= 0) {
                            break;
                        }
                        long j14 = j13 + 1;
                        b5 = f1.g(bArr, j13);
                        if (b5 >= 0) {
                            i14--;
                            j13 = j14;
                        } else {
                            j13 = j14;
                            break;
                        }
                    }
                    if (i14 == 0) {
                        return 0;
                    }
                    int i15 = i14 - 1;
                    if (b5 < -32) {
                        if (i15 == 0) {
                            return b5;
                        }
                        i14 = i15 - 1;
                        if (b5 < -62) {
                            break;
                        }
                        j2 = j13 + 1;
                        if (f1.g(bArr, j13) > -65) {
                            break;
                        }
                        j13 = j2;
                    } else if (b5 < -16) {
                        if (i15 >= 2) {
                            i14 = i15 - 2;
                            long j15 = j13 + 1;
                            byte g10 = f1.g(bArr, j13);
                            if (g10 > -65 || ((b5 == -32 && g10 < -96) || (b5 == -19 && g10 >= -96))) {
                                break;
                            }
                            j13 = j15 + 1;
                            if (f1.g(bArr, j15) > -65) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (i15 >= 3) {
                        i14 = i15 - 3;
                        long j16 = j13 + 1;
                        byte g11 = f1.g(bArr, j13);
                        if (g11 > -65 || (((g11 + 112) + (b5 << 28)) >> 30) != 0) {
                            break;
                        }
                        long j17 = j16 + 1;
                        if (f1.g(bArr, j16) > -65) {
                            break;
                        }
                        j2 = j17 + 1;
                        if (f1.g(bArr, j17) > -65) {
                            break;
                        }
                        j13 = j2;
                    } else {
                        break;
                    }
                }
            } else {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }
    }

    static {
        boolean z10;
        b cVar;
        if (f1.f4872f && f1.f4871e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !androidx.datastore.preferences.protobuf.d.a()) {
            cVar = new d();
        } else {
            cVar = new c();
        }
        f4824a = cVar;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new UnpairedSurrogateException(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int b(int i10, int i11) {
        if (i10 <= -12 && i11 <= -65) {
            return i10 ^ (i11 << 8);
        }
        return -1;
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 <= -12 && i11 <= -65 && i12 <= -65) {
            return (i10 ^ (i11 << 8)) ^ (i12 << 16);
        }
        return -1;
    }
}
