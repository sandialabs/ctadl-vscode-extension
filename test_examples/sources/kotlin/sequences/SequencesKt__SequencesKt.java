package kotlin.sequences;

import a1.b;
import ga.d;
import ga.f;
import ga.h;
import ga.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public class SequencesKt__SequencesKt extends b {
    public static final f N0(h hVar) {
        SequencesKt__SequencesKt$flatten$1 sequencesKt__SequencesKt$flatten$1 = SequencesKt__SequencesKt$flatten$1.f15121j;
        if (hVar instanceof p) {
            p pVar = (p) hVar;
            g.f(sequencesKt__SequencesKt$flatten$1, "iterator");
            return new f(pVar.f11315a, pVar.f11316b, sequencesKt__SequencesKt$flatten$1);
        }
        return new f(hVar, SequencesKt__SequencesKt$flatten$3.f15122j, sequencesKt__SequencesKt$flatten$1);
    }

    public static final <T> h<T> O0(T t10, l<? super T, ? extends T> lVar) {
        g.f(lVar, "nextFunction");
        return t10 == null ? d.f11285a : new ga.g(new SequencesKt__SequencesKt$generateSequence$2(t10), lVar);
    }

    public static final h P0(DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1) {
        ga.g gVar = new ga.g(deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1, new SequencesKt__SequencesKt$generateSequence$1(deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1));
        if (!(gVar instanceof ga.a)) {
            return new ga.a(gVar);
        }
        return gVar;
    }

    public static final <T> h<T> Q0(T... tArr) {
        return tArr.length == 0 ? d.f11285a : kotlin.collections.b.i2(tArr);
    }
}
