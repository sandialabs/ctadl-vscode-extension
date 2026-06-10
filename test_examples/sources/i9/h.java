package i9;

import i9.a;
import i9.e;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class h extends i9.a {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f11847p;

    /* renamed from: j  reason: collision with root package name */
    public final int f11848j;

    /* renamed from: k  reason: collision with root package name */
    public final i9.a f11849k;

    /* renamed from: l  reason: collision with root package name */
    public final i9.a f11850l;

    /* renamed from: m  reason: collision with root package name */
    public final int f11851m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public int f11852o;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Stack<i9.a> f11853a = new Stack<>();

        public final void a(i9.a aVar) {
            if (aVar.t()) {
                int size = aVar.size();
                int[] iArr = h.f11847p;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i10 = iArr[binarySearch + 1];
                Stack<i9.a> stack = this.f11853a;
                if (!stack.isEmpty() && stack.peek().size() < i10) {
                    int i11 = iArr[binarySearch];
                    i9.a pop = stack.pop();
                    while (!stack.isEmpty() && stack.peek().size() < i11) {
                        pop = new h(stack.pop(), pop);
                    }
                    h hVar = new h(pop, aVar);
                    while (!stack.isEmpty()) {
                        int[] iArr2 = h.f11847p;
                        int binarySearch2 = Arrays.binarySearch(iArr2, hVar.f11848j);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-(binarySearch2 + 1)) - 1;
                        }
                        if (stack.peek().size() >= iArr2[binarySearch2 + 1]) {
                            break;
                        }
                        hVar = new h(stack.pop(), hVar);
                    }
                    stack.push(hVar);
                    return;
                }
                stack.push(aVar);
            } else if (aVar instanceof h) {
                h hVar2 = (h) aVar;
                a(hVar2.f11849k);
                a(hVar2.f11850l);
            } else {
                String valueOf = String.valueOf(aVar.getClass());
                throw new IllegalArgumentException(androidx.activity.e.k(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Iterator<e>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final Stack<h> f11854i = new Stack<>();

        /* renamed from: j  reason: collision with root package name */
        public e f11855j;

        public b(i9.a aVar) {
            while (aVar instanceof h) {
                h hVar = (h) aVar;
                this.f11854i.push(hVar);
                aVar = hVar.f11849k;
            }
            this.f11855j = (e) aVar;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a */
        public final e next() {
            e eVar;
            boolean z10;
            e eVar2 = this.f11855j;
            if (eVar2 != null) {
                while (true) {
                    Stack<h> stack = this.f11854i;
                    if (stack.isEmpty()) {
                        eVar = null;
                        break;
                    }
                    Object obj = stack.pop().f11850l;
                    while (obj instanceof h) {
                        h hVar = (h) obj;
                        stack.push(hVar);
                        obj = hVar.f11849k;
                    }
                    eVar = (e) obj;
                    if (eVar.f11842j.length == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        break;
                    }
                }
                this.f11855j = eVar;
                return eVar2;
            }
            throw new NoSuchElementException();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super e> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f11855j != null;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0132a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final b f11856i;

        /* renamed from: j  reason: collision with root package name */
        public e.a f11857j;

        /* renamed from: k  reason: collision with root package name */
        public int f11858k;

        public c(h hVar) {
            b bVar = new b(hVar);
            this.f11856i = bVar;
            this.f11857j = new e.a();
            this.f11858k = hVar.f11848j;
        }

        public final byte a() {
            if (!this.f11857j.hasNext()) {
                this.f11857j = new e.a();
            }
            this.f11858k--;
            return this.f11857j.a();
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
            return this.f11858k > 0;
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

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f11847p = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f11847p;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public /* synthetic */ h() {
        throw null;
    }

    public h(i9.a aVar, i9.a aVar2) {
        this.f11852o = 0;
        this.f11849k = aVar;
        this.f11850l = aVar2;
        int size = aVar.size();
        this.f11851m = size;
        this.f11848j = aVar2.size() + size;
        this.n = Math.max(aVar.s(), aVar2.s()) + 1;
    }

    @Override // i9.a
    public final String A() {
        byte[] bArr;
        int i10 = this.f11848j;
        if (i10 == 0) {
            bArr = kotlin.reflect.jvm.internal.impl.protobuf.f.f14571a;
        } else {
            byte[] bArr2 = new byte[i10];
            h(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // i9.a
    public final void B(OutputStream outputStream, int i10, int i11) {
        int i12;
        int i13 = i10 + i11;
        i9.a aVar = this.f11849k;
        int i14 = this.f11851m;
        if (i13 <= i14) {
            aVar.B(outputStream, i10, i11);
            return;
        }
        i9.a aVar2 = this.f11850l;
        if (i10 >= i14) {
            i12 = i10 - i14;
        } else {
            int i15 = i14 - i10;
            aVar.B(outputStream, i10, i15);
            i12 = 0;
            i11 -= i15;
        }
        aVar2.B(outputStream, i12, i11);
    }

    public final boolean equals(Object obj) {
        boolean C;
        int z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i9.a)) {
            return false;
        }
        i9.a aVar = (i9.a) obj;
        int size = aVar.size();
        int i10 = this.f11848j;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (this.f11852o != 0 && (z10 = aVar.z()) != 0 && this.f11852o != z10) {
            return false;
        }
        b bVar = new b(this);
        e next = bVar.next();
        b bVar2 = new b(aVar);
        e next2 = bVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int length = next.f11842j.length - i11;
            int length2 = next2.f11842j.length - i12;
            int min = Math.min(length, length2);
            if (i11 == 0) {
                C = next.C(next2, i12, min);
            } else {
                C = next2.C(next, i11, min);
            }
            if (!C) {
                return false;
            }
            i13 += min;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == length) {
                next = bVar.next();
                i11 = 0;
            } else {
                i11 += min;
            }
            if (min == length2) {
                next2 = bVar2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    @Override // i9.a
    public final void h(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        int i14 = i10 + i12;
        i9.a aVar = this.f11849k;
        int i15 = this.f11851m;
        if (i14 <= i15) {
            aVar.h(i10, i11, i12, bArr);
            return;
        }
        i9.a aVar2 = this.f11850l;
        if (i10 >= i15) {
            i13 = i10 - i15;
        } else {
            int i16 = i15 - i10;
            aVar.h(i10, i11, i16, bArr);
            i11 += i16;
            i12 -= i16;
            i13 = 0;
        }
        aVar2.h(i13, i11, i12, bArr);
    }

    public final int hashCode() {
        int i10 = this.f11852o;
        if (i10 == 0) {
            int i11 = this.f11848j;
            i10 = x(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11852o = i10;
        }
        return i10;
    }

    @Override // i9.a
    public final int s() {
        return this.n;
    }

    @Override // i9.a
    public final int size() {
        return this.f11848j;
    }

    @Override // i9.a
    public final boolean t() {
        return this.f11848j >= f11847p[this.n];
    }

    @Override // i9.a
    public final boolean u() {
        int y10 = this.f11849k.y(0, 0, this.f11851m);
        i9.a aVar = this.f11850l;
        return aVar.y(y10, 0, aVar.size()) == 0;
    }

    @Override // i9.a, java.lang.Iterable
    /* renamed from: v */
    public final a.InterfaceC0132a iterator() {
        return new c(this);
    }

    @Override // i9.a
    public final int x(int i10, int i11, int i12) {
        int i13;
        int i14 = i11 + i12;
        i9.a aVar = this.f11849k;
        int i15 = this.f11851m;
        if (i14 <= i15) {
            return aVar.x(i10, i11, i12);
        }
        i9.a aVar2 = this.f11850l;
        if (i11 >= i15) {
            i13 = i11 - i15;
        } else {
            int i16 = i15 - i11;
            i10 = aVar.x(i10, i11, i16);
            i13 = 0;
            i12 -= i16;
        }
        return aVar2.x(i10, i13, i12);
    }

    @Override // i9.a
    public final int y(int i10, int i11, int i12) {
        int i13;
        int i14 = i11 + i12;
        i9.a aVar = this.f11849k;
        int i15 = this.f11851m;
        if (i14 <= i15) {
            return aVar.y(i10, i11, i12);
        }
        if (i11 >= i15) {
            i13 = i11 - i15;
        } else {
            int i16 = i15 - i11;
            i10 = aVar.y(i10, i11, i16);
            i12 -= i16;
            i13 = 0;
        }
        return this.f11850l.y(i10, i13, i12);
    }

    @Override // i9.a
    public final int z() {
        return this.f11852o;
    }
}
