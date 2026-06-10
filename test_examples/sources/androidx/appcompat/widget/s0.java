package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.k;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n2.a;
import org.xmlpull.v1.XmlPullParserException;
import r2.a;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: i  reason: collision with root package name */
    public static s0 f1099i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, p.i<ColorStateList>> f1101a;

    /* renamed from: b  reason: collision with root package name */
    public p.h<String, e> f1102b;
    public p.i<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, p.e<WeakReference<Drawable.ConstantState>>> f1103d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1104e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1105f;

    /* renamed from: g  reason: collision with root package name */
    public f f1106g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1098h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1100j = new c();

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.s0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.s0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                i4.d dVar = new i4.d(context);
                dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return dVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends p.f<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.s0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    g.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.s0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                i4.i iVar = new i4.i();
                iVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return iVar;
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized s0 d() {
        s0 s0Var;
        synchronized (s0.class) {
            if (f1099i == null) {
                s0 s0Var2 = new s0();
                f1099i = s0Var2;
                j(s0Var2);
            }
            s0Var = f1099i;
        }
        return s0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter a10;
        synchronized (s0.class) {
            c cVar = f1100j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            a10 = cVar.a(Integer.valueOf(mode.hashCode() + i11));
            if (a10 == null) {
                a10 = new PorterDuffColorFilter(i10, mode);
                cVar.b(Integer.valueOf(mode.hashCode() + i11), a10);
            }
        }
        return a10;
    }

    public static void j(s0 s0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            s0Var.a("vector", new g());
            s0Var.a("animated-vector", new b());
            s0Var.a("animated-selector", new a());
            s0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1102b == null) {
            this.f1102b = new p.h<>();
        }
        this.f1102b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            p.e<WeakReference<Drawable.ConstantState>> eVar = this.f1103d.get(context);
            if (eVar == null) {
                eVar = new p.e<>();
                this.f1103d.put(context, eVar);
            }
            eVar.J(j2, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable c(Context context, int i10) {
        int i11;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        LayerDrawable layerDrawable;
        if (this.f1104e == null) {
            this.f1104e = new TypedValue();
        }
        TypedValue typedValue = this.f1104e;
        context.getResources().getValue(i10, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j2);
        if (e10 != null) {
            return e10;
        }
        if (this.f1106g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                Drawable f10 = f(context, R.drawable.abc_star_black_48dp);
                Drawable f11 = f(context, R.drawable.abc_star_half_black_48dp);
                if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable = (BitmapDrawable) f10;
                    bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f10.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(createBitmap);
                    bitmapDrawable2 = new BitmapDrawable(createBitmap);
                }
                bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable3 = (BitmapDrawable) f11;
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    f11.draw(canvas2);
                    bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                }
                layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                layerDrawable.setId(0, 16908288);
                layerDrawable.setId(1, 16908303);
                layerDrawable.setId(2, 16908301);
            }
            if (layerDrawable != null) {
                layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                b(context, j2, layerDrawable);
            }
            return layerDrawable;
        }
        layerDrawable = null;
        if (layerDrawable != null) {
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        p.e<WeakReference<Drawable.ConstantState>> eVar = this.f1103d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.h(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.K(j2);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
        r2.a.b.i(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0119, B:71:0x0115, B:75:0x011f, B:79:0x0136, B:86:0x016c, B:90:0x0196, B:97:0x01a3, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a8, B:101:0x01b1), top: B:105:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable g(Context context, int i10, boolean z10) {
        boolean z11;
        Drawable drawable;
        int next;
        try {
            boolean z12 = false;
            if (!this.f1105f) {
                this.f1105f = true;
                Drawable f10 = f(context, R.drawable.abc_vector_test);
                if (f10 != null) {
                    if (!(f10 instanceof i4.i) && !"android.graphics.drawable.VectorDrawable".equals(f10.getClass().getName())) {
                        z11 = false;
                    }
                    z11 = true;
                }
                this.f1105f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            p.h<String, e> hVar = this.f1102b;
            Drawable drawable2 = null;
            r3 = null;
            PorterDuff.Mode mode = null;
            if (hVar != null && !hVar.isEmpty()) {
                p.i<String> iVar = this.c;
                if (iVar != null) {
                    String str = (String) iVar.e(i10, null);
                    if (!"appcompat_skip_skip".equals(str)) {
                        if (str != null && this.f1102b.getOrDefault(str, null) == null) {
                        }
                    }
                } else {
                    this.c = new p.i<>();
                }
                if (this.f1104e == null) {
                    this.f1104e = new TypedValue();
                }
                TypedValue typedValue = this.f1104e;
                Resources resources = context.getResources();
                resources.getValue(i10, typedValue, true);
                long j2 = (typedValue.assetCookie << 32) | typedValue.data;
                drawable = e(context, j2);
                if (drawable == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i10);
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            while (true) {
                                next = xml.next();
                                if (next == 2 || next == 1) {
                                    break;
                                }
                            }
                            if (next == 2) {
                                String name = xml.getName();
                                this.c.a(i10, name);
                                e orDefault = this.f1102b.getOrDefault(name, null);
                                if (orDefault != null) {
                                    drawable = orDefault.a(context, xml, asAttributeSet, context.getTheme());
                                }
                                if (drawable != null) {
                                    drawable.setChangingConfigurations(typedValue.changingConfigurations);
                                    b(context, j2, drawable);
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        } catch (Exception e10) {
                            Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
                        }
                    }
                    if (drawable == null) {
                        this.c.a(i10, "appcompat_skip_skip");
                    }
                }
                if (drawable == null) {
                    drawable = c(context, i10);
                }
                if (drawable == null) {
                    Object obj = n2.a.f16069a;
                    drawable = a.b.b(context, i10);
                }
                if (drawable != null) {
                    ColorStateList i11 = i(context, i10);
                    if (i11 != null) {
                        int[] iArr = j0.f971a;
                        Drawable g10 = r2.a.g(drawable.mutate());
                        a.b.h(g10, i11);
                        if (this.f1106g != null && i10 == R.drawable.abc_switch_thumb_material) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        }
                        drawable2 = g10;
                    } else {
                        if (this.f1106g != null) {
                            if (i10 == R.drawable.abc_seekbar_track_material) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                                int c10 = y0.c(context, R.attr.colorControlNormal);
                                PorterDuff.Mode mode2 = k.f980b;
                                k.a.d(findDrawableByLayerId, c10, mode2);
                                k.a.d(layerDrawable.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlNormal), mode2);
                                k.a.d(layerDrawable.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode2);
                            } else {
                                if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                                    int b5 = y0.b(context, R.attr.colorControlNormal);
                                    PorterDuff.Mode mode3 = k.f980b;
                                    k.a.d(findDrawableByLayerId2, b5, mode3);
                                    k.a.d(layerDrawable2.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlActivated), mode3);
                                    k.a.d(layerDrawable2.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode3);
                                }
                                if (z12) {
                                    drawable2 = drawable;
                                }
                            }
                            z12 = true;
                            if (z12) {
                            }
                        }
                        if (!m(context, i10, drawable) && z10) {
                        }
                        drawable2 = drawable;
                    }
                    drawable = drawable2;
                }
                if (drawable != null) {
                    j0.a(drawable);
                }
            }
            drawable = null;
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            if (drawable != null) {
            }
            if (drawable != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawable;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        p.i<ColorStateList> iVar;
        try {
            WeakHashMap<Context, p.i<ColorStateList>> weakHashMap = this.f1101a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (iVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) iVar.e(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                f fVar = this.f1106g;
                if (fVar != null) {
                    colorStateList2 = ((k.a) fVar).c(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f1101a == null) {
                        this.f1101a = new WeakHashMap<>();
                    }
                    p.i<ColorStateList> iVar2 = this.f1101a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new p.i<>();
                        this.f1101a.put(context, iVar2);
                    }
                    iVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        p.e<WeakReference<Drawable.ConstantState>> eVar = this.f1103d.get(context);
        if (eVar != null) {
            eVar.d();
        }
    }

    public final synchronized void l(k.a aVar) {
        this.f1106g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Context context, int i10, Drawable drawable) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        f fVar = this.f1106g;
        if (fVar == null) {
            return false;
        }
        k.a aVar = (k.a) fVar;
        PorterDuff.Mode mode = k.f980b;
        if (k.a.a(aVar.f982a, i10)) {
            i13 = R.attr.colorControlNormal;
        } else if (k.a.a(aVar.c, i10)) {
            i13 = R.attr.colorControlActivated;
        } else {
            if (k.a.a(aVar.f984d, i10)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                i11 = Math.round(40.8f);
                i12 = 16842800;
                z10 = true;
                if (z10) {
                    int[] iArr = j0.f971a;
                    Drawable mutate = drawable.mutate();
                    mutate.setColorFilter(k.c(y0.c(context, i12), mode));
                    if (i11 != -1) {
                        mutate.setAlpha(i11);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
                return true;
            } else if (i10 != R.drawable.abc_dialog_material_background) {
                i11 = -1;
                i12 = 0;
                z10 = false;
                if (z10) {
                }
                if (!z11) {
                }
            }
            i13 = 16842801;
        }
        i12 = i13;
        i11 = -1;
        z10 = true;
        if (z10) {
        }
        if (!z11) {
        }
    }
}
