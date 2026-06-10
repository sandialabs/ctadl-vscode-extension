package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12146i;

    /* renamed from: j  reason: collision with root package name */
    long f12147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m[] mVarArr, int i10, int i11, int i12, long j2, int i13) {
        super(mVarArr, i10, i11, i12);
        this.f12146i = i13;
        this.f12147j = j2;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        switch (this.f12146i) {
            case 0:
                consumer.getClass();
                m e10 = e();
                if (e10 == null) {
                    return false;
                }
                consumer.accept(e10.f12151b);
                return true;
            default:
                consumer.getClass();
                m e11 = e();
                if (e11 == null) {
                    return false;
                }
                consumer.accept(e11.c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f12146i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f12146i) {
            case 0:
                return this.f12147j;
            default:
                return this.f12147j;
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f12146i) {
            case 0:
                consumer.getClass();
                while (true) {
                    m e10 = e();
                    if (e10 == null) {
                        return;
                    }
                    consumer.accept(e10.f12151b);
                }
            default:
                consumer.getClass();
                while (true) {
                    m e11 = e();
                    if (e11 == null) {
                        return;
                    }
                    consumer.accept(e11.c);
                }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f12146i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f12146i) {
            case 0:
                return AbstractC0261c.i(this);
            default:
                return AbstractC0261c.i(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f12146i) {
            case 0:
                return AbstractC0261c.j(this, i10);
            default:
                return AbstractC0261c.j(this, i10);
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f12146i) {
            case 0:
                int i10 = this.f12160f;
                int i11 = this.f12161g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                m[] mVarArr = this.f12156a;
                int i13 = this.f12162h;
                this.f12161g = i12;
                long j2 = this.f12147j >>> 1;
                this.f12147j = j2;
                return new k(mVarArr, i13, i12, i11, j2, 0);
            default:
                int i14 = this.f12160f;
                int i15 = this.f12161g;
                int i16 = (i14 + i15) >>> 1;
                if (i16 <= i14) {
                    return null;
                }
                m[] mVarArr2 = this.f12156a;
                int i17 = this.f12162h;
                this.f12161g = i16;
                long j10 = this.f12147j >>> 1;
                this.f12147j = j10;
                return new k(mVarArr2, i17, i16, i15, j10, 1);
        }
    }
}
