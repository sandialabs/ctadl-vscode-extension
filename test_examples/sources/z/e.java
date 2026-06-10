package z;

import androidx.compose.ui.unit.LayoutDirection;
import v0.x;
import v7.g;

/* loaded from: classes.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        g.f(bVar, "topStart");
        g.f(bVar2, "topEnd");
        g.f(bVar3, "bottomEnd");
        g.f(bVar4, "bottomStart");
    }

    @Override // z.a
    public final e b(b bVar, b bVar2, b bVar3, b bVar4) {
        g.f(bVar, "topStart");
        g.f(bVar2, "topEnd");
        g.f(bVar3, "bottomEnd");
        g.f(bVar4, "bottomStart");
        return new e(bVar, bVar2, bVar3, bVar4);
    }

    @Override // z.a
    public final x d(long j2, float f10, float f11, float f12, float f13, LayoutDirection layoutDirection) {
        boolean z10;
        float f14;
        float f15;
        float f16;
        float f17;
        g.f(layoutDirection, "layoutDirection");
        if (f10 + f11 + f12 + f13 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new x.b(a1.c.t(u0.c.f17721b, j2));
        }
        u0.d t10 = a1.c.t(u0.c.f17721b, j2);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        long m10 = a1.c.m(f14, f14);
        if (layoutDirection == layoutDirection2) {
            f15 = f11;
        } else {
            f15 = f10;
        }
        long m11 = a1.c.m(f15, f15);
        if (layoutDirection == layoutDirection2) {
            f16 = f12;
        } else {
            f16 = f13;
        }
        long m12 = a1.c.m(f16, f16);
        if (layoutDirection == layoutDirection2) {
            f17 = f13;
        } else {
            f17 = f12;
        }
        return new x.c(new u0.e(t10.f17726a, t10.f17727b, t10.c, t10.f17728d, m10, m11, m12, a1.c.m(f17, f17)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!g.a(this.f18969a, eVar.f18969a)) {
            return false;
        }
        if (!g.a(this.f18970b, eVar.f18970b)) {
            return false;
        }
        if (!g.a(this.c, eVar.c)) {
            return false;
        }
        if (g.a(this.f18971d, eVar.f18971d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f18970b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.f18971d.hashCode() + ((hashCode2 + ((hashCode + (this.f18969a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f18969a + ", topEnd = " + this.f18970b + ", bottomEnd = " + this.c + ", bottomStart = " + this.f18971d + ')';
    }
}
