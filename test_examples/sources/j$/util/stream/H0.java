package j$.util.stream;

/* loaded from: classes2.dex */
abstract class H0 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    protected final F0 f12320a;

    /* renamed from: b  reason: collision with root package name */
    protected final F0 f12321b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H0(F0 f02, F0 f03) {
        this.f12320a = f02;
        this.f12321b = f03;
        this.c = f02.count() + f03.count();
    }

    @Override // j$.util.stream.F0
    public /* bridge */ /* synthetic */ E0 a(int i10) {
        return (E0) a(i10);
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i10) {
        if (i10 == 0) {
            return this.f12320a;
        }
        if (i10 == 1) {
            return this.f12321b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.F0
    public final int k() {
        return 2;
    }
}
