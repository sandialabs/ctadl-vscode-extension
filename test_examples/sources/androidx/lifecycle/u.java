package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f5422a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f5423b = new HashMap();

    public static h a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            v7.g.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (h) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z10;
        boolean z11;
        List list;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        HashMap hashMap = f5422a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                v7.g.e(str, "fullPackage");
                if (str.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    v7.g.e(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    v7.g.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                v7.g.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = ha.i.W0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f5423b;
            if (constructor != null) {
                list = a1.c.N0(constructor);
            } else {
                c cVar = c.c;
                HashMap hashMap3 = cVar.f5368b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((x) declaredMethods[i11].getAnnotation(x.class)) != null) {
                                    cVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && p.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        v7.g.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            v7.g.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    v7.g.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && p.class.isAssignableFrom(cls2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                v7.g.e(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                v7.g.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
