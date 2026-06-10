package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r0 extends p0 implements q0 {
    public static final Method M;
    public q0 L;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends k0 {

        /* renamed from: u  reason: collision with root package name */
        public final int f1094u;

        /* renamed from: v  reason: collision with root package name */
        public final int f1095v;

        /* renamed from: w  reason: collision with root package name */
        public q0 f1096w;

        /* renamed from: x  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f1097x;

        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1094u = 21;
                this.f1095v = 22;
                return;
            }
            this.f1094u = 22;
            this.f1095v = 21;
        }

        @Override // androidx.appcompat.widget.k0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int i10;
            androidx.appcompat.view.menu.h hVar;
            int pointToPosition;
            int i11;
            if (this.f1096w != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < eVar.getCount()) {
                    hVar = eVar.getItem(i11);
                } else {
                    hVar = null;
                }
                androidx.appcompat.view.menu.h hVar2 = this.f1097x;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.f607i;
                    if (hVar2 != null) {
                        this.f1096w.b(fVar, hVar2);
                    }
                    this.f1097x = hVar;
                    if (hVar != null) {
                        this.f1096w.e(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1094u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i10 == this.f1095v) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((androidx.appcompat.view.menu.e) adapter).f607i.c(false);
                return true;
            } else {
                return super.onKeyDown(i10, keyEvent);
            }
        }

        public void setHoverListener(q0 q0Var) {
            this.f1096w = q0Var;
        }

        @Override // androidx.appcompat.widget.k0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public r0(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.q0
    public final void b(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        q0 q0Var = this.L;
        if (q0Var != null) {
            q0Var.b(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.q0
    public final void e(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        q0 q0Var = this.L;
        if (q0Var != null) {
            q0Var.e(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.p0
    public final k0 q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
