package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v.o;
import v.v;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2342j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2343k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q<o, g0.d, Integer, n> f2344l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2345m;
    public final /* synthetic */ p<g0.d, Integer, n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ v f2346o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2347p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2348q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(int i10, int i11, v vVar, p pVar, p pVar2, p pVar3, p pVar4, q qVar) {
        super(2);
        this.f2342j = i10;
        this.f2343k = pVar;
        this.f2344l = qVar;
        this.f2345m = pVar2;
        this.n = pVar3;
        this.f2346o = vVar;
        this.f2347p = pVar4;
        this.f2348q = i11;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        int i10 = this.f2342j;
        p<g0.d, Integer, n> pVar = this.f2343k;
        q<o, g0.d, Integer, n> qVar2 = this.f2344l;
        p<g0.d, Integer, n> pVar2 = this.f2345m;
        p<g0.d, Integer, n> pVar3 = this.n;
        v vVar = this.f2346o;
        p<g0.d, Integer, n> pVar4 = this.f2347p;
        int i11 = this.f2348q;
        ScaffoldKt.b(i10, pVar, qVar2, pVar2, pVar3, vVar, pVar4, dVar2, ((i11 >> 15) & 14) | (i11 & 112) | ((i11 >> 21) & 896) | (i11 & 7168) | (57344 & i11) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016));
        return n.f16010a;
    }
}
