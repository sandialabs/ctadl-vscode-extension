package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CodedOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14520a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14521b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final OutputStream f14522d;

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f14522d = outputStream;
        this.f14520a = bArr;
        this.f14521b = bArr.length;
    }

    public static int a(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int b(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int c(int i10) {
        if (i10 >= 0) {
            return f(i10);
        }
        return 10;
    }

    public static int d(int i10, h hVar) {
        int h10 = h(i10);
        int b5 = hVar.b();
        return f(b5) + b5 + h10;
    }

    public static int e(h hVar) {
        int b5 = hVar.b();
        return f(b5) + b5;
    }

    public static int f(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i10) {
        return f((i10 << 3) | 0);
    }

    public static CodedOutputStream j(OutputStream outputStream, int i10) {
        return new CodedOutputStream(outputStream, new byte[i10]);
    }

    public final void i() {
        if (this.f14522d != null) {
            k();
        }
    }

    public final void k() {
        OutputStream outputStream = this.f14522d;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f14520a, 0, this.c);
        this.c = 0;
    }

    public final void l(int i10, int i11) {
        x(i10, 0);
        n(i11);
    }

    public final void m(int i10, int i11) {
        x(i10, 0);
        n(i11);
    }

    public final void n(int i10) {
        if (i10 >= 0) {
            v(i10);
        } else {
            w(i10);
        }
    }

    public final void o(int i10, h hVar) {
        x(i10, 2);
        p(hVar);
    }

    public final void p(h hVar) {
        v(hVar.b());
        hVar.f(this);
    }

    public final void q(int i10) {
        byte b5 = (byte) i10;
        if (this.c == this.f14521b) {
            k();
        }
        int i11 = this.c;
        this.c = i11 + 1;
        this.f14520a[i11] = b5;
    }

    public final void r(i9.a aVar) {
        int size = aVar.size();
        int i10 = this.c;
        int i11 = this.f14521b;
        int i12 = i11 - i10;
        byte[] bArr = this.f14520a;
        if (i12 >= size) {
            aVar.g(0, i10, size, bArr);
            this.c += size;
            return;
        }
        aVar.g(0, i10, i12, bArr);
        int i13 = i12 + 0;
        int i14 = size - i12;
        this.c = i11;
        k();
        if (i14 <= i11) {
            aVar.g(i13, 0, i14, bArr);
            this.c = i14;
        } else if (i13 >= 0) {
            if (i14 >= 0) {
                int i15 = i13 + i14;
                if (i15 <= aVar.size()) {
                    if (i14 > 0) {
                        aVar.B(this.f14522d, i13, i14);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(39);
                sb.append("Source end offset exceeded: ");
                sb.append(i15);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i14);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Source offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final void s(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.c;
        int i11 = this.f14521b;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f14520a;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        int i13 = i12 + 0;
        int i14 = length - i12;
        this.c = i11;
        k();
        if (i14 <= i11) {
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            this.c = i14;
            return;
        }
        this.f14522d.write(bArr, i13, i14);
    }

    public final void t(int i10) {
        q(i10 & 255);
        q((i10 >> 8) & 255);
        q((i10 >> 16) & 255);
        q((i10 >> 24) & 255);
    }

    public final void u(long j2) {
        q(((int) j2) & 255);
        q(((int) (j2 >> 8)) & 255);
        q(((int) (j2 >> 16)) & 255);
        q(((int) (j2 >> 24)) & 255);
        q(((int) (j2 >> 32)) & 255);
        q(((int) (j2 >> 40)) & 255);
        q(((int) (j2 >> 48)) & 255);
        q(((int) (j2 >> 56)) & 255);
    }

    public final void v(int i10) {
        while ((i10 & (-128)) != 0) {
            q((i10 & 127) | 128);
            i10 >>>= 7;
        }
        q(i10);
    }

    public final void w(long j2) {
        while (((-128) & j2) != 0) {
            q((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        q((int) j2);
    }

    public final void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }
}
