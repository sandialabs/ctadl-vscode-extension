package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f11618f;

    /* renamed from: a  reason: collision with root package name */
    public int f11619a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f11620b;
    public LayoutInflater c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f11621d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f11622e;

    /* loaded from: classes.dex */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f11619a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f11622e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f11621d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f11621d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z10;
        if (this.f11620b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11620b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11620b.setTo(theme);
            }
        }
        this.f11620b.applyStyle(this.f11619a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources;
        if (this.f11622e == null) {
            Configuration configuration = this.f11621d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f11618f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f11618f = configuration2;
                    }
                    if (configuration.equals(f11618f)) {
                    }
                }
                resources = a.a(this, this.f11621d).getResources();
                this.f11622e = resources;
            }
            resources = super.getResources();
            this.f11622e = resources;
        }
        return this.f11622e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f11620b;
        if (theme != null) {
            return theme;
        }
        if (this.f11619a == 0) {
            this.f11619a = 2132083263;
        }
        b();
        return this.f11620b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f11619a != i10) {
            this.f11619a = i10;
            b();
        }
    }
}
