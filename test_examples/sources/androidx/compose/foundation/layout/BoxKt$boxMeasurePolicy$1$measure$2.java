package androidx.compose.foundation.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.p;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BoxKt$boxMeasurePolicy$1$measure$2 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f1895j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p f1896k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t f1897l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1898m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q0.a f1899o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$2(b0 b0Var, p pVar, t tVar, int i10, int i11, q0.a aVar) {
        super(1);
        this.f1895j = b0Var;
        this.f1896k = pVar;
        this.f1897l = tVar;
        this.f1898m = i10;
        this.n = i11;
        this.f1899o = aVar;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        BoxKt.b(aVar2, this.f1895j, this.f1896k, this.f1897l.getLayoutDirection(), this.f1898m, this.n, this.f1899o);
        return n.f16010a;
    }
}
