package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l8.h0;
import l8.i0;
import y9.f0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final j f15041a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f15042b;
    public final List<f0> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<i0, f0> f15043d;

    /* loaded from: classes.dex */
    public static final class a {
        public static j a(j jVar, h0 h0Var, List list) {
            v7.g.f(h0Var, "typeAliasDescriptor");
            v7.g.f(list, "arguments");
            List<i0> e10 = h0Var.o().e();
            v7.g.e(e10, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(n7.l.Z1(e10, 10));
            for (i0 i0Var : e10) {
                arrayList.add(i0Var.a());
            }
            return new j(jVar, h0Var, list, kotlin.collections.d.N1(kotlin.collections.c.S2(arrayList, list)));
        }
    }

    public j(j jVar, h0 h0Var, List list, Map map) {
        this.f15041a = jVar;
        this.f15042b = h0Var;
        this.c = list;
        this.f15043d = map;
    }

    public final boolean a(h0 h0Var) {
        v7.g.f(h0Var, "descriptor");
        if (!v7.g.a(this.f15042b, h0Var)) {
            j jVar = this.f15041a;
            if (!(jVar != null ? jVar.a(h0Var) : false)) {
                return false;
            }
        }
        return true;
    }
}
