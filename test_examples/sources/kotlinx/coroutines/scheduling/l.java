package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15539b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15540d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15541e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<f> f15542a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final f a(f fVar, boolean z10) {
        if (z10) {
            return b(fVar);
        }
        f fVar2 = (f) f15539b.getAndSet(this, fVar);
        if (fVar2 == null) {
            return null;
        }
        return b(fVar2);
    }

    public final f b(f fVar) {
        boolean z10 = true;
        if (fVar.f15529j.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f15541e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return fVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f15542a.get(i10) != null) {
            Thread.yield();
        }
        this.f15542a.lazySet(i10, fVar);
        c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final f d() {
        f andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f15540d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f15542a.getAndSet(i11, null)) != null) {
                boolean z10 = true;
                if (andSet.f15529j.b() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f15541e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(l lVar) {
        boolean z10;
        int i10 = lVar.consumerIndex;
        int i11 = lVar.producerIndex;
        AtomicReferenceArray<f> atomicReferenceArray = lVar.f15542a;
        while (true) {
            boolean z11 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            f fVar = atomicReferenceArray.get(i12);
            if (fVar != null) {
                if (fVar.f15529j.b() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, fVar, null)) {
                            if (atomicReferenceArray.get(i12) != fVar) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z11) {
                        f15541e.decrementAndGet(lVar);
                        a(fVar, false);
                        return -1L;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(l lVar, boolean z10) {
        f fVar;
        boolean z11;
        boolean z12;
        do {
            fVar = (f) lVar.lastScheduledTask;
            if (fVar == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (fVar.f15529j.b() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return -2L;
                }
            }
            j.f15535e.getClass();
            long nanoTime = System.nanoTime() - fVar.f15528i;
            long j2 = j.f15532a;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15539b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(lVar, fVar, null)) {
                    if (atomicReferenceFieldUpdater.get(lVar) != fVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z11);
        a(fVar, false);
        return -1L;
    }
}
