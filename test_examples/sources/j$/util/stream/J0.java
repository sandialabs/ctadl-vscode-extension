package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J0 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f12338a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J0(Collection collection) {
        this.f12338a = collection;
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f12338a.size();
    }

    @Override // j$.util.stream.F0
    public final void f(Object[] objArr, int i10) {
        for (Object obj : this.f12338a) {
            objArr[i10] = obj;
            i10++;
        }
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        AbstractC0261c.q(this.f12338a, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final Object[] p(IntFunction intFunction) {
        Collection collection = this.f12338a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.I0(this, j2, j10, intFunction);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        Collection collection = this.f12338a;
        return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : AbstractC0421w0.v1(AbstractC0261c.t(collection), false)).spliterator();
    }

    public final String toString() {
        Collection collection = this.f12338a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
