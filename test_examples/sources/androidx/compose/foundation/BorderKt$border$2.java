package androidx.compose.foundation;

import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.k;
import f0.i;
import g0.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import l1.f0;
import m7.n;
import s0.g;
import u0.f;
import u7.l;
import u7.q;
import v0.h;
import v0.h0;
import v0.i0;
import v0.m;
import v0.x;
import v0.z;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BorderKt$border$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f1393j = i.f10823e;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f1394k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m f1395l;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.BorderKt$border$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<s0.b, g> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ float f1396j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h0 f1397k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f0<s.c> f1398l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ m f1399m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f10, h0 h0Var, f0<s.c> f0Var, m mVar) {
            super(1);
            this.f1396j = f10;
            this.f1397k = h0Var;
            this.f1398l = f0Var;
            this.f1399m = mVar;
        }

        /* JADX WARN: Type inference failed for: r7v24, types: [T, s.c] */
        @Override // u7.l
        public final g U(s0.b bVar) {
            boolean z10;
            float ceil;
            k iVar;
            m mVar;
            l<? super x0.c, n> borderKt$drawRoundRectBorder$2;
            BlendModeColorFilter porterDuffColorFilter;
            s0.b bVar2 = bVar;
            v7.g.f(bVar2, "$this$drawWithCache");
            float f10 = this.f1396j;
            boolean z11 = true;
            if (bVar2.H(f10) >= 0.0f && f.c(bVar2.a()) > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return bVar2.b(BorderKt$drawContentWithoutBorder$1.f1400j);
            }
            if (b2.d.a(f10, 0.0f)) {
                ceil = 1.0f;
            } else {
                ceil = (float) Math.ceil(bVar2.H(f10));
            }
            float f11 = 2;
            float min = Math.min(ceil, (float) Math.ceil(f.c(bVar2.a()) / f11));
            float f12 = min / f11;
            long s10 = a1.c.s(f12, f12);
            long v3 = a1.c.v(f.d(bVar2.a()) - min, f.b(bVar2.a()) - min);
            if (f11 * min <= f.c(bVar2.a())) {
                z11 = false;
            }
            x a10 = this.f1397k.a(bVar2.a(), bVar2.f17227i.getLayoutDirection(), bVar2);
            if (a10 instanceof x.a) {
                x.a aVar = (x.a) a10;
                m mVar2 = this.f1399m;
                if (z11) {
                    return bVar2.b(new BorderKt$drawGenericBorder$1(aVar, mVar2));
                }
                if (mVar2 instanceof i0) {
                    long j2 = ((i0) mVar2).f18118a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = v0.l.f18122a.a(j2, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(a1.c.I1(j2), a1.c.N1(5));
                    }
                    v7.g.f(porterDuffColorFilter, "nativeColorFilter");
                }
                aVar.getClass();
                throw null;
            } else if (a10 instanceof x.c) {
                m mVar3 = this.f1399m;
                x.c cVar = (x.c) a10;
                boolean M0 = a1.c.M0(cVar.f18141a);
                u0.e eVar = cVar.f18141a;
                if (M0) {
                    borderKt$drawRoundRectBorder$2 = new BorderKt$drawRoundRectBorder$1(z11, mVar3, eVar.f17732e, f12, min, s10, v3, new x0.i(min, 0.0f, 0, 0, 30));
                } else {
                    f0<s.c> f0Var = this.f1398l;
                    s.c cVar2 = f0Var.f15740a;
                    s.c cVar3 = cVar2;
                    if (cVar2 == null) {
                        ?? cVar4 = new s.c(0);
                        f0Var.f15740a = cVar4;
                        cVar3 = cVar4;
                    }
                    z zVar = cVar3.f17203d;
                    if (zVar == null) {
                        zVar = m0.b.k();
                        cVar3.f17203d = zVar;
                    }
                    zVar.l();
                    zVar.b(eVar);
                    if (!z11) {
                        h k3 = m0.b.k();
                        float f13 = (eVar.c - eVar.f17729a) - min;
                        float f14 = (eVar.f17731d - eVar.f17730b) - min;
                        long c = a.c(min, eVar.f17732e);
                        long c10 = a.c(min, eVar.f17733f);
                        long c11 = a.c(min, eVar.f17735h);
                        long c12 = a.c(min, eVar.f17734g);
                        mVar = mVar3;
                        k3.b(new u0.e(min, min, f13, f14, c, c10, c12, c11));
                        zVar.h(zVar, k3, 0);
                    } else {
                        mVar = mVar3;
                    }
                    borderKt$drawRoundRectBorder$2 = new BorderKt$drawRoundRectBorder$2(zVar, mVar);
                }
                return bVar2.b(borderKt$drawRoundRectBorder$2);
            } else if (a10 instanceof x.b) {
                m mVar4 = this.f1399m;
                if (z11) {
                    s10 = u0.c.f17721b;
                }
                if (z11) {
                    v3 = bVar2.a();
                }
                if (z11) {
                    iVar = x0.h.f18561i;
                } else {
                    iVar = new x0.i(min, 0.0f, 0, 0, 30);
                }
                return bVar2.b(new BorderKt$drawRectBorder$1(mVar4, s10, v3, iVar));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$border$2(i0 i0Var, h0 h0Var) {
        super(3);
        this.f1394k = h0Var;
        this.f1395l = i0Var;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        q0.d dVar3 = dVar;
        g0.d dVar4 = dVar2;
        num.intValue();
        v7.g.f(dVar3, "$this$composed");
        dVar4.f(-1498088849);
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        if (g10 == d.a.f11039a) {
            g10 = new f0();
            dVar4.q(g10);
        }
        dVar4.u();
        q0.d Z = dVar3.Z(androidx.compose.ui.draw.a.a(new AnonymousClass1(this.f1393j, this.f1394k, (f0) g10, this.f1395l)));
        dVar4.u();
        return Z;
    }
}
