package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import x6.t0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NewFolderFragment$setupNotoColors$1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<Pair<NotoColor, Boolean>> f8577j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ NewFolderFragment f8578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewFolderFragment$setupNotoColors$1(List<? extends Pair<? extends NotoColor, Boolean>> list, NewFolderFragment newFolderFragment) {
        super(1);
        this.f8577j = list;
        this.f8578k = newFolderFragment;
    }

    @Override // u7.l
    public final m7.n U(com.airbnb.epoxy.m mVar) {
        com.airbnb.epoxy.m mVar2 = mVar;
        v7.g.f(mVar2, "$this$withModels");
        Iterator<T> it = this.f8577j.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            t0 t0Var = new t0();
            t0Var.m(Integer.valueOf(((NotoColor) pair.f12962i).ordinal()));
            t0Var.H((NotoColor) pair.f12962i);
            t0Var.G(((Boolean) pair.f12963j).booleanValue());
            t0Var.I(new o(3, this.f8578k, pair));
            mVar2.add(t0Var);
        }
        return m7.n.f16010a;
    }
}
