package com.noto.app.filtered;

import a1.b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.navigation.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ModelUtilsKt$asSearchFlow$$inlined$map$1;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.c;
import f7.q;
import f7.y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.m;
import m7.e;
import u7.s;
import v7.g;
import v7.i;
import w6.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/filtered/FilteredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FilteredFragment extends Fragment {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f8233f0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f8234d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FilteredFragment$special$$inlined$viewModel$default$1(this, new FilteredFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final f f8235e0 = new f(i.a(l.class), new FilteredFragment$special$$inlined$navArgs$1(this));

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f8239a;

        public a(u7.l lVar) {
            this.f8239a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f8239a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f8239a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return g.a(this.f8239a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8239a.hashCode();
        }
    }

    public final FilteredViewModel Z() {
        return (FilteredViewModel) this.f8234d0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0358  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Typeface typeface;
        NavController g10;
        d0 d0Var;
        int ordinal;
        m m10;
        m e10;
        m mVar;
        m m11;
        s filteredFragment$setupState$2;
        Context j2;
        String str;
        Context j10;
        String str2;
        d0 d0Var2;
        androidx.fragment.app.s c;
        OnBackPressedDispatcher onBackPressedDispatcher;
        androidx.navigation.i d5;
        int i10;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.filtered_fragment, viewGroup, false);
        int i11 = R.id.abl;
        if (((AppBarLayout) b.O(inflate, R.id.abl)) != null) {
            i11 = R.id.bab;
            BottomAppBar bottomAppBar = (BottomAppBar) b.O(inflate, R.id.bab);
            if (bottomAppBar != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                i11 = R.id.et_search;
                TextInputEditText textInputEditText = (TextInputEditText) b.O(inflate, R.id.et_search);
                if (textInputEditText != null) {
                    i11 = R.id.fab;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) b.O(inflate, R.id.fab);
                    if (floatingActionButton != null) {
                        i11 = R.id.rv;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) b.O(inflate, R.id.rv);
                        if (epoxyRecyclerView != null) {
                            i11 = R.id.tb;
                            MaterialToolbar materialToolbar = (MaterialToolbar) b.O(inflate, R.id.tb);
                            if (materialToolbar != null) {
                                i11 = R.id.til_search;
                                TextInputLayout textInputLayout = (TextInputLayout) b.O(inflate, R.id.til_search);
                                if (textInputLayout != null) {
                                    i11 = R.id.tv_notes_count;
                                    TickerView tickerView = (TickerView) b.O(inflate, R.id.tv_notes_count);
                                    if (tickerView != null) {
                                        i11 = R.id.tv_notes_count_rtl;
                                        MaterialTextView materialTextView = (MaterialTextView) b.O(inflate, R.id.tv_notes_count_rtl);
                                        if (materialTextView != null) {
                                            i11 = R.id.tv_title;
                                            MaterialTextView materialTextView2 = (MaterialTextView) b.O(inflate, R.id.tv_title);
                                            if (materialTextView2 != null) {
                                                s6.e eVar = new s6.e(coordinatorLayout, bottomAppBar, textInputEditText, floatingActionButton, epoxyRecyclerView, materialToolbar, textInputLayout, tickerView, materialTextView, materialTextView2);
                                                c.f(this);
                                                Context j11 = j();
                                                f fVar = this.f8235e0;
                                                if (j11 != null) {
                                                    materialTextView2.setTextColor(q.b(j11, q.j(((l) fVar.getValue()).f18456a.f8287j)));
                                                    floatingActionButton.setBackgroundTintList(q.h(q.b(j11, q.j(((l) fVar.getValue()).f18456a.f8287j))));
                                                    int ordinal2 = ((l) fVar.getValue()).f18456a.ordinal();
                                                    if (ordinal2 != 0) {
                                                        if (ordinal2 != 1) {
                                                            if (ordinal2 != 2) {
                                                                if (ordinal2 == 3) {
                                                                    i10 = R.string.archived;
                                                                } else {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                            } else {
                                                                i10 = R.string.scheduled;
                                                            }
                                                        } else {
                                                            i10 = R.string.recent;
                                                        }
                                                    } else {
                                                        i10 = R.string.all;
                                                    }
                                                    materialTextView2.setText(q.f(j11, i10, new Object[0]));
                                                }
                                                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                                epoxyRecyclerView.setItemAnimator(c.a());
                                                tickerView.setAnimationInterpolator(new AccelerateInterpolator());
                                                Context j12 = j();
                                                if (j12 != null) {
                                                    try {
                                                        typeface = p2.f.b(j12, R.font.nunito_semibold);
                                                    } catch (Throwable unused) {
                                                    }
                                                    tickerView.setTypeface(typeface);
                                                    RecyclerView.l layoutManager = epoxyRecyclerView.getLayoutManager();
                                                    g.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                                    g10 = ViewUtilsKt.g(this);
                                                    if (g10 == null && (d5 = g10.d()) != null) {
                                                        d0Var = d5.a();
                                                    } else {
                                                        d0Var = null;
                                                    }
                                                    ordinal = ((l) fVar.getValue()).f18456a.ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal != 1 && ordinal != 2) {
                                                            if (ordinal != 3) {
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$4(this, eVar, null), b.m(Z().f8298o)), ma.i.z(this));
                                                                CallbackFlowBuilder x3 = ViewUtilsKt.x(textInputEditText, false);
                                                                int i12 = ModelUtilsKt.f9848a;
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$5(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x3))), ma.i.z(this));
                                                                MenuItem findItem = bottomAppBar.getMenu().findItem(R.id.change_visibility);
                                                                j2 = j();
                                                                if (j2 == null) {
                                                                }
                                                                j10 = j();
                                                                if (j10 == null) {
                                                                }
                                                                d0Var2 = d0Var;
                                                                String str3 = str2;
                                                                String str4 = str;
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$6(findItem, this, str3, str4, null), Z().e()), ma.i.z(this));
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$7(findItem, this, str3, str4, null), Z().d()), ma.i.z(this));
                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().f8300q, Z().f8301r, new FilteredFragment$setupState$8(linearLayoutManager, eVar, null)), ma.i.z(this));
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$9(linearLayoutManager, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                                g.e(coordinatorLayout, "root");
                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$10(eVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                                if (d0Var2 != null) {
                                                                }
                                                                if (!ViewUtilsKt.i()) {
                                                                }
                                                                materialToolbar.setOnClickListener(new h6.b(3, eVar));
                                                                floatingActionButton.setOnClickListener(new z5.a(1, this));
                                                                bottomAppBar.setNavigationOnClickListener(new o6.c(1, this));
                                                                bottomAppBar.setOnMenuItemClickListener(new w6.a(0, this));
                                                                bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new w6.b(this))));
                                                                c = c();
                                                                if (c != null) {
                                                                    b.j(onBackPressedDispatcher, null, new FilteredFragment$setupListeners$6(this), 3);
                                                                }
                                                                CoordinatorLayout coordinatorLayout2 = eVar.f17326a;
                                                                g.e(coordinatorLayout2, "root");
                                                                return coordinatorLayout2;
                                                            }
                                                        } else {
                                                            m10 = b.m(Z().f8295k);
                                                            e10 = Z().d();
                                                            mVar = Z().n;
                                                            m11 = b.m(Z().f8299p);
                                                            filteredFragment$setupState$2 = new FilteredFragment$setupState$3(this, eVar, null);
                                                            kotlinx.coroutines.flow.f.b(b.A(m10, e10, mVar, m11, filteredFragment$setupState$2), ma.i.z(this));
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$4(this, eVar, null), b.m(Z().f8298o)), ma.i.z(this));
                                                            CallbackFlowBuilder x32 = ViewUtilsKt.x(textInputEditText, false);
                                                            int i122 = ModelUtilsKt.f9848a;
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$5(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x32))), ma.i.z(this));
                                                            MenuItem findItem2 = bottomAppBar.getMenu().findItem(R.id.change_visibility);
                                                            j2 = j();
                                                            if (j2 == null) {
                                                                str = q.f(j2, R.string.expand, new Object[0]);
                                                            } else {
                                                                str = null;
                                                            }
                                                            j10 = j();
                                                            if (j10 == null) {
                                                                str2 = q.f(j10, R.string.collapse, new Object[0]);
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            d0Var2 = d0Var;
                                                            String str32 = str2;
                                                            String str42 = str;
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$6(findItem2, this, str32, str42, null), Z().e()), ma.i.z(this));
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$7(findItem2, this, str32, str42, null), Z().d()), ma.i.z(this));
                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().f8300q, Z().f8301r, new FilteredFragment$setupState$8(linearLayoutManager, eVar, null)), ma.i.z(this));
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$9(linearLayoutManager, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                            g.e(coordinatorLayout, "root");
                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$10(eVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                            if (d0Var2 != null) {
                                                                d0Var2.c("folder_id").d(r(), new a(new FilteredFragment$setupState$11(this, d0Var2)));
                                                            }
                                                            if (!ViewUtilsKt.i()) {
                                                                tickerView.setVisibility(8);
                                                                materialTextView.setVisibility(0);
                                                            } else {
                                                                tickerView.setVisibility(0);
                                                                materialTextView.setVisibility(8);
                                                            }
                                                            materialToolbar.setOnClickListener(new h6.b(3, eVar));
                                                            floatingActionButton.setOnClickListener(new z5.a(1, this));
                                                            bottomAppBar.setNavigationOnClickListener(new o6.c(1, this));
                                                            bottomAppBar.setOnMenuItemClickListener(new w6.a(0, this));
                                                            bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new w6.b(this))));
                                                            c = c();
                                                            if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                                                                b.j(onBackPressedDispatcher, null, new FilteredFragment$setupListeners$6(this), 3);
                                                            }
                                                            CoordinatorLayout coordinatorLayout22 = eVar.f17326a;
                                                            g.e(coordinatorLayout22, "root");
                                                            return coordinatorLayout22;
                                                        }
                                                    }
                                                    m10 = b.m(Z().f8294j);
                                                    e10 = Z().e();
                                                    mVar = Z().n;
                                                    m11 = b.m(Z().f8299p);
                                                    filteredFragment$setupState$2 = new FilteredFragment$setupState$2(this, eVar, null);
                                                    kotlinx.coroutines.flow.f.b(b.A(m10, e10, mVar, m11, filteredFragment$setupState$2), ma.i.z(this));
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$4(this, eVar, null), b.m(Z().f8298o)), ma.i.z(this));
                                                    CallbackFlowBuilder x322 = ViewUtilsKt.x(textInputEditText, false);
                                                    int i1222 = ModelUtilsKt.f9848a;
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$5(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x322))), ma.i.z(this));
                                                    MenuItem findItem22 = bottomAppBar.getMenu().findItem(R.id.change_visibility);
                                                    j2 = j();
                                                    if (j2 == null) {
                                                    }
                                                    j10 = j();
                                                    if (j10 == null) {
                                                    }
                                                    d0Var2 = d0Var;
                                                    String str322 = str2;
                                                    String str422 = str;
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$6(findItem22, this, str322, str422, null), Z().e()), ma.i.z(this));
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$7(findItem22, this, str322, str422, null), Z().d()), ma.i.z(this));
                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().f8300q, Z().f8301r, new FilteredFragment$setupState$8(linearLayoutManager, eVar, null)), ma.i.z(this));
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$9(linearLayoutManager, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                    g.e(coordinatorLayout, "root");
                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$10(eVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                    if (d0Var2 != null) {
                                                    }
                                                    if (!ViewUtilsKt.i()) {
                                                    }
                                                    materialToolbar.setOnClickListener(new h6.b(3, eVar));
                                                    floatingActionButton.setOnClickListener(new z5.a(1, this));
                                                    bottomAppBar.setNavigationOnClickListener(new o6.c(1, this));
                                                    bottomAppBar.setOnMenuItemClickListener(new w6.a(0, this));
                                                    bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new w6.b(this))));
                                                    c = c();
                                                    if (c != null) {
                                                    }
                                                    CoordinatorLayout coordinatorLayout222 = eVar.f17326a;
                                                    g.e(coordinatorLayout222, "root");
                                                    return coordinatorLayout222;
                                                }
                                                typeface = null;
                                                tickerView.setTypeface(typeface);
                                                RecyclerView.l layoutManager2 = epoxyRecyclerView.getLayoutManager();
                                                g.d(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
                                                g10 = ViewUtilsKt.g(this);
                                                if (g10 == null) {
                                                }
                                                d0Var = null;
                                                ordinal = ((l) fVar.getValue()).f18456a.ordinal();
                                                if (ordinal != 0) {
                                                }
                                                m10 = b.m(Z().f8294j);
                                                e10 = Z().e();
                                                mVar = Z().n;
                                                m11 = b.m(Z().f8299p);
                                                filteredFragment$setupState$2 = new FilteredFragment$setupState$2(this, eVar, null);
                                                kotlinx.coroutines.flow.f.b(b.A(m10, e10, mVar, m11, filteredFragment$setupState$2), ma.i.z(this));
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$4(this, eVar, null), b.m(Z().f8298o)), ma.i.z(this));
                                                CallbackFlowBuilder x3222 = ViewUtilsKt.x(textInputEditText, false);
                                                int i12222 = ModelUtilsKt.f9848a;
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$5(this, null), new ModelUtilsKt$asSearchFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(x3222))), ma.i.z(this));
                                                MenuItem findItem222 = bottomAppBar.getMenu().findItem(R.id.change_visibility);
                                                j2 = j();
                                                if (j2 == null) {
                                                }
                                                j10 = j();
                                                if (j10 == null) {
                                                }
                                                d0Var2 = d0Var;
                                                String str3222 = str2;
                                                String str4222 = str;
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$6(findItem222, this, str3222, str4222, null), Z().e()), ma.i.z(this));
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$7(findItem222, this, str3222, str4222, null), Z().d()), ma.i.z(this));
                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(Z().f8300q, Z().f8301r, new FilteredFragment$setupState$8(linearLayoutManager2, eVar, null)), ma.i.z(this));
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$9(linearLayoutManager2, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(epoxyRecyclerView))), ma.i.z(this));
                                                g.e(coordinatorLayout, "root");
                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FilteredFragment$setupState$10(eVar, null), ViewUtilsKt.m(coordinatorLayout)), ma.i.z(this));
                                                if (d0Var2 != null) {
                                                }
                                                if (!ViewUtilsKt.i()) {
                                                }
                                                materialToolbar.setOnClickListener(new h6.b(3, eVar));
                                                floatingActionButton.setOnClickListener(new z5.a(1, this));
                                                bottomAppBar.setNavigationOnClickListener(new o6.c(1, this));
                                                bottomAppBar.setOnMenuItemClickListener(new w6.a(0, this));
                                                bottomAppBar.setOnTouchListener(new y(new GestureDetector(bottomAppBar.getContext(), new w6.b(this))));
                                                c = c();
                                                if (c != null) {
                                                }
                                                CoordinatorLayout coordinatorLayout2222 = eVar.f17326a;
                                                g.e(coordinatorLayout2222, "root");
                                                return coordinatorLayout2222;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
