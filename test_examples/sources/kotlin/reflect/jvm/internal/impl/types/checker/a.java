package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.m;

/* loaded from: classes.dex */
public final class a {
    public static m a(boolean z10, boolean z11, h hVar, KotlinTypePreparator kotlinTypePreparator, e eVar, int i10) {
        boolean z12;
        if ((i10 & 2) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i10 & 4) != 0) {
            hVar = h.f15004a;
        }
        h hVar2 = hVar;
        if ((i10 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.a.f14979i;
        }
        KotlinTypePreparator kotlinTypePreparator2 = kotlinTypePreparator;
        if ((i10 & 16) != 0) {
            eVar = e.a.f14998i;
        }
        e eVar2 = eVar;
        v7.g.f(hVar2, "typeSystemContext");
        v7.g.f(kotlinTypePreparator2, "kotlinTypePreparator");
        v7.g.f(eVar2, "kotlinTypeRefiner");
        return new m(z10, z12, hVar2, kotlinTypePreparator2, eVar2);
    }
}
