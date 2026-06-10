package j$.util;

import j$.util.function.C0276e0;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.PrimitiveIterator;

/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0440x implements InterfaceC0442z, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f12591a;

    private /* synthetic */ C0440x(PrimitiveIterator.OfLong ofLong) {
        this.f12591a = ofLong;
    }

    public static /* synthetic */ InterfaceC0442z a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0441y ? ((C0441y) ofLong).f12592a : new C0440x(ofLong);
    }

    @Override // j$.util.InterfaceC0442z
    public final /* synthetic */ void b(InterfaceC0278f0 interfaceC0278f0) {
        this.f12591a.forEachRemaining(C0276e0.a(interfaceC0278f0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0440x) {
            obj = ((C0440x) obj).f12591a;
        }
        return this.f12591a.equals(obj);
    }

    @Override // j$.util.InterfaceC0442z, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12591a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12591a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12591a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12591a.hashCode();
    }

    @Override // j$.util.InterfaceC0442z, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f12591a.next();
    }

    @Override // j$.util.InterfaceC0442z, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12591a.next();
    }

    @Override // j$.util.InterfaceC0442z
    public final /* synthetic */ long nextLong() {
        return this.f12591a.nextLong();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12591a.remove();
    }
}
