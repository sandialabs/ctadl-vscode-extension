package b8;

/* loaded from: classes.dex */
public final class d implements e<Float> {

    /* renamed from: i  reason: collision with root package name */
    public final float f6495i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public final float f6496j = 0.0f;

    @Override // b8.f
    public final Float c() {
        return Float.valueOf(this.f6496j);
    }

    @Override // b8.f
    public final Float d() {
        return Float.valueOf(this.f6495i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r4 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!(obj instanceof d)) {
            return false;
        }
        float f10 = this.f6495i;
        float f11 = this.f6496j;
        if (f10 > f11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d dVar = (d) obj;
            if (dVar.f6495i > dVar.f6496j) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        d dVar2 = (d) obj;
        if (f10 == dVar2.f6495i) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (f11 == dVar2.f6496j) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z10;
        float f10 = this.f6496j;
        float f11 = this.f6495i;
        if (f11 > f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return -1;
        }
        return Float.floatToIntBits(f10) + (Float.floatToIntBits(f11) * 31);
    }

    public final String toString() {
        return this.f6495i + ".." + this.f6496j;
    }
}
