package i9;

import i9.a;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class e extends i9.a {

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f11842j;

    /* renamed from: k  reason: collision with root package name */
    public int f11843k = 0;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0132a, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f11844i = 0;

        /* renamed from: j  reason: collision with root package name */
        public final int f11845j;

        public a() {
            this.f11845j = e.this.f11842j.length;
        }

        public final byte a() {
            try {
                byte[] bArr = e.this.f11842j;
                int i10 = this.f11844i;
                this.f11844i = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Byte> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f11844i < this.f11845j;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public e(byte[] bArr) {
        this.f11842j = bArr;
    }

    @Override // i9.a
    public final String A() {
        byte[] bArr = this.f11842j;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // i9.a
    public final void B(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f11842j, D() + i10, i11);
    }

    public final boolean C(e eVar, int i10, int i11) {
        if (i11 > eVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i10 + i11 <= eVar.size()) {
            int D = D() + i11;
            int D2 = D();
            int D3 = eVar.D() + i10;
            while (D2 < D) {
                if (this.f11842j[D2] != eVar.f11842j[D3]) {
                    return false;
                }
                D2++;
                D3++;
            }
            return true;
        } else {
            int size2 = eVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int D() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i9.a) || size() != ((i9.a) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof e) {
            return C((e) obj, 0, size());
        }
        if (obj instanceof h) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(androidx.activity.e.k(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // i9.a
    public void h(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f11842j, i10, bArr, i11, i12);
    }

    public final int hashCode() {
        int i10 = this.f11843k;
        if (i10 == 0) {
            int size = size();
            i10 = x(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11843k = i10;
        }
        return i10;
    }

    @Override // i9.a
    public final int s() {
        return 0;
    }

    @Override // i9.a
    public int size() {
        return this.f11842j.length;
    }

    @Override // i9.a
    public final boolean t() {
        return true;
    }

    @Override // i9.a
    public final boolean u() {
        byte[] bArr = this.f11842j;
        if (a1.b.w0(bArr, 0, bArr.length + 0) != 0) {
            return false;
        }
        return true;
    }

    @Override // i9.a, java.lang.Iterable
    /* renamed from: v */
    public a.InterfaceC0132a iterator() {
        return new a();
    }

    @Override // i9.a
    public final int x(int i10, int i11, int i12) {
        int D = D() + i11;
        for (int i13 = D; i13 < D + i12; i13++) {
            i10 = (i10 * 31) + this.f11842j[i13];
        }
        return i10;
    }

    @Override // i9.a
    public final int y(int i10, int i11, int i12) {
        int i13;
        int i14;
        byte b5 = 0;
        int i15 = i11 + 0;
        int i16 = i12 + i15;
        byte[] bArr = this.f11842j;
        if (i10 != 0) {
            if (i15 >= i16) {
                return i10;
            }
            byte b10 = (byte) i10;
            if (b10 < -32) {
                if (b10 >= -62) {
                    i13 = i15 + 1;
                    if (bArr[i15] > -65) {
                    }
                    i15 = i13;
                }
                return -1;
            } else if (b10 < -16) {
                byte b11 = (byte) (~(i10 >> 8));
                if (b11 == 0) {
                    int i17 = i15 + 1;
                    byte b12 = bArr[i15];
                    if (i17 >= i16) {
                        if (b10 <= -12 && b12 <= -65) {
                            i14 = b12 << 8;
                            return i14 ^ b10;
                        }
                        return -1;
                    }
                    i15 = i17;
                    b11 = b12;
                }
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    i13 = i15 + 1;
                    if (bArr[i15] > -65) {
                    }
                    i15 = i13;
                }
                return -1;
            } else {
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    int i18 = i15 + 1;
                    b13 = bArr[i15];
                    if (i18 >= i16) {
                        if (b10 <= -12 && b13 <= -65) {
                            i14 = b13 << 8;
                            return i14 ^ b10;
                        }
                        return -1;
                    }
                    i15 = i18;
                } else {
                    b5 = (byte) (i10 >> 16);
                }
                if (b5 == 0) {
                    int i19 = i15 + 1;
                    b5 = bArr[i15];
                    if (i19 >= i16) {
                        if (b10 <= -12 && b13 <= -65 && b5 <= -65) {
                            return ((b13 << 8) ^ b10) ^ (b5 << 16);
                        }
                        return -1;
                    }
                    i15 = i19;
                }
                if (b13 <= -65) {
                    if ((((b13 + 112) + (b10 << 28)) >> 30) == 0 && b5 <= -65) {
                        i13 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                        i15 = i13;
                    }
                }
                return -1;
            }
        }
        return a1.b.w0(bArr, i15, i16);
    }

    @Override // i9.a
    public final int z() {
        return this.f11843k;
    }
}
