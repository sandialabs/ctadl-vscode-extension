package p8;

import kotlin.collections.builders.MapBuilder;
import l8.m0;
import l8.n0;
import v7.g;

/* loaded from: classes.dex */
public final class b extends n0 {
    public static final b c = new b();

    public b() {
        super("protected_and_package", true);
    }

    @Override // l8.n0
    public final Integer a(n0 n0Var) {
        g.f(n0Var, "visibility");
        boolean z10 = false;
        if (g.a(this, n0Var)) {
            return 0;
        }
        if (n0Var == m0.b.c) {
            return null;
        }
        MapBuilder mapBuilder = m0.f15854a;
        int i10 = 1;
        if (!((n0Var == m0.e.c || n0Var == m0.f.c) ? true : true)) {
            i10 = -1;
        }
        return Integer.valueOf(i10);
    }

    @Override // l8.n0
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // l8.n0
    public final n0 c() {
        return m0.g.c;
    }
}
