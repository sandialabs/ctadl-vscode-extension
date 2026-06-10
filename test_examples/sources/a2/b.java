package a2;

import androidx.compose.ui.text.style.TextForegroundStyle$CC;
import v0.f0;
import v0.m;
import v0.r;

/* loaded from: classes.dex */
public final class b implements androidx.compose.ui.text.style.a {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f90a;

    /* renamed from: b  reason: collision with root package name */
    public final float f91b;

    public b(f0 f0Var, float f10) {
        v7.g.f(f0Var, "value");
        this.f90a = f0Var;
        this.f91b = f10;
    }

    @Override // androidx.compose.ui.text.style.a
    public final long a() {
        int i10 = r.f18134h;
        return r.f18133g;
    }

    @Override // androidx.compose.ui.text.style.a
    public final /* synthetic */ androidx.compose.ui.text.style.a b(u7.a aVar) {
        return TextForegroundStyle$CC.b(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.a
    public final /* synthetic */ androidx.compose.ui.text.style.a c(androidx.compose.ui.text.style.a aVar) {
        return TextForegroundStyle$CC.a(this, aVar);
    }

    @Override // androidx.compose.ui.text.style.a
    public final m d() {
        return this.f90a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return v7.g.a(this.f90a, bVar.f90a) && v7.g.a(Float.valueOf(this.f91b), Float.valueOf(bVar.f91b));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f91b) + (this.f90a.hashCode() * 31);
    }

    @Override // androidx.compose.ui.text.style.a
    public final float n() {
        return this.f91b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f90a);
        sb.append(", alpha=");
        return a4.b.n(sb, this.f91b, ')');
    }
}
