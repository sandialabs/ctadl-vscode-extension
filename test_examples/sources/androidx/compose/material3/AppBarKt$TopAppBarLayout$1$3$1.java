package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.p0;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v0.r;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TopAppBarLayout$1$3$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f2208j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f2209k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2210l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2211m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TopAppBarLayout$1$3$1(long j2, float f10, p<? super g0.d, ? super Integer, n> pVar, int i10) {
        super(2);
        this.f2208j = j2;
        this.f2209k = f10;
        this.f2210l = pVar;
        this.f2211m = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new r(r.b(this.f2208j, this.f2209k)))}, this.f2210l, dVar2, ((this.f2211m >> 12) & 112) | 8);
        return n.f16010a;
    }
}
