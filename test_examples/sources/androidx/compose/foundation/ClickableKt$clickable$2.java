package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.g;
import q0.d;
import s.m;
import u.j;
import u.k;
import u7.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ClickableKt$clickable$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1421j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f1422k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ g f1423l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1424m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$2(boolean z10, String str, g gVar, u7.a<n> aVar) {
        super(3);
        this.f1421j = z10;
        this.f1422k = str;
        this.f1423l = gVar;
        this.f1424m = aVar;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        v7.g.f(dVar, "$this$composed");
        dVar3.f(-756081143);
        d.a aVar = d.a.f16824i;
        m mVar = (m) dVar3.w(IndicationKt.f1540a);
        dVar3.f(-492369756);
        Object g10 = dVar3.g();
        if (g10 == d.a.f11039a) {
            g10 = new k();
            dVar3.q(g10);
        }
        dVar3.u();
        q0.d b5 = ClickableKt.b(aVar, (j) g10, mVar, this.f1421j, this.f1422k, this.f1423l, this.f1424m);
        dVar3.u();
        return b5;
    }
}
