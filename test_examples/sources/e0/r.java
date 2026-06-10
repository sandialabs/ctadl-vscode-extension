package e0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final p1.p f10576a;

    /* renamed from: b  reason: collision with root package name */
    public final p1.p f10577b;
    public final p1.p c;

    /* renamed from: d  reason: collision with root package name */
    public final p1.p f10578d;

    /* renamed from: e  reason: collision with root package name */
    public final p1.p f10579e;

    /* renamed from: f  reason: collision with root package name */
    public final p1.p f10580f;

    /* renamed from: g  reason: collision with root package name */
    public final p1.p f10581g;

    /* renamed from: h  reason: collision with root package name */
    public final p1.p f10582h;

    /* renamed from: i  reason: collision with root package name */
    public final p1.p f10583i;

    /* renamed from: j  reason: collision with root package name */
    public final p1.p f10584j;

    /* renamed from: k  reason: collision with root package name */
    public final p1.p f10585k;

    /* renamed from: l  reason: collision with root package name */
    public final p1.p f10586l;

    /* renamed from: m  reason: collision with root package name */
    public final p1.p f10587m;
    public final p1.p n;

    /* renamed from: o  reason: collision with root package name */
    public final p1.p f10588o;

    public r() {
        this(0);
    }

    public r(int i10) {
        this(f0.n.f10884d, f0.n.f10885e, f0.n.f10886f, f0.n.f10887g, f0.n.f10888h, f0.n.f10889i, f0.n.f10893m, f0.n.n, f0.n.f10894o, f0.n.f10882a, f0.n.f10883b, f0.n.c, f0.n.f10890j, f0.n.f10891k, f0.n.f10892l);
    }

    public r(p1.p pVar, p1.p pVar2, p1.p pVar3, p1.p pVar4, p1.p pVar5, p1.p pVar6, p1.p pVar7, p1.p pVar8, p1.p pVar9, p1.p pVar10, p1.p pVar11, p1.p pVar12, p1.p pVar13, p1.p pVar14, p1.p pVar15) {
        v7.g.f(pVar, "displayLarge");
        v7.g.f(pVar2, "displayMedium");
        v7.g.f(pVar3, "displaySmall");
        v7.g.f(pVar4, "headlineLarge");
        v7.g.f(pVar5, "headlineMedium");
        v7.g.f(pVar6, "headlineSmall");
        v7.g.f(pVar7, "titleLarge");
        v7.g.f(pVar8, "titleMedium");
        v7.g.f(pVar9, "titleSmall");
        v7.g.f(pVar10, "bodyLarge");
        v7.g.f(pVar11, "bodyMedium");
        v7.g.f(pVar12, "bodySmall");
        v7.g.f(pVar13, "labelLarge");
        v7.g.f(pVar14, "labelMedium");
        v7.g.f(pVar15, "labelSmall");
        this.f10576a = pVar;
        this.f10577b = pVar2;
        this.c = pVar3;
        this.f10578d = pVar4;
        this.f10579e = pVar5;
        this.f10580f = pVar6;
        this.f10581g = pVar7;
        this.f10582h = pVar8;
        this.f10583i = pVar9;
        this.f10584j = pVar10;
        this.f10585k = pVar11;
        this.f10586l = pVar12;
        this.f10587m = pVar13;
        this.n = pVar14;
        this.f10588o = pVar15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return v7.g.a(this.f10576a, rVar.f10576a) && v7.g.a(this.f10577b, rVar.f10577b) && v7.g.a(this.c, rVar.c) && v7.g.a(this.f10578d, rVar.f10578d) && v7.g.a(this.f10579e, rVar.f10579e) && v7.g.a(this.f10580f, rVar.f10580f) && v7.g.a(this.f10581g, rVar.f10581g) && v7.g.a(this.f10582h, rVar.f10582h) && v7.g.a(this.f10583i, rVar.f10583i) && v7.g.a(this.f10584j, rVar.f10584j) && v7.g.a(this.f10585k, rVar.f10585k) && v7.g.a(this.f10586l, rVar.f10586l) && v7.g.a(this.f10587m, rVar.f10587m) && v7.g.a(this.n, rVar.n) && v7.g.a(this.f10588o, rVar.f10588o);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10577b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f10578d.hashCode();
        int hashCode4 = this.f10579e.hashCode();
        int hashCode5 = this.f10580f.hashCode();
        int hashCode6 = this.f10581g.hashCode();
        int hashCode7 = this.f10582h.hashCode();
        int hashCode8 = this.f10583i.hashCode();
        int hashCode9 = this.f10584j.hashCode();
        int hashCode10 = this.f10585k.hashCode();
        int hashCode11 = this.f10586l.hashCode();
        int hashCode12 = this.f10587m.hashCode();
        int hashCode13 = this.n.hashCode();
        return this.f10588o.hashCode() + ((hashCode13 + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f10576a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f10576a + ", displayMedium=" + this.f10577b + ",displaySmall=" + this.c + ", headlineLarge=" + this.f10578d + ", headlineMedium=" + this.f10579e + ", headlineSmall=" + this.f10580f + ", titleLarge=" + this.f10581g + ", titleMedium=" + this.f10582h + ", titleSmall=" + this.f10583i + ", bodyLarge=" + this.f10584j + ", bodyMedium=" + this.f10585k + ", bodySmall=" + this.f10586l + ", labelLarge=" + this.f10587m + ", labelMedium=" + this.n + ", labelSmall=" + this.f10588o + ')';
    }
}
