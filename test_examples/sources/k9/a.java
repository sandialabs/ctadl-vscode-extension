package k9;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes.dex */
public final class a<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return a1.c.g0(DescriptorUtilsKt.g((l8.b) t10).b(), DescriptorUtilsKt.g((l8.b) t11).b());
    }
}
