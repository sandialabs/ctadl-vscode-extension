package k8;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import u9.h;
import u9.j;
import u9.k;

/* loaded from: classes.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LockBasedStorageManager lockBasedStorageManager, q8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar, NotFoundClasses notFoundClasses, JvmBuiltInsCustomizer jvmBuiltInsCustomizer, JvmBuiltInsCustomizer jvmBuiltInsCustomizer2, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, q9.b bVar) {
        super(lockBasedStorageManager, fVar, cVar);
        v7.g.f(jvmBuiltInsCustomizer, "additionalClassPartsProvider");
        v7.g.f(jvmBuiltInsCustomizer2, "platformDependentDeclarationFilter");
        v7.g.f(gVar, "kotlinTypeChecker");
        h hVar = new h(this);
        v9.a aVar = v9.a.f18189m;
        this.f14820d = new u9.e(lockBasedStorageManager, cVar, hVar, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.c(cVar, notFoundClasses, aVar), this, j.f17929a, k.a.f17930a, a1.c.O0(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(lockBasedStorageManager, cVar), new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(lockBasedStorageManager, cVar)), notFoundClasses, jvmBuiltInsCustomizer, jvmBuiltInsCustomizer2, aVar.f17697a, gVar, bVar, null, 786432);
    }
}
