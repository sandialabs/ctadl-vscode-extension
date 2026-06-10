package d;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import d.u;
import d.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: i  reason: collision with root package name */
    public static final w.a f10246i = new w.a(new w.b());

    /* renamed from: j  reason: collision with root package name */
    public static int f10247j = -100;

    /* renamed from: k  reason: collision with root package name */
    public static v2.h f10248k = null;

    /* renamed from: l  reason: collision with root package name */
    public static v2.h f10249l = null;

    /* renamed from: m  reason: collision with root package name */
    public static Boolean f10250m = null;
    public static boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final p.d<WeakReference<j>> f10251o = new p.d<>();

    /* renamed from: p  reason: collision with root package name */
    public static final Object f10252p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public static final Object f10253q = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static void A(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f10247j != i10) {
            f10247j = i10;
            synchronized (f10252p) {
                Iterator<WeakReference<j>> it = f10251o.iterator();
                while (it.hasNext()) {
                    j jVar = it.next().get();
                    if (jVar != null) {
                        jVar.e();
                    }
                }
            }
        }
    }

    public static void D(Context context) {
        if (!o(context)) {
            return;
        }
        if (v2.a.a()) {
            if (!n) {
                f10246i.execute(new i(context, 0));
                return;
            }
            return;
        }
        synchronized (f10253q) {
            v2.h hVar = f10248k;
            if (hVar == null) {
                if (f10249l == null) {
                    f10249l = v2.h.b(w.b(context));
                }
                if (f10249l.f18149a.isEmpty()) {
                    return;
                }
                f10248k = f10249l;
            } else if (!hVar.equals(f10249l)) {
                v2.h hVar2 = f10248k;
                f10249l = hVar2;
                w.a(context, hVar2.f18149a.a());
            }
        }
    }

    public static v2.h h() {
        if (v2.a.a()) {
            Object k3 = k();
            if (k3 != null) {
                return new v2.h(new v2.k(b.a(k3)));
            }
        } else {
            v2.h hVar = f10248k;
            if (hVar != null) {
                return hVar;
            }
        }
        return v2.h.f18148b;
    }

    public static Object k() {
        Context i10;
        Iterator<WeakReference<j>> it = f10251o.iterator();
        while (it.hasNext()) {
            j jVar = it.next().get();
            if (jVar != null && (i10 = jVar.i()) != null) {
                return i10.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean o(Context context) {
        int i10;
        if (f10250m == null) {
            try {
                int i11 = u.f10329i;
                if (Build.VERSION.SDK_INT >= 24) {
                    i10 = u.a.a() | 128;
                } else {
                    i10 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, u.class), i10).metaData;
                if (bundle != null) {
                    f10250m = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f10250m = Boolean.FALSE;
            }
        }
        return f10250m.booleanValue();
    }

    public static void v(j jVar) {
        synchronized (f10252p) {
            Iterator<WeakReference<j>> it = f10251o.iterator();
            while (it.hasNext()) {
                j jVar2 = it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public void B(int i10) {
    }

    public abstract void C(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d() {
    }

    public abstract boolean e();

    public Context f(Context context) {
        return context;
    }

    public abstract <T extends View> T g(int i10);

    public Context i() {
        return null;
    }

    public int j() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract void m();

    public abstract void n();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract boolean w(int i10);

    public abstract void x(int i10);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);
}
