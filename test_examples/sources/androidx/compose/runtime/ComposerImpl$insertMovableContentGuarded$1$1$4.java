package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.e0;
import g0.f0;
import g0.l;
import g0.r0;
import g0.t0;
import g0.x0;
import g0.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$4 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f2702j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f2703k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ f0 f2704l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ f0 f2705m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$4(e0 e0Var, ComposerImpl composerImpl, f0 f0Var, f0 f0Var2) {
        super(3);
        this.f2702j = e0Var;
        this.f2703k = composerImpl;
        this.f2704l = f0Var;
        this.f2705m = f0Var2;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        boolean z10;
        r0 r0Var;
        z0 z0Var2 = z0Var;
        androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
        e0 e0Var = this.f2702j;
        if (e0Var == null && (e0Var = this.f2703k.f2641b.j(this.f2704l)) == null) {
            ComposerKt.c("Could not resolve state for movable content");
            throw null;
        }
        x0 x0Var = e0Var.f11041a;
        v7.g.f(x0Var, "table");
        if (z0Var2.f11130m <= 0 && z0Var2.o(z0Var2.f11134r + 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ComposerKt.f(z10);
        int i10 = z0Var2.f11134r;
        int i11 = z0Var2.f11125h;
        int i12 = z0Var2.f11126i;
        z0Var2.a(1);
        z0Var2.K();
        z0Var2.e();
        z0 t10 = x0Var.t();
        try {
            List a10 = z0.a.a(t10, 2, z0Var2, false, true);
            t10.f();
            z0Var2.j();
            z0Var2.i();
            z0Var2.f11134r = i10;
            z0Var2.f11125h = i11;
            z0Var2.f11126i = i12;
            if (!a10.isEmpty()) {
                l lVar = this.f2705m.c;
                v7.g.d(lVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                b bVar = (b) lVar;
                int size = a10.size();
                for (int i13 = 0; i13 < size; i13++) {
                    g0.b bVar2 = (g0.b) a10.get(i13);
                    v7.g.f(bVar2, "anchor");
                    Object I = z0Var2.I(z0Var2.c(bVar2), 0);
                    if (I instanceof r0) {
                        r0Var = (r0) I;
                    } else {
                        r0Var = null;
                    }
                    if (r0Var != null) {
                        r0Var.f11072b = bVar;
                    }
                }
            }
            return n.f16010a;
        } catch (Throwable th) {
            t10.f();
            throw th;
        }
    }
}
