package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public interface H extends N {
    @Override // j$.util.Spliterator
    boolean a(Consumer consumer);

    void c(j$.util.function.K k3);

    @Override // j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    boolean k(j$.util.function.K k3);

    @Override // j$.util.N, j$.util.Spliterator
    H trySplit();
}
