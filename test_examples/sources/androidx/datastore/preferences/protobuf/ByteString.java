package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final ByteString f4776j = new LiteralByteString(u.f4943b);

    /* renamed from: k  reason: collision with root package name */
    public static final c f4777k;

    /* renamed from: i  reason: collision with root package name */
    public int f4778i = 0;

    /* loaded from: classes.dex */
    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new f(this);
        }
    }

    /* loaded from: classes.dex */
    public static class LiteralByteString extends LeafByteString {

        /* renamed from: l  reason: collision with root package name */
        public final byte[] f4779l;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f4779l = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte c(int i10) {
            return this.f4779l[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof LiteralByteString) {
                LiteralByteString literalByteString = (LiteralByteString) obj;
                int i10 = this.f4778i;
                int i11 = literalByteString.f4778i;
                if (i10 != 0 && i11 != 0 && i10 != i11) {
                    return false;
                }
                int size = size();
                if (size <= literalByteString.size()) {
                    if (0 + size <= literalByteString.size()) {
                        int w10 = w() + size;
                        int w11 = w();
                        int w12 = literalByteString.w() + 0;
                        while (w11 < w10) {
                            if (this.f4779l[w11] != literalByteString.f4779l[w12]) {
                                return false;
                            }
                            w11++;
                            w12++;
                        }
                        return true;
                    }
                    StringBuilder o10 = a4.b.o("Ran off end of other: 0, ", size, ", ");
                    o10.append(literalByteString.size());
                    throw new IllegalArgumentException(o10.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte h(int i10) {
            return this.f4779l[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean s() {
            int w10 = w();
            if (Utf8.f4824a.c(w10, size() + w10, this.f4779l) == 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f4779l.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int t(int i10, int i11) {
            int w10 = w() + 0;
            Charset charset = u.f4942a;
            for (int i12 = w10; i12 < w10 + i11; i12++) {
                i10 = (i10 * 31) + this.f4779l[i12];
            }
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String u(Charset charset) {
            return new String(this.f4779l, w(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void v(k kVar) {
            kVar.K0(this.f4779l, w(), size());
        }

        public int w() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements Iterator, j$.util.Iterator {
        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            f fVar = (f) this;
            int i10 = fVar.f4863i;
            if (i10 < fVar.f4864j) {
                fVar.f4863i = i10 + 1;
                return Byte.valueOf(fVar.f4865k.h(i10));
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f4777k = androidx.datastore.preferences.protobuf.d.a() ? new d() : new b();
    }

    public static int d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a4.b.j("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(a4.b.j("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(a4.b.i("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static ByteString g(byte[] bArr, int i10, int i11) {
        d(i10, i10 + i11, bArr.length);
        return new LiteralByteString(f4777k.a(bArr, i10, i11));
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i10);

    public final int hashCode() {
        int i10 = this.f4778i;
        if (i10 == 0) {
            int size = size();
            i10 = t(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f4778i = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<Byte> iterator() {
        return new f(this);
    }

    public abstract boolean s();

    public abstract int size();

    public abstract int t(int i10, int i11);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u(Charset charset);

    public abstract void v(k kVar);
}
