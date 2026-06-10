package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import u7.p;
import v7.i;
import y9.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends FunctionReference implements p<r, r, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(g gVar) {
        super(2, gVar);
    }

    @Override // u7.p
    public final Boolean R(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        v7.g.f(rVar3, "p0");
        v7.g.f(rVar4, "p1");
        return Boolean.valueOf(((g) this.f13048j).c(rVar3, rVar4));
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.a(g.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "equalTypes";
    }
}
