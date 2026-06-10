package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0442z extends A {
    void b(InterfaceC0278f0 interfaceC0278f0);

    void forEachRemaining(Consumer consumer);

    @Override // java.util.Iterator, j$.util.Iterator
    Long next();

    long nextLong();
}
