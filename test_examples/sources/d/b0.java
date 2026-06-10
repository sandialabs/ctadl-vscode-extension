package d;

import a3.j0;
import a3.v0;
import a3.x0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i0;
import com.noto.R;
import d.a;
import d.k;
import i.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends d.a implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f10210a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10211b;
    public ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f10212d;

    /* renamed from: e  reason: collision with root package name */
    public i0 f10213e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f10214f;

    /* renamed from: g  reason: collision with root package name */
    public final View f10215g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10216h;

    /* renamed from: i  reason: collision with root package name */
    public d f10217i;

    /* renamed from: j  reason: collision with root package name */
    public d f10218j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0126a f10219k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10220l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<a.b> f10221m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f10222o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10223p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10224q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10225r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10226s;

    /* renamed from: t  reason: collision with root package name */
    public i.g f10227t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10228u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10229v;

    /* renamed from: w  reason: collision with root package name */
    public final a f10230w;

    /* renamed from: x  reason: collision with root package name */
    public final b f10231x;

    /* renamed from: y  reason: collision with root package name */
    public final c f10232y;

    /* renamed from: z  reason: collision with root package name */
    public static final AccelerateInterpolator f10209z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends a1.c {
        public a() {
        }

        @Override // a3.w0
        public final void a() {
            View view;
            b0 b0Var = b0.this;
            if (b0Var.f10223p && (view = b0Var.f10215g) != null) {
                view.setTranslationY(0.0f);
                b0Var.f10212d.setTranslationY(0.0f);
            }
            b0Var.f10212d.setVisibility(8);
            b0Var.f10212d.setTransitioning(false);
            b0Var.f10227t = null;
            a.InterfaceC0126a interfaceC0126a = b0Var.f10219k;
            if (interfaceC0126a != null) {
                interfaceC0126a.c(b0Var.f10218j);
                b0Var.f10218j = null;
                b0Var.f10219k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = b0Var.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a1.c {
        public b() {
        }

        @Override // a3.w0
        public final void a() {
            b0 b0Var = b0.this;
            b0Var.f10227t = null;
            b0Var.f10212d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements x0 {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends i.a implements f.a {

        /* renamed from: k  reason: collision with root package name */
        public final Context f10234k;

        /* renamed from: l  reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f10235l;

        /* renamed from: m  reason: collision with root package name */
        public a.InterfaceC0126a f10236m;
        public WeakReference<View> n;

        public d(Context context, k.c cVar) {
            this.f10234k = context;
            this.f10236m = cVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f623l = 1;
            this.f10235l = fVar;
            fVar.f616e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0126a interfaceC0126a = this.f10236m;
            if (interfaceC0126a != null) {
                return interfaceC0126a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f10236m == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = b0.this.f10214f.f829l;
            if (cVar != null) {
                cVar.l();
            }
        }

        @Override // i.a
        public final void c() {
            b0 b0Var = b0.this;
            if (b0Var.f10217i != this) {
                return;
            }
            if (!(!b0Var.f10224q)) {
                b0Var.f10218j = this;
                b0Var.f10219k = this.f10236m;
            } else {
                this.f10236m.c(this);
            }
            this.f10236m = null;
            b0Var.a(false);
            ActionBarContextView actionBarContextView = b0Var.f10214f;
            if (actionBarContextView.f705s == null) {
                actionBarContextView.h();
            }
            b0Var.c.setHideOnContentScrollEnabled(b0Var.f10229v);
            b0Var.f10217i = null;
        }

        @Override // i.a
        public final View d() {
            WeakReference<View> weakReference = this.n;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // i.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f10235l;
        }

        @Override // i.a
        public final MenuInflater f() {
            return new i.f(this.f10234k);
        }

        @Override // i.a
        public final CharSequence g() {
            return b0.this.f10214f.getSubtitle();
        }

        @Override // i.a
        public final CharSequence h() {
            return b0.this.f10214f.getTitle();
        }

        @Override // i.a
        public final void i() {
            if (b0.this.f10217i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f10235l;
            fVar.w();
            try {
                this.f10236m.d(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // i.a
        public final boolean j() {
            return b0.this.f10214f.A;
        }

        @Override // i.a
        public final void k(View view) {
            b0.this.f10214f.setCustomView(view);
            this.n = new WeakReference<>(view);
        }

        @Override // i.a
        public final void l(int i10) {
            m(b0.this.f10210a.getResources().getString(i10));
        }

        @Override // i.a
        public final void m(CharSequence charSequence) {
            b0.this.f10214f.setSubtitle(charSequence);
        }

        @Override // i.a
        public final void n(int i10) {
            o(b0.this.f10210a.getResources().getString(i10));
        }

        @Override // i.a
        public final void o(CharSequence charSequence) {
            b0.this.f10214f.setTitle(charSequence);
        }

        @Override // i.a
        public final void p(boolean z10) {
            this.f11617j = z10;
            b0.this.f10214f.setTitleOptional(z10);
        }
    }

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.f10221m = new ArrayList<>();
        this.f10222o = 0;
        this.f10223p = true;
        this.f10226s = true;
        this.f10230w = new a();
        this.f10231x = new b();
        this.f10232y = new c();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z10) {
            return;
        }
        this.f10215g = decorView.findViewById(16908290);
    }

    public b0(Dialog dialog) {
        new ArrayList();
        this.f10221m = new ArrayList<>();
        this.f10222o = 0;
        this.f10223p = true;
        this.f10226s = true;
        this.f10230w = new a();
        this.f10231x = new b();
        this.f10232y = new c();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z10) {
        v0 j2;
        v0 e10;
        long j10;
        if (z10) {
            if (!this.f10225r) {
                this.f10225r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f10225r) {
            this.f10225r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f10212d;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.g.c(actionBarContainer)) {
            if (z10) {
                e10 = this.f10213e.j(100L, 4);
                j2 = this.f10214f.e(200L, 0);
            } else {
                j2 = this.f10213e.j(200L, 0);
                e10 = this.f10214f.e(100L, 8);
            }
            i.g gVar = new i.g();
            ArrayList<v0> arrayList = gVar.f11664a;
            arrayList.add(e10);
            View view = e10.f217a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = j2.f217a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(j2);
            gVar.b();
        } else if (z10) {
            this.f10213e.k(4);
            this.f10214f.setVisibility(0);
        } else {
            this.f10213e.k(0);
            this.f10214f.setVisibility(8);
        }
    }

    public final void b(boolean z10) {
        if (z10 == this.f10220l) {
            return;
        }
        this.f10220l = z10;
        ArrayList<a.b> arrayList = this.f10221m;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    public final Context c() {
        if (this.f10211b == null) {
            TypedValue typedValue = new TypedValue();
            this.f10210a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f10211b = new ContextThemeWrapper(this.f10210a, i10);
            } else {
                this.f10211b = this.f10210a;
            }
        }
        return this.f10211b;
    }

    public final void d(View view) {
        String str;
        i0 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof i0) {
            wrapper = (i0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f10213e = wrapper;
        this.f10214f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f10212d = actionBarContainer;
        i0 i0Var = this.f10213e;
        if (i0Var != null && this.f10214f != null && actionBarContainer != null) {
            this.f10210a = i0Var.f();
            if ((this.f10213e.p() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f10216h = true;
            }
            Context context = this.f10210a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f10213e.l();
            f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f10210a.obtainStyledAttributes(null, a1.b.f35k, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.f720p) {
                    this.f10229v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f10212d;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void e(boolean z10) {
        int i10;
        if (!this.f10216h) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            int p10 = this.f10213e.p();
            this.f10216h = true;
            this.f10213e.n((i10 & 4) | (p10 & (-5)));
        }
    }

    public final void f(boolean z10) {
        this.n = z10;
        if (!z10) {
            this.f10213e.o();
            this.f10212d.setTabContainer(null);
        } else {
            this.f10212d.setTabContainer(null);
            this.f10213e.o();
        }
        this.f10213e.r();
        i0 i0Var = this.f10213e;
        boolean z11 = this.n;
        i0Var.u(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        boolean z12 = this.n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z10) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        boolean z12 = this.f10224q;
        if (this.f10225r || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f10215g;
        final c cVar = this.f10232y;
        if (z11) {
            if (!this.f10226s) {
                this.f10226s = true;
                i.g gVar = this.f10227t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f10212d.setVisibility(0);
                int i10 = this.f10222o;
                b bVar = this.f10231x;
                if (i10 == 0 && (this.f10228u || z10)) {
                    this.f10212d.setTranslationY(0.0f);
                    float f10 = -this.f10212d.getHeight();
                    if (z10) {
                        this.f10212d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    this.f10212d.setTranslationY(f10);
                    i.g gVar2 = new i.g();
                    v0 a10 = j0.a(this.f10212d);
                    a10.e(0.0f);
                    final View view2 = a10.f217a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: a3.t0

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ x0 f214a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) d.b0.this.f10212d.getParent()).invalidate();
                                }
                            };
                        }
                        v0.a.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z13 = gVar2.f11667e;
                    ArrayList<v0> arrayList = gVar2.f11664a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f10223p && view != null) {
                        view.setTranslationY(f10);
                        v0 a11 = j0.a(view);
                        a11.e(0.0f);
                        if (!gVar2.f11667e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z14 = gVar2.f11667e;
                    if (!z14) {
                        gVar2.c = decelerateInterpolator;
                    }
                    if (!z14) {
                        gVar2.f11665b = 250L;
                    }
                    if (!z14) {
                        gVar2.f11666d = bVar;
                    }
                    this.f10227t = gVar2;
                    gVar2.b();
                } else {
                    this.f10212d.setAlpha(1.0f);
                    this.f10212d.setTranslationY(0.0f);
                    if (this.f10223p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f10226s) {
            this.f10226s = false;
            i.g gVar3 = this.f10227t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i11 = this.f10222o;
            a aVar = this.f10230w;
            if (i11 == 0 && (this.f10228u || z10)) {
                this.f10212d.setAlpha(1.0f);
                this.f10212d.setTransitioning(true);
                i.g gVar4 = new i.g();
                float f11 = -this.f10212d.getHeight();
                if (z10) {
                    this.f10212d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                v0 a12 = j0.a(this.f10212d);
                a12.e(f11);
                final View view3 = a12.f217a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: a3.t0

                            /* renamed from: a  reason: collision with root package name */
                            public final /* synthetic */ x0 f214a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) d.b0.this.f10212d.getParent()).invalidate();
                            }
                        };
                    }
                    v0.a.a(view3.animate(), animatorUpdateListener);
                }
                boolean z15 = gVar4.f11667e;
                ArrayList<v0> arrayList2 = gVar4.f11664a;
                if (!z15) {
                    arrayList2.add(a12);
                }
                if (this.f10223p && view != null) {
                    v0 a13 = j0.a(view);
                    a13.e(f11);
                    if (!gVar4.f11667e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f10209z;
                boolean z16 = gVar4.f11667e;
                if (!z16) {
                    gVar4.c = accelerateInterpolator;
                }
                if (!z16) {
                    gVar4.f11665b = 250L;
                }
                if (!z16) {
                    gVar4.f11666d = aVar;
                }
                this.f10227t = gVar4;
                gVar4.b();
                return;
            }
            aVar.a();
        }
    }
}
