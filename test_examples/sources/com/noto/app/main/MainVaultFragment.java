package com.noto.app.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import m7.e;
import s6.w;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/MainVaultFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainVaultFragment extends o6.b {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f8890w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8891u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f8892v0;

    public MainVaultFragment() {
        super(true);
        this.f8891u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new MainVaultFragment$special$$inlined$viewModel$default$1(this));
        this.f8892v0 = kotlin.a.b(new MainVaultFragment$selectedDestinationId$2(this));
    }

    public static void g0(MainVaultFragment mainVaultFragment) {
        g.f(mainVaultFragment, "this$0");
        MainViewModel mainViewModel = (MainViewModel) mainVaultFragment.f8891u0.getValue();
        mainViewModel.getClass();
        m0.b.M0(a1.b.d0(mainViewModel), null, null, new MainViewModel$closeVault$1(mainViewModel, null), 3);
        NavController g10 = ViewUtilsKt.g(mainVaultFragment);
        if (g10 != null) {
            g10.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.R;
        if (layoutInflater2 == null) {
            layoutInflater2 = A(null);
            this.R = layoutInflater2;
        }
        View inflate = layoutInflater2.inflate(R.layout.main_vault_fragment, viewGroup, false);
        int i10 = R.id.btn_close;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_close);
        if (materialButton != null) {
            i10 = R.id.fl;
            if (((FrameLayout) a1.b.O(inflate, R.id.fl)) != null) {
                i10 = R.id.rv;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                if (epoxyRecyclerView != null) {
                    i10 = R.id.tb;
                    View O = a1.b.O(inflate, R.id.tb);
                    if (O != null) {
                        s6.c a10 = s6.c.a(O);
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        w wVar = new w(linearLayout, materialButton, epoxyRecyclerView, a10);
                        materialButton.setOnClickListener(new h6.b(7, this));
                        epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                        j();
                        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                        epoxyRecyclerView.setItemAnimator(f7.c.a());
                        Context j2 = j();
                        if (j2 != null) {
                            str = q.f(j2, R.string.folders_vault, new Object[0]);
                        } else {
                            str = null;
                        }
                        a10.c.setText(str);
                        e eVar = this.f8891u0;
                        f.b(new i(((MainViewModel) eVar.getValue()).f8912k, ((MainViewModel) eVar.getValue()).n, new MainVaultFragment$setupState$1(this, wVar, null)), ma.i.z(this));
                        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MainVaultFragment$setupState$2(wVar, null), ViewUtilsKt.l(epoxyRecyclerView)), ma.i.z(this));
                        g.e(linearLayout, "root");
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
