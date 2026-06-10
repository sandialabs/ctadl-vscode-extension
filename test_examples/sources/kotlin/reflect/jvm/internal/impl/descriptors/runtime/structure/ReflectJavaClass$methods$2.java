package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import c8.d;
import java.lang.reflect.Method;
import kotlin.jvm.internal.FunctionReference;
import r8.q;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReference implements l<Method, q> {

    /* renamed from: r  reason: collision with root package name */
    public static final ReflectJavaClass$methods$2 f13594r = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1);
    }

    @Override // u7.l
    public final q U(Method method) {
        Method method2 = method;
        g.f(method2, "p0");
        return new q(method2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(q.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "<init>";
    }
}
