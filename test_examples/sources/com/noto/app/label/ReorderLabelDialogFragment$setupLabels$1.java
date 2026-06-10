package com.noto.app.label;

import android.view.MotionEvent;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.m;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.label.ReorderLabelDialogFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s6.w;
import t6.c;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ReorderLabelDialogFragment$setupLabels$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ReorderLabelDialogFragment f8786j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ w f8787k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<c> f8788l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ NotoColor f8789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderLabelDialogFragment$setupLabels$1(ReorderLabelDialogFragment reorderLabelDialogFragment, w wVar, List<c> list, NotoColor notoColor) {
        super(1);
        this.f8786j = reorderLabelDialogFragment;
        this.f8787k = wVar;
        this.f8788l = list;
        this.f8789m = notoColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [y6.t] */
    @Override // u7.l
    public final n U(m mVar) {
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        final ReorderLabelDialogFragment reorderLabelDialogFragment = this.f8786j;
        androidx.recyclerview.widget.n nVar = reorderLabelDialogFragment.f8780w0;
        final w wVar = this.f8787k;
        if (nVar == null) {
            androidx.recyclerview.widget.n nVar2 = new androidx.recyclerview.widget.n(new y6.m(mVar2, new ReorderLabelDialogFragment$setupItemTouchHelper$itemTouchHelperCallback$1(wVar, reorderLabelDialogFragment)));
            nVar2.i(wVar.f17479a);
            reorderLabelDialogFragment.f8780w0 = nVar2;
        }
        for (c cVar : this.f8788l) {
            y6.n nVar3 = new y6.n();
            nVar3.I(cVar.f17615a);
            nVar3.J(cVar);
            nVar3.H(this.f8789m);
            nVar3.K(new View.OnTouchListener() { // from class: y6.t
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    RecyclerView.b0 D;
                    androidx.recyclerview.widget.n nVar4;
                    w wVar2 = w.this;
                    v7.g.f(wVar2, "$this_setupLabels");
                    ReorderLabelDialogFragment reorderLabelDialogFragment2 = reorderLabelDialogFragment;
                    v7.g.f(reorderLabelDialogFragment2, "this$0");
                    if (motionEvent.getAction() == 0 && (D = wVar2.f17479a.D(view)) != null && (nVar4 = reorderLabelDialogFragment2.f8780w0) != null) {
                        nVar4.t(D);
                    }
                    return view.performClick();
                }
            });
            mVar2.add(nVar3);
        }
        return n.f16010a;
    }
}
