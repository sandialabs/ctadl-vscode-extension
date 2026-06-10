package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.k0;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ScrollingLayoutModifier$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScrollingLayoutModifier f1592j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f1593k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b0 f1594l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i10, b0 b0Var) {
        super(1);
        this.f1592j = scrollingLayoutModifier;
        this.f1593k = i10;
        this.f1594l = b0Var;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        int i10;
        int i11;
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        ScrollingLayoutModifier scrollingLayoutModifier = this.f1592j;
        ScrollState scrollState = scrollingLayoutModifier.f1588i;
        k0 k0Var = scrollState.c;
        int i12 = this.f1593k;
        k0Var.setValue(Integer.valueOf(i12));
        if (scrollState.d() > i12) {
            scrollState.f1581a.setValue(Integer.valueOf(i12));
        }
        int i13 = 0;
        int c0 = a1.c.c0(scrollingLayoutModifier.f1588i.d(), 0, i12);
        if (scrollingLayoutModifier.f1589j) {
            i10 = c0 - i12;
        } else {
            i10 = -c0;
        }
        boolean z10 = scrollingLayoutModifier.f1590k;
        if (z10) {
            i11 = 0;
        } else {
            i11 = i10;
        }
        if (z10) {
            i13 = i10;
        }
        b0.a.g(aVar2, this.f1594l, i11, i13);
        return n.f16010a;
    }
}
