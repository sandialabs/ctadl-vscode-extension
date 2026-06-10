package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g1;
import g0.j;
import g0.p0;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li0/d;", "Lg0/j;", "", "Lg0/g1;", "Landroidx/compose/runtime/CompositionLocalMap;", "invoke", "(Lg0/d;I)Li0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements p<g0.d, Integer, i0.d<j<Object>, ? extends g1<? extends Object>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p0<?>[] f2731j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i0.d<j<Object>, g1<Object>> f2732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerImpl$startProviders$currentProviders$1(p0<?>[] p0VarArr, i0.d<j<Object>, ? extends g1<? extends Object>> dVar) {
        super(2);
        this.f2731j = p0VarArr;
        this.f2732k = dVar;
    }

    @Override // u7.p
    public final i0.d<j<Object>, ? extends g1<? extends Object>> R(g0.d dVar, Integer num) {
        p0<?>[] p0VarArr;
        g0.d dVar2 = dVar;
        num.intValue();
        dVar2.f(935231726);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(721128344);
        k0.e eVar = new k0.e(a1.c.h1());
        for (p0<?> p0Var : this.f2731j) {
            dVar2.f(680852989);
            boolean z10 = p0Var.c;
            j<?> jVar = p0Var.f11068a;
            if (!z10) {
                i0.d<j<Object>, g1<Object>> dVar3 = this.f2732k;
                v7.g.f(dVar3, "<this>");
                v7.g.f(jVar, "key");
                if (dVar3.containsKey(jVar)) {
                    dVar2.u();
                }
            }
            v7.g.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            eVar.put(jVar, jVar.a(p0Var.f11069b, dVar2));
            dVar2.u();
        }
        k0.c a10 = eVar.a();
        dVar2.u();
        q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        dVar2.u();
        return a10;
    }
}
