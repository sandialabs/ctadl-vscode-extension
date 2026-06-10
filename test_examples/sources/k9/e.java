package k9;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.a0;
import l8.j0;
import l8.l0;
import l8.z;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class e {
    static {
        h9.b.l(new h9.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        v7.g.f(eVar, "<this>");
        if (eVar instanceof a0) {
            z C0 = ((a0) eVar).C0();
            v7.g.e(C0, "correspondingProperty");
            if (d(C0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(l8.f fVar) {
        v7.g.f(fVar, "<this>");
        return (fVar instanceof l8.b) && (((l8.b) fVar).x0() instanceof l8.o);
    }

    public static final boolean c(r rVar) {
        l8.d c = rVar.U0().c();
        if (c != null) {
            return b(c);
        }
        return false;
    }

    public static final boolean d(l0 l0Var) {
        l8.b bVar;
        l8.o oVar;
        if (l0Var.R() == null) {
            l8.f c = l0Var.c();
            h9.e eVar = null;
            if (c instanceof l8.b) {
                bVar = (l8.b) c;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                int i10 = DescriptorUtilsKt.f14713a;
                j0<v> x02 = bVar.x0();
                if (x02 instanceof l8.o) {
                    oVar = (l8.o) x02;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    eVar = oVar.f15857a;
                }
            }
            if (v7.g.a(eVar, l0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final v e(r rVar) {
        l8.o oVar;
        v7.g.f(rVar, "<this>");
        l8.d c = rVar.U0().c();
        if (!(c instanceof l8.b)) {
            c = null;
        }
        l8.b bVar = (l8.b) c;
        if (bVar == null) {
            return null;
        }
        int i10 = DescriptorUtilsKt.f14713a;
        j0<v> x02 = bVar.x0();
        if (x02 instanceof l8.o) {
            oVar = (l8.o) x02;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return null;
        }
        return (v) oVar.f15858b;
    }
}
