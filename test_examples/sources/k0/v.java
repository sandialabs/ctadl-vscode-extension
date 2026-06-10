package k0;

/* loaded from: classes.dex */
public final class v extends t {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f12864l;

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.f12864l) {
            case 0:
                int i10 = this.f12863k + 2;
                this.f12863k = i10;
                return this.f12861i[i10 - 2];
            default:
                int i11 = this.f12863k + 2;
                this.f12863k = i11;
                return this.f12861i[i11 - 1];
        }
    }
}
