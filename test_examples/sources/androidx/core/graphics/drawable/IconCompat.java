package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f4615k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4616a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4617b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f4618d;

    /* renamed from: e  reason: collision with root package name */
    public int f4619e;

    /* renamed from: f  reason: collision with root package name */
    public int f4620f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4621g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4622h;

    /* renamed from: i  reason: collision with root package name */
    public String f4623i;

    /* renamed from: j  reason: collision with root package name */
    public String f4624j;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb = new StringBuilder("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            Drawable loadDrawable;
            loadDrawable = icon.loadDrawable(context);
            return loadDrawable;
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            Bitmap bitmap;
            switch (iconCompat.f4616a) {
                case -1:
                    return (Icon) iconCompat.f4617b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f4617b);
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    createWithBitmap = Icon.createWithResource(iconCompat.d(), iconCompat.f4619e);
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f4617b, iconCompat.f4619e, iconCompat.f4620f);
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f4617b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f4617b, false));
                        break;
                    } else {
                        bitmap = (Bitmap) iconCompat.f4617b;
                        createWithBitmap = b.b(bitmap);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = d.a(iconCompat.e());
                        break;
                    } else if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                    } else {
                        InputStream f10 = iconCompat.f(context);
                        if (f10 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                        }
                        bitmap = BitmapFactory.decodeStream(f10);
                        if (i10 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(bitmap, false));
                            break;
                        } else {
                            createWithBitmap = b.b(bitmap);
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f4621g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4622h;
            if (mode != IconCompat.f4615k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        public static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        public static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        public static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f4616a = -1;
        this.c = null;
        this.f4618d = null;
        this.f4619e = 0;
        this.f4620f = 0;
        this.f4621g = null;
        this.f4622h = f4615k;
        this.f4623i = null;
    }

    public IconCompat(int i10) {
        this.c = null;
        this.f4618d = null;
        this.f4619e = 0;
        this.f4620f = 0;
        this.f4621g = null;
        this.f4622h = f4615k;
        this.f4623i = null;
        this.f4616a = i10;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4619e = i10;
            if (resources != null) {
                try {
                    iconCompat.f4617b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f4617b = str;
            }
            iconCompat.f4624j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f4616a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                return this.f4619e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return a.a(this.f4617b);
    }

    public final String d() {
        int i10 = this.f4616a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 != 2) {
                throw new IllegalStateException("called getResPackage() on " + this);
            }
            String str = this.f4624j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f4624j;
            }
            return ((String) this.f4617b).split(":", -1)[0];
        }
        return a.b(this.f4617b);
    }

    public final Uri e() {
        int i10 = this.f4616a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 != 4 && i10 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f4617b);
        }
        return a.d(this.f4617b);
    }

    public final InputStream f(Context context) {
        StringBuilder sb;
        Uri e10 = e();
        String scheme = e10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f4617b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb = new StringBuilder("Unable to load image from path: ");
                sb.append(e10);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(e10);
        } catch (Exception e12) {
            e = e12;
            sb = new StringBuilder("Unable to load image from URI: ");
            sb.append(e10);
            Log.w("IconCompat", sb.toString(), e);
            return null;
        }
    }

    public final Icon g(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        int height;
        if (this.f4616a == -1) {
            return String.valueOf(this.f4617b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4616a) {
            case 1:
                str = "BITMAP";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4616a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4617b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f4617b).getHeight();
                sb.append(height);
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f4624j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f4619e);
                if (this.f4620f != 0) {
                    sb.append(" off=");
                    height = this.f4620f;
                    sb.append(height);
                    break;
                }
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4617b);
                break;
        }
        if (this.f4621g != null) {
            sb.append(" tint=");
            sb.append(this.f4621g);
        }
        if (this.f4622h != f4615k) {
            sb.append(" mode=");
            sb.append(this.f4622h);
        }
        sb.append(")");
        return sb.toString();
    }
}
