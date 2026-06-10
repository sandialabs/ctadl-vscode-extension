package r8;

import b9.z;
import java.lang.annotation.Annotation;
import java.util.Collection;

/* loaded from: classes.dex */
public final class w extends l implements z {

    /* renamed from: a  reason: collision with root package name */
    public final u f17165a;

    /* renamed from: b  reason: collision with root package name */
    public final Annotation[] f17166b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17167d;

    public w(u uVar, Annotation[] annotationArr, String str, boolean z10) {
        v7.g.f(annotationArr, "reflectAnnotations");
        this.f17165a = uVar;
        this.f17166b = annotationArr;
        this.c = str;
        this.f17167d = z10;
    }

    @Override // b9.z
    public final b9.w b() {
        return this.f17165a;
    }

    @Override // b9.d
    public final Collection getAnnotations() {
        return m0.b.h0(this.f17166b);
    }

    @Override // b9.z
    public final h9.e getName() {
        String str = this.c;
        if (str != null) {
            return h9.e.j(str);
        }
        return null;
    }

    @Override // b9.z
    public final boolean h() {
        return this.f17167d;
    }

    @Override // b9.d
    public final b9.a j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        return m0.b.a0(this.f17166b, cVar);
    }

    @Override // b9.d
    public final void s() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w.class.getName());
        sb.append(": ");
        sb.append(this.f17167d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f17165a);
        return sb.toString();
    }
}
