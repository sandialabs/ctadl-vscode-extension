package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"V", "T", "Lg0/c;", "applier", "Lg0/z0;", "<anonymous parameter 1>", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$apply$operation$1 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<T, V, n> f2665j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ V f2666k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerImpl$apply$operation$1(Object obj, p pVar) {
        super(3);
        this.f2665j = pVar;
        this.f2666k = obj;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        g0.c<?> cVar2 = cVar;
        v7.g.f(cVar2, "applier");
        v7.g.f(z0Var, "<anonymous parameter 1>");
        v7.g.f(t0Var, "<anonymous parameter 2>");
        this.f2665j.R(cVar2.a(), this.f2666k);
        return n.f16010a;
    }
}
