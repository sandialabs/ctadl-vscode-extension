package z;

import androidx.compose.ui.unit.LayoutDirection;
import v0.h0;
import v0.x;
import v7.g;

/* loaded from: classes.dex */
public abstract class a implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f18969a;

    /* renamed from: b  reason: collision with root package name */
    public final b f18970b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final b f18971d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        g.f(bVar, "topStart");
        g.f(bVar2, "topEnd");
        g.f(bVar3, "bottomEnd");
        g.f(bVar4, "bottomStart");
        this.f18969a = bVar;
        this.f18970b = bVar2;
        this.c = bVar3;
        this.f18971d = bVar4;
    }

    public static /* synthetic */ a c(a aVar, c cVar, c cVar2, c cVar3, int i10) {
        c cVar4 = cVar;
        if ((i10 & 1) != 0) {
            cVar4 = aVar.f18969a;
        }
        b bVar = (i10 & 2) != 0 ? aVar.f18970b : null;
        c cVar5 = cVar2;
        if ((i10 & 4) != 0) {
            cVar5 = aVar.c;
        }
        c cVar6 = cVar3;
        if ((i10 & 8) != 0) {
            cVar6 = aVar.f18971d;
        }
        return aVar.b(cVar4, bVar, cVar5, cVar6);
    }

    @Override // v0.h0
    public final x a(long j2, LayoutDirection layoutDirection, b2.b bVar) {
        g.f(layoutDirection, "layoutDirection");
        g.f(bVar, "density");
        float a10 = this.f18969a.a(j2, bVar);
        float a11 = this.f18970b.a(j2, bVar);
        float a12 = this.c.a(j2, bVar);
        float a13 = this.f18971d.a(j2, bVar);
        float c = u0.f.c(j2);
        float f10 = a10 + a13;
        if (f10 > c) {
            float f11 = c / f10;
            a10 *= f11;
            a13 *= f11;
        }
        float f12 = a13;
        float f13 = a11 + a12;
        if (f13 > c) {
            float f14 = c / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f && f12 >= 0.0f) {
            return d(j2, a10, a11, a12, f12, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + f12 + ")!").toString());
    }

    public abstract e b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract x d(long j2, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection);
}
