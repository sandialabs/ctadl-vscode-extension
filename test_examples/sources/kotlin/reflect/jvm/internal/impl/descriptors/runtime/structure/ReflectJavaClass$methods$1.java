package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class ReflectJavaClass$methods$1 extends Lambda implements l<Method, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f13593j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(a aVar) {
        super(1);
        this.f13593j = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r5 != false) goto L4;
     */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(Method method) {
        boolean equals;
        Method method2 = method;
        boolean z10 = false;
        if (!method2.isSynthetic()) {
            if (this.f13593j.p()) {
                String name = method2.getName();
                if (g.a(name, "values")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    g.e(parameterTypes, "method.parameterTypes");
                    if (parameterTypes.length == 0) {
                        equals = true;
                    }
                    equals = false;
                } else {
                    if (g.a(name, "valueOf")) {
                        equals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                    }
                    equals = false;
                }
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
