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
public final class PaddingModifier$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PaddingModifier f1933j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b0 f1934k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t f1935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingModifier$measure$1(PaddingModifier paddingModifier, b0 b0Var, t tVar) {
        super(1);
        this.f1933j = paddingModifier;
        this.f1934k = b0Var;
        this.f1935l = tVar;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        PaddingModifier paddingModifier = this.f1933j;
        boolean z10 = paddingModifier.n;
        b0 b0Var = this.f1934k;
        float f10 = paddingModifier.f1930k;
        float f11 = paddingModifier.f1929j;
        t tVar = this.f1935l;
        int a02 = tVar.a0(f11);
        if (z10) {
            b0.a.f(aVar2, b0Var, a02, tVar.a0(f10));
        } else {
            b0.a.c(aVar2, b0Var, a02, tVar.a0(f10));
        }
        return n.f16010a;
    }
}
