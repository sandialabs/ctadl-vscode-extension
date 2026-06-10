package com.noto.app.note;

import a3.d1;
import a7.g0;
import a7.h0;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.R;
import com.noto.app.note.NotePagerFragment;
import com.noto.app.note.NotePagerViewModel;
import com.noto.app.util.ViewUtilsKt;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import s6.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NotePagerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NotePagerFragment extends Fragment {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f9109i0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f9110d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NotePagerFragment$special$$inlined$viewModel$default$1(this, new NotePagerFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.navigation.f f9111e0 = new androidx.navigation.f(v7.i.a(h0.class), new NotePagerFragment$special$$inlined$navArgs$1(this));

    /* renamed from: f0  reason: collision with root package name */
    public final m7.e f9112f0 = kotlin.a.b(new NotePagerFragment$windowInsetsController$2(this));

    /* renamed from: g0  reason: collision with root package name */
    public final m7.e f9113g0 = kotlin.a.b(new NotePagerFragment$notificationManager$2(this));

    /* renamed from: h0  reason: collision with root package name */
    public FragmentStateAdapter f9114h0;

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f9118a;

        public a(u7.l lVar) {
            this.f9118a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f9118a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f9118a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return v7.g.a(this.f9118a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f9118a.hashCode();
        }
    }

    public final h0 Z() {
        return (h0) this.f9111e0.getValue();
    }

    public final NotePagerViewModel a0() {
        return (NotePagerViewModel) this.f9110d0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        androidx.navigation.i d5;
        d0 a10;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_pager_fragment, viewGroup, false);
        int i10 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) a1.b.O(inflate, R.id.abl);
        if (appBarLayout != null) {
            i10 = R.id.bab;
            BottomAppBar bottomAppBar = (BottomAppBar) a1.b.O(inflate, R.id.bab);
            if (bottomAppBar != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                FloatingActionButton floatingActionButton = (FloatingActionButton) a1.b.O(inflate, R.id.fab);
                if (floatingActionButton != null) {
                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) a1.b.O(inflate, R.id.fab_next);
                    if (floatingActionButton2 != null) {
                        FloatingActionButton floatingActionButton3 = (FloatingActionButton) a1.b.O(inflate, R.id.fab_previous);
                        if (floatingActionButton3 != null) {
                            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                                MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                if (materialToolbar != null) {
                                    ViewPager2 viewPager2 = (ViewPager2) a1.b.O(inflate, R.id.vp);
                                    if (viewPager2 != null) {
                                        k0 k0Var = new k0(coordinatorLayout, appBarLayout, bottomAppBar, floatingActionButton, floatingActionButton2, floatingActionButton3, materialToolbar, viewPager2);
                                        f7.c.e(this);
                                        appBarLayout.bringToFront();
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NotePagerFragment$setupState$1(k0Var, this, null), a0().f9140h), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a0().f9141i, a1.b.m(a0().n), new NotePagerFragment$setupState$2(k0Var, this, null)), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NotePagerFragment$setupState$3(this, null), a0().f9142j), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NotePagerFragment$setupState$4(this, null), a0().f9143k), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NotePagerFragment$setupState$5(this, null), a0().f9144l), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NotePagerFragment$setupState$6(this, null), a0().f9145m), ma.i.z(this));
                                        NavController g10 = ViewUtilsKt.g(this);
                                        if (g10 != null && (d5 = g10.d()) != null && (a10 = d5.a()) != null) {
                                            a10.c("ScrollPosition").d(r(), new a(new NotePagerFragment$setupState$7(k0Var, this)));
                                        }
                                        s c = c();
                                        if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                                            a1.b.j(onBackPressedDispatcher, null, new NotePagerFragment$setupListeners$1(this), 3);
                                        }
                                        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a7.d0

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NotePagerFragment f280j;

                                            {
                                                this.f280j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                NotePagerFragment notePagerFragment = this.f280j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NavController g11 = ViewUtilsKt.g(notePagerFragment);
                                                        if (g11 != null) {
                                                            g11.j();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        int i13 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NotePagerViewModel a02 = notePagerFragment.a0();
                                                        kotlinx.coroutines.flow.m mVar = a02.f9141i;
                                                        StateFlowImpl stateFlowImpl = a02.n;
                                                        Long l2 = (Long) kotlin.collections.c.q2(((List) mVar.getValue()).indexOf(a1.b.m(stateFlowImpl).getValue()) - 1, (List) mVar.getValue());
                                                        if (l2 != null) {
                                                            stateFlowImpl.setValue(l2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        materialToolbar.setOnClickListener(new View.OnClickListener(this) { // from class: a7.e0

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NotePagerFragment f284j;

                                            {
                                                this.f284j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                androidx.navigation.i d10;
                                                androidx.lifecycle.d0 a11;
                                                int i11 = r2;
                                                NotePagerFragment notePagerFragment = this.f284j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NavController g11 = ViewUtilsKt.g(notePagerFragment);
                                                        if (g11 != null && (d10 = g11.d()) != null && (a11 = d10.a()) != null) {
                                                            a11.e(0, "click_listener");
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        int i13 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NotePagerViewModel a02 = notePagerFragment.a0();
                                                        kotlinx.coroutines.flow.m mVar = a02.f9141i;
                                                        StateFlowImpl stateFlowImpl = a02.n;
                                                        Long l2 = (Long) kotlin.collections.c.q2(((List) mVar.getValue()).indexOf(a1.b.m(stateFlowImpl).getValue()) + 1, (List) mVar.getValue());
                                                        if (l2 != null) {
                                                            stateFlowImpl.setValue(l2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        viewPager2.f6121k.f6148a.add(new g0(k0Var, this));
                                        floatingActionButton.setOnClickListener(new g(2, this));
                                        floatingActionButton3.setOnClickListener(new View.OnClickListener(this) { // from class: a7.d0

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NotePagerFragment f280j;

                                            {
                                                this.f280j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                NotePagerFragment notePagerFragment = this.f280j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NavController g11 = ViewUtilsKt.g(notePagerFragment);
                                                        if (g11 != null) {
                                                            g11.j();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        int i13 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NotePagerViewModel a02 = notePagerFragment.a0();
                                                        kotlinx.coroutines.flow.m mVar = a02.f9141i;
                                                        StateFlowImpl stateFlowImpl = a02.n;
                                                        Long l2 = (Long) kotlin.collections.c.q2(((List) mVar.getValue()).indexOf(a1.b.m(stateFlowImpl).getValue()) - 1, (List) mVar.getValue());
                                                        if (l2 != null) {
                                                            stateFlowImpl.setValue(l2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        floatingActionButton2.setOnClickListener(new View.OnClickListener(this) { // from class: a7.e0

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ NotePagerFragment f284j;

                                            {
                                                this.f284j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                androidx.navigation.i d10;
                                                androidx.lifecycle.d0 a11;
                                                int i11 = r2;
                                                NotePagerFragment notePagerFragment = this.f284j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NavController g11 = ViewUtilsKt.g(notePagerFragment);
                                                        if (g11 != null && (d10 = g11.d()) != null && (a11 = d10.a()) != null) {
                                                            a11.e(0, "click_listener");
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        int i13 = NotePagerFragment.f9109i0;
                                                        v7.g.f(notePagerFragment, "this$0");
                                                        NotePagerViewModel a02 = notePagerFragment.a0();
                                                        kotlinx.coroutines.flow.m mVar = a02.f9141i;
                                                        StateFlowImpl stateFlowImpl = a02.n;
                                                        Long l2 = (Long) kotlin.collections.c.q2(((List) mVar.getValue()).indexOf(a1.b.m(stateFlowImpl).getValue()) + 1, (List) mVar.getValue());
                                                        if (l2 != null) {
                                                            stateFlowImpl.setValue(l2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        floatingActionButton3.setOnLongClickListener(new View.OnLongClickListener() { // from class: a7.f0
                                            @Override // android.view.View.OnLongClickListener
                                            public final boolean onLongClick(View view) {
                                                int i11 = NotePagerFragment.f9109i0;
                                                NotePagerFragment notePagerFragment = NotePagerFragment.this;
                                                v7.g.f(notePagerFragment, "this$0");
                                                FragmentStateAdapter fragmentStateAdapter = notePagerFragment.f9114h0;
                                                if (fragmentStateAdapter != null) {
                                                    fragmentStateAdapter.u(0);
                                                }
                                                NotePagerViewModel a02 = notePagerFragment.a0();
                                                a02.n.setValue(kotlin.collections.c.n2((List) a02.f9141i.getValue()));
                                                return true;
                                            }
                                        });
                                        floatingActionButton2.setOnLongClickListener(new x6.g0(1, this));
                                        v7.g.e(coordinatorLayout, "root");
                                        return coordinatorLayout;
                                    }
                                    i10 = R.id.vp;
                                } else {
                                    i10 = R.id.tb;
                                }
                            } else {
                                i10 = R.id.ll;
                            }
                        } else {
                            i10 = R.id.fab_previous;
                        }
                    } else {
                        i10 = R.id.fab_next;
                    }
                } else {
                    i10 = R.id.fab;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void z() {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        boolean isNotificationPolicyAccessGranted;
        Window window3;
        this.K = true;
        d1 d1Var = (d1) this.f9112f0.getValue();
        if (d1Var != null) {
            d1Var.f169a.f(7);
        }
        s c = c();
        if (c != null && (window3 = c.getWindow()) != null) {
            window3.clearFlags(128);
        }
        s c10 = c();
        WindowManager.LayoutParams layoutParams = null;
        if (c10 != null) {
            window = c10.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            s c11 = c();
            if (c11 != null && (window2 = c11.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
                attributes.screenBrightness = -1.0f;
                layoutParams = attributes;
            }
            window.setAttributes(layoutParams);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            m7.e eVar = this.f9113g0;
            isNotificationPolicyAccessGranted = ((NotificationManager) eVar.getValue()).isNotificationPolicyAccessGranted();
            if (isNotificationPolicyAccessGranted) {
                ((NotificationManager) eVar.getValue()).setInterruptionFilter(1);
            }
        }
    }
}
