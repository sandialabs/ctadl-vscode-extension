package h1;

import java.util.ArrayList;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<Float> f11343a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11344b;

    public b(ArrayList arrayList, float f10) {
        this.f11343a = arrayList;
        this.f11344b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return g.a(this.f11343a, bVar.f11343a) && g.a(Float.valueOf(this.f11344b), Float.valueOf(bVar.f11344b));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11344b) + (this.f11343a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolynomialFit(coefficients=");
        sb.append(this.f11343a);
        sb.append(", confidence=");
        return a4.b.n(sb, this.f11344b, ')');
    }
}
