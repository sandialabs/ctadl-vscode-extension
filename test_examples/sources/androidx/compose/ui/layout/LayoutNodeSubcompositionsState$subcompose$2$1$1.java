package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.b;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class LayoutNodeSubcompositionsState$subcompose$2$1$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b.a f3321j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<d, Integer, n> f3322k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeSubcompositionsState$subcompose$2$1$1(b.a aVar, p<? super d, ? super Integer, n> pVar) {
        super(2);
        this.f3321j = aVar;
        this.f3322k = pVar;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        boolean booleanValue = ((Boolean) this.f3321j.f3358e.getValue()).booleanValue();
        dVar2.C(Boolean.valueOf(booleanValue));
        boolean c = dVar2.c(booleanValue);
        if (booleanValue) {
            this.f3322k.R(dVar2, 0);
        } else {
            dVar2.o(c);
        }
        dVar2.d();
        return n.f16010a;
    }
}
