package j$.util.stream;

/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0345e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f12455a;

    /* renamed from: b  reason: collision with root package name */
    protected int f12456b;
    protected int c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f12457d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0345e() {
        this.f12455a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0345e(int i10) {
        if (i10 >= 0) {
            this.f12455a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public final long count() {
        int i10 = this.c;
        return i10 == 0 ? this.f12456b : this.f12457d[i10] + this.f12456b;
    }
}
