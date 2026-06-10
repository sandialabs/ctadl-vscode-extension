package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b0 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Collection f12105a;

    /* renamed from: b  reason: collision with root package name */
    private java.util.Iterator f12106b = null;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private long f12107d;

    /* renamed from: e  reason: collision with root package name */
    private int f12108e;

    public b0(int i10, java.util.Collection collection) {
        this.f12105a = collection;
        this.c = (i10 & 4096) == 0 ? i10 | 64 | 16384 : i10;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        if (this.f12106b == null) {
            java.util.Collection collection = this.f12105a;
            this.f12106b = collection.iterator();
            this.f12107d = collection.size();
        }
        if (this.f12106b.hasNext()) {
            consumer.accept(this.f12106b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f12106b == null) {
            java.util.Collection collection = this.f12105a;
            this.f12106b = collection.iterator();
            long size = collection.size();
            this.f12107d = size;
            return size;
        }
        return this.f12107d;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        java.util.Iterator it = this.f12106b;
        if (it == null) {
            java.util.Collection collection = this.f12105a;
            java.util.Iterator it2 = collection.iterator();
            this.f12106b = it2;
            this.f12107d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC0261c.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j2;
        java.util.Iterator it = this.f12106b;
        if (it == null) {
            java.util.Collection collection = this.f12105a;
            java.util.Iterator it2 = collection.iterator();
            this.f12106b = it2;
            j2 = collection.size();
            this.f12107d = j2;
            it = it2;
        } else {
            j2 = this.f12107d;
        }
        if (j2 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f12108e + 1024;
        if (i10 > j2) {
            i10 = (int) j2;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f12108e = i11;
        long j10 = this.f12107d;
        if (j10 != Long.MAX_VALUE) {
            this.f12107d = j10 - i11;
        }
        return new U(objArr, 0, i11, this.c);
    }
}
