package p8;

import kotlin.collections.builders.MapBuilder;
import l8.m0;
import l8.n0;
import v7.g;

/* loaded from: classes.dex */
public final class a extends n0 {
    public static final a c = new a();

    public a() {
        super("package", false);
    }

    @Override // l8.n0
    public final Integer a(n0 n0Var) {
        g.f(n0Var, "visibility");
        int i10 = 0;
        if (this != n0Var) {
            MapBuilder mapBuilder = m0.f15854a;
            if (((n0Var == m0.e.c || n0Var == m0.f.c) ? 1 : 1) != 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        }
        return Integer.valueOf(i10);
    }

    @Override // l8.n0
    public final String b() {
        return "public/*package*/";
    }

    @Override // l8.n0
    public final n0 c() {
        return m0.g.c;
    }
}
