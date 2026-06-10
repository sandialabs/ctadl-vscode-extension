package k0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d<K, V, T> implements Iterator<T>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final t<K, V, T>[] f12836i;

    /* renamed from: j  reason: collision with root package name */
    public int f12837j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12838k;

    public d(s<K, V> sVar, t<K, V, T>[] tVarArr) {
        v7.g.f(sVar, "node");
        this.f12836i = tVarArr;
        this.f12838k = true;
        t<K, V, T> tVar = tVarArr[0];
        Object[] objArr = sVar.f12858d;
        tVar.getClass();
        v7.g.f(objArr, "buffer");
        tVar.f12861i = objArr;
        tVar.f12862j = Integer.bitCount(sVar.f12856a) * 2;
        tVar.f12863k = 0;
        this.f12837j = 0;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11;
        int i10 = this.f12837j;
        t<K, V, T>[] tVarArr = this.f12836i;
        t<K, V, T> tVar = tVarArr[i10];
        if (tVar.f12863k < tVar.f12862j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        while (-1 < i10) {
            int b5 = b(i10);
            if (b5 == -1) {
                t<K, V, T> tVar2 = tVarArr[i10];
                int i11 = tVar2.f12863k;
                Object[] objArr = tVar2.f12861i;
                if (i11 < objArr.length) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int length = objArr.length;
                    tVar2.f12863k = i11 + 1;
                    b5 = b(i10);
                }
            }
            if (b5 != -1) {
                this.f12837j = b5;
                return;
            }
            if (i10 > 0) {
                t<K, V, T> tVar3 = tVarArr[i10 - 1];
                int i12 = tVar3.f12863k;
                int length2 = tVar3.f12861i.length;
                tVar3.f12863k = i12 + 1;
            }
            t<K, V, T> tVar4 = tVarArr[i10];
            Object[] objArr2 = s.f12855e.f12858d;
            tVar4.getClass();
            v7.g.f(objArr2, "buffer");
            tVar4.f12861i = objArr2;
            tVar4.f12862j = 0;
            tVar4.f12863k = 0;
            i10--;
        }
        this.f12838k = false;
    }

    public final int b(int i10) {
        boolean z10;
        boolean z11;
        t<K, V, T> tVar;
        t<K, V, T>[] tVarArr = this.f12836i;
        t<K, V, T> tVar2 = tVarArr[i10];
        int i11 = tVar2.f12863k;
        if (i11 < tVar2.f12862j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i10;
        }
        Object[] objArr = tVar2.f12861i;
        if (i11 < objArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int length = objArr.length;
            Object obj = objArr[i11];
            v7.g.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            s sVar = (s) obj;
            if (i10 == 6) {
                tVar = tVarArr[i10 + 1];
                Object[] objArr2 = sVar.f12858d;
                int length2 = objArr2.length;
                tVar.getClass();
                tVar.f12861i = objArr2;
                tVar.f12862j = length2;
            } else {
                tVar = tVarArr[i10 + 1];
                Object[] objArr3 = sVar.f12858d;
                tVar.getClass();
                v7.g.f(objArr3, "buffer");
                tVar.f12861i = objArr3;
                tVar.f12862j = Integer.bitCount(sVar.f12856a) * 2;
            }
            tVar.f12863k = 0;
            return b(i10 + 1);
        }
        return -1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f12838k;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        if (this.f12838k) {
            T next = this.f12836i[this.f12837j].next();
            a();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
