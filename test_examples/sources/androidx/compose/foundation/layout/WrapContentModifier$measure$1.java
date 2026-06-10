package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.h;
import j1.b0;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WrapContentModifier$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WrapContentModifier f1991j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f1992k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b0 f1993l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1994m;
    public final /* synthetic */ t n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i10, b0 b0Var, int i11, t tVar) {
        super(1);
        this.f1991j = wrapContentModifier;
        this.f1992k = i10;
        this.f1993l = b0Var;
        this.f1994m = i11;
        this.n = tVar;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        g.f(aVar, "$this$layout");
        p<h, LayoutDirection, b2.g> pVar = this.f1991j.f1989l;
        b0 b0Var = this.f1993l;
        b0.a.d(b0Var, pVar.R(new h(v8.b.f(this.f1992k - b0Var.f12640i, this.f1994m - b0Var.f12641j)), this.n.getLayoutDirection()).f6345a, 0.0f);
        return n.f16010a;
    }
}
