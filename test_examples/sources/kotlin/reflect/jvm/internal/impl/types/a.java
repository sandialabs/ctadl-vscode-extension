package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.reflect.jvm.internal.impl.types.m;

/* loaded from: classes.dex */
public final class a {
    public static boolean a(m mVar, ba.g gVar, m.b bVar) {
        boolean z10;
        m.b bVar2;
        boolean z11;
        v7.g.f(mVar, "<this>");
        v7.g.f(gVar, "type");
        v7.g.f(bVar, "supertypesPolicy");
        ba.l lVar = mVar.c;
        if ((lVar.X(gVar) && !lVar.a0(gVar)) || lVar.V(gVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            mVar.c();
            ArrayDeque<ba.g> arrayDeque = mVar.f15052g;
            v7.g.c(arrayDeque);
            fa.d dVar = mVar.f15053h;
            v7.g.c(dVar);
            arrayDeque.push(gVar);
            while (!arrayDeque.isEmpty()) {
                if (dVar.f11019j <= 1000) {
                    ba.g pop = arrayDeque.pop();
                    v7.g.e(pop, "current");
                    if (dVar.add(pop)) {
                        if (lVar.a0(pop)) {
                            bVar2 = m.b.c.f15056a;
                        } else {
                            bVar2 = bVar;
                        }
                        if (!(!v7.g.a(bVar2, m.b.c.f15056a))) {
                            bVar2 = null;
                        }
                        if (bVar2 != null) {
                            for (ba.f fVar : lVar.y(lVar.d(pop))) {
                                ba.g a10 = bVar2.a(mVar, fVar);
                                if ((lVar.X(a10) && !lVar.a0(a10)) || lVar.V(a10)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    mVar.a();
                                } else {
                                    arrayDeque.add(a10);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + kotlin.collections.c.t2(dVar, null, null, null, null, 63)).toString());
                }
            }
            mVar.a();
            return false;
        }
        return true;
    }

    public static boolean b(m mVar, ba.g gVar, ba.j jVar) {
        ba.l lVar = mVar.c;
        if (lVar.D(gVar)) {
            return true;
        }
        if (lVar.a0(gVar)) {
            return false;
        }
        if (mVar.f15048b && lVar.R(gVar)) {
            return true;
        }
        return lVar.N(lVar.d(gVar), jVar);
    }
}
