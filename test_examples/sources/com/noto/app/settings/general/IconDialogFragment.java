package com.noto.app.settings.general;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.c;
import s6.r;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/general/IconDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IconDialogFragment extends b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f9745u0;

    public IconDialogFragment() {
        super(true);
        this.f9745u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new IconDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.icon_dialog_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.rv;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
        if (epoxyRecyclerView != null) {
            i10 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                c a10 = c.a(O);
                r rVar = new r(linearLayout, epoxyRecyclerView, a10);
                Context j2 = j();
                if (j2 != null) {
                    str = q.f(j2, R.string.icon, new Object[0]);
                } else {
                    str = null;
                }
                a10.c.setText(str);
                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                j();
                epoxyRecyclerView.setLayoutManager(new GridLayoutManager());
                epoxyRecyclerView.setItemAnimator(f7.c.a());
                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new IconDialogFragment$onCreateView$1$1(rVar, null), ViewUtilsKt.l(epoxyRecyclerView)), i.z(this));
                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new IconDialogFragment$onCreateView$1$2(rVar, this, null), ((com.noto.app.settings.c) this.f9745u0.getValue()).f9667l), i.z(this));
                g.e(linearLayout, "root");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
