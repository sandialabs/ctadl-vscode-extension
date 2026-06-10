package androidx.navigation;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5530a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5531b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5532d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5533e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5534f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5535g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5536a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f5537b = -1;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f5538d = -1;
    }

    public t(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14) {
        this.f5530a = z10;
        this.f5531b = i10;
        this.c = z11;
        this.f5532d = i11;
        this.f5533e = i12;
        this.f5534f = i13;
        this.f5535g = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            return this.f5530a == tVar.f5530a && this.f5531b == tVar.f5531b && this.c == tVar.c && this.f5532d == tVar.f5532d && this.f5533e == tVar.f5533e && this.f5534f == tVar.f5534f && this.f5535g == tVar.f5535g;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f5530a ? 1 : 0) * 31) + this.f5531b) * 31) + (this.c ? 1 : 0)) * 31) + this.f5532d) * 31) + this.f5533e) * 31) + this.f5534f) * 31) + this.f5535g;
    }
}
