package q2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p2.d;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f16887f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f16888g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f16889h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f16890i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f16891j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f16892k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f16893l;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m(cls);
            method3 = n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = o(cls);
        } catch (ClassNotFoundException e10) {
            e = e10;
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            this.f16887f = cls;
            this.f16888g = constructor;
            this.f16889h = method2;
            this.f16890i = method3;
            this.f16891j = method4;
            this.f16892k = method;
            this.f16893l = method5;
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            this.f16887f = cls;
            this.f16888g = constructor;
            this.f16889h = method2;
            this.f16890i = method3;
            this.f16891j = method4;
            this.f16892k = method;
            this.f16893l = method5;
        }
        this.f16887f = cls;
        this.f16888g = constructor;
        this.f16889h = method2;
        this.f16890i = method3;
        this.f16891j = method4;
        this.f16892k = method;
        this.f16893l = method5;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // q2.f, q2.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        d.C0208d[] c0208dArr;
        FontVariationAxis[] fromFontVariationSettings;
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f16888g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0208d c0208d : cVar.f16715a) {
            String str = c0208d.f16716a;
            int i11 = c0208d.f16719e;
            int i12 = c0208d.f16717b;
            boolean z10 = c0208d.c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0208d.f16718d);
            if (!i(context, obj, str, i11, i12, z10 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f16892k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    @Override // q2.f, q2.l
    public final Typeface b(Context context, w2.l[] lVarArr, int i10) {
        Object obj;
        Typeface j2;
        boolean z10;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            w2.l f10 = f(i10, lVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f18286a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.c).setItalic(f10.f18288d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (w2.l lVar : lVarArr) {
            if (lVar.f18289e == 0) {
                Uri uri = lVar.f18286a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, m.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f16888g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = lVarArr.length;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            Method method = this.f16892k;
            if (i11 < length) {
                w2.l lVar2 = lVarArr[i11];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f18286a);
                if (byteBuffer != null) {
                    try {
                        z10 = ((Boolean) this.f16890i.invoke(obj, byteBuffer, Integer.valueOf(lVar2.f18287b), null, Integer.valueOf(lVar2.c), Integer.valueOf(lVar2.f18288d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z11 = true;
                }
                i11++;
            } else if (!z11) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!k(obj) || (j2 = j(obj)) == null) {
                return null;
            } else {
                return Typeface.create(j2, i10);
            }
        }
    }

    @Override // q2.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f16888g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f16892k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f16889h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f16887f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f16893l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f16891j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f16889h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
