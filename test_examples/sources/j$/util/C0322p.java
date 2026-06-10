package j$.util;

import j$.util.function.C0279g;
import j$.util.function.C0291m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.PrimitiveIterator;

/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0322p implements r, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f12282a;

    private /* synthetic */ C0322p(PrimitiveIterator.OfDouble ofDouble) {
        this.f12282a = ofDouble;
    }

    public static /* synthetic */ r a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C0323q ? ((C0323q) ofDouble).f12283a : new C0322p(ofDouble);
    }

    @Override // j$.util.r
    public final /* synthetic */ void d(InterfaceC0293n interfaceC0293n) {
        this.f12282a.forEachRemaining(C0291m.a(interfaceC0293n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0322p) {
            obj = ((C0322p) obj).f12282a;
        }
        return this.f12282a.equals(obj);
    }

    @Override // j$.util.r, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12282a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12282a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f12282a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12282a.hashCode();
    }

    @Override // j$.util.r, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f12282a.next();
    }

    @Override // j$.util.r, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f12282a.next();
    }

    @Override // j$.util.r
    public final /* synthetic */ double nextDouble() {
        return this.f12282a.nextDouble();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f12282a.remove();
    }
}
