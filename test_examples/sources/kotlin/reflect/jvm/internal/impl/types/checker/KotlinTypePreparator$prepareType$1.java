package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import u7.l;
import v7.i;
import y9.m0;

/* loaded from: classes.dex */
public /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements l<ba.f, m0> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    @Override // u7.l
    public final m0 U(ba.f fVar) {
        ba.f fVar2 = fVar;
        v7.g.f(fVar2, "p0");
        return ((KotlinTypePreparator) this.f13048j).G0(fVar2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.a(KotlinTypePreparator.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "prepareType";
    }
}
