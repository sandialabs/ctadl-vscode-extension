package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import u7.p;
import v7.i;
import y9.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReference implements p<r, r, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(TypeIntersector typeIntersector) {
        super(2, typeIntersector);
    }

    @Override // u7.p
    public final Boolean R(r rVar, r rVar2) {
        boolean z10;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        v7.g.f(rVar3, "p0");
        v7.g.f(rVar4, "p1");
        ((TypeIntersector) this.f13048j).getClass();
        f.f14999b.getClass();
        g gVar = f.a.f15001b;
        if (gVar.d(rVar3, rVar4) && !gVar.d(rVar4, rVar3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.a(TypeIntersector.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "isStrictSupertype";
    }
}
