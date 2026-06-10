package kotlin.sequences;

import ga.e;
import ga.f;
import ga.h;
import ga.m;
import ga.p;
import java.util.ArrayList;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public class a extends m {
    public static final e R0(h hVar, l lVar) {
        g.f(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static final e S0(h hVar, l lVar) {
        g.f(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static final e T0(h hVar) {
        return S0(hVar, SequencesKt___SequencesKt$filterNotNull$1.f15125j);
    }

    public static final Object U0(e eVar) {
        e.a aVar = new e.a(eVar);
        if (!aVar.hasNext()) {
            return null;
        }
        return aVar.next();
    }

    public static final f V0(h hVar, l lVar) {
        g.f(lVar, "transform");
        return new f(hVar, lVar, SequencesKt___SequencesKt$flatMap$2.f15126r);
    }

    public static final p W0(h hVar, l lVar) {
        g.f(lVar, "transform");
        return new p(hVar, lVar);
    }

    public static final e X0(h hVar, l lVar) {
        g.f(lVar, "transform");
        return S0(new p(hVar, lVar), SequencesKt___SequencesKt$filterNotNull$1.f15125j);
    }

    public static final f Y0(p pVar, Object obj) {
        return SequencesKt__SequencesKt.N0(SequencesKt__SequencesKt.Q0(pVar, SequencesKt__SequencesKt.Q0(obj)));
    }

    public static final ArrayList Z0(h hVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
