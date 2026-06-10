package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s.m;
import s.n;
import s.o;
import s.p;
import u.i;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class IndicationKt$indication$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f1542j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i f1543k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(m mVar, i iVar) {
        super(3);
        this.f1542j = mVar;
        this.f1543k = iVar;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-353972293);
        m mVar = this.f1542j;
        if (mVar == null) {
            mVar = p.f17222a;
        }
        n a10 = mVar.a(this.f1543k, dVar3);
        dVar3.f(1157296644);
        boolean z10 = dVar3.z(a10);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new o(a10);
            dVar3.q(g10);
        }
        dVar3.u();
        o oVar = (o) g10;
        dVar3.u();
        return oVar;
    }
}
