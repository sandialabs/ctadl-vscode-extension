package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaClassDescriptor$scopeHolder$1 extends Lambda implements l<e, LazyJavaClassMemberScope> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f13740j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.f13740j = lazyJavaClassDescriptor;
    }

    @Override // u7.l
    public final LazyJavaClassMemberScope U(e eVar) {
        boolean z10;
        g.f(eVar, "it");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f13740j;
        x8.c cVar = lazyJavaClassDescriptor.f13728s;
        b9.g gVar = lazyJavaClassDescriptor.f13726q;
        if (lazyJavaClassDescriptor.f13727r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new LazyJavaClassMemberScope(cVar, lazyJavaClassDescriptor, gVar, z10, lazyJavaClassDescriptor.f13735z);
    }
}
