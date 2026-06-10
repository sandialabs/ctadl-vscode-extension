package p1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a2.f f16664a;

    /* renamed from: b  reason: collision with root package name */
    public final a2.h f16665b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final a2.j f16666d;

    /* renamed from: e  reason: collision with root package name */
    public final a2.d f16667e;

    /* renamed from: f  reason: collision with root package name */
    public final a1.b f16668f;

    public h(a2.f fVar, a2.h hVar, long j2, a2.j jVar, a2.e eVar, a2.d dVar, a1.b bVar) {
        boolean z10;
        this.f16664a = fVar;
        this.f16665b = hVar;
        this.c = j2;
        this.f16666d = jVar;
        this.f16667e = dVar;
        this.f16668f = bVar;
        if (!b2.i.a(j2, b2.i.c)) {
            if (b2.i.c(j2) >= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(("lineHeight can't be negative (" + b2.i.c(j2) + ')').toString());
            }
        }
    }

    public final h a(h hVar) {
        if (hVar == null) {
            return this;
        }
        long j2 = hVar.c;
        if (a1.b.n0(j2)) {
            j2 = this.c;
        }
        long j10 = j2;
        a2.j jVar = hVar.f16666d;
        if (jVar == null) {
            jVar = this.f16666d;
        }
        a2.j jVar2 = jVar;
        a2.f fVar = hVar.f16664a;
        if (fVar == null) {
            fVar = this.f16664a;
        }
        a2.f fVar2 = fVar;
        a2.h hVar2 = hVar.f16665b;
        if (hVar2 == null) {
            hVar2 = this.f16665b;
        }
        a2.h hVar3 = hVar2;
        hVar.getClass();
        a2.d dVar = hVar.f16667e;
        if (dVar == null) {
            dVar = this.f16667e;
        }
        a2.d dVar2 = dVar;
        a1.b bVar = hVar.f16668f;
        if (bVar == null) {
            bVar = this.f16668f;
        }
        return new h(fVar2, hVar3, j10, jVar2, null, dVar2, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (v7.g.a(this.f16664a, hVar.f16664a) && v7.g.a(this.f16665b, hVar.f16665b) && b2.i.a(this.c, hVar.c) && v7.g.a(this.f16666d, hVar.f16666d)) {
                hVar.getClass();
                if (v7.g.a(null, null)) {
                    hVar.getClass();
                    return v7.g.a(null, null) && v7.g.a(this.f16667e, hVar.f16667e) && v7.g.a(this.f16668f, hVar.f16668f);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        a2.f fVar = this.f16664a;
        int i10 = (fVar != null ? fVar.f99a : 0) * 31;
        a2.h hVar = this.f16665b;
        int d5 = (b2.i.d(this.c) + ((i10 + (hVar != null ? hVar.f103a : 0)) * 31)) * 31;
        a2.j jVar = this.f16666d;
        int hashCode = (((((d5 + (jVar != null ? jVar.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31;
        a2.d dVar = this.f16667e;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        a1.b bVar = this.f16668f;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.f16664a + ", textDirection=" + this.f16665b + ", lineHeight=" + ((Object) b2.i.e(this.c)) + ", textIndent=" + this.f16666d + ", platformStyle=null, lineHeightStyle=" + ((Object) null) + ", lineBreak=" + this.f16667e + ", hyphens=" + this.f16668f + ')';
    }
}
