package ja;

/* loaded from: classes.dex */
public final class j0 implements p0 {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12778i;

    public j0(boolean z10) {
        this.f12778i = z10;
    }

    @Override // ja.p0
    public final boolean b() {
        return this.f12778i;
    }

    @Override // ja.p0
    public final c1 q() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f12778i) {
            str = "Active";
        } else {
            str = "New";
        }
        return androidx.activity.e.j(sb, str, '}');
    }
}
