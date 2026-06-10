package r7;

import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17134a;

    static {
        a aVar;
        try {
            Object newInstance = t7.a.class.newInstance();
            g.e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    aVar = (a) newInstance;
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (g.a(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = s7.a.class.newInstance();
                g.e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        aVar = (a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        aVar = new a();
                    }
                } catch (ClassCastException e11) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (g.a(classLoader3, classLoader4)) {
                        throw e11;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            g.e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    aVar = (a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    g.e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        aVar = (a) newInstance4;
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (g.a(classLoader5, classLoader6)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                }
            } catch (ClassCastException e13) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = a.class.getClassLoader();
                if (g.a(classLoader7, classLoader8)) {
                    throw e13;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
            }
        }
        f17134a = aVar;
    }
}
