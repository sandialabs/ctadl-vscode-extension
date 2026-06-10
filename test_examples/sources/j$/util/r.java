package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
public interface r extends A {
    void d(InterfaceC0293n interfaceC0293n);

    void forEachRemaining(Consumer consumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Double next();

    double nextDouble();
}
