package androidx.compose.foundation.relocation;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.d;
import u7.q;
import x.a;
import x.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BringIntoViewResponderKt$bringIntoViewResponder$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f2041j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderKt$bringIntoViewResponder$2(g gVar) {
        super(3);
        this.f2041j = gVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        v7.g.f(dVar, "$this$composed");
        dVar3.f(-852052847);
        a k12 = c.k1(dVar3);
        dVar3.f(1157296644);
        boolean z10 = dVar3.z(k12);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new BringIntoViewResponderModifier(k12);
            dVar3.q(g10);
        }
        dVar3.u();
        BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) g10;
        bringIntoViewResponderModifier.getClass();
        g gVar = this.f2041j;
        v7.g.f(gVar, "<set-?>");
        bringIntoViewResponderModifier.f2042l = gVar;
        dVar3.u();
        return bringIntoViewResponderModifier;
    }
}
