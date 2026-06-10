package androidx.activity;

import a3.n;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateHandlesProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import b.a;
import com.noto.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m2.b;

/* loaded from: classes.dex */
public class ComponentActivity extends m2.k implements n0, androidx.lifecycle.i, b4.d, m, androidx.activity.result.g {

    /* renamed from: j  reason: collision with root package name */
    public final a.a f412j = new a.a();

    /* renamed from: k  reason: collision with root package name */
    public final n f413k = new n();

    /* renamed from: l  reason: collision with root package name */
    public final r f414l;

    /* renamed from: m  reason: collision with root package name */
    public final b4.c f415m;
    public m0 n;

    /* renamed from: o  reason: collision with root package name */
    public f0 f416o;

    /* renamed from: p  reason: collision with root package name */
    public final OnBackPressedDispatcher f417p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicInteger f418q;

    /* renamed from: r  reason: collision with root package name */
    public final b f419r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList<z2.a<Configuration>> f420s;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList<z2.a<Integer>> f421t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<z2.a<Intent>> f422u;

    /* renamed from: v  reason: collision with root package name */
    public final CopyOnWriteArrayList<z2.a<a1.c>> f423v;

    /* renamed from: w  reason: collision with root package name */
    public final CopyOnWriteArrayList<z2.a<a1.c>> f424w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f425x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f426y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.f {
        public b() {
        }

        @Override // androidx.activity.result.f
        public final void b(int i10, b.a aVar, Object obj) {
            Bundle bundle;
            String[] strArr;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0051a b5 = aVar.b(componentActivity, obj);
            if (b5 != null) {
                new Handler(Looper.getMainLooper()).post(new f(this, i10, b5));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i11 = m2.b.f15908b;
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                        if (!v2.a.a() && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i12));
                        }
                    } else {
                        throw new IllegalArgumentException(e.k(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[stringArrayExtra.length - size];
                } else {
                    strArr = stringArrayExtra;
                }
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i13 = 0;
                        for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                            if (!hashSet.contains(Integer.valueOf(i14))) {
                                strArr[i13] = stringArrayExtra[i14];
                                i13++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (componentActivity instanceof b.d) {
                        ((b.d) componentActivity).c();
                    }
                    b.C0184b.b(componentActivity, stringArrayExtra, i10);
                } else if (componentActivity instanceof b.c) {
                    new Handler(Looper.getMainLooper()).post(new m2.a(componentActivity, strArr, i10));
                }
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f489i;
                    Intent intent = hVar.f490j;
                    int i15 = hVar.f491k;
                    int i16 = hVar.f492l;
                    int i17 = m2.b.f15908b;
                    b.a.c(componentActivity, intentSender, i10, intent, i15, i16, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new g(this, i10, e10));
                }
            } else {
                int i18 = m2.b.f15908b;
                b.a.b(componentActivity, a10, i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public m0 f432a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComponentActivity() {
        boolean z10;
        r rVar = new r(this);
        this.f414l = rVar;
        b4.c cVar = new b4.c(this);
        this.f415m = cVar;
        this.f417p = new OnBackPressedDispatcher(new a());
        this.f418q = new AtomicInteger();
        this.f419r = new b();
        this.f420s = new CopyOnWriteArrayList<>();
        this.f421t = new CopyOnWriteArrayList<>();
        this.f422u = new CopyOnWriteArrayList<>();
        this.f423v = new CopyOnWriteArrayList<>();
        this.f424w = new CopyOnWriteArrayList<>();
        this.f425x = false;
        this.f426y = false;
        int i10 = Build.VERSION.SDK_INT;
        rVar.a(new o() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.o
            public final void f(q qVar, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        rVar.a(new o() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.o
            public final void f(q qVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.f412j.f1b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.X().a();
                    }
                }
            }
        });
        rVar.a(new o() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.o
            public final void f(q qVar, Lifecycle.Event event) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.n == null) {
                    d dVar = (d) componentActivity.getLastNonConfigurationInstance();
                    if (dVar != null) {
                        componentActivity.n = dVar.f432a;
                    }
                    if (componentActivity.n == null) {
                        componentActivity.n = new m0();
                    }
                }
                componentActivity.f414l.c(this);
            }
        });
        cVar.a();
        Lifecycle.State state = rVar.f5413d;
        if (state != Lifecycle.State.INITIALIZED && state != Lifecycle.State.CREATED) {
            z10 = false;
            if (!z10) {
                b4.b bVar = cVar.f6385b;
                if (bVar.b() == null) {
                    SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(bVar, this);
                    bVar.c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
                    rVar.a(new SavedStateHandleAttacher(savedStateHandlesProvider));
                }
                if (i10 <= 23) {
                    rVar.a(new ImmLeaksCleaner(this));
                }
                bVar.c("android:support:activity-result", new androidx.activity.c(0, this));
                l(new a.b() { // from class: androidx.activity.d
                    @Override // a.b
                    public final void a() {
                        ComponentActivity componentActivity = ComponentActivity.this;
                        Bundle a10 = componentActivity.f415m.f6385b.a("android:support:activity-result");
                        if (a10 != null) {
                            ComponentActivity.b bVar2 = componentActivity.f419r;
                            bVar2.getClass();
                            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                            if (stringArrayList != null && integerArrayList != null) {
                                bVar2.f481e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                                bVar2.f478a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                                Bundle bundle2 = bVar2.f484h;
                                bundle2.putAll(bundle);
                                for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                                    String str = stringArrayList.get(i11);
                                    HashMap hashMap = bVar2.c;
                                    boolean containsKey = hashMap.containsKey(str);
                                    HashMap hashMap2 = bVar2.f479b;
                                    if (containsKey) {
                                        Integer num = (Integer) hashMap.remove(str);
                                        if (!bundle2.containsKey(str)) {
                                            hashMap2.remove(num);
                                        }
                                    }
                                    int intValue = integerArrayList.get(i11).intValue();
                                    String str2 = stringArrayList.get(i11);
                                    hashMap2.put(Integer.valueOf(intValue), str2);
                                    hashMap.put(str2, Integer.valueOf(intValue));
                                }
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        z10 = true;
        if (!z10) {
        }
    }

    @Override // androidx.activity.result.g
    public final androidx.activity.result.f P() {
        return this.f419r;
    }

    @Override // androidx.lifecycle.n0
    public final m0 X() {
        if (getApplication() != null) {
            if (this.n == null) {
                d dVar = (d) getLastNonConfigurationInstance();
                if (dVar != null) {
                    this.n = dVar.f432a;
                }
                if (this.n == null) {
                    this.n = new m0();
                }
            }
            return this.n;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.m
    public final OnBackPressedDispatcher d() {
        return this.f417p;
    }

    @Override // b4.d
    public final b4.b e() {
        return this.f415m.f6385b;
    }

    @Override // androidx.lifecycle.i
    public final k0.b f() {
        if (this.f416o == null) {
            this.f416o = new f0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f416o;
    }

    @Override // androidx.lifecycle.i
    public final t3.a g() {
        t3.c cVar = new t3.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f17562a;
        if (application != null) {
            linkedHashMap.put(j0.f5399a, getApplication());
        }
        linkedHashMap.put(SavedStateHandleSupport.f5353a, this);
        linkedHashMap.put(SavedStateHandleSupport.f5354b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // m2.k, androidx.lifecycle.q
    public final r i0() {
        return this.f414l;
    }

    public final void l(a.b bVar) {
        a.a aVar = this.f412j;
        if (aVar.f1b != null) {
            bVar.a();
        }
        aVar.f0a.add(bVar);
    }

    public final void m() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        v7.g.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        v7.g.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f419r.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f417p.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<z2.a<Configuration>> it = this.f420s.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // m2.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f415m.b(bundle);
        a.a aVar = this.f412j;
        aVar.f1b = this;
        Iterator it = aVar.f0a.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a();
        }
        super.onCreate(bundle);
        int i10 = b0.f5365j;
        b0.b.b(this);
        if (v2.a.a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f417p;
            onBackPressedDispatcher.f441e = c.a(this);
            onBackPressedDispatcher.c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            getMenuInflater();
            Iterator<a3.r> it = this.f413k.f208a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<a3.r> it = this.f413k.f208a.iterator();
        while (it.hasNext()) {
            if (it.next().c()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.f425x) {
            return;
        }
        Iterator<z2.a<a1.c>> it = this.f423v.iterator();
        while (it.hasNext()) {
            it.next().accept(new a1.c());
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f425x = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f425x = false;
            Iterator<z2.a<a1.c>> it = this.f423v.iterator();
            while (it.hasNext()) {
                it.next().accept(new a1.c(0));
            }
        } catch (Throwable th) {
            this.f425x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<z2.a<Intent>> it = this.f422u.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<a3.r> it = this.f413k.f208a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.f426y) {
            return;
        }
        Iterator<z2.a<a1.c>> it = this.f424w.iterator();
        while (it.hasNext()) {
            it.next().accept(new a1.c());
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f426y = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f426y = false;
            Iterator<z2.a<a1.c>> it = this.f424w.iterator();
            while (it.hasNext()) {
                it.next().accept(new a1.c(0));
            }
        } catch (Throwable th) {
            this.f426y = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator<a3.r> it = this.f413k.f208a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f419r.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        m0 m0Var = this.n;
        if (m0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            m0Var = dVar.f432a;
        }
        if (m0Var == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f432a = m0Var;
        return dVar2;
    }

    @Override // m2.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        r rVar = this.f414l;
        if (rVar instanceof r) {
            rVar.h(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f415m.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<z2.a<Integer>> it = this.f421t.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (g4.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
