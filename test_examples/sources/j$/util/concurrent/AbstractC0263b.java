package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0263b extends q {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f12139i;

    /* renamed from: j  reason: collision with root package name */
    m f12140j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0263b(m[] mVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, 0, i11);
        this.f12139i = concurrentHashMap;
        e();
    }

    public final boolean hasMoreElements() {
        return this.f12157b != null;
    }

    public final boolean hasNext() {
        return this.f12157b != null;
    }

    public final void remove() {
        m mVar = this.f12140j;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        this.f12140j = null;
        this.f12139i.i(mVar.f12151b, null, null);
    }
}
