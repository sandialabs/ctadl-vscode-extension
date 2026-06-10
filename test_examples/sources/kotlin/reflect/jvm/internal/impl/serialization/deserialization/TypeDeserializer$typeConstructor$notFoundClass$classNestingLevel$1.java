package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.FunctionReference;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends FunctionReference implements l<h9.b, h9.b> {

    /* renamed from: r  reason: collision with root package name */
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 f14815r = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1();

    public TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1() {
        super(1);
    }

    @Override // u7.l
    public final h9.b U(h9.b bVar) {
        h9.b bVar2 = bVar;
        g.f(bVar2, "p0");
        return bVar2.g();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.a(h9.b.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "getOuterClassId";
    }
}
