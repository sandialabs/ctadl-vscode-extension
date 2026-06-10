package p1;

import androidx.compose.ui.text.AndroidParagraph;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f16656a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16657b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16658d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16659e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16660f;

    /* renamed from: g  reason: collision with root package name */
    public final float f16661g;

    public e(AndroidParagraph androidParagraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f16656a = androidParagraph;
        this.f16657b = i10;
        this.c = i11;
        this.f16658d = i12;
        this.f16659e = i13;
        this.f16660f = f10;
        this.f16661g = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return v7.g.a(this.f16656a, eVar.f16656a) && this.f16657b == eVar.f16657b && this.c == eVar.c && this.f16658d == eVar.f16658d && this.f16659e == eVar.f16659e && v7.g.a(Float.valueOf(this.f16660f), Float.valueOf(eVar.f16660f)) && v7.g.a(Float.valueOf(this.f16661g), Float.valueOf(eVar.f16661g));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16661g) + androidx.activity.e.e(this.f16660f, ((((((((this.f16656a.hashCode() * 31) + this.f16657b) * 31) + this.c) * 31) + this.f16658d) * 31) + this.f16659e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f16656a);
        sb.append(", startIndex=");
        sb.append(this.f16657b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.f16658d);
        sb.append(", endLineIndex=");
        sb.append(this.f16659e);
        sb.append(", top=");
        sb.append(this.f16660f);
        sb.append(", bottom=");
        return a4.b.n(sb, this.f16661g, ')');
    }
}
