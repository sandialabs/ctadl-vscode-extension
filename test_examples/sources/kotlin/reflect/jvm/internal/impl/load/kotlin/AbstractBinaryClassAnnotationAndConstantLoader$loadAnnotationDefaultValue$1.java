package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import u7.p;

/* loaded from: classes.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1 extends Lambda implements p<AbstractBinaryClassAnnotationAndConstantLoader.a<? extends A, ? extends C>, i, C> {

    /* renamed from: j  reason: collision with root package name */
    public static final AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1 f13914j = new AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1();

    public AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(Object obj, i iVar) {
        AbstractBinaryClassAnnotationAndConstantLoader.a aVar = (AbstractBinaryClassAnnotationAndConstantLoader.a) obj;
        i iVar2 = iVar;
        v7.g.f(aVar, "$this$loadConstantFromProperty");
        v7.g.f(iVar2, "it");
        return aVar.c.get(iVar2);
    }
}
