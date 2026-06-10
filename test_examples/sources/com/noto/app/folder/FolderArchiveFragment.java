package com.noto.app.folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/FolderArchiveFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderArchiveFragment extends Fragment {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f8310g0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f8311d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FolderArchiveFragment$special$$inlined$viewModel$default$1(this, new FolderArchiveFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.navigation.f f8312e0 = new androidx.navigation.f(v7.i.a(x6.c.class), new FolderArchiveFragment$special$$inlined$navArgs$1(this));

    /* renamed from: f0  reason: collision with root package name */
    public StaggeredGridLayoutManager f8313f0;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s c;
        OnBackPressedDispatcher onBackPressedDispatcher;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.folder_archive_fragment, viewGroup, false);
        int i10 = R.id.abl;
        if (((AppBarLayout) a1.b.O(inflate, R.id.abl)) != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
            if (epoxyRecyclerView != null) {
                MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                if (materialToolbar != null) {
                    TickerView tickerView = (TickerView) a1.b.O(inflate, R.id.tv_folder_notes_count);
                    if (tickerView != null) {
                        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_notes_count_rtl);
                        if (materialTextView != null) {
                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_title);
                            if (materialTextView2 != null) {
                                s6.g gVar = new s6.g(coordinatorLayout, epoxyRecyclerView, materialToolbar, tickerView, materialTextView, materialTextView2);
                                f7.c.f(this);
                                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                epoxyRecyclerView.setItemAnimator(f7.c.a());
                                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager();
                                epoxyRecyclerView.setLayoutManager(staggeredGridLayoutManager);
                                this.f8313f0 = staggeredGridLayoutManager;
                                m7.e eVar = this.f8311d0;
                                kotlinx.coroutines.flow.b flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderArchiveFragment$setupState$2(gVar, this, null), ((FolderViewModel) eVar.getValue()).k());
                                FolderArchiveFragment$setupState$3 folderArchiveFragment$setupState$3 = FolderArchiveFragment$setupState$3.f8324j;
                                u7.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f15243b;
                                if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 instanceof DistinctFlowImpl) {
                                    DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
                                    if (distinctFlowImpl.f15212j == folderArchiveFragment$setupState$3 && distinctFlowImpl.f15213k == pVar) {
                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderArchiveFragment$setupState$4(this, null), flowKt__TransformKt$onEach$$inlined$unsafeTransform$1), ma.i.z(this));
                                        kotlinx.coroutines.flow.f.b(a1.b.z(a1.b.m(((FolderViewModel) eVar.getValue()).n), ((FolderViewModel) eVar.getValue()).f8436p, ((FolderViewModel) eVar.getValue()).k(), new FolderArchiveFragment$setupState$5(gVar, this, null)), ma.i.z(this));
                                        if (!ViewUtilsKt.i()) {
                                            tickerView.setVisibility(8);
                                            materialTextView.setVisibility(0);
                                        } else {
                                            tickerView.setVisibility(0);
                                            materialTextView.setVisibility(8);
                                        }
                                        materialToolbar.setOnClickListener(new x6.n(1, gVar));
                                        materialToolbar.setNavigationOnClickListener(new o6.c(2, this));
                                        c = c();
                                        if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                                            a1.b.j(onBackPressedDispatcher, null, new FolderArchiveFragment$setupListeners$3(this), 3);
                                        }
                                        v7.g.e(coordinatorLayout, "root");
                                        return coordinatorLayout;
                                    }
                                }
                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new DistinctFlowImpl(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, folderArchiveFragment$setupState$3, pVar);
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FolderArchiveFragment$setupState$4(this, null), flowKt__TransformKt$onEach$$inlined$unsafeTransform$1), ma.i.z(this));
                                kotlinx.coroutines.flow.f.b(a1.b.z(a1.b.m(((FolderViewModel) eVar.getValue()).n), ((FolderViewModel) eVar.getValue()).f8436p, ((FolderViewModel) eVar.getValue()).k(), new FolderArchiveFragment$setupState$5(gVar, this, null)), ma.i.z(this));
                                if (!ViewUtilsKt.i()) {
                                }
                                materialToolbar.setOnClickListener(new x6.n(1, gVar));
                                materialToolbar.setNavigationOnClickListener(new o6.c(2, this));
                                c = c();
                                if (c != null) {
                                    a1.b.j(onBackPressedDispatcher, null, new FolderArchiveFragment$setupListeners$3(this), 3);
                                }
                                v7.g.e(coordinatorLayout, "root");
                                return coordinatorLayout;
                            }
                            i10 = R.id.tv_folder_title;
                        } else {
                            i10 = R.id.tv_folder_notes_count_rtl;
                        }
                    } else {
                        i10 = R.id.tv_folder_notes_count;
                    }
                } else {
                    i10 = R.id.tb;
                }
            } else {
                i10 = R.id.rv;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
