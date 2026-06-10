package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.FunctionReference;
import u7.l;

/* loaded from: classes.dex */
public /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends FunctionReference implements l<h9.b, h9.b> {

    /* renamed from: r  reason: collision with root package name */
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 f13437r = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1();

    public FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1() {
        super(1);
    }

    @Override // u7.l
    public final h9.b U(h9.b bVar) {
        h9.b bVar2 = bVar;
        v7.g.f(bVar2, "p0");
        return bVar2.g();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return v7.i.a(h9.b.class);
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
