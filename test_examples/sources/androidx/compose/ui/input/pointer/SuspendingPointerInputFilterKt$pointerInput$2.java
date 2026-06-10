package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.b;
import g0.d;
import g0.s;
import g0.t0;
import g0.z0;
import g1.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p7.c;
import q0.d;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt$pointerInput$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f3293j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<v, c<? super n>, Object> f3294k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputFilterKt$pointerInput$2(Object obj, p<? super v, ? super c<? super n>, ? extends Object> pVar) {
        super(3);
        this.f3293j = obj;
        this.f3294k = pVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        g.f(dVar, "$this$composed");
        dVar3.f(-906157935);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        b bVar = (b) dVar3.w(CompositionLocalsKt.f3703e);
        j1 j1Var = (j1) dVar3.w(CompositionLocalsKt.f3712o);
        dVar3.f(1157296644);
        boolean z10 = dVar3.z(bVar);
        Object g10 = dVar3.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new SuspendingPointerInputFilter(j1Var, bVar);
            dVar3.q(g10);
        }
        dVar3.u();
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) g10;
        s.b(suspendingPointerInputFilter, this.f3293j, new SuspendingPointerInputFilterKt$pointerInput$2$2$1(suspendingPointerInputFilter, this.f3294k, null), dVar3);
        dVar3.u();
        return suspendingPointerInputFilter;
    }
}
