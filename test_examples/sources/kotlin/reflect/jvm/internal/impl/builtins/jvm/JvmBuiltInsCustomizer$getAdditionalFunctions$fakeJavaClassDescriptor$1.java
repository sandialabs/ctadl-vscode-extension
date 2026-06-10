package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import l8.f;
import v7.g;

/* loaded from: classes.dex */
final class JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 extends Lambda implements u7.a<l8.b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f13407j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l8.b f13408k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1(LazyJavaClassDescriptor lazyJavaClassDescriptor, l8.b bVar) {
        super(0);
        this.f13407j = lazyJavaClassDescriptor;
        this.f13408k = bVar;
    }

    @Override // u7.a
    public final l8.b k0() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f13407j;
        lazyJavaClassDescriptor.getClass();
        x8.c cVar = lazyJavaClassDescriptor.f13728s;
        x8.a aVar = cVar.f18762a;
        aVar.getClass();
        x8.c cVar2 = new x8.c(new x8.a(aVar.f18739a, aVar.f18740b, aVar.c, aVar.f18741d, aVar.f18742e, aVar.f18743f, aVar.f18745h, aVar.f18746i, aVar.f18747j, aVar.f18748k, aVar.f18749l, aVar.f18750m, aVar.n, aVar.f18751o, aVar.f18752p, aVar.f18753q, aVar.f18754r, aVar.f18755s, aVar.f18756t, aVar.f18757u, aVar.f18758v, aVar.f18759w), cVar.f18763b, cVar.c);
        f c = lazyJavaClassDescriptor.c();
        g.e(c, "containingDeclaration");
        return new LazyJavaClassDescriptor(cVar2, c, lazyJavaClassDescriptor.f13726q, this.f13408k);
    }
}
