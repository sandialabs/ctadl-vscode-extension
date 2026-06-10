package s9;

import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class e implements g, i {

    /* renamed from: a  reason: collision with root package name */
    public final l8.b f17506a;

    /* renamed from: b  reason: collision with root package name */
    public final l8.b f17507b;

    public e(o8.b bVar) {
        v7.g.f(bVar, "classDescriptor");
        this.f17506a = bVar;
        this.f17507b = bVar;
    }

    @Override // s9.g
    public final r b() {
        v r3 = this.f17506a.r();
        v7.g.e(r3, "classDescriptor.defaultType");
        return r3;
    }

    public final boolean equals(Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        return v7.g.a(this.f17506a, eVar != null ? eVar.f17506a : null);
    }

    public final int hashCode() {
        return this.f17506a.hashCode();
    }

    @Override // s9.i
    public final l8.b n() {
        return this.f17506a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        v r3 = this.f17506a.r();
        v7.g.e(r3, "classDescriptor.defaultType");
        sb.append(r3);
        sb.append('}');
        return sb.toString();
    }
}
