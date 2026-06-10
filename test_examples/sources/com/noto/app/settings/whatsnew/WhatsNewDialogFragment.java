package com.noto.app.settings.whatsnew;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.noto.R;
import com.noto.app.settings.c;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.s0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/whatsnew/WhatsNewDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WhatsNewDialogFragment extends b {

    /* renamed from: u0  reason: collision with root package name */
    public final e f9799u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f9800v0;

    public WhatsNewDialogFragment() {
        super(false, 1, null);
        this.f9799u0 = a.a(LazyThreadSafetyMode.SYNCHRONIZED, new WhatsNewDialogFragment$special$$inlined$viewModel$default$1(this));
        this.f9800v0 = a.b(new WhatsNewDialogFragment$currentRelease$2(this));
    }

    public static void g0(WhatsNewDialogFragment whatsNewDialogFragment) {
        g.f(whatsNewDialogFragment, "this$0");
        ((c) whatsNewDialogFragment.f9799u0.getValue()).q().O(new WhatsNewDialogFragment$setupListeners$1$1(whatsNewDialogFragment));
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        g.f(dialogInterface, "dialog");
        ((c) this.f9799u0.getValue()).q();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.whats_new_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_okay;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_okay);
        if (materialButton != null) {
            i10 = R.id.rv;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
            if (epoxyRecyclerView != null) {
                i10 = R.id.tb;
                View O = a1.b.O(inflate, R.id.tb);
                if (O != null) {
                    s6.c a10 = s6.c.a(O);
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    s0 s0Var = new s0(linearLayout, materialButton, epoxyRecyclerView, a10);
                    epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                    epoxyRecyclerView.setItemAnimator(f7.c.a());
                    j();
                    epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                    Context j2 = j();
                    if (j2 != null) {
                        str = q.f(j2, R.string.whats_new, new Object[0]);
                    } else {
                        str = null;
                    }
                    a10.c.setText(str);
                    epoxyRecyclerView.p0(new WhatsNewDialogFragment$setupState$1(this));
                    f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new WhatsNewDialogFragment$setupState$2(s0Var, null), ViewUtilsKt.l(epoxyRecyclerView)), i.z(this));
                    materialButton.setOnClickListener(new o6.c(9, this));
                    g.e(linearLayout, "root");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
