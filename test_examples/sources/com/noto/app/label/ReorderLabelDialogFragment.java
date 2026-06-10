package com.noto.app.label;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.navigation.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import s6.c;
import s6.w;
import v7.g;
import v7.i;
import y6.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/label/ReorderLabelDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReorderLabelDialogFragment extends o6.b {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f8777x0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8778u0;

    /* renamed from: v0  reason: collision with root package name */
    public final f f8779v0;

    /* renamed from: w0  reason: collision with root package name */
    public n f8780w0;

    public ReorderLabelDialogFragment() {
        super(false, 1, null);
        this.f8778u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ReorderLabelDialogFragment$special$$inlined$viewModel$default$1(this, new ReorderLabelDialogFragment$viewModel$2(this)));
        this.f8779v0 = new f(i.a(u.class), new ReorderLabelDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.reorder_label_dialog_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.rv;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
        if (epoxyRecyclerView != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                c a10 = c.a(O);
                w wVar = new w(linearLayout, epoxyRecyclerView, a10);
                j();
                epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                Context j2 = j();
                if (j2 != null) {
                    str = q.f(j2, R.string.labels_order, new Object[0]);
                } else {
                    str = null;
                }
                a10.c.setText(str);
                e eVar = this.f8778u0;
                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ReorderLabelDialogFragment$setupState$1(this, wVar, null), ((LabelViewModel) eVar.getValue()).f8753g), ma.i.z(this));
                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(((LabelViewModel) eVar.getValue()).f8753g, ((LabelViewModel) eVar.getValue()).f8754h, new ReorderLabelDialogFragment$setupState$2(this, wVar, null)), ma.i.z(this));
                g.e(linearLayout, "root");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
