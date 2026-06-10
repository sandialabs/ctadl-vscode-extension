package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyJavaAnnotationDescriptor$fqName$2 extends Lambda implements u7.a<h9.c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaAnnotationDescriptor f13723j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$fqName$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.f13723j = lazyJavaAnnotationDescriptor;
    }

    @Override // u7.a
    public final h9.c k0() {
        h9.b d5 = this.f13723j.f13716b.d();
        if (d5 != null) {
            return d5.b();
        }
        return null;
    }
}
