package e0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final z.a f10554a;

    /* renamed from: b  reason: collision with root package name */
    public final z.a f10555b;
    public final z.a c;

    /* renamed from: d  reason: collision with root package name */
    public final z.a f10556d;

    /* renamed from: e  reason: collision with root package name */
    public final z.a f10557e;

    public l() {
        this(0);
    }

    public l(int i10) {
        this(k.f10550a, k.f10551b, k.c, k.f10552d, k.f10553e);
    }

    public l(z.a aVar, z.a aVar2, z.a aVar3, z.a aVar4, z.a aVar5) {
        v7.g.f(aVar, "extraSmall");
        v7.g.f(aVar2, "small");
        v7.g.f(aVar3, "medium");
        v7.g.f(aVar4, "large");
        v7.g.f(aVar5, "extraLarge");
        this.f10554a = aVar;
        this.f10555b = aVar2;
        this.c = aVar3;
        this.f10556d = aVar4;
        this.f10557e = aVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return v7.g.a(this.f10554a, lVar.f10554a) && v7.g.a(this.f10555b, lVar.f10555b) && v7.g.a(this.c, lVar.c) && v7.g.a(this.f10556d, lVar.f10556d) && v7.g.a(this.f10557e, lVar.f10557e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10555b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f10556d.hashCode();
        return this.f10557e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f10554a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f10554a + ", small=" + this.f10555b + ", medium=" + this.c + ", large=" + this.f10556d + ", extraLarge=" + this.f10557e + ')';
    }
}
