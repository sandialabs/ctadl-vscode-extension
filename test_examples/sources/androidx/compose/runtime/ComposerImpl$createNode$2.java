package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lg0/c;", "applier", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$createNode$2 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<T> f2672j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0.b f2673k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerImpl$createNode$2(u7.a<? extends T> aVar, g0.b bVar, int i10) {
        super(3);
        this.f2672j = aVar;
        this.f2673k = bVar;
        this.f2674l = i10;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        g0.c<?> cVar2 = cVar;
        z0 z0Var2 = z0Var;
        androidx.activity.e.p(cVar2, "applier", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
        Object k02 = this.f2672j.k0();
        g0.b bVar = this.f2673k;
        v7.g.f(bVar, "anchor");
        z0Var2.P(z0Var2.c(bVar), k02);
        cVar2.e(this.f2674l, k02);
        cVar2.c(k02);
        return n.f16010a;
    }
}
