package j8;

import da.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.c0;
import l8.d0;
import l8.f;
import l8.i0;
import m8.e;
import n7.l;
import n7.r;
import n7.s;
import n7.t;
import o8.g0;
import v7.g;
import y9.v;

/* loaded from: classes.dex */
public final class c extends g0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static c a(j8.a aVar, boolean z10) {
            String lowerCase;
            boolean z11;
            g.f(aVar, "functionClass");
            c cVar = new c(aVar, null, CallableMemberDescriptor.Kind.DECLARATION, z10);
            c0 R0 = aVar.R0();
            EmptyList emptyList = EmptyList.f12981i;
            ArrayList arrayList = new ArrayList();
            List<i0> list = aVar.f12751s;
            for (Object obj : list) {
                if (((i0) obj).t() == Variance.IN_VARIANCE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                arrayList.add(obj);
            }
            s R2 = kotlin.collections.c.R2(arrayList);
            ArrayList arrayList2 = new ArrayList(l.Z1(R2, 10));
            Iterator it = R2.iterator();
            while (true) {
                t tVar = (t) it;
                if (tVar.hasNext()) {
                    r rVar = (r) tVar.next();
                    int i10 = rVar.f16128a;
                    i0 i0Var = (i0) rVar.f16129b;
                    String b5 = i0Var.getName().b();
                    g.e(b5, "typeParameter.name.asString()");
                    if (g.a(b5, "T")) {
                        lowerCase = "instance";
                    } else if (g.a(b5, "E")) {
                        lowerCase = "receiver";
                    } else {
                        lowerCase = b5.toLowerCase(Locale.ROOT);
                        g.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    e.a.C0187a c0187a = e.a.f16014a;
                    h9.e k3 = h9.e.k(lowerCase);
                    v r3 = i0Var.r();
                    g.e(r3, "typeParameter.defaultType");
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(cVar, null, i10, c0187a, k3, r3, false, false, false, null, d0.f15835a));
                    arrayList2 = arrayList3;
                } else {
                    cVar.V0(null, R0, emptyList, emptyList, arrayList2, ((i0) kotlin.collections.c.v2(list)).r(), Modality.ABSTRACT, l8.l.f15842e);
                    cVar.F = true;
                    return cVar;
                }
            }
        }
    }

    public c(f fVar, c cVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        super(fVar, cVar, e.a.f16014a, i.f10492g, kind, d0.f15835a);
        this.f13536u = true;
        this.D = z10;
        this.E = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, l8.r
    public final boolean D() {
        return false;
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, e eVar2, h9.e eVar3) {
        g.f(fVar, "newOwner");
        g.f(kind, "kind");
        g.f(eVar2, "annotations");
        return new c(fVar, (c) eVar, kind, this.D);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.b T0(b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        h9.e eVar;
        boolean z13;
        g.f(aVar, "configuration");
        c cVar = (c) super.T0(aVar);
        if (cVar == null) {
            return null;
        }
        List<h> m10 = cVar.m();
        g.e(m10, "substituted.valueParameters");
        boolean z14 = true;
        if (!m10.isEmpty()) {
            for (h hVar : m10) {
                y9.r b5 = hVar.b();
                g.e(b5, "it.type");
                if (kotlin.reflect.jvm.internal.impl.builtins.c.c(b5) != null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return cVar;
        }
        List<h> m11 = cVar.m();
        g.e(m11, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(l.Z1(m11, 10));
        for (h hVar2 : m11) {
            y9.r b10 = hVar2.b();
            g.e(b10, "it.type");
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.c.c(b10));
        }
        int size = cVar.m().size() - arrayList.size();
        if (size == 0) {
            List<h> m12 = cVar.m();
            g.e(m12, "valueParameters");
            ArrayList S2 = kotlin.collections.c.S2(arrayList, m12);
            if (!S2.isEmpty()) {
                Iterator it = S2.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    if (!g.a((h9.e) pair.f12962i, ((h) pair.f12963j).getName())) {
                        z13 = false;
                        break;
                    }
                }
            }
            z13 = true;
            if (z13) {
                return cVar;
            }
        }
        List<h> m13 = cVar.m();
        g.e(m13, "valueParameters");
        ArrayList arrayList2 = new ArrayList(l.Z1(m13, 10));
        for (h hVar3 : m13) {
            h9.e name = hVar3.getName();
            g.e(name, "it.name");
            int index = hVar3.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (eVar = (h9.e) arrayList.get(i10)) != null) {
                name = eVar;
            }
            arrayList2.add(hVar3.Q(cVar, name, index));
        }
        b.a W0 = cVar.W0(TypeSubstitutor.f14961b);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((h9.e) it2.next()) == null) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    break;
                }
            }
        }
        z14 = false;
        W0.f13561v = Boolean.valueOf(z14);
        W0.f13547g = arrayList2;
        W0.f13545e = cVar.z0();
        kotlin.reflect.jvm.internal.impl.descriptors.impl.b T0 = super.T0(W0);
        g.c(T0);
        return T0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean i() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean u0() {
        return false;
    }
}
