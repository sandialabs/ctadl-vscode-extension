package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0355g implements InterfaceC0365i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f12472a;

    private /* synthetic */ C0355g(BaseStream baseStream) {
        this.f12472a = baseStream;
    }

    public static /* synthetic */ InterfaceC0365i y(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0360h ? ((C0360h) baseStream).f12474a : baseStream instanceof DoubleStream ? E.y((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C0378l0.y((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? S2.y((java.util.stream.Stream) baseStream) : new C0355g(baseStream);
    }

    @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f12472a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0355g) {
            obj = ((C0355g) obj).f12472a;
        }
        return this.f12472a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12472a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ boolean isParallel() {
        return this.f12472a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f12472a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i onClose(Runnable runnable) {
        return y(this.f12472a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i parallel() {
        return y(this.f12472a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i sequential() {
        return y(this.f12472a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.e(this.f12472a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i unordered() {
        return y(this.f12472a.unordered());
    }
}
