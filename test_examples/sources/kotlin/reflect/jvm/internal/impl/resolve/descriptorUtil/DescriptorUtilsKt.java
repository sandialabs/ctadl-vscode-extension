package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import a1.c;
import fa.b;
import h9.d;
import h9.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.sequences.SequencesKt__SequencesKt;
import l8.f;
import l8.s;
import l8.u;
import l8.z;
import o9.a;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DescriptorUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14713a = 0;

    static {
        e.k("value");
    }

    public static final boolean a(h hVar) {
        g.f(hVar, "<this>");
        Boolean d5 = b.d(c.N0(hVar), a.f16484b, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.f14714r);
        g.e(d5, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return d5.booleanValue();
    }

    public static CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor, l lVar) {
        g.f(callableMemberDescriptor, "<this>");
        g.f(lVar, "predicate");
        return (CallableMemberDescriptor) b.b(c.N0(callableMemberDescriptor), new o9.b(false), new o9.c(new Ref$ObjectRef(), lVar));
    }

    public static final h9.c c(f fVar) {
        g.f(fVar, "<this>");
        d h10 = h(fVar);
        if (!h10.e()) {
            h10 = null;
        }
        if (h10 != null) {
            return h10.h();
        }
        return null;
    }

    public static final l8.b d(m8.c cVar) {
        g.f(cVar, "<this>");
        l8.d c = cVar.b().U0().c();
        if (c instanceof l8.b) {
            return (l8.b) c;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.e e(f fVar) {
        g.f(fVar, "<this>");
        return j(fVar).u();
    }

    public static final h9.b f(l8.d dVar) {
        f c;
        h9.b f10;
        if (dVar == null || (c = dVar.c()) == null) {
            return null;
        }
        if (c instanceof u) {
            return new h9.b(((u) c).e(), dVar.getName());
        }
        if (!(c instanceof l8.e) || (f10 = f((l8.d) c)) == null) {
            return null;
        }
        return f10.d(dVar.getName());
    }

    public static final h9.c g(f fVar) {
        g.f(fVar, "<this>");
        h9.c h10 = k9.d.h(fVar);
        if (h10 == null) {
            h10 = k9.d.g(fVar.c()).b(fVar.getName()).h();
        }
        if (h10 != null) {
            return h10;
        }
        k9.d.a(4);
        throw null;
    }

    public static final d h(f fVar) {
        g.f(fVar, "<this>");
        d g10 = k9.d.g(fVar);
        g.e(g10, "getFqName(this)");
        return g10;
    }

    public static final e.a i(s sVar) {
        g.f(sVar, "<this>");
        z9.d dVar = (z9.d) sVar.k0(z9.a.f19183a);
        return e.a.f14998i;
    }

    public static final s j(f fVar) {
        g.f(fVar, "<this>");
        s d5 = k9.d.d(fVar);
        g.e(d5, "getContainingModule(this)");
        return d5;
    }

    public static final ga.h<f> k(f fVar) {
        g.f(fVar, "<this>");
        ga.h O0 = SequencesKt__SequencesKt.O0(fVar, DescriptorUtilsKt$parentsWithSelf$1.f14715j);
        if (O0 instanceof ga.c) {
            return ((ga.c) O0).a();
        }
        return new ga.b(O0, 1);
    }

    public static final CallableMemberDescriptor l(CallableMemberDescriptor callableMemberDescriptor) {
        g.f(callableMemberDescriptor, "<this>");
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) {
            z C0 = ((kotlin.reflect.jvm.internal.impl.descriptors.f) callableMemberDescriptor).C0();
            g.e(C0, "correspondingProperty");
            return C0;
        }
        return callableMemberDescriptor;
    }
}
