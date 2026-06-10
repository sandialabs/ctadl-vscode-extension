package ua;

/* loaded from: classes.dex */
public final class b0 {
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final long[] f17949e = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public final sa.e f17950a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.p<sa.e, Integer, Boolean> f17951b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f17952d;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(sa.e eVar, u7.p<? super sa.e, ? super Integer, Boolean> pVar) {
        v7.g.f(eVar, "descriptor");
        this.f17950a = eVar;
        this.f17951b = pVar;
        int c = eVar.c();
        long j2 = 0;
        if (c <= 64) {
            if (c != 64) {
                j2 = (-1) << c;
            }
            this.c = j2;
            this.f17952d = f17949e;
            return;
        }
        this.c = 0L;
        int i10 = (c - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((c & 63) != 0) {
            jArr[i10 - 1] = (-1) << c;
        }
        this.f17952d = jArr;
    }
}
