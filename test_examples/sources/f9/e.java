package f9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T a(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.d<M, T> dVar) {
        v7.g.f(extendableMessage, "<this>");
        v7.g.f(dVar, "extension");
        if (extendableMessage.m(dVar)) {
            return (T) extendableMessage.l(dVar);
        }
        return null;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T b(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.d<M, List<T>> dVar, int i10) {
        int size;
        v7.g.f(extendableMessage, "<this>");
        extendableMessage.q(dVar);
        kotlin.reflect.jvm.internal.impl.protobuf.e<GeneratedMessageLite.c> eVar = extendableMessage.f14523i;
        eVar.getClass();
        GeneratedMessageLite.c cVar = dVar.f14535d;
        if (cVar.f14531k) {
            Object f10 = eVar.f(cVar);
            if (f10 == null) {
                size = 0;
            } else {
                size = ((List) f10).size();
            }
            if (i10 < size) {
                extendableMessage.q(dVar);
                if (cVar.f14531k) {
                    Object f11 = eVar.f(cVar);
                    if (f11 != null) {
                        return (T) dVar.a(((List) f11).get(i10));
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
