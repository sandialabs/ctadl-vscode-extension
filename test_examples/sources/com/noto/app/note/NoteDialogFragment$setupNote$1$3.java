package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import y6.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteDialogFragment$setupNote$1$3 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<t6.c> f9017j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t6.a f9018k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$setupNote$1$3(t6.a aVar, List list) {
        super(1);
        this.f9017j = list;
        this.f9018k = aVar;
    }

    @Override // u7.l
    public final m7.n U(com.airbnb.epoxy.m mVar) {
        com.airbnb.epoxy.m mVar2 = mVar;
        v7.g.f(mVar2, "$this$withModels");
        for (t6.c cVar : this.f9017j) {
            s sVar = new s();
            sVar.G(cVar.f17615a);
            sVar.p();
            sVar.f18928k = cVar;
            NotoColor notoColor = this.f9018k.f17595e;
            sVar.p();
            v7.g.f(notoColor, "<set-?>");
            sVar.f18929l = notoColor;
            mVar2.add(sVar);
        }
        return m7.n.f16010a;
    }
}
