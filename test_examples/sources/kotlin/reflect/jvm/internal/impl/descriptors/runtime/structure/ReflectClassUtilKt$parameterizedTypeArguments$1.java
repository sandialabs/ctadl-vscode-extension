package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends Lambda implements l<ParameterizedType, ParameterizedType> {

    /* renamed from: j  reason: collision with root package name */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 f13585j = new ReflectClassUtilKt$parameterizedTypeArguments$1();

    public ReflectClassUtilKt$parameterizedTypeArguments$1() {
        super(1);
    }

    @Override // u7.l
    public final ParameterizedType U(ParameterizedType parameterizedType) {
        ParameterizedType parameterizedType2 = parameterizedType;
        g.f(parameterizedType2, "it");
        Type ownerType = parameterizedType2.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
