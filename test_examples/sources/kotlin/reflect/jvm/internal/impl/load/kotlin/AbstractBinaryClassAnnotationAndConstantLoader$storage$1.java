package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import u7.l;

/* loaded from: classes.dex */
final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends Lambda implements l<h, AbstractBinaryClassAnnotationAndConstantLoader.a<Object, Object>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> f13916j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader) {
        super(1);
        this.f13916j = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // u7.l
    public final AbstractBinaryClassAnnotationAndConstantLoader.a<Object, Object> U(h hVar) {
        h hVar2 = hVar;
        v7.g.f(hVar2, "kotlinClass");
        AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> abstractBinaryClassAnnotationAndConstantLoader = this.f13916j;
        abstractBinaryClassAnnotationAndConstantLoader.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hVar2.c(new a(abstractBinaryClassAnnotationAndConstantLoader, hashMap, hVar2, hashMap2));
        return new AbstractBinaryClassAnnotationAndConstantLoader.a<>(hashMap, hashMap2, hashMap3);
    }
}
