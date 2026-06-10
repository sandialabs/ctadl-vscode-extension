package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class MinimumTouchTargetModifier$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2336j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b0 f2337k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumTouchTargetModifier$measure$1(int i10, int i11, b0 b0Var) {
        super(1);
        this.f2336j = i10;
        this.f2337k = b0Var;
        this.f2338l = i11;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        b0 b0Var = this.f2337k;
        b0.a.c(aVar2, b0Var, m0.b.g1((this.f2336j - b0Var.f12640i) / 2.0f), m0.b.g1((this.f2338l - b0Var.f12641j) / 2.0f));
        return n.f16010a;
    }
}
