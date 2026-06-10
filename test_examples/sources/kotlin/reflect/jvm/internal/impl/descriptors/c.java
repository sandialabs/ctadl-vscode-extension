package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.i0;
import y9.r;

/* loaded from: classes.dex */
public interface c extends e {
    boolean O();

    l8.b P();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, l8.g, l8.f
    l8.e c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    c d(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    List<i0> getTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    r k();
}
