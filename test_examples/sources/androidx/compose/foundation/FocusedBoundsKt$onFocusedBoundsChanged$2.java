package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import j1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import s.k;
import u7.l;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsKt$onFocusedBoundsChanged$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<h, n> f1503j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsKt$onFocusedBoundsChanged$2(l<? super h, n> lVar) {
        super(3);
        this.f1503j = lVar;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(1176407768);
        dVar3.f(1157296644);
        l<h, n> lVar = this.f1503j;
        boolean z10 = dVar3.z(lVar);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new k(lVar);
            dVar3.q(g10);
        }
        dVar3.u();
        k kVar = (k) g10;
        dVar3.u();
        return kVar;
    }
}
