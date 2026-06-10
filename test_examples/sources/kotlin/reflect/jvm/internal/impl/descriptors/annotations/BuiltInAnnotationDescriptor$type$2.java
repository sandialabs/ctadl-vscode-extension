package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import y9.v;

/* loaded from: classes.dex */
public final class BuiltInAnnotationDescriptor$type$2 extends Lambda implements u7.a<v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ BuiltInAnnotationDescriptor f13480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInAnnotationDescriptor$type$2(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        super(0);
        this.f13480j = builtInAnnotationDescriptor;
    }

    @Override // u7.a
    public final v k0() {
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = this.f13480j;
        return builtInAnnotationDescriptor.f13477a.j(builtInAnnotationDescriptor.f13478b).r();
    }
}
