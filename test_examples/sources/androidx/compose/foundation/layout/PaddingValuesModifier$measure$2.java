package androidx.compose.foundation.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v.o;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PaddingValuesModifier$measure$2 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f1937j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t f1938k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ PaddingValuesModifier f1939l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier$measure$2(b0 b0Var, t tVar, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.f1937j = b0Var;
        this.f1938k = tVar;
        this.f1939l = paddingValuesModifier;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        PaddingValuesModifier paddingValuesModifier = this.f1939l;
        o oVar = paddingValuesModifier.f1936j;
        t tVar = this.f1938k;
        b0.a.c(aVar2, this.f1937j, tVar.a0(oVar.b(tVar.getLayoutDirection())), tVar.a0(paddingValuesModifier.f1936j.c()));
        return n.f16010a;
    }
}
