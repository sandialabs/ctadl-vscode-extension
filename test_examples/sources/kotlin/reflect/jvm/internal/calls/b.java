package kotlin.reflect.jvm.internal.calls;

import g0.f1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.jvm.internal.calls.a;
import m7.n;
import n7.i;

/* loaded from: classes.dex */
public abstract class b<M extends Member> implements kotlin.reflect.jvm.internal.calls.a<M> {

    /* renamed from: a  reason: collision with root package name */
    public final M f13263a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f13264b;
    public final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Type> f13265d;

    /* loaded from: classes.dex */
    public static final class a extends b<Constructor<?>> implements g8.b {

        /* renamed from: e  reason: collision with root package name */
        public final Object f13266e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, (Type[]) (r1.length <= 2 ? new Type[0] : i.f2(1, r1.length - 1, r1)));
            v7.g.f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            v7.g.e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            v7.g.e(genericParameterTypes, "constructor.genericParameterTypes");
            this.f13266e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            a.C0142a.a(this, objArr);
            f1 f1Var = new f1(3);
            f1Var.a(this.f13266e);
            f1Var.b(objArr);
            f1Var.a(null);
            return ((Constructor) this.f13263a).newInstance(f1Var.g(new Object[f1Var.f()]));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.calls.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0143b extends b<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0143b(Constructor<?> constructor) {
            super(constructor, r0, null, (Type[]) (r1.length <= 1 ? new Type[0] : i.f2(0, r1.length - 1, r1)));
            v7.g.f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            v7.g.e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            v7.g.e(genericParameterTypes, "constructor.genericParameterTypes");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            a.C0142a.a(this, objArr);
            f1 f1Var = new f1(2);
            f1Var.b(objArr);
            f1Var.a(null);
            return ((Constructor) this.f13263a).newInstance(f1Var.g(new Object[f1Var.f()]));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b<Constructor<?>> implements g8.b {

        /* renamed from: e  reason: collision with root package name */
        public final Object f13267e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, r1);
            v7.g.f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            v7.g.e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            v7.g.e(genericParameterTypes, "constructor.genericParameterTypes");
            this.f13267e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            a.C0142a.a(this, objArr);
            f1 f1Var = new f1(2);
            f1Var.a(this.f13267e);
            f1Var.b(objArr);
            return ((Constructor) this.f13263a).newInstance(f1Var.g(new Object[f1Var.f()]));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Constructor<?> constructor) {
            super(constructor, r0, r2, r1);
            v7.g.f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            v7.g.e(declaringClass, "constructor.declaringClass");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            if (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) {
                declaringClass3 = null;
            }
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            v7.g.e(genericParameterTypes, "constructor.genericParameterTypes");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public final Object a(Object[] objArr) {
            a.C0142a.a(this, objArr);
            return ((Constructor) this.f13263a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends b<Field> {

        /* loaded from: classes.dex */
        public static final class a extends e implements g8.b {

            /* renamed from: e  reason: collision with root package name */
            public final Object f13268e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false);
                v7.g.f(field, "field");
                this.f13268e = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.e, kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                a.C0142a.a(this, objArr);
                return ((Field) this.f13263a).get(this.f13268e);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.calls.b$e$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0144b extends e implements g8.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0144b(Field field) {
                super(field, false);
                v7.g.f(field, "field");
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true);
                v7.g.f(field, "field");
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true);
                v7.g.f(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b
            public final void b(Object[] objArr) {
                a.C0142a.a(this, objArr);
                c(kotlin.collections.b.m2(objArr));
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.calls.b$e$e  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0145e extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0145e(Field field) {
                super(field, false);
                v7.g.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(Field field, boolean z10) {
            super(field, r0, z10 ? field.getDeclaringClass() : null, new Type[0]);
            Type genericType = field.getGenericType();
            v7.g.e(genericType, "field.genericType");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public Object a(Object[] objArr) {
            b(objArr);
            return ((Field) this.f13263a).get(this.c != null ? kotlin.collections.b.l2(objArr) : null);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends b<Field> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13269e;

        /* loaded from: classes.dex */
        public static final class a extends f implements g8.b {

            /* renamed from: f  reason: collision with root package name */
            public final Object f13270f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false);
                v7.g.f(field, "field");
                this.f13270f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.f, kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                b(objArr);
                ((Field) this.f13263a).set(this.f13270f, kotlin.collections.b.l2(objArr));
                return n.f16010a;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.calls.b$f$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0146b extends f implements g8.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0146b(Field field, boolean z10) {
                super(field, z10, false);
                v7.g.f(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.f, kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                b(objArr);
                ((Field) this.f13263a).set(null, kotlin.collections.b.r2(objArr));
                return n.f16010a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true);
                v7.g.f(field, "field");
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true);
                v7.g.f(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.b.f, kotlin.reflect.jvm.internal.calls.b
            public final void b(Object[] objArr) {
                super.b(objArr);
                c(kotlin.collections.b.m2(objArr));
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false);
                v7.g.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(Field field, boolean z10, boolean z11) {
            super(field, r0, r7, new Type[]{r2});
            Class cls = Void.TYPE;
            v7.g.e(cls, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            v7.g.e(genericType, "field.genericType");
            this.f13269e = z10;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public Object a(Object[] objArr) {
            b(objArr);
            ((Field) this.f13263a).set(this.c != null ? kotlin.collections.b.l2(objArr) : null, kotlin.collections.b.r2(objArr));
            return n.f16010a;
        }

        @Override // kotlin.reflect.jvm.internal.calls.b
        public void b(Object[] objArr) {
            a.C0142a.a(this, objArr);
            if (this.f13269e && kotlin.collections.b.r2(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g extends b<Method> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13271e;

        /* loaded from: classes.dex */
        public static final class a extends g implements g8.b {

            /* renamed from: f  reason: collision with root package name */
            public final Object f13272f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, 4);
                v7.g.f(method, "method");
                this.f13272f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                a.C0142a.a(this, objArr);
                return d(this.f13272f, objArr);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.calls.b$g$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0147b extends g implements g8.b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0147b(Method method) {
                super(method, false, 4);
                v7.g.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                a.C0142a.a(this, objArr);
                return d(null, objArr);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends g implements g8.b {

            /* renamed from: f  reason: collision with root package name */
            public final Object f13273f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public c(Method method, Object obj) {
                super(method, false, (Type[]) (r0.length <= 1 ? new Type[0] : i.f2(1, r0.length, r0)));
                v7.g.f(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                v7.g.e(genericParameterTypes, "method.genericParameterTypes");
                this.f13273f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                a.C0142a.a(this, objArr);
                f1 f1Var = new f1(2);
                f1Var.a(this.f13273f);
                f1Var.b(objArr);
                return d(null, f1Var.g(new Object[f1Var.f()]));
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, 6);
                v7.g.f(method, "method");
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
                return d(obj, f22);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, 4);
                v7.g.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                Object[] f22;
                a.C0142a.a(this, objArr);
                c(kotlin.collections.b.m2(objArr));
                if (objArr.length <= 1) {
                    f22 = new Object[0];
                } else {
                    f22 = i.f2(1, objArr.length, objArr);
                }
                return d(null, f22);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, 6);
                v7.g.f(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.a
            public final Object a(Object[] objArr) {
                a.C0142a.a(this, objArr);
                return d(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ g(Method method, boolean z10, int i10) {
            this(method, z10, r4);
            Type[] typeArr;
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                v7.g.e(typeArr, "method.genericParameterTypes");
            } else {
                typeArr = null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(Method method, boolean z10, Type[] typeArr) {
            super(method, r0, z10 ? method.getDeclaringClass() : null, typeArr);
            Type genericReturnType = method.getGenericReturnType();
            v7.g.e(genericReturnType, "method.genericReturnType");
            this.f13271e = v7.g.a(genericReturnType, Void.TYPE);
        }

        public final Object d(Object obj, Object[] objArr) {
            v7.g.f(objArr, "args");
            return this.f13271e ? n.f16010a : ((Method) this.f13263a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> w22;
        this.f13263a = member;
        this.f13264b = type;
        this.c = cls;
        if (cls != null) {
            f1 f1Var = new f1(2);
            f1Var.a(cls);
            f1Var.b(typeArr);
            w22 = a1.c.O0(f1Var.g(new Type[f1Var.f()]));
        }
        w22 = kotlin.collections.b.w2(typeArr);
        this.f13265d = w22;
    }

    public void b(Object[] objArr) {
        a.C0142a.a(this, objArr);
    }

    public final void c(Object obj) {
        if (obj == null || !this.f13263a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Type k() {
        return this.f13264b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final List<Type> l() {
        return this.f13265d;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final M m() {
        return this.f13263a;
    }
}
