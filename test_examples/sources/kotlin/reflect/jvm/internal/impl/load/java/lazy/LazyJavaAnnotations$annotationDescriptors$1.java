package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import h9.e;
import kotlin.jvm.internal.Lambda;
import m8.c;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaAnnotations$annotationDescriptors$1 extends Lambda implements l<b9.a, c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaAnnotations f13692j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotations$annotationDescriptors$1(LazyJavaAnnotations lazyJavaAnnotations) {
        super(1);
        this.f13692j = lazyJavaAnnotations;
    }

    @Override // u7.l
    public final c U(b9.a aVar) {
        b9.a aVar2 = aVar;
        g.f(aVar2, "annotation");
        e eVar = v8.c.f18181a;
        LazyJavaAnnotations lazyJavaAnnotations = this.f13692j;
        return v8.c.b(lazyJavaAnnotations.f13688i, aVar2, lazyJavaAnnotations.f13690k);
    }
}
