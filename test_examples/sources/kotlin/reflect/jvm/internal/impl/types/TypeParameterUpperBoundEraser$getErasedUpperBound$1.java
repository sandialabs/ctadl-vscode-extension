package kotlin.reflect.jvm.internal.impl.types;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.o;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import y9.f0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
final class TypeParameterUpperBoundEraser$getErasedUpperBound$1 extends Lambda implements u7.l<p.a, y9.r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p f14960j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$getErasedUpperBound$1(p pVar) {
        super(1);
        this.f14960j = pVar;
    }

    @Override // u7.l
    public final y9.r U(p.a aVar) {
        f0 s10;
        m0 m10;
        p.a aVar2 = aVar;
        i0 i0Var = aVar2.f15070a;
        p pVar = this.f14960j;
        pVar.getClass();
        y9.m mVar = aVar2.f15071b;
        Set<i0> c = mVar.c();
        if (c == null || !c.contains(i0Var.a())) {
            v r3 = i0Var.r();
            v7.g.e(r3, "typeParameter.defaultType");
            LinkedHashSet<i0> linkedHashSet = new LinkedHashSet();
            TypeUtilsKt.f(r3, r3, linkedHashSet, c);
            int O0 = m0.b.O0(n7.l.Z1(linkedHashSet, 10));
            if (O0 < 16) {
                O0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
            for (i0 i0Var2 : linkedHashSet) {
                if (c != null && c.contains(i0Var2)) {
                    s10 = r.n(i0Var2, mVar);
                    linkedHashMap.put(i0Var2.o(), s10);
                }
                s10 = pVar.f15067a.s(i0Var2, mVar, pVar, pVar.a(i0Var2, mVar.d(i0Var)));
                linkedHashMap.put(i0Var2.o(), s10);
            }
            o.a aVar3 = o.f15066b;
            boolean z10 = false;
            TypeSubstitutor d5 = TypeSubstitutor.d(new n(linkedHashMap, false));
            List<y9.r> upperBounds = i0Var.getUpperBounds();
            v7.g.e(upperBounds, "typeParameter.upperBounds");
            SetBuilder b5 = pVar.b(d5, upperBounds, mVar);
            if (!b5.isEmpty()) {
                pVar.f15068b.getClass();
                if (b5.c() == 1) {
                    z10 = true;
                }
                if (z10) {
                    return (y9.r) kotlin.collections.c.B2(b5);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
            }
        }
        v a10 = mVar.a();
        if (a10 == null || (m10 = TypeUtilsKt.m(a10)) == null) {
            return (aa.f) pVar.c.getValue();
        }
        return m10;
    }
}
