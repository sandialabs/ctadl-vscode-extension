package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0437u implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0438v f12589a;

    private /* synthetic */ C0437u(InterfaceC0438v interfaceC0438v) {
        this.f12589a = interfaceC0438v;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC0438v interfaceC0438v) {
        if (interfaceC0438v == null) {
            return null;
        }
        return interfaceC0438v instanceof C0436t ? ((C0436t) interfaceC0438v).f12588a : new C0437u(interfaceC0438v);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0438v interfaceC0438v = this.f12589a;
        if (obj instanceof C0437u) {
            obj = ((C0437u) obj).f12589a;
        }
        return interfaceC0438v.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f12589a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12589a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f12589a.c(j$.util.function.I.a(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12589a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12589a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f12589a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12589a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f12589a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12589a.remove();
    }
}
