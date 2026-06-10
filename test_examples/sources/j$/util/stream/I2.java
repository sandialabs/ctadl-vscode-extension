package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    int f12331a;

    /* renamed from: b  reason: collision with root package name */
    final int f12332b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    final int f12333d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f12334e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ R2 f12335f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(R2 r22, int i10, int i11, int i12, int i13) {
        this.f12335f = r22;
        this.f12331a = i10;
        this.f12332b = i11;
        this.c = i12;
        this.f12333d = i13;
        Object[][] objArr = r22.f12375f;
        this.f12334e = objArr == null ? r22.f12374e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f12331a;
        int i11 = this.f12332b;
        if (i10 >= i11 && (i10 != i11 || this.c >= this.f12333d)) {
            return false;
        }
        Object[] objArr = this.f12334e;
        int i12 = this.c;
        this.c = i12 + 1;
        consumer.accept(objArr[i12]);
        if (this.c == this.f12334e.length) {
            this.c = 0;
            int i13 = this.f12331a + 1;
            this.f12331a = i13;
            Object[][] objArr2 = this.f12335f.f12375f;
            if (objArr2 != null && i13 <= i11) {
                this.f12334e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f12331a;
        int i11 = this.f12333d;
        int i12 = this.f12332b;
        if (i10 == i12) {
            return i11 - this.c;
        }
        long[] jArr = this.f12335f.f12457d;
        return ((jArr[i12] + i11) - jArr[i10]) - this.c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        R2 r22;
        consumer.getClass();
        int i10 = this.f12331a;
        int i11 = this.f12333d;
        int i12 = this.f12332b;
        if (i10 < i12 || (i10 == i12 && this.c < i11)) {
            int i13 = this.c;
            while (true) {
                r22 = this.f12335f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = r22.f12375f[i10];
                while (i13 < objArr.length) {
                    consumer.accept(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f12331a == i12 ? this.f12334e : r22.f12375f[i12];
            while (i13 < i11) {
                consumer.accept(objArr2[i13]);
                i13++;
            }
            this.f12331a = i12;
            this.c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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
        int i10 = this.f12331a;
        int i11 = this.f12332b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.c;
            R2 r22 = this.f12335f;
            I2 i22 = new I2(r22, i10, i12, i13, r22.f12375f[i12].length);
            this.f12331a = i11;
            this.c = 0;
            this.f12334e = r22.f12375f[i11];
            return i22;
        } else if (i10 == i11) {
            int i14 = this.c;
            int i15 = (this.f12333d - i14) / 2;
            if (i15 == 0) {
                return null;
            }
            Spliterator m10 = j$.util.d0.m(this.f12334e, i14, i14 + i15);
            this.c += i15;
            return m10;
        } else {
            return null;
        }
    }
}
