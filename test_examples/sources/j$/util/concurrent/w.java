package j$.util.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f12175a;

    static {
        Field b5 = b();
        b5.setAccessible(true);
        try {
            f12175a = (Unsafe) b5.get(null);
        } catch (IllegalAccessException e10) {
            throw new Error("Couldn't get the Unsafe", e10);
        }
    }

    public static final int a(Unsafe unsafe, Object obj, long j2) {
        int intVolatile;
        do {
            intVolatile = unsafe.getIntVolatile(obj, j2);
        } while (!unsafe.compareAndSwapInt(obj, j2, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    private static Field b() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new Error("Couldn't find the Unsafe", e10);
        }
    }

    public static Unsafe c() {
        return f12175a;
    }
}
