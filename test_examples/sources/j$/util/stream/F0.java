package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface F0 {
    F0 a(int i10);

    long count();

    void f(Object[] objArr, int i10);

    void forEach(Consumer consumer);

    int k();

    Object[] p(IntFunction intFunction);

    F0 r(long j2, long j10, IntFunction intFunction);

    Spliterator spliterator();
}
