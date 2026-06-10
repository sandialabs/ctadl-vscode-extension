package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
public interface E extends N {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void d(InterfaceC0293n interfaceC0293n);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    boolean p(InterfaceC0293n interfaceC0293n);

    @Override // j$.util.N, j$.util.Spliterator
    E trySplit();
}
