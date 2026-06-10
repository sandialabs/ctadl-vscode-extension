package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f6643a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final NoOpControllerHelper f6644b = new NoOpControllerHelper();

    public static Constructor<?> a(Class<?> cls) {
        Constructor<?> a10;
        LinkedHashMap linkedHashMap = f6643a;
        Constructor<?> constructor = (Constructor) linkedHashMap.get(cls);
        if (constructor == null && !linkedHashMap.containsKey(cls)) {
            String name = cls.getName();
            if (!name.startsWith("android.") && !name.startsWith("java.")) {
                try {
                    a10 = Class.forName(name.concat("_EpoxyHelper")).getConstructor(cls);
                } catch (ClassNotFoundException unused) {
                    a10 = a(cls.getSuperclass());
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(name), e10);
                }
                linkedHashMap.put(cls, a10);
                return a10;
            }
            return null;
        }
        return constructor;
    }
}
