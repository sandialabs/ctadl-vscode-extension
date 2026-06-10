package ua;

/* loaded from: classes.dex */
public final class c extends u0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sa.e eVar, int i10) {
        super(eVar);
        this.c = i10;
        if (i10 != 1) {
            v7.g.f(eVar, "elementDesc");
            return;
        }
        v7.g.f(eVar, "elementDesc");
        super(eVar);
    }

    @Override // sa.e
    public final String b() {
        switch (this.c) {
            case 0:
                return "kotlin.Array";
            default:
                return "kotlin.collections.HashSet";
        }
    }
}
