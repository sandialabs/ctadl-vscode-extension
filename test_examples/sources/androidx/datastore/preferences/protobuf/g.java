package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f4876a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4877b = 100;
    public final int c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public h f4878d;

    /* loaded from: classes.dex */
    public static final class a extends g {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f4879e;

        /* renamed from: f  reason: collision with root package name */
        public int f4880f;

        /* renamed from: g  reason: collision with root package name */
        public int f4881g;

        /* renamed from: h  reason: collision with root package name */
        public int f4882h;

        /* renamed from: i  reason: collision with root package name */
        public final int f4883i;

        /* renamed from: j  reason: collision with root package name */
        public int f4884j;

        /* renamed from: k  reason: collision with root package name */
        public int f4885k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f4879e = bArr;
            this.f4880f = i11 + i10;
            this.f4882h = i10;
            this.f4883i = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int A() {
            int i10;
            int i11 = this.f4882h;
            int i12 = this.f4880f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f4879e;
                byte b5 = bArr[i11];
                if (b5 >= 0) {
                    this.f4882h = i13;
                    return b5;
                } else if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b5 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b10 = bArr[i14];
                                i10 = (i18 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f4882h = i14;
                    return i10;
                }
            }
            return (int) C();
        }

        public final long B() {
            long j2;
            long j10;
            long j11;
            int i10;
            int i11 = this.f4882h;
            int i12 = this.f4880f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f4879e;
                byte b5 = bArr[i11];
                if (b5 >= 0) {
                    this.f4882h = i13;
                    return b5;
                } else if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b5 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            j2 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 >= 0) {
                                long j12 = i18;
                                int i19 = i14 + 1;
                                long j13 = (bArr[i14] << 28) ^ j12;
                                if (j13 >= 0) {
                                    j10 = j13 ^ 266354560;
                                    i14 = i19;
                                } else {
                                    int i20 = i19 + 1;
                                    long j14 = j13 ^ (bArr[i19] << 35);
                                    if (j14 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i20 + 1;
                                        long j15 = j14 ^ (bArr[i20] << 42);
                                        if (j15 >= 0) {
                                            j2 = j15 ^ 4363953127296L;
                                        } else {
                                            i20 = i16 + 1;
                                            j14 = j15 ^ (bArr[i16] << 49);
                                            if (j14 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i16 = i20 + 1;
                                                j2 = (j14 ^ (bArr[i20] << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    i20 = i16 + 1;
                                                    if (bArr[i16] >= 0) {
                                                        j10 = j2;
                                                        i14 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ j14;
                                    i14 = i20;
                                }
                                this.f4882h = i14;
                                return j10;
                            }
                            i10 = i18 ^ (-2080896);
                        }
                        i14 = i16;
                        j10 = j2;
                        this.f4882h = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f4882h = i14;
                    return j10;
                }
            }
            return C();
        }

        public final long C() {
            long j2 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f4882h;
                if (i11 != this.f4880f) {
                    this.f4882h = i11 + 1;
                    byte b5 = this.f4879e[i11];
                    j2 |= (b5 & Byte.MAX_VALUE) << i10;
                    if ((b5 & 128) == 0) {
                        return j2;
                    }
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void D(int i10) {
            if (i10 >= 0) {
                int i11 = this.f4880f;
                int i12 = this.f4882h;
                if (i10 <= i11 - i12) {
                    this.f4882h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void a(int i10) {
            if (this.f4884j == i10) {
                return;
            }
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int b() {
            return this.f4882h - this.f4883i;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean c() {
            return this.f4882h == this.f4880f;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void d(int i10) {
            this.f4885k = i10;
            int i11 = this.f4880f + this.f4881g;
            this.f4880f = i11;
            int i12 = i11 - this.f4883i;
            if (i12 > i10) {
                int i13 = i12 - i10;
                this.f4881g = i13;
                this.f4880f = i11 - i13;
                return;
            }
            this.f4881g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f4882h;
                int i12 = this.f4883i;
                int i13 = (i11 - i12) + i10;
                int i14 = this.f4885k;
                if (i13 <= i14) {
                    this.f4885k = i13;
                    int i15 = this.f4880f + this.f4881g;
                    this.f4880f = i15;
                    int i16 = i15 - i12;
                    if (i16 > i13) {
                        int i17 = i16 - i13;
                        this.f4881g = i17;
                        this.f4880f = i15 - i17;
                    } else {
                        this.f4881g = 0;
                    }
                    return i14;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean f() {
            return B() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final ByteString g() {
            byte[] bArr;
            int A = A();
            byte[] bArr2 = this.f4879e;
            if (A > 0) {
                int i10 = this.f4880f;
                int i11 = this.f4882h;
                if (A <= i10 - i11) {
                    ByteString g10 = ByteString.g(bArr2, i11, A);
                    this.f4882h += A;
                    return g10;
                }
            }
            if (A == 0) {
                return ByteString.f4776j;
            }
            if (A > 0) {
                int i12 = this.f4880f;
                int i13 = this.f4882h;
                if (A <= i12 - i13) {
                    int i14 = A + i13;
                    this.f4882h = i14;
                    bArr = Arrays.copyOfRange(bArr2, i13, i14);
                    ByteString byteString = ByteString.f4776j;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (A <= 0) {
                if (A == 0) {
                    bArr = u.f4943b;
                    ByteString byteString2 = ByteString.f4776j;
                    return new ByteString.LiteralByteString(bArr);
                }
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final double h() {
            return Double.longBitsToDouble(z());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int i() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int j() {
            return y();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long k() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final float l() {
            return Float.intBitsToFloat(y());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int m() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long n() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int o() {
            return y();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long p() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int q() {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long r() {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final String s() {
            int A = A();
            if (A > 0) {
                int i10 = this.f4880f;
                int i11 = this.f4882h;
                if (A <= i10 - i11) {
                    String str = new String(this.f4879e, i11, A, u.f4942a);
                    this.f4882h += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final String t() {
            int A = A();
            if (A > 0) {
                int i10 = this.f4880f;
                int i11 = this.f4882h;
                if (A <= i10 - i11) {
                    String a10 = Utf8.f4824a.a(this.f4879e, i11, A);
                    this.f4882h += A;
                    return a10;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int u() {
            if (c()) {
                this.f4884j = 0;
                return 0;
            }
            int A = A();
            this.f4884j = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int v() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long w() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                return false;
                            }
                            if (i12 == 5) {
                                D(4);
                                return true;
                            }
                            int i14 = InvalidProtocolBufferException.f4807i;
                            throw new InvalidProtocolBufferException.InvalidWireTypeException();
                        }
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    i11 = A();
                } else {
                    i11 = 8;
                }
                D(i11);
                return true;
            }
            int i15 = this.f4880f - this.f4882h;
            byte[] bArr = this.f4879e;
            if (i15 >= 10) {
                while (i13 < 10) {
                    int i16 = this.f4882h;
                    this.f4882h = i16 + 1;
                    if (bArr[i16] < 0) {
                        i13++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i13 < 10) {
                int i17 = this.f4882h;
                if (i17 != this.f4880f) {
                    this.f4882h = i17 + 1;
                    if (bArr[i17] < 0) {
                        i13++;
                    }
                } else {
                    throw InvalidProtocolBufferException.f();
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }

        public final int y() {
            int i10 = this.f4882h;
            if (this.f4880f - i10 >= 4) {
                this.f4882h = i10 + 4;
                byte[] bArr = this.f4879e;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.f();
        }

        public final long z() {
            int i10 = this.f4882h;
            if (this.f4880f - i10 >= 8) {
                this.f4882h = i10 + 8;
                byte[] bArr = this.f4879e;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.f();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends g {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f4886e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f4887f;

        /* renamed from: g  reason: collision with root package name */
        public int f4888g;

        /* renamed from: h  reason: collision with root package name */
        public int f4889h;

        /* renamed from: i  reason: collision with root package name */
        public int f4890i;

        /* renamed from: j  reason: collision with root package name */
        public int f4891j;

        /* renamed from: k  reason: collision with root package name */
        public int f4892k;

        /* renamed from: l  reason: collision with root package name */
        public int f4893l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = u.f4942a;
            this.f4886e = fileInputStream;
            this.f4887f = new byte[4096];
            this.f4888g = 0;
            this.f4890i = 0;
            this.f4892k = 0;
        }

        public final ArrayList A(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f4886e.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.f();
                    }
                    this.f4892k += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() {
            int i10 = this.f4890i;
            if (this.f4888g - i10 < 4) {
                H(4);
                i10 = this.f4890i;
            }
            this.f4890i = i10 + 4;
            byte[] bArr = this.f4887f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() {
            int i10 = this.f4890i;
            if (this.f4888g - i10 < 8) {
                H(8);
                i10 = this.f4890i;
            }
            this.f4890i = i10 + 8;
            byte[] bArr = this.f4887f;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int D() {
            int i10;
            int i11 = this.f4890i;
            int i12 = this.f4888g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f4887f;
                byte b5 = bArr[i11];
                if (b5 >= 0) {
                    this.f4890i = i13;
                    return b5;
                } else if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b5 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b10 = bArr[i14];
                                i10 = (i18 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f4890i = i14;
                    return i10;
                }
            }
            return (int) F();
        }

        public final long E() {
            long j2;
            long j10;
            long j11;
            int i10;
            int i11 = this.f4890i;
            int i12 = this.f4888g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f4887f;
                byte b5 = bArr[i11];
                if (b5 >= 0) {
                    this.f4890i = i13;
                    return b5;
                } else if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b5 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            j2 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 >= 0) {
                                long j12 = i18;
                                int i19 = i14 + 1;
                                long j13 = (bArr[i14] << 28) ^ j12;
                                if (j13 >= 0) {
                                    j10 = j13 ^ 266354560;
                                    i14 = i19;
                                } else {
                                    int i20 = i19 + 1;
                                    long j14 = j13 ^ (bArr[i19] << 35);
                                    if (j14 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i20 + 1;
                                        long j15 = j14 ^ (bArr[i20] << 42);
                                        if (j15 >= 0) {
                                            j2 = j15 ^ 4363953127296L;
                                        } else {
                                            i20 = i16 + 1;
                                            j14 = j15 ^ (bArr[i16] << 49);
                                            if (j14 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i16 = i20 + 1;
                                                j2 = (j14 ^ (bArr[i20] << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    i20 = i16 + 1;
                                                    if (bArr[i16] >= 0) {
                                                        j10 = j2;
                                                        i14 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ j14;
                                    i14 = i20;
                                }
                                this.f4890i = i14;
                                return j10;
                            }
                            i10 = i18 ^ (-2080896);
                        }
                        i14 = i16;
                        j10 = j2;
                        this.f4890i = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f4890i = i14;
                    return j10;
                }
            }
            return F();
        }

        public final long F() {
            long j2 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f4890i == this.f4888g) {
                    H(1);
                }
                int i11 = this.f4890i;
                this.f4890i = i11 + 1;
                byte b5 = this.f4887f[i11];
                j2 |= (b5 & Byte.MAX_VALUE) << i10;
                if ((b5 & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void G() {
            int i10 = this.f4888g + this.f4889h;
            this.f4888g = i10;
            int i11 = this.f4892k + i10;
            int i12 = this.f4893l;
            if (i11 <= i12) {
                this.f4889h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f4889h = i13;
            this.f4888g = i10 - i13;
        }

        public final void H(int i10) {
            if (!J(i10)) {
                if (i10 > (this.c - this.f4892k) - this.f4890i) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                throw InvalidProtocolBufferException.f();
            }
        }

        public final void I(int i10) {
            int i11 = this.f4888g;
            int i12 = this.f4890i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f4890i = i12 + i10;
                return;
            }
            InputStream inputStream = this.f4886e;
            if (i10 >= 0) {
                int i13 = this.f4892k;
                int i14 = i13 + i12;
                int i15 = i14 + i10;
                int i16 = this.f4893l;
                if (i15 <= i16) {
                    this.f4892k = i14;
                    int i17 = i11 - i12;
                    this.f4888g = 0;
                    this.f4890i = 0;
                    while (i17 < i10) {
                        long j2 = i10 - i17;
                        try {
                            long skip = inputStream.skip(j2);
                            int i18 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i18 >= 0 && skip <= j2) {
                                if (i18 == 0) {
                                    break;
                                }
                                i17 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.f4892k += i17;
                            G();
                        }
                    }
                    if (i17 < i10) {
                        int i19 = this.f4888g;
                        int i20 = i19 - this.f4890i;
                        this.f4890i = i19;
                        while (true) {
                            H(1);
                            int i21 = i10 - i20;
                            int i22 = this.f4888g;
                            if (i21 > i22) {
                                i20 += i22;
                                this.f4890i = i22;
                            } else {
                                this.f4890i = i21;
                                return;
                            }
                        }
                    }
                } else {
                    I((i16 - i13) - i12);
                    throw InvalidProtocolBufferException.f();
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final boolean J(int i10) {
            InputStream inputStream;
            int i11 = this.f4890i;
            int i12 = i11 + i10;
            int i13 = this.f4888g;
            if (i12 > i13) {
                int i14 = this.f4892k;
                int i15 = this.c;
                if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f4893l) {
                    return false;
                }
                byte[] bArr = this.f4887f;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f4892k += i11;
                    this.f4888g -= i11;
                    this.f4890i = 0;
                }
                int i16 = this.f4888g;
                int min = Math.min(bArr.length - i16, (i15 - this.f4892k) - i16);
                int read = this.f4886e.read(bArr, i16, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f4888g += read;
                    G();
                    if (this.f4888g >= i10) {
                        return true;
                    }
                    return J(i10);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException(a4.b.i("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void a(int i10) {
            if (this.f4891j == i10) {
                return;
            }
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int b() {
            return this.f4892k + this.f4890i;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean c() {
            return this.f4890i == this.f4888g && !J(1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void d(int i10) {
            this.f4893l = i10;
            G();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f4892k + this.f4890i + i10;
                int i12 = this.f4893l;
                if (i11 <= i12) {
                    this.f4893l = i11;
                    G();
                    return i12;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean f() {
            return E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final ByteString g() {
            int D = D();
            int i10 = this.f4888g;
            int i11 = this.f4890i;
            int i12 = i10 - i11;
            byte[] bArr = this.f4887f;
            if (D <= i12 && D > 0) {
                ByteString g10 = ByteString.g(bArr, i11, D);
                this.f4890i += D;
                return g10;
            } else if (D == 0) {
                return ByteString.f4776j;
            } else {
                byte[] z10 = z(D);
                if (z10 != null) {
                    return ByteString.g(z10, 0, z10.length);
                }
                int i13 = this.f4890i;
                int i14 = this.f4888g;
                int i15 = i14 - i13;
                this.f4892k += i14;
                this.f4890i = 0;
                this.f4888g = 0;
                ArrayList A = A(D - i15);
                byte[] bArr2 = new byte[D];
                System.arraycopy(bArr, i13, bArr2, 0, i15);
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
                    i15 += bArr3.length;
                }
                ByteString byteString = ByteString.f4776j;
                return new ByteString.LiteralByteString(bArr2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final double h() {
            return Double.longBitsToDouble(C());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int i() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int j() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long k() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final float l() {
            return Float.intBitsToFloat(B());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int m() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long n() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int o() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long p() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int q() {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long r() {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final String s() {
            String str;
            int D = D();
            byte[] bArr = this.f4887f;
            if (D > 0) {
                int i10 = this.f4888g;
                int i11 = this.f4890i;
                if (D <= i10 - i11) {
                    str = new String(bArr, i11, D, u.f4942a);
                    this.f4890i += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= this.f4888g) {
                H(D);
                str = new String(bArr, this.f4890i, D, u.f4942a);
                this.f4890i += D;
                return str;
            }
            return new String(y(D), u.f4942a);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final String t() {
            byte[] y10;
            int i10;
            int D = D();
            int i11 = this.f4890i;
            int i12 = this.f4888g;
            if (D <= i12 - i11 && D > 0) {
                i10 = i11 + D;
            } else if (D == 0) {
                return "";
            } else {
                i11 = 0;
                if (D <= i12) {
                    H(D);
                    i10 = D + 0;
                } else {
                    y10 = y(D);
                    return Utf8.f4824a.a(y10, i11, D);
                }
            }
            this.f4890i = i10;
            y10 = this.f4887f;
            return Utf8.f4824a.a(y10, i11, D);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int u() {
            if (c()) {
                this.f4891j = 0;
                return 0;
            }
            int D = D();
            this.f4891j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final int v() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final long w() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                return false;
                            }
                            if (i12 == 5) {
                                I(4);
                                return true;
                            }
                            int i14 = InvalidProtocolBufferException.f4807i;
                            throw new InvalidProtocolBufferException.InvalidWireTypeException();
                        }
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    i11 = D();
                } else {
                    i11 = 8;
                }
                I(i11);
                return true;
            }
            int i15 = this.f4888g - this.f4890i;
            byte[] bArr = this.f4887f;
            if (i15 >= 10) {
                while (i13 < 10) {
                    int i16 = this.f4890i;
                    this.f4890i = i16 + 1;
                    if (bArr[i16] < 0) {
                        i13++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i13 < 10) {
                if (this.f4890i == this.f4888g) {
                    H(1);
                }
                int i17 = this.f4890i;
                this.f4890i = i17 + 1;
                if (bArr[i17] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }

        public final byte[] y(int i10) {
            byte[] z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            int i11 = this.f4890i;
            int i12 = this.f4888g;
            int i13 = i12 - i11;
            this.f4892k += i12;
            this.f4890i = 0;
            this.f4888g = 0;
            ArrayList A = A(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f4887f, i11, bArr, 0, i13);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i10) {
            if (i10 == 0) {
                return u.f4943b;
            }
            if (i10 >= 0) {
                int i11 = this.f4892k;
                int i12 = this.f4890i;
                int i13 = i11 + i12 + i10;
                if (i13 - this.c <= 0) {
                    int i14 = this.f4893l;
                    if (i13 <= i14) {
                        int i15 = this.f4888g - i12;
                        int i16 = i10 - i15;
                        InputStream inputStream = this.f4886e;
                        if (i16 >= 4096 && i16 > inputStream.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f4887f, this.f4890i, bArr, 0, i15);
                        this.f4892k += this.f4888g;
                        this.f4890i = 0;
                        this.f4888g = 0;
                        while (i15 < i10) {
                            int read = inputStream.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f4892k += read;
                                i15 += read;
                            } else {
                                throw InvalidProtocolBufferException.f();
                            }
                        }
                        return bArr;
                    }
                    I((i14 - i11) - i12);
                    throw InvalidProtocolBufferException.f();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i10);

    public abstract int e(int i10);

    public abstract boolean f();

    public abstract ByteString g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i10);
}
