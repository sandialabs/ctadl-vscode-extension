package wa;

/* loaded from: classes.dex */
public final class g extends f {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, boolean z10) {
        super(pVar);
        v7.g.f(pVar, "writer");
        this.c = z10;
    }

    @Override // wa.f
    public final void i(String str) {
        v7.g.f(str, "value");
        if (this.c) {
            super.i(str);
        } else {
            g(str);
        }
    }
}
