package s;

import androidx.compose.ui.unit.LayoutDirection;
import q0.d;
import v0.h0;
import v0.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final float f17206a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final q0.d f17207b;
    public static final q0.d c;

    /* loaded from: classes.dex */
    public static final class a implements h0 {
        @Override // v0.h0
        public final x a(long j2, LayoutDirection layoutDirection, b2.b bVar) {
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(bVar, "density");
            float a02 = bVar.a0(e.f17206a);
            return new x.b(new u0.d(0.0f, -a02, u0.f.d(j2), u0.f.b(j2) + a02));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h0 {
        @Override // v0.h0
        public final x a(long j2, LayoutDirection layoutDirection, b2.b bVar) {
            v7.g.f(layoutDirection, "layoutDirection");
            v7.g.f(bVar, "density");
            float a02 = bVar.a0(e.f17206a);
            return new x.b(new u0.d(-a02, 0.0f, u0.f.d(j2) + a02, u0.f.b(j2)));
        }
    }

    static {
        int i10 = q0.d.f16823g;
        d.a aVar = d.a.f16824i;
        f17207b = a1.c.Y(aVar, new a());
        c = a1.c.Y(aVar, new b());
    }
}
