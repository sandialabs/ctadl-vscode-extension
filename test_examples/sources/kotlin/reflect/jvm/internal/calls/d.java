package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.calls.a;
import n7.i;
import v7.g;

/* loaded from: classes.dex */
public abstract class d implements kotlin.reflect.jvm.internal.calls.a<Method> {

    /* renamed from: a  reason: collision with root package name */
    public final Method f13278a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Type> f13279b;
    public final Class c;

    /* loaded from: classes.dex */
    public static final class a extends d implements g8.b {

        /* renamed from: d  reason: collision with root package name */
        public final Object f13280d;

        public a(Method method, Object obj) {
            super(method, EmptyList.f12981i);
            this.f13280d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            a.C0142a.a(this, objArr);
            return this.f13278a.invoke(this.f13280d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {
        public b(Method method) {
            super(method, a1.c.N0(method.getDeclaringClass()));
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            Object[] f22;
            a.C0142a.a(this, objArr);
            Object obj = objArr[0];
            if (objArr.length <= 1) {
                f22 = new Object[0];
            } else {
                f22 = i.f2(1, objArr.length, objArr);
            }
            return this.f13278a.invoke(obj, Arrays.copyOf(f22, f22.length));
        }
    }

    public d(Method method, List list) {
        this.f13278a = method;
        this.f13279b = list;
        Class<?> returnType = method.getReturnType();
        g.e(returnType, "unboxMethod.returnType");
        this.c = returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Type k() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final List<Type> l() {
        return this.f13279b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final /* bridge */ /* synthetic */ Method m() {
        return null;
    }
}
