package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
final class ReflectJavaClass$innerClassNames$1 extends Lambda implements l<Class<?>, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final ReflectJavaClass$innerClassNames$1 f13591j = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(Class<?> cls) {
        boolean z10;
        if (cls.getSimpleName().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
