package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.p;
import j1.r;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj1/t;", "Lj1/p;", "measurable", "Lb2/a;", "constraints", "Lj1/r;", "invoke-3p2s80s", "(Lj1/t;Lj1/p;J)Lj1/r;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends Lambda implements q<t, p, b2.a, r> {

    /* renamed from: j  reason: collision with root package name */
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 f1386j = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    /* renamed from: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<b0.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b0 f1387j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1388k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b0 b0Var, int i10) {
            super(1);
            this.f1387j = b0Var;
            this.f1388k = i10;
        }

        @Override // u7.l
        public final n U(b0.a aVar) {
            b0.a aVar2 = aVar;
            g.f(aVar2, "$this$layout");
            int i10 = (-this.f1388k) / 2;
            b0 b0Var = this.f1387j;
            b0.a.h(aVar2, b0Var, i10 - ((b0Var.f12640i - b0Var.q0()) / 2), i10 - ((b0Var.f12641j - b0Var.n0()) / 2), null, 12);
            return n.f16010a;
        }
    }

    public AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    @Override // u7.q
    public final r O(t tVar, p pVar, b2.a aVar) {
        r m02;
        t tVar2 = tVar;
        p pVar2 = pVar;
        long j2 = aVar.f6336a;
        g.f(tVar2, "$this$layout");
        g.f(pVar2, "measurable");
        b0 b5 = pVar2.b(j2);
        int a02 = tVar2.a0(s.e.f17206a * 2);
        m02 = tVar2.m0(b5.q0() - a02, b5.n0() - a02, kotlin.collections.d.K1(), new AnonymousClass1(b5, a02));
        return m02;
    }
}
