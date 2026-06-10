package com.noto.app.label;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.b0;
import com.airbnb.epoxy.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.w;
import t6.c;
import v7.g;
import y6.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ReorderLabelDialogFragment$setupItemTouchHelper$itemTouchHelperCallback$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ w f8784j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ReorderLabelDialogFragment f8785k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderLabelDialogFragment$setupItemTouchHelper$itemTouchHelperCallback$1(w wVar, ReorderLabelDialogFragment reorderLabelDialogFragment) {
        super(0);
        this.f8784j = wVar;
        this.f8785k = reorderLabelDialogFragment;
    }

    @Override // u7.a
    public final n k0() {
        l lVar;
        w wVar = this.f8784j;
        EpoxyRecyclerView epoxyRecyclerView = wVar.f17479a;
        g.e(epoxyRecyclerView, "rv");
        int childCount = epoxyRecyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = epoxyRecyclerView.getChildAt(i10);
            g.e(childAt, "getChildAt(index)");
            RecyclerView.b0 D = wVar.f17479a.D(childAt);
            g.d(D, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyViewHolder");
            b0 b0Var = (b0) D;
            b0Var.s();
            r rVar = b0Var.f6617u;
            if (rVar instanceof l) {
                lVar = (l) rVar;
            } else {
                lVar = null;
            }
            if (lVar != null) {
                int i11 = ReorderLabelDialogFragment.f8777x0;
                LabelViewModel labelViewModel = (LabelViewModel) this.f8785k.f8778u0.getValue();
                c F = lVar.F();
                int d5 = b0Var.d();
                labelViewModel.getClass();
                m0.b.M0(a1.b.d0(labelViewModel), null, null, new LabelViewModel$updateLabelPosition$1(labelViewModel, F, d5, null), 3);
            }
        }
        return n.f16010a;
    }
}
