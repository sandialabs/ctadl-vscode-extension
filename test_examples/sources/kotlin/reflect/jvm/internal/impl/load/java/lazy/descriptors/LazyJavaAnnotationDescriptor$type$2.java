package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import aa.h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import y9.v;

/* loaded from: classes.dex */
public final class LazyJavaAnnotationDescriptor$type$2 extends Lambda implements u7.a<v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaAnnotationDescriptor f13724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$type$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.f13724j = lazyJavaAnnotationDescriptor;
    }

    @Override // u7.a
    public final v k0() {
        l8.b bVar;
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f13724j;
        h9.c e10 = lazyJavaAnnotationDescriptor.e();
        b9.a aVar = lazyJavaAnnotationDescriptor.f13716b;
        if (e10 == null) {
            return h.c(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, aVar.toString());
        }
        a1.b bVar2 = a1.b.N0;
        x8.c cVar = lazyJavaAnnotationDescriptor.f13715a;
        l8.b r02 = a1.b.r0(bVar2, e10, cVar.f18762a.f18751o.u());
        if (r02 == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a q10 = aVar.q();
            x8.a aVar2 = cVar.f18762a;
            if (q10 != null) {
                bVar = aVar2.f18748k.a(q10);
            } else {
                bVar = null;
            }
            r02 = bVar;
            if (r02 == null) {
                r02 = FindClassInModuleKt.c(aVar2.f18751o, h9.b.l(e10), aVar2.f18741d.c().f17911l);
            }
        }
        return r02.r();
    }
}
