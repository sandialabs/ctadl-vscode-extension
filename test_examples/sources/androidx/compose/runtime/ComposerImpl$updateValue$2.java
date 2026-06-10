package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.r0;
import g0.t0;
import g0.u0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "rememberManager", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$updateValue$2 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f2735j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2736k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$updateValue$2(int i10, Object obj) {
        super(3);
        this.f2735j = obj;
        this.f2736k = i10;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        r0 r0Var;
        b bVar;
        z0 z0Var2 = z0Var;
        t0 t0Var2 = t0Var;
        androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var2, "rememberManager");
        Object obj = this.f2735j;
        if (obj instanceof u0) {
            t0Var2.c((u0) obj);
        }
        Object F = z0Var2.F(this.f2736k, obj);
        if (F instanceof u0) {
            t0Var2.b((u0) F);
        } else if ((F instanceof r0) && (bVar = (r0Var = (r0) F).f11072b) != null) {
            r0Var.f11072b = null;
            r0Var.f11075f = null;
            r0Var.f11076g = null;
            bVar.f2861v = true;
        }
        return n.f16010a;
    }
}
