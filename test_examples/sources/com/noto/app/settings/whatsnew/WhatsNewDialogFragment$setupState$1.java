package com.noto.app.settings.whatsnew;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import e7.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class WhatsNewDialogFragment$setupState$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WhatsNewDialogFragment f9804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsNewDialogFragment$setupState$1(WhatsNewDialogFragment whatsNewDialogFragment) {
        super(1);
        this.f9804j = whatsNewDialogFragment;
    }

    @Override // u7.l
    public final n U(m mVar) {
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        t6.g gVar = (t6.g) this.f9804j.f9800v0.getValue();
        if (gVar != null) {
            b bVar = new b();
            bVar.l(gVar.b().toString());
            bVar.p();
            bVar.f10670k = gVar;
            mVar2.add(bVar);
        }
        return n.f16010a;
    }
}
