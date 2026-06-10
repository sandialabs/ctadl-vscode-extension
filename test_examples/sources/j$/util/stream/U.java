package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f12385h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0421w0 f12386a;

    /* renamed from: b  reason: collision with root package name */
    private Spliterator f12387b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f12388d;

    /* renamed from: e  reason: collision with root package name */
    private final InterfaceC0363h2 f12389e;

    /* renamed from: f  reason: collision with root package name */
    private final U f12390f;

    /* renamed from: g  reason: collision with root package name */
    private F0 f12391g;

    U(U u10, Spliterator spliterator, U u11) {
        super(u10);
        this.f12386a = u10.f12386a;
        this.f12387b = spliterator;
        this.c = u10.c;
        this.f12388d = u10.f12388d;
        this.f12389e = u10.f12389e;
        this.f12390f = u11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        super(null);
        this.f12386a = abstractC0421w0;
        this.f12387b = spliterator;
        this.c = AbstractC0350f.f(spliterator.estimateSize());
        this.f12388d = new ConcurrentHashMap(Math.max(16, AbstractC0350f.f12463g << 1));
        this.f12389e = interfaceC0363h2;
        this.f12390f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f12387b;
        long j2 = this.c;
        boolean z10 = false;
        U u10 = this;
        while (spliterator.estimateSize() > j2 && (trySplit = spliterator.trySplit()) != null) {
            U u11 = new U(u10, trySplit, u10.f12390f);
            U u12 = new U(u10, spliterator, u11);
            u10.addToPendingCount(1);
            u12.addToPendingCount(1);
            u10.f12388d.put(u11, u12);
            if (u10.f12390f != null) {
                u11.addToPendingCount(1);
                if (u10.f12388d.replace(u10.f12390f, u10, u11)) {
                    u10.addToPendingCount(-1);
                } else {
                    u11.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = trySplit;
                u10 = u11;
                u11 = u12;
            } else {
                u10 = u12;
            }
            z10 = !z10;
            u11.fork();
        }
        if (u10.getPendingCount() > 0) {
            C0330b c0330b = new C0330b(14);
            AbstractC0421w0 abstractC0421w0 = u10.f12386a;
            A0 r1 = abstractC0421w0.r1(abstractC0421w0.a1(spliterator), c0330b);
            u10.f12386a.w1(spliterator, r1);
            u10.f12391g = r1.build();
            u10.f12387b = null;
        }
        u10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        F0 f02 = this.f12391g;
        if (f02 != null) {
            f02.forEach(this.f12389e);
            this.f12391g = null;
        } else {
            Spliterator spliterator = this.f12387b;
            if (spliterator != null) {
                this.f12386a.w1(spliterator, this.f12389e);
                this.f12387b = null;
            }
        }
        U u10 = (U) this.f12388d.remove(this);
        if (u10 != null) {
            u10.tryComplete();
        }
    }
}
