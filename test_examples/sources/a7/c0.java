package a7;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements androidx.lifecycle.w, v7.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u7.l f276a;

    public c0(u7.l lVar) {
        this.f276a = lVar;
    }

    @Override // v7.e
    public final u7.l a() {
        return this.f276a;
    }

    @Override // androidx.lifecycle.w
    public final /* synthetic */ void b(Object obj) {
        this.f276a.U(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof androidx.lifecycle.w) && (obj instanceof v7.e)) {
            return v7.g.a(this.f276a, ((v7.e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f276a.hashCode();
    }
}
