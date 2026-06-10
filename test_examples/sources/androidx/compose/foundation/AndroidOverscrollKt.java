package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import b2.k;
import m7.n;
import q0.d;
import s.r;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class AndroidOverscrollKt {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1384a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final q0.d f1385b;

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1392a;

        @Override // s.r
        public final void a(long j2, long j10, u0.c cVar, int i10) {
        }

        @Override // s.r
        public final k b(long j2) {
            return new k(k.f6350b);
        }

        @Override // s.r
        public final boolean c() {
            return false;
        }

        @Override // s.r
        public final n d(long j2) {
            return n.f16010a;
        }

        @Override // s.r
        public final q0.d e() {
            int i10 = q0.d.f16823g;
            return d.a.f16824i;
        }

        @Override // s.r
        public final long f(long j2, u0.c cVar) {
            return u0.c.f17721b;
        }

        @Override // s.r
        public final boolean isEnabled() {
            return this.f1392a;
        }

        @Override // s.r
        public final void setEnabled(boolean z10) {
            this.f1392a = z10;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        q0.d dVar = d.a.f16824i;
        if (i10 >= 31) {
            AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 androidOverscrollKt$StretchOverscrollNonClippingLayer$1 = AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.f1386j;
            g.f(androidOverscrollKt$StretchOverscrollNonClippingLayer$1, "measure");
            l<n0, n> lVar = InspectableValueKt.f3744a;
            j1.l lVar2 = new j1.l(lVar, androidOverscrollKt$StretchOverscrollNonClippingLayer$1);
            dVar.Z(lVar2);
            AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2 androidOverscrollKt$StretchOverscrollNonClippingLayer$2 = AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.f1389j;
            g.f(androidOverscrollKt$StretchOverscrollNonClippingLayer$2, "measure");
            dVar = lVar2.Z(new j1.l(lVar, androidOverscrollKt$StretchOverscrollNonClippingLayer$2));
        }
        f1385b = dVar;
    }
}
