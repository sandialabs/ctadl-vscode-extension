package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes.dex */
public final class LazyJavaClassDescriptor$moduleAnnotations$2 extends Lambda implements u7.a<List<? extends b9.a>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f13739j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$moduleAnnotations$2(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.f13739j = lazyJavaClassDescriptor;
    }

    @Override // u7.a
    public final List<? extends b9.a> k0() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f13739j;
        h9.b f10 = DescriptorUtilsKt.f(lazyJavaClassDescriptor);
        if (f10 != null) {
            lazyJavaClassDescriptor.f13725p.f18762a.f18759w.e(f10);
            return null;
        }
        return null;
    }
}
