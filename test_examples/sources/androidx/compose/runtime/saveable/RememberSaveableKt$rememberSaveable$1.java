package androidx.compose.runtime.saveable;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import g0.h0;
import g0.j1;
import g0.p;
import g0.q;
import g0.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.c;
import o0.e;
import p0.m;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f2909j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f2910k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ g1<e<Object, Object>> f2911l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ g1<Object> f2912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(c cVar, String str, g0 g0Var, g0 g0Var2) {
        super(1);
        this.f2909j = cVar;
        this.f2910k = str;
        this.f2911l = g0Var;
        this.f2912m = g0Var2;
    }

    @Override // u7.l
    public final p U(q qVar) {
        StringBuilder sb;
        String str;
        String sb2;
        g.f(qVar, "$this$DisposableEffect");
        g1<e<Object, Object>> g1Var = this.f2911l;
        g1<Object> g1Var2 = this.f2912m;
        c cVar = this.f2909j;
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(g1Var, g1Var2, cVar);
        Object k02 = rememberSaveableKt$rememberSaveable$1$valueProvider$1.k0();
        if (k02 != null && !cVar.a(k02)) {
            if (k02 instanceof m) {
                m mVar = (m) k02;
                if (mVar.c() != h0.f11052a && mVar.c() != j1.f11059a && mVar.c() != s0.f11078a) {
                    sb2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                    throw new IllegalArgumentException(sb2);
                }
                sb = new StringBuilder("MutableState containing ");
                sb.append(mVar.getValue());
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                sb = new StringBuilder();
                sb.append(k02);
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            sb.append(str);
            sb2 = sb.toString();
            throw new IllegalArgumentException(sb2);
        }
        return new o0.a(cVar.d(this.f2910k, rememberSaveableKt$rememberSaveable$1$valueProvider$1));
    }
}
