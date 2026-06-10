package androidx.compose.ui.draw;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v0.h0;
import v0.u;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/u;", "Lm7/n;", "invoke", "(Lv0/u;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class ShadowKt$shadow$2$1 extends Lambda implements l<u, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f3002j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f3003k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f3004l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f3005m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f10, h0 h0Var, boolean z10, long j2, long j10) {
        super(1);
        this.f3002j = f10;
        this.f3003k = h0Var;
        this.f3004l = z10;
        this.f3005m = j2;
        this.n = j10;
    }

    @Override // u7.l
    public final n U(u uVar) {
        u uVar2 = uVar;
        g.f(uVar2, "$this$graphicsLayer");
        uVar2.z(uVar2.H(this.f3002j));
        uVar2.G(this.f3003k);
        uVar2.W(this.f3004l);
        uVar2.I(this.f3005m);
        uVar2.c0(this.n);
        return n.f16010a;
    }
}
