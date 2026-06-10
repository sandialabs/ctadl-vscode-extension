package u8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.load.java.a<m8.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        v7.g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    public static List l(m9.g gVar) {
        if (gVar instanceof m9.b) {
            ArrayList arrayList = new ArrayList();
            for (m9.g gVar2 : (Iterable) ((m9.b) gVar).f16022a) {
                n7.n.f2(l(gVar2), arrayList);
            }
            return arrayList;
        } else if (gVar instanceof m9.i) {
            return a1.c.N0(((m9.i) gVar).c.i());
        } else {
            return EmptyList.f12981i;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    public final ArrayList a(Object obj, boolean z10) {
        Iterable l2;
        m8.c cVar = (m8.c) obj;
        v7.g.f(cVar, "<this>");
        Map<h9.e, m9.g<?>> a10 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<h9.e, m9.g<?>> entry : a10.entrySet()) {
            h9.e key = entry.getKey();
            m9.g<?> value = entry.getValue();
            if (z10 && !v7.g.a(key, q.f17865b)) {
                l2 = EmptyList.f12981i;
                n7.n.f2(l2, arrayList);
            }
            l2 = l(value);
            n7.n.f2(l2, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    public final h9.c e(m8.c cVar) {
        m8.c cVar2 = cVar;
        v7.g.f(cVar2, "<this>");
        return cVar2.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    public final l8.b f(Object obj) {
        m8.c cVar = (m8.c) obj;
        v7.g.f(cVar, "<this>");
        l8.b d5 = DescriptorUtilsKt.d(cVar);
        v7.g.c(d5);
        return d5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    public final Iterable<m8.c> g(m8.c cVar) {
        m8.e annotations;
        m8.c cVar2 = cVar;
        v7.g.f(cVar2, "<this>");
        l8.b d5 = DescriptorUtilsKt.d(cVar2);
        if (d5 == null || (annotations = d5.getAnnotations()) == null) {
            return EmptyList.f12981i;
        }
        return annotations;
    }
}
