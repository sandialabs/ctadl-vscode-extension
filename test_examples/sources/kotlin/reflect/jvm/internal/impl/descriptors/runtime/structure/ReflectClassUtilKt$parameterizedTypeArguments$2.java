package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import ga.h;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.b;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements l<ParameterizedType, h<? extends Type>> {

    /* renamed from: j  reason: collision with root package name */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 f13586j = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    public ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    @Override // u7.l
    public final h<? extends Type> U(ParameterizedType parameterizedType) {
        ParameterizedType parameterizedType2 = parameterizedType;
        g.f(parameterizedType2, "it");
        Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
        g.e(actualTypeArguments, "it.actualTypeArguments");
        return b.i2(actualTypeArguments);
    }
}
