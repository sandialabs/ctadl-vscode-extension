package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.r;
import f0.h;
import g0.h1;
import g0.p0;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2465j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2466k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2467l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f2468m;
    public final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2469o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f2470p;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements p<g0.d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2471j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2472k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2473l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ p1.p f2474m;
        public final /* synthetic */ long n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ long f2475o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ int f2476p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ boolean f2477q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, p<? super g0.d, ? super Integer, n> pVar3, p1.p pVar4, long j2, long j10, int i10, boolean z10) {
            super(2);
            this.f2471j = pVar;
            this.f2472k = pVar2;
            this.f2473l = pVar3;
            this.f2474m = pVar4;
            this.n = j2;
            this.f2475o = j10;
            this.f2476p = i10;
            this.f2477q = z10;
        }

        @Override // u7.p
        public final n R(g0.d dVar, Integer num) {
            p<g0.d, Integer, n> pVar;
            int i10;
            g0.d dVar2;
            long j2 = this.f2475o;
            long j10 = this.n;
            p1.p pVar2 = this.f2474m;
            p<g0.d, Integer, n> pVar3 = this.f2473l;
            p<g0.d, Integer, n> pVar4 = this.f2472k;
            g0.d dVar3 = dVar;
            if ((num.intValue() & 11) == 2 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            p<g0.d, Integer, n> pVar5 = this.f2471j;
            int i11 = this.f2476p;
            if (pVar5 == null) {
                dVar3.f(-2104362770);
                i10 = ((i11 >> 27) & 14) | 48;
                pVar = null;
            } else if (this.f2477q) {
                dVar3.f(-2104362456);
                int i12 = i11 >> 9;
                SnackbarKt.c(this.f2472k, this.f2471j, this.f2473l, this.f2474m, this.n, this.f2475o, dVar3, ((i11 >> 27) & 14) | (i11 & 112) | (i11 & 896) | (57344 & i12) | (i12 & 458752));
                dVar2 = dVar3;
                dVar2.u();
                return n.f16010a;
            } else {
                dVar3.f(-2104362176);
                pVar = pVar5;
                i10 = ((i11 >> 27) & 14) | (i11 & 112);
            }
            int i13 = i11 >> 9;
            dVar2 = dVar3;
            p<g0.d, Integer, n> pVar6 = pVar;
            SnackbarKt.d(pVar4, pVar6, pVar3, pVar2, j10, j2, dVar2, (458752 & i13) | i10 | (i11 & 896) | (57344 & i13));
            dVar2.u();
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$Snackbar$1(p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, p<? super g0.d, ? super Integer, n> pVar3, long j2, long j10, int i10, boolean z10) {
        super(2);
        this.f2465j = pVar;
        this.f2466k = pVar2;
        this.f2467l = pVar3;
        this.f2468m = j2;
        this.n = j10;
        this.f2469o = i10;
        this.f2470p = z10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        h1 h1Var = TypographyKt.f2598a;
        CompositionLocalKt.a(new p0[]{TextKt.f2573a.b(TypographyKt.a((r) dVar2.w(h1Var), h.f10817e))}, a1.c.i0(dVar2, 835891690, new AnonymousClass1(this.f2465j, this.f2466k, this.f2467l, TypographyKt.a((r) dVar2.w(h1Var), TypographyKeyTokens.LabelLarge), this.f2468m, this.n, this.f2469o, this.f2470p)), dVar2, 56);
        return n.f16010a;
    }
}
