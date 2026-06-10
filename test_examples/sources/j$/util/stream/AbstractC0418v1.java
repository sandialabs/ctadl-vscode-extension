package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0418v1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final F0 f12558a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f12559b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0418v1(F0 f02) {
        this.f12558a = f02;
        this.f12559b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0418v1(AbstractC0418v1 abstractC0418v1, F0 f02, int i10) {
        super(abstractC0418v1);
        this.f12558a = f02;
        this.f12559b = i10;
    }

    abstract void a();

    abstract C0414u1 b(int i10, int i11);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0418v1 abstractC0418v1 = this;
        while (abstractC0418v1.f12558a.k() != 0) {
            abstractC0418v1.setPendingCount(abstractC0418v1.f12558a.k() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < abstractC0418v1.f12558a.k() - 1) {
                C0414u1 b5 = abstractC0418v1.b(i10, abstractC0418v1.f12559b + i11);
                i11 = (int) (i11 + b5.f12558a.count());
                b5.fork();
                i10++;
            }
            abstractC0418v1 = abstractC0418v1.b(i10, abstractC0418v1.f12559b + i11);
        }
        abstractC0418v1.a();
        abstractC0418v1.propagateCompletion();
    }
}
