package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {
    public int c;

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f14559e;

    /* renamed from: f  reason: collision with root package name */
    public int f14560f;

    /* renamed from: i  reason: collision with root package name */
    public int f14563i;

    /* renamed from: h  reason: collision with root package name */
    public int f14562h = Integer.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14556a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f14557b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f14558d = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f14561g = 0;

    public c(InputStream inputStream) {
        this.f14559e = inputStream;
    }

    public final void a(int i10) {
        if (this.f14560f == i10) {
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public final int b() {
        int i10 = this.f14562h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f14561g + this.f14558d);
    }

    public final void c(int i10) {
        this.f14562h = i10;
        o();
    }

    public final int d(int i10) {
        if (i10 >= 0) {
            int i11 = this.f14561g + this.f14558d + i10;
            int i12 = this.f14562h;
            if (i11 <= i12) {
                this.f14562h = i11;
                o();
                return i12;
            }
            throw InvalidProtocolBufferException.b();
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final i9.e e() {
        int k3 = k();
        int i10 = this.f14557b;
        int i11 = this.f14558d;
        if (k3 <= i10 - i11 && k3 > 0) {
            i9.e eVar = i9.a.f11832i;
            byte[] bArr = new byte[k3];
            System.arraycopy(this.f14556a, i11, bArr, 0, k3);
            i9.e eVar2 = new i9.e(bArr);
            this.f14558d += k3;
            return eVar2;
        } else if (k3 == 0) {
            return i9.a.f11832i;
        } else {
            return new i9.e(h(k3));
        }
    }

    public final int f() {
        return k();
    }

    public final h g(b bVar, d dVar) {
        int k3 = k();
        if (this.f14563i < 64) {
            int d5 = d(k3);
            this.f14563i++;
            h hVar = (h) bVar.a(this, dVar);
            a(0);
            this.f14563i--;
            c(d5);
            return hVar;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] h(int i10) {
        int read;
        if (i10 <= 0) {
            if (i10 == 0) {
                return f.f14571a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f14561g;
        int i12 = this.f14558d;
        int i13 = i11 + i12 + i10;
        int i14 = this.f14562h;
        if (i13 <= i14) {
            byte[] bArr = this.f14556a;
            if (i10 < 4096) {
                byte[] bArr2 = new byte[i10];
                int i15 = this.f14557b - i12;
                System.arraycopy(bArr, i12, bArr2, 0, i15);
                int i16 = this.f14557b;
                this.f14558d = i16;
                int i17 = i10 - i15;
                if (i16 - i16 < i17) {
                    p(i17);
                }
                System.arraycopy(bArr, 0, bArr2, i15, i17);
                this.f14558d = i17;
                return bArr2;
            }
            int i18 = this.f14557b;
            this.f14561g = i11 + i18;
            this.f14558d = 0;
            this.f14557b = 0;
            int i19 = i18 - i12;
            int i20 = i10 - i19;
            ArrayList arrayList = new ArrayList();
            while (i20 > 0) {
                int min = Math.min(i20, 4096);
                byte[] bArr3 = new byte[min];
                int i21 = 0;
                while (i21 < min) {
                    InputStream inputStream = this.f14559e;
                    if (inputStream == null) {
                        read = -1;
                    } else {
                        read = inputStream.read(bArr3, i21, min - i21);
                    }
                    if (read != -1) {
                        this.f14561g += read;
                        i21 += read;
                    } else {
                        throw InvalidProtocolBufferException.b();
                    }
                }
                i20 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr, i12, bArr4, 0, i19);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i19, bArr5.length);
                i19 += bArr5.length;
            }
            return bArr4;
        }
        r((i14 - i11) - i12);
        throw InvalidProtocolBufferException.b();
    }

    public final int i() {
        int i10 = this.f14558d;
        if (this.f14557b - i10 < 4) {
            p(4);
            i10 = this.f14558d;
        }
        this.f14558d = i10 + 4;
        byte[] bArr = this.f14556a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long j() {
        int i10 = this.f14558d;
        if (this.f14557b - i10 < 8) {
            p(8);
            i10 = this.f14558d;
        }
        this.f14558d = i10 + 8;
        byte[] bArr = this.f14556a;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r3[r2] < 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k() {
        int i10;
        byte b5;
        int i11;
        long j2;
        int i12 = this.f14558d;
        int i13 = this.f14557b;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f14556a;
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                this.f14558d = i14;
                return b10;
            } else if (i13 - i14 >= 9) {
                int i15 = i14 + 1;
                int i16 = b10 ^ (bArr[i14] << 7);
                long j10 = i16;
                if (j10 >= 0) {
                    int i17 = i15 + 1;
                    int i18 = i16 ^ (bArr[i15] << 14);
                    long j11 = i18;
                    if (j11 >= 0) {
                        i11 = (int) (16256 ^ j11);
                    } else {
                        i15 = i17 + 1;
                        j10 = i18 ^ (bArr[i17] << 21);
                        if (j10 < 0) {
                            j2 = -2080896;
                        } else {
                            i17 = i15 + 1;
                            i11 = (int) ((i10 ^ (b5 << 28)) ^ 266354560);
                            if (bArr[i15] < 0) {
                                i15 = i17 + 1;
                                if (bArr[i17] < 0) {
                                    i17 = i15 + 1;
                                    if (bArr[i15] < 0) {
                                        i15 = i17 + 1;
                                        if (bArr[i17] < 0) {
                                            i17 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                i15 = i17 + 1;
                                            }
                                        }
                                    }
                                }
                                this.f14558d = i15;
                                return i11;
                            }
                        }
                    }
                    i15 = i17;
                    this.f14558d = i15;
                    return i11;
                }
                j2 = -128;
                i11 = (int) (j2 ^ j10);
                this.f14558d = i15;
                return i11;
            }
        }
        return (int) m();
    }

    public final long l() {
        long j2;
        long j10;
        long j11;
        long j12;
        int i10 = this.f14558d;
        int i11 = this.f14557b;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f14556a;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f14558d = i12;
                return b5;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                long j13 = b5 ^ (bArr[i12] << 7);
                if (j13 < 0) {
                    j10 = (-128) ^ j13;
                } else {
                    int i14 = i13 + 1;
                    long j14 = (bArr[i13] << 14) ^ j13;
                    if (j14 >= 0) {
                        j10 = j14 ^ 16256;
                        i13 = i14;
                    } else {
                        int i15 = i14 + 1;
                        long j15 = j14 ^ (bArr[i14] << 21);
                        if (j15 < 0) {
                            j11 = -2080896;
                        } else {
                            int i16 = i15 + 1;
                            long j16 = j15 ^ (bArr[i15] << 28);
                            if (j16 >= 0) {
                                j12 = 266354560;
                            } else {
                                i15 = i16 + 1;
                                j15 = j16 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i16 = i15 + 1;
                                    j16 = j15 ^ (bArr[i15] << 42);
                                    if (j16 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i15 = i16 + 1;
                                        j15 = j16 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i16 = i15 + 1;
                                            j2 = (j15 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i15 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j10 = j2;
                                                    i13 = i15;
                                                }
                                            }
                                            i13 = i16;
                                            j10 = j2;
                                        }
                                    }
                                }
                            }
                            j2 = j16 ^ j12;
                            i13 = i16;
                            j10 = j2;
                        }
                        j10 = j11 ^ j15;
                        i13 = i15;
                    }
                }
                this.f14558d = i13;
                return j10;
            }
        }
        return m();
    }

    public final long m() {
        long j2 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f14558d == this.f14557b) {
                p(1);
            }
            int i11 = this.f14558d;
            this.f14558d = i11 + 1;
            byte b5 = this.f14556a[i11];
            j2 |= (b5 & Byte.MAX_VALUE) << i10;
            if ((b5 & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n() {
        boolean z10;
        if (this.f14558d == this.f14557b) {
            z10 = true;
            if (!s(1)) {
                if (!z10) {
                    this.f14560f = 0;
                    return 0;
                }
                int k3 = k();
                this.f14560f = k3;
                if ((k3 >>> 3) != 0) {
                    return k3;
                }
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void o() {
        int i10 = this.f14557b + this.c;
        this.f14557b = i10;
        int i11 = this.f14561g + i10;
        int i12 = this.f14562h;
        if (i11 <= i12) {
            this.c = 0;
            return;
        }
        int i13 = i11 - i12;
        this.c = i13;
        this.f14557b = i10 - i13;
    }

    public final void p(int i10) {
        if (!s(i10)) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean q(int i10, CodedOutputStream codedOutputStream) {
        int n;
        int i11 = i10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                int i12 = i();
                                codedOutputStream.v(i10);
                                codedOutputStream.t(i12);
                                return true;
                            }
                            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    codedOutputStream.v(i10);
                    do {
                        n = n();
                        if (n == 0) {
                            break;
                        }
                    } while (q(n, codedOutputStream));
                    int i13 = ((i10 >>> 3) << 3) | 4;
                    a(i13);
                    codedOutputStream.v(i13);
                    return true;
                }
                i9.e e10 = e();
                codedOutputStream.v(i10);
                codedOutputStream.v(e10.size());
                codedOutputStream.r(e10);
                return true;
            }
            long j2 = j();
            codedOutputStream.v(i10);
            codedOutputStream.u(j2);
            return true;
        }
        long l2 = l();
        codedOutputStream.v(i10);
        codedOutputStream.w(l2);
        return true;
    }

    public final void r(int i10) {
        int i11 = this.f14557b;
        int i12 = this.f14558d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f14558d = i12 + i10;
        } else if (i10 >= 0) {
            int i14 = this.f14561g;
            int i15 = i14 + i12 + i10;
            int i16 = this.f14562h;
            if (i15 <= i16) {
                this.f14558d = i11;
                while (true) {
                    p(1);
                    int i17 = i10 - i13;
                    int i18 = this.f14557b;
                    if (i17 > i18) {
                        i13 += i18;
                        this.f14558d = i18;
                    } else {
                        this.f14558d = i17;
                        return;
                    }
                }
            } else {
                r((i16 - i14) - i12);
                throw InvalidProtocolBufferException.b();
            }
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean s(int i10) {
        InputStream inputStream;
        int i11 = this.f14558d;
        int i12 = i11 + i10;
        int i13 = this.f14557b;
        if (i12 > i13) {
            if (this.f14561g + i11 + i10 <= this.f14562h && (inputStream = this.f14559e) != null) {
                byte[] bArr = this.f14556a;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f14561g += i11;
                    this.f14557b -= i11;
                    this.f14558d = 0;
                }
                int i14 = this.f14557b;
                int read = inputStream.read(bArr, i14, bArr.length - i14);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.f14557b += read;
                        if ((this.f14561g + i10) - 67108864 <= 0) {
                            o();
                            if (this.f14557b >= i10) {
                                return true;
                            }
                            return s(i10);
                        }
                        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i10);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }
}
