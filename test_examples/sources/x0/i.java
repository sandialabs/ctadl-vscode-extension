package x0;

import androidx.datastore.preferences.protobuf.k;
import v0.j0;
import v0.k0;

/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: i  reason: collision with root package name */
    public final float f18562i;

    /* renamed from: j  reason: collision with root package name */
    public final float f18563j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18564k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18565l;

    public i(float f10, float f11, int i10, int i11, int i12) {
        f10 = (i12 & 1) != 0 ? 0.0f : f10;
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f18562i = f10;
        this.f18563j = f11;
        this.f18564k = i10;
        this.f18565l = i11;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f18562i == iVar.f18562i) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f18563j == iVar.f18563j) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f18564k == iVar.f18564k) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (this.f18565l == iVar.f18565l) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        iVar.getClass();
        if (v7.g.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((androidx.activity.e.e(this.f18563j, Float.floatToIntBits(this.f18562i) * 31, 31) + this.f18564k) * 31) + this.f18565l) * 31) + 0;
    }

    public final String toString() {
        return "Stroke(width=" + this.f18562i + ", miter=" + this.f18563j + ", cap=" + ((Object) j0.a(this.f18564k)) + ", join=" + ((Object) k0.a(this.f18565l)) + ", pathEffect=" + ((Object) null) + ')';
    }
}
