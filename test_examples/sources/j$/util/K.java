package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
public interface K extends N {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void b(InterfaceC0278f0 interfaceC0278f0);

    boolean f(InterfaceC0278f0 interfaceC0278f0);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    @Override // j$.util.N, j$.util.Spliterator
    K trySplit();
}
