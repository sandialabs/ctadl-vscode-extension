package p1;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import p1.a;
import u1.e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a f16687a;

    /* renamed from: b  reason: collision with root package name */
    public final p f16688b;
    public final List<a.C0207a<j>> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16689d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16690e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16691f;

    /* renamed from: g  reason: collision with root package name */
    public final b2.b f16692g;

    /* renamed from: h  reason: collision with root package name */
    public final LayoutDirection f16693h;

    /* renamed from: i  reason: collision with root package name */
    public final e.a f16694i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16695j;

    public m() {
        throw null;
    }

    public m(a aVar, p pVar, List list, int i10, boolean z10, int i11, b2.b bVar, LayoutDirection layoutDirection, e.a aVar2, long j2) {
        this.f16687a = aVar;
        this.f16688b = pVar;
        this.c = list;
        this.f16689d = i10;
        this.f16690e = z10;
        this.f16691f = i11;
        this.f16692g = bVar;
        this.f16693h = layoutDirection;
        this.f16694i = aVar2;
        this.f16695j = j2;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!v7.g.a(this.f16687a, mVar.f16687a) || !v7.g.a(this.f16688b, mVar.f16688b) || !v7.g.a(this.c, mVar.c) || this.f16689d != mVar.f16689d || this.f16690e != mVar.f16690e) {
            return false;
        }
        if (this.f16691f == mVar.f16691f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && v7.g.a(this.f16692g, mVar.f16692g) && this.f16693h == mVar.f16693h && v7.g.a(this.f16694i, mVar.f16694i) && b2.a.b(this.f16695j, mVar.f16695j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16688b.hashCode();
        int hashCode2 = (((this.c.hashCode() + ((hashCode + (this.f16687a.hashCode() * 31)) * 31)) * 31) + this.f16689d) * 31;
        if (this.f16690e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode3 = this.f16692g.hashCode();
        int hashCode4 = this.f16693h.hashCode();
        int hashCode5 = this.f16694i.hashCode();
        long j2 = this.f16695j;
        return ((int) (j2 ^ (j2 >>> 32))) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((((hashCode2 + i10) * 31) + this.f16691f) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        boolean z10;
        boolean z11;
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f16687a);
        sb.append(", style=");
        sb.append(this.f16688b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.f16689d);
        sb.append(", softWrap=");
        sb.append(this.f16690e);
        sb.append(", overflow=");
        boolean z12 = false;
        int i10 = this.f16691f;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "Clip";
        } else {
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str = "Ellipsis";
            } else {
                if (i10 == 3) {
                    z12 = true;
                }
                if (z12) {
                    str = "Visible";
                } else {
                    str = "Invalid";
                }
            }
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.f16692g);
        sb.append(", layoutDirection=");
        sb.append(this.f16693h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f16694i);
        sb.append(", constraints=");
        sb.append((Object) b2.a.i(this.f16695j));
        sb.append(')');
        return sb.toString();
    }
}
