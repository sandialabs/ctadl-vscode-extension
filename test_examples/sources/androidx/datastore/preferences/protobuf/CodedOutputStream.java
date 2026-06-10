package androidx.datastore.preferences.protobuf;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends k {

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f4780j = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f4781k = f1.f4872f;

    /* renamed from: i  reason: collision with root package name */
    public i f4782i;

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a extends CodedOutputStream {

        /* renamed from: l  reason: collision with root package name */
        public final byte[] f4783l;

        /* renamed from: m  reason: collision with root package name */
        public final int f4784m;
        public int n;

        public a(int i10) {
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f4783l = bArr;
                this.f4784m = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void F1(int i10) {
            int i11 = this.n;
            int i12 = i11 + 1;
            byte[] bArr = this.f4783l;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.n = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void G1(long j2) {
            int i10 = this.n;
            int i11 = i10 + 1;
            byte[] bArr = this.f4783l;
            bArr[i10] = (byte) (j2 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j2 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j2 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j2 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j2 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j2 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j2 >> 48)) & 255);
            this.n = i17 + 1;
            bArr[i17] = (byte) (((int) (j2 >> 56)) & 255);
        }

        public final void H1(int i10, int i11) {
            I1((i10 << 3) | i11);
        }

        public final void I1(int i10) {
            boolean z10 = CodedOutputStream.f4781k;
            byte[] bArr = this.f4783l;
            if (z10) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.n;
                    this.n = i11 + 1;
                    f1.p(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                int i12 = this.n;
                this.n = i12 + 1;
                f1.p(bArr, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                int i13 = this.n;
                this.n = i13 + 1;
                bArr[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            int i14 = this.n;
            this.n = i14 + 1;
            bArr[i14] = (byte) i10;
        }

        public final void J1(long j2) {
            boolean z10 = CodedOutputStream.f4781k;
            byte[] bArr = this.f4783l;
            if (z10) {
                while ((j2 & (-128)) != 0) {
                    int i10 = this.n;
                    this.n = i10 + 1;
                    f1.p(bArr, i10, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                int i11 = this.n;
                this.n = i11 + 1;
                f1.p(bArr, i11, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                int i12 = this.n;
                this.n = i12 + 1;
                bArr[i12] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            int i13 = this.n;
            this.n = i13 + 1;
            bArr[i13] = (byte) j2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends CodedOutputStream {

        /* renamed from: l  reason: collision with root package name */
        public final byte[] f4785l;

        /* renamed from: m  reason: collision with root package name */
        public final int f4786m;
        public int n;

        public b(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) >= 0) {
                this.f4785l = bArr;
                this.n = 0;
                this.f4786m = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A1(int i10, int i11) {
            C1((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B1(int i10, int i11) {
            A1(i10, 0);
            C1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C1(int i10) {
            boolean z10 = CodedOutputStream.f4781k;
            int i11 = this.f4786m;
            byte[] bArr = this.f4785l;
            if (z10 && !d.a()) {
                int i12 = this.n;
                if (i11 - i12 >= 5) {
                    if ((i10 & (-128)) != 0) {
                        this.n = i12 + 1;
                        f1.p(bArr, i12, (byte) (i10 | 128));
                        i10 >>>= 7;
                        if ((i10 & (-128)) != 0) {
                            int i13 = this.n;
                            this.n = i13 + 1;
                            f1.p(bArr, i13, (byte) (i10 | 128));
                            i10 >>>= 7;
                            if ((i10 & (-128)) != 0) {
                                int i14 = this.n;
                                this.n = i14 + 1;
                                f1.p(bArr, i14, (byte) (i10 | 128));
                                i10 >>>= 7;
                                if ((i10 & (-128)) != 0) {
                                    int i15 = this.n;
                                    this.n = i15 + 1;
                                    f1.p(bArr, i15, (byte) (i10 | 128));
                                    i10 >>>= 7;
                                    i12 = this.n;
                                    this.n = i12 + 1;
                                    f1.p(bArr, i12, (byte) i10);
                                    return;
                                }
                            }
                        }
                        i12 = this.n;
                    }
                    this.n = i12 + 1;
                    f1.p(bArr, i12, (byte) i10);
                    return;
                }
            }
            while ((i10 & (-128)) != 0) {
                try {
                    int i16 = this.n;
                    this.n = i16 + 1;
                    bArr[i16] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(i11), 1), e10);
                }
            }
            int i17 = this.n;
            this.n = i17 + 1;
            bArr[i17] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D1(long j2, int i10) {
            A1(i10, 0);
            E1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E1(long j2) {
            boolean z10 = CodedOutputStream.f4781k;
            int i10 = this.f4786m;
            byte[] bArr = this.f4785l;
            if (z10 && i10 - this.n >= 10) {
                while ((j2 & (-128)) != 0) {
                    int i11 = this.n;
                    this.n = i11 + 1;
                    f1.p(bArr, i11, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                int i12 = this.n;
                this.n = i12 + 1;
                f1.p(bArr, i12, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    int i13 = this.n;
                    this.n = i13 + 1;
                    bArr[i13] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(i10), 1), e10);
                }
            }
            int i14 = this.n;
            this.n = i14 + 1;
            bArr[i14] = (byte) j2;
        }

        public final void F1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f4785l, this.n, i11);
                this.n += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.f4786m), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void K0(byte[] bArr, int i10, int i11) {
            F1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j1(byte b5) {
            try {
                byte[] bArr = this.f4785l;
                int i10 = this.n;
                this.n = i10 + 1;
                bArr[i10] = b5;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.f4786m), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k1(int i10, boolean z10) {
            A1(i10, 0);
            j1(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l1(byte[] bArr, int i10) {
            C1(i10);
            F1(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m1(int i10, ByteString byteString) {
            A1(i10, 2);
            n1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n1(ByteString byteString) {
            C1(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o1(int i10, int i11) {
            A1(i10, 5);
            p1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p1(int i10) {
            try {
                byte[] bArr = this.f4785l;
                int i11 = this.n;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.n = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.f4786m), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q1(long j2, int i10) {
            A1(i10, 1);
            r1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r1(long j2) {
            try {
                byte[] bArr = this.f4785l;
                int i10 = this.n;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j2) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j2 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j2 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j2 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j2 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j2 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j2 >> 48)) & 255);
                this.n = i17 + 1;
                bArr[i17] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.n), Integer.valueOf(this.f4786m), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s1(int i10, int i11) {
            A1(i10, 0);
            t1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t1(int i10) {
            if (i10 >= 0) {
                C1(i10);
            } else {
                E1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u1(int i10, i0 i0Var, w0 w0Var) {
            A1(i10, 2);
            C1(((androidx.datastore.preferences.protobuf.a) i0Var).i(w0Var));
            w0Var.d(i0Var, this.f4782i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v1(i0 i0Var) {
            C1(i0Var.b());
            i0Var.e(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w1(int i10, i0 i0Var) {
            A1(1, 3);
            B1(2, i10);
            A1(3, 2);
            v1(i0Var);
            A1(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x1(int i10, ByteString byteString) {
            A1(1, 3);
            B1(2, i10);
            m1(3, byteString);
            A1(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y1(String str, int i10) {
            A1(i10, 2);
            z1(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z1(String str) {
            int b5;
            int i10 = this.n;
            try {
                int f12 = CodedOutputStream.f1(str.length() * 3);
                int f13 = CodedOutputStream.f1(str.length());
                int i11 = this.f4786m;
                byte[] bArr = this.f4785l;
                if (f13 == f12) {
                    int i12 = i10 + f13;
                    this.n = i12;
                    b5 = Utf8.f4824a.b(str, bArr, i12, i11 - i12);
                    this.n = i10;
                    C1((b5 - i10) - f13);
                } else {
                    C1(Utf8.a(str));
                    int i13 = this.n;
                    b5 = Utf8.f4824a.b(str, bArr, i13, i11 - i13);
                }
                this.n = b5;
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.n = i10;
                i1(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: o  reason: collision with root package name */
        public final OutputStream f4787o;

        public c(SingleProcessDataStore.b bVar, int i10) {
            super(i10);
            this.f4787o = bVar;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A1(int i10, int i11) {
            C1((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B1(int i10, int i11) {
            L1(20);
            H1(i10, 0);
            I1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C1(int i10) {
            L1(5);
            I1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D1(long j2, int i10) {
            L1(20);
            H1(i10, 0);
            J1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E1(long j2) {
            L1(10);
            J1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void K0(byte[] bArr, int i10, int i11) {
            M1(bArr, i10, i11);
        }

        public final void K1() {
            this.f4787o.write(this.f4783l, 0, this.n);
            this.n = 0;
        }

        public final void L1(int i10) {
            if (this.f4784m - this.n < i10) {
                K1();
            }
        }

        public final void M1(byte[] bArr, int i10, int i11) {
            int i12 = this.n;
            int i13 = this.f4784m;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f4783l;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.n += i11;
                return;
            }
            System.arraycopy(bArr, i10, bArr2, i12, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.n = i13;
            K1();
            if (i16 > i13) {
                this.f4787o.write(bArr, i15, i16);
                return;
            }
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.n = i16;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j1(byte b5) {
            if (this.n == this.f4784m) {
                K1();
            }
            int i10 = this.n;
            this.n = i10 + 1;
            this.f4783l[i10] = b5;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k1(int i10, boolean z10) {
            L1(11);
            H1(i10, 0);
            byte b5 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.n;
            this.n = i11 + 1;
            this.f4783l[i11] = b5;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l1(byte[] bArr, int i10) {
            C1(i10);
            M1(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m1(int i10, ByteString byteString) {
            A1(i10, 2);
            n1(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n1(ByteString byteString) {
            C1(byteString.size());
            byteString.v(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o1(int i10, int i11) {
            L1(14);
            H1(i10, 5);
            F1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p1(int i10) {
            L1(4);
            F1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q1(long j2, int i10) {
            L1(18);
            H1(i10, 1);
            G1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r1(long j2) {
            L1(8);
            G1(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s1(int i10, int i11) {
            L1(20);
            H1(i10, 0);
            if (i11 >= 0) {
                I1(i11);
            } else {
                J1(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t1(int i10) {
            if (i10 >= 0) {
                C1(i10);
            } else {
                E1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u1(int i10, i0 i0Var, w0 w0Var) {
            A1(i10, 2);
            C1(((androidx.datastore.preferences.protobuf.a) i0Var).i(w0Var));
            w0Var.d(i0Var, this.f4782i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v1(i0 i0Var) {
            C1(i0Var.b());
            i0Var.e(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w1(int i10, i0 i0Var) {
            A1(1, 3);
            B1(2, i10);
            A1(3, 2);
            v1(i0Var);
            A1(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x1(int i10, ByteString byteString) {
            A1(1, 3);
            B1(2, i10);
            m1(3, byteString);
            A1(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y1(String str, int i10) {
            A1(i10, 2);
            z1(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z1(String str) {
            try {
                int length = str.length() * 3;
                int f12 = CodedOutputStream.f1(length);
                int i10 = f12 + length;
                int i11 = this.f4784m;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int b5 = Utf8.f4824a.b(str, bArr, 0, length);
                    C1(b5);
                    M1(bArr, 0, b5);
                    return;
                }
                if (i10 > i11 - this.n) {
                    K1();
                }
                int f13 = CodedOutputStream.f1(str.length());
                int i12 = this.n;
                byte[] bArr2 = this.f4783l;
                try {
                    try {
                        if (f13 == f12) {
                            int i13 = i12 + f13;
                            this.n = i13;
                            int b10 = Utf8.f4824a.b(str, bArr2, i13, i11 - i13);
                            this.n = i12;
                            I1((b10 - i12) - f13);
                            this.n = b10;
                        } else {
                            int a10 = Utf8.a(str);
                            I1(a10);
                            this.n = Utf8.f4824a.b(str, bArr2, this.n, a10);
                        }
                    } catch (Utf8.UnpairedSurrogateException e10) {
                        this.n = i12;
                        throw e10;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                i1(str, e12);
            }
        }
    }

    public static int L0(int i10) {
        return d1(i10) + 1;
    }

    public static int M0(int i10, ByteString byteString) {
        int d12 = d1(i10);
        int size = byteString.size();
        return f1(size) + size + d12;
    }

    public static int N0(int i10) {
        return d1(i10) + 8;
    }

    public static int O0(int i10, int i11) {
        return U0(i11) + d1(i10);
    }

    public static int P0(int i10) {
        return d1(i10) + 4;
    }

    public static int Q0(int i10) {
        return d1(i10) + 8;
    }

    public static int R0(int i10) {
        return d1(i10) + 4;
    }

    @Deprecated
    public static int S0(int i10, i0 i0Var, w0 w0Var) {
        return ((androidx.datastore.preferences.protobuf.a) i0Var).i(w0Var) + (d1(i10) * 2);
    }

    public static int T0(int i10, int i11) {
        return U0(i11) + d1(i10);
    }

    public static int U0(int i10) {
        if (i10 >= 0) {
            return f1(i10);
        }
        return 10;
    }

    public static int V0(long j2, int i10) {
        return h1(j2) + d1(i10);
    }

    public static int W0(w wVar) {
        int i10;
        if (wVar.f4950b != null) {
            i10 = wVar.f4950b.size();
        } else if (wVar.f4949a != null) {
            i10 = wVar.f4949a.b();
        } else {
            i10 = 0;
        }
        return f1(i10) + i10;
    }

    public static int X0(int i10) {
        return d1(i10) + 4;
    }

    public static int Y0(int i10) {
        return d1(i10) + 8;
    }

    public static int Z0(int i10, int i11) {
        return f1((i11 >> 31) ^ (i11 << 1)) + d1(i10);
    }

    public static int a1(long j2, int i10) {
        return h1((j2 >> 63) ^ (j2 << 1)) + d1(i10);
    }

    public static int b1(String str, int i10) {
        return c1(str) + d1(i10);
    }

    public static int c1(String str) {
        int length;
        try {
            length = Utf8.a(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(u.f4942a).length;
        }
        return f1(length) + length;
    }

    public static int d1(int i10) {
        return f1((i10 << 3) | 0);
    }

    public static int e1(int i10, int i11) {
        return f1(i11) + d1(i10);
    }

    public static int f1(int i10) {
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

    public static int g1(long j2, int i10) {
        return h1(j2) + d1(i10);
    }

    public static int h1(long j2) {
        int i10;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i10 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A1(int i10, int i11);

    public abstract void B1(int i10, int i11);

    public abstract void C1(int i10);

    public abstract void D1(long j2, int i10);

    public abstract void E1(long j2);

    public final void i1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f4780j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(u.f4942a);
        try {
            C1(bytes.length);
            K0(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public abstract void j1(byte b5);

    public abstract void k1(int i10, boolean z10);

    public abstract void l1(byte[] bArr, int i10);

    public abstract void m1(int i10, ByteString byteString);

    public abstract void n1(ByteString byteString);

    public abstract void o1(int i10, int i11);

    public abstract void p1(int i10);

    public abstract void q1(long j2, int i10);

    public abstract void r1(long j2);

    public abstract void s1(int i10, int i11);

    public abstract void t1(int i10);

    public abstract void u1(int i10, i0 i0Var, w0 w0Var);

    public abstract void v1(i0 i0Var);

    public abstract void w1(int i10, i0 i0Var);

    public abstract void x1(int i10, ByteString byteString);

    public abstract void y1(String str, int i10);

    public abstract void z1(String str);
}
