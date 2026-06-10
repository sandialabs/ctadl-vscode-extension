package androidx.compose.foundation.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class OffsetPxModifier$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ OffsetPxModifier f1926j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t f1927k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b0 f1928l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, t tVar, b0 b0Var) {
        super(1);
        this.f1926j = offsetPxModifier;
        this.f1927k = tVar;
        this.f1928l = b0Var;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        OffsetPxModifier offsetPxModifier = this.f1926j;
        long j2 = offsetPxModifier.f1924j.U(this.f1927k).f6345a;
        if (offsetPxModifier.f1925k) {
            int a10 = b2.g.a(j2);
            b0.a.g(aVar2, this.f1928l, (int) (j2 >> 32), a10);
        } else {
            b0.a.h(aVar2, this.f1928l, (int) (j2 >> 32), b2.g.a(j2), null, 12);
        }
        return n.f16010a;
    }
}
