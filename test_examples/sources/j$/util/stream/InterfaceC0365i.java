package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0365i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC0365i onClose(Runnable runnable);

    InterfaceC0365i parallel();

    InterfaceC0365i sequential();

    Spliterator spliterator();

    InterfaceC0365i unordered();
}
