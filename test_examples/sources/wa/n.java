package wa;

/* loaded from: classes.dex */
public final class n extends b {

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.serialization.json.a f18516m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public int f18517o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(va.a aVar, kotlinx.serialization.json.a aVar2) {
        super(aVar);
        v7.g.f(aVar, "json");
        v7.g.f(aVar2, "value");
        this.f18516m = aVar2;
        this.n = aVar2.size();
        this.f18517o = -1;
    }

    @Override // wa.b
    public final kotlinx.serialization.json.b D(String str) {
        v7.g.f(str, "tag");
        return this.f18516m.f15676i.get(Integer.parseInt(str));
    }

    @Override // wa.b
    public final kotlinx.serialization.json.b L() {
        return this.f18516m;
    }

    @Override // ta.a
    public final int t(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        int i10 = this.f18517o;
        if (i10 < this.n - 1) {
            int i11 = i10 + 1;
            this.f18517o = i11;
            return i11;
        }
        return -1;
    }

    @Override // ua.b1
    public final String z(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return String.valueOf(i10);
    }
}
