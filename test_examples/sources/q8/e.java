package q8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* loaded from: classes.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.load.kotlin.h {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f16950a;

    /* renamed from: b  reason: collision with root package name */
    public final KotlinClassHeader f16951b;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
            if (r0.f13971d != null) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static e a(Class cls) {
            KotlinClassHeader kotlinClassHeader;
            boolean z10;
            v7.g.f(cls, "klass");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a();
            c.b(cls, aVar);
            if (aVar.f13974g != null && aVar.f13969a != null) {
                int[] iArr = aVar.f13969a;
                boolean z11 = true;
                if ((aVar.c & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g9.e eVar = new g9.e(iArr, z10);
                if (!eVar.c()) {
                    aVar.f13973f = aVar.f13971d;
                    aVar.f13971d = null;
                } else {
                    KotlinClassHeader.Kind kind = aVar.f13974g;
                    if (kind != KotlinClassHeader.Kind.f13961l && kind != KotlinClassHeader.Kind.f13962m && kind != KotlinClassHeader.Kind.f13964p) {
                        z11 = false;
                    }
                }
                String[] strArr = aVar.f13975h;
                if (strArr != null) {
                    g9.a.b(strArr);
                }
                kotlinClassHeader = new KotlinClassHeader(aVar.f13974g, eVar, aVar.f13971d, aVar.f13973f, aVar.f13972e, aVar.f13970b, aVar.c);
                if (kotlinClassHeader != null) {
                    return null;
                }
                return new e(cls, kotlinClassHeader);
            }
            kotlinClassHeader = null;
            if (kotlinClassHeader != null) {
            }
        }
    }

    public e() {
        throw null;
    }

    public e(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f16950a = cls;
        this.f16951b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h
    public final KotlinClassHeader a() {
        return this.f16951b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h
    public final String b() {
        return ha.i.V0(this.f16950a.getName(), '.', '/').concat(".class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h
    public final void c(kotlin.reflect.jvm.internal.impl.load.kotlin.a aVar) {
        String str;
        String str2;
        String str3;
        Constructor<?>[] constructorArr;
        boolean z10;
        Class<?> cls = this.f16950a;
        v7.g.f(cls, "klass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        v7.g.e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i10 >= length) {
                break;
            }
            Method method = declaredMethods[i10];
            h9.e k3 = h9.e.k(method.getName());
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            v7.g.e(parameterTypes, "method.parameterTypes");
            for (Class<?> cls2 : parameterTypes) {
                v7.g.e(cls2, "parameterType");
                sb.append(ReflectClassUtilKt.b(cls2));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            v7.g.e(returnType, "method.returnType");
            sb.append(ReflectClassUtilKt.b(returnType));
            String sb2 = sb.toString();
            v7.g.e(sb2, "sb.toString()");
            a.C0158a b5 = aVar.b(k3, sb2);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            v7.g.e(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                v7.g.e(annotation, "annotation");
                c.c(b5, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            v7.g.e(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                Annotation[] annotationArr2 = annotationArr[i11];
                v7.g.e(annotationArr2, "annotations");
                int length3 = annotationArr2.length;
                int i12 = 0;
                while (i12 < length3) {
                    Annotation annotation2 = annotationArr2[i12];
                    Class y02 = a1.c.y0(a1.c.t0(annotation2));
                    Method[] methodArr = declaredMethods;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.f c = b5.c(i11, ReflectClassUtilKt.a(y02), new b(annotation2));
                    if (c != null) {
                        c.d(c, annotation2, y02);
                    }
                    i12++;
                    declaredMethods = methodArr;
                }
                Method[] methodArr2 = declaredMethods;
            }
            b5.a();
            i10++;
            declaredMethods = declaredMethods;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        v7.g.e(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i13 = 0;
        while (i13 < length4) {
            Constructor<?> constructor = declaredConstructors[i13];
            h9.e eVar = h9.g.f11578e;
            v7.g.e(constructor, "constructor");
            StringBuilder sb3 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            v7.g.e(parameterTypes2, "constructor.parameterTypes");
            int length5 = parameterTypes2.length;
            int i14 = 0;
            while (true) {
                constructorArr = declaredConstructors;
                if (i14 >= length5) {
                    break;
                }
                Class<?> cls3 = parameterTypes2[i14];
                v7.g.e(cls3, str2);
                sb3.append(ReflectClassUtilKt.b(cls3));
                i14++;
                declaredConstructors = constructorArr;
            }
            sb3.append(")V");
            String sb4 = sb3.toString();
            v7.g.e(sb4, str3);
            a.C0158a b10 = aVar.b(eVar, sb4);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            v7.g.e(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                v7.g.e(annotation3, "annotation");
                c.c(b10, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            v7.g.e(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length7 = parameterAnnotations2.length;
                int i15 = 0;
                while (i15 < length7) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i15];
                    v7.g.e(annotationArr3, str);
                    int length8 = annotationArr3.length;
                    int i16 = length4;
                    int i17 = 0;
                    while (i17 < length8) {
                        Annotation[][] annotationArr4 = parameterAnnotations2;
                        Annotation annotation4 = annotationArr3[i17];
                        String str4 = str;
                        Class y03 = a1.c.y0(a1.c.t0(annotation4));
                        String str5 = str2;
                        int i18 = length6;
                        String str6 = str3;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.f c10 = b10.c(i15 + length6, ReflectClassUtilKt.a(y03), new b(annotation4));
                        if (c10 != null) {
                            c.d(c10, annotation4, y03);
                        }
                        i17++;
                        parameterAnnotations2 = annotationArr4;
                        str2 = str5;
                        str = str4;
                        length6 = i18;
                        str3 = str6;
                    }
                    int i19 = length6;
                    Annotation[][] annotationArr5 = parameterAnnotations2;
                    String str7 = str;
                    String str8 = str2;
                    String str9 = str3;
                    i15++;
                    length4 = i16;
                }
            }
            b10.a();
            i13++;
            declaredConstructors = constructorArr;
            length4 = length4;
            str2 = str2;
            str = str;
            str3 = str3;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        v7.g.e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            h9.e k10 = h9.e.k(field.getName());
            Class<?> type = field.getType();
            v7.g.e(type, "field.type");
            a.b a10 = aVar.a(k10, ReflectClassUtilKt.b(type));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            v7.g.e(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                v7.g.e(annotation5, "annotation");
                c.c(a10, annotation5);
            }
            a10.a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h
    public final h9.b d() {
        return ReflectClassUtilKt.a(this.f16950a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h
    public final void e(h.c cVar) {
        c.b(this.f16950a, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (v7.g.a(this.f16950a, ((e) obj).f16950a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16950a.hashCode();
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f16950a;
    }
}
