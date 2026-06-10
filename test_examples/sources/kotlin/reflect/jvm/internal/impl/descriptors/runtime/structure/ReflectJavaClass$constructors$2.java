package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import c8.d;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReference;
import r8.k;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements l<Constructor<?>, k> {

    /* renamed from: r  reason: collision with root package name */
    public static final ReflectJavaClass$constructors$2 f13588r = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // u7.l
    public final k U(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        g.f(constructor2, "p0");
        return new k(constructor2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(k.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "<init>";
    }
}
