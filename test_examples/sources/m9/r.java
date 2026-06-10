package m9;

/* loaded from: classes.dex */
public final class r extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(str);
        v7.g.f(str, "value");
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        return sVar.u().v();
    }

    @Override // m9.g
    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("\""), (String) this.f16022a, '\"');
    }
}
