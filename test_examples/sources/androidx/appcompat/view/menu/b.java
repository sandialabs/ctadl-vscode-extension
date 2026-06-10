package androidx.appcompat.view.menu;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s;
import com.noto.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends j.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public int B;
    public int C;
    public boolean E;
    public j.a F;
    public ViewTreeObserver G;
    public PopupWindow.OnDismissListener H;
    public boolean I;

    /* renamed from: j  reason: collision with root package name */
    public final Context f575j;

    /* renamed from: k  reason: collision with root package name */
    public final int f576k;

    /* renamed from: l  reason: collision with root package name */
    public final int f577l;

    /* renamed from: m  reason: collision with root package name */
    public final int f578m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f579o;

    /* renamed from: w  reason: collision with root package name */
    public View f587w;

    /* renamed from: x  reason: collision with root package name */
    public View f588x;

    /* renamed from: y  reason: collision with root package name */
    public int f589y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f590z;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f580p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f581q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final a f582r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC0007b f583s = new View$OnAttachStateChangeListenerC0007b();

    /* renamed from: t  reason: collision with root package name */
    public final c f584t = new c();

    /* renamed from: u  reason: collision with root package name */
    public int f585u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f586v = 0;
    public boolean D = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.c()) {
                ArrayList arrayList = bVar.f581q;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f594a.G) {
                    View view = bVar.f588x;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).f594a.a();
                        }
                        return;
                    }
                    bVar.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0007b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0007b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.G = view.getViewTreeObserver();
                }
                bVar.G.removeGlobalOnLayoutListener(bVar.f582r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements q0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.q0
        public final void b(f fVar, MenuItem menuItem) {
            b.this.f579o.removeCallbacksAndMessages(fVar);
        }

        @Override // androidx.appcompat.widget.q0
        public final void e(f fVar, h hVar) {
            b bVar = b.this;
            bVar.f579o.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.f581q;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i10)).f595b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            bVar.f579o.postAtTime(new androidx.appcompat.view.menu.c(this, i11 < arrayList.size() ? (d) arrayList.get(i11) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final r0 f594a;

        /* renamed from: b  reason: collision with root package name */
        public final f f595b;
        public final int c;

        public d(r0 r0Var, f fVar, int i10) {
            this.f594a = r0Var;
            this.f595b = fVar;
            this.c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f575j = context;
        this.f587w = view;
        this.f577l = i10;
        this.f578m = i11;
        this.n = z10;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(view) != 1) {
            i12 = 1;
        }
        this.f589y = i12;
        Resources resources = context.getResources();
        this.f576k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f579o = new Handler();
    }

    @Override // j.f
    public final void a() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.f580p;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((f) it.next());
        }
        arrayList.clear();
        View view = this.f587w;
        this.f588x = view;
        if (view != null) {
            boolean z10 = this.G == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.G = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f582r);
            }
            this.f588x.addOnAttachStateChangeListener(this.f583s);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f581q;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (fVar == ((d) arrayList.get(i11)).f595b) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((d) arrayList.get(i12)).f595b.c(false);
        }
        d dVar = (d) arrayList.remove(i11);
        dVar.f595b.r(this);
        boolean z11 = this.I;
        r0 r0Var = dVar.f594a;
        if (z11) {
            if (Build.VERSION.SDK_INT >= 23) {
                r0.a.b(r0Var.H, null);
            } else {
                r0Var.getClass();
            }
            r0Var.H.setAnimationStyle(0);
        }
        r0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i10 = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.f587w;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.e.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f589y = i10;
        if (size2 == 0) {
            dismiss();
            j.a aVar = this.F;
            if (aVar != null) {
                aVar.b(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.G;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.G.removeGlobalOnLayoutListener(this.f582r);
                }
                this.G = null;
            }
            this.f588x.removeOnAttachStateChangeListener(this.f583s);
            this.H.onDismiss();
        } else if (z10) {
            ((d) arrayList.get(0)).f595b.c(false);
        }
    }

    @Override // j.f
    public final boolean c() {
        ArrayList arrayList = this.f581q;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f594a.c();
    }

    @Override // j.f
    public final void dismiss() {
        ArrayList arrayList = this.f581q;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f594a.c()) {
                dVar.f594a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f() {
        Iterator it = this.f581q.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f594a.f1067k.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.f
    public final k0 g() {
        ArrayList arrayList = this.f581q;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f594a.f1067k;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean h(m mVar) {
        Iterator it = this.f581q.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f595b) {
                dVar.f594a.f1067k.requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            l(mVar);
            j.a aVar = this.F;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(j.a aVar) {
        this.F = aVar;
    }

    @Override // j.d
    public final void l(f fVar) {
        fVar.b(this, this.f575j);
        if (c()) {
            v(fVar);
        } else {
            this.f580p.add(fVar);
        }
    }

    @Override // j.d
    public final void n(View view) {
        if (this.f587w != view) {
            this.f587w = view;
            int i10 = this.f585u;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            this.f586v = Gravity.getAbsoluteGravity(i10, j0.e.d(view));
        }
    }

    @Override // j.d
    public final void o(boolean z10) {
        this.D = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f581q;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f594a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f595b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.d
    public final void p(int i10) {
        if (this.f585u != i10) {
            this.f585u = i10;
            View view = this.f587w;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            this.f586v = Gravity.getAbsoluteGravity(i10, j0.e.d(view));
        }
    }

    @Override // j.d
    public final void q(int i10) {
        this.f590z = true;
        this.B = i10;
    }

    @Override // j.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // j.d
    public final void s(boolean z10) {
        this.E = z10;
    }

    @Override // j.d
    public final void t(int i10) {
        this.A = true;
        this.C = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
        if ((r11[0] - r5) < 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f fVar) {
        View view;
        d dVar;
        Rect rect;
        int i10;
        boolean z10;
        char c10;
        int i11;
        int i12;
        int width;
        MenuItem menuItem;
        e eVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.f575j;
        LayoutInflater from = LayoutInflater.from(context);
        e eVar2 = new e(fVar, from, this.n, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.D) {
            eVar2.f609k = true;
        } else if (c()) {
            eVar2.f609k = j.d.u(fVar);
        }
        int m10 = j.d.m(eVar2, context, this.f576k);
        r0 r0Var = new r0(context, this.f577l, this.f578m);
        r0Var.L = this.f584t;
        r0Var.f1079x = this;
        s sVar = r0Var.H;
        sVar.setOnDismissListener(this);
        r0Var.f1078w = this.f587w;
        r0Var.f1075t = this.f586v;
        r0Var.G = true;
        sVar.setFocusable(true);
        sVar.setInputMethodMode(2);
        r0Var.p(eVar2);
        r0Var.r(m10);
        r0Var.f1075t = this.f586v;
        ArrayList arrayList = this.f581q;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            f fVar2 = dVar.f595b;
            int size = fVar2.size();
            int i14 = 0;
            while (true) {
                if (i14 < size) {
                    menuItem = fVar2.getItem(i14);
                    if (menuItem.hasSubMenu() && fVar == menuItem.getSubMenu()) {
                        break;
                    }
                    i14++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                k0 k0Var = dVar.f594a.f1067k;
                ListAdapter adapter = k0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i13 = 0;
                }
                int count = eVar.getCount();
                int i15 = 0;
                while (true) {
                    if (i15 < count) {
                        if (menuItem == eVar.getItem(i15)) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                if (i15 != -1 && (firstVisiblePosition = (i15 + i13) - k0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < k0Var.getChildCount()) {
                    view = k0Var.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            dVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = r0.M;
                if (method != null) {
                    try {
                        method.invoke(sVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                r0.b.a(sVar, false);
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 23) {
                r0.a.a(sVar, null);
            }
            k0 k0Var2 = ((d) arrayList.get(arrayList.size() - 1)).f594a.f1067k;
            int[] iArr = new int[2];
            k0Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f588x.getWindowVisibleDisplayFrame(rect2);
            if (this.f589y == 1) {
                if (k0Var2.getWidth() + iArr[0] + m10 > rect2.right) {
                    i10 = 0;
                }
                i10 = 1;
            }
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f589y = i10;
            if (i16 >= 26) {
                r0Var.f1078w = view;
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f587w.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f586v & 7) == 5) {
                    c10 = 0;
                    iArr2[0] = this.f587w.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c10 = 0;
                }
                i11 = iArr3[c10] - iArr2[c10];
                i12 = iArr3[1] - iArr2[1];
            }
            if ((this.f586v & 5) == 5) {
                if (z10) {
                    width = i11 + m10;
                    r0Var.n = width;
                    r0Var.f1074s = true;
                    r0Var.f1073r = true;
                    r0Var.j(i12);
                } else {
                    m10 = view.getWidth();
                    width = i11 - m10;
                    r0Var.n = width;
                    r0Var.f1074s = true;
                    r0Var.f1073r = true;
                    r0Var.j(i12);
                }
            } else {
                if (z10) {
                    width = i11 + view.getWidth();
                    r0Var.n = width;
                    r0Var.f1074s = true;
                    r0Var.f1073r = true;
                    r0Var.j(i12);
                }
                width = i11 - m10;
                r0Var.n = width;
                r0Var.f1074s = true;
                r0Var.f1073r = true;
                r0Var.j(i12);
            }
        } else {
            if (this.f590z) {
                r0Var.n = this.B;
            }
            if (this.A) {
                r0Var.j(this.C);
            }
            Rect rect3 = this.f12618i;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            r0Var.F = rect;
        }
        arrayList.add(new d(r0Var, fVar, this.f589y));
        r0Var.a();
        k0 k0Var3 = r0Var.f1067k;
        k0Var3.setOnKeyListener(this);
        if (dVar == null && this.E && fVar.f624m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) k0Var3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(fVar.f624m);
            k0Var3.addHeaderView(frameLayout, null, false);
            r0Var.a();
        }
    }
}
