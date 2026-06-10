package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class V extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private Spliterator f12393a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0363h2 f12394b;
    private final AbstractC0421w0 c;

    /* renamed from: d  reason: collision with root package name */
    private long f12395d;

    V(V v3, Spliterator spliterator) {
        super(v3);
        this.f12393a = spliterator;
        this.f12394b = v3.f12394b;
        this.f12395d = v3.f12395d;
        this.c = v3.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        super(null);
        this.f12394b = interfaceC0363h2;
        this.c = abstractC0421w0;
        this.f12393a = spliterator;
        this.f12395d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f12393a;
        long estimateSize = spliterator.estimateSize();
        long j2 = this.f12395d;
        if (j2 == 0) {
            j2 = AbstractC0350f.f(estimateSize);
            this.f12395d = j2;
        }
        boolean i10 = V2.SHORT_CIRCUIT.i(this.c.g1());
        InterfaceC0363h2 interfaceC0363h2 = this.f12394b;
        boolean z10 = false;
        V v3 = this;
        while (true) {
            if (!i10 || !interfaceC0363h2.i()) {
                if (estimateSize <= j2 || (trySplit = spliterator.trySplit()) == null) {
                    break;
                }
                V v10 = new V(v3, trySplit);
                v3.addToPendingCount(1);
                if (z10) {
                    spliterator = trySplit;
                } else {
                    V v11 = v3;
                    v3 = v10;
                    v10 = v11;
                }
                z10 = !z10;
                v3.fork();
                v3 = v10;
                estimateSize = spliterator.estimateSize();
            } else {
                break;
            }
        }
        v3.c.V0(spliterator, interfaceC0363h2);
        v3.f12393a = null;
        v3.propagateCompletion();
    }
}
