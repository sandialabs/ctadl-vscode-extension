package j$.util.stream;

import java.util.Comparator;

/* renamed from: j$.util.stream.v2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0419v2 extends AbstractC0343d2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f12560b;
    protected boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0419v2(InterfaceC0363h2 interfaceC0363h2, Comparator comparator) {
        super(interfaceC0363h2);
        this.f12560b = comparator;
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        this.c = true;
        return false;
    }
}
