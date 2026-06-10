package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f4868a = Logger.getLogger(f1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f4869b;
    public static final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f4870d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f4871e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f4872f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f4873g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f4874h;

    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final boolean c(long j2, Object obj) {
            if (f1.f4874h) {
                if (f1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            } else if (f1.i(j2, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final byte d(long j2, Object obj) {
            if (f1.f4874h) {
                return f1.h(j2, obj);
            }
            return f1.i(j2, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final double e(long j2, Object obj) {
            return Double.longBitsToDouble(h(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final float f(long j2, Object obj) {
            return Float.intBitsToFloat(g(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void k(Object obj, long j2, boolean z10) {
            if (f1.f4874h) {
                f1.q(obj, j2, z10 ? (byte) 1 : (byte) 0);
            } else {
                f1.r(obj, j2, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void l(Object obj, long j2, byte b5) {
            if (f1.f4874h) {
                f1.q(obj, j2, b5);
            } else {
                f1.r(obj, j2, b5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void m(Object obj, long j2, double d5) {
            p(obj, j2, Double.doubleToLongBits(d5));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void n(Object obj, long j2, float f10) {
            o(Float.floatToIntBits(f10), j2, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final boolean c(long j2, Object obj) {
            if (f1.f4874h) {
                if (f1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            } else if (f1.i(j2, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final byte d(long j2, Object obj) {
            if (f1.f4874h) {
                return f1.h(j2, obj);
            }
            return f1.i(j2, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final double e(long j2, Object obj) {
            return Double.longBitsToDouble(h(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final float f(long j2, Object obj) {
            return Float.intBitsToFloat(g(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void k(Object obj, long j2, boolean z10) {
            if (f1.f4874h) {
                f1.q(obj, j2, z10 ? (byte) 1 : (byte) 0);
            } else {
                f1.r(obj, j2, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void l(Object obj, long j2, byte b5) {
            if (f1.f4874h) {
                f1.q(obj, j2, b5);
            } else {
                f1.r(obj, j2, b5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void m(Object obj, long j2, double d5) {
            p(obj, j2, Double.doubleToLongBits(d5));
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void n(Object obj, long j2, float f10) {
            o(Float.floatToIntBits(f10), j2, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final boolean c(long j2, Object obj) {
            return this.f4875a.getBoolean(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final byte d(long j2, Object obj) {
            return this.f4875a.getByte(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final double e(long j2, Object obj) {
            return this.f4875a.getDouble(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final float f(long j2, Object obj) {
            return this.f4875a.getFloat(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void k(Object obj, long j2, boolean z10) {
            this.f4875a.putBoolean(obj, j2, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void l(Object obj, long j2, byte b5) {
            this.f4875a.putByte(obj, j2, b5);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void m(Object obj, long j2, double d5) {
            this.f4875a.putDouble(obj, j2, d5);
        }

        @Override // androidx.datastore.preferences.protobuf.f1.e
        public final void n(Object obj, long j2, float f10) {
            this.f4875a.putFloat(obj, j2, f10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Unsafe f4875a;

        public e(Unsafe unsafe) {
            this.f4875a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f4875a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f4875a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j2, Object obj);

        public abstract byte d(long j2, Object obj);

        public abstract double e(long j2, Object obj);

        public abstract float f(long j2, Object obj);

        public final int g(long j2, Object obj) {
            return this.f4875a.getInt(obj, j2);
        }

        public final long h(long j2, Object obj) {
            return this.f4875a.getLong(obj, j2);
        }

        public final Object i(long j2, Object obj) {
            return this.f4875a.getObject(obj, j2);
        }

        public final long j(Field field) {
            return this.f4875a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j2, boolean z10);

        public abstract void l(Object obj, long j2, byte b5);

        public abstract void m(Object obj, long j2, double d5);

        public abstract void n(Object obj, long j2, float f10);

        public final void o(int i10, long j2, Object obj) {
            this.f4875a.putInt(obj, j2, i10);
        }

        public final void p(Object obj, long j2, long j10) {
            this.f4875a.putLong(obj, j2, j10);
        }

        public final void q(long j2, Object obj, Object obj2) {
            this.f4875a.putObject(obj, j2, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        e dVar;
        Class<?> cls;
        boolean z10;
        Unsafe unsafe;
        boolean z11;
        boolean z12;
        Field d5;
        e eVar;
        Unsafe o10 = o();
        f4869b = o10;
        c = androidx.datastore.preferences.protobuf.d.f4856a;
        Class<?> cls2 = Long.TYPE;
        boolean e10 = e(cls2);
        Class<?> cls3 = Integer.TYPE;
        boolean e11 = e(cls3);
        if (o10 != null) {
            if (androidx.datastore.preferences.protobuf.d.a()) {
                if (e10) {
                    dVar = new c(o10);
                } else if (e11) {
                    dVar = new b(o10);
                }
            } else {
                dVar = new d(o10);
            }
            f4870d = dVar;
            if (o10 == null) {
                try {
                    cls = o10.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    cls.getMethod("getLong", Object.class, cls2);
                } catch (Throwable th) {
                    f4868a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }
                if (d() != null) {
                    if (!androidx.datastore.preferences.protobuf.d.a()) {
                        cls.getMethod("getByte", cls2);
                        cls.getMethod("putByte", cls2, Byte.TYPE);
                        cls.getMethod("getInt", cls2);
                        cls.getMethod("putInt", cls2, cls3);
                        cls.getMethod("getLong", cls2);
                        cls.getMethod("putLong", cls2, cls2);
                        cls.getMethod("copyMemory", cls2, cls2, cls2);
                        cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    }
                    z10 = true;
                    f4871e = z10;
                    unsafe = f4869b;
                    if (unsafe == null) {
                        z11 = false;
                    } else {
                        try {
                            Class<?> cls4 = unsafe.getClass();
                            Class<?>[] clsArr = new Class[1];
                            z11 = false;
                            try {
                                clsArr[0] = Field.class;
                                cls4.getMethod("objectFieldOffset", clsArr);
                                cls4.getMethod("arrayBaseOffset", Class.class);
                                cls4.getMethod("arrayIndexScale", Class.class);
                                Class<?> cls5 = Long.TYPE;
                                cls4.getMethod("getInt", Object.class, cls5);
                                Class<?>[] clsArr2 = new Class[3];
                                clsArr2[0] = Object.class;
                                clsArr2[1] = cls5;
                                clsArr2[2] = Integer.TYPE;
                                cls4.getMethod("putInt", clsArr2);
                                cls4.getMethod("getLong", Object.class, cls5);
                                cls4.getMethod("putLong", Object.class, cls5, cls5);
                                cls4.getMethod("getObject", Object.class, cls5);
                                cls4.getMethod("putObject", Object.class, cls5, Object.class);
                                if (androidx.datastore.preferences.protobuf.d.a()) {
                                    z11 = false;
                                } else {
                                    cls4.getMethod("getByte", Object.class, cls5);
                                    cls4.getMethod("putByte", Object.class, cls5, Byte.TYPE);
                                    Class<?>[] clsArr3 = new Class[2];
                                    clsArr3[0] = Object.class;
                                    clsArr3[1] = cls5;
                                    cls4.getMethod("getBoolean", clsArr3);
                                    Class<?>[] clsArr4 = new Class[3];
                                    clsArr4[0] = Object.class;
                                    clsArr4[1] = cls5;
                                    clsArr4[2] = Boolean.TYPE;
                                    cls4.getMethod("putBoolean", clsArr4);
                                    Class<?>[] clsArr5 = new Class[2];
                                    clsArr5[0] = Object.class;
                                    clsArr5[1] = cls5;
                                    cls4.getMethod("getFloat", clsArr5);
                                    Class<?>[] clsArr6 = new Class[3];
                                    clsArr6[0] = Object.class;
                                    clsArr6[1] = cls5;
                                    clsArr6[2] = Float.TYPE;
                                    cls4.getMethod("putFloat", clsArr6);
                                    Class<?>[] clsArr7 = new Class[2];
                                    z11 = false;
                                    clsArr7[0] = Object.class;
                                    try {
                                        clsArr7[1] = cls5;
                                        cls4.getMethod("getDouble", clsArr7);
                                        Class<?>[] clsArr8 = new Class[3];
                                        z11 = false;
                                        try {
                                            clsArr8[0] = Object.class;
                                            clsArr8[1] = cls5;
                                            clsArr8[2] = Double.TYPE;
                                            cls4.getMethod("putDouble", clsArr8);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            f4868a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                            z12 = false;
                                            f4872f = z12;
                                            f4873g = b(byte[].class);
                                            b(boolean[].class);
                                            c(boolean[].class);
                                            b(int[].class);
                                            c(int[].class);
                                            b(long[].class);
                                            c(long[].class);
                                            b(float[].class);
                                            c(float[].class);
                                            b(double[].class);
                                            c(double[].class);
                                            b(Object[].class);
                                            c(Object[].class);
                                            d5 = d();
                                            if (d5 != null) {
                                            }
                                            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                            }
                                            f4874h = z11;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z11 = false;
                                    }
                                }
                                z12 = true;
                            } catch (Throwable th4) {
                                th = th4;
                                f4868a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                z12 = false;
                                f4872f = z12;
                                f4873g = b(byte[].class);
                                b(boolean[].class);
                                c(boolean[].class);
                                b(int[].class);
                                c(int[].class);
                                b(long[].class);
                                c(long[].class);
                                b(float[].class);
                                c(float[].class);
                                b(double[].class);
                                c(double[].class);
                                b(Object[].class);
                                c(Object[].class);
                                d5 = d();
                                if (d5 != null) {
                                }
                                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                }
                                f4874h = z11;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z11 = false;
                        }
                        f4872f = z12;
                        f4873g = b(byte[].class);
                        b(boolean[].class);
                        c(boolean[].class);
                        b(int[].class);
                        c(int[].class);
                        b(long[].class);
                        c(long[].class);
                        b(float[].class);
                        c(float[].class);
                        b(double[].class);
                        c(double[].class);
                        b(Object[].class);
                        c(Object[].class);
                        d5 = d();
                        if (d5 != null && (eVar = f4870d) != null) {
                            eVar.j(d5);
                        }
                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                            z11 = true;
                        }
                        f4874h = z11;
                    }
                    z12 = false;
                    f4872f = z12;
                    f4873g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d5 = d();
                    if (d5 != null) {
                        eVar.j(d5);
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    }
                    f4874h = z11;
                }
            }
            z10 = false;
            f4871e = z10;
            unsafe = f4869b;
            if (unsafe == null) {
            }
            z12 = false;
            f4872f = z12;
            f4873g = b(byte[].class);
            b(boolean[].class);
            c(boolean[].class);
            b(int[].class);
            c(int[].class);
            b(long[].class);
            c(long[].class);
            b(float[].class);
            c(float[].class);
            b(double[].class);
            c(double[].class);
            b(Object[].class);
            c(Object[].class);
            d5 = d();
            if (d5 != null) {
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            }
            f4874h = z11;
        }
        dVar = null;
        f4870d = dVar;
        if (o10 == null) {
        }
        z10 = false;
        f4871e = z10;
        unsafe = f4869b;
        if (unsafe == null) {
        }
        z12 = false;
        f4872f = z12;
        f4873g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d5 = d();
        if (d5 != null) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        f4874h = z11;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f4869b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class<?> cls) {
        if (f4872f) {
            return f4870d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f4872f) {
            f4870d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (androidx.datastore.preferences.protobuf.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class<?> cls) {
        if (androidx.datastore.preferences.protobuf.d.a()) {
            try {
                Class<?> cls2 = c;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean f(long j2, Object obj) {
        return f4870d.c(j2, obj);
    }

    public static byte g(byte[] bArr, long j2) {
        return f4870d.d(f4873g + j2, bArr);
    }

    public static byte h(long j2, Object obj) {
        return (byte) ((l((-4) & j2, obj) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte i(long j2, Object obj) {
        return (byte) ((l((-4) & j2, obj) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static double j(long j2, Object obj) {
        return f4870d.e(j2, obj);
    }

    public static float k(long j2, Object obj) {
        return f4870d.f(j2, obj);
    }

    public static int l(long j2, Object obj) {
        return f4870d.g(j2, obj);
    }

    public static long m(long j2, Object obj) {
        return f4870d.h(j2, obj);
    }

    public static Object n(long j2, Object obj) {
        return f4870d.i(j2, obj);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(byte[] bArr, long j2, byte b5) {
        f4870d.l(bArr, f4873g + j2, b5);
    }

    public static void q(Object obj, long j2, byte b5) {
        long j10 = (-4) & j2;
        int l2 = l(j10, obj);
        int i10 = ((~((int) j2)) & 3) << 3;
        s(((255 & b5) << i10) | (l2 & (~(255 << i10))), j10, obj);
    }

    public static void r(Object obj, long j2, byte b5) {
        long j10 = (-4) & j2;
        int i10 = (((int) j2) & 3) << 3;
        s(((255 & b5) << i10) | (l(j10, obj) & (~(255 << i10))), j10, obj);
    }

    public static void s(int i10, long j2, Object obj) {
        f4870d.o(i10, j2, obj);
    }

    public static void t(Object obj, long j2, long j10) {
        f4870d.p(obj, j2, j10);
    }

    public static void u(long j2, Object obj, Object obj2) {
        f4870d.q(j2, obj, obj2);
    }
}
