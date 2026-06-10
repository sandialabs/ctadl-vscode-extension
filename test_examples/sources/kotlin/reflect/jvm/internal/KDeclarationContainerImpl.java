package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.text.Regex;
import l8.l;
import l8.z;
import m7.n;

/* loaded from: classes.dex */
public abstract class KDeclarationContainerImpl implements v7.b {

    /* renamed from: i  reason: collision with root package name */
    public static final Regex f13142i = new Regex("<v#(\\d+)>");

    /* loaded from: classes.dex */
    public abstract class Data {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ c8.j<Object>[] f13143b = {v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a  reason: collision with root package name */
        public final g.a f13144a;

        public Data(KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f13144a = g.c(new KDeclarationContainerImpl$Data$moduleData$2(kDeclarationContainerImpl));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public enum MemberBelonginess {
        DECLARED,
        INHERITED
    }

    public static Method o(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class E1;
        Method o10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method q10 = q(cls, str, clsArr, cls2);
        if (q10 != null) {
            return q10;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (o10 = o(superclass, str, clsArr, cls2, z10)) == null) {
            Class<?>[] interfaces = cls.getInterfaces();
            v7.g.e(interfaces, "interfaces");
            for (Class<?> cls3 : interfaces) {
                v7.g.e(cls3, "superInterface");
                Method o11 = o(cls3, str, clsArr, cls2, z10);
                if (o11 != null) {
                    return o11;
                }
                if (z10 && (E1 = m0.b.E1(ReflectClassUtilKt.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                    clsArr[0] = cls3;
                    Method q11 = q(E1, str, clsArr, cls2);
                    if (q11 != null) {
                        return q11;
                    }
                }
            }
            return null;
        }
        return o10;
    }

    public static Method q(Class cls, String str, Class[] clsArr, Class cls2) {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (v7.g.a(declaredMethod.getReturnType(), cls2)) {
            return declaredMethod;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        v7.g.e(declaredMethods, "declaredMethods");
        for (Method method : declaredMethods) {
            if (v7.g.a(method.getName(), str) && v7.g.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public final void f(ArrayList arrayList, String str, boolean z10) {
        Object obj;
        ArrayList n = n(str);
        arrayList.addAll(n);
        int size = ((n.size() + 32) - 1) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            v7.g.e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (z10) {
            obj = v7.d.class;
            arrayList.remove(obj);
        } else {
            obj = Object.class;
        }
        arrayList.add(obj);
    }

    public final Method g(String str, String str2) {
        Method o10;
        v7.g.f(str, "name");
        v7.g.f(str2, "desc");
        if (v7.g.a(str, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) n(str2).toArray(new Class[0]);
        Class p10 = p(kotlin.text.b.d1(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method o11 = o(l(), str, clsArr, p10, false);
        if (o11 != null) {
            return o11;
        }
        if (!l().isInterface() || (o10 = o(Object.class, str, clsArr, p10, false)) == null) {
            return null;
        }
        return o10;
    }

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h();

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i(h9.e eVar);

    public abstract z j(int i10);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(MemberScope memberScope, MemberBelonginess memberBelonginess) {
        KCallableImpl kCallableImpl;
        boolean z10;
        boolean z11;
        v7.g.f(memberScope, "scope");
        c cVar = new c(this);
        Collection<l8.f> a10 = c.a.a(memberScope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (l8.f fVar : a10) {
            if (fVar instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) fVar;
                if (!v7.g.a(callableMemberDescriptor.g(), l.f15845h)) {
                    CallableMemberDescriptor.Kind h10 = callableMemberDescriptor.h();
                    h10.getClass();
                    boolean z12 = true;
                    if (h10 != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (memberBelonginess == MemberBelonginess.DECLARED) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 != z11) {
                        z12 = false;
                    }
                    if (z12) {
                        kCallableImpl = (KCallableImpl) fVar.n0(cVar, n.f16010a);
                        if (kCallableImpl == null) {
                            arrayList.add(kCallableImpl);
                        }
                    }
                }
            }
            kCallableImpl = null;
            if (kCallableImpl == null) {
            }
        }
        return kotlin.collections.c.L2(arrayList);
    }

    public Class<?> l() {
        Class<?> e10 = e();
        List<c8.b<? extends Object>> list = ReflectClassUtilKt.f13582a;
        v7.g.f(e10, "<this>");
        Class<? extends Object> cls = ReflectClassUtilKt.c.get(e10);
        if (cls == null) {
            return e();
        }
        return cls;
    }

    public abstract Collection<z> m(h9.e eVar);

    public final ArrayList n(String str) {
        int d12;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char charAt = str.charAt(i11);
            if (kotlin.text.b.Z0("VZCBSIFJD", charAt)) {
                d12 = i11 + 1;
            } else if (charAt != 'L') {
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
            } else {
                d12 = kotlin.text.b.d1(str, ';', i10, false, 4) + 1;
            }
            arrayList.add(p(i10, d12, str));
            i10 = d12;
        }
        return arrayList;
    }

    public final Class p(int i10, int i11, String str) {
        Class<?> cls;
        String str2;
        char charAt = str.charAt(i10);
        if (charAt == 'L') {
            ClassLoader d5 = ReflectClassUtilKt.d(e());
            String substring = str.substring(i10 + 1, i11 - 1);
            v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            cls = d5.loadClass(ha.i.V0(substring, '/', '.'));
            str2 = "jClass.safeClassLoader.l…d - 1).replace('/', '.'))";
        } else if (charAt == '[') {
            Class p10 = p(i10 + 1, i11, str);
            h9.c cVar = f8.i.f10969a;
            v7.g.f(p10, "<this>");
            return Array.newInstance(p10, 0).getClass();
        } else if (charAt == 'V') {
            cls = Void.TYPE;
            str2 = "TYPE";
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
        }
        v7.g.e(cls, str2);
        return cls;
    }
}
