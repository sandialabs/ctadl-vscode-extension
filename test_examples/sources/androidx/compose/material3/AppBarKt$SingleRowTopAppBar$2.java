package androidx.compose.material3;

import androidx.compose.foundation.layout.InsetsPaddingModifier;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.q;
import f0.k;
import g0.t0;
import g0.z0;
import k1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v.v;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$2 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ v f2182j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q f2183k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2184l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p1.p f2185m;
    public final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2186o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2187p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2188q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$2(v vVar, q qVar, p pVar, p1.p pVar2, boolean z10, p pVar3, ComposableLambdaImpl composableLambdaImpl, int i10) {
        super(2);
        this.f2182j = vVar;
        this.f2183k = qVar;
        this.f2184l = pVar;
        this.f2185m = pVar2;
        this.n = z10;
        this.f2186o = pVar3;
        this.f2187p = composableLambdaImpl;
        this.f2188q = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.foundation.layout.b$i] */
    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        b.C0019b c0019b;
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        u7.q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        float H = 0.0f + ((b2.b) dVar2.w(CompositionLocalsKt.f3703e)).H(k.f10828a);
        h<v> hVar = WindowInsetsPaddingKt.f1985a;
        v vVar = this.f2182j;
        g.f(vVar, "insets");
        q0.d Z = a1.c.Z(new InsetsPaddingModifier(vVar, InspectableValueKt.f3744a));
        q qVar2 = this.f2183k;
        long j2 = qVar2.c;
        long j10 = qVar2.f10574d;
        long j11 = qVar2.f10575e;
        p<g0.d, Integer, n> pVar = this.f2184l;
        p1.p pVar2 = this.f2185m;
        b.C0019b c0019b2 = androidx.compose.foundation.layout.b.f2001e;
        if (this.n) {
            c0019b = c0019b2;
        } else {
            c0019b = androidx.compose.foundation.layout.b.f1998a;
        }
        p<g0.d, Integer, n> pVar3 = this.f2186o;
        p<g0.d, Integer, n> pVar4 = this.f2187p;
        int i10 = this.f2188q;
        int i11 = i10 << 12;
        a.c(Z, H, j2, j10, j11, pVar, pVar2, 1.0f, c0019b2, c0019b, 0, false, pVar3, pVar4, dVar2, (i11 & 458752) | 113246208 | (i11 & 3670016), ((i10 >> 6) & 896) | 3126);
        return n.f16010a;
    }
}
