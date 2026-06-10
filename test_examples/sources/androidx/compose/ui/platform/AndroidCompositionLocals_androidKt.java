package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import com.noto.R;
import g0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final g0.r f3655a;

    /* renamed from: b  reason: collision with root package name */
    public static final g0.h1 f3656b;
    public static final g0.h1 c;

    /* renamed from: d  reason: collision with root package name */
    public static final g0.h1 f3657d;

    /* renamed from: e  reason: collision with root package name */
    public static final g0.h1 f3658e;

    /* renamed from: f  reason: collision with root package name */
    public static final g0.h1 f3659f;

    static {
        g0.h0 h0Var = g0.h0.f11052a;
        AndroidCompositionLocals_androidKt$LocalConfiguration$1 androidCompositionLocals_androidKt$LocalConfiguration$1 = AndroidCompositionLocals_androidKt$LocalConfiguration$1.f3660j;
        v7.g.f(androidCompositionLocals_androidKt$LocalConfiguration$1, "defaultFactory");
        f3655a = new g0.r(h0Var, androidCompositionLocals_androidKt$LocalConfiguration$1);
        f3656b = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalContext$1.f3661j);
        c = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f3662j);
        f3657d = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.f3663j);
        f3658e = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.f3664j);
        f3659f = CompositionLocalKt.c(AndroidCompositionLocals_androidKt$LocalView$1.f3665j);
    }

    public static final void a(AndroidComposeView androidComposeView, u7.p<? super g0.d, ? super Integer, m7.n> pVar, g0.d dVar, int i10) {
        LinkedHashMap linkedHashMap;
        boolean z10;
        v7.g.f(androidComposeView, "owner");
        v7.g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(1396852028);
        u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
        Context context = androidComposeView.getContext();
        p10.f(-492369756);
        Object a02 = p10.a0();
        d.a.C0120a c0120a = d.a.f11039a;
        if (a02 == c0120a) {
            a02 = a1.c.U0(context.getResources().getConfiguration(), g0.h0.f11052a);
            p10.I0(a02);
        }
        p10.Q(false);
        g0.g0 g0Var = (g0.g0) a02;
        p10.f(1157296644);
        boolean z11 = p10.z(g0Var);
        Object a03 = p10.a0();
        if (z11 || a03 == c0120a) {
            a03 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(g0Var);
            p10.I0(a03);
        }
        p10.Q(false);
        androidComposeView.setConfigurationChangeObserver((u7.l) a03);
        p10.f(-492369756);
        Object a04 = p10.a0();
        if (a04 == c0120a) {
            v7.g.e(context, "context");
            a04 = new y(context);
            p10.I0(a04);
        }
        p10.Q(false);
        y yVar = (y) a04;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            p10.f(-492369756);
            Object a05 = p10.a0();
            b4.d dVar2 = viewTreeOwners.f3602b;
            if (a05 == c0120a) {
                v7.g.f(dVar2, "owner");
                ViewParent parent = androidComposeView.getParent();
                v7.g.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                v7.g.f(str, "id");
                String str2 = o0.c.class.getSimpleName() + ':' + str;
                b4.b e10 = dVar2.e();
                Bundle a10 = e10.a(str2);
                if (a10 != null) {
                    linkedHashMap = new LinkedHashMap();
                    Set<String> keySet = a10.keySet();
                    v7.g.e(keySet, "this.keySet()");
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        Iterator it2 = it;
                        ArrayList parcelableArrayList = a10.getParcelableArrayList(str3);
                        v7.g.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        v7.g.e(str3, "key");
                        linkedHashMap.put(str3, parcelableArrayList);
                        it = it2;
                        a10 = a10;
                    }
                } else {
                    linkedHashMap = null;
                }
                DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.f3739j;
                g0.h1 h1Var = SaveableStateRegistryKt.f2916a;
                v7.g.f(disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1, "canBeSaved");
                o0.d dVar3 = new o0.d(linkedHashMap, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
                try {
                    e10.c(str2, new i0(dVar3));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                h0 h0Var = new h0(dVar3, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z10, e10, str2));
                p10.I0(h0Var);
                a05 = h0Var;
            }
            p10.Q(false);
            h0 h0Var2 = (h0) a05;
            g0.s.a(m7.n.f16010a, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(h0Var2), p10);
            v7.g.e(context, "context");
            Configuration configuration = (Configuration) g0Var.getValue();
            p10.f(-485908294);
            u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar2 = ComposerKt.f2737a;
            p10.f(-492369756);
            Object a06 = p10.a0();
            if (a06 == c0120a) {
                a06 = new n1.a();
                p10.I0(a06);
            }
            p10.Q(false);
            n1.a aVar = (n1.a) a06;
            p10.f(-492369756);
            Object a07 = p10.a0();
            Configuration configuration2 = a07;
            if (a07 == c0120a) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                p10.I0(configuration3);
                configuration2 = configuration3;
            }
            p10.Q(false);
            Configuration configuration4 = (Configuration) configuration2;
            p10.f(-492369756);
            Object a08 = p10.a0();
            if (a08 == c0120a) {
                a08 = new v(configuration4, aVar);
                p10.I0(a08);
            }
            p10.Q(false);
            g0.s.a(aVar, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (v) a08), p10);
            p10.Q(false);
            Configuration configuration5 = (Configuration) g0Var.getValue();
            v7.g.e(configuration5, "configuration");
            CompositionLocalKt.a(new g0.p0[]{f3655a.b(configuration5), f3656b.b(context), f3657d.b(viewTreeOwners.f3601a), f3658e.b(dVar2), SaveableStateRegistryKt.f2916a.b(h0Var2), f3659f.b(androidComposeView.getView()), c.b(aVar)}, a1.c.i0(p10, 1471621628, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, yVar, pVar, i10)), p10, 56);
            g0.r0 T = p10.T();
            if (T == null) {
                return;
            }
            T.f11073d = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, pVar, i10);
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
