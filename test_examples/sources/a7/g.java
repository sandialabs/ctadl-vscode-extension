package a7;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.w, v7.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u7.l f291a;

    public g(u7.l lVar) {
        this.f291a = lVar;
    }

    @Override // v7.e
    public final u7.l a() {
        return this.f291a;
    }

    @Override // androidx.lifecycle.w
    public final /* synthetic */ void b(Object obj) {
        this.f291a.U(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof androidx.lifecycle.w) && (obj instanceof v7.e)) {
            return v7.g.a(this.f291a, ((v7.e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f291a.hashCode();
    }
}
