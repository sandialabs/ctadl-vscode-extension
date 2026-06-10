package d9;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: k  reason: collision with root package name */
    public static final m f10464k = new m(false, false, false, false, false, new m(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10465a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10466b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10467d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10468e;

    /* renamed from: f  reason: collision with root package name */
    public final m f10469f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10470g;

    /* renamed from: h  reason: collision with root package name */
    public final m f10471h;

    /* renamed from: i  reason: collision with root package name */
    public final m f10472i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10473j;

    public m(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, m mVar, boolean z15, m mVar2, m mVar3, boolean z16, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        mVar = (i10 & 32) != 0 ? null : mVar;
        z15 = (i10 & 64) != 0 ? true : z15;
        mVar2 = (i10 & 128) != 0 ? mVar : mVar2;
        mVar3 = (i10 & 256) != 0 ? mVar : mVar3;
        z16 = (i10 & 512) != 0 ? false : z16;
        this.f10465a = z10;
        this.f10466b = z11;
        this.c = z12;
        this.f10467d = z13;
        this.f10468e = z14;
        this.f10469f = mVar;
        this.f10470g = z15;
        this.f10471h = mVar2;
        this.f10472i = mVar3;
        this.f10473j = z16;
    }
}
