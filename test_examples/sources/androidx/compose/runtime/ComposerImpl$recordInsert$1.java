package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.x0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$recordInsert$1 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x0 f2721j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0.b f2722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$1(x0 x0Var, g0.b bVar) {
        super(3);
        this.f2721j = x0Var;
        this.f2722k = bVar;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        z0 z0Var2 = z0Var;
        v7.g.f(cVar, "<anonymous parameter 0>");
        v7.g.f(z0Var2, "slots");
        v7.g.f(t0Var, "<anonymous parameter 2>");
        z0Var2.e();
        g0.b bVar = this.f2722k;
        bVar.getClass();
        x0 x0Var = this.f2721j;
        v7.g.f(x0Var, "slots");
        z0Var2.u(x0Var, x0Var.d(bVar));
        z0Var2.j();
        return n.f16010a;
    }
}
