package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import h9.e;
import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
final class ReflectJavaClass$innerClassNames$2 extends Lambda implements l<Class<?>, e> {

    /* renamed from: j  reason: collision with root package name */
    public static final ReflectJavaClass$innerClassNames$2 f13592j = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    @Override // u7.l
    public final e U(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!e.l(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return e.k(simpleName);
    }
}
