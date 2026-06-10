package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$doCompose$2$5 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2687j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f2688k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f2689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$doCompose$2$5(ComposableLambdaImpl composableLambdaImpl, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.f2687j = composableLambdaImpl;
        this.f2688k = composerImpl;
        this.f2689l = obj;
    }

    @Override // u7.a
    public final n k0() {
        Object obj;
        ComposerImpl composerImpl = this.f2688k;
        p<g0.d, Integer, n> pVar = this.f2687j;
        if (pVar != null) {
            composerImpl.u0(200, ComposerKt.f2741f);
            l.d(2, pVar);
            pVar.R(composerImpl, 1);
            composerImpl.Q(false);
        } else {
            composerImpl.getClass();
            if (composerImpl.f2655r.isEmpty()) {
                composerImpl.f2650l = composerImpl.D.o() + composerImpl.f2650l;
            } else {
                w0 w0Var = composerImpl.D;
                int f10 = w0Var.f();
                int i10 = w0Var.f11095g;
                int i11 = w0Var.f11096h;
                int[] iArr = w0Var.f11091b;
                if (i10 < i11) {
                    obj = w0Var.l(iArr, i10);
                } else {
                    obj = null;
                }
                Object e10 = w0Var.e();
                composerImpl.B0(obj, f10, e10);
                composerImpl.y0(null, a1.c.D(iArr, w0Var.f11095g));
                composerImpl.h0();
                w0Var.d();
                composerImpl.D0(obj, f10, e10);
            }
        }
        return n.f16010a;
    }
}
