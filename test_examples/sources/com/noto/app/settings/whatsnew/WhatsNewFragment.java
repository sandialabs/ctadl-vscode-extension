package com.noto.app.settings.whatsnew;

import a1.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import f7.c;
import kotlin.Metadata;
import kotlin.a;
import m7.e;
import s6.t0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/whatsnew/WhatsNewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WhatsNewFragment extends Fragment {

    /* renamed from: e0  reason: collision with root package name */
    public static final /* synthetic */ int f9806e0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f9807d0 = a.b(new WhatsNewFragment$releases$2(this));

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.whats_new_fragment, viewGroup, false);
        int i10 = R.id.abl;
        if (((AppBarLayout) b.O(inflate, R.id.abl)) != null) {
            i10 = R.id.rv;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) b.O(inflate, R.id.rv);
            if (epoxyRecyclerView != null) {
                i10 = R.id.tb;
                MaterialToolbar materialToolbar = (MaterialToolbar) b.O(inflate, R.id.tb);
                if (materialToolbar != null) {
                    i10 = R.id.tv_more_details;
                    MaterialTextView materialTextView = (MaterialTextView) b.O(inflate, R.id.tv_more_details);
                    if (materialTextView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        t0 t0Var = new t0(coordinatorLayout, epoxyRecyclerView, materialToolbar, materialTextView);
                        c.f(this);
                        epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                        epoxyRecyclerView.setItemAnimator(c.a());
                        j();
                        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                        epoxyRecyclerView.p0(new WhatsNewFragment$setupState$1(this));
                        s c = c();
                        if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                            b.j(onBackPressedDispatcher, null, new WhatsNewFragment$setupListeners$1(this), 3);
                        }
                        materialTextView.setOnClickListener(new h6.b(12, this));
                        materialToolbar.setOnClickListener(new z5.a(4, t0Var));
                        materialToolbar.setNavigationOnClickListener(new o6.c(10, this));
                        g.e(coordinatorLayout, "root");
                        return coordinatorLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
