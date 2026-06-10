package j$.util;

import j$.util.function.C0279g;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* renamed from: j$.util.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0436t implements InterfaceC0438v, Iterator {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f12588a;

    private /* synthetic */ C0436t(PrimitiveIterator.OfInt ofInt) {
        this.f12588a = ofInt;
    }

    public static /* synthetic */ InterfaceC0438v a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0437u ? ((C0437u) ofInt).f12589a : new C0436t(ofInt);
    }

    @Override // j$.util.InterfaceC0438v
    public final /* synthetic */ void c(j$.util.function.K k3) {
        this.f12588a.forEachRemaining(j$.util.function.J.a(k3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0436t) {
            obj = ((C0436t) obj).f12588a;
        }
        return this.f12588a.equals(obj);
    }

    @Override // j$.util.InterfaceC0438v, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12588a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12588a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12588a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12588a.hashCode();
    }

    @Override // j$.util.InterfaceC0438v, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f12588a.next();
    }

    @Override // j$.util.InterfaceC0438v, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12588a.next();
    }

    @Override // j$.util.InterfaceC0438v
    public final /* synthetic */ int nextInt() {
        return this.f12588a.nextInt();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12588a.remove();
    }
}
