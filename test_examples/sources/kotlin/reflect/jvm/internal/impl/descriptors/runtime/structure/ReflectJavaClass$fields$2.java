package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import c8.d;
import java.lang.reflect.Field;
import kotlin.jvm.internal.FunctionReference;
import r8.n;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements l<Field, n> {

    /* renamed from: r  reason: collision with root package name */
    public static final ReflectJavaClass$fields$2 f13590r = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1);
    }

    @Override // u7.l
    public final n U(Field field) {
        Field field2 = field;
        g.f(field2, "p0");
        return new n(field2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(n.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "<init>";
    }
}
