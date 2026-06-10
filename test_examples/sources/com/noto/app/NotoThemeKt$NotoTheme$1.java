package com.noto.app;

import a1.b;
import android.content.res.Configuration;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Theme;
import e0.c;
import e0.l;
import e0.r;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u1.g;
import u1.m;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotoThemeKt$NotoTheme$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Theme f7587j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<d, Integer, n> f7588k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotoThemeKt$NotoTheme$1(Theme theme, p<? super d, ? super Integer, n> pVar, int i10) {
        super(2);
        this.f7587j = theme;
        this.f7588k = pVar;
        this.f7589l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r1 != false) goto L26;
     */
    @Override // u7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n R(d dVar, Integer num) {
        boolean z10;
        c cVar;
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        p<d, Integer, n> pVar = this.f7588k;
        dVar2.f(-579804543);
        if ((((Configuration) dVar2.w(AndroidCompositionLocals_androidKt.f3655a)).uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        int ordinal = this.f7587j.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = NotoThemeKt.f7581d;
                    }
                    cVar = NotoThemeKt.c;
                }
                cVar = NotoThemeKt.f7580b;
            }
        }
        dVar2.u();
        l lVar = NotoThemeKt.f7582e;
        dVar2.f(-2124260819);
        r rVar = NotoThemeKt.f7584g;
        p1.p pVar2 = rVar.f10576a;
        g gVar = NotoThemeKt.f7583f;
        p1.p a10 = p1.p.a(pVar2, 0L, null, gVar, 262111);
        p1.p a11 = p1.p.a(rVar.f10577b, 0L, null, gVar, 262111);
        p1.p a12 = p1.p.a(rVar.c, 0L, null, gVar, 262111);
        p1.p a13 = p1.p.a(rVar.f10578d, 0L, null, gVar, 262111);
        p1.p pVar3 = rVar.f10579e;
        m mVar = m.f17756p;
        p1.p a14 = p1.p.a(pVar3, b.b0(24), mVar, gVar, 262105);
        p1.p a15 = p1.p.a(rVar.f10580f, 0L, null, gVar, 262111);
        p1.p pVar4 = rVar.f10581g;
        m mVar2 = m.f17757q;
        p1.p a16 = p1.p.a(pVar4, b.b0(22), mVar2, gVar, 262105);
        p1.p a17 = p1.p.a(rVar.f10582h, b.b0(20), mVar2, gVar, 262105);
        p1.p a18 = p1.p.a(rVar.f10583i, b.b0(17), mVar, gVar, 262105);
        p1.p a19 = p1.p.a(rVar.f10584j, b.b0(16), mVar, gVar, 262105);
        p1.p pVar5 = rVar.f10585k;
        m mVar3 = m.f17755o;
        r rVar2 = new r(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, p1.p.a(pVar5, b.b0(16), mVar3, gVar, 262105), p1.p.a(rVar.f10586l, b.b0(14), mVar3, gVar, 262105), p1.p.a(rVar.f10587m, b.b0(14), mVar, gVar, 262105), p1.p.a(rVar.n, b.b0(12), mVar3, gVar, 262105), p1.p.a(rVar.f10588o, b.b0(10), m.n, gVar, 262105));
        dVar2.u();
        MaterialThemeKt.a(cVar, lVar, rVar2, pVar, dVar2, ((this.f7589l << 6) & 7168) | 48, 0);
        return n.f16010a;
    }
}
