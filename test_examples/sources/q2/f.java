package q2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p2.d;

/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f16880a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f16881b = null;
    public static Method c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f16882d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f16883e = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f16883e) {
            return;
        }
        f16883e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException e10) {
            e = e10;
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f16881b = constructor;
            f16880a = cls;
            c = method2;
            f16882d = method;
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            f16881b = constructor;
            f16880a = cls;
            c = method2;
            f16882d = method;
        }
        f16881b = constructor;
        f16880a = cls;
        c = method2;
        f16882d = method;
    }

    @Override // q2.l
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        d.C0208d[] c0208dArr;
        h();
        try {
            Object newInstance = f16881b.newInstance(new Object[0]);
            for (d.C0208d c0208d : cVar.f16715a) {
                File d5 = m.d(context);
                if (d5 == null) {
                    return null;
                }
                try {
                    if (!m.b(d5, resources, c0208d.f16720f)) {
                        return null;
                    }
                    if (!g(newInstance, d5.getPath(), c0208d.f16717b, c0208d.c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d5.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f16880a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f16882d.invoke(null, newInstance2);
            } catch (IllegalAccessException e10) {
                e = e10;
                throw new RuntimeException(e);
            } catch (InvocationTargetException e11) {
                e = e11;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new RuntimeException(e);
        } catch (InstantiationException e13) {
            e = e13;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new RuntimeException(e);
        }
    }

    @Override // q2.l
    public Typeface b(Context context, w2.l[] lVarArr, int i10) {
        File file;
        String readlink;
        if (lVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i10, lVarArr).f18286a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c10 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c10;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c102 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c102;
        } catch (IOException unused2) {
            return null;
        }
    }
}
