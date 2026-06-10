package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.x0;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "applier", "Lg0/z0;", "slots", "Lg0/t0;", "rememberManager", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$recordInsert$2 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x0 f2723j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0.b f2724k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<q<g0.c<?>, z0, t0, n>> f2725l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$2(x0 x0Var, g0.b bVar, ArrayList arrayList) {
        super(3);
        this.f2723j = x0Var;
        this.f2724k = bVar;
        this.f2725l = arrayList;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        g0.c<?> cVar2 = cVar;
        z0 z0Var2 = z0Var;
        t0 t0Var2 = t0Var;
        androidx.activity.e.p(cVar2, "applier", z0Var2, "slots", t0Var2, "rememberManager");
        List<q<g0.c<?>, z0, t0, n>> list = this.f2725l;
        x0 x0Var = this.f2723j;
        z0 t10 = x0Var.t();
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).O(cVar2, t10, t0Var2);
            }
            n nVar = n.f16010a;
            t10.f();
            z0Var2.e();
            g0.b bVar = this.f2724k;
            bVar.getClass();
            z0Var2.u(x0Var, x0Var.d(bVar));
            z0Var2.j();
            return n.f16010a;
        } catch (Throwable th) {
            t10.f();
            throw th;
        }
    }
}
