package v0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f18120a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.f18120a != ((k) obj).f18120a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18120a;
    }

    public final String toString() {
        int i10 = this.f18120a;
        if (i10 == 0) {
            return "Clear";
        }
        if (i10 == 1) {
            return "Src";
        }
        if (i10 == 2) {
            return "Dst";
        }
        if (i10 == 3) {
            return "SrcOver";
        }
        if (i10 == 4) {
            return "DstOver";
        }
        if (i10 == 5) {
            return "SrcIn";
        }
        if (i10 == 6) {
            return "DstIn";
        }
        if (i10 == 7) {
            return "SrcOut";
        }
        if (i10 == 8) {
            return "DstOut";
        }
        if (i10 == 9) {
            return "SrcAtop";
        }
        if (i10 == 10) {
            return "DstAtop";
        }
        if (i10 == 11) {
            return "Xor";
        }
        if (i10 == 12) {
            return "Plus";
        }
        if (i10 == 13) {
            return "Modulate";
        }
        if (i10 == 14) {
            return "Screen";
        }
        if (i10 == 15) {
            return "Overlay";
        }
        if (i10 == 16) {
            return "Darken";
        }
        if (i10 == 17) {
            return "Lighten";
        }
        if (i10 == 18) {
            return "ColorDodge";
        }
        if (i10 == 19) {
            return "ColorBurn";
        }
        if (i10 == 20) {
            return "HardLight";
        }
        if (i10 == 21) {
            return "Softlight";
        }
        if (i10 == 22) {
            return "Difference";
        }
        if (i10 == 23) {
            return "Exclusion";
        }
        if (i10 == 24) {
            return "Multiply";
        }
        if (i10 == 25) {
            return "Hue";
        }
        if (i10 == 26) {
            return "Saturation";
        }
        if (i10 == 27) {
            return "Color";
        }
        return i10 == 28 ? "Luminosity" : "Unknown";
    }
}
