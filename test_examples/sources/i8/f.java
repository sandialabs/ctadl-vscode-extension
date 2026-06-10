package i8;

import aa.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.l;
import o8.j;
import o8.j0;
import o8.p;
import o8.z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final z f11827a;

    static {
        h hVar = h.f405a;
        p pVar = new p(h.f406b, kotlin.reflect.jvm.internal.impl.builtins.g.f13348e);
        h9.e f10 = kotlin.reflect.jvm.internal.impl.builtins.g.f13349f.f();
        LockBasedStorageManager.a aVar = LockBasedStorageManager.f14904e;
        z zVar = new z(pVar, f10, aVar);
        zVar.f16478r = Modality.ABSTRACT;
        l.h hVar2 = l.f15842e;
        if (hVar2 != null) {
            zVar.f16479s = hVar2;
            List N0 = a1.c.N0(j0.W0(zVar, Variance.IN_VARIANCE, h9.e.k("T"), 0, aVar));
            if (zVar.f16481u == null) {
                ArrayList arrayList = new ArrayList(N0);
                zVar.f16481u = arrayList;
                zVar.f16480t = new y9.d(zVar, arrayList, zVar.f16482v, zVar.f16483w);
                Set<kotlin.reflect.jvm.internal.impl.descriptors.e> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : emptySet) {
                        ((j) eVar).a1(zVar.r());
                    }
                    f11827a = zVar;
                    return;
                }
                z.z0(13);
                throw null;
            }
            throw new IllegalStateException("Type parameters are already set for " + zVar.getName());
        }
        z.z0(9);
        throw null;
    }
}
