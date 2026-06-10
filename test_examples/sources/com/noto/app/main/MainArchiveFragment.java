package com.noto.app.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/main/MainArchiveFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainArchiveFragment extends o6.b {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f8823w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8824u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f8825v0;

    public MainArchiveFragment() {
        super(true);
        this.f8824u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new MainArchiveFragment$special$$inlined$viewModel$default$1(this));
        this.f8825v0 = kotlin.a.b(new MainArchiveFragment$selectedDestinationId$2(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.main_archive_fragment, viewGroup, false);
        int i10 = R.id.rv;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
        if (epoxyRecyclerView != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a10 = s6.c.a(O);
                LinearLayout linearLayout = (LinearLayout) inflate;
                w wVar = new w(linearLayout, epoxyRecyclerView, a10);
                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                j();
                epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                epoxyRecyclerView.setItemAnimator(f7.c.a());
                Context j2 = j();
                if (j2 != null) {
                    str = q.f(j2, R.string.folders_archive, new Object[0]);
                } else {
                    str = null;
                }
                a10.c.setText(str);
                e eVar = this.f8824u0;
                f.b(new i(((MainViewModel) eVar.getValue()).f8911j, ((MainViewModel) eVar.getValue()).n, new MainArchiveFragment$setupState$1(this, wVar, null)), ma.i.z(this));
                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MainArchiveFragment$setupState$2(wVar, null), ViewUtilsKt.l(epoxyRecyclerView)), ma.i.z(this));
                g.e(linearLayout, "root");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
