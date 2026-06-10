package q2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import p2.d;

/* loaded from: classes.dex */
public class l {

    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public l() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(aVar.a(t11) - i11) * 2) + (aVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, w2.l[] lVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d5 = m.d(context);
        if (d5 == null) {
            return null;
        }
        try {
            if (m.c(d5, inputStream)) {
                return Typeface.createFromFile(d5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d5.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d5 = m.d(context);
        if (d5 == null) {
            return null;
        }
        try {
            if (m.b(d5, resources, i10)) {
                return Typeface.createFromFile(d5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d5.delete();
        }
    }

    public w2.l f(int i10, w2.l[] lVarArr) {
        return (w2.l) e(lVarArr, i10, new k());
    }
}
