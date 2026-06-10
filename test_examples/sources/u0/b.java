package u0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public float f17718a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f17719b = 0.0f;
    public float c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f17720d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f17718a = Math.max(f10, this.f17718a);
        this.f17719b = Math.max(f11, this.f17719b);
        this.c = Math.min(f12, this.c);
        this.f17720d = Math.min(f13, this.f17720d);
    }

    public final boolean b() {
        if (this.f17718a < this.c && this.f17719b < this.f17720d) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "MutableRect(" + a1.c.O1(this.f17718a) + ", " + a1.c.O1(this.f17719b) + ", " + a1.c.O1(this.c) + ", " + a1.c.O1(this.f17720d) + ')';
    }
}
