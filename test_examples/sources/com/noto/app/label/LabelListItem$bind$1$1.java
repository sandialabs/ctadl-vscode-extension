package com.noto.app.label;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.label.LabelListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;
import y6.h;
import y6.i;
import y6.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LabelListItem$bind$1$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LabelListItem f8749j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListItem$bind$1$1(LabelListItem labelListItem) {
        super(1);
        this.f8749j = labelListItem;
    }

    @Override // u7.l
    public final n U(m mVar) {
        boolean z10;
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        y6.b bVar = new y6.b();
        bVar.H();
        final LabelListItem labelListItem = this.f8749j;
        List<h> F = labelListItem.F();
        if (!F.isEmpty()) {
            for (h hVar : F) {
                if (hVar.f18913b) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        bVar.I(z10);
        bVar.G(labelListItem.E());
        bVar.J(labelListItem.G());
        mVar2.add(bVar);
        for (final h hVar2 : labelListItem.F()) {
            i iVar = new i();
            iVar.J(hVar2.f18912a.f17615a);
            iVar.L(hVar2.f18912a);
            iVar.K(hVar2.f18913b);
            iVar.I(labelListItem.E());
            iVar.M(new View.OnClickListener() { // from class: y6.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LabelListItem labelListItem2 = LabelListItem.this;
                    v7.g.f(labelListItem2, "this$0");
                    h hVar3 = hVar2;
                    v7.g.f(hVar3, "$model");
                    u7.l<? super t6.c, m7.n> lVar = labelListItem2.n;
                    if (lVar != null) {
                        lVar.U(hVar3.f18912a);
                    } else {
                        v7.g.l("onLabelClickListener");
                        throw null;
                    }
                }
            });
            iVar.N(new View.OnLongClickListener() { // from class: y6.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    LabelListItem labelListItem2 = LabelListItem.this;
                    v7.g.f(labelListItem2, "this$0");
                    h hVar3 = hVar2;
                    v7.g.f(hVar3, "$model");
                    u7.l<? super t6.c, Boolean> lVar = labelListItem2.f8746o;
                    if (lVar != null) {
                        return lVar.U(hVar3.f18912a).booleanValue();
                    }
                    v7.g.l("onLabelLongClickListener");
                    throw null;
                }
            });
            mVar2.add(iVar);
        }
        q qVar = new q();
        qVar.l("new");
        NotoColor E = labelListItem.E();
        qVar.p();
        qVar.f18925k = E;
        View.OnClickListener H = labelListItem.H();
        qVar.p();
        qVar.f18926l = H;
        mVar2.add(qVar);
        return n.f16010a;
    }
}
