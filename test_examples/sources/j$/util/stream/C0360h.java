package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0360h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0365i f12474a;

    private /* synthetic */ C0360h(InterfaceC0365i interfaceC0365i) {
        this.f12474a = interfaceC0365i;
    }

    public static /* synthetic */ BaseStream y(InterfaceC0365i interfaceC0365i) {
        if (interfaceC0365i == null) {
            return null;
        }
        return interfaceC0365i instanceof C0355g ? ((C0355g) interfaceC0365i).f12472a : interfaceC0365i instanceof G ? F.y((G) interfaceC0365i) : interfaceC0365i instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC0365i) : interfaceC0365i instanceof InterfaceC0386n0 ? C0382m0.y((InterfaceC0386n0) interfaceC0365i) : interfaceC0365i instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC0365i) : new C0360h(interfaceC0365i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f12474a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0365i interfaceC0365i = this.f12474a;
        if (obj instanceof C0360h) {
            obj = ((C0360h) obj).f12474a;
        }
        return interfaceC0365i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12474a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f12474a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f12474a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return y(this.f12474a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return y(this.f12474a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return y(this.f12474a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f12474a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return y(this.f12474a.unordered());
    }
}
