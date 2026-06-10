package i9;

import i9.h;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public abstract class a implements Iterable<Byte> {

    /* renamed from: i  reason: collision with root package name */
    public static final e f11832i = new e(new byte[0]);

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0132a extends Iterator<Byte> {
    }

    /* loaded from: classes.dex */
    public static final class b extends OutputStream {
        public static final byte[] n = new byte[0];

        /* renamed from: k  reason: collision with root package name */
        public int f11835k;

        /* renamed from: m  reason: collision with root package name */
        public int f11837m;

        /* renamed from: i  reason: collision with root package name */
        public final int f11833i = 128;

        /* renamed from: j  reason: collision with root package name */
        public final ArrayList<a> f11834j = new ArrayList<>();

        /* renamed from: l  reason: collision with root package name */
        public byte[] f11836l = new byte[128];

        public final void a(int i10) {
            this.f11834j.add(new e(this.f11836l));
            int length = this.f11835k + this.f11836l.length;
            this.f11835k = length;
            this.f11836l = new byte[Math.max(this.f11833i, Math.max(i10, length >>> 1))];
            this.f11837m = 0;
        }

        public final void b() {
            int i10 = this.f11837m;
            byte[] bArr = this.f11836l;
            int length = bArr.length;
            ArrayList<a> arrayList = this.f11834j;
            if (i10 < length) {
                if (i10 > 0) {
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                    arrayList.add(new e(bArr2));
                }
            } else {
                arrayList.add(new e(this.f11836l));
                this.f11836l = n;
            }
            this.f11835k += this.f11837m;
            this.f11837m = 0;
        }

        public final synchronized a c() {
            a c;
            b();
            ArrayList<a> arrayList = this.f11834j;
            if (!(arrayList instanceof Collection)) {
                ArrayList<a> arrayList2 = new ArrayList<>();
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            if (arrayList.isEmpty()) {
                c = a.f11832i;
            } else {
                c = a.c(arrayList.iterator(), arrayList.size());
            }
            return c;
        }

        public final String toString() {
            int i10;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i10 = this.f11835k + this.f11837m;
            }
            objArr[1] = Integer.valueOf(i10);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i10) {
            if (this.f11837m == this.f11836l.length) {
                a(1);
            }
            byte[] bArr = this.f11836l;
            int i11 = this.f11837m;
            this.f11837m = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.f11836l;
            int length = bArr2.length;
            int i12 = this.f11837m;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f11837m += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                a(i13);
                System.arraycopy(bArr, i10 + length2, this.f11836l, 0, i13);
                this.f11837m = i13;
            }
        }
    }

    public static a c(Iterator<a> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return c(it, i11).d(c(it, i10 - i11));
    }

    public static b w() {
        return new b();
    }

    public abstract String A();

    public abstract void B(OutputStream outputStream, int i10, int i11);

    public final a d(a aVar) {
        h hVar;
        a pop;
        int size = size();
        int size2 = aVar.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = h.f11847p;
            if (this instanceof h) {
                hVar = (h) this;
            } else {
                hVar = null;
            }
            if (aVar.size() == 0) {
                return this;
            }
            if (size() != 0) {
                int size3 = aVar.size() + size();
                if (size3 < 128) {
                    int size4 = size();
                    int size5 = aVar.size();
                    byte[] bArr = new byte[size4 + size5];
                    g(0, 0, size4, bArr);
                    aVar.g(0, size4, size5, bArr);
                    return new e(bArr);
                }
                if (hVar != null) {
                    a aVar2 = hVar.f11850l;
                    if (aVar.size() + aVar2.size() < 128) {
                        int size6 = aVar2.size();
                        int size7 = aVar.size();
                        byte[] bArr2 = new byte[size6 + size7];
                        aVar2.g(0, 0, size6, bArr2);
                        aVar.g(0, size6, size7, bArr2);
                        return new h(hVar.f11849k, new e(bArr2));
                    }
                }
                if (hVar != null) {
                    a aVar3 = hVar.f11849k;
                    int s10 = aVar3.s();
                    a aVar4 = hVar.f11850l;
                    if (s10 > aVar4.s()) {
                        if (hVar.n > aVar.s()) {
                            return new h(aVar3, new h(aVar4, aVar));
                        }
                    }
                }
                if (size3 >= h.f11847p[Math.max(s(), aVar.s()) + 1]) {
                    pop = new h(this, aVar);
                } else {
                    h.a aVar5 = new h.a();
                    aVar5.a(this);
                    aVar5.a(aVar);
                    Stack<a> stack = aVar5.f11853a;
                    pop = stack.pop();
                    while (!stack.isEmpty()) {
                        pop = new h(stack.pop(), pop);
                    }
                }
                return pop;
            }
            return aVar;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void g(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            int i13 = i10 + i12;
            if (i13 > size()) {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i13);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            int i14 = i11 + i12;
            if (i14 <= bArr.length) {
                if (i12 > 0) {
                    h(i10, i11, i12, bArr);
                    return;
                }
                return;
            }
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void h(int i10, int i11, int i12, byte[] bArr);

    public abstract int s();

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract boolean u();

    @Override // java.lang.Iterable
    /* renamed from: v */
    public abstract InterfaceC0132a iterator();

    public abstract int x(int i10, int i11, int i12);

    public abstract int y(int i10, int i11, int i12);

    public abstract int z();
}
