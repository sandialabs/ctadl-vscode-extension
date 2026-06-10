package d;

import a3.f0;
import a3.j0;
import a3.l;
import a3.v0;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.n1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import com.noto.R;
import d.a0;
import d.b0;
import d.t;
import i.a;
import i.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k extends d.j implements f.a, LayoutInflater.Factory2 {

    /* renamed from: q0  reason: collision with root package name */
    public static final p.h<String, Integer> f10254q0 = new p.h<>();

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f10255r0 = {16842836};

    /* renamed from: s0  reason: collision with root package name */
    public static final boolean f10256s0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: t0  reason: collision with root package name */
    public static final boolean f10257t0 = true;
    public b A;
    public n B;
    public i.a C;
    public ActionBarContextView D;
    public PopupWindow E;
    public d.n F;
    public boolean I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public m[] U;
    public m V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Configuration f10258a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f10259b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f10260d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f10261e0;

    /* renamed from: f0  reason: collision with root package name */
    public C0103k f10262f0;

    /* renamed from: g0  reason: collision with root package name */
    public i f10263g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10264h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f10265i0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10267k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f10268l0;

    /* renamed from: m0  reason: collision with root package name */
    public Rect f10269m0;

    /* renamed from: n0  reason: collision with root package name */
    public t f10270n0;

    /* renamed from: o0  reason: collision with root package name */
    public OnBackInvokedDispatcher f10271o0;

    /* renamed from: p0  reason: collision with root package name */
    public OnBackInvokedCallback f10272p0;

    /* renamed from: r  reason: collision with root package name */
    public final Object f10273r;

    /* renamed from: s  reason: collision with root package name */
    public final Context f10274s;

    /* renamed from: t  reason: collision with root package name */
    public Window f10275t;

    /* renamed from: u  reason: collision with root package name */
    public h f10276u;

    /* renamed from: v  reason: collision with root package name */
    public final d.g f10277v;

    /* renamed from: w  reason: collision with root package name */
    public b0 f10278w;

    /* renamed from: x  reason: collision with root package name */
    public i.f f10279x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f10280y;

    /* renamed from: z  reason: collision with root package name */
    public h0 f10281z;
    public v0 G = null;
    public final boolean H = true;

    /* renamed from: j0  reason: collision with root package name */
    public final a f10266j0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            if ((kVar.f10265i0 & 1) != 0) {
                kVar.M(0);
            }
            if ((kVar.f10265i0 & 4096) != 0) {
                kVar.M(108);
            }
            kVar.f10264h0 = false;
            kVar.f10265i0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements j.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            k.this.I(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback S = k.this.S();
            if (S != null) {
                S.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0126a {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0126a f10284a;

        /* loaded from: classes.dex */
        public class a extends a1.c {
            public a() {
            }

            @Override // a3.w0
            public final void a() {
                c cVar = c.this;
                k.this.D.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.D.getParent() instanceof View) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.h.c((View) kVar.D.getParent());
                }
                kVar.D.h();
                kVar.G.d(null);
                kVar.G = null;
                ViewGroup viewGroup = kVar.J;
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.h.c(viewGroup);
            }
        }

        public c(e.a aVar) {
            this.f10284a = aVar;
        }

        @Override // i.a.InterfaceC0126a
        public final boolean a(i.a aVar, MenuItem menuItem) {
            return this.f10284a.a(aVar, menuItem);
        }

        @Override // i.a.InterfaceC0126a
        public final boolean b(i.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f10284a.b(aVar, fVar);
        }

        @Override // i.a.InterfaceC0126a
        public final void c(i.a aVar) {
            this.f10284a.c(aVar);
            k kVar = k.this;
            if (kVar.E != null) {
                kVar.f10275t.getDecorView().removeCallbacks(kVar.F);
            }
            if (kVar.D != null) {
                v0 v0Var = kVar.G;
                if (v0Var != null) {
                    v0Var.b();
                }
                v0 a10 = j0.a(kVar.D);
                a10.a(0.0f);
                kVar.G = a10;
                a10.d(new a());
            }
            d.g gVar = kVar.f10277v;
            if (gVar != null) {
                gVar.b();
            }
            kVar.C = null;
            ViewGroup viewGroup = kVar.J;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.h.c(viewGroup);
            kVar.a0();
        }

        @Override // i.a.InterfaceC0126a
        public final boolean d(i.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = k.this.J;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.h.c(viewGroup);
            return this.f10284a.d(aVar, fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static v2.h b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return v2.h.b(languageTags);
        }

        public static void c(v2.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.f18149a.a());
            LocaleList.setDefault(forLanguageTags);
        }

        public static void d(Configuration configuration, v2.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.f18149a.a());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final k kVar) {
            Objects.requireNonNull(kVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: d.p
                public final void onBackInvoked() {
                    k.this.V();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class i extends j {
        public final PowerManager c;

        public i(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // d.k.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // d.k.j
        public final int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // d.k.j
        public final void d() {
            k.this.e();
        }
    }

    /* loaded from: classes.dex */
    public abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public a f10291a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f10291a;
            if (aVar != null) {
                try {
                    k.this.f10274s.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f10291a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b5 = b();
            if (b5 != null && b5.countActions() != 0) {
                if (this.f10291a == null) {
                    this.f10291a = new a();
                }
                k.this.f10274s.registerReceiver(this.f10291a, b5);
            }
        }
    }

    /* renamed from: d.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0103k extends j {
        public final a0 c;

        public C0103k(a0 a0Var) {
            super();
            this.c = a0Var;
        }

        @Override // d.k.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
            if (r9 != null) goto L35;
         */
        @Override // d.k.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c() {
            boolean z10;
            Location location;
            boolean z11;
            long j2;
            long j10;
            Location location2;
            a0 a0Var = this.c;
            a0.a aVar = a0Var.c;
            boolean z12 = false;
            if (aVar.f10206b > System.currentTimeMillis()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = aVar.f10205a;
            } else {
                Context context = a0Var.f10203a;
                int w10 = a1.b.w(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = a0Var.f10204b;
                if (w10 == 0) {
                    try {
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (a1.b.w(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (location3 != null && location != null) {
                    if (location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (z.f10345d == null) {
                            z.f10345d = new z();
                        }
                        z zVar = z.f10345d;
                        zVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        zVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (zVar.c == 1) {
                            z12 = true;
                        }
                        long j11 = zVar.f10347b;
                        long j12 = zVar.f10346a;
                        zVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = zVar.f10347b;
                        if (j11 != -1 && j12 != -1) {
                            if (currentTimeMillis > j12) {
                                j10 = j13 + 0;
                            } else if (currentTimeMillis > j11) {
                                j10 = j12 + 0;
                            } else {
                                j10 = j11 + 0;
                            }
                            j2 = j10 + 60000;
                            aVar.f10205a = z12;
                            aVar.f10206b = j2;
                        }
                        j2 = currentTimeMillis + 43200000;
                        aVar.f10205a = z12;
                        aVar.f10206b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
            }
            if (!z11) {
                return 1;
            }
            return 2;
        }

        @Override // d.k.j
        public final void d() {
            k.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class l extends ContentFrameLayout {
        public l(i.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!k.this.L(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
        @Override // android.view.ViewGroup
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x3 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x3 >= -5 && y10 >= -5 && x3 <= getWidth() + 5 && y10 <= getHeight() + 5) {
                    z10 = false;
                    if (z10) {
                        k kVar = k.this;
                        kVar.J(kVar.R(0), true);
                        return true;
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(e.a.a(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        public final int f10296a;

        /* renamed from: b  reason: collision with root package name */
        public int f10297b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f10298d;

        /* renamed from: e  reason: collision with root package name */
        public l f10299e;

        /* renamed from: f  reason: collision with root package name */
        public View f10300f;

        /* renamed from: g  reason: collision with root package name */
        public View f10301g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f10302h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f10303i;

        /* renamed from: j  reason: collision with root package name */
        public i.c f10304j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10305k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10306l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10307m;
        public boolean n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f10308o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f10309p;

        public m(int i10) {
            this.f10296a = i10;
        }
    }

    /* loaded from: classes.dex */
    public final class n implements j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            boolean z11;
            int i10;
            m mVar;
            androidx.appcompat.view.menu.f k3 = fVar.k();
            int i11 = 0;
            if (k3 != fVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                fVar = k3;
            }
            k kVar = k.this;
            m[] mVarArr = kVar.U;
            if (mVarArr != null) {
                i10 = mVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    mVar = mVarArr[i11];
                    if (mVar != null && mVar.f10302h == fVar) {
                        break;
                    }
                    i11++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (z11) {
                    kVar.H(mVar.f10296a, mVar, k3);
                    kVar.J(mVar, true);
                    return;
                }
                kVar.J(mVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback S;
            if (fVar == fVar.k()) {
                k kVar = k.this;
                if (!kVar.O || (S = kVar.S()) == null || kVar.Z) {
                    return true;
                }
                S.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    public k(Context context, Window window, d.g gVar, Object obj) {
        p.h<String, Integer> hVar;
        Integer orDefault;
        d.f fVar;
        this.f10259b0 = -100;
        this.f10274s = context;
        this.f10277v = gVar;
        this.f10273r = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof d.f) {
                    fVar = (d.f) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            fVar = null;
            if (fVar != null) {
                this.f10259b0 = fVar.p().j();
            }
        }
        if (this.f10259b0 == -100 && (orDefault = (hVar = f10254q0).getOrDefault(this.f10273r.getClass().getName(), null)) != null) {
            this.f10259b0 = orDefault.intValue();
            hVar.remove(this.f10273r.getClass().getName());
        }
        if (window != null) {
            F(window);
        }
        androidx.appcompat.widget.k.d();
    }

    public static v2.h G(Context context) {
        v2.h hVar;
        v2.h b5;
        Locale c10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (hVar = d.j.f10248k) == null) {
            return null;
        }
        v2.h Q = Q(context.getApplicationContext().getResources().getConfiguration());
        v2.j jVar = hVar.f18149a;
        if (i10 >= 24) {
            if (jVar.isEmpty()) {
                b5 = v2.h.f18148b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i11 = 0; i11 < Q.f18149a.size() + jVar.size(); i11++) {
                    if (i11 < jVar.size()) {
                        c10 = hVar.c(i11);
                    } else {
                        c10 = Q.c(i11 - jVar.size());
                    }
                    if (c10 != null) {
                        linkedHashSet.add(c10);
                    }
                }
                b5 = v2.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (jVar.isEmpty()) {
            b5 = v2.h.f18148b;
        } else {
            b5 = v2.h.b(hVar.c(0).toString());
        }
        if (!b5.f18149a.isEmpty()) {
            return b5;
        }
        return Q;
    }

    public static Configuration K(Context context, int i10, v2.h hVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                f.d(configuration2, hVar);
            } else {
                d.b(configuration2, hVar.c(0));
                d.a(configuration2, hVar.c(0));
            }
        }
        return configuration2;
    }

    public static v2.h Q(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.b(configuration) : v2.h.b(e.a(configuration.locale));
    }

    @Override // d.j
    public final void B(int i10) {
        this.c0 = i10;
    }

    @Override // d.j
    public final void C(CharSequence charSequence) {
        this.f10280y = charSequence;
        h0 h0Var = this.f10281z;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
            return;
        }
        b0 b0Var = this.f10278w;
        if (b0Var != null) {
            b0Var.f10213e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0243, code lost:
        if (r16.Z == false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(boolean z10, boolean z11) {
        v2.h hVar;
        int i10;
        Configuration configuration;
        int i11;
        int i12;
        v2.h Q;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        Activity activity;
        boolean z15;
        Map map;
        Object obj;
        Object obj2;
        Object obj3;
        Activity activity2;
        int i14;
        if (this.Z) {
            return false;
        }
        int i15 = this.f10259b0;
        if (i15 == -100) {
            i15 = d.j.f10247j;
        }
        Context context = this.f10274s;
        int U = U(context, i15);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 < 33) {
            hVar = G(context);
        } else {
            hVar = null;
        }
        if (!z11 && hVar != null) {
            hVar = Q(context.getResources().getConfiguration());
        }
        Configuration K = K(context, U, hVar, null, false);
        boolean z16 = this.f10261e0;
        Object obj4 = this.f10273r;
        if (!z16 && (obj4 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
                configuration = this.f10258a0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i11 = configuration.uiMode & 48;
                i12 = K.uiMode & 48;
                v2.h Q2 = Q(configuration);
                if (hVar != null) {
                    Q = null;
                } else {
                    Q = Q(K);
                }
                if (i11 == i12) {
                    i13 = 512;
                } else {
                    i13 = 0;
                }
                if (Q != null && !Q2.equals(Q)) {
                    i13 = i13 | 4 | 8192;
                }
                if (((~i10) & i13) != 0 && z10 && this.X && ((f10256s0 || this.Y) && (obj4 instanceof Activity))) {
                    activity2 = (Activity) obj4;
                    if (!activity2.isChild()) {
                        int i17 = m2.b.f15908b;
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity2.recreate();
                        } else {
                            new Handler(activity2.getMainLooper()).post(new e1(2, activity2));
                        }
                        z12 = true;
                        if (z12 && i13 != 0) {
                            if ((i10 & i13) == i13) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i12;
                            if (Q != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    f.d(configuration2, Q);
                                } else {
                                    d.b(configuration2, Q.c(0));
                                    d.a(configuration2, Q.c(0));
                                }
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i18 = Build.VERSION.SDK_INT;
                            if (i18 < 26 && i18 < 28) {
                                if (i18 >= 24) {
                                    if (!y.f10344h) {
                                        try {
                                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                            y.f10343g = declaredField;
                                            declaredField.setAccessible(true);
                                        } catch (NoSuchFieldException e10) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                                        }
                                        y.f10344h = true;
                                    }
                                    Field field = y.f10343g;
                                    if (field != null) {
                                        try {
                                            obj2 = field.get(resources);
                                        } catch (IllegalAccessException e11) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                                            obj2 = null;
                                        }
                                        if (obj2 != null) {
                                            if (!y.f10339b) {
                                                try {
                                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                                    y.f10338a = declaredField2;
                                                    declaredField2.setAccessible(true);
                                                } catch (NoSuchFieldException e12) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                                }
                                                y.f10339b = true;
                                            }
                                            Field field2 = y.f10338a;
                                            if (field2 != null) {
                                                try {
                                                    obj3 = field2.get(obj2);
                                                } catch (IllegalAccessException e13) {
                                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                                }
                                                if (obj3 != null) {
                                                    y.a(obj3);
                                                }
                                            }
                                            obj3 = null;
                                            if (obj3 != null) {
                                            }
                                        }
                                    }
                                } else if (i18 >= 23) {
                                    if (!y.f10339b) {
                                        try {
                                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                            y.f10338a = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e14) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                                        }
                                        y.f10339b = true;
                                    }
                                    Field field3 = y.f10338a;
                                    if (field3 != null) {
                                        try {
                                            obj = field3.get(resources);
                                        } catch (IllegalAccessException e15) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                                        }
                                        if (obj == null) {
                                            y.a(obj);
                                        }
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                } else {
                                    if (!y.f10339b) {
                                        try {
                                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                                            y.f10338a = declaredField4;
                                            declaredField4.setAccessible(true);
                                        } catch (NoSuchFieldException e16) {
                                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e16);
                                        }
                                        y.f10339b = true;
                                    }
                                    Field field4 = y.f10338a;
                                    if (field4 != null) {
                                        try {
                                            map = (Map) field4.get(resources);
                                        } catch (IllegalAccessException e17) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e17);
                                            map = null;
                                        }
                                        if (map != null) {
                                            map.clear();
                                        }
                                    }
                                }
                            }
                            int i19 = this.c0;
                            if (i19 != 0) {
                                context.setTheme(i19);
                                if (Build.VERSION.SDK_INT >= 23) {
                                    context.getTheme().applyStyle(this.c0, true);
                                    if (z14 && (obj4 instanceof Activity)) {
                                        activity = (Activity) obj4;
                                        if (!(activity instanceof androidx.lifecycle.q)) {
                                            if (((androidx.lifecycle.q) activity).i0().f5413d.compareTo(Lifecycle.State.CREATED) >= 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z15) {
                                                activity.onConfigurationChanged(configuration2);
                                            }
                                        } else if (this.Y) {
                                        }
                                    }
                                    z13 = true;
                                }
                            }
                            if (z14) {
                                activity = (Activity) obj4;
                                if (!(activity instanceof androidx.lifecycle.q)) {
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (z13 && (obj4 instanceof d.f)) {
                            if ((i13 & 512) != 0) {
                                ((d.f) obj4).getClass();
                            }
                            if ((i13 & 4) != 0) {
                                ((d.f) obj4).getClass();
                            }
                        }
                        if (z13 && Q != null) {
                            v2.h Q3 = Q(context.getResources().getConfiguration());
                            if (Build.VERSION.SDK_INT < 24) {
                                f.c(Q3);
                            } else {
                                Locale.setDefault(Q3.c(0));
                            }
                        }
                        if (i15 == 0) {
                            P(context).e();
                        } else {
                            C0103k c0103k = this.f10262f0;
                            if (c0103k != null) {
                                c0103k.a();
                            }
                        }
                        if (i15 == 3) {
                            if (this.f10263g0 == null) {
                                this.f10263g0 = new i(context);
                            }
                            this.f10263g0.e();
                        } else {
                            i iVar = this.f10263g0;
                            if (iVar != null) {
                                iVar.a();
                            }
                        }
                        return z13;
                    }
                }
                z12 = false;
                if (z12) {
                }
                z13 = z12;
                if (z13) {
                    if ((i13 & 512) != 0) {
                    }
                    if ((i13 & 4) != 0) {
                    }
                }
                if (z13) {
                    v2.h Q32 = Q(context.getResources().getConfiguration());
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                }
                if (i15 == 0) {
                }
                if (i15 == 3) {
                }
                return z13;
            }
            if (i16 >= 29) {
                i14 = 269221888;
            } else if (i16 >= 24) {
                i14 = 786432;
            } else {
                i14 = 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i14);
                if (activityInfo != null) {
                    this.f10260d0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e18) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e18);
                this.f10260d0 = 0;
            }
        }
        this.f10261e0 = true;
        i10 = this.f10260d0;
        configuration = this.f10258a0;
        if (configuration == null) {
        }
        i11 = configuration.uiMode & 48;
        i12 = K.uiMode & 48;
        v2.h Q22 = Q(configuration);
        if (hVar != null) {
        }
        if (i11 == i12) {
        }
        if (Q != null) {
            i13 = i13 | 4 | 8192;
        }
        if (((~i10) & i13) != 0) {
            activity2 = (Activity) obj4;
            if (!activity2.isChild()) {
            }
        }
        z12 = false;
        if (z12) {
        }
        z13 = z12;
        if (z13) {
        }
        if (z13) {
        }
        if (i15 == 0) {
        }
        if (i15 == 3) {
        }
        return z13;
    }

    public final void F(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f10275t == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof h)) {
                h hVar = new h(callback);
                this.f10276u = hVar;
                window.setCallback(hVar);
                Context context = this.f10274s;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f10255r0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.k a10 = androidx.appcompat.widget.k.a();
                    synchronized (a10) {
                        drawable = a10.f981a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f10275t = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f10271o0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f10272p0) != null) {
                        g.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f10272p0 = null;
                    }
                    Object obj = this.f10273r;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = g.a(activity);
                        }
                    }
                    this.f10271o0 = onBackInvokedDispatcher2;
                    a0();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void H(int i10, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.U;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                fVar = mVar.f10302h;
            }
        }
        if ((mVar == null || mVar.f10307m) && !this.Z) {
            h hVar = this.f10276u;
            Window.Callback callback = this.f10275t.getCallback();
            hVar.getClass();
            try {
                hVar.f10288l = true;
                callback.onPanelClosed(i10, fVar);
                hVar.f10288l = false;
            } catch (Throwable th) {
                hVar.f10288l = false;
                throw th;
            }
        }
    }

    public final void I(androidx.appcompat.view.menu.f fVar) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f10281z.l();
        Window.Callback S = S();
        if (S != null && !this.Z) {
            S.onPanelClosed(108, fVar);
        }
        this.T = false;
    }

    public final void J(m mVar, boolean z10) {
        l lVar;
        h0 h0Var;
        if (z10 && mVar.f10296a == 0 && (h0Var = this.f10281z) != null && h0Var.a()) {
            I(mVar.f10302h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10274s.getSystemService("window");
        if (windowManager != null && mVar.f10307m && (lVar = mVar.f10299e) != null) {
            windowManager.removeView(lVar);
            if (z10) {
                H(mVar.f10296a, mVar, null);
            }
        }
        mVar.f10305k = false;
        mVar.f10306l = false;
        mVar.f10307m = false;
        mVar.f10300f = null;
        mVar.n = true;
        if (this.V == mVar) {
            this.V = null;
        }
        if (mVar.f10296a == 0) {
            a0();
        }
    }

    public final boolean L(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj = this.f10273r;
        boolean z13 = true;
        if (((obj instanceof l.a) || (obj instanceof r)) && (decorView = this.f10275t.getDecorView()) != null && a3.l.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.f10276u;
            Window.Callback callback = this.f10275t.getCallback();
            hVar.getClass();
            try {
                hVar.f10287k = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                hVar.f10287k = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    m R = R(0);
                    if (R.f10307m) {
                        return true;
                    }
                    Y(R, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z13 = false;
                }
                this.W = z13;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.C != null) {
                    return true;
                }
                m R2 = R(0);
                h0 h0Var = this.f10281z;
                Context context = this.f10274s;
                if (h0Var != null && h0Var.h() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.f10281z.a()) {
                        if (!this.Z && Y(R2, keyEvent)) {
                            z11 = this.f10281z.e();
                        }
                        z11 = false;
                    } else {
                        z11 = this.f10281z.d();
                    }
                } else {
                    boolean z14 = R2.f10307m;
                    if (!z14 && !R2.f10306l) {
                        if (R2.f10305k) {
                            if (R2.f10308o) {
                                R2.f10305k = false;
                                z12 = Y(R2, keyEvent);
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                W(R2, keyEvent);
                                z11 = true;
                            }
                        }
                        z11 = false;
                    }
                    J(R2, true);
                    z11 = z14;
                }
                if (!z11) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (V()) {
            return true;
        }
        return false;
    }

    public final void M(int i10) {
        m R = R(i10);
        if (R.f10302h != null) {
            Bundle bundle = new Bundle();
            R.f10302h.t(bundle);
            if (bundle.size() > 0) {
                R.f10309p = bundle;
            }
            R.f10302h.w();
            R.f10302h.clear();
        }
        R.f10308o = true;
        R.n = true;
        if ((i10 == 108 || i10 == 0) && this.f10281z != null) {
            m R2 = R(0);
            R2.f10305k = false;
            Y(R2, null);
        }
    }

    public final void N() {
        int i10;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.I) {
            int[] iArr = a1.b.f52t;
            Context context2 = this.f10274s;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    w(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    w(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    w(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    w(10);
                }
                this.R = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                O();
                this.f10275t.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.S) {
                    if (this.R) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.P = false;
                        this.O = false;
                    } else if (this.O) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new i.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        h0 h0Var = (h0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f10281z = h0Var;
                        h0Var.setWindowCallback(S());
                        if (this.P) {
                            this.f10281z.k(109);
                        }
                        if (this.M) {
                            this.f10281z.k(2);
                        }
                        if (this.N) {
                            this.f10281z.k(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.Q) {
                        i10 = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i10 = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i10, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    d.l lVar = new d.l(this);
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.i.u(viewGroup, lVar);
                    if (this.f10281z == null) {
                        this.K = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = n1.f1056a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f10275t.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f10275t.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new d.m(this));
                    this.J = viewGroup;
                    Object obj = this.f10273r;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f10280y;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        h0 h0Var2 = this.f10281z;
                        if (h0Var2 != null) {
                            h0Var2.setWindowTitle(charSequence);
                        } else {
                            b0 b0Var = this.f10278w;
                            if (b0Var != null) {
                                b0Var.f10213e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.K;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J.findViewById(16908290);
                    View decorView = this.f10275t.getDecorView();
                    contentFrameLayout2.f752o.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                    if (j0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.I = true;
                    m R = R(0);
                    if (!this.Z && R.f10302h == null) {
                        this.f10265i0 |= 4096;
                        if (!this.f10264h0) {
                            j0.d.m(this.f10275t.getDecorView(), this.f10266j0);
                            this.f10264h0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.O + ", windowActionBarOverlay: " + this.P + ", android:windowIsFloating: " + this.R + ", windowActionModeOverlay: " + this.Q + ", windowNoTitle: " + this.S + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void O() {
        if (this.f10275t == null) {
            Object obj = this.f10273r;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.f10275t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j P(Context context) {
        if (this.f10262f0 == null) {
            if (a0.f10202d == null) {
                Context applicationContext = context.getApplicationContext();
                a0.f10202d = new a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f10262f0 = new C0103k(a0.f10202d);
        }
        return this.f10262f0;
    }

    public final m R(int i10) {
        m[] mVarArr = this.U;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.U = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar == null) {
            m mVar2 = new m(i10);
            mVarArr[i10] = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final Window.Callback S() {
        return this.f10275t.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        b0 b0Var;
        b0 b0Var2;
        N();
        if (this.O && this.f10278w == null) {
            Object obj = this.f10273r;
            if (!(obj instanceof Activity)) {
                if (obj instanceof Dialog) {
                    b0Var = new b0((Dialog) obj);
                }
                b0Var2 = this.f10278w;
                if (b0Var2 == null) {
                    b0Var2.e(this.f10267k0);
                    return;
                }
                return;
            }
            b0Var = new b0((Activity) obj, this.P);
            this.f10278w = b0Var;
            b0Var2 = this.f10278w;
            if (b0Var2 == null) {
            }
        }
    }

    public final int U(Context context, int i10) {
        j P;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f10263g0 == null) {
                            this.f10263g0 = new i(context);
                        }
                        P = this.f10263g0;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                P = P(context);
            }
            return P.c();
        }
        return i10;
    }

    public final boolean V() {
        boolean z10;
        boolean z11 = this.W;
        this.W = false;
        m R = R(0);
        if (R.f10307m) {
            if (!z11) {
                J(R, true);
            }
            return true;
        }
        i.a aVar = this.C;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        T();
        b0 b0Var = this.f10278w;
        if (b0Var != null) {
            i0 i0Var = b0Var.f10213e;
            if (i0Var != null && i0Var.m()) {
                b0Var.f10213e.collapseActionView();
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
        T();
        r7 = r17.f10278w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
        r7 = r7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        if (r7 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
        r7 = new android.util.TypedValue();
        r9 = r2.getResources().newTheme();
        r9.setTo(r2.getTheme());
        r9.resolveAttribute(com.noto.R.attr.actionBarPopupTheme, r7, true);
        r10 = r7.resourceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
        if (r10 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
        r9.applyStyle(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
        r9.resolveAttribute(com.noto.R.attr.panelMenuListTheme, r7, true);
        r7 = r7.resourceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (r7 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
        r7 = 2132083250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r9.applyStyle(r7, true);
        r7 = new i.c(r2, 0);
        r7.getTheme().setTo(r9);
        r18.f10304j = r7;
        r2 = r7.obtainStyledAttributes(a1.b.f52t);
        r18.f10297b = r2.getResourceId(86, 0);
        r18.f10298d = r2.getResourceId(1, 0);
        r2.recycle();
        r18.f10299e = new d.k.l(r17, r18.f10304j);
        r18.c = 81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r2 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0175, code lost:
        if (r2.n.getCount() > 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(m mVar, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z12;
        if (!mVar.f10307m && !this.Z) {
            Context context = this.f10274s;
            int i11 = mVar.f10296a;
            if (i11 == 0) {
                if ((context.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            Window.Callback S = S();
            if (S != null && !S.onMenuOpened(i11, mVar.f10302h)) {
                J(mVar, true);
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || !Y(mVar, keyEvent)) {
                return;
            }
            l lVar = mVar.f10299e;
            if (lVar != null && !mVar.n) {
                View view = mVar.f10301g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    mVar.f10306l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = mVar.c;
                    layoutParams2.windowAnimations = mVar.f10298d;
                    windowManager.addView(mVar.f10299e, layoutParams2);
                    mVar.f10307m = true;
                    if (i11 == 0) {
                        a0();
                        return;
                    }
                    return;
                }
                i10 = -2;
                mVar.f10306l = false;
                WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                layoutParams22.gravity = mVar.c;
                layoutParams22.windowAnimations = mVar.f10298d;
                windowManager.addView(mVar.f10299e, layoutParams22);
                mVar.f10307m = true;
                if (i11 == 0) {
                }
            }
            if (mVar.n && lVar.getChildCount() > 0) {
                mVar.f10299e.removeAllViews();
            }
            View view2 = mVar.f10301g;
            if (view2 != null) {
                mVar.f10300f = view2;
            } else {
                if (mVar.f10302h != null) {
                    if (this.B == null) {
                        this.B = new n();
                    }
                    n nVar = this.B;
                    if (mVar.f10303i == null) {
                        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(mVar.f10304j);
                        mVar.f10303i = dVar;
                        dVar.f604m = nVar;
                        androidx.appcompat.view.menu.f fVar = mVar.f10302h;
                        fVar.b(dVar, fVar.f613a);
                    }
                    androidx.appcompat.view.menu.d dVar2 = mVar.f10303i;
                    l lVar2 = mVar.f10299e;
                    if (dVar2.f603l == null) {
                        dVar2.f603l = (ExpandedMenuView) dVar2.f601j.inflate(R.layout.abc_expanded_menu_layout, (ViewGroup) lVar2, false);
                        if (dVar2.n == null) {
                            dVar2.n = new d.a();
                        }
                        dVar2.f603l.setAdapter((ListAdapter) dVar2.n);
                        dVar2.f603l.setOnItemClickListener(dVar2);
                    }
                    ExpandedMenuView expandedMenuView = dVar2.f603l;
                    mVar.f10300f = expandedMenuView;
                }
                z10 = false;
                if (z10) {
                    if (mVar.f10300f != null) {
                        if (mVar.f10301g == null) {
                            androidx.appcompat.view.menu.d dVar3 = mVar.f10303i;
                            if (dVar3.n == null) {
                                dVar3.n = new d.a();
                            }
                        }
                        z11 = true;
                        if (!z11) {
                            ViewGroup.LayoutParams layoutParams3 = mVar.f10300f.getLayoutParams();
                            if (layoutParams3 == null) {
                                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            mVar.f10299e.setBackgroundResource(mVar.f10297b);
                            ViewParent parent = mVar.f10300f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(mVar.f10300f);
                            }
                            mVar.f10299e.addView(mVar.f10300f, layoutParams3);
                            if (!mVar.f10300f.hasFocus()) {
                                mVar.f10300f.requestFocus();
                            }
                            i10 = -2;
                            mVar.f10306l = false;
                            WindowManager.LayoutParams layoutParams222 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams222.gravity = mVar.c;
                            layoutParams222.windowAnimations = mVar.f10298d;
                            windowManager.addView(mVar.f10299e, layoutParams222);
                            mVar.f10307m = true;
                            if (i11 == 0) {
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
                mVar.n = true;
            }
            z10 = true;
            if (z10) {
            }
            mVar.n = true;
        }
    }

    public final boolean X(m mVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f10305k || Y(mVar, keyEvent)) && (fVar = mVar.f10302h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(m mVar, KeyEvent keyEvent) {
        boolean z10;
        h0 h0Var;
        h0 h0Var2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        h0 h0Var3;
        h0 h0Var4;
        if (this.Z) {
            return false;
        }
        if (mVar.f10305k) {
            return true;
        }
        m mVar2 = this.V;
        if (mVar2 != null && mVar2 != mVar) {
            J(mVar2, false);
        }
        Window.Callback S = S();
        int i11 = mVar.f10296a;
        if (S != null) {
            mVar.f10301g = S.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z10 = false;
            if (z10 && (h0Var4 = this.f10281z) != null) {
                h0Var4.b();
            }
            if (mVar.f10301g == null) {
                androidx.appcompat.view.menu.f fVar = mVar.f10302h;
                if (fVar == null || mVar.f10308o) {
                    if (fVar == null) {
                        Context context = this.f10274s;
                        if ((i11 == 0 || i11 == 108) && this.f10281z != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                i.c cVar = new i.c(context, 0);
                                cVar.getTheme().setTo(theme);
                                context = cVar;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                        fVar2.f616e = this;
                        androidx.appcompat.view.menu.f fVar3 = mVar.f10302h;
                        if (fVar2 != fVar3) {
                            if (fVar3 != null) {
                                fVar3.r(mVar.f10303i);
                            }
                            mVar.f10302h = fVar2;
                            androidx.appcompat.view.menu.d dVar = mVar.f10303i;
                            if (dVar != null) {
                                fVar2.b(dVar, fVar2.f613a);
                            }
                        }
                        if (mVar.f10302h == null) {
                            return false;
                        }
                    }
                    if (z10 && (h0Var2 = this.f10281z) != null) {
                        if (this.A == null) {
                            this.A = new b();
                        }
                        h0Var2.g(mVar.f10302h, this.A);
                    }
                    mVar.f10302h.w();
                    if (!S.onCreatePanelMenu(i11, mVar.f10302h)) {
                        androidx.appcompat.view.menu.f fVar4 = mVar.f10302h;
                        if (fVar4 != null) {
                            if (fVar4 != null) {
                                fVar4.r(mVar.f10303i);
                            }
                            mVar.f10302h = null;
                        }
                        if (z10 && (h0Var = this.f10281z) != null) {
                            h0Var.g(null, this.A);
                        }
                        return false;
                    }
                    mVar.f10308o = false;
                }
                mVar.f10302h.w();
                Bundle bundle = mVar.f10309p;
                if (bundle != null) {
                    mVar.f10302h.s(bundle);
                    mVar.f10309p = null;
                }
                if (!S.onPreparePanel(0, mVar.f10301g, mVar.f10302h)) {
                    if (z10 && (h0Var3 = this.f10281z) != null) {
                        h0Var3.g(null, this.A);
                    }
                    mVar.f10302h.v();
                    return false;
                }
                if (keyEvent != null) {
                    i10 = keyEvent.getDeviceId();
                } else {
                    i10 = -1;
                }
                if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                mVar.f10302h.setQwertyMode(z11);
                mVar.f10302h.v();
            }
            mVar.f10305k = true;
            mVar.f10306l = false;
            this.V = mVar;
            return true;
        }
        z10 = true;
        if (z10) {
            h0Var4.b();
        }
        if (mVar.f10301g == null) {
        }
        mVar.f10305k = true;
        mVar.f10306l = false;
        this.V = mVar;
        return true;
    }

    public final void Z() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        m mVar;
        Window.Callback S = S();
        if (S != null && !this.Z) {
            androidx.appcompat.view.menu.f k3 = fVar.k();
            m[] mVarArr = this.U;
            if (mVarArr != null) {
                i10 = mVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    mVar = mVarArr[i11];
                    if (mVar != null && mVar.f10302h == k3) {
                        break;
                    }
                    i11++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return S.onMenuItemSelected(mVar.f10296a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r2.C == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f10271o0 != null) {
                if (R(0).f10307m) {
                }
                z10 = true;
            }
            if (z10 && this.f10272p0 == null) {
                this.f10272p0 = g.b(this.f10271o0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f10272p0) != null) {
                g.c(this.f10271o0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        h0 h0Var = this.f10281z;
        if (h0Var == null || !h0Var.h() || (ViewConfiguration.get(this.f10274s).hasPermanentMenuKey() && !this.f10281z.c())) {
            m R = R(0);
            R.n = true;
            J(R, false);
            W(R, null);
            return;
        }
        Window.Callback S = S();
        if (this.f10281z.a()) {
            this.f10281z.d();
            if (this.Z) {
                return;
            }
            S.onPanelClosed(108, R(0).f10302h);
        } else if (S == null || this.Z) {
        } else {
            if (this.f10264h0 && (1 & this.f10265i0) != 0) {
                View decorView = this.f10275t.getDecorView();
                a aVar = this.f10266j0;
                decorView.removeCallbacks(aVar);
                aVar.run();
            }
            m R2 = R(0);
            androidx.appcompat.view.menu.f fVar2 = R2.f10302h;
            if (fVar2 == null || R2.f10308o || !S.onPreparePanel(0, R2.f10301g, fVar2)) {
                return;
            }
            S.onMenuOpened(108, R2.f10302h);
            this.f10281z.e();
        }
    }

    @Override // d.j
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.J.findViewById(16908290)).addView(view, layoutParams);
        this.f10276u.a(this.f10275t.getCallback());
    }

    @Override // d.j
    public final void d() {
        v2.h hVar;
        final Context context = this.f10274s;
        if (d.j.o(context) && (hVar = d.j.f10248k) != null && !hVar.equals(d.j.f10249l)) {
            d.j.f10246i.execute(new Runnable() { // from class: d.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.D(context);
                }
            });
        }
        E(true, true);
    }

    @Override // d.j
    public final boolean e() {
        return E(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b5  */
    @Override // d.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Context f(Context context) {
        Configuration configuration;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.X = true;
        int i18 = this.f10259b0;
        if (i18 == -100) {
            i18 = d.j.f10247j;
        }
        int U = U(context, i18);
        if (d.j.o(context)) {
            d.j.D(context);
        }
        v2.h G = G(context);
        if (f10257t0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(K(context, U, G, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i.c) {
            try {
                ((i.c) context).a(K(context, U, G, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f10256s0) {
            return context;
        }
        int i19 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i20 = configuration3.mcc;
                int i21 = configuration4.mcc;
                if (i20 != i21) {
                    configuration.mcc = i21;
                }
                int i22 = configuration3.mnc;
                int i23 = configuration4.mnc;
                if (i22 != i23) {
                    configuration.mnc = i23;
                }
                if (i19 >= 24) {
                    f.a(configuration3, configuration4, configuration);
                } else if (!z2.b.a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i24 = configuration3.touchscreen;
                int i25 = configuration4.touchscreen;
                if (i24 != i25) {
                    configuration.touchscreen = i25;
                }
                int i26 = configuration3.keyboard;
                int i27 = configuration4.keyboard;
                if (i26 != i27) {
                    configuration.keyboard = i27;
                }
                int i28 = configuration3.keyboardHidden;
                int i29 = configuration4.keyboardHidden;
                if (i28 != i29) {
                    configuration.keyboardHidden = i29;
                }
                int i30 = configuration3.navigation;
                int i31 = configuration4.navigation;
                if (i30 != i31) {
                    configuration.navigation = i31;
                }
                int i32 = configuration3.navigationHidden;
                int i33 = configuration4.navigationHidden;
                if (i32 != i33) {
                    configuration.navigationHidden = i33;
                }
                int i34 = configuration3.orientation;
                int i35 = configuration4.orientation;
                if (i34 != i35) {
                    configuration.orientation = i35;
                }
                int i36 = configuration3.screenLayout & 15;
                int i37 = configuration4.screenLayout & 15;
                if (i36 != i37) {
                    configuration.screenLayout |= i37;
                }
                int i38 = configuration3.screenLayout & 192;
                int i39 = configuration4.screenLayout & 192;
                if (i38 != i39) {
                    configuration.screenLayout |= i39;
                }
                int i40 = configuration3.screenLayout & 48;
                int i41 = configuration4.screenLayout & 48;
                if (i40 != i41) {
                    configuration.screenLayout |= i41;
                }
                int i42 = configuration3.screenLayout & 768;
                int i43 = configuration4.screenLayout & 768;
                if (i42 != i43) {
                    configuration.screenLayout |= i43;
                }
                if (i19 >= 26) {
                    i10 = configuration3.colorMode;
                    int i44 = i10 & 3;
                    i11 = configuration4.colorMode;
                    if (i44 != (i11 & 3)) {
                        i16 = configuration.colorMode;
                        i17 = configuration4.colorMode;
                        configuration.colorMode = i16 | (i17 & 3);
                    }
                    i12 = configuration3.colorMode;
                    int i45 = i12 & 12;
                    i13 = configuration4.colorMode;
                    if (i45 != (i13 & 12)) {
                        i14 = configuration.colorMode;
                        i15 = configuration4.colorMode;
                        configuration.colorMode = i14 | (i15 & 12);
                    }
                }
                int i46 = configuration3.uiMode & 15;
                int i47 = configuration4.uiMode & 15;
                if (i46 != i47) {
                    configuration.uiMode |= i47;
                }
                int i48 = configuration3.uiMode & 48;
                int i49 = configuration4.uiMode & 48;
                if (i48 != i49) {
                    configuration.uiMode |= i49;
                }
                int i50 = configuration3.screenWidthDp;
                int i51 = configuration4.screenWidthDp;
                if (i50 != i51) {
                    configuration.screenWidthDp = i51;
                }
                int i52 = configuration3.screenHeightDp;
                int i53 = configuration4.screenHeightDp;
                if (i52 != i53) {
                    configuration.screenHeightDp = i53;
                }
                int i54 = configuration3.smallestScreenWidthDp;
                int i55 = configuration4.smallestScreenWidthDp;
                if (i54 != i55) {
                    configuration.smallestScreenWidthDp = i55;
                }
                int i56 = configuration3.densityDpi;
                int i57 = configuration4.densityDpi;
                if (i56 != i57) {
                    configuration.densityDpi = i57;
                }
            }
        } else {
            configuration = null;
        }
        Configuration K = K(context, U, G, configuration, true);
        i.c cVar = new i.c(context, 2132083262);
        cVar.a(K);
        if (context.getTheme() != null) {
            z10 = true;
            if (z10) {
                Resources.Theme theme = cVar.getTheme();
                int i58 = Build.VERSION.SDK_INT;
                if (i58 >= 29) {
                    p2.j.a(theme);
                } else if (i58 >= 23) {
                    synchronized (p2.i.f16738a) {
                        if (!p2.i.c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                p2.i.f16739b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e10) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                            }
                            p2.i.c = true;
                        }
                        Method method = p2.i.f16739b;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException e11) {
                                e = e11;
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e);
                                p2.i.f16739b = null;
                                return cVar;
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e);
                                p2.i.f16739b = null;
                                return cVar;
                            }
                        }
                    }
                }
            }
            return cVar;
        }
        z10 = false;
        if (z10) {
        }
        return cVar;
    }

    @Override // d.j
    public final <T extends View> T g(int i10) {
        N();
        return (T) this.f10275t.findViewById(i10);
    }

    @Override // d.j
    public final Context i() {
        return this.f10274s;
    }

    @Override // d.j
    public final int j() {
        return this.f10259b0;
    }

    @Override // d.j
    public final MenuInflater l() {
        if (this.f10279x == null) {
            T();
            b0 b0Var = this.f10278w;
            this.f10279x = new i.f(b0Var != null ? b0Var.c() : this.f10274s);
        }
        return this.f10279x;
    }

    @Override // d.j
    public final void m() {
        LayoutInflater from = LayoutInflater.from(this.f10274s);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // d.j
    public final void n() {
        if (this.f10278w != null) {
            T();
            this.f10278w.getClass();
            this.f10265i0 |= 1;
            if (!this.f10264h0) {
                View decorView = this.f10275t.getDecorView();
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.m(decorView, this.f10266j0);
                this.f10264h0 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd A[Catch: all -> 0x0207, Exception -> 0x020d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020d, all -> 0x0207, blocks: (B:108:0x01d6, B:111:0x01e3, B:113:0x01e7, B:118:0x01fd), top: B:151:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View vVar;
        Object[] objArr;
        t tVar;
        if (this.f10270n0 == null) {
            int[] iArr = a1.b.f52t;
            Context context2 = this.f10274s;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                tVar = new t();
            } else {
                try {
                    this.f10270n0 = (t) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    tVar = new t();
                }
            }
            this.f10270n0 = tVar;
        }
        t tVar2 = this.f10270n0;
        int i10 = m1.f1039a;
        tVar2.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.J, 0, 0);
        char c10 = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof i.c) && ((i.c) context).f11619a == resourceId)) ? context : new i.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 1;
                    break;
                }
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 2;
                    break;
                }
            case -938935918:
                if (!str.equals("TextView")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 3;
                    break;
                }
            case -937446323:
                if (!str.equals("ImageButton")) {
                    c10 = 65535;
                    break;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 5;
                    break;
                }
            case -339785223:
                if (!str.equals("Spinner")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 6;
                    break;
                }
            case 776382189:
                if (!str.equals("RadioButton")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 7;
                    break;
                }
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = '\b';
                    break;
                }
            case 1125864064:
                if (!str.equals("ImageView")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = '\t';
                    break;
                }
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = '\n';
                    break;
                }
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 11;
                    break;
                }
            case 1666676343:
                if (!str.equals("EditText")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = '\f';
                    break;
                }
            case 2001146706:
                if (!str.equals("Button")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = '\r';
                    break;
                }
            default:
                c10 = 65535;
                break;
        }
        View view2 = null;
        switch (c10) {
            case 0:
                vVar = new androidx.appcompat.widget.v(cVar, attributeSet);
                if (vVar == null && context != cVar) {
                    objArr = tVar2.f10324a;
                    if (str.equals("view")) {
                        str = attributeSet.getAttributeValue(null, "class");
                    }
                    try {
                        objArr[0] = cVar;
                        objArr[1] = attributeSet;
                        if (-1 != str.indexOf(46)) {
                            int i11 = 0;
                            while (true) {
                                String[] strArr = t.f10322g;
                                if (i11 < 3) {
                                    View f10 = tVar2.f(cVar, str, strArr[i11]);
                                    if (f10 != null) {
                                        objArr[0] = null;
                                        objArr[1] = null;
                                        view2 = f10;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    objArr[0] = null;
                                    objArr[1] = null;
                                }
                            }
                        } else {
                            View f11 = tVar2.f(cVar, str, null);
                            objArr[0] = null;
                            objArr[1] = null;
                            view2 = f11;
                        }
                    } catch (Exception unused) {
                        objArr[0] = null;
                        objArr[1] = null;
                    } catch (Throwable th2) {
                        objArr[0] = null;
                        objArr[1] = null;
                        throw th2;
                    }
                    vVar = view2;
                }
                if (vVar != null) {
                    Context context3 = vVar.getContext();
                    if (context3 instanceof ContextWrapper) {
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        if (j0.c.a(vVar)) {
                            TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, t.c);
                            String string2 = obtainStyledAttributes2.getString(0);
                            if (string2 != null) {
                                vVar.setOnClickListener(new t.a(vVar, string2));
                            }
                            obtainStyledAttributes2.recycle();
                        }
                    }
                    if (Build.VERSION.SDK_INT <= 28) {
                        TypedArray obtainStyledAttributes3 = cVar.obtainStyledAttributes(attributeSet, t.f10319d);
                        if (obtainStyledAttributes3.hasValue(0)) {
                            boolean z10 = obtainStyledAttributes3.getBoolean(0, false);
                            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                            new a3.i0().e(vVar, Boolean.valueOf(z10));
                        }
                        obtainStyledAttributes3.recycle();
                        TypedArray obtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, t.f10320e);
                        if (obtainStyledAttributes4.hasValue(0)) {
                            j0.q(vVar, obtainStyledAttributes4.getString(0));
                        }
                        obtainStyledAttributes4.recycle();
                        TypedArray obtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, t.f10321f);
                        if (obtainStyledAttributes5.hasValue(0)) {
                            boolean z11 = obtainStyledAttributes5.getBoolean(0, false);
                            WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                            new f0().e(vVar, Boolean.valueOf(z11));
                        }
                        obtainStyledAttributes5.recycle();
                    }
                }
                return vVar;
            case 1:
                vVar = new androidx.appcompat.widget.h(cVar, attributeSet);
                if (vVar == null) {
                    objArr = tVar2.f10324a;
                    if (str.equals("view")) {
                    }
                    objArr[0] = cVar;
                    objArr[1] = attributeSet;
                    if (-1 != str.indexOf(46)) {
                    }
                    vVar = view2;
                }
                if (vVar != null) {
                }
                return vVar;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                vVar = new androidx.appcompat.widget.r(cVar, attributeSet);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                vVar = tVar2.e(cVar, attributeSet);
                if (vVar != null) {
                    if (vVar == null) {
                    }
                    if (vVar != null) {
                    }
                    return vVar;
                }
                throw new IllegalStateException(tVar2.getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                vVar = new androidx.appcompat.widget.o(cVar, attributeSet);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case 5:
                vVar = new androidx.appcompat.widget.x(cVar, attributeSet);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case 6:
                vVar = new androidx.appcompat.widget.a0(cVar, attributeSet, R.attr.spinnerStyle);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                vVar = tVar2.d(cVar, attributeSet);
                if (vVar != null) {
                }
                break;
            case '\b':
                vVar = new g0(cVar, attributeSet);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case ma.i.f16046m /* 9 */:
                vVar = new androidx.appcompat.widget.q(cVar, attributeSet, 0);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case ma.i.f16047o /* 10 */:
                vVar = tVar2.a(cVar, attributeSet);
                if (vVar != null) {
                }
                break;
            case 11:
                vVar = tVar2.c(cVar, attributeSet);
                if (vVar != null) {
                }
                break;
            case '\f':
                vVar = new androidx.appcompat.widget.l(cVar, attributeSet);
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
            case '\r':
                vVar = tVar2.b(cVar, attributeSet);
                if (vVar != null) {
                }
                break;
            default:
                vVar = null;
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                return vVar;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // d.j
    public final void p() {
        if (this.O && this.I) {
            T();
            b0 b0Var = this.f10278w;
            if (b0Var != null) {
                b0Var.f(b0Var.f10210a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.k a10 = androidx.appcompat.widget.k.a();
        Context context = this.f10274s;
        synchronized (a10) {
            a10.f981a.k(context);
        }
        this.f10258a0 = new Configuration(this.f10274s.getResources().getConfiguration());
        E(false, false);
    }

    @Override // d.j
    public final void q() {
        String str;
        this.X = true;
        E(false, true);
        O();
        Object obj = this.f10273r;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = m2.l.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                b0 b0Var = this.f10278w;
                if (b0Var == null) {
                    this.f10267k0 = true;
                } else {
                    b0Var.e(true);
                }
            }
            synchronized (d.j.f10252p) {
                d.j.v(this);
                d.j.f10251o.add(new WeakReference<>(this));
            }
        }
        this.f10258a0 = new Configuration(this.f10274s.getResources().getConfiguration());
        this.Y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // d.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        C0103k c0103k;
        i iVar;
        if (this.f10273r instanceof Activity) {
            synchronized (d.j.f10252p) {
                d.j.v(this);
            }
        }
        if (this.f10264h0) {
            this.f10275t.getDecorView().removeCallbacks(this.f10266j0);
        }
        this.Z = true;
        if (this.f10259b0 != -100) {
            Object obj = this.f10273r;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f10254q0.put(this.f10273r.getClass().getName(), Integer.valueOf(this.f10259b0));
                c0103k = this.f10262f0;
                if (c0103k != null) {
                    c0103k.a();
                }
                iVar = this.f10263g0;
                if (iVar == null) {
                    iVar.a();
                    return;
                }
                return;
            }
        }
        f10254q0.remove(this.f10273r.getClass().getName());
        c0103k = this.f10262f0;
        if (c0103k != null) {
        }
        iVar = this.f10263g0;
        if (iVar == null) {
        }
    }

    @Override // d.j
    public final void s() {
        T();
        b0 b0Var = this.f10278w;
        if (b0Var != null) {
            b0Var.f10228u = true;
        }
    }

    @Override // d.j
    public final void t() {
        E(true, false);
    }

    @Override // d.j
    public final void u() {
        T();
        b0 b0Var = this.f10278w;
        if (b0Var != null) {
            b0Var.f10228u = false;
            i.g gVar = b0Var.f10227t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // d.j
    public final boolean w(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.S && i10 == 108) {
            return false;
        }
        if (this.O && i10 == 1) {
            this.O = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f10275t.requestFeature(i10);
                            }
                            Z();
                            this.P = true;
                            return true;
                        }
                        Z();
                        this.O = true;
                        return true;
                    }
                    Z();
                    this.Q = true;
                    return true;
                }
                Z();
                this.N = true;
                return true;
            }
            Z();
            this.M = true;
            return true;
        }
        Z();
        this.S = true;
        return true;
    }

    @Override // d.j
    public final void x(int i10) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f10274s).inflate(i10, viewGroup);
        this.f10276u.a(this.f10275t.getCallback());
    }

    @Override // d.j
    public final void y(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f10276u.a(this.f10275t.getCallback());
    }

    @Override // d.j
    public final void z(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f10276u.a(this.f10275t.getCallback());
    }

    /* loaded from: classes.dex */
    public class h extends i.h {

        /* renamed from: j  reason: collision with root package name */
        public boolean f10286j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10287k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10288l;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f10286j = true;
                callback.onContentChanged();
            } finally {
                this.f10286j = false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final i.e b(ActionMode.Callback callback) {
            ViewGroup viewGroup;
            Context context;
            k kVar = k.this;
            e.a aVar = new e.a(kVar.f10274s, callback);
            i.a aVar2 = kVar.C;
            if (aVar2 != null) {
                aVar2.c();
            }
            c cVar = new c(aVar);
            kVar.T();
            b0 b0Var = kVar.f10278w;
            boolean z10 = true;
            d.g gVar = kVar.f10277v;
            if (b0Var != null) {
                b0.d dVar = b0Var.f10217i;
                if (dVar != null) {
                    dVar.c();
                }
                b0Var.c.setHideOnContentScrollEnabled(false);
                b0Var.f10214f.h();
                b0.d dVar2 = new b0.d(b0Var.f10214f.getContext(), cVar);
                androidx.appcompat.view.menu.f fVar = dVar2.f10235l;
                fVar.w();
                try {
                    if (dVar2.f10236m.b(dVar2, fVar)) {
                        b0Var.f10217i = dVar2;
                        dVar2.i();
                        b0Var.f10214f.f(dVar2);
                        b0Var.a(true);
                    } else {
                        dVar2 = null;
                    }
                    kVar.C = dVar2;
                    if (dVar2 != null && gVar != null) {
                        gVar.h();
                    }
                } finally {
                    fVar.v();
                }
            }
            if (kVar.C == null) {
                v0 v0Var = kVar.G;
                if (v0Var != null) {
                    v0Var.b();
                }
                i.a aVar3 = kVar.C;
                if (aVar3 != null) {
                    aVar3.c();
                }
                if (gVar != null && !kVar.Z) {
                    try {
                        gVar.j();
                    } catch (AbstractMethodError unused) {
                    }
                }
                if (kVar.D == null) {
                    boolean z11 = kVar.R;
                    Context context2 = kVar.f10274s;
                    if (z11) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context2.getTheme();
                        theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = context2.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            i.c cVar2 = new i.c(context2, 0);
                            cVar2.getTheme().setTo(newTheme);
                            context2 = cVar2;
                        }
                        kVar.D = new ActionBarContextView(context2, null);
                        PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                        kVar.E = popupWindow;
                        e3.g.b(popupWindow, 2);
                        kVar.E.setContentView(kVar.D);
                        kVar.E.setWidth(-1);
                        context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                        kVar.D.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                        kVar.E.setHeight(-2);
                        kVar.F = new d.n(kVar);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) kVar.J.findViewById(R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            kVar.T();
                            b0 b0Var2 = kVar.f10278w;
                            if (b0Var2 != null) {
                                context = b0Var2.c();
                            } else {
                                context = null;
                            }
                            if (context != null) {
                                context2 = context;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                            kVar.D = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (kVar.D != null) {
                    v0 v0Var2 = kVar.G;
                    if (v0Var2 != null) {
                        v0Var2.b();
                    }
                    kVar.D.h();
                    i.d dVar3 = new i.d(kVar.D.getContext(), kVar.D, cVar);
                    if (cVar.b(dVar3, dVar3.f11627p)) {
                        dVar3.i();
                        kVar.D.f(dVar3);
                        kVar.C = dVar3;
                        if (kVar.I && (viewGroup = kVar.J) != null) {
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                            if (j0.g.c(viewGroup)) {
                                ActionBarContextView actionBarContextView = kVar.D;
                                if (!z10) {
                                    actionBarContextView.setAlpha(0.0f);
                                    v0 a10 = j0.a(kVar.D);
                                    a10.a(1.0f);
                                    kVar.G = a10;
                                    a10.d(new o(kVar));
                                } else {
                                    actionBarContextView.setAlpha(1.0f);
                                    kVar.D.setVisibility(0);
                                    if (kVar.D.getParent() instanceof View) {
                                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                                        j0.h.c((View) kVar.D.getParent());
                                    }
                                }
                                if (kVar.E != null) {
                                    kVar.f10275t.getDecorView().post(kVar.F);
                                }
                            }
                        }
                        z10 = false;
                        ActionBarContextView actionBarContextView2 = kVar.D;
                        if (!z10) {
                        }
                        if (kVar.E != null) {
                        }
                    } else {
                        kVar.C = null;
                    }
                }
                if (kVar.C != null && gVar != null) {
                    gVar.h();
                }
                kVar.a0();
                kVar.C = kVar.C;
            }
            kVar.a0();
            i.a aVar4 = kVar.C;
            if (aVar4 == null) {
                return null;
            }
            return aVar.e(aVar4);
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f10287k) {
                return this.f11669i.dispatchKeyEvent(keyEvent);
            }
            if (!k.this.L(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
            if (r7 != false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[ORIG_RETURN, RETURN] */
        @Override // i.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z10;
            androidx.appcompat.view.menu.f fVar;
            boolean z11;
            boolean performShortcut;
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            k kVar = k.this;
            kVar.T();
            b0 b0Var = kVar.f10278w;
            if (b0Var != null) {
                b0.d dVar = b0Var.f10217i;
                if (dVar != null && (fVar = dVar.f10235l) != null) {
                    if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fVar.setQwertyMode(z11);
                    performShortcut = fVar.performShortcut(keyCode, keyEvent, 0);
                    if (performShortcut) {
                        z10 = true;
                        if (z10) {
                            return true;
                        }
                        return false;
                    }
                }
                performShortcut = false;
                if (performShortcut) {
                }
            }
            m mVar = kVar.V;
            if (mVar != null && kVar.X(mVar, keyEvent.getKeyCode(), keyEvent)) {
                m mVar2 = kVar.V;
                if (mVar2 != null) {
                    mVar2.f10306l = true;
                }
            } else {
                if (kVar.V == null) {
                    m R = kVar.R(0);
                    kVar.Y(R, keyEvent);
                    boolean X = kVar.X(R, keyEvent.getKeyCode(), keyEvent);
                    R.f10305k = false;
                }
                z10 = false;
                if (z10) {
                }
            }
            z10 = true;
            if (z10) {
            }
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f10286j) {
                this.f11669i.onContentChanged();
            }
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // i.h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            k kVar = k.this;
            if (i10 == 108) {
                kVar.T();
                b0 b0Var = kVar.f10278w;
                if (b0Var != null) {
                    b0Var.b(true);
                }
            } else {
                kVar.getClass();
            }
            return true;
        }

        @Override // i.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f10288l) {
                this.f11669i.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            k kVar = k.this;
            if (i10 == 108) {
                kVar.T();
                b0 b0Var = kVar.f10278w;
                if (b0Var != null) {
                    b0Var.b(false);
                }
            } else if (i10 == 0) {
                m R = kVar.R(i10);
                if (R.f10307m) {
                    kVar.J(R, false);
                }
            } else {
                kVar.getClass();
            }
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f634x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f634x = false;
            }
            return onPreparePanel;
        }

        @Override // i.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = k.this.R(0).f10302h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // i.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return k.this.H ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // i.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (k.this.H && i10 == 0) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
