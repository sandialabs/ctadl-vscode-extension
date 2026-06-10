package j$.util;

import j$.util.function.C0274d0;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0441y implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0442z f12592a;

    private /* synthetic */ C0441y(InterfaceC0442z interfaceC0442z) {
        this.f12592a = interfaceC0442z;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(InterfaceC0442z interfaceC0442z) {
        if (interfaceC0442z == null) {
            return null;
        }
        return interfaceC0442z instanceof C0440x ? ((C0440x) interfaceC0442z).f12591a : new C0441y(interfaceC0442z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0442z interfaceC0442z = this.f12592a;
        if (obj instanceof C0441y) {
            obj = ((C0441y) obj).f12592a;
        }
        return interfaceC0442z.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f12592a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12592a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f12592a.b(C0274d0.a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12592a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12592a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f12592a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12592a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f12592a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12592a.remove();
    }
}
