package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.calls.a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import n7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public final class AnnotationConstructorCaller implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13247a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f13248b;
    public final CallMode c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Method> f13249d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f13250e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f13251f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f13252g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public enum Origin {
        JAVA,
        KOTLIN
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode) {
        this(cls, arrayList, callMode, r4, r5);
        Origin origin = Origin.KOTLIN;
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c A[LOOP:0: B:3:0x000d->B:49:0x011c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.calls.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object[] objArr) {
        c8.b a10;
        Class cls;
        String b5;
        a.C0142a.a(this, objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List<String> list = this.f13248b;
            if (i10 < length) {
                Object obj = objArr[i10];
                int i12 = i11 + 1;
                ArrayList arrayList2 = this.f13251f;
                if (obj == null) {
                    if (this.c == CallMode.CALL_BY_NAME) {
                        obj = this.f13252g.get(i11);
                        if (obj == null) {
                            String str = list.get(i11);
                            Class cls2 = (Class) arrayList2.get(i11);
                            if (g.a(cls2, Class.class)) {
                                cls = c8.b.class;
                            } else if (cls2.isArray() && g.a(cls2.getComponentType(), Class.class)) {
                                cls = c8.b[].class;
                            } else {
                                a10 = i.a(cls2);
                                if (!g.a(a10.b(), i.a(Object[].class).b())) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(a10.b());
                                    sb.append('<');
                                    Class<?> componentType = a1.c.y0(a10).getComponentType();
                                    g.e(componentType, "kotlinClass.java.componentType");
                                    sb.append(i.a(componentType).b());
                                    sb.append('>');
                                    b5 = sb.toString();
                                } else {
                                    b5 = a10.b();
                                }
                                throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + b5);
                            }
                            a10 = i.a(cls);
                            if (!g.a(a10.b(), i.a(Object[].class).b())) {
                            }
                            throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + b5);
                        }
                        arrayList.add(obj);
                        i10++;
                        i11 = i12;
                    }
                }
                Class cls3 = (Class) arrayList2.get(i11);
                if (!(obj instanceof Class)) {
                    if (obj instanceof c8.b) {
                        obj = a1.c.y0((c8.b) obj);
                    } else if (obj instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj;
                        if (!(objArr2 instanceof Class[])) {
                            if (objArr2 instanceof c8.b[]) {
                                g.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                c8.b[] bVarArr = (c8.b[]) obj;
                                ArrayList arrayList3 = new ArrayList(bVarArr.length);
                                for (c8.b bVar : bVarArr) {
                                    arrayList3.add(a1.c.y0(bVar));
                                }
                                obj = arrayList3.toArray(new Class[0]);
                            } else {
                                obj = objArr2;
                            }
                        }
                    }
                    if (cls3.isInstance(obj)) {
                        if (obj == null) {
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                }
            } else {
                return AnnotationConstructorCallerKt.a(this.f13247a, kotlin.collections.d.N1(kotlin.collections.c.S2(list, arrayList)), this.f13249d);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Type k() {
        return this.f13247a;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final List<Type> l() {
        return this.f13250e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final /* bridge */ /* synthetic */ Member m() {
        return null;
    }

    public AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode, Origin origin, List list) {
        g.f(cls, "jClass");
        g.f(list, "methods");
        this.f13247a = cls;
        this.f13248b = arrayList;
        this.c = callMode;
        this.f13249d = list;
        ArrayList arrayList2 = new ArrayList(l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f13250e = arrayList2;
        List<Method> list2 = this.f13249d;
        ArrayList arrayList3 = new ArrayList(l.Z1(list2, 10));
        for (Method method : list2) {
            Class<?> returnType = method.getReturnType();
            g.e(returnType, "it");
            List<c8.b<? extends Object>> list3 = ReflectClassUtilKt.f13582a;
            Class<? extends Object> cls2 = ReflectClassUtilKt.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f13251f = arrayList3;
        List<Method> list4 = this.f13249d;
        ArrayList arrayList4 = new ArrayList(l.Z1(list4, 10));
        for (Method method2 : list4) {
            arrayList4.add(method2.getDefaultValue());
        }
        this.f13252g = arrayList4;
        if (this.c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA) {
            List<String> list5 = this.f13248b;
            g.f(list5, "<this>");
            ArrayList arrayList5 = new ArrayList(l.Z1(list5, 10));
            Iterator<T> it2 = list5.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!z10 && g.a(next, "value")) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    arrayList5.add(next);
                }
            }
            if (!arrayList5.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }
}
