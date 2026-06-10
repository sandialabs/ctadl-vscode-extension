package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1113a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1114b = 0;
    public int c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1115d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1116e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1117f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1118g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1119h = false;

    public final void a(int i10, int i11) {
        this.c = i10;
        this.f1115d = i11;
        this.f1119h = true;
        if (this.f1118g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1113a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1114b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1113a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1114b = i11;
        }
    }
}
