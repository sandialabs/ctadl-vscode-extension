package ua;

/* loaded from: classes.dex */
public final class i1 extends u0 {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sa.e eVar) {
        super(eVar);
        v7.g.f(eVar, "primitive");
        this.c = eVar.b() + "Array";
    }

    @Override // sa.e
    public final String b() {
        return this.c;
    }
}
