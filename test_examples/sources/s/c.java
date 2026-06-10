package s;

import v0.w;
import v0.z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public w f17201a;

    /* renamed from: b  reason: collision with root package name */
    public v0.o f17202b;
    public x0.a c;

    /* renamed from: d  reason: collision with root package name */
    public z f17203d;

    public c() {
        this(0);
    }

    public c(int i10) {
        this.f17201a = null;
        this.f17202b = null;
        this.c = null;
        this.f17203d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return v7.g.a(this.f17201a, cVar.f17201a) && v7.g.a(this.f17202b, cVar.f17202b) && v7.g.a(this.c, cVar.c) && v7.g.a(this.f17203d, cVar.f17203d);
        }
        return false;
    }

    public final int hashCode() {
        w wVar = this.f17201a;
        int i10 = 0;
        int hashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        v0.o oVar = this.f17202b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        x0.a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        z zVar = this.f17203d;
        if (zVar != null) {
            i10 = zVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f17201a + ", canvas=" + this.f17202b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.f17203d + ')';
    }
}
