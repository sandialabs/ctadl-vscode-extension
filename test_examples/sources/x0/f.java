package x0;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.k;
import v0.m;
import v0.s;
import v0.w;
import v0.z;
import x0.a;

/* loaded from: classes.dex */
public interface f extends b2.b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f18560h = 0;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(f fVar, long j2, float f10, long j10, int i10) {
            int i11 = e.f18559a;
            fVar.L(j2, (i10 & 2) != 0 ? u0.f.c(fVar.a()) / 2.0f : f10, (i10 & 4) != 0 ? fVar.e0() : j10, (i10 & 8) != 0 ? 1.0f : 0.0f, (i10 & 16) != 0 ? h.f18561i : null, null, (i10 & 64) != 0 ? 3 : 0);
        }
    }

    void F(m mVar, long j2, long j10, float f10, k kVar, s sVar, int i10);

    void K(v0.h hVar, long j2, float f10, k kVar, s sVar, int i10);

    void L(long j2, float f10, long j10, float f11, k kVar, s sVar, int i10);

    a.b N();

    void X(long j2, long j10, long j11, long j12, k kVar, float f10, s sVar, int i10);

    void Y(long j2, long j10, long j11, float f10, k kVar, s sVar, int i10);

    long a();

    void d0(z zVar, m mVar, float f10, k kVar, s sVar, int i10);

    long e0();

    LayoutDirection getLayoutDirection();

    void j0(m mVar, long j2, long j10, long j11, float f10, k kVar, s sVar, int i10);

    void p0(w wVar, long j2, long j10, long j11, long j12, float f10, k kVar, s sVar, int i10, int i11);
}
