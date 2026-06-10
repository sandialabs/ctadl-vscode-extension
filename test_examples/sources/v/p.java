package v;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final float f18072a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18073b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18074d;

    public p(float f10, float f11, float f12, float f13) {
        this.f18072a = f10;
        this.f18073b = f11;
        this.c = f12;
        this.f18074d = f13;
    }

    @Override // v.o
    public final float a() {
        return this.f18074d;
    }

    @Override // v.o
    public final float b(LayoutDirection layoutDirection) {
        v7.g.f(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f18072a : this.c;
    }

    @Override // v.o
    public final float c() {
        return this.f18073b;
    }

    @Override // v.o
    public final float d(LayoutDirection layoutDirection) {
        v7.g.f(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.c : this.f18072a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return b2.d.a(this.f18072a, pVar.f18072a) && b2.d.a(this.f18073b, pVar.f18073b) && b2.d.a(this.c, pVar.c) && b2.d.a(this.f18074d, pVar.f18074d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18074d) + androidx.activity.e.e(this.c, androidx.activity.e.e(this.f18073b, Float.floatToIntBits(this.f18072a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) b2.d.b(this.f18072a)) + ", top=" + ((Object) b2.d.b(this.f18073b)) + ", end=" + ((Object) b2.d.b(this.c)) + ", bottom=" + ((Object) b2.d.b(this.f18074d)) + ')';
    }
}
