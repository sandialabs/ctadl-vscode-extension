package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;

/* renamed from: j$.util.stream.e3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0349e3 implements Spliterator, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f12460d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spliterator f12461a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f12462b;
    private Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0349e3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C0349e3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f12461a = spliterator;
        this.f12462b = concurrentHashMap;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        while (this.f12461a.a(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = f12460d;
            }
            if (this.f12462b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f12461a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12461a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f12461a.forEachRemaining(new C0389o(6, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f12461a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(Consumer consumer, Object obj) {
        if (this.f12462b.putIfAbsent(obj != null ? obj : f12460d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f12461a.trySplit();
        if (trySplit != null) {
            return new C0349e3(trySplit, this.f12462b);
        }
        return null;
    }
}
