package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import l8.i0;
import y9.e0;
import y9.f0;

/* loaded from: classes.dex */
public abstract class o extends q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15066b = new a();

    /* loaded from: classes.dex */
    public static final class a {
        public final q a(y9.r rVar) {
            return b(rVar.U0(), rVar.S0());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final q b(e0 e0Var, List<? extends f0> list) {
            boolean z10;
            v7.g.f(e0Var, "typeConstructor");
            v7.g.f(list, "arguments");
            List<i0> e10 = e0Var.e();
            v7.g.e(e10, "typeConstructor.parameters");
            i0 i0Var = (i0) kotlin.collections.c.w2(e10);
            if (i0Var != null) {
                z10 = true;
                if (i0Var.W()) {
                    if (!z10) {
                        List<i0> e11 = e0Var.e();
                        v7.g.e(e11, "typeConstructor.parameters");
                        ArrayList arrayList = new ArrayList(n7.l.Z1(e11, 10));
                        for (i0 i0Var2 : e11) {
                            arrayList.add(i0Var2.o());
                        }
                        return new n(kotlin.collections.d.N1(kotlin.collections.c.S2(arrayList, list)), false);
                    }
                    return new y9.q((i0[]) e10.toArray(new i0[0]), (f0[]) list.toArray(new f0[0]), false);
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(y9.r rVar) {
        return g(rVar.U0());
    }

    public abstract f0 g(e0 e0Var);
}
