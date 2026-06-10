package d9;

import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import l8.c0;
import y9.r;

/* loaded from: classes.dex */
public final class j {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if ((r6 instanceof l8.a0) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, int i10) {
        boolean z10;
        boolean z11;
        String b5;
        boolean z12 = false;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v7.g.f(eVar, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z11) {
            if (eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                b5 = "<init>";
            } else {
                b5 = eVar.getName().b();
                v7.g.e(b5, "name.asString()");
            }
            sb.append(b5);
        }
        sb.append("(");
        c0 R = eVar.R();
        if (R != null) {
            r b10 = R.b();
            v7.g.e(b10, "it.type");
            sb.append(c(b10));
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : eVar.m()) {
            r b11 = hVar.b();
            v7.g.e(b11, "parameter.type");
            sb.append(c(b11));
        }
        sb.append(")");
        if (z10) {
            if (!(eVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c)) {
                r k3 = eVar.k();
                v7.g.c(k3);
                h9.e eVar2 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
                if (kotlin.reflect.jvm.internal.impl.builtins.e.E(k3, g.a.f13362d)) {
                    r k10 = eVar.k();
                    v7.g.c(k10);
                    if (!kotlin.reflect.jvm.internal.impl.types.r.g(k10)) {
                    }
                }
                if (!z12) {
                    sb.append("V");
                } else {
                    r k11 = eVar.k();
                    v7.g.c(k11);
                    sb.append(c(k11));
                }
            }
            z12 = true;
            if (!z12) {
            }
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l8.b bVar;
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        v7.g.f(aVar, "<this>");
        if (k9.d.o(aVar)) {
            return null;
        }
        l8.f c = aVar.c();
        if (c instanceof l8.b) {
            bVar = (l8.b) c;
        } else {
            bVar = null;
        }
        if (bVar == null || bVar.getName().f11573j) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a10 = aVar.a();
        if (a10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
            gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) a10;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return null;
        }
        return a1.c.y1(bVar, a(gVar, 3));
    }

    public static final d c(r rVar) {
        return (d) m0.b.Q0(rVar, m.f10464k, FunctionsKt.f15114b);
    }
}
