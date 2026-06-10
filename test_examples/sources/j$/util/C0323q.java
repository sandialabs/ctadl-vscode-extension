package j$.util;

import j$.util.function.C0289l;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0323q implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ r f12283a;

    private /* synthetic */ C0323q(r rVar) {
        this.f12283a = rVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar instanceof C0322p ? ((C0322p) rVar).f12282a : new C0323q(rVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.f12283a;
        if (obj instanceof C0323q) {
            obj = ((C0323q) obj).f12283a;
        }
        return rVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f12283a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12283a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f12283a.d(C0289l.a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12283a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12283a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f12283a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12283a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f12283a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12283a.remove();
    }
}
