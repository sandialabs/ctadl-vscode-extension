package s9;

import y9.r;

/* loaded from: classes.dex */
public final class b extends a implements f {
    public final l8.b c;

    /* renamed from: d  reason: collision with root package name */
    public final h9.e f17504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l8.b bVar, r rVar, h9.e eVar) {
        super(rVar, null);
        v7.g.f(bVar, "classDescriptor");
        v7.g.f(rVar, "receiverType");
        this.c = bVar;
        this.f17504d = eVar;
    }

    @Override // s9.f
    public final h9.e a() {
        return this.f17504d;
    }

    public final String toString() {
        return b() + ": Ctx { " + this.c + " }";
    }
}
