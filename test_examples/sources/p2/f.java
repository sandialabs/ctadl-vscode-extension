package p2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p2.d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16726a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f16727b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            int color;
            color = resources.getColor(i10, theme);
            return color;
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            ColorStateList colorStateList;
            colorStateList = resources.getColorStateList(i10, theme);
            return colorStateList;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f16728a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f16729b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f16728a = colorStateList;
            this.f16729b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f16730a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f16731b;

        public d(Resources resources, Resources.Theme theme) {
            this.f16730a = resources;
            this.f16731b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f16730a.equals(dVar.f16730a) && z2.b.a(this.f16731b, dVar.f16731b)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return z2.b.b(this.f16730a, this.f16731b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new h(i10, 0, this));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(this, 0, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f16727b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f16730a.getConfiguration(), theme));
        }
    }

    public static Typeface b(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r19 != null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface c(Context context, int i10, TypedValue typedValue, int i11, e eVar, boolean z10, boolean z11) {
        Typeface a10;
        String str;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                int i12 = typedValue.assetCookie;
                p.f<String, Typeface> fVar = q2.e.f16878b;
                a10 = fVar.a(q2.e.b(resources, i10, charSequence2, i12, i11));
                if (a10 != null) {
                    if (eVar != null) {
                        eVar.b(a10);
                    }
                } else {
                    if (!z11) {
                        try {
                            if (charSequence2.toLowerCase().endsWith(".xml")) {
                                d.b a11 = p2.d.a(resources.getXml(i10), resources);
                                if (a11 == null) {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    if (eVar != null) {
                                        eVar.a(-3);
                                    }
                                } else {
                                    a10 = q2.e.a(context, a11, resources, i10, charSequence2, typedValue.assetCookie, i11, eVar, z10);
                                }
                            } else {
                                int i13 = typedValue.assetCookie;
                                a10 = q2.e.f16877a.d(context, resources, i10, charSequence2, i11);
                                if (a10 != null) {
                                    fVar.b(q2.e.b(resources, i10, charSequence2, i13, i11), a10);
                                }
                                if (eVar != null) {
                                    if (a10 != null) {
                                        eVar.b(a10);
                                    } else {
                                        eVar.a(-3);
                                    }
                                }
                            }
                        } catch (IOException e10) {
                            e = e10;
                            str = "Failed to read xml resource ";
                            Log.e("ResourcesCompat", str.concat(charSequence2), e);
                            if (eVar != null) {
                                eVar.a(-3);
                            }
                            a10 = null;
                            if (a10 == null) {
                                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
                            }
                            return a10;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            str = "Failed to parse xml resource ";
                            Log.e("ResourcesCompat", str.concat(charSequence2), e);
                            if (eVar != null) {
                            }
                            a10 = null;
                            if (a10 == null) {
                            }
                            return a10;
                        }
                    }
                    a10 = null;
                }
            }
            if (a10 == null && eVar == null && !z11) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
            }
            return a10;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
    }
}
