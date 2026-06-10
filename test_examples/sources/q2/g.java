package q2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p2.d;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f16884a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<?> f16885b;
    public static final Method c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f16886d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException e10) {
            e = e10;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f16885b = constructor;
            f16884a = cls;
            c = method2;
            f16886d = method;
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f16885b = constructor;
            f16884a = cls;
            c = method2;
            f16886d = method;
        }
        f16885b = constructor;
        f16884a = cls;
        c = method2;
        f16886d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // q2.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        d.C0208d[] c0208dArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f16885b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0208d c0208d : cVar.f16715a) {
            int i11 = c0208d.f16720f;
            File d5 = m.d(context);
            if (d5 != null) {
                try {
                    if (m.b(d5, resources, i11)) {
                        try {
                            fileInputStream = new FileInputStream(d5);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0208d.f16719e, c0208d.f16717b, c0208d.c)) {
                                return null;
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    }
                } finally {
                    d5.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f16884a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f16886d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // q2.l
    public final Typeface b(Context context, w2.l[] lVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f16885b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        p.h hVar = new p.h();
        for (w2.l lVar : lVarArr) {
            Uri uri = lVar.f18286a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, lVar.f18287b, lVar.c, lVar.f18288d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f16884a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f16886d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
